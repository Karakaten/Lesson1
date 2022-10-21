public class Journal extends Student{

    public String out() {
        return "Журнал:" + "\n" + getFirstName() + " " + getSecondName() + " " + getGrade();
    }

}
