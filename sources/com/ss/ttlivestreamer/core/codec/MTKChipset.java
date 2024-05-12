package com.ss.ttlivestreamer.core.codec;

import X.X1D;
import android.media.MediaFormat;
import android.os.Build;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.ss.ttlivestreamer.core.utils.AVLog;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public class MTKChipset extends Chipset {
    public final String TAG = "MTKClip";

    @Override // com.ss.ttlivestreamer.core.codec.Chipset
    public void setupQPConfig(MediaFormat mediaFormat, String str) {
        try {
            JSONObject jSONObject = JSONObjectProtectorUtils.getJSONObject(new JSONObject(str), "mtk");
            if (JSONObjectProtectorUtils.getInt(jSONObject, "qp_i_min") < 0 || JSONObjectProtectorUtils.getInt(jSONObject, "qp_i_max") > 51 || JSONObjectProtectorUtils.getInt(jSONObject, "qp_b_min") < 0 || JSONObjectProtectorUtils.getInt(jSONObject, "qp_b_max") > 51 || JSONObjectProtectorUtils.getInt(jSONObject, "qp_p_min") < 0 || JSONObjectProtectorUtils.getInt(jSONObject, "qp_p_max") > 51) {
                AVLog.ioe("MTKClip", "setup qp range error. qp range should be in [0,51]");
                return;
            }
            if (JSONObjectProtectorUtils.getInt(jSONObject, "qp_i_max") < JSONObjectProtectorUtils.getInt(jSONObject, "qp_i_min") || JSONObjectProtectorUtils.getInt(jSONObject, "qp_b_max") < JSONObjectProtectorUtils.getInt(jSONObject, "qp_b_min") || JSONObjectProtectorUtils.getInt(jSONObject, "qp_p_max") < JSONObjectProtectorUtils.getInt(jSONObject, "qp_p_min")) {
                AVLog.ioe("MTKClip", "setup qp range error. qp range should be qp_max >= qp_min");
                return;
            }
            if (Build.VERSION.SDK_INT >= 31) {
                mediaFormat.setInteger("video-qp-i-min", JSONObjectProtectorUtils.getInt(jSONObject, "qp_i_min"));
                mediaFormat.setInteger("video-qp-i-max", JSONObjectProtectorUtils.getInt(jSONObject, "qp_i_max"));
                mediaFormat.setInteger("video-qp-b-min", JSONObjectProtectorUtils.getInt(jSONObject, "qp_b_min"));
                mediaFormat.setInteger("video-qp-b-max", JSONObjectProtectorUtils.getInt(jSONObject, "qp_b_max"));
                mediaFormat.setInteger("video-qp-p-min", JSONObjectProtectorUtils.getInt(jSONObject, "qp_p_min"));
                mediaFormat.setInteger("video-qp-p-max", JSONObjectProtectorUtils.getInt(jSONObject, "qp_p_max"));
            }
        } catch (JSONException e) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("setup encode qp config error. qpCfg:");
            LIZ.append(str);
            AVLog.logKibana(6, "MTKClip", X1D.LIZIZ(LIZ), e);
        }
    }
}
