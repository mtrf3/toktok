package X;

import com.ss.videoarch.strategy.strategy.smartStrategy.BaseSmartStrategy;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes15.dex */
public final class VBX extends BaseSmartStrategy {
    public static volatile VBX LIZ;

    public static VBX LIZ() {
        if (LIZ == null) {
            synchronized (VBX.class) {
                if (LIZ == null) {
                    LIZ = new VBX();
                }
            }
        }
        return LIZ;
    }

    public VBX() {
        this.mStrategyName = "live_stream_strategy_startup_bitrate_predict";
        this.mProjectKey = "2";
        C79357VCn c79357VCn = this.mStrategyConfigInfo;
        if (c79357VCn != null) {
            c79357VCn.LIZ = "live_stream_strategy_startup_bitrate_predict";
            c79357VCn.LJIIJ = new JSONArray().put("NETWORK-RecommendBitrate").put("PLAY-BitrateList");
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(14:28|(2:32|(10:34|35|(4:38|(1:52)(2:40|(2:46|(3:48|49|50)(1:51))(3:42|43|44))|45|36)|53|(2:55|(4:59|(4:62|(2:64|65)(1:67)|66|60)|68|(1:70)))|(2:72|(3:75|(1:77)(1:80)|(1:79)))|(2:96|(5:99|(1:106)|(2:102|103)(1:105)|104|97))(2:84|(2:89|85))|90|91|92))|107|35|(1:36)|53|(0)|(0)|(1:82)|96|(1:97)|90|91|92) */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01b9, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01ba, code lost:
    
        X.C16880lQ.LLLLIIL(r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0193  */
    @Override // com.ss.videoarch.strategy.strategy.smartStrategy.BaseSmartStrategy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final org.json.JSONObject runLocalStrategy(org.json.JSONObject r21) {
        /*
            Method dump skipped, instructions count: 446
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.VBX.runLocalStrategy(org.json.JSONObject):org.json.JSONObject");
    }

    @Override // com.ss.videoarch.strategy.strategy.smartStrategy.BaseSmartStrategy
    public final JSONObject runSmartStrategy(JSONObject jSONObject) {
        return super.runSmartStrategy(jSONObject);
    }
}
