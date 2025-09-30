# Employee Registration System

A comprehensive Java-based web application for managing employee records with full CRUD operations.

## Features

- ✅ **Employee Registration** - Add new employees with detailed information
- ✅ **View All Employees** - List all registered employees in a clean table format
- ✅ **View Details** - See complete information for each employee
- ✅ **Edit Employee** - Update employee information
- ✅ **Delete Employee** - Remove employees from the system
- ✅ **Search Functionality** - Search employees by name, email, department, or position
- ✅ **Blue & White Theme** - Professional and clean UI design

## Technology Stack

- **Backend**: Spring Boot 3.2.0
- **Database**: MySQL 8.x
- **Template Engine**: Thymeleaf
- **Build Tool**: Maven
- **Java Version**: 17+

## Employee Fields

The system captures the following employee information:

1. **First Name** (Required)
2. **Last Name** (Required)
3. **Email** (Required, Unique)
4. **Phone Number** (Required)
5. **Department** (Required)
6. **Position** (Required)
7. **Join Date** (Required)
8. **Address** (Optional)
9. **Salary** (Optional)

## Prerequisites

Before running the application, ensure you have:

1. **Java 17 or higher** installed
2. **Maven 3.6+** installed
3. **MySQL 8.x** installed and running
4. MySQL credentials:
   - Username: `root`
   - Password: `Shashini1223@`

## Database Setup

The application will automatically create the database `employee_db` if it doesn't exist. No manual database setup is required!

## How to Run

### Option 1: Using the Batch File (Windows)

1. Double-click `run-app.bat`
2. Wait for the message "Started EmployeeRegisterApplication"
3. Open your browser to: `http://localhost:8080`

### Option 2: Using Maven Command

```bash
mvn spring-boot:run
```

### Option 3: Using JAR File

```bash
# First, build the project
mvn clean install

# Then run the JAR
java -jar target/employee-register-1.0.0.jar
```

## Application URLs

- **Home / Registration**: http://localhost:8080/ or http://localhost:8080/employees/register
- **Employee List**: http://localhost:8080/employees/list
- **View Employee**: http://localhost:8080/employees/view/{id}
- **Edit Employee**: http://localhost:8080/employees/edit/{id}

## Usage Guide

### 1. Register a New Employee

1. Navigate to the registration page (default home page)
2. Fill in all required fields (marked with *)
3. Click "Register Employee"
4. You'll be redirected to the employee list page

### 2. View All Employees

1. Click "View All Employees" in the navigation
2. See all registered employees in a table format
3. Use the search bar to filter employees

### 3. Search Employees

1. On the employee list page, use the search bar
2. Enter keywords (name, email, department, or position)
3. Click "Search" to filter results
4. Click "Clear" to show all employees again

### 4. View Employee Details

1. In the employee list, click "View More" for any employee
2. See complete information including optional fields
3. From here, you can edit or delete the employee

### 5. Edit Employee

1. Click "Edit" button from the list or details page
2. Update the information
3. Click "Update Employee" to save changes

### 6. Delete Employee

1. Click "Delete" button from the list or details page
2. Confirm the deletion in the popup dialog
3. Employee will be permanently removed

## Color Theme

The application uses a professional blue and white color scheme:

- **Primary Blue**: #4A90E2
- **Dark Blue**: #2C5AA0
- **White**: #FFFFFF
- **Light Blue Background**: #F0F4FF
- **Gradient Background**: Purple to Blue gradient

## Project Structure

```
Dashboard_and_Report/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/employee/
│   │   │       ├── EmployeeRegisterApplication.java
│   │   │       ├── controller/
│   │   │       │   ├── EmployeeController.java
│   │   │       │   └── HomeController.java
│   │   │       ├── model/
│   │   │       │   └── Employee.java
│   │   │       ├── repository/
│   │   │       │   └── EmployeeRepository.java
│   │   │       └── service/
│   │   │           └── EmployeeService.java
│   │   └── resources/
│   │       ├── static/
│   │       │   └── css/
│   │       │       └── style.css
│   │       ├── templates/
│   │       │   ├── register.html
│   │       │   ├── employee-list.html
│   │       │   ├── employee-view.html
│   │       │   └── employee-edit.html
│   │       └── application.properties
├── pom.xml
├── run-app.bat
└── README.md
```

## Troubleshooting

### Issue: Application won't start

**Solution**: Ensure MySQL is running and the credentials in `application.properties` are correct.

### Issue: Port 8080 already in use

**Solution**: Either stop the application using port 8080 or change the port in `application.properties`:
```properties
server.port=8081
```

### Issue: Database connection error

**Solution**: 
1. Verify MySQL is running
2. Check username and password in `application.properties`
3. Ensure MySQL is accessible on localhost:3306

### Issue: Build fails

**Solution**: 
1. Ensure Java 17+ is installed: `java -version`
2. Ensure Maven is installed: `mvn -version`
3. Run: `mvn clean install`

## API Endpoints

| Method | Endpoint | Description |
|--------|----------|-------------|
| GET | `/` | Redirect to registration page |
| GET | `/employees/register` | Show registration form |
| POST | `/employees/save` | Save new employee |
| GET | `/employees/list` | List all employees |
| GET | `/employees/list?keyword={keyword}` | Search employees |
| GET | `/employees/view/{id}` | View employee details |
| GET | `/employees/edit/{id}` | Show edit form |
| POST | `/employees/update/{id}` | Update employee |
| GET | `/employees/delete/{id}` | Delete employee |

## Features in Detail

### Form Validation
- All required fields are validated
- Email format validation
- Unique email constraint
- User-friendly error messages

### Responsive Design
- Works on desktop and mobile devices
- Clean and modern UI
- Smooth animations and transitions

### User Experience
- Success messages after operations
- Confirmation dialogs for deletions
- Easy navigation between pages
- Intuitive button placement

## Future Enhancements

Potential features for future versions:
- User authentication and authorization
- Employee photo upload
- Export to PDF/Excel
- Advanced filtering options
- Employee performance tracking
- Department management
- Pagination for large datasets

## Support

For issues or questions, please check:
1. This README file
2. Application logs in the console
3. MySQL error logs

## License

This project is created for educational and demonstration purposes.

---

**Developed with Spring Boot & MySQL**
**Theme: Blue & White Professional Design**

