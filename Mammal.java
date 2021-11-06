
package assingment3_q2;

public class Mammal implements Animal
{
    private String name;
   private int no_legs;
   private String Fav_food;
   

    public Mammal(String name,int no_legs,String Fav_food)
    {
        this.name=name;
        this.no_legs=no_legs;
        this.Fav_food=Fav_food;
    }

   
    @Override
    public String eat() 
    {
         return "Mammal eat Vegetables, Leafage and fruits ";
    }

    @Override
    public String travel()
    {
        return " no travel... ";
    }
    public String setname()
    {
        return name;
    }
    public int NoOfLegs()
    {
        return no_legs;
    }
    public String FavFood()
    {
        return Fav_food;
    }
}
