package fsdrevature;

interface X{
    void print();
    interface Y{
        void display();
    }
}

class Z implements X, X.Y{

    @Override
    public void print() {

    }

    @Override
    public void display() {

    }
}

public class Demo24 {
    public static void main(String[] args) {

    }
}
