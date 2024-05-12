package X;

import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.Mul, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C58323Mul {
    public static final C58558MyY LIZ = new C58558MyY();
    public static final java.util.Map<String, Object> LIZIZ = new ConcurrentHashMap();

    public static Object LIZ(String str) {
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) LIZIZ;
        Object obj = concurrentHashMap.get(str);
        if (obj != null) {
            return obj;
        }
        LIZ.getClass();
        String LIZ2 = C58558MyY.LIZ(str);
        if (LIZ2 != null) {
            concurrentHashMap.put(str, LIZ2);
        }
        return LIZ2;
    }
}
