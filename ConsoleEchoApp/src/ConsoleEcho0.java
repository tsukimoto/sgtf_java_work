import java.io.*;

public class ConsoleEcho0 {
    public static void main(String[] args) throws IOException {
        BufferedReader r =
            new BufferedReader(new InputStreamReader(System.in), 1);
                                        // データ入力の準備
        System.out.print("お名前は? "); // 画面出力
        System.out.flush();             // 強制出力
        String s = r.readLine();        // 文字列の入力
        System.out.println("こんにちは，" + s + "さん");
    }
}
