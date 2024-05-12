package X;

import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes7.dex */
public final class F3A {
    public static volatile F3A LIZIZ;
    public final java.util.Map<String, java.util.Set<String>> LIZ = new ConcurrentHashMap();

    public static F3A LIZ() {
        if (LIZIZ == null) {
            synchronized (F3A.class) {
                if (LIZIZ == null) {
                    LIZIZ = new F3A();
                }
            }
        }
        return LIZIZ;
    }
}
