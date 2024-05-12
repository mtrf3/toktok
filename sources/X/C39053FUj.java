package X;

import java.io.File;
import java.io.PrintStream;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.FUj, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39053FUj {
    public static final ConcurrentHashMap<String, Boolean> LIZ = new ConcurrentHashMap<>();

    public static void LIZ(String str) {
        File file = new File(C39054FUk.LIZ.LIZIZ(), str);
        if (file.exists()) {
            PrintStream printStream = System.err;
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("ZOIN real loadLibrary by path ");
            LIZ2.append(file.getPath());
            printStream.println(X1D.LIZIZ(LIZ2));
            try {
                System.load(file.getPath());
            } catch (Throwable unused) {
                PrintStream printStream2 = System.err;
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append("ZOIN real loadLibrary by name (maybe needed not found)");
                LIZ3.append(file.getPath());
                printStream2.println(X1D.LIZIZ(LIZ3));
                C39051FUh.LIZ(str.substring(3).replace(".so", ""));
            }
        } else {
            PrintStream printStream3 = System.err;
            StringBuilder LIZ4 = X1D.LIZ();
            LIZ4.append("ZOIN real loadLibrary by name (maybe decode failed or in apk)");
            LIZ4.append(file.getPath());
            printStream3.println(X1D.LIZIZ(LIZ4));
            C39051FUh.LIZ(str.substring(3).replace(".so", ""));
        }
        LIZ.put(str, Boolean.TRUE);
        PrintStream printStream4 = System.err;
        StringBuilder LIZ5 = X1D.LIZ();
        LIZ5.append("ZOIN loadLibrary ");
        LIZ5.append(str);
        LIZ5.append(" success");
        printStream4.println(X1D.LIZIZ(LIZ5));
    }
}
