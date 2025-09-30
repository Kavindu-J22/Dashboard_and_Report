package com.employee.controller;

import com.employee.model.Employee;
import com.employee.service.EmployeeService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
@RequestMapping("/employees")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    // Show registration form
    @GetMapping("/register")
    public String showRegistrationForm(Model model) {
        model.addAttribute("employee", new Employee());
        return "register";
    }

    // Save employee
    @PostMapping("/save")
    public String saveEmployee(@Valid @ModelAttribute("employee") Employee employee,
            BindingResult result,
            Model model,
            RedirectAttributes redirectAttributes) {
        if (result.hasErrors()) {
            model.addAttribute("employee", employee);
            return "register";
        }

        try {
            employeeService.saveEmployee(employee);
            redirectAttributes.addFlashAttribute("successMessage", "Employee registered successfully!");
            return "redirect:/employees/list";
        } catch (Exception e) {
            model.addAttribute("employee", employee);
            model.addAttribute("errorMessage", "Error saving employee: " + e.getMessage());
            return "register";
        }
    }

    // List all employees
    @GetMapping("/list")
    public String listEmployees(Model model, @RequestParam(required = false) String keyword) {
        List<Employee> employees;

        if (keyword != null && !keyword.trim().isEmpty()) {
            employees = employeeService.searchEmployees(keyword);
            model.addAttribute("keyword", keyword);
        } else {
            employees = employeeService.getAllEmployees();
        }

        model.addAttribute("employees", employees);
        return "employee-list";
    }

    // View employee details
    @GetMapping("/view/{id}")
    public String viewEmployee(@PathVariable Long id, Model model) {
        Employee employee = employeeService.getEmployeeById(id)
                .orElseThrow(() -> new RuntimeException("Employee not found with id: " + id));
        model.addAttribute("employee", employee);
        return "employee-view";
    }

    // Show edit form
    @GetMapping("/edit/{id}")
    public String showEditForm(@PathVariable Long id, Model model) {
        Employee employee = employeeService.getEmployeeById(id)
                .orElseThrow(() -> new RuntimeException("Employee not found with id: " + id));
        model.addAttribute("employee", employee);
        return "employee-edit";
    }

    // Update employee
    @PostMapping("/update/{id}")
    public String updateEmployee(@PathVariable Long id,
            @Valid @ModelAttribute("employee") Employee employee,
            BindingResult result,
            Model model,
            RedirectAttributes redirectAttributes) {
        if (result.hasErrors()) {
            employee.setId(id);
            model.addAttribute("employee", employee);
            return "employee-edit";
        }

        try {
            employeeService.updateEmployee(id, employee);
            redirectAttributes.addFlashAttribute("successMessage", "Employee updated successfully!");
            return "redirect:/employees/list";
        } catch (Exception e) {
            employee.setId(id);
            model.addAttribute("employee", employee);
            model.addAttribute("errorMessage", "Error updating employee: " + e.getMessage());
            return "employee-edit";
        }
    }

    // Delete employee
    @GetMapping("/delete/{id}")
    public String deleteEmployee(@PathVariable Long id, RedirectAttributes redirectAttributes) {
        employeeService.deleteEmployee(id);
        redirectAttributes.addFlashAttribute("successMessage", "Employee deleted successfully!");
        return "redirect:/employees/list";
    }

    // Home page redirect
    @GetMapping("/")
    public String home() {
        return "redirect:/employees/register";
    }
}
