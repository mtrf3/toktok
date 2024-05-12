package X;

import android.app.Activity;
import android.content.Context;
import java.lang.ref.WeakReference;

/* loaded from: classes15.dex */
public final class VL7 {
    public static final C62822Ol8 LIZ = C221108m2.LIZIZ(C57242Mm.LJLIL);
    public static final C62822Ol8 LIZIZ = C221108m2.LIZIZ(C2RI.LJLIL);
    public static final C62822Ol8 LIZJ = C221108m2.LIZIZ(VL5.LJLIL);
    public static final C62822Ol8 LIZLLL = C221108m2.LIZIZ(VL6.LJLIL);
    public static final C62822Ol8 LJ = C221108m2.LIZIZ(VL9.LJLIL);
    public static boolean LJFF;
    public static boolean LJI;
    public static C55537Lqv LJII;
    public static Runnable LJIIIIZZ;

    public static final boolean LIZ() {
        return ((Boolean) LJ.getValue()).booleanValue();
    }

    public static final void LIZIZ(Runnable runnable, boolean z) {
        if (!z || !LIZ() || LJFF) {
            runnable.run();
            return;
        }
        if (((Boolean) LIZJ.getValue()).booleanValue()) {
            C55537Lqv c55537Lqv = LJII;
            if (c55537Lqv == null) {
                runnable.run();
            } else {
                c55537Lqv.LIZLLL();
                LJIIIIZZ = runnable;
            }
        }
    }

    public static final void LIZJ(Context context, boolean z) {
        if (!z || !LIZ() || LJI || LJFF) {
            return;
        }
        LJI = true;
        Activity LJIJJ = C45804HyK.LJIJJ(context);
        if (LJIJJ == null) {
            return;
        }
        C16970lZ.LJFF(LJIJJ, "common_feed_item_feed");
        if (!((Boolean) LIZJ.getValue()).booleanValue()) {
            return;
        }
        LJII = new C55537Lqv(new WeakReference(LJIJJ), "common_feed_item_feed", VL8.LJLIL);
    }
}
