package X;

import com.ss.videoarch.strategy.strategy.smartStrategy.BaseSmartStrategy;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes15.dex */
public final class VBY extends BaseSmartStrategy {
    public static volatile VBY LIZ;

    public static VBY LIZ() {
        if (LIZ == null) {
            synchronized (VBY.class) {
                if (LIZ == null) {
                    LIZ = new VBY();
                }
            }
        }
        return LIZ;
    }

    public VBY() {
        this.mStrategyName = "live_stream_strategy_abr_predict_bitrate";
        this.mProjectKey = "2";
        C79357VCn c79357VCn = this.mStrategyConfigInfo;
        if (c79357VCn != null) {
            c79357VCn.LIZ = "live_stream_strategy_abr_predict_bitrate";
            c79357VCn.LJIIJ = new JSONArray().put("PLAY-BitrateList");
        }
    }

    @Override // com.ss.videoarch.strategy.strategy.smartStrategy.BaseSmartStrategy
    public final JSONObject runLocalStrategy(JSONObject jSONObject) {
        return new JSONObject();
    }

    @Override // com.ss.videoarch.strategy.strategy.smartStrategy.BaseSmartStrategy
    public final JSONObject runSmartStrategy(JSONObject jSONObject) {
        return super.runSmartStrategy(jSONObject);
    }
}
