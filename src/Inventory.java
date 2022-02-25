import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Inventory {
    private List guitars;

    public Inventory(){
        guitars = new LinkedList();
    }
    public void addGuitar(String serialNumber, double price,String model,Builder builder, Type type, Wood backWood, Wood topWood){
        Guitar guitar = new Guitar(serialNumber, price, model, builder, type, backWood, topWood);
        guitars.add(guitar);
    }

    public void addGuitar(Guitar g){
        guitars.add(g);
    }
    public Guitar search(Guitar searchGuitar){
        for(Iterator i = guitars.iterator();  i.hasNext();){
            Guitar guitar = (Guitar) i.next();
            if(guitar.getBuilder() != searchGuitar.getBuilder())
                continue;
            if(guitar.getBackWood() != searchGuitar.getBackWood())
                continue;
            if(guitar.getTopWood() != searchGuitar.getTopWood())
                continue;
//            String model = searchGuitar.getModel();
//            if (model != null || !model.equals("") && !model.equalsIgnoreCase(guitar.getModel()))
//                continue;
            return guitar;
        }
        return null;
    }

    @Override
    public String toString() {
        String collection = "";
        for(Iterator i = guitars.iterator(); i.hasNext();){
            Guitar guitar = (Guitar) i.next();
            collection += guitar.toString() + "\n";
        }
        return collection;
    }
}
