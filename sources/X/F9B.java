package X;

import android.text.TextUtils;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class F9B {
    public static final List<String> LIZ;

    static {
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(C16880lQ.LLLLLLLLLL().getPath());
        LIZ2.append("/VESDK_Demo/");
        String LIZIZ = X1D.LIZIZ(LIZ2);
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append(LIZIZ);
        LIZ3.append("veimage/");
        X1D.LIZIZ(LIZ3);
        StringBuilder LIZ4 = X1D.LIZ();
        LIZ4.append(LIZIZ);
        LIZ4.append("resource/");
        String LIZIZ2 = X1D.LIZIZ(LIZ4);
        StringBuilder LIZ5 = X1D.LIZ();
        LIZ5.append(LIZIZ2);
        LIZ5.append("stickers/");
        X1D.LIZIZ(LIZ5);
        LIZ = new ArrayList();
        new ArrayList();
        new Formatter(new StringBuilder(), Locale.getDefault());
        int i = 1;
        while (true) {
            ((ArrayList) LIZ).add(KMP.LJ("Filter_0", i));
            while (true) {
                i++;
                if (i < 20) {
                    if (i < 10) {
                        break;
                    }
                    ((ArrayList) LIZ).add(KMP.LJ("Filter_", i));
                } else {
                    return;
                }
            }
        }
    }

    public static boolean LIZ(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        File file = new File(str);
        if (!file.exists() || file.length() <= 0) {
            return false;
        }
        return true;
    }

    public static final String LIZIZ(String str) {
        try {
            File file = new File(str);
            FileReader fileReader = new FileReader(file);
            InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(file), "utf-8");
            StringBuffer stringBuffer = new StringBuffer();
            while (true) {
                int read = inputStreamReader.read();
                if (read != -1) {
                    stringBuffer.append((char) read);
                } else {
                    fileReader.close();
                    inputStreamReader.close();
                    String stringBuffer2 = stringBuffer.toString();
                    o.LJIIIIZZ(stringBuffer2, "sb.toString()");
                    return stringBuffer2;
                }
            }
        } catch (IOException e) {
            C16880lQ.LLLLIIL(e);
            return null;
        }
    }
}
