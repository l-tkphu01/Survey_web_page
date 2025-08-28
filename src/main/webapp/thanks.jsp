<%@ page contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Thanks</title>
    <link rel="stylesheet" href="survey.css">
</head>
<body>
<div class="survey-form">
    <h1>Thank You!</h1>
    <p>We appreciate your feedback, here is what we received:</p>

    <h2>Your Information:</h2>
    <p><strong>First Name:</strong> ${user.firstName}</p>
    <p><strong>Last Name:</strong> ${user.lastName}</p>
    <p><strong>Email:</strong> ${user.email}</p>
    <p><strong>Date of Birth:</strong> ${user.dob}</p>

    <h2>Survey Details:</h2>
    <p><strong>Heard from:</strong> ${user.heardFrom}</p>
    <p><strong>Wants Updates:</strong> ${user.wantsUpdates ? "Yes" : "No"}</p>
    <p><strong>Email Announcements:</strong> ${user.emailOK ? "Yes" : "No"}</p>
    <p><strong>Preferred Contact:</strong> ${user.contactVia}</p>
</div>
</body>
</html>
