package X;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/* loaded from: classes9.dex */
public final class IU9 {
    public static void LIZ(BufferedReader bufferedReader) {
        try {
            bufferedReader.close();
        } catch (Exception e) {
            android.util.Log.getStackTraceString(e);
        }
    }

    public static BufferedReader LIZIZ(File file) {
        BufferedReader bufferedReader = null;
        if (file == null) {
            return null;
        }
        if (!file.exists()) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("file:");
            LIZ.append(file.getName());
            LIZ.append(" not exist");
            X1D.LIZIZ(LIZ);
            return null;
        }
        if (!file.canRead()) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("file:");
            LIZ2.append(file.getName());
            LIZ2.append(" can not read");
            X1D.LIZIZ(LIZ2);
            return null;
        }
        try {
            bufferedReader = new BufferedReader(new FileReader(file), 10000);
            return bufferedReader;
        } catch (Exception e) {
            android.util.Log.getStackTraceString(e);
            return bufferedReader;
        }
    }

    public static void LIZJ(String str, IU5 iu5) {
        BufferedReader LIZIZ;
        if (str == null || (LIZIZ = LIZIZ(new File(str))) == null) {
            return;
        }
        while (true) {
            try {
                String readLine = LIZIZ.readLine();
                if (readLine == null) {
                    break;
                } else {
                    iu5.LIZ(readLine);
                }
            } catch (IOException e) {
                android.util.Log.getStackTraceString(e);
            }
        }
        LIZ(LIZIZ);
    }
}
