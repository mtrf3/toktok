package X;

import com.bytedance.globalpayment.iap.model.IapPaymentMethod;
import defpackage.b1;
import java.util.ArrayList;
import java.util.Collections;

/* renamed from: X.Uq3, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C78415Uq3 implements InterfaceC78437UqP {
    public final /* synthetic */ InterfaceC78382UpW LIZ;
    public final /* synthetic */ C78407Upv LIZIZ;

    @Override // X.InterfaceC78437UqP
    public final void LIZIZ() {
        C78407Upv c78407Upv = this.LIZIZ;
        InterfaceC78382UpW interfaceC78382UpW = this.LIZ;
        c78407Upv.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        c78407Upv.LJII.clear();
        c78407Upv.LJIIJJI.LJIIL("inapp", new C78421Uq9(c78407Upv, currentTimeMillis, interfaceC78382UpW));
        int i = c78407Upv.LJIIJJI.LIZLLL("subscriptions").LIZ;
        if (i != 0) {
            C39670Fha LJ = C78273Unl.LJIIIZ().LJ();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("areSubscriptionsSupported() got an error response code : ");
            LIZ.append(i);
            X1D.LIZIZ(LIZ);
            LJ.getClass();
            b1.LIZLLL();
            return;
        }
        c78407Upv.LJIIJJI.LJIIL("subs", new C78419Uq7(c78407Upv, currentTimeMillis));
    }

    @Override // X.InterfaceC78437UqP
    public final void LIZ(C78368UpI c78368UpI) {
        InterfaceC78382UpW interfaceC78382UpW = this.LIZ;
        if (interfaceC78382UpW != null) {
            interfaceC78382UpW.onQueryFinished(IapPaymentMethod.GOOGLE, c78368UpI, Collections.emptyList());
        }
        C78332Uoi.LIZJ().LIZLLL(c78368UpI.toString(), "BillingSetUpFailed", new ArrayList(), false);
    }

    public C78415Uq3(C78407Upv c78407Upv, InterfaceC78382UpW interfaceC78382UpW) {
        this.LIZIZ = c78407Upv;
        this.LIZ = interfaceC78382UpW;
    }
}
