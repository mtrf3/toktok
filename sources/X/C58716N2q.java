package X;

import android.os.SystemClock;
import java.lang.reflect.Method;

/* renamed from: X.N2q, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C58716N2q {
    public static final Class<SystemClock> LIZ = SystemClock.class;
    public static final C62822Ol8 LIZIZ = C221108m2.LIZIZ(C58717N2r.LJLIL);

    public static final long LIZ() {
        Object obj;
        try {
            Method method = (Method) LIZIZ.getValue();
            Object obj2 = null;
            if (method != null) {
                obj = method.invoke(null, new Object[0]);
            } else {
                obj = null;
            }
            if (obj instanceof Long) {
                obj2 = obj;
            }
            Long l = (Long) obj2;
            if (l != null) {
                return l.longValue();
            }
        } catch (Throwable unused) {
        }
        return 0L;
    }
}
