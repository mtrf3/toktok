package X;

import com.ss.videoarch.strategy.LiveStrategyManager;
import com.ss.videoarch.strategy.strategy.smartStrategy.BaseSmartStrategy;
import org.json.JSONObject;

/* renamed from: X.VBo, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C79332VBo extends BaseSmartStrategy {
    public static volatile C79332VBo LIZ;

    public static C79332VBo LIZ() {
        if (LIZ == null) {
            synchronized (C79332VBo.class) {
                if (LIZ == null) {
                    LIZ = new C79332VBo();
                }
            }
        }
        return LIZ;
    }

    public C79332VBo() {
        this.mStrategyName = "live_stream_strategy_character_fetch";
        this.mProjectKey = "2";
        C79357VCn c79357VCn = this.mStrategyConfigInfo;
        if (c79357VCn != null) {
            c79357VCn.LIZ = "live_stream_strategy_character_fetch";
        }
    }

    @Override // com.ss.videoarch.strategy.strategy.smartStrategy.BaseSmartStrategy
    public final JSONObject runLocalStrategy(JSONObject jSONObject) {
        C79349VCf c79349VCf = LiveStrategyManager.mLiveIOEngine;
        if (c79349VCf != null && jSONObject != null) {
            jSONObject.toString();
            c79349VCf.getClass();
        }
        return jSONObject;
    }
}
