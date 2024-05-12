package X;

import android.app.Activity;
import android.app.Application;
import android.os.SystemClock;
import android.text.TextUtils;
import com.amazon.device.iap.PurchasingService;
import com.amazon.device.iap.model.PurchaseResponse;
import com.bytedance.globalpayment.iap.common.ability.model.OrderData;
import com.bytedance.globalpayment.iap.model.IapPaymentMethod;
import com.bytedance.globalpayment.payment.common.lib.settings.PaymentLocalSettings;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.UoJ, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C78307UoJ extends AbstractC78349Uoz {
    public final String LIZLLL;
    public final HandlerC78309UoL LJ;
    public final Activity LJFF;

    @Override // X.AbstractC78349Uoz
    public final EnumC78373UpN LIZJ() {
        return EnumC78373UpN.AmazonPay;
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
        C39670Fha LJ2 = C78273Unl.LJIIIZ().LJ();
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("start launch amazon pay, productId:");
        LIZ2.append(orderData.getProductId());
        X1D.LIZIZ(LIZ2);
        LJ2.getClass();
        C78305UoH c78305UoH = new C78305UoH(orderData.getProductId(), orderData.getOrderId(), orderData.getIapPayRequest().LJII, this.LIZ.getPayType(), orderData.getIapPayRequest().LJI);
        c78305UoH.LJ = SystemClock.uptimeMillis();
        JSONObject jSONObject = new JSONObject();
        c78305UoH.add(jSONObject, "product_id", c78305UoH.LIZ);
        c78305UoH.add(jSONObject, "request_id", c78305UoH.LIZIZ);
        JSONObject jSONObject2 = new JSONObject();
        c78305UoH.add(jSONObject2, "pay_type", c78305UoH.LIZLLL);
        c78305UoH.add(jSONObject2, "is_subscription", c78305UoH.LIZJ);
        c78305UoH.add(jSONObject2, "payment_method", IapPaymentMethod.AMAZON.channelName);
        c78305UoH.addAll(jSONObject2, c78305UoH.LJIIIIZZ);
        InterfaceC78267Unf LJFF = C78273Unl.LJIIIZ().LJFF();
        EnumC77751UfL enumC77751UfL = EnumC77751UfL.BOTH;
        C78263Unb c78263Unb = (C78263Unb) LJFF;
        c78263Unb.getClass();
        c78263Unb.LIZ(enumC77751UfL, "livesdk_iap_add_payment", jSONObject2, null, jSONObject);
        Application application = ((C78261UnZ) C78273Unl.LJIIIZ().LIZ()).LIZ.LIZ;
        int i = orderData.getIapPayRequest().LJIILJJIL;
        if (application != null) {
            C77875UhL.LJ(i, application, orderData.getProductId(), orderData.getOrderId(), orderData.getIapPayRequest().LIZIZ, orderData.getIapPayRequest().LJ, orderData.getIapPayRequest().LJIIJ);
        }
        String productId = orderData.getProductId();
        C78273Unl.LJIIIZ().LJIIIIZZ();
        PaymentLocalSettings LIZIZ = C78301UoD.LIZIZ();
        String LJJII = LIZIZ.LJJII();
        try {
            JSONObject jSONObject3 = new JSONObject();
            if (!TextUtils.isEmpty(LJJII)) {
                jSONObject3 = new JSONObject(LJJII);
            }
            jSONObject3.put(productId, orderData.toJson());
            LIZIZ.LJIJJ(jSONObject3.toString());
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
        }
        JSONObject jSONObject4 = new JSONObject();
        if (orderData.getIapPaymentMethod() != null) {
            try {
                jSONObject4.put("paymentMethod", orderData.getIapPaymentMethod().channelName);
            } catch (Throwable unused) {
            }
        }
        if (orderData.getPayType() != null) {
            try {
                jSONObject4.put("payType", orderData.getPayType().toString());
            } catch (Throwable unused2) {
            }
        }
        try {
            jSONObject4.put("orderFromOtherSystem", orderData.isOrderFromOtherSystem());
        } catch (Throwable unused3) {
        }
        JSONObject jSONObject5 = new JSONObject();
        try {
            jSONObject5.put("startPayTimeStamp", orderData.getStartPayTimeStamp());
        } catch (Throwable unused4) {
        }
        JSONObject jSONObject6 = new JSONObject();
        try {
            jSONObject6.put("productId", productId);
        } catch (Throwable unused5) {
        }
        try {
            jSONObject6.put("cacheOrder", orderData.toJson());
        } catch (Throwable unused6) {
        }
        InterfaceC78267Unf LJFF2 = C78273Unl.LJIIIZ().LJFF();
        EnumC77751UfL enumC77751UfL2 = EnumC77751UfL.MONITOR;
        C78263Unb c78263Unb2 = (C78263Unb) LJFF2;
        c78263Unb2.getClass();
        c78263Unb2.LIZ(enumC77751UfL2, "livesdk_iap_add_order_to_cache", jSONObject4, jSONObject5, jSONObject6);
        C78345Uov LIZJ = C78345Uov.LIZJ();
        String productId2 = orderData.getProductId();
        C78310UoM c78310UoM = new C78310UoM(this, c78305UoH);
        LIZJ.getClass();
        String requestId = PurchasingService.purchase(productId2).toString();
        if (!TextUtils.isEmpty(requestId)) {
            PurchaseResponse purchaseResponse = (PurchaseResponse) ((HashMap) LIZJ.LIZIZ).get(requestId);
            if (purchaseResponse != null) {
                c78310UoM.LIZ(new C78331Uoh(purchaseResponse));
                ((HashMap) LIZJ.LIZIZ).remove(requestId);
            } else {
                ((HashMap) LIZJ.LIZ).put(requestId, c78310UoM);
            }
        }
    }

    public C78307UoJ(InterfaceC78388Upc interfaceC78388Upc, Activity activity) {
        super(interfaceC78388Upc);
        this.LIZLLL = C16880lQ.LJLLJ(C78307UoJ.class);
        this.LJFF = activity;
        this.LJ = new HandlerC78309UoL();
    }
}
