package X;

import com.ss.videoarch.strategy.strategy.smartStrategy.BaseSmartStrategy;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes15.dex */
public final class VBZ extends BaseSmartStrategy {
    public static volatile VBZ LIZ;

    public static VBZ LIZ() {
        if (LIZ == null) {
            synchronized (VBZ.class) {
                if (LIZ == null) {
                    LIZ = new VBZ();
                }
            }
        }
        return LIZ;
    }

    public VBZ() {
        this.mStrategyName = "live_stream_strategy_smooth_switch_probe_bitrate";
        this.mProjectKey = "2";
        C79357VCn c79357VCn = this.mStrategyConfigInfo;
        if (c79357VCn != null) {
            c79357VCn.LIZ = "live_stream_strategy_smooth_switch_probe_bitrate";
            c79357VCn.LJIIJ = new JSONArray().put("NETWORK-NetworkLevel").put("PLAY-BitrateList");
        }
    }

    @Override // com.ss.videoarch.strategy.strategy.smartStrategy.BaseSmartStrategy
    public final JSONObject runLocalStrategy(JSONObject jSONObject) {
        C79357VCn c79357VCn;
        boolean z;
        if (jSONObject == null || (c79357VCn = this.mStrategyConfigInfo) == null || c79357VCn.LJI == null) {
            return null;
        }
        JSONObject jSONObject2 = new JSONObject();
        JSONObject optJSONObject = jSONObject.optJSONObject("PLAY-BitrateList");
        JSONObject optJSONObject2 = this.mStrategyConfigInfo.LJI.optJSONObject("NetLevel-Map");
        int optInt = jSONObject.optInt("NETWORK-NetworkLevel", 0);
        boolean z2 = true;
        if (optJSONObject == null) {
            z = true;
        } else {
            z = false;
        }
        if (optJSONObject2 != null) {
            z2 = false;
        }
        if (z2 | z) {
            return jSONObject2;
        }
        Iterator<String> keys = optJSONObject2.keys();
        int i = -1;
        while (keys.hasNext()) {
            try {
                String next = keys.next();
                JSONArray optJSONArray = optJSONObject2.optJSONArray(next);
                if (optJSONArray != null) {
                    int i2 = 0;
                    while (true) {
                        if (i2 < optJSONArray.length()) {
                            if (optJSONArray.get(i2).equals(Integer.valueOf(optInt)) && optJSONObject.has(next)) {
                                i = optJSONObject.optInt(next);
                                break;
                            }
                            i2++;
                        } else {
                            break;
                        }
                    }
                }
            } catch (JSONException e) {
                C16880lQ.LLLLIIL(e);
            }
        }
        jSONObject2.put("smooth_switch_probe_bitrate", i);
        return jSONObject2;
    }

    @Override // com.ss.videoarch.strategy.strategy.smartStrategy.BaseSmartStrategy
    public final JSONObject runSmartStrategy(JSONObject jSONObject) {
        return super.runSmartStrategy(jSONObject);
    }
}
