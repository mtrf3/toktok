package X;

import android.os.SystemClock;
import com.bytedance.globalpayment.iap.common.ability.model.OrderData;
import com.bytedance.globalpayment.iap.common.ability.model.enums.PayType;
import com.bytedance.globalpayment.iap.model.IapPaymentMethod;
import org.json.JSONObject;

/* renamed from: X.Uo7, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C78295Uo7 extends IO1 {
    public long LIZ;
    public final String LIZIZ;
    public String LIZJ;
    public final String LIZLLL;
    public final boolean LJ;
    public final int LJFF;
    public final OrderData LJI;

    public final void LIZ() {
        this.LIZ = SystemClock.uptimeMillis();
        JSONObject jSONObject = new JSONObject();
        add(jSONObject, "request_id", this.LIZJ);
        add(jSONObject, "product_id", this.LIZIZ);
        JSONObject jSONObject2 = new JSONObject();
        add(jSONObject2, "pay_type", this.LJFF);
        add(jSONObject2, "is_subscription", this.LJ);
        add(jSONObject2, "payment_method", this.LJI.getIapPaymentMethod().channelName);
        add(jSONObject2, "merchant_id", this.LIZLLL);
        if (this.LJI.getIapPayRequest() != null && this.LJI.getIapPayRequest().LJI != null) {
            addAll(jSONObject2, this.LJI.getIapPayRequest().LJI);
        }
        InterfaceC78267Unf LJFF = C78273Unl.LJIIIZ().LJFF();
        EnumC77751UfL enumC77751UfL = EnumC77751UfL.BOTH;
        C78263Unb c78263Unb = (C78263Unb) LJFF;
        c78263Unb.getClass();
        c78263Unb.LIZ(enumC77751UfL, "livesdk_iap_pay_start", jSONObject2, null, jSONObject);
    }

    public final void LIZIZ(C78368UpI c78368UpI, EnumC78373UpN enumC78373UpN) {
        long j;
        String str;
        C39670Fha LJ = C78273Unl.LJIIIZ().LJ();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("removeMessages with obj:");
        LIZ.append(this.LIZJ);
        X1D.LIZIZ(LIZ);
        LJ.getClass();
        if (this.LIZ > 0) {
            j = SystemClock.uptimeMillis() - this.LIZ;
        } else {
            j = 0;
        }
        this.LIZ = 0L;
        JSONObject jSONObject = new JSONObject();
        add(jSONObject, "result_code", c78368UpI.getCode());
        add(jSONObject, "result_detail_code", c78368UpI.getDetailCode());
        add(jSONObject, "result_message", c78368UpI.getMessage());
        add(jSONObject, "pay_type", this.LJFF);
        add(jSONObject, "is_subscription", this.LJ);
        add(jSONObject, "payment_method", this.LJI.getIapPaymentMethod().channelName);
        add(jSONObject, "merchant_id", this.LIZLLL);
        if (this.LJI.getIapPayRequest() != null && this.LJI.getIapPayRequest().LJI != null) {
            addAll(jSONObject, this.LJI.getIapPayRequest().LJI);
        }
        if (this.LJI.getIapPaymentMethod().channelName.equals(IapPaymentMethod.GOOGLE.channelName)) {
            add(jSONObject, "billing_version", C79146V4k.LIZLLL);
            C78273Unl.LJIIIZ().LIZLLL().getClass();
            boolean z = true;
            if (C73994T2g.LJIILLIIL("iap_exp_google_billing_new", 1) != 1) {
                z = false;
            }
            add(jSONObject, "billing_version_exp", z);
        }
        if (enumC78373UpN != null) {
            add(jSONObject, "pay_state", enumC78373UpN.name());
        } else {
            add(jSONObject, "pay_state", "unknown");
        }
        JSONObject jSONObject2 = new JSONObject();
        add(jSONObject2, "time_consuming", j);
        JSONObject jSONObject3 = new JSONObject();
        add(jSONObject3, "request_id", this.LIZJ);
        add(jSONObject3, "product_id", this.LIZIZ);
        InterfaceC78267Unf LJFF = C78273Unl.LJIIIZ().LJFF();
        EnumC77751UfL enumC77751UfL = EnumC77751UfL.BOTH;
        if (c78368UpI.isSuccess()) {
            str = "livesdk_iap_finish_order_sucess";
        } else {
            str = "livesdk_iap_finish_order_failed";
        }
        C78263Unb c78263Unb = (C78263Unb) LJFF;
        c78263Unb.getClass();
        c78263Unb.LIZ(enumC77751UfL, str, jSONObject, jSONObject2, jSONObject3);
    }

    public C78295Uo7(OrderData orderData, PayType payType, String str, String str2, boolean z) {
        C16880lQ.LJLLJ(C78295Uo7.class);
        this.LIZ = 0L;
        this.LIZLLL = "";
        this.LIZIZ = str;
        this.LIZJ = str2;
        this.LJ = z;
        if (payType == null) {
            this.LJFF = -1;
        } else {
            this.LJFF = payType.ordinal();
        }
        this.LJI = orderData;
        if (orderData.getIapPayRequest() != null && orderData.getIapPayRequest().LIZIZ != null) {
            this.LIZLLL = orderData.getIapPayRequest().LIZIZ;
        }
    }
}
