package X;

import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes12.dex */
public final class R2H {
    public static int LIZJ = -1;
    public static R2H LIZLLL;
    public final ConcurrentHashMap<String, R2J> LIZ = new ConcurrentHashMap<>();
    public final ConcurrentHashMap<String, List<String>> LIZIZ = new ConcurrentHashMap<>();

    public static R2H LIZ() {
        if (LIZLLL == null) {
            synchronized (R2H.class) {
                if (LIZLLL == null) {
                    LIZLLL = new R2H();
                }
            }
        }
        return LIZLLL;
    }
}
