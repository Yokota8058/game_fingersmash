import java.io.*;
class yubisuma_main{
    public static void main(String args[]) throws IOException{
        
        int myhand = 2;
        int CPUhand = 2;

        
        
        do{
            int yosou_myfinger = Myfinger_select(0,4,"�� : ��уX�}");
            int up_myfinger = Myfinger_select(0,myhand,"(���̎w�̖{��)");

            int up_CPUfinger = CPUfinger_select(CPUhand,"CPU : (�w�̖{��)");
            
            if(yosou_myfinger == (up_myfinger + up_CPUfinger)){
                myhand--;
                System.out.println("MyHand : " + myhand);
            }
            else{
                System.out.println("MyHand : " + myhand);
            }                                                   //�����܂ŉ��̃^�[��                    
            System.out.println();
            

            System.out.println("CPU : ��уX�}��!!��");
            
            up_myfinger = Myfinger_select(0,myhand,"(���̎w�̖{��)");
            int yosou_CPUfinger = CPUfinger_select(myhand + CPUhand,"CPU : ��уX�}��!!");  

            up_CPUfinger = CPUfinger_select(CPUhand,"CPU : (�w�̖{��)");


            
            if(yosou_CPUfinger == (up_myfinger + up_CPUfinger)){
                CPUhand--;
                System.out.println("CPUHand : " + CPUhand);
            }
            else{
                System.out.println("CPUHand : " + CPUhand);
            }
            System.out.println();                                        

        }while((myhand != 0) && (CPUhand != 0));

        System.out.println("�Q�[���I��");


    
    }

    public static int Myfinger_select(int min,int max,String text1){

        int myfinger = 0;

        do{
            if(myfinger < min || max < myfinger){
                System.out.println("���̓~�X ������x���͂��ĂˁI");
            }
            else{
                System.out.print(text1 + "��!!");
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
            e.printStackTrace();    //System.out.println���s���Ƃ������Ă����
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
        System.out.println(text2 + CPUfinger); //"CPU : (�w�̖{��)"
        return CPUfinger;

    }

    
}

