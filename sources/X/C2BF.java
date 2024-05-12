package X;

import android.view.WindowInsets;

/* renamed from: X.2BF, reason: invalid class name */
/* loaded from: classes.dex */
public class C2BF extends C48321v2 {
    public C06920Oy LJIILL;
    public C06920Oy LJIILLIIL;
    public C06920Oy LJIIZILJ;

    @Override // X.C41371jp, X.C0PE
    public final void LJIILLIIL(C06920Oy c06920Oy) {
    }

    @Override // X.C0PE
    public final C06920Oy LJI() {
        if (this.LJIILLIIL == null) {
            this.LJIILLIIL = C06920Oy.LIZLLL(this.LIZLLL.getMandatorySystemGestureInsets());
        }
        return this.LJIILLIIL;
    }

    @Override // X.C0PE
    public final C06920Oy LJIIIIZZ() {
        if (this.LJIILL == null) {
            this.LJIILL = C06920Oy.LIZLLL(this.LIZLLL.getSystemGestureInsets());
        }
        return this.LJIILL;
    }

    @Override // X.C0PE
    public final C06920Oy LJIIJ() {
        if (this.LJIIZILJ == null) {
            this.LJIIZILJ = C06920Oy.LIZLLL(this.LIZLLL.getTappableElementInsets());
        }
        return this.LJIIZILJ;
    }

    public C2BF(C0PI c0pi, WindowInsets windowInsets) {
        super(c0pi, windowInsets);
    }
}
