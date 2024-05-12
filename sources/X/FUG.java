package X;

import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: classes7.dex */
public final class FUG {
    public static volatile FUG LIZIZ;
    public final CopyOnWriteArraySet<FUF> LIZ = new CopyOnWriteArraySet<>();

    public static FUG LIZ() {
        if (LIZIZ == null) {
            synchronized (FUG.class) {
                if (LIZIZ == null) {
                    LIZIZ = new FUG();
                }
            }
        }
        return LIZIZ;
    }
}
