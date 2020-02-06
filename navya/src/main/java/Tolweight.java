public class Tolweight
{
    String name;
    String type;
    int weight;
    public Tolweight(String name,String type,int weight)
    {
        this.name=name;
        this.type=type;
        this.weight=weight;

    }

    public Tolweight() {

    }

    public int totalWeight(int totalChoco,int totalSweet)
    {
        return totalChoco+totalSweet;
    }
}