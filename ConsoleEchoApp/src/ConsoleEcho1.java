import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class ConsoleEcho1 {

	public static void main(String[] args) throws IOException {
		// TODO 自動生成されたメソッド・スタブ
        BufferedReader r =
                new BufferedReader(new InputStreamReader(System.in), 1);
                                            // データ入力の準備
        for(;;){
        	System.out.print(">"); // 画面出力
        	System.out.flush();             // 強制出力
            String s = r.readLine();        // 文字列の入力
            if(s.length() == 0)
            {
            	// 処理なし
            	break;
            }
            else
            {
            	System.out.println(s);
            }
        }
	}
}
