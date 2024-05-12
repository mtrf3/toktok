package X;

import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes12.dex */
public final class PGH {
    public static final ConcurrentHashMap<Class, Object> LIZ = new ConcurrentHashMap<>();
    public static final ConcurrentHashMap<Class, InterfaceC64158PFy<?>> LIZIZ = new ConcurrentHashMap<>();
    public static final ConcurrentHashMap<Class, PGI> LIZJ = new ConcurrentHashMap<>();

    public static <T> T LIZ(Class<T> cls) {
        ConcurrentHashMap<Class, Object> concurrentHashMap = LIZ;
        T t = (T) concurrentHashMap.get(cls);
        if (t == null) {
            synchronized (PGH.class) {
                ConcurrentHashMap<Class, InterfaceC64158PFy<?>> concurrentHashMap2 = LIZIZ;
                InterfaceC64158PFy<?> interfaceC64158PFy = concurrentHashMap2.get(cls);
                if (interfaceC64158PFy != null) {
                    t = (T) interfaceC64158PFy.create();
                    concurrentHashMap2.remove(cls);
                    if (t != null) {
                        concurrentHashMap.put(cls, t);
                        ConcurrentHashMap<Class, PGI> concurrentHashMap3 = LIZJ;
                        PGI pgi = concurrentHashMap3.get(cls);
                        if (pgi != null) {
                            pgi.LIZ();
                            concurrentHashMap3.remove(cls);
                        }
                        return t;
                    }
                }
            }
        }
        return t;
    }

    public static <T> void LIZIZ(Class<T> cls, InterfaceC64158PFy<T> interfaceC64158PFy) {
        LIZIZ.put(cls, interfaceC64158PFy);
    }
}
