package X;

import android.app.Activity;
import android.app.Application;
import android.os.SystemClock;
import com.bytedance.globalpayment.iap.common.ability.model.OrderData;
import com.bytedance.globalpayment.iap.model.AbsIapProduct;
import com.bytedance.globalpayment.iap.model.IapPaymentMethod;
import com.bytedance.globalpayment.service.manager.PaymentServiceManager;
import java.util.HashMap;
import org.json.JSONObject;

/* renamed from: X.UoO, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C78312UoO extends AbstractC78349Uoz {
    public final String LIZLLL;
    public Activity LJ;
    public final HandlerC78313UoP LJFF;

    @Override // X.AbstractC78349Uoz
    public final EnumC78373UpN LIZJ() {
        return EnumC78373UpN.PerformPay;
    }

    @Override // X.AbstractC78349Uoz
    public final void LIZ(OrderData orderData) {
        this.LIZ = orderData;
        if (orderData.isCanceled() || orderData.isFinished()) {
            C39670Fha LJ = C78273Unl.LJIIIZ().LJ();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("execute failed:");
            LIZ.append(orderData.getProductId());
            X1D.LIZIZ(LIZ);
            LJ.getClass();
            return;
        }
        Activity activity = this.LJ;
        C39670Fha LJ2 = C78273Unl.LJIIIZ().LJ();
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("start launch google pay, productId:");
        LIZ2.append(orderData.getProductId());
        X1D.LIZIZ(LIZ2);
        LJ2.getClass();
        C78306UoI c78306UoI = new C78306UoI(orderData.getProductId(), orderData.getOrderId(), orderData.getIapPayRequest().LIZIZ, orderData.getIapPayRequest().LJII, this.LIZ.getPayType(), orderData.getIapPayRequest().LJI);
        c78306UoI.LIZ = SystemClock.uptimeMillis();
        JSONObject jSONObject = new JSONObject();
        c78306UoI.add(jSONObject, "product_id", c78306UoI.LJ);
        c78306UoI.add(jSONObject, "request_id", c78306UoI.LJFF);
        JSONObject jSONObject2 = new JSONObject();
        c78306UoI.add(jSONObject2, "pay_type", c78306UoI.LJIIIIZZ);
        c78306UoI.add(jSONObject2, "is_subscription", c78306UoI.LJII);
        c78306UoI.add(jSONObject2, "payment_method", IapPaymentMethod.GOOGLE.channelName);
        c78306UoI.add(jSONObject2, "merchant_id", c78306UoI.LJI);
        HashMap<String, ?> hashMap = c78306UoI.LJIIIZ;
        if (hashMap != null) {
            c78306UoI.addAll(jSONObject2, hashMap);
        }
        InterfaceC78267Unf LJFF = C78273Unl.LJIIIZ().LJFF();
        EnumC77751UfL enumC77751UfL = EnumC77751UfL.BOTH;
        C78263Unb c78263Unb = (C78263Unb) LJFF;
        c78263Unb.getClass();
        c78263Unb.LIZ(enumC77751UfL, "livesdk_iap_add_payment", jSONObject2, null, jSONObject);
        int i = orderData.getIapPayRequest().LJIILJJIL;
        Application application = ((C78261UnZ) C78273Unl.LJIIIZ().LIZ()).LIZ.LIZ;
        if (application != null) {
            C77875UhL.LJ(i, application, orderData.getProductId(), orderData.getOrderId(), orderData.getIapPayRequest().LIZIZ, orderData.getIapPayRequest().LJ, orderData.getIapPayRequest().LJIIJ);
        }
        if (PaymentServiceManager.get().getGoogleIapExternalService().isGoogleBillingNew()) {
            InterfaceC78376UpQ LJFF2 = C78408Upw.LJFF();
            String productId = orderData.getProductId();
            boolean z = orderData.getIapPayRequest().LJII;
            OrderData orderData2 = this.LIZ;
            ((C78408Upw) LJFF2).LJIIIIZZ(activity, productId, z, orderData2, new C78315UoR(this, c78306UoI, orderData2));
            return;
        }
        InterfaceC78376UpQ LIZLLL = C78407Upv.LIZLLL();
        String productId2 = orderData.getProductId();
        boolean z2 = orderData.getIapPayRequest().LJII;
        OrderData orderData3 = this.LIZ;
        ((C78407Upv) LIZLLL).LJI(activity, productId2, z2, orderData3, new C78315UoR(this, c78306UoI, orderData3));
    }

    public C78312UoO(InterfaceC78388Upc interfaceC78388Upc, Activity activity) {
        super(interfaceC78388Upc);
        this.LIZLLL = C16880lQ.LJLLILLLL(C78312UoO.class);
        this.LJ = activity;
        this.LJFF = new HandlerC78313UoP();
    }

    public final void LIZLLL(C78365UpF c78365UpF, AbsIapProduct absIapProduct) {
        OrderData orderData = this.LIZ;
        orderData.setAbsIapChannelOrderData(c78365UpF);
        orderData.setAbsIapProduct(absIapProduct);
        this.LIZ.setHost(c78365UpF.LIZJ);
        AbstractC78349Uoz nextState = PaymentServiceManager.get().getIapExternalService().getNextState(this);
        if (nextState != null) {
            nextState.LIZ(this.LIZ);
        }
    }
}
