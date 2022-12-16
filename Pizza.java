class Pizza
{
    String size;
    int cheese;
    int pepperoni;
    int ham;
    
    Pizza(String size,int cheese,int pepperoni,int ham)
    {
        this.size=size;
        this.cheese=cheese;
        this.pepperoni=pepperoni;
        this.ham=ham;
    }
    
    double getcost()
    {
        if(size.equalsIgnoreCase("small"))
        {
            return 10+((this.cheese+this.pepperoni+this.ham)*2);
        }
        else if(size.equalsIgnoreCase("medium"))
        {
            return 12+((this.cheese+this.pepperoni+this.ham)*2);
        }
        else if(size.equalsIgnoreCase("large"))
        {
            return 14+((this.cheese+this.pepperoni+this.ham)*2);
        }
        else
        {
            return 0.0;
        }
    }
    
    String getdescription()
    {
        return "Pizza Size-"+size+"\nNo of cheese Topplings-"+cheese+"\nNo of Pepperoni Topplings-"+pepperoni+"\nNo of Ham Topplings-"+ham+"\n  Total prize-"+getcost()+"\n";
    }
    
    public static void main(String [] args)
    {
        Pizza p = new Pizza("small",1,1,2);
        Pizza p1 = new Pizza("large",1,2,1);
        Pizza p2 = new Pizza("medium",2,1,1);
        System.out.println(p.getdescription());
        System.out.println(p1.getdescription());
        System.out.println(p2.getdescription());
    }
}
