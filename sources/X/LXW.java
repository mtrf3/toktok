package X;

import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class LXW {
    public static boolean LIZ() {
        Boolean bool;
        if (!C1DH.LJIL()) {
            bool = Boolean.FALSE;
        } else if (LXV.LIZJ.get()) {
            bool = Boolean.valueOf(LXV.LIZIZ.get());
        } else if (LXV.LJI.get()) {
            bool = Boolean.valueOf(LXV.LJFF.get());
        } else if (LXV.LJII.get()) {
            bool = Boolean.valueOf(LXV.LJIIIIZZ.get());
        } else if (LXV.LJIIIZ.get()) {
            bool = Boolean.valueOf(LXV.LJIIJ.get());
        } else if (LXV.LJ.get()) {
            bool = Boolean.valueOf(LXV.LIZLLL.get());
        } else if (LXV.LJIIJJI.get()) {
            bool = Boolean.valueOf(LXV.LJIIL.get());
        } else if (LXV.LJIILIIL.get()) {
            bool = Boolean.valueOf(LXV.LJIILL.get(LXV.LJIILJJIL.LIZIZ()));
        } else if (LXV.LJIILLIIL.get()) {
            bool = Boolean.valueOf(LXV.LJIIZILJ.get());
        } else {
            bool = Boolean.FALSE;
        }
        o.LJIIIIZZ(bool, "isInFirstOrLastFeed()");
        return bool.booleanValue();
    }

    public static boolean LIZIZ() {
        Boolean valueOf;
        if (!C1DH.LJIL()) {
            valueOf = Boolean.TRUE;
        } else {
            valueOf = Boolean.valueOf(LXV.LIZ.get());
        }
        return !valueOf.booleanValue();
    }
}
