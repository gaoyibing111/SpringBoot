<!DOCTYPE html>
<html lang="en">
<head>
    <title>SpringBoot + Freemarker</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
</head>
<body>
<table>
<#list LogList as p>
    <tr>
        <td> javaPath=> ${p.javaPath}  logLevel=> ${p.logLevel}</td>
    </tr>
</#list>
</table>

</body>
</html>
