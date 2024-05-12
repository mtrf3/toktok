package X;

import java.util.concurrent.TimeUnit;

/* loaded from: classes7.dex */
public final class FGW {
    public static final FGW LIZ = new FGW();
    public static final C62822Ol8 LIZIZ = C221108m2.LIZIZ(FGX.LJLIL);
    public static boolean LIZJ;

    public static void LIZ() {
        C62822Ol8 c62822Ol8 = LIZIZ;
        if (((Number) c62822Ol8.getValue()).longValue() <= 0) {
            return;
        }
        synchronized (LIZ) {
            if (LIZJ) {
                return;
            }
            LIZJ = true;
            C38995FSd.LJ().schedule(FGV.LJLIL, ((Number) c62822Ol8.getValue()).longValue(), TimeUnit.MILLISECONDS);
        }
    }
}
