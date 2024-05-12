package X;

import Y.ARunnableS51S0100000_15;
import kotlin.jvm.internal.o;

/* renamed from: X.XvA, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C86376XvA {
    public final C86369Xv3 LIZ;
    public int LIZIZ;
    public int LIZJ;
    public int LIZLLL;
    public final boolean LJ;
    public boolean LJFF;
    public int LJI;
    public int LJII;
    public final ARunnableS51S0100000_15 LJIIIIZZ;

    public final void LIZ() {
        if (this.LJFF) {
            this.LJFF = false;
            if (this.LJ) {
                this.LIZ.scrollBy(this.LJII, 0);
            } else {
                this.LIZ.scrollBy(-this.LJII, 0);
            }
            this.LJII = 0;
        }
    }

    public C86376XvA(C86369Xv3 targetView) {
        o.LJIIIZ(targetView, "targetView");
        this.LIZ = targetView;
        this.LIZIZ = C17N.LJIILL(40.0d);
        this.LIZJ = 2;
        this.LJ = C26338AVi.LIZLLL(targetView);
        this.LJIIIIZZ = new ARunnableS51S0100000_15(this, 29);
    }
}
