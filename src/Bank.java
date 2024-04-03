public class Bank {
    public int getInterestRate(){
        return 0;
    }
}

class BOC extends Bank {
    @Override
    public int getInterestRate() {
        return 18;
    }
}

class PeoplesBank extends Bank{
    @Override
    public int getInterestRate() {
        return 19;
    }
}

class CommercialBank extends Bank {
    @java.lang.Override
    public int getInterestRate() {
        return 20;
    }
}

class Text2 {
    public static void main(String[] args) {
        
    }
}