package X;

import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: classes10.dex */
public final class MNH {
    public static volatile int LIZJ;
    public static final MNH LIZ = new MNH();
    public static final CopyOnWriteArraySet<String> LIZIZ = new CopyOnWriteArraySet<>();
    public static String LIZLLL = "";

    public final void LIZIZ() {
        C198517qh c198517qh = new C198517qh();
        c198517qh.LIZ.put("total_unread_count", Integer.valueOf(LIZJ));
        CopyOnWriteArraySet<String> copyOnWriteArraySet = LIZIZ;
        c198517qh.LIZ.put("client_read_count", Integer.valueOf(copyOnWriteArraySet.size()));
        c198517qh.LIZ.put("position", LIZLLL);
        FMX.LJIILJJIL("activities_consumption", c198517qh.LJ());
        synchronized (this) {
            LIZJ = 0;
            copyOnWriteArraySet.clear();
        }
    }

    public final synchronized void LIZ(String str) {
        if (str != null) {
            LIZIZ.add(str);
        }
    }

    public final synchronized void LIZJ(int i, String str) {
        LIZJ = i;
        LIZLLL = str;
        LIZIZ.clear();
    }
}
