import java.util.ArrayList;
import java.util.*;
import java.util.Iterator;

public class Main extends Tolweight
{
    public static  void main(String [] args)
    {
        ArrayList<Tolweight> a = new ArrayList<Tolweight>();
        Tolweight t1 = new Tolweight("Chocolates", "Dairy milk", 5);
        a.add(t1);
        Tolweight t2 = new Tolweight("Chocolates", "Candies", 10);
        a.add(t2);
        Tolweight t3 = new Tolweight("Chocolates", "Snickers", 15);
        a.add(t3);
        Tolweight t4 = new Tolweight("Chocolates", "5 Star", 20);
        a.add(t4);
        Tolweight t5 = new Tolweight("Sweets", "Kalakani", 5);
        a.add(t5);
        Tolweight t6 = new Tolweight("Sweets", "Sunnunda", 10);
        a.add(t6);        Tolweight t7 = new Tolweight("Sweets", "Laddu", 15);
        a.add(t7);
        Tolweight t8 = new Tolweight("Sweets", "Jilebi", 20);
        a.add(t8);
        int totalChoco = 0;
        int totalSweet = 0;
        Iterator itr = a.iterator();
        while (itr.hasNext()) {

            Tolweight it = (Tolweight) itr.next();
            if (it.name == "Chocolates") {
                Choco c = new Choco();
                c.isName(it.name);
                c.isType(it.type);
                c.isWeight(it.weight);
                System.out.println("Chocolate Type:    " + c.displayType());
                System.out.println("Chocolate weight:   "+c.displayWeight());
                totalChoco = totalChoco + it.weight;
            }
            else if (it.name == "Sweets") {
                Sweet s = new Sweet();
                s.isName(it.name);
                s.isType(it.type);
                s.isWeight(it.weight);
                System.out.println("Sweet Type:     " + s.displayType());
                System.out.println("Sweet weight:   "+s.displayWeight());
                totalSweet = totalSweet + it.weight;
            }

            if (it.name == "Candies") {
                System.out.println("Candies Weight:    " + it.weight);
            }
        }

            //	System.out.println(it.itemWeight+" "+it.itemName+" "+it.itemType);
            System.out.println("total weight of choclate gifts: " + totalChoco);
            System.out.println("total weight of sweet gifts: " + totalSweet);
            Tolweight t = new Tolweight();
           // t.totalWeight();
            t.totalWeight(totalChoco, totalSweet);

    }


    }
