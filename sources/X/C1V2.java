package X;

import android.view.WindowInsets;

/* renamed from: X.1V2, reason: invalid class name */
/* loaded from: classes.dex */
public class C1V2 extends C16760lE {
    public final WindowInsets.Builder LIZIZ;

    public C1V2() {
        this.LIZIZ = new WindowInsets.Builder();
    }

    @Override // X.C16760lE
    public C16800lI LIZIZ() {
        C16760lE.LIZ();
        C16800lI LJIIJ = C16800lI.LJIIJ(null, this.LIZIZ.build());
        LJIIJ.LIZ.LJIILLIIL(null);
        return LJIIJ;
    }

    public C1V2(C16800lI c16800lI) {
        super(c16800lI);
        WindowInsets.Builder builder;
        WindowInsets LJIIIZ = c16800lI.LJIIIZ();
        if (LJIIIZ != null) {
            builder = new WindowInsets.Builder(LJIIIZ);
        } else {
            builder = new WindowInsets.Builder();
        }
        this.LIZIZ = builder;
    }

    @Override // X.C16760lE
    public void LIZJ(C07310Ql c07310Ql) {
        this.LIZIZ.setMandatorySystemGestureInsets(c07310Ql.LIZLLL());
    }

    @Override // X.C16760lE
    public void LIZLLL(C07310Ql c07310Ql) {
        this.LIZIZ.setStableInsets(c07310Ql.LIZLLL());
    }

    @Override // X.C16760lE
    public void LJ(C07310Ql c07310Ql) {
        this.LIZIZ.setSystemGestureInsets(c07310Ql.LIZLLL());
    }

    @Override // X.C16760lE
    public void LJFF(C07310Ql c07310Ql) {
        this.LIZIZ.setSystemWindowInsets(c07310Ql.LIZLLL());
    }

    @Override // X.C16760lE
    public void LJI(C07310Ql c07310Ql) {
        this.LIZIZ.setTappableElementInsets(c07310Ql.LIZLLL());
    }
}
