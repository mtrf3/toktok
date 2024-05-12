package X;

import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.Mug, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C58318Mug {
    public static final ConcurrentHashMap<Class, Object> LIZ = new ConcurrentHashMap<>();
    public static final ConcurrentHashMap<Class, InterfaceC58319Muh> LIZIZ = new ConcurrentHashMap<>();

    public static <T> T LIZ(Class<T> cls) {
        ConcurrentHashMap<Class, InterfaceC58319Muh> concurrentHashMap;
        InterfaceC58319Muh interfaceC58319Muh;
        ConcurrentHashMap<Class, Object> concurrentHashMap2 = LIZ;
        Object obj = (T) concurrentHashMap2.get(cls);
        if (obj == null) {
            synchronized (concurrentHashMap2) {
                obj = concurrentHashMap2.get(cls);
                if (obj == null && (interfaceC58319Muh = (concurrentHashMap = LIZIZ).get(cls)) != null) {
                    obj = (T) interfaceC58319Muh.create();
                    if (obj != null) {
                        concurrentHashMap2.put(cls, obj);
                    }
                    concurrentHashMap.remove(cls);
                }
            }
        }
        return (T) obj;
    }
}
