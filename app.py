class Animal: 
    def sonido(self):
        print("Hace un sonido")
class  Gato(Animal):
    def sonido(self):
        print("miau miau")   

animal = Animal()
gato = Gato() 

animal.sonido()
gato.sonido()