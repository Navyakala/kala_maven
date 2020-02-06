public class Choco  implements SweetChoco
{
    String name;
    String type;
    int  weight;
    public void  isName(String name)
    {
        this.name=name;
    }
    public void  isType(String type)
    {
        this.type=type;
    }
    public void  isWeight(int weight )
    {
        this.weight=weight;
    }
    public String displayName()
    {
        return name;
    }
    public String displayType() {
        return type;
    }

    public int displayWeight() {
        return  weight;
    }
}
