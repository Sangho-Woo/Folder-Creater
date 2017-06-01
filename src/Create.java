/**
 * Created by Sangho-Woo on 2017-05-29.
 */
import java.io.*;

public class Create {
    public static void main(String args[]) {
        if (args.length == 0) {
            System.err.println("Input Filename...");
            System.exit(1);
        }
        try{
            FileInputStream fis = new FileInputStream(new File(args[0]));

            InputStreamReader isr = new InputStreamReader(fis,"UTF-8");

            BufferedReader br = new BufferedReader(isr);

            String str = null;
            File file = null;

            while(true){
                str = br.readLine();
                if(str==null) break;
                System.out.println(str);

                file = new File(str);

                if(!file.exists()) {
                    file.mkdirs();
                    Thread.sleep(2000);
                }

            }
        }catch(Exception e){
            e.printStackTrace();
        }



    }
}