package X;

import android.os.SystemClock;
import com.bytedance.globalpayment.iap.common.ability.model.OrderData;
import com.bytedance.globalpayment.iap.common.ability.model.enums.PayType;
import org.json.JSONObject;

/* renamed from: X.UoA, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C78298UoA extends IO1 {
    public long LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final boolean LJ;
    public final int LJFF;
    public final OrderData LJI;

    public final void LIZ() {
        this.LIZ = SystemClock.uptimeMillis();
        JSONObject jSONObject = new JSONObject();
        add(jSONObject, "product_id", this.LIZIZ);
        add(jSONObject, "request_id", this.LIZJ);
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
        c78263Unb.LIZ(enumC77751UfL, "livesdk_iap_send_receipt", jSONObject2, null, jSONObject);
    }

    public final void LIZIZ(boolean z, C78368UpI c78368UpI, boolean z2) {
        long j;
        String str;
        String str2;
        long j2 = 0;
        if (this.LIZ > 0) {
            j = SystemClock.uptimeMillis() - this.LIZ;
        } else {
            j = 0;
        }
        this.LIZ = 0L;
        if (C78404Ups.LJLIL.equals(this.LIZJ)) {
            C78404Ups.LJLJI = j;
        }
        JSONObject jSONObject = new JSONObject();
        add(jSONObject, "pay_type", this.LJFF);
        if (!z) {
            j2 = 1;
        }
        add(jSONObject, "status", j2);
        add(jSONObject, "is_subscription", this.LJ);
        add(jSONObject, "payment_method", this.LJI.getIapPaymentMethod().channelName);
        add(jSONObject, "merchant_id", this.LIZLLL);
        if (c78368UpI != null) {
            add(jSONObject, "result_code", c78368UpI.getCode());
            add(jSONObject, "result_detail_code", c78368UpI.getDetailCode());
            add(jSONObject, "result_message", c78368UpI.getMessage());
        } else {
            add(jSONObject, "result_code", -1L);
            add(jSONObject, "result_detail_code", -1L);
            add(jSONObject, "result_message", "unknown");
        }
        if (this.LJI.getIapPayRequest() != null && this.LJI.getIapPayRequest().LJI != null) {
            addAll(jSONObject, this.LJI.getIapPayRequest().LJI);
        }
        JSONObject jSONObject2 = new JSONObject();
        add(jSONObject2, "time_consuming", j);
        JSONObject jSONObject3 = new JSONObject();
        add(jSONObject3, "product_id", this.LIZIZ);
        add(jSONObject3, "request_id", this.LIZJ);
        if (z2) {
            str = "second";
        } else {
            str = "first";
        }
        add(jSONObject, WM7.SCENE_SERVICE, str);
        InterfaceC78267Unf LJFF = C78273Unl.LJIIIZ().LJFF();
        EnumC77751UfL enumC77751UfL = EnumC77751UfL.BOTH;
        if (z) {
            str2 = "livesdk_iap_send_receipt_request_success";
        } else {
            str2 = "livesdk_iap_send_receipt_request_fail";
        }
        C78263Unb c78263Unb = (C78263Unb) LJFF;
        c78263Unb.getClass();
        c78263Unb.LIZ(enumC77751UfL, str2, jSONObject, jSONObject2, jSONObject3);
    }

    public C78298UoA(OrderData orderData, PayType payType, String str, String str2, boolean z) {
        this.LIZIZ = str;
        this.LIZJ = str2;
        this.LJ = z;
        this.LJI = orderData;
        if (payType != null) {
            this.LJFF = payType.ordinal();
        } else {
            this.LJFF = -1;
        }
        if (orderData.getIapPayRequest() != null && orderData.getIapPayRequest().LIZIZ != null) {
            this.LIZLLL = orderData.getIapPayRequest().LIZIZ;
        }
    }
}
