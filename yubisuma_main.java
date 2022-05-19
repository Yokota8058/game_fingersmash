import java.io.*;
class yubisuma_main{
    public static void main(String args[]) throws IOException{
        
        int myhand = 2;
        int CPUhand = 2;

        
        
        do{
            int yosou_myfinger = Myfinger_select(0,4,"俺 : ゆびスマ");
            int up_myfinger = Myfinger_select(0,myhand,"(俺の指の本数)");

            int up_CPUfinger = CPUfinger_select(CPUhand,"CPU : (指の本数)");
            
            if(yosou_myfinger == (up_myfinger + up_CPUfinger)){
                myhand--;
                System.out.println("MyHand : " + myhand);
            }
            else{
                System.out.println("MyHand : " + myhand);
            }                                                   //ここまで俺のターン                    
            System.out.println();
            

            System.out.println("CPU : ゆびスマっ!!◆");
            
            up_myfinger = Myfinger_select(0,myhand,"(俺の指の本数)");
            int yosou_CPUfinger = CPUfinger_select(myhand + CPUhand,"CPU : ゆびスマっ!!");  

            up_CPUfinger = CPUfinger_select(CPUhand,"CPU : (指の本数)");


            
            if(yosou_CPUfinger == (up_myfinger + up_CPUfinger)){
                CPUhand--;
                System.out.println("CPUHand : " + CPUhand);
            }
            else{
                System.out.println("CPUHand : " + CPUhand);
            }
            System.out.println();                                        

        }while((myhand != 0) && (CPUhand != 0));

        System.out.println("ゲーム終了");


    
    }

    public static int Myfinger_select(int min,int max,String text1){

        int myfinger = 0;

        do{
            if(myfinger < min || max < myfinger){
                System.out.println("入力ミス もう一度入力してね！");
            }
            else{
                System.out.print(text1 + "っ!!");
            }

            
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
            try{
                String str = br.readLine();
    
                myfinger = Integer.parseInt(str);
            }
            catch(Exception e){
                myfinger = -1;
            }

        }while(myfinger < min || max < myfinger);
        

        try{
            Thread.sleep(1000);
        }catch(Exception e) {
            e.printStackTrace();    //System.out.printlnより行数とか教えてくれる
        }
        
        System.out.println(myfinger);

        return myfinger;
    }

    public static int CPUfinger_select(int x,String text2){

        int CPUfinger = 0;


        CPUfinger = (int) (Math.random() * x);

        try{
            Thread.sleep(1000);
        }catch(Exception e) {
            System.out.println(e);
        }
        System.out.println(text2 + CPUfinger); //"CPU : (指の本数)"
        return CPUfinger;

    }

    
}

