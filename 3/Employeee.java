public class Employeee
{
    String Name;
    int joining;
    String address;
    Employeee(String name, int join, String add)
    {
        Name=name;
        joining=join;
        address=add;
    }
    void Robert()
    {
        System.out.println(Name + "   " + joining + "   " + address);
    }
    void Sam()
    {
        System.out.println(Name + "      " + joining  + "   " +         address);
    }
    void John()
    {
        System.out.println(Name + "   " + joining + "   " + address);
    }
}
