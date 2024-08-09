public class MyArrayList implements MyList {
    private String[] array = new String[10];
    private int size = 0;

    @Override
    public void add(String name) {
        array[size] = name;
        size++;
    }

    @Override
    public void remove(String name) {
        for (int i = 0; i < size; i++) {
            if (array[i].equals(name)) {
                for (int j = i; j < size - 1; j++) {
                    array[j] = array[j + 1];
                }
                array[size - 1] = null;
                size--;
                break;
            }
        }
    }

    @Override
    public void remove(int index) {
        if (index >= 0 && index < size) {
            for (int i = index; i < size - 1; i++) {
                array[i] = array[i + 1];
            }
            array[size - 1] = null;
            size--;
        } else {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public void clearAll() {
        for (int i = 0; i < size; i++) {
            array[i] = null;
        }
        size = 0;
    }
}
