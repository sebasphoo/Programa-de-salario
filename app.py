class Animal: 
    def sonido(self):
        print("Hace un sonido")
class  Perro(Animal):
    def sonido(self):
        print("guau guau")   

animal = Animal()
perro = Perro() 

animal.sonido()
perro.sonido()