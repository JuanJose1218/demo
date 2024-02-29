# demo



curl --location --request POST 'http://localhost:8080/demo' \
--header 'Content-Type: application/json' \
--data-raw '{
"nombre": "Nombre",
"apellido": "apellido",
"fechaNacimiento": "1997-08-08"
}'