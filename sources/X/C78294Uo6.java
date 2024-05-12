package X;

import android.os.SystemClock;
import com.bytedance.globalpayment.iap.common.ability.model.OrderData;
import com.bytedance.globalpayment.iap.common.ability.model.enums.PayType;
import com.bytedance.globalpayment.iap.model.AbsResult;
import org.json.JSONObject;

/* renamed from: X.Uo6, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C78294Uo6 extends IO1 {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final boolean LIZLLL;
    public final int LJ;
    public final long LJFF;
    public long LJI;
    public final OrderData LJII;

    public final void LIZ() {
        this.LJI = SystemClock.uptimeMillis();
        JSONObject jSONObject = new JSONObject();
        add(jSONObject, "product_id", this.LIZ);
        add(jSONObject, "request_id", this.LIZIZ);
        JSONObject jSONObject2 = new JSONObject();
        add(jSONObject2, "pay_type", this.LJ);
        add(jSONObject2, "is_subscription", this.LIZLLL);
        add(jSONObject2, "payment_method", this.LJII.getIapPaymentMethod().channelName);
        add(jSONObject2, "merchant_id", this.LIZJ);
        if (this.LJII.getIapPayRequest() != null && this.LJII.getIapPayRequest().LJI != null) {
            addAll(jSONObject2, this.LJII.getIapPayRequest().LJI);
        }
        JSONObject jSONObject3 = new JSONObject();
        long j = 0;
        if (this.LJFF > 0) {
            j = SystemClock.uptimeMillis() - this.LJFF;
        }
        add(jSONObject3, "time_consuming", j);
        InterfaceC78267Unf LJFF = C78273Unl.LJIIIZ().LJFF();
        EnumC77751UfL enumC77751UfL = EnumC77751UfL.BOTH;
        C78263Unb c78263Unb = (C78263Unb) LJFF;
        c78263Unb.getClass();
        c78263Unb.LIZ(enumC77751UfL, "livesdk_iap_inner_create_order_start", jSONObject2, jSONObject3, jSONObject);
    }

    public final void LIZIZ(boolean z, AbsResult absResult) {
        long j;
        String str;
        long j2 = 0;
        if (this.LJI > 0) {
            j = SystemClock.uptimeMillis() - this.LJI;
        } else {
            j = 0;
        }
        this.LJI = 0L;
        JSONObject jSONObject = new JSONObject();
        if (!z) {
            j2 = 1;
        }
        add(jSONObject, "status", j2);
        add(jSONObject, "pay_type", this.LJ);
        add(jSONObject, "is_subscription", this.LIZLLL);
        add(jSONObject, "payment_method", this.LJII.getIapPaymentMethod().channelName);
        add(jSONObject, "merchant_id", this.LIZJ);
        if (absResult != null) {
            add(jSONObject, "result_code", absResult.getCode());
            add(jSONObject, "result_detail_code", absResult.getDetailCode());
            add(jSONObject, "result_message", absResult.getMessage());
        } else {
            add(jSONObject, "result_code", -1L);
            add(jSONObject, "result_detail_code", -1L);
            add(jSONObject, "result_message", "unknown");
        }
        if (this.LJII.getIapPayRequest() != null && this.LJII.getIapPayRequest().LJI != null) {
            addAll(jSONObject, this.LJII.getIapPayRequest().LJI);
        }
        JSONObject jSONObject2 = new JSONObject();
        add(jSONObject2, "time_consuming", j);
        JSONObject jSONObject3 = new JSONObject();
        add(jSONObject3, "product_id", this.LIZ);
        add(jSONObject3, "request_id", this.LIZIZ);
        InterfaceC78267Unf LJFF = C78273Unl.LJIIIZ().LJFF();
        EnumC77751UfL enumC77751UfL = EnumC77751UfL.BOTH;
        if (z) {
            str = "livesdk_iap_create_order_success";
        } else {
            str = "livesdk_iap_create_order_fail";
        }
        C78263Unb c78263Unb = (C78263Unb) LJFF;
        c78263Unb.getClass();
        c78263Unb.LIZ(enumC77751UfL, str, jSONObject, jSONObject2, jSONObject3);
    }

    public C78294Uo6(String str, String str2, boolean z, PayType payType, long j, OrderData orderData) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZLLL = z;
        this.LJII = orderData;
        if (payType == null) {
            this.LJ = -1;
        } else {
            this.LJ = payType.ordinal();
        }
        if (orderData.getIapPayRequest() != null && orderData.getIapPayRequest().LIZIZ != null) {
            this.LIZJ = orderData.getIapPayRequest().LIZIZ;
        }
        this.LJFF = j;
    }
}
