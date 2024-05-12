package X;

import android.os.Trace;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: X.00R, reason: invalid class name */
/* loaded from: classes.dex */
public final class C00R {
    public static long LIZ;
    public static Method LIZIZ;

    public static boolean LIZ() {
        try {
            if (LIZIZ == null) {
                return Trace.isEnabled();
            }
        } catch (NoClassDefFoundError | NoSuchMethodError unused) {
        }
        boolean z = false;
        try {
            if (LIZIZ == null) {
                LIZ = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                LIZIZ = Trace.class.getMethod("isTagEnabled", Long.TYPE);
            }
            z = ((Boolean) LIZIZ.invoke(null, Long.valueOf(LIZ))).booleanValue();
            return z;
        } catch (Exception e) {
            if (e instanceof InvocationTargetException) {
                Throwable cause = e.getCause();
                if (cause instanceof RuntimeException) {
                    throw cause;
                }
                throw new RuntimeException(cause);
            }
            return z;
        }
    }
}
