public class Q3 {
    public static void main(String[] args) {
        double bill=1200;
        double n;
        if(bill>1000){
            n=bill-(bill*0.10);
        }
        if(bill>=500&&bill<=1000){
            n=bill-(bill*0.05);
        }
        else{
            n=bill;
        }
        System.out.println("Pay bill full:"+n);

    }
}
