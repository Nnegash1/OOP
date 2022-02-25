public class Test {
    public static void main(String[] args){
        Guitar customerOne = new Guitar("11211", 100, "Stir",Builder.COLLINGS, Type.ACOUSTIC, Wood.BRAZILIAN_ROSEWOOD, Wood.INDIAN_ROSEWOOD);
        Inventory item1 = new Inventory();
        item1.addGuitar(customerOne);

        System.out.print(item1.toString());
        System.out.print(item1.search(customerOne));

    }
}
