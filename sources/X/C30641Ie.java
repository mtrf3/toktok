package X;

import android.view.WindowInsets;

/* renamed from: X.1Ie, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C30641Ie extends C0PD {
    public final WindowInsets.Builder LIZIZ;

    public C30641Ie() {
        this.LIZIZ = new WindowInsets.Builder();
    }

    @Override // X.C0PD
    public final C0PI LIZIZ() {
        LIZ();
        C0PI LIZJ = C0PI.LIZJ(null, this.LIZIZ.build());
        LIZJ.LIZ.LJIILJJIL(this.LIZ);
        return LIZJ;
    }

    public C30641Ie(C0PI c0pi) {
        WindowInsets.Builder builder;
        WindowInsets LIZIZ = c0pi.LIZIZ();
        if (LIZIZ != null) {
            builder = new WindowInsets.Builder(LIZIZ);
        } else {
            builder = new WindowInsets.Builder();
        }
        this.LIZIZ = builder;
    }

    @Override // X.C0PD
    public final void LIZLLL(C06920Oy c06920Oy) {
        this.LIZIZ.setMandatorySystemGestureInsets(c06920Oy.LJ());
    }

    @Override // X.C0PD
    public final void LJ(C06920Oy c06920Oy) {
        this.LIZIZ.setStableInsets(c06920Oy.LJ());
    }

    @Override // X.C0PD
    public final void LJFF(C06920Oy c06920Oy) {
        this.LIZIZ.setSystemGestureInsets(c06920Oy.LJ());
    }

    @Override // X.C0PD
    public final void LJI(C06920Oy c06920Oy) {
        this.LIZIZ.setSystemWindowInsets(c06920Oy.LJ());
    }

    @Override // X.C0PD
    public final void LJII(C06920Oy c06920Oy) {
        this.LIZIZ.setTappableElementInsets(c06920Oy.LJ());
    }
}
