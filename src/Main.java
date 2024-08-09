public class Main {
    public static void main(String[] args) {
        MyList myList = new MyArrayList();
        myList.add("summer");
        myList.add("winter");
        myList.add("spring");

        System.out.println("Size after additions: " + myList.getSize());

        myList.remove("summer");
        System.out.println("Size after removing 'summer': " + myList.getSize());

        myList.remove(1);
        System.out.println("Size after removing at index 1: " + myList.getSize());

        myList.clearAll();
        System.out.println("Size after clearing all: " + myList.getSize());
    }
}
