package X;

import com.android.billingclient.api.Purchase;
import com.bytedance.globalpayment.iap.model.IapPaymentMethod;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.Uoi, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C78332Uoi extends IO1 {
    public static volatile C78332Uoi LIZ;

    public static C78332Uoi LIZJ() {
        if (LIZ == null) {
            synchronized (C78332Uoi.class) {
                if (LIZ == null) {
                    LIZ = new C78332Uoi();
                }
            }
        }
        return LIZ;
    }

    public final void LIZ(Purchase purchase) {
        JSONObject LIZIZ = LIZIZ(purchase);
        add(LIZIZ, "payment_method", IapPaymentMethod.GOOGLE.channelName);
        C78273Unl.LJIIIZ().LIZIZ().onEventV3("billing_query_in_google_updated", LIZIZ);
    }

    public final JSONObject LIZIZ(Purchase purchase) {
        JSONObject jSONObject = new JSONObject();
        if (purchase != null) {
            add(jSONObject, "purchase_gp_order_id", purchase.LIZJ.optString("orderId"));
            add(jSONObject, "purchase_token", purchase.LIZLLL());
            add(jSONObject, "original_json", purchase.LIZ);
            add(jSONObject, "purchase_signature", purchase.LIZIZ);
            add(jSONObject, "purchase_sku_id", C78847Ux1.LJJIIJ(purchase));
            add(jSONObject, "purchase_state", purchase.LIZJ());
        } else {
            add(jSONObject, "purchase_gp_order_id", "unknown");
            add(jSONObject, "purchase_token", "unknown");
            add(jSONObject, "original_json", "unknown");
            add(jSONObject, "purchase_signature", "unknown");
            add(jSONObject, "purchase_sku_id", "unknown");
            add(jSONObject, "purchase_state", -1L);
        }
        return jSONObject;
    }

    public final void LJ(C78368UpI c78368UpI, C0HE c0he, List<Purchase> list) {
        String str;
        if (list != null) {
            if (list.size() == 0) {
                str = "size is 0";
            } else {
                JSONArray jSONArray = new JSONArray();
                Iterator<Purchase> it = list.iterator();
                while (it.hasNext()) {
                    jSONArray.put(LIZIZ(it.next()));
                }
                str = jSONArray.toString();
            }
        } else {
            str = "unknown";
        }
        JSONObject jSONObject = new JSONObject();
        add(jSONObject, "result_code", c78368UpI.getCode());
        add(jSONObject, "result_message", c78368UpI.getMessage());
        add(jSONObject, "purchase_list", str);
        add(jSONObject, "payment_method", IapPaymentMethod.GOOGLE.channelName);
        add(jSONObject, "orginal_purchase_info", c0he.toString());
        InterfaceC78267Unf LJFF = C78273Unl.LJIIIZ().LJFF();
        EnumC77751UfL enumC77751UfL = EnumC77751UfL.BOTH;
        C78263Unb c78263Unb = (C78263Unb) LJFF;
        c78263Unb.getClass();
        C78269Unh.LIZ(c78263Unb, enumC77751UfL, "livesdk_iap_purchase_updated", jSONObject);
    }

    public final void LJI(int i, C0HE c0he, C0HE c0he2) {
        JSONObject jSONObject = new JSONObject();
        add(jSONObject, "retry_count", i);
        if (c0he != null) {
            add(jSONObject, "cur_result_code", c0he.LIZ);
            add(jSONObject, "cur_result_message", c0he.LIZIZ);
        } else {
            add(jSONObject, "cur_result_code", -1L);
            add(jSONObject, "cur_result_message", "unknown");
        }
        if (c0he2 != null) {
            add(jSONObject, "pre_result_code", c0he.LIZ);
            add(jSONObject, "pre_result_message", c0he.LIZIZ);
        } else {
            add(jSONObject, "pre_result_code", -1L);
            add(jSONObject, "pre_result_message", "unknown");
        }
        add(jSONObject, "payment_method", IapPaymentMethod.GOOGLE.channelName);
        C78273Unl.LJIIIZ().LIZIZ().onEventV3("retry_query_sku_details_event", jSONObject);
    }

    public final void LIZLLL(String str, String str2, List list, boolean z) {
        long j;
        C78273Unl.LJIIIZ().LIZLLL().getClass();
        if (!C73994T2g.LJJ("ttlive_livesdk_iap_check_unverified_transaction", 0.2d)) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        add(jSONObject, "payment_method", IapPaymentMethod.GOOGLE.channelName);
        if (z) {
            j = 0;
        } else {
            j = 1;
        }
        add(jSONObject, "status", j);
        StringBuilder sb = new StringBuilder();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            sb.append(((Purchase) it.next()).toString());
        }
        if (list.size() == 0) {
            sb.append("size of 0 list");
        }
        add(jSONObject, "query_result", sb.toString());
        add(jSONObject, "query_type", str2);
        JSONObject jSONObject2 = new JSONObject();
        if (str != null) {
            add(jSONObject2, "Original BillingResult", str);
        }
        InterfaceC78267Unf LJFF = C78273Unl.LJIIIZ().LJFF();
        EnumC77751UfL enumC77751UfL = EnumC77751UfL.MONITOR;
        C78263Unb c78263Unb = (C78263Unb) LJFF;
        c78263Unb.getClass();
        c78263Unb.LIZ(enumC77751UfL, "livesdk_iap_check_unverified_transaction", jSONObject, null, jSONObject2);
    }

    public final void LJFF(String str, String str2, String str3, String str4, C78368UpI c78368UpI) {
        JSONObject jSONObject = new JSONObject();
        add(jSONObject, "result_code", c78368UpI.getCode());
        add(jSONObject, "result_message", c78368UpI.getMessage());
        add(jSONObject, "sku_id", str);
        add(jSONObject, "order_id", str2);
        add(jSONObject, "merchant_id", str3);
        add(jSONObject, "user_id", str4);
        add(jSONObject, "payment_method", IapPaymentMethod.GOOGLE.channelName);
        C78273Unl.LJIIIZ().LIZIZ().onEventV3("query_sku_details_failed", jSONObject);
    }
}
