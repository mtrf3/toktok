package X;

import android.view.WindowInsets;

/* renamed from: X.1mt, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C43271mt extends C1V3 {
    public C07310Ql LJIIL;

    @Override // X.C16770lF
    public C16800lI LIZIZ() {
        return C16800lI.LJIIJ(null, this.LIZJ.consumeStableInsets());
    }

    @Override // X.C16770lF
    public C16800lI LIZJ() {
        return C16800lI.LJIIJ(null, this.LIZJ.consumeSystemWindowInsets());
    }

    @Override // X.C16770lF
    public final C07310Ql LJIIIIZZ() {
        if (this.LJIIL == null) {
            this.LJIIL = C07310Ql.LIZIZ(this.LIZJ.getStableInsetLeft(), this.LIZJ.getStableInsetTop(), this.LIZJ.getStableInsetRight(), this.LIZJ.getStableInsetBottom());
        }
        return this.LJIIL;
    }

    @Override // X.C16770lF
    public boolean LJIILIIL() {
        return this.LIZJ.isConsumed();
    }

    @Override // X.C16770lF
    public void LJIJI(C07310Ql c07310Ql) {
        this.LJIIL = c07310Ql;
    }

    public C43271mt(C16800lI c16800lI, C43271mt c43271mt) {
        super(c16800lI, c43271mt);
        this.LJIIL = c43271mt.LJIIL;
    }

    public C43271mt(C16800lI c16800lI, WindowInsets windowInsets) {
        super(c16800lI, windowInsets);
    }
}
