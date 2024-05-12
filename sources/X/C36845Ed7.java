package X;

import android.text.TextUtils;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Method;

/* renamed from: X.Ed7, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36845Ed7 {
    public static boolean LIZ;
    public static boolean LIZIZ;
    public static String LIZJ;
    public static Method LIZLLL;

    public static String LIZ(String str) {
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
                C78685UuP.LJIIIIZZ(bufferedReader2);
                return str3;
            } catch (Throwable unused) {
                bufferedReader = bufferedReader2;
                C78685UuP.LJIIIIZZ(bufferedReader);
                return str3;
            }
        } catch (Throwable unused2) {
        }
    }
}
