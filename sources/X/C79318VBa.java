package X;

import android.text.TextUtils;
import com.ss.videoarch.strategy.strategy.smartStrategy.BaseSmartStrategy;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.VBa, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C79318VBa extends BaseSmartStrategy {
    public static volatile C79318VBa LIZ;

    public static C79318VBa LIZ() {
        if (LIZ == null) {
            synchronized (C79318VBa.class) {
                if (LIZ == null) {
                    LIZ = new C79318VBa();
                }
            }
        }
        return LIZ;
    }

    public C79318VBa() {
        this.mStrategyName = "live_stream_strategy_trans_params";
        this.mProjectKey = "2";
        C79357VCn c79357VCn = this.mStrategyConfigInfo;
        if (c79357VCn != null) {
            c79357VCn.LIZ = "live_stream_strategy_trans_params";
            c79357VCn.LJIIJ = new JSONArray().put("NETWORK-NetworkLevel").put("NETWORK-RTT").put("NETWORK-VodDownloadSpeed").put("NETWORK-BestMtuLength").put("NETWORK-PacketLossRate").put("PLAY-Bitrate").put("PLAY-NeptuneName").put("PLAY-HistoryBandwidth").put("CLOUD-DefaultRecommendResult").put("CLOUD-MinMultiple").put("CLOUD-MaxMultiple").put("CLOUD-MinBandWidth").put("CLOUD-MaxBandWidth");
        }
    }

    @Override // com.ss.videoarch.strategy.strategy.smartStrategy.BaseSmartStrategy
    public final JSONObject runLocalStrategy(JSONObject jSONObject) {
        C79357VCn c79357VCn;
        int i;
        if (jSONObject == null || (c79357VCn = this.mStrategyConfigInfo) == null || c79357VCn.LJI == null) {
            return null;
        }
        JSONObject jSONObject2 = new JSONObject();
        String optString = jSONObject.optString("PLAY-NeptuneName", "");
        long optLong = jSONObject.optLong("PLAY-HistoryBandwidth", 0L);
        int optInt = jSONObject.optInt("NETWORK-NetworkLevel", 0);
        long optLong2 = jSONObject.optLong("NETWORK-RTT", 0L);
        long optLong3 = jSONObject.optLong("NETWORK-VodDownloadSpeed", 0L);
        long optLong4 = jSONObject.optLong("NETWORK-BestMtuLength", -1L);
        long optLong5 = jSONObject.optLong("NETWORK-PacketLossRate", -1L);
        long optLong6 = this.mStrategyConfigInfo.LJI.optLong("MinBandWidth", 1500L);
        long optLong7 = this.mStrategyConfigInfo.LJI.optLong("MaxBandWidth", 80000L);
        JSONObject optJSONObject = this.mStrategyConfigInfo.LJI.optJSONObject("NetWorkTypeDefaultBandWidth");
        if (optLong <= 0) {
            if (optLong3 > 0) {
                optLong = optLong3;
                i = 2;
            } else {
                if (optJSONObject != null && optJSONObject.has(String.valueOf(optInt))) {
                    JSONObject optJSONObject2 = optJSONObject.optJSONObject(String.valueOf(optInt));
                    if (!TextUtils.isEmpty(optString) && optJSONObject2 != null && optJSONObject2.has(optString)) {
                        optLong = optJSONObject2.optLong(optString);
                        i = 3;
                    }
                }
                i = 0;
            }
        } else {
            i = 1;
        }
        if (optLong < optLong6 || optLong > optLong7) {
            if (optLong >= optLong6) {
                optLong6 = optLong7;
            }
            optLong = optLong6;
        }
        if (optLong <= 0) {
            optLong = -1;
        }
        try {
            jSONObject2.put("Bandwidth", optLong);
            if (optLong2 <= 0) {
                optLong2 = -1;
            }
            jSONObject2.put("RTT", optLong2);
            if (optLong4 <= 0) {
                optLong4 = -1;
            }
            jSONObject2.put("BestMTULength", optLong4);
            if (optLong5 <= 0) {
                optLong5 = -1;
            }
            jSONObject2.put("PacketLossRate", optLong5);
            jSONObject2.put("BandwidthDecision", i);
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
        }
        return jSONObject2;
    }
}
