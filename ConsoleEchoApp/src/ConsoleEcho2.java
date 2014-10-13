import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;


public class ConsoleEcho2 {
	
	private static BufferedReader console =
            new BufferedReader(new InputStreamReader(System.in), 1);  // データ入力の準備
	
	private static ArrayList<String> arrayStr = new ArrayList<String>();
	
	private static void inputLoop()
	{
		String str = new String(); 
		
        for(;;){
        	System.out.print(">");      // 画面出力
        	System.out.flush();         // 強制出力
        	try
        	{
        		str = console.readLine();    // 文字列の入力
        	}
        	catch(IOException e)
        	{
        		// 処理なし
        	}
            
            // 文字列の格納領域
            if(str.length() == 0)
            {
            	//処理なし
            }
            else
            {
            	arrayStr.add(str);
            }
            
            // 画面出力を行う
            for(int i = 0; i < arrayStr.size(); i++)
            {
            	System.out.println(arrayStr.get(i));
            }
        }		
	}

	public static void main(String[] args) throws IOException {
		// TODO 自動生成されたメソッド・スタブ
		inputLoop();
	}
}
