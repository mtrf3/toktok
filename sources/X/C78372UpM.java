package X;

import com.bytedance.globalpayment.iap.google.helper.RestoreOrderService;
import com.bytedance.globalpayment.iap.model.IapPaymentMethod;

/* renamed from: X.UpM, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public class C78372UpM implements InterfaceC78437UqP {
    public final /* synthetic */ C78408Upw LIZ;

    @Override // X.InterfaceC78437UqP
    public final void LIZIZ() {
        this.LIZ.LJIIL.onPurchasesUpdated(null, null);
        RestoreOrderService.getIns(((C78261UnZ) C78273Unl.LJIIIZ().LIZ()).LIZ.LIZ);
        if (((C78301UoD) C78273Unl.LJIIIZ().LJIIIIZZ()).LIZLLL()) {
            return;
        }
        C78273Unl.LJIIIZ().LJ().getClass();
    }

    public C78372UpM(C78408Upw c78408Upw) {
        this.LIZ = c78408Upw;
    }

    @Override // X.InterfaceC78437UqP
    public final void LIZ(C78368UpI c78368UpI) {
        this.LIZ.LJIIL.onQueryFinished(IapPaymentMethod.GOOGLE, null, null);
        C78273Unl.LJIIIZ().LJ().getClass();
    }
}
