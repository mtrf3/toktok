package com.ss.ttlivestreamer.core.codec;

import X.X1D;
import android.media.MediaFormat;
import android.os.Build;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.ss.ttlivestreamer.core.utils.AVLog;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public class HisiChipset extends Chipset {
    public final String TAG = "HisiClip";

    @Override // com.ss.ttlivestreamer.core.codec.Chipset
    public void setupQPConfig(MediaFormat mediaFormat, String str) {
        try {
            JSONObject jSONObject = JSONObjectProtectorUtils.getJSONObject(new JSONObject(str), "hisi");
            if (JSONObjectProtectorUtils.getInt(jSONObject, "qp_min") < 0 || JSONObjectProtectorUtils.getInt(jSONObject, "qp_max") > 51) {
                AVLog.ioe("HisiClip", "setup qp range error. qp range should be in [0,51]");
                return;
            }
            if (JSONObjectProtectorUtils.getInt(jSONObject, "qp_max") - JSONObjectProtectorUtils.getInt(jSONObject, "qp_min") <= 6) {
                AVLog.ioe("HisiClip", "setup qp range error. qp range max - min <= 6");
                return;
            }
            if (Build.VERSION.SDK_INT >= 31) {
                mediaFormat.setInteger("vendor.hisi.hisi-ext-codec-qp-regulation-supported", 1);
                mediaFormat.setInteger("video-qp-min", JSONObjectProtectorUtils.getInt(jSONObject, "qp_min"));
                mediaFormat.setInteger("video-qp-max", JSONObjectProtectorUtils.getInt(jSONObject, "qp_max"));
                mediaFormat.setInteger("vendor.hisi.hisi-ext-codec-min-qp", JSONObjectProtectorUtils.getInt(jSONObject, "qp_min"));
                mediaFormat.setInteger("vendor.hisi.hisi-ext-codec-max-qp", JSONObjectProtectorUtils.getInt(jSONObject, "qp_max"));
                return;
            }
            mediaFormat.setInteger("vendor.hisi.hisi-ext-codec-qp-regulation-supported", 1);
            mediaFormat.setInteger("vendor.hisi.hisi-ext-codec-min-qp", JSONObjectProtectorUtils.getInt(jSONObject, "qp_min"));
            mediaFormat.setInteger("vendor.hisi.hisi-ext-codec-max-qp", JSONObjectProtectorUtils.getInt(jSONObject, "qp_max"));
        } catch (JSONException e) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("setup encode qp config error. qpCfg:");
            LIZ.append(str);
            AVLog.logKibana(6, "HisiClip", X1D.LIZIZ(LIZ), e);
        }
    }
}
