package X;

import androidx.lifecycle.Observer;

/* renamed from: X.Cta, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32770Cta<T> implements Observer {
    public final /* synthetic */ C32691CsJ LJLIL;
    public final /* synthetic */ C32721Csn LJLILLLLZI;
    public final /* synthetic */ int LJLJI;

    public C32770Cta(C32691CsJ c32691CsJ, C32721Csn c32721Csn, int i) {
        this.LJLIL = c32691CsJ;
        this.LJLILLLLZI = c32721Csn;
        this.LJLJI = i;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        this.LJLIL.LJLLLLLL(this.LJLILLLLZI, this.LJLJI, (EnumC32736Ct2) obj);
    }
}
