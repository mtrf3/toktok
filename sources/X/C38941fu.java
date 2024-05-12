package X;

import android.view.View;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.1fu, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C38941fu extends C0P4 implements C0PF {
    public int LIZJ;
    public boolean LIZLLL;
    public C0PI LJ;
    public boolean LJFF;
    public int LJI;
    public boolean LJII;
    public int LJIIIIZZ;
    public boolean LJIIIZ;
    public final /* synthetic */ C15J LJIIJ;

    public C38941fu(C15J c15j) {
        this.LJIIJ = c15j;
    }

    @Override // X.C0P4
    public final void LIZIZ(C0PA animation) {
        o.LJIIIZ(animation, "animation");
        if (this.LIZLLL && (animation.LIZ() & 8) != 0) {
            this.LIZLLL = false;
            if (this.LJII) {
                this.LJIIIZ = false;
                this.LJIIJ.getClass();
            }
        }
    }

    @Override // X.C0P4
    public final void LIZJ(C0PA c0pa) {
        if ((c0pa.LIZ() & 8) != 0) {
            this.LIZLLL = true;
        }
    }

    @Override // X.C0PF
    public final C0PI LIZ(View v, C0PI c0pi) {
        boolean LJIILIIL;
        int i;
        C06920Oy LIZ;
        o.LJIIIZ(v, "v");
        C0PI c0pi2 = this.LJ;
        int i2 = 0;
        if (c0pi2 != null && (LIZ = c0pi2.LIZ(8)) != null && c0pi.LIZ(8).LIZLLL == LIZ.LIZLLL) {
            return c0pi;
        }
        int i3 = c0pi.LIZ(8).LIZLLL - c0pi.LIZ(2).LIZLLL;
        if (i3 < 0 || i3 <= 1) {
            i3 = 0;
        }
        this.LIZJ = i3;
        View view = this.LJIIJ.LIZIZ;
        if (view != null) {
            view.setPadding(c0pi.LIZ(7).LIZ, this.LJIIJ.LIZIZ.getPaddingTop(), c0pi.LIZ(7).LIZJ, c0pi.LIZ(2).LIZLLL);
        }
        if (this.LIZJ > 0) {
            LJIILIIL = true;
        } else {
            LJIILIIL = c0pi.LIZ.LJIILIIL();
        }
        this.LJFF = LJIILIIL;
        int i4 = this.LIZJ;
        if (i4 > 0) {
            this.LJIIIZ = false;
        } else if (LJIILIIL && i4 == 0) {
            this.LJIIIZ = true;
        }
        C15G c15g = this.LJIIJ.LIZ;
        if (c15g != null) {
            c15g.LLILLL(i4, LJIILIIL);
        } else {
            if (this.LIZLLL) {
                i = 2;
            } else {
                i = 10;
            }
            int i5 = c0pi.LIZ(2).LIZLLL;
            C06920Oy LIZ2 = c0pi.LIZ(i);
            o.LJIIIIZZ(LIZ2, "insets.getInsets(types)");
            int i6 = LIZ2.LIZLLL;
            if (i5 > 0) {
                i6 -= i5;
            }
            if (i6 >= 0) {
                i2 = i6;
            }
            if (this.LJI != i2) {
                this.LJIIJ.getClass();
                this.LJI = i2;
            }
        }
        this.LJ = c0pi;
        return c0pi;
    }

    @Override // X.C0P4
    public final C0PI LIZLLL(C0PI insets, List<C0PA> runningAnimations) {
        o.LJIIIZ(insets, "insets");
        o.LJIIIZ(runningAnimations, "runningAnimations");
        Iterator<C0PA> it = runningAnimations.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            if ((it.next().LIZ() & 8) != 0) {
                int i = insets.LIZ(8).LIZLLL - insets.LIZ(2).LIZLLL;
                int i2 = 0;
                if (i >= 0 && i > 1) {
                    i2 = i;
                }
                if (this.LIZJ != 0 || this.LJIIIZ || this.LJIIIIZZ != 0) {
                    this.LJIIIIZZ = i2;
                    this.LJII = !this.LJFF;
                    this.LJIIJ.getClass();
                }
            }
        }
        return insets;
    }

    @Override // X.C0P4
    public final C0P3 LJ(C0PA animation, C0P3 bounds) {
        o.LJIIIZ(animation, "animation");
        o.LJIIIZ(bounds, "bounds");
        if ((animation.LIZ() & 8) != 0) {
            this.LJII = false;
        }
        return bounds;
    }
}
