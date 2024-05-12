package X;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

/* loaded from: classes7.dex */
public final class FY6 {
    public static FY6 LIZIZ;
    public Object LIZ;

    public static FY6 LIZIZ() {
        if (LIZIZ == null) {
            LIZIZ = new FY6(0);
        }
        return LIZIZ;
    }

    public /* synthetic */ FY6() {
        this.LIZ = "UTF-8";
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FY6(int i) {
        this();
        if (i != 1) {
            return;
        }
    }

    public final String LIZ(InputStream inputStream) {
        StringBuilder sb = new StringBuilder();
        BufferedReader bufferedReader = null;
        try {
            BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(inputStream, (String) this.LIZ));
            while (true) {
                try {
                    String readLine = bufferedReader2.readLine();
                    if (readLine != null) {
                        sb.append(readLine);
                    } else {
                        bufferedReader2.close();
                        return sb.toString();
                    }
                } catch (Throwable th) {
                    th = th;
                    bufferedReader = bufferedReader2;
                    if (bufferedReader != null) {
                        bufferedReader.close();
                    }
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
