//used for multiple inheritance
// 100% abstract

interface animal{
    void f1();
    //public abstract f1();
    int x=4;;
    //public static final int x=4;
}

interface animal2 extends animal{
    void f3();
    //public abstract f3();
    int x=6;;
    //public static final int x=6;
}

class D implements animal,animal2 //child cls
{
    //all abstract methods must be defined in child cls (f1,f3)

    void f1(){

    }
    
    void f3(){

    }

}