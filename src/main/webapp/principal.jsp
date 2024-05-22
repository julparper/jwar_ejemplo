<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>

    <%@ include file="./components/header.html" %>

<table border="1">
    <%
    for (int i=0; i<10; i++){
    %>

        <tr>
            <td> 
                <%= i %> 
            </td>
        </tr>
    <%
    }

    %>

</table>


    <%@ include file="./components/footer.html" %>



</body>
</html>