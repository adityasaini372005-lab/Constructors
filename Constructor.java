class Constructor
 {
/*    String name;

    Constructor(String n){
     name =n;
    }
    void display()
    public static void main (String args[]){
        Constructor s = new Constructor("Aditya");
        s.display();
        }
}
*/
    // Instance variables
/*     private String name;
    private int age;

    // Parameterized Constructor
    public Constructor(String name, int age) {
        this.name = name; // 'this' keyword refers to the current object's instance variable
        this.age = age;
    }

    // Other methods (e.g., getters)
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }  */

    public static void main(String[] args) {
        // Creating objects using the parameterized constructor
    /*    Constructor object1 = new Constructor("Alice", 25);
        Constructor object2 = new Constructor("Bob", 30);

        System.out.println("Object 1: Name - " + object1.getName() + ", Age - " + object1.getAge());
        System.out.println("Object 2: Name - " + object2.getName() + ", Age - " + object2.getAge());
    }
  }*/
final int x=10;

Constructor ob = new Constructor();
ob.x=25;
System.out.println(ob.x);  // give error
}
}

