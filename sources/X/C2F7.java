package X;

import android.view.WindowInsets;

/* renamed from: X.2F7, reason: invalid class name */
/* loaded from: classes.dex */
public class C2F7 extends AnonymousClass223 {
    public C07310Ql LJIILIIL;
    public C07310Ql LJIILJJIL;
    public C07310Ql LJIILL;

    @Override // X.C43271mt, X.C16770lF
    public void LJIJI(C07310Ql c07310Ql) {
    }

    @Override // X.C16770lF
    public C07310Ql LJII() {
        if (this.LJIILJJIL == null) {
            this.LJIILJJIL = C07310Ql.LIZJ(this.LIZJ.getMandatorySystemGestureInsets());
        }
        return this.LJIILJJIL;
    }

    @Override // X.C16770lF
    public C07310Ql LJIIIZ() {
        if (this.LJIILIIL == null) {
            this.LJIILIIL = C07310Ql.LIZJ(this.LIZJ.getSystemGestureInsets());
        }
        return this.LJIILIIL;
    }

    @Override // X.C16770lF
    public C07310Ql LJIIJJI() {
        if (this.LJIILL == null) {
            this.LJIILL = C07310Ql.LIZJ(this.LIZJ.getTappableElementInsets());
        }
        return this.LJIILL;
    }

    public C2F7(C16800lI c16800lI, C2F7 c2f7) {
        super(c16800lI, c2f7);
    }

    public C2F7(C16800lI c16800lI, WindowInsets windowInsets) {
        super(c16800lI, windowInsets);
    }

    @Override // X.C1V3, X.C16770lF
    public C16800lI LJIIL(int i, int i2, int i3, int i4) {
        return C16800lI.LJIIJ(null, this.LIZJ.inset(i, i2, i3, i4));
    }
}
