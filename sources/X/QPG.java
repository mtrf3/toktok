package X;

import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes12.dex */
public final class QPG {
    public static final java.util.Map<Class, QPA> LIZ = new ConcurrentHashMap();

    public static <T extends QPA> T LIZ(Class<T> cls) {
        return (T) ((ConcurrentHashMap) LIZ).get(cls);
    }

    public static <T extends QPA> void LIZIZ(Class<T> cls, QPA qpa) {
        if (qpa != null) {
            ((ConcurrentHashMap) LIZ).put(cls, qpa);
        }
    }
}
