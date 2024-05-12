package X;

import android.text.TextUtils;
import defpackage.g0;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Method;

/* loaded from: classes12.dex */
public final class PC8 {
    public static boolean LIZ;
    public static boolean LIZIZ;
    public static String LIZJ;
    public static Method LIZLLL;

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0066, code lost:
    
        if (X.C47614ImQ.LIZ(r3, "flyme") != false) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String LIZ() {
        /*
            Method dump skipped, instructions count: 419
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.PC8.LIZ():java.lang.String");
    }

    public static String LIZIZ(String str) {
        String str2;
        String str3 = "";
        BufferedReader bufferedReader = null;
        try {
            if (LIZLLL == null) {
                LIZLLL = Class.forName("android.os.SystemProperties").getMethod("get", String.class);
            }
            str2 = (String) LIZLLL.invoke(null, str);
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
            str2 = "";
        }
        if (!TextUtils.isEmpty(str2)) {
            return str2;
        }
        try {
            Runtime runtime = Runtime.getRuntime();
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("getprop ");
            LIZ2.append(str);
            Process exec = runtime.exec(X1D.LIZIZ(LIZ2));
            BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(exec.getInputStream()), 1024);
            try {
                str3 = bufferedReader2.readLine();
                exec.destroy();
                g0.LJJIJL(bufferedReader2);
                return str3;
            } catch (Throwable unused) {
                bufferedReader = bufferedReader2;
                g0.LJJIJL(bufferedReader);
                return str3;
            }
        } catch (Throwable unused2) {
        }
    }
}
