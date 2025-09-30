# Quick Start Guide - Employee Registration System

## 🚀 Get Started in 3 Steps

### Step 1: Verify Prerequisites ✅

Make sure you have:
- ✅ Java 17+ installed
- ✅ Maven 3.6+ installed  
- ✅ MySQL 8.x running
- ✅ MySQL credentials: username=`root`, password=`Shashini1223@`

### Step 2: Start the Application 🎯

**Option A: Double-click `run-app.bat`** (Easiest!)

**Option B: Run from command line:**
```bash
mvn spring-boot:run
```

Wait for the message: **"Started EmployeeRegisterApplication"**

### Step 3: Open Your Browser 🌐

Navigate to: **http://localhost:8080**

---

## 🎨 What You'll See

### Home Page (Registration Form)
- Beautiful blue and white interface
- Form to register new employees
- 9 fields including name, email, phone, department, position, etc.

### Employee List Page
- Table showing all registered employees
- Search bar to filter employees
- Action buttons: View More, Edit, Delete

### Employee Details Page
- Complete information for selected employee
- Options to Edit or Delete

### Edit Page
- Pre-filled form with current employee data
- Update and save changes

---

## 📝 Quick Test

Try registering your first employee:

1. **Fill the form:**
   - First Name: `John`
   - Last Name: `Doe`
   - Email: `john.doe@test.com`
   - Phone: `555-0123`
   - Department: `IT`
   - Position: `Developer`
   - Join Date: Today's date
   - Address: `123 Main St` (optional)
   - Salary: `50000` (optional)

2. **Click "Register Employee"**

3. **You'll see:**
   - Success message
   - John Doe in the employee list
   - Total employees count

4. **Try the search:**
   - Type "John" in search box
   - Click Search
   - See filtered results

5. **View details:**
   - Click "View More" for John Doe
   - See all information displayed

6. **Edit employee:**
   - Click "Edit Employee"
   - Change Position to "Senior Developer"
   - Click "Update Employee"
   - Verify changes saved

7. **Delete employee:**
   - Click "Delete" button
   - Confirm deletion
   - Employee removed from list

---

## 🎯 Key Features at a Glance

| Feature | How to Use |
|---------|------------|
| **Register** | Fill form → Click "Register Employee" |
| **View All** | Click "View All Employees" in navigation |
| **Search** | Enter keyword → Click "Search" |
| **View Details** | Click "View More" button |
| **Edit** | Click "Edit" button → Update → Save |
| **Delete** | Click "Delete" → Confirm |

---

## 🎨 Color Theme

- **Primary**: Blue (#4A90E2)
- **Background**: White with purple-blue gradient
- **Buttons**: Blue with hover effects
- **Tables**: Clean white with blue headers

---

## 🔧 Troubleshooting

**Problem: Application won't start**
- ✅ Check if MySQL is running
- ✅ Verify credentials in `application.properties`
- ✅ Ensure port 8080 is free

**Problem: Can't connect to database**
- ✅ Start MySQL service
- ✅ Check username: `root`
- ✅ Check password: `Shashini1223@`

**Problem: Port 8080 in use**
- ✅ Stop other applications using port 8080
- ✅ Or change port in `application.properties`

---

## 📚 Need More Help?

- See **README.md** for detailed documentation
- See **TESTING_GUIDE.md** for comprehensive testing
- Check console logs for error messages

---

## 🎉 That's It!

You're ready to use the Employee Registration System!

**Enjoy managing your employees with this beautiful blue and white themed application!** 💙🤍

