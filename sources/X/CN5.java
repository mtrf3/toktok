package X;

import android.content.Context;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes6.dex */
public final class CN5 {
    public static final java.util.Map<Class, Object> LIZ = new ConcurrentHashMap();

    public static <T> T LIZ(Context context, Class<T> cls) {
        Context LLLLL = C16880lQ.LLLLL(context);
        if (LLLLL == null || !cls.isInterface() || !InterfaceC28728BPg.class.equals(cls)) {
            return null;
        }
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) LIZ;
        T t = (T) concurrentHashMap.get(cls);
        if (t == null || !(t instanceof CN4)) {
            T t2 = (T) new CN4(LLLLL);
            concurrentHashMap.put(cls, t2);
            return t2;
        }
        return t;
    }
}
