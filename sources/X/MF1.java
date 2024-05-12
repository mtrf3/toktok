package X;

import java.util.HashSet;

/* loaded from: classes10.dex */
public final class MF1 {
    public static MF1 LIZJ;
    public final java.util.Set<String> LIZ;
    public boolean LIZIZ;

    public static MF1 LIZ() {
        if (LIZJ == null) {
            synchronized (MF1.class) {
                if (LIZJ == null) {
                    LIZJ = new MF1();
                }
            }
        }
        return LIZJ;
    }

    public MF1() {
        new HashSet();
        this.LIZ = new HashSet();
        this.LIZIZ = false;
    }
}
