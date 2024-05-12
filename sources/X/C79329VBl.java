package X;

import com.ss.videoarch.strategy.strategy.smartStrategy.BaseSmartStrategy;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.VBl, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C79329VBl extends BaseSmartStrategy {
    public static volatile C79329VBl LIZ;

    @Override // com.ss.videoarch.strategy.strategy.smartStrategy.BaseSmartStrategy
    public final JSONObject runLocalStrategy(JSONObject jSONObject) {
        return null;
    }

    public static C79329VBl LIZ() {
        if (LIZ == null) {
            synchronized (C79329VBl.class) {
                if (LIZ == null) {
                    LIZ = new C79329VBl();
                }
            }
        }
        return LIZ;
    }

    public C79329VBl() {
        this.mStrategyName = "live_stream_strategy_short_time_leave_predict";
        this.mProjectKey = "2";
        C79357VCn c79357VCn = this.mStrategyConfigInfo;
        if (c79357VCn != null) {
            c79357VCn.LIZ = "live_stream_strategy_short_time_leave_predict";
            c79357VCn.LJIIJ = new JSONArray().put("USER-FeaturesBundle").put("PLAY-HistoryDuration");
        }
    }
}
