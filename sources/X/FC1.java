package X;

import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import com.lynx.react.bridge.ReadableMap;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public final class FC1 {
    public final long LIZ;
    public final long LIZIZ;
    public final double LIZJ;
    public final int LIZLLL;
    public final long LJ;
    public final long LJFF;
    public final long LJI;
    public final long LJII;
    public final long LJIIIIZZ;

    public final JSONObject LIZ() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("animation_duration", this.LIZ);
            jSONObject.put("play_duration", this.LIZIZ);
            jSONObject.put("fps", this.LIZJ);
            jSONObject.put("max_drop_value", this.LIZLLL);
            jSONObject.put("cost_asset_load", this.LJI);
            jSONObject.put("cost_src_parse", this.LJFF);
            jSONObject.put("cost_layer_build", this.LJII);
            jSONObject.put("cost_src_net_load", this.LJ);
            jSONObject.put("cost_set_src_total", this.LJIIIIZZ);
        } catch (Exception e) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("combineMetricsInto failed, error: ");
            LIZ.append(e.toString());
            C77125UOr.LJIILJJIL("PerfMetrics", X1D.LIZIZ(LIZ));
        }
        return jSONObject;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PerfMetrics{mAnimationDuration=");
        LIZ.append(this.LIZ);
        LIZ.append(", mPlayDuration=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", mFps=");
        LIZ.append(this.LIZJ);
        LIZ.append(", mMaxDropValue=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", mNetLoadMs=");
        LIZ.append(this.LJ);
        LIZ.append(", mSrcParseCostMs=");
        LIZ.append(this.LJFF);
        LIZ.append(", mAssetLoadMs=");
        LIZ.append(this.LJI);
        LIZ.append(", mLayerBuildMs=");
        LIZ.append(this.LJII);
        LIZ.append(", mTotalCostMs=");
        return C47135Ieh.LIZIZ(LIZ, this.LJIIIIZZ, '}', LIZ);
    }

    public FC1(ReadableMap readableMap) {
        this.LIZ = readableMap.getLong("animation_duration", 0L);
        this.LIZIZ = readableMap.getLong("play_duration", 0L);
        this.LIZJ = readableMap.getDouble("fps", LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX);
        this.LIZLLL = readableMap.getInt("max_drop_value", 0);
        this.LJ = readableMap.getLong("cost_src_net_load", 0L);
        this.LJFF = readableMap.getLong("cost_src_parse", 0L);
        this.LJI = readableMap.getLong("cost_asset_load", 0L);
        this.LJII = readableMap.getLong("cost_layer_build", 0L);
        this.LJIIIIZZ = readableMap.getLong("cost_set_src_total", 0L);
    }
}
