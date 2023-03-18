public class Main {
    public static void main(String[] args)
    {
        employee emp1= new employee();
        manager emp2= new manager();
        emp1.name="Sai";
        emp1.age=19;
        emp1.phone="8610750357";
        emp1.add="Ambattur";
        emp1.salary="50k";
        emp1.Specialization="Machine Learning";
        System.out.println(emp1.name+"\n"+emp1.age+"\n"+emp1.phone+"\n"+emp1.add+"\n"+emp1.Specialization);
        emp1.printSalary();
        System.out.println("\n");
        emp2.name="Som";
        emp2.age=19;
        emp2.phone="8610750358";
        emp2.add="Puducherry";
        emp2.salary="50k";
        emp2.Department="AI-DS";
        System.out.println(emp2.name+"\n"+emp2.age+"\n"+emp2.phone+"\n"+emp2.add+"\n"+"\n"+emp2.Department);
        emp2.printSalary();

    }
}