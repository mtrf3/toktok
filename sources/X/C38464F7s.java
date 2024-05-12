package X;

import android.content.Context;
import android.os.Build;
import java.io.PrintStream;

/* renamed from: X.F7s, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38464F7s {
    public static boolean LIZ() {
        int i = Build.VERSION.SDK_INT;
        if (i < 23) {
            return false;
        }
        Context LIZIZ = EF7.LIZIZ();
        if (i >= 29) {
            return true;
        }
        try {
            if (LIZIZ.checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
                return false;
            }
            return true;
        } catch (Throwable th) {
            PrintStream printStream = System.err;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("isOk ");
            LIZ.append(th);
            printStream.println(X1D.LIZIZ(LIZ));
            return false;
        }
    }
}
