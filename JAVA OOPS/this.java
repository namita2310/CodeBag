class th {
    int a=2, b=3;
    th(){
        System.out.println(a+" "+b);
    }
    th(int a, int b){
        this.a=a;
        this.b=b;
        System.out.println(a+" "+b);

    }
    public void add (){
        System.out.println(a+b);
    }  
}
class this{
    public static void main(String args[]) {

    th obj = new th(4,5);
    obj.add();
    th ob= new th(8,9);
    th ob2 = new th();
    
    }
}
