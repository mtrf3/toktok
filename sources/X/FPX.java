package X;

import android.system.ErrnoException;
import com.bytedance.crash.util.NativeTools;
import java.io.Closeable;
import java.io.IOException;

/* loaded from: classes7.dex */
public final class FPX {
    public static int LIZ;
    public static boolean LIZIZ;
    public static boolean LIZJ;

    public static boolean LIZJ() {
        int i = LIZ;
        if (i == 28 || i == 2 || LIZJ) {
            return true;
        }
        return false;
    }

    public static void LIZ(IOException iOException) {
        Throwable cause = iOException.getCause();
        if (cause != null && (cause instanceof ErrnoException)) {
            ErrnoException errnoException = (ErrnoException) cause;
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("find errnor ");
            LIZ2.append(errnoException.errno);
            X1D.LIZIZ(LIZ2);
            C78685UuP.LJJJLL();
            int i = errnoException.errno;
            if (i != 2 && i != 28) {
                if (i != 23 && i != 24) {
                    return;
                }
                LIZ = i;
                if (LIZIZ) {
                    return;
                }
                LIZIZ = true;
                NativeTools.LJIILJJIL().LJJIIJ();
                return;
            }
            LIZ = i;
        }
    }

    public static void LIZIZ(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Throwable unused) {
            }
        }
    }

    public static void LIZLLL(String str) {
        Class cls = Integer.TYPE;
        Object[] objArr = {str, new EW4(cls, 493), new EW4(cls, -1), new EW4(cls, -1)};
        try {
            EW3.LIZ(null, EW3.LIZIZ(Class.forName("android.os.FileUtils"), "setPermissions", EW3.LIZJ(objArr)), EW3.LIZLLL(objArr));
        } catch (Exception unused) {
        }
    }
}
