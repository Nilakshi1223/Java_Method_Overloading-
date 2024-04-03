public class Animal {
    public void print (){
        System.out.println("I am animal");
    }
}

class Dog extends Animal{
    @Override
    public void print() {
        System.out.println("I am dog");
    }
}

class Text {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.print();
    }
}
