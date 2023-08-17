// Call the dataTables jQuery plugin
$(document).ready(function() {
    //alert("Soy pro");
    //ejecuta el código de aquí después de cargar los datos de la tabla
    cargarUsuarios();
  $('#usuarios').DataTable();
});

async function cargarUsuarios() {
    const request = await fetch('usuario/1', {
        method: 'GET',
        headers: {
          'Accept': 'application/json',
          'Content-Type': 'application/json'
        }
      });
      const usuarios = await request.json();

      console.log(usuarios);
}
