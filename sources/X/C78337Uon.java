package X;

import android.app.Application;
import com.bytedance.globalpayment.iap.common.ability.model.OrderData;
import com.bytedance.globalpayment.iap.common.ability.model.enums.PayType;
import com.bytedance.globalpayment.service.manager.PaymentServiceManager;

/* renamed from: X.Uon, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C78337Uon extends AbstractC78335Uol {
    @Override // X.AbstractC78349Uoz
    public final EnumC78373UpN LIZJ() {
        return EnumC78373UpN.PreregisterQueryOrder;
    }

    public C78337Uon(InterfaceC78388Upc interfaceC78388Upc) {
        super(interfaceC78388Upc);
        C16880lQ.LJLLJ(C78337Uon.class);
    }

    @Override // X.AbstractC78349Uoz
    public final void LIZ(OrderData orderData) {
        this.LIZ = orderData;
        if (orderData.isCanceled() || orderData.isFinished()) {
            return;
        }
        String orderId = orderData.getOrderId();
        C77874UhK iapPayRequest = orderData.getIapPayRequest();
        String productId = orderData.getProductId();
        String str = iapPayRequest.LIZIZ;
        Application application = ((C78261UnZ) C78273Unl.LJIIIZ().LIZ()).LIZ.LIZ;
        if (application != null) {
            C78273Unl.LJIIIZ().LIZLLL().getClass();
            if (!C73994T2g.LJIL()) {
                PaymentServiceManager.get().getGoogleIapExternalService().getPayloadPreferencesService().addQueryOrderParam(application, productId, orderId, str, orderData.getUserId(), iapPayRequest.LJII, iapPayRequest.LJIIJ, orderData.isNewSubscription());
            }
        }
        C39670Fha LJ = C78273Unl.LJIIIZ().LJ();
        StringBuilder LIZIZ = C25620zW.LIZIZ("PreregisterQueryOrderState: preregister query order state. productId:", productId, ", maxRetry:");
        LIZIZ.append(this.LIZLLL);
        X1D.LIZIZ(LIZIZ);
        LJ.getClass();
        this.LJ = new C78330Uog(orderData.getIapPaymentMethod(), productId, orderId, str, this.LIZLLL, orderData.getUserId(), iapPayRequest.LJII, PayType.PRE, orderData.getHost(), C78274Unm.LIZJ(iapPayRequest.LJIILJJIL, orderData.getIapPaymentMethod()), orderData.isNewSubscription());
        C78297Uo9 c78297Uo9 = new C78297Uo9(orderData, orderData.getPayType(), productId, orderId, orderData.getIapPayRequest().LJII);
        c78297Uo9.LIZ();
        this.LJ.LIZJ(new C78334Uok(this, c78297Uo9, this.LJFF));
    }
}
