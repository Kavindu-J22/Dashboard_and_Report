# Employee Registration System - Testing Guide

This document provides a comprehensive testing checklist to verify all features are working correctly.

## Prerequisites for Testing

1. ✅ Application is running on http://localhost:8080
2. ✅ MySQL database is connected
3. ✅ Browser is open

## Test Scenarios

### 1. Test Employee Registration (CREATE)

**Steps:**
1. Navigate to http://localhost:8080 or http://localhost:8080/employees/register
2. Verify the registration form is displayed with blue and white theme
3. Fill in the following test data:
   - First Name: `John`
   - Last Name: `Doe`
   - Email: `john.doe@company.com`
   - Phone: `+1-555-0123`
   - Department: `IT`
   - Position: `Software Engineer`
   - Join Date: `2024-01-15`
   - Address: `123 Main Street, New York, NY 10001`
   - Salary: `75000`
4. Click "Register Employee" button
5. Verify you are redirected to the employee list page
6. Verify success message appears: "Employee registered successfully!"
7. Verify John Doe appears in the employee list

**Expected Result:** ✅ Employee is successfully registered and appears in the list

---

### 2. Test Form Validation

**Steps:**
1. Go to registration page
2. Try to submit the form without filling any fields
3. Verify validation messages appear for required fields
4. Enter an invalid email format (e.g., "notanemail")
5. Verify email validation error appears
6. Fill all required fields correctly and submit
7. Verify form submits successfully

**Expected Result:** ✅ Form validation works correctly for all fields

---

### 3. Test View All Employees (READ)

**Steps:**
1. Click "View All Employees" in navigation
2. Verify the employee list page displays
3. Verify the table shows all registered employees
4. Verify table columns: ID, Name, Email, Phone, Department, Position, Actions
5. Verify the blue and white theme is applied
6. Verify "Total Employees" count is displayed at the bottom

**Expected Result:** ✅ All employees are displayed in a clean table format

---

### 4. Test View Employee Details (READ)

**Steps:**
1. From the employee list, click "View More" for John Doe
2. Verify you are redirected to the employee details page
3. Verify all employee information is displayed:
   - Employee ID
   - First Name: John
   - Last Name: Doe
   - Email: john.doe@company.com
   - Phone: +1-555-0123
   - Department: IT
   - Position: Software Engineer
   - Join Date: 15-01-2024
   - Address: 123 Main Street, New York, NY 10001
   - Salary: $75,000.00
4. Verify action buttons are present: Edit, Back to List, Delete

**Expected Result:** ✅ Complete employee details are displayed correctly

---

### 5. Test Edit Employee (UPDATE)

**Steps:**
1. From employee details page, click "Edit Employee"
2. Verify the edit form is pre-filled with current data
3. Update the following fields:
   - Position: `Senior Software Engineer`
   - Salary: `95000`
   - Department: `Engineering`
4. Click "Update Employee"
5. Verify success message: "Employee updated successfully!"
6. Verify you are redirected to the employee list
7. Click "View More" for John Doe
8. Verify the changes are reflected:
   - Position: Senior Software Engineer
   - Salary: $95,000.00
   - Department: Engineering

**Expected Result:** ✅ Employee information is successfully updated

---

### 6. Test Search Functionality

**Test 6a: Search by First Name**
1. Go to employee list page
2. Enter "John" in the search box
3. Click "Search"
4. Verify only employees with "John" in their name appear
5. Click "Clear" to show all employees again

**Test 6b: Search by Email**
1. Enter "john.doe@company.com" in search box
2. Click "Search"
3. Verify John Doe appears in results

**Test 6c: Search by Department**
1. Enter "Engineering" in search box
2. Click "Search"
3. Verify all employees in Engineering department appear

**Test 6d: Search by Position**
1. Enter "Senior" in search box
2. Click "Search"
3. Verify employees with "Senior" in their position appear

**Test 6e: Search with No Results**
1. Enter "XYZ123" in search box
2. Click "Search"
3. Verify "No employees match your search criteria" message appears

**Expected Result:** ✅ Search works correctly for all fields

---

### 7. Test Multiple Employee Registration

**Steps:**
1. Register the following additional employees:

   **Employee 2:**
   - First Name: `Jane`
   - Last Name: `Smith`
   - Email: `jane.smith@company.com`
   - Phone: `+1-555-0124`
   - Department: `HR`
   - Position: `HR Manager`
   - Join Date: `2023-06-01`
   - Salary: `80000`

   **Employee 3:**
   - First Name: `Mike`
   - Last Name: `Johnson`
   - Email: `mike.johnson@company.com`
   - Phone: `+1-555-0125`
   - Department: `Sales`
   - Position: `Sales Director`
   - Join Date: `2022-03-15`
   - Salary: `90000`

   **Employee 4:**
   - First Name: `Sarah`
   - Last Name: `Williams`
   - Email: `sarah.williams@company.com`
   - Phone: `+1-555-0126`
   - Department: `Engineering`
   - Position: `DevOps Engineer`
   - Join Date: `2024-02-01`
   - Salary: `85000`

