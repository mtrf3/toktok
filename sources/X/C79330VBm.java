package X;

import com.ss.videoarch.strategy.strategy.smartStrategy.BaseSmartStrategy;
import org.json.JSONObject;

/* renamed from: X.VBm, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C79330VBm extends BaseSmartStrategy {
    public static volatile C79330VBm LIZIZ;
    public final C79364VCu LIZ;

    public static C79330VBm LIZ() {
        if (LIZIZ == null) {
            synchronized (C79330VBm.class) {
                if (LIZIZ == null) {
                    LIZIZ = new C79330VBm();
                }
            }
        }
        return LIZIZ;
    }

    public C79330VBm() {
        this.mStrategyName = "live_stream_strategy_socket_buffer";
        C79357VCn c79357VCn = this.mStrategyConfigInfo;
        if (c79357VCn != null) {
            c79357VCn.LIZ = "live_stream_strategy_socket_buffer";
        }
        this.mProjectKey = "2";
        this.LIZ = new C79364VCu();
    }

    @Override // com.ss.videoarch.strategy.strategy.smartStrategy.BaseSmartStrategy
    public final JSONObject runLocalStrategy(JSONObject jSONObject) {
        C79357VCn c79357VCn;
        if (jSONObject == null || (c79357VCn = this.mStrategyConfigInfo) == null || c79357VCn.LJI == null) {
            return null;
        }
        JSONObject jSONObject2 = new JSONObject();
        int optInt = jSONObject.optInt("NETWORK-NetworkLevel", 0);
        if (this.mStrategyConfigInfo.LJI.has(String.valueOf(optInt))) {
            return this.mStrategyConfigInfo.LJI.optJSONObject(String.valueOf(optInt));
        }
        return jSONObject2;
    }
}
