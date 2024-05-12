package X;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: classes12.dex */
public final class PGR {
    public static volatile PGR LIZJ;
    public final CopyOnWriteArraySet<String> LIZ = new CopyOnWriteArraySet<>();
    public final ConcurrentHashMap<String, String> LIZIZ = new ConcurrentHashMap<>();

    public static PGR LIZ() {
        if (LIZJ == null) {
            synchronized (PGR.class) {
                if (LIZJ == null) {
                    LIZJ = new PGR();
                }
            }
        }
        return LIZJ;
    }
}
