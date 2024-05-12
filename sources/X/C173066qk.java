package X;

import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.shoutouts.MoneyDes;
import com.ss.android.ugc.aweme.shoutouts.ShoutoutPrice;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.6qk, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C173066qk {
    public static void LIZ(JSONObject params) {
        o.LJIIIZ(params, "params");
        try {
            if ("shoutouts_coins_setting".equals(params.optString("eventName"))) {
                JSONObject jSONObject = JSONObjectProtectorUtils.getJSONObject(params, "data");
                JSONObject jSONObject2 = JSONObjectProtectorUtils.getJSONObject(jSONObject, "buyer_payment");
                ShoutoutPrice priceC = (ShoutoutPrice) new Gson().LJI(jSONObject.toString(), ShoutoutPrice.class);
                MoneyDes priceB = (MoneyDes) new Gson().LJI(jSONObject2.toString(), MoneyDes.class);
                o.LJIIIIZZ(priceC, "priceC");
                o.LJIIIIZZ(priceB, "priceB");
                C2U8.LIZ(new C163656bZ(priceC, priceB));
            }
        } catch (Exception unused) {
        }
    }
}
