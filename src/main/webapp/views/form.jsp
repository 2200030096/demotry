<%@ page contentType="text/html; charset=UTF-8" %>

<!DOCTYPE html>
<html>
<head>
 <title>Student Form</title>
</head>
<body>
 <h2>Student Form</h2>
 <form action="/addstudent"  >
 <label for="id">ID:</label>
 <input type="text" id="sid" name="id" required><br><br>
 <label for="sname">Name:</label>
 <input type="text" id="sname" name="sname" required><br><br>

 <label for="dept">Department:</label>
 <input type="text" id="dept" name="dept" required><br><br>

 <label for="salary">Salary:</label>
 <input type="text" id="salary" name="salary" required><br><br>

 <input type="submit" value="Submit">
 </form>
</body>
</html>
 