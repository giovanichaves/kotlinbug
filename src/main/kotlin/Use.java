package main.kotlin;

public class Use {

    private Short a = 2;
    private Short b = 4;

    public void example() {

        Fails.round(a*2/b, 3);

        Works.round(a*2/b, 3);

    }
}
