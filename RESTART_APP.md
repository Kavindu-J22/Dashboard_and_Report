# How to Restart the Application

## Quick Restart Steps

### Step 1: Stop the Current Application

If the application is running in a separate command window:
1. Go to that command window
2. Press **Ctrl + C** to stop the application
3. Wait for it to stop completely

OR

Simply close the command window where the application is running.

### Step 2: Start the Application Again

**Option A: Using the Batch File (Easiest)**
1. Double-click `run-app.bat` in the project folder
2. Wait for the message: "Started EmployeeRegisterApplication"
3. Open browser to http://localhost:8080

**Option B: Using Command Line**
1. Open Command Prompt or PowerShell
2. Navigate to the project folder:
   ```bash
   cd "d:\High Score Projects (Sahan)\IT\job - 4\Dashboard_and_Report"
   ```
3. Run the command:
   ```bash
   mvn spring-boot:run
   ```
4. Wait for the message: "Started EmployeeRegisterApplication"
5. Open browser to http://localhost:8080

## What to Expect

When the application starts successfully, you'll see:

```
  .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/
 :: Spring Boot ::                (v3.2.0)

...
...
Started EmployeeRegisterApplication in X.XXX seconds
Tomcat started on port 8080 (http) with context path ''
```

## Testing the Validation Fix

After restarting, test the validation fix:

### Test 1: Empty Form
1. Go to http://localhost:8080
2. Click "Register Employee" without filling anything
3. ✅ You should see error messages below each field
4. ❌ You should NOT see "Whitelabel Error Page"

### Test 2: Invalid Email
1. Fill the form but enter "notanemail" in email field
2. Click "Register Employee"
3. ✅ You should see "Please provide a valid email" error
4. ✅ All your entered data should still be there

### Test 3: Valid Submission
1. Fill all required fields correctly
2. Click "Register Employee"
3. ✅ You should be redirected to employee list
4. ✅ You should see "Employee registered successfully!" message

## Troubleshooting

### Problem: Port 8080 already in use

**Solution:**
1. Find and stop any process using port 8080
2. Or change the port in `application.properties`:
   ```properties
   server.port=8081
   ```
3. Then access the app at http://localhost:8081

### Problem: Application won't start

**Solution:**
1. Make sure MySQL is running
2. Check MySQL credentials in `application.properties`
3. Try rebuilding:
   ```bash
   mvn clean install -DskipTests
   ```

### Problem: Changes not reflected

**Solution:**
1. Stop the application completely
2. Rebuild:
   ```bash
   mvn clean install -DskipTests
   ```
3. Start again:
   ```bash
   mvn spring-boot:run
   ```

## Quick Commands Reference

```bash
# Stop application
Ctrl + C (in the terminal where it's running)

# Rebuild application
mvn clean install -DskipTests

# Start application
mvn spring-boot:run

# Or use the batch file
run-app.bat
```

## Status Check

Application is running correctly if:
- ✅ No errors in the console
- ✅ You see "Started EmployeeRegisterApplication"
- ✅ You see "Tomcat started on port 8080"
- ✅ Browser can access http://localhost:8080
- ✅ Registration form loads properly

---

**The validation fix is now active!** 🎉

Test it by trying to submit an empty form - you should see proper error messages instead of the Whitelabel Error Page.

