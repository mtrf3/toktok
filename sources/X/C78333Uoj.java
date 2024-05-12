package X;

import com.bytedance.globalpayment.iap.common.ability.model.OrderData;
import com.bytedance.globalpayment.iap.model.AbsIapChannelOrderData;
import org.json.JSONObject;

/* renamed from: X.Uoj, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public class C78333Uoj extends IO1 {
    public final JSONObject LIZ(OrderData orderData) {
        JSONObject jSONObject = new JSONObject();
        if (orderData != null) {
            add(jSONObject, "request_id", orderData.getOrderId());
            add(jSONObject, "product_id", orderData.getProductId());
            add(jSONObject, "payment_method", orderData.getIapPaymentMethod().channelName);
            if (orderData.getIapPayRequest() != null && orderData.getIapPayRequest().LIZIZ != null) {
                add(jSONObject, "merchant_id", orderData.getIapPayRequest().LIZIZ);
            } else {
                add(jSONObject, "merchant_id", "");
            }
            if (orderData.getPayType() != null) {
                add(jSONObject, "pay_type", orderData.getPayType().name());
            } else {
                add(jSONObject, "pay_type", "unknown");
            }
            C77874UhK iapPayRequest = orderData.getIapPayRequest();
            if (iapPayRequest != null) {
                add(jSONObject, "merchant_id", iapPayRequest.LIZIZ);
                add(jSONObject, "user_id", iapPayRequest.LJ);
            } else {
                add(jSONObject, "merchant_id", "unknown");
                add(jSONObject, "user_id", "unknown");
            }
            AbsIapChannelOrderData absIapChannelOrderData = orderData.getAbsIapChannelOrderData();
            if (absIapChannelOrderData == null) {
                add(jSONObject, "purchase", "unknown");
            } else {
                JSONObject jSONObject2 = new JSONObject();
                add(jSONObject2, "purchase_gp_order_id", absIapChannelOrderData.getChannelOrderId());
                add(jSONObject2, "purchase_self_order_id", absIapChannelOrderData.getSelfOrderId());
                add(jSONObject2, "purchase_token", absIapChannelOrderData.getChannelToken());
                add(jSONObject2, "purchase_signature", absIapChannelOrderData.getSignature());
                add(jSONObject2, "purchase_sku_id", absIapChannelOrderData.getProductId());
                add(jSONObject2, "purchase_state", absIapChannelOrderData.getOrderState());
                add(jSONObject, "purchase", jSONObject2.toString());
            }
        } else {
            add(jSONObject, "request_id", "unknown");
            add(jSONObject, "product_id", "unknown");
            add(jSONObject, "pay_type", "unknown");
            add(jSONObject, "merchant_id", "unknown");
            add(jSONObject, "user_id", "unknown");
            add(jSONObject, "purchase", "unknown");
        }
        return jSONObject;
    }

    public final JSONObject LIZIZ(JSONObject jSONObject, C78368UpI c78368UpI) {
        if (c78368UpI != null) {
            add(jSONObject, "result_code", c78368UpI.getCode());
            add(jSONObject, "result_detail_code", c78368UpI.getDetailCode());
            add(jSONObject, "result_message", c78368UpI.getMessage());
            add(jSONObject, "pay_type", c78368UpI.LIZJ.name());
        } else {
            add(jSONObject, "result_code", "unknown");
            add(jSONObject, "result_detail_code", "unknown");
            add(jSONObject, "result_message", "unknown");
            add(jSONObject, "pay_type", "unknown");
        }
        return jSONObject;
    }
}
