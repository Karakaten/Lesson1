public class Journal {
     public String journal() {
         Student student = new Student();
         String global = "";
         global += student.out();
         return global;
    }

    public void exit() {
        System.out.println("Журнал " + "\n" + journal());
    }
}
