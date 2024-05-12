package X;

import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.google.android.gms.wallet.PaymentData;
import java.util.Collection;
import kotlin.jvm.internal.o;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.Qlt, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C67965Qlt {
    public static JSONArray LIZ(PaymentData paymentData) {
        o.LJIIIZ(paymentData, "paymentData");
        String str = paymentData.zzg;
        o.LJIIIIZZ(str, "paymentData.toJson()");
        JSONObject jSONObject = JSONObjectProtectorUtils.getJSONObject(new JSONObject(str), "paymentMethodData");
        String network = JSONObjectProtectorUtils.getString(jSONObject, "type");
        String card = JSONObjectProtectorUtils.getString(JSONObjectProtectorUtils.getJSONObject(jSONObject, "info"), "cardNetwork");
        String token = JSONObjectProtectorUtils.getString(JSONObjectProtectorUtils.getJSONObject(jSONObject, "tokenizationData"), "token");
        o.LJIIIIZZ(token, "token");
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("element", "eg_pi_ptw_googlepay_c_d_global_googlepay_pi_tokenization_data");
        jSONObject2.put("param_name", "pi_tokenization_data");
        jSONObject2.put("param_value", token);
        o.LJIIIIZZ(card, "card");
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("element", "eg_pi_ptw_googlepay_c_d_global_googlepay_pi_type");
        jSONObject3.put("param_name", "pi_type");
        jSONObject3.put("param_value", card);
        o.LJIIIIZZ(network, "network");
        JSONObject jSONObject4 = new JSONObject();
        jSONObject4.put("element", "eg_pi_ptw_googlepay_c_d_global_googlepay_pi_network");
        jSONObject4.put("param_name", "pi_network");
        jSONObject4.put("param_value", network);
        return new JSONArray((Collection) C47261Igj.LJJIJIIJI(jSONObject2, jSONObject3, jSONObject4));
    }
}
