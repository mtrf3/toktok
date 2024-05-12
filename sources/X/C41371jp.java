package X;

import android.view.WindowInsets;

/* renamed from: X.1jp, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C41371jp extends C30651If {
    public C06920Oy LJIILJJIL;

    @Override // X.C0PE
    public final C0PI LIZIZ() {
        return C0PI.LIZJ(null, this.LIZLLL.consumeStableInsets());
    }

    @Override // X.C0PE
    public final C0PI LIZJ() {
        return C0PI.LIZJ(null, this.LIZLLL.consumeSystemWindowInsets());
    }

    @Override // X.C0PE
    public final C06920Oy LJII() {
        if (this.LJIILJJIL == null) {
            this.LJIILJJIL = C06920Oy.LIZIZ(this.LIZLLL.getStableInsetLeft(), this.LIZLLL.getStableInsetTop(), this.LIZLLL.getStableInsetRight(), this.LIZLLL.getStableInsetBottom());
        }
        return this.LJIILJJIL;
    }

    @Override // X.C0PE
    public final boolean LJIIJJI() {
        return this.LIZLLL.isConsumed();
    }

    @Override // X.C0PE
    public void LJIILLIIL(C06920Oy c06920Oy) {
        this.LJIILJJIL = c06920Oy;
    }

    public C41371jp(C0PI c0pi, WindowInsets windowInsets) {
        super(c0pi, windowInsets);
    }
}
