package X;

import Y.ARunnableS11S0101000_7;

/* renamed from: X.Liv, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C55041Liv {
    public static volatile C55041Liv LJ;
    public boolean LIZ;
    public boolean LIZIZ;
    public boolean LIZJ;
    public ARunnableS11S0101000_7 LIZLLL;

    public final void LIZ(boolean z) {
        if (this.LIZIZ == z) {
            return;
        }
        if (z) {
            C40443Fu3.LIZ("feed_scroll").start();
        } else {
            C40443Fu3.LIZ("feed_scroll").stop();
        }
        this.LIZIZ = z;
    }

    public final void LIZIZ(boolean z) {
        if (this.LIZ == z) {
            return;
        }
        if (z) {
            C40443Fu3.LIZ("feed_selected").start();
        } else {
            C40443Fu3.LIZ("feed_selected").stop();
        }
        this.LIZ = z;
    }
}
