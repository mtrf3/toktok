package X;

import com.bytedance.globalpayment.iap.google.helper.RestoreOrderService;
import com.bytedance.globalpayment.iap.model.IapPaymentMethod;

/* renamed from: X.UpL, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public class C78371UpL implements InterfaceC78437UqP {
    public final /* synthetic */ C78407Upv LIZ;

    @Override // X.InterfaceC78437UqP
    public final void LIZIZ() {
        this.LIZ.LJIIL.onPurchasesUpdated(null, null);
        RestoreOrderService.getIns(((C78261UnZ) C78273Unl.LJIIIZ().LIZ()).LIZ.LIZ);
        if (((C78301UoD) C78273Unl.LJIIIZ().LJIIIIZZ()).LIZLLL()) {
            return;
        }
        C78273Unl.LJIIIZ().LJ().getClass();
    }

    public C78371UpL(C78407Upv c78407Upv) {
        this.LIZ = c78407Upv;
    }

    @Override // X.InterfaceC78437UqP
    public final void LIZ(C78368UpI c78368UpI) {
        this.LIZ.LJIIL.onQueryFinished(IapPaymentMethod.GOOGLE, null, null);
        C78273Unl.LJIIIZ().LJ().getClass();
    }
}
