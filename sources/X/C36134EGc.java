package X;

import androidx.lifecycle.MediatorLiveData;
import androidx.lifecycle.Observer;

/* JADX INFO: Add missing generic type declarations: [T] */
/* renamed from: X.EGc, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36134EGc<T> implements Observer<T> {
    public long LJLIL = -1;
    public XKQ LJLILLLLZI;
    public final /* synthetic */ InterfaceC88472Yns LJLJI;
    public final /* synthetic */ MediatorLiveData LJLJJI;
    public final /* synthetic */ InterfaceC70422pa LJLJJL;
    public final /* synthetic */ C68322mC LJLJJLL;
    public final /* synthetic */ InterfaceC88472Yns LJLJL;

    @Override // androidx.lifecycle.Observer
    public final void onChanged(T t) {
        XKQ xkq = this.LJLILLLLZI;
        if (xkq != null) {
            xkq.LIZIZ(null);
        }
        if (((Boolean) this.LJLJI.invoke(t)).booleanValue() && this.LJLIL > 0) {
            long LIZLLL = C74216TAu.LIZIZ.LIZLLL() - (System.currentTimeMillis() - this.LJLIL);
            this.LJLIL = -1L;
            if (LIZLLL < 0) {
                this.LJLJJI.setValue(t);
                return;
            } else {
                this.LJLILLLLZI = XKX.LIZLLL(this.LJLJJL, null, null, new C36132EGa(this, LIZLLL, t, null), 3);
                return;
            }
        }
        if (((Boolean) this.LJLJL.invoke(t)).booleanValue()) {
            this.LJLIL = System.currentTimeMillis();
        } else {
            this.LJLIL = -1L;
        }
        this.LJLJJI.setValue(t);
    }

    public C36134EGc(InterfaceC88472Yns interfaceC88472Yns, MediatorLiveData mediatorLiveData, InterfaceC70422pa interfaceC70422pa, C68322mC c68322mC, InterfaceC88472Yns interfaceC88472Yns2) {
        this.LJLJI = interfaceC88472Yns;
        this.LJLJJI = mediatorLiveData;
        this.LJLJJL = interfaceC70422pa;
        this.LJLJJLL = c68322mC;
        this.LJLJL = interfaceC88472Yns2;
    }
}
