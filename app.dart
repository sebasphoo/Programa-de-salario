// Ejemplo de parametros posicionales
void saludar(String nombre, int edad) {
  print("$nombre $edad ");
}

void main() {
  saludar("sebastian", 18);
}

// Ejemplo de parametros nombrados
void saludar2({required String nombre, required int edad}) {
  print("$nombre $edad ");
}

void Main() {
  saludar2(nombre: "sebastian", edad: 18);
}
