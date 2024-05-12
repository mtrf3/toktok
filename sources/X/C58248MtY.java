package X;

import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.MtY, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C58248MtY {
    public static final ConcurrentHashMap<Class, Object> LIZ = new ConcurrentHashMap<>();

    public static <T> T LIZ(Class<T> cls, InterfaceC58246MtW interfaceC58246MtW) {
        ConcurrentHashMap<Class, Object> concurrentHashMap = LIZ;
        Object obj = (T) concurrentHashMap.get(cls);
        if (obj == null) {
            synchronized (C58248MtY.class) {
                obj = concurrentHashMap.get(cls);
                if (obj == null && (obj = (T) interfaceC58246MtW.create(cls)) != null) {
                    concurrentHashMap.put(cls, obj);
                }
            }
        }
        return (T) obj;
    }
}
