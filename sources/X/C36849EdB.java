package X;

import java.util.concurrent.ExecutorService;

/* renamed from: X.EdB, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36849EdB {
    public static volatile C36849EdB LIZ;
    public static ExecutorService LIZIZ;
    public static InterfaceC36618EYs LIZJ;
    public static int LIZLLL;
    public static long LJ;
    public static long LJFF;

    public static C36849EdB LIZ() {
        if (LIZ == null) {
            synchronized (C36849EdB.class) {
                if (LIZ == null) {
                    LIZ = new C36849EdB();
                }
            }
        }
        return LIZ;
    }
}
