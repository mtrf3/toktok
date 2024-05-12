package X;

import java.util.LinkedList;

/* loaded from: classes12.dex */
public final class QLV {
    public static volatile QLV LIZIZ;
    public final LinkedList<QLO> LIZ = new LinkedList<>();

    public static QLV LIZ() {
        if (LIZIZ == null) {
            synchronized (QLV.class) {
                if (LIZIZ == null) {
                    LIZIZ = new QLV();
                }
            }
        }
        return LIZIZ;
    }
}
