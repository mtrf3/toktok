package X;

import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes9.dex */
public final class JFZ {
    public static final ConcurrentHashMap<String, JFZ> LIZIZ = new ConcurrentHashMap<>();
    public final ConcurrentHashMap<Class, Object> LIZ = new ConcurrentHashMap<>();

    public JFZ() {
        new ConcurrentHashMap();
    }

    public static <T> T LIZ(Class<T> cls, String str) {
        JFZ jfz = LIZIZ.get(str);
        if (jfz != null) {
            return (T) jfz.LIZ.get(cls);
        }
        return null;
    }

    public static void LIZIZ(Class cls, String str, Object obj) {
        ConcurrentHashMap<String, JFZ> concurrentHashMap = LIZIZ;
        JFZ jfz = concurrentHashMap.get(str);
        if (jfz == null) {
            jfz = new JFZ();
            concurrentHashMap.put(str, jfz);
        }
        jfz.LIZ.put(cls, obj);
    }
}
