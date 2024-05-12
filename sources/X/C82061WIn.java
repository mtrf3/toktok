package X;

import Y.AObjectS119S0200000_14;
import androidx.lifecycle.LifecycleOwner;

/* renamed from: X.WIn, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C82061WIn<T> implements InterfaceC29911Fj {
    public final /* synthetic */ C82064WIq LJLIL;
    public final /* synthetic */ WID LJLILLLLZI;
    public final /* synthetic */ C82622Wbi LJLJI;
    public final /* synthetic */ InterfaceC45921I0n LJLJJI;
    public final /* synthetic */ LifecycleOwner LJLJJL;

    public C82061WIn(C82064WIq c82064WIq, WID wid, C82622Wbi c82622Wbi, InterfaceC45921I0n interfaceC45921I0n, LifecycleOwner lifecycleOwner) {
        this.LJLIL = c82064WIq;
        this.LJLILLLLZI = wid;
        this.LJLJI = c82622Wbi;
        this.LJLJJI = interfaceC45921I0n;
        this.LJLJJL = lifecycleOwner;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        Boolean bool = (Boolean) obj;
        this.LJLIL.LJII = !bool.booleanValue();
        C81975WFf LJI = this.LJLILLLLZI.LJI();
        if (bool.booleanValue()) {
            ((InterfaceC82062WIo) this.LJLJI.LJ(InterfaceC82062WIo.class, null)).LLFF(LJI);
        } else {
            this.LJLJJI.qc().LIZIZ(this.LJLJJL, new AObjectS119S0200000_14(LJI, this.LJLJI, 15));
        }
    }
}
