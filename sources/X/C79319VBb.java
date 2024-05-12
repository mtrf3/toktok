package X;

import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.ss.videoarch.strategy.strategy.smartStrategy.BaseSmartStrategy;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.VBb, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C79319VBb extends BaseSmartStrategy {
    public static volatile C79319VBb LIZIZ;
    public JSONObject LIZ;

    public static C79319VBb LIZ() {
        if (LIZIZ == null) {
            synchronized (C79319VBb.class) {
                if (LIZIZ == null) {
                    LIZIZ = new C79319VBb();
                }
            }
        }
        return LIZIZ;
    }

    public C79319VBb() {
        this.mStrategyName = "live_stream_strategy_net_connect_type";
        this.mProjectKey = "2";
        C79357VCn c79357VCn = this.mStrategyConfigInfo;
        if (c79357VCn != null) {
            c79357VCn.LIZ = "live_stream_strategy_net_connect_type";
            c79357VCn.LJIIJ = new JSONArray().put("NETWORK-NetworkLevel");
        }
    }

    @Override // com.ss.videoarch.strategy.strategy.smartStrategy.BaseSmartStrategy
    public final JSONObject runLocalStrategy(JSONObject jSONObject) {
        JSONObject jSONObject2 = null;
        if (jSONObject == null) {
            return null;
        }
        JSONObject jSONObject3 = this.mStrategyConfigInfo.LJI;
        if (jSONObject3 != null) {
            this.LIZ = jSONObject3.optJSONObject("netEffectiveConnectionTypeStrategy");
        }
        int optInt = jSONObject.optInt("NETWORK-NetworkLevel");
        if (optInt == 1) {
            optInt = 7;
        }
        JSONObject jSONObject4 = this.LIZ;
        if (jSONObject4 == null || !jSONObject4.has(String.valueOf(optInt))) {
            return null;
        }
        try {
            jSONObject2 = JSONObjectProtectorUtils.getJSONObject(this.LIZ, String.valueOf(optInt));
            return jSONObject2;
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
            return jSONObject2;
        }
    }
}
