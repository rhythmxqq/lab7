package com.company;

public class Main {
//Создать класс Animal и расширяющие его классы Dog, Cat, Horse. Класс Animal содержит переменные food,
// location и методы makeNoise, eat, sleep.
// Метод makeNoise, например, может выводить на консоль "Такое-то животное спит".
// Dog, Cat, Horse переопределяют методы makeNoise, eat.
// Добавьте переменные в классы Dog, Cat, Horse, характеризующие только этих животных.
// Создайте класс Ветеринар, в котором определите метод void treatAnimal(Animal animal).
// Пусть этот метод распечатывает food и location пришедшего на прием животного.


    public static class Animal{
        Animal animal;
        public String Name;
        private String food;
        public String location;
        public String setFood(){
            return food;
        }

        Animal(String Name,String food,String location){
            this.Name = Name;
            this.food=food;
            this.location=location;
        }
        public void aet(){
            System.out.println("*чавкает* \n ест ");
        }
    public void makeNoise(){
            System.out.println("издает шум");
    }
    public void sleep(){
            System.out.println("спит");
    }
    public void displayInfo(){
            System.out.println("location: " + location);
            System.out.println("food: " + food);
    }
    //public String setName(){
  //          this.Name = Name;
   //         return this.Name;
  //  }

}

static class Dog extends Animal{
private String nuans = "много слюней";

    Dog(String Name,String food,String location) {
        super(food, location, Name);
    }

    @Override
    public void aet() {
        System.out.println("Собака кушает " + setFood());
    }

    @Override
    public void makeNoise() {
        System.out.println("Собака издает гав-гав");
    }

    @Override
    public void sleep() {
        System.out.println("Собака спит");
    }

    @Override
    public void displayInfo() {
        aet();
        makeNoise();
        sleep();
        System.out.println("минус: " + nuans);
    }
}
    static class Horse extends Animal{
        private String plus = "можно покататься";
        Horse(String Name,String food,String location) {
            super(food, location, Name);
        }
        @Override
        public void aet() {
            System.out.println("Лошадка кушает " + setFood());
        }

        @Override
        public void makeNoise() {
            System.out.println("лошадка игогокает :з");
        }

        @Override
        public void sleep() {
            System.out.println("лошадка спит");
        }

        @Override
        public void displayInfo() {
            aet();
            makeNoise();
            sleep();
            System.out.println("плюс: " + plus);
        }
    }
    static class Cat extends Animal{
        private String plus = "милый и теплый";
        Cat(String Name,String food,String location) {
            super(food, location, Name);
        }

        @Override
        public void aet() {
            System.out.println("котик кушает " + setFood());
        }

        @Override
        public void makeNoise() {
            System.out.println("котик мяукает");
        }

        @Override
        public void sleep() {
            System.out.println("котик  спит");
        }

        @Override
        public void displayInfo() {
            aet();
            makeNoise();
            sleep();
            System.out.println("плюсик " + plus);
        }
    }
    static class Veterinar{

        void treatAnimal(Animal animal) {
            System.out.print("food :" + animal.food);
            System.out.println("\n location: " + animal.location);
            System.out.println( animal.Name + " на приеме у Ветеринара");
        }
    }

    public static void main(String[] args) {
        Veterinar vet = new Veterinar();
        Animal[] animals = new Animal[3];
        animals[0] = new Dog("Москва", "Бобик", "мясо");
        animals[1] = new Cat("Пенза","Снежок", "стейк");
        animals[2] = new Horse("Село Курчаева","звездочка", "морковь");
        for (int i = 0; i <= animals.length - 1; i++) {
            vet.treatAnimal(animals[i]);
            animals[i].displayInfo();
            System.out.println("\n");
        }



    }
}
