package X;

import android.content.Context;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.N3p, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C58741N3p {
    public static final java.util.Map<Class, Object> LIZ = new ConcurrentHashMap();

    public static <T> T LIZ(Context context, Class<T> cls) {
        Context LLLLL;
        if (context == null || (LLLLL = C16880lQ.LLLLL(context)) == null || !cls.isInterface() || !UPA.class.equals(cls)) {
            return null;
        }
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) LIZ;
        T t = (T) concurrentHashMap.get(cls);
        if (t == null || !(t instanceof C58742N3q)) {
            T t2 = (T) new C58742N3q(LLLLL);
            concurrentHashMap.put(cls, t2);
            return t2;
        }
        return t;
    }
}
