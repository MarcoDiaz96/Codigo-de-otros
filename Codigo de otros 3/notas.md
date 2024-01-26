En el JS ,  se cambio el  document.getElementsByName("lista-de-productos") por document.getElementById("lista-de-productos") para obtener el elemento correcto.
En lugar de $i, se uso document.querySelector('input') para seleccionar el input.
se movio displayProductos(productos) a displayProductos(productos) en el script de JavaScript, ya que la función displayProductos no está definida.
se corrigio  const li = document.getElementsByName("lista-de-productos") a const li = document.getElementById("lista-de-productos") para obtener el elemento correcto.
En la función filtrado,  Se cambio includes a toLowerCase().includes para que la búsqueda no sea sensible a mayúsculas y minúsculas.