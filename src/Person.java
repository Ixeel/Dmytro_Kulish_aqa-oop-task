public class Person {
    private String Name;
    private int age;
    public String job;

    public Person(String Name, int age, String job) {
        this.Name = Name;
        this.age = age;
        this.job = job;
    }

    public String getName() {
        return Name;
    }
    public int getAge() {
        return age;
    }
    public String getJob() {
        return job;
    }

    public void setName(String Name){
        this.Name = Name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public void setJob(String job){
        this.job = job;
    }

}
