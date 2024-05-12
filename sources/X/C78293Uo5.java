package X;

import com.bytedance.globalpayment.iap.common.ability.model.enums.PayType;
import com.bytedance.globalpayment.iap.model.IapPaymentMethod;
import org.json.JSONObject;

/* renamed from: X.Uo5, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C78293Uo5 extends IO1 {
    public final void LIZ(int i, String str, String str2, boolean z) {
        JSONObject jSONObject = new JSONObject();
        add(jSONObject, "product_id", str);
        add(jSONObject, "request_id", str2);
        JSONObject jSONObject2 = new JSONObject();
        add(jSONObject2, "pay_type", PayType.EXTRA_TOKEN.ordinal());
        add(jSONObject2, "is_subscription", z);
        add(jSONObject2, "restore_order_type", i);
        add(jSONObject2, "payment_method", IapPaymentMethod.GOOGLE.channelName);
        ((QT9) C78273Unl.LJIIIZ().LJI()).LIZ("pipo_pay_google_pay_restore_order_event", jSONObject2, null, jSONObject);
    }
}