2. Verify all employees appear in the list
3. Verify total count shows 4 employees

**Expected Result:** ✅ Multiple employees can be registered successfully

---

### 8. Test Delete Employee (DELETE)

**Steps:**
1. Go to employee list page
2. Click "Delete" for Mike Johnson
3. Verify confirmation dialog appears: "Are you sure you want to delete this employee?"
4. Click "OK" to confirm
5. Verify success message: "Employee deleted successfully!"
6. Verify Mike Johnson no longer appears in the list
7. Verify total count is now 3 employees

**Alternative Delete Method:**
1. Click "View More" for an employee
2. Click "Delete Employee" button
3. Confirm deletion
4. Verify employee is deleted

**Expected Result:** ✅ Employee is successfully deleted from the system

---

### 9. Test Navigation

**Steps:**
1. From registration page, click "View All Employees"
2. Verify you navigate to employee list
3. Click "Register New Employee"
4. Verify you navigate to registration page
5. From employee list, click "View More" for an employee
6. Click "Back to List"
7. Verify you return to employee list
8. From employee details, click "Edit Employee"
9. Click "Cancel"
10. Verify you return to employee details

**Expected Result:** ✅ All navigation links work correctly

---

### 10. Test UI/UX Elements

**Color Theme Check:**
1. Verify primary color is blue (#4A90E2)
2. Verify background is white with gradient
3. Verify buttons have blue background
4. Verify hover effects work on buttons
5. Verify table rows highlight on hover

**Responsive Design Check:**
1. Resize browser window to smaller size
2. Verify layout adjusts appropriately
3. Verify all elements remain accessible

**User Feedback Check:**
1. Verify success messages appear after operations
2. Verify error messages appear for validation failures
3. Verify confirmation dialogs appear for deletions

**Expected Result:** ✅ UI is clean, professional, and user-friendly

---

### 11. Test Edge Cases

**Test 11a: Duplicate Email**
1. Try to register an employee with an existing email
2. Verify error message appears

**Test 11b: Empty Search**
1. Leave search box empty and click "Search"
2. Verify all employees are displayed

**Test 11c: Special Characters**
1. Register an employee with special characters in name (e.g., "O'Brien")
2. Verify it's saved and displayed correctly

**Test 11d: Long Text**
1. Enter a very long address (200+ characters)
2. Verify it's saved and displayed correctly

**Expected Result:** ✅ Application handles edge cases gracefully

---

### 12. Test Database Persistence

**Steps:**
1. Register a new employee
2. Stop the application (Ctrl+C in the terminal)
3. Restart the application
4. Navigate to employee list
5. Verify the employee still exists

**Expected Result:** ✅ Data persists across application restarts

---

## Test Summary Checklist

Use this checklist to track your testing progress:

- [ ] Employee Registration (CREATE) works
- [ ] Form Validation works
- [ ] View All Employees (READ) works
- [ ] View Employee Details works
- [ ] Edit Employee (UPDATE) works
- [ ] Search by Name works
- [ ] Search by Email works
- [ ] Search by Department works
- [ ] Search by Position works
- [ ] Delete Employee (DELETE) works
- [ ] Navigation between pages works
- [ ] Blue and white theme is applied
- [ ] Success messages appear
- [ ] Confirmation dialogs work
- [ ] Responsive design works
- [ ] Data persists in database

---

## Performance Testing

**Load Test:**
1. Register 20+ employees
2. Verify list page loads quickly
3. Verify search remains fast
4. Verify no performance degradation

---

## Browser Compatibility

Test the application in:
- [ ] Google Chrome
- [ ] Mozilla Firefox
- [ ] Microsoft Edge
- [ ] Safari (if available)

---

## Reporting Issues

If you find any issues during testing:

1. Note the exact steps to reproduce
2. Take a screenshot if applicable
3. Check the console for error messages
4. Check the application logs in the terminal

---

## Success Criteria

The application is considered fully functional if:

✅ All CRUD operations work correctly
✅ Search functionality works for all fields
✅ Form validation prevents invalid data
✅ UI follows blue and white theme
✅ Navigation is smooth and intuitive
✅ Data persists in MySQL database
✅ No errors appear in console
✅ All buttons and links work as expected

---

**Testing Complete!** 🎉

If all tests pass, the Employee Registration System is working correctly and perfectly!

