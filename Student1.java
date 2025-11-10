
// no arguement constror

// purpose 
// to provide default values to object properties..


class Student1 {
    int id ;
    String name;

    //default constrotor 
    Student1 () {
        id = 0;
        name = "unknow";
    }

    void display() {
        System.out.println(id + " " + name);
    }
    public static void main (String[] args) {
        Student1 s1 = new Student1();
        s1.display();
    }
}