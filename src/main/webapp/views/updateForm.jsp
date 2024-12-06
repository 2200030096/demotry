<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<body>
<h2>Update Student</h2>
<form action="/updateStudent" method="post">
    <input type="hidden" name="sid" value="${student.sid}"/>
    <label for="sname">Name:</label>
    <input type="text" name="sname" value="${student.sname}" required/><br><br>

    <label for="sfee">Fee:</label>
    <input type="text" name="sfee" value="${student.sfee}" required/><br><br>

    <input type="submit" value="Update"/>
</form>
</body>
</html>
