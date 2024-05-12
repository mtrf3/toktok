package X;

import Y.AfS57S0100000_5;
import android.view.View;

/* renamed from: X.Cbq, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31670Cbq extends AbstractC32664Crs<C81392Vwy<InterfaceC81378Vwk>> {
    public final /* synthetic */ View LIZ;
    public final /* synthetic */ boolean LIZIZ;
    public final /* synthetic */ InterfaceC31672Cbs LIZJ;

    @Override // X.AbstractC32664Crs
    public final void LJ(W4W<C81392Vwy<InterfaceC81378Vwk>> w4w) {
        InterfaceC31672Cbs interfaceC31672Cbs = this.LIZJ;
        if (interfaceC31672Cbs != null) {
            interfaceC31672Cbs.LIZ(new RuntimeException());
        }
    }

    @Override // X.AbstractC32664Crs
    public final void LJFF(W4W<C81392Vwy<InterfaceC81378Vwk>> w4w) {
        if (w4w == null || !w4w.LIZIZ() || w4w.getResult() == null || w4w.getResult().LJI() == null) {
            return;
        }
        AbstractC73672Svk.LJJIJIL(w4w.getResult().LJI()).LJJL(T16.LIZ()).LJJIJL(new C31671Cbr()).LJII(new C62705OjF()).LJJJLIIL(new AfS57S0100000_5(this, 190), BTJ.LIZ);
    }

    public C31670Cbq(View view, boolean z, InterfaceC31672Cbs interfaceC31672Cbs) {
        this.LIZ = view;
        this.LIZIZ = z;
        this.LIZJ = interfaceC31672Cbs;
    }
}
