const baseEndpoint = 'https://api.github.com';
const usersEndpoint = `${baseEndpoint}/users`;
const $n = document.querySelector('.name'); //Se nombra de forma correcta las variables puesto que son clases 
const $b = document.querySelector('.blog');
const $l = document.querySelector('.location');

async function displayUser(username) {//Se agrega try y catch para completar la promesa
  try {
    $n.textContent = 'Cargando...';
    const response = await fetch(`${usersEndpoint}/${username}`);
    const data = await response.json();//se crea variable data y remueve impresión por consola

    $n.textContent = data.name 
    $b.textContent = data.blog 
    $l.textContent = data.location
  } catch (err) {
    handleError(err);
  }
}

function handleError(err) {
  console.log('OH NO!');
  console.log(err);
  $n.textContent = `Algo salió mal: ${err}`;
}

displayUser('stolinski'); //parte de codigo removida para mejor funcionamiento
