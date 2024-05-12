package X;

import com.bytedance.globalpayment.iap.model.IapPaymentMethod;
import defpackage.b1;
import java.util.ArrayList;
import java.util.Collections;

/* renamed from: X.Uq0, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C78412Uq0 implements InterfaceC78437UqP {
    public final /* synthetic */ InterfaceC78382UpW LIZ;
    public final /* synthetic */ C78408Upw LIZIZ;

    @Override // X.InterfaceC78437UqP
    public final void LIZIZ() {
        C78408Upw c78408Upw = this.LIZIZ;
        InterfaceC78382UpW interfaceC78382UpW = this.LIZ;
        c78408Upw.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        c78408Upw.LJII.clear();
        C04880Hc c04880Hc = new C04880Hc();
        c04880Hc.LIZ = "inapp";
        C04900He LIZ = c04880Hc.LIZ();
        C1FD c1fd = c78408Upw.LJIIJJI;
        C78422UqA c78422UqA = new C78422UqA(c78408Upw, currentTimeMillis, interfaceC78382UpW);
        c1fd.getClass();
        c1fd.LJIIL(LIZ.LIZ, c78422UqA);
        C04880Hc c04880Hc2 = new C04880Hc();
        c04880Hc2.LIZ = "subs";
        C04900He LIZ2 = c04880Hc2.LIZ();
        int i = c78408Upw.LJIIJJI.LIZLLL("subscriptions").LIZ;
        if (i != 0) {
            C39670Fha LJ = C78273Unl.LJIIIZ().LJ();
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("areSubscriptionsSupported() got an error response code : ");
            LIZ3.append(i);
            X1D.LIZIZ(LIZ3);
            LJ.getClass();
            b1.LIZLLL();
            return;
        }
        C1FD c1fd2 = c78408Upw.LJIIJJI;
        C78420Uq8 c78420Uq8 = new C78420Uq8(c78408Upw, currentTimeMillis);
        c1fd2.getClass();
        c1fd2.LJIIL(LIZ2.LIZ, c78420Uq8);
    }

    @Override // X.InterfaceC78437UqP
    public final void LIZ(C78368UpI c78368UpI) {
        InterfaceC78382UpW interfaceC78382UpW = this.LIZ;
        if (interfaceC78382UpW != null) {
            interfaceC78382UpW.onQueryFinished(IapPaymentMethod.GOOGLE, c78368UpI, Collections.emptyList());
        }
        C78332Uoi.LIZJ().LIZLLL(c78368UpI.toString(), "BillingSetUpFailed", new ArrayList(), false);
    }

    public C78412Uq0(C78408Upw c78408Upw, InterfaceC78382UpW interfaceC78382UpW) {
        this.LIZIZ = c78408Upw;
        this.LIZ = interfaceC78382UpW;
    }
}
