class Plant {
    void Rose() {
        System.out.println("this is rose");
    }
}

class Leaf extends Plant {
    void Lilly() {
        System.out.println("this is lilly");
    }
}

class Stem extends Leaf {
    void Lotus() {
        System.out.println("this is lotus");
    }
}

public class Plant {
    public static void main(String args[]) {
        Stem c = new Stem(); 
        c.Rose();
        c.Lilly();
        c.Lotus();
        System.out.println("done");
    }
}
