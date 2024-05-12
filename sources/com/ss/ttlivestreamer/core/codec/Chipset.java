package com.ss.ttlivestreamer.core.codec;

import X.X1D;
import android.media.MediaFormat;
import com.ss.ttlivestreamer.core.utils.AVLog;

/* loaded from: classes12.dex */
public abstract class Chipset {
    public static String TAG = "Clip";
    public final String QP_MIN = "qp_min";
    public final String QP_MAX = "qp_max";
    public final String QP_I_MIN = "qp_i_min";
    public final String QP_I_MAX = "qp_i_max";
    public final String QP_B_MIN = "qp_b_min";
    public final String QP_B_MAX = "qp_b_max";
    public final String QP_P_MIN = "qp_p_min";
    public final String QP_P_MAX = "qp_p_max";
    public final String QP_MIN_KEY = "video-qp-min";
    public final String QP_MAX_KEY = "video-qp-max";
    public final String QP_I_MIN_KEY = "video-qp-i-min";
    public final String QP_I_MAX_KEY = "video-qp-i-max";
    public final String QP_B_MIN_KEY = "video-qp-b-min";
    public final String QP_B_MAX_KEY = "video-qp-b-max";
    public final String QP_P_MIN_KEY = "video-qp-p-min";
    public final String QP_P_MAX_KEY = "video-qp-p-max";

    public abstract void setupQPConfig(MediaFormat mediaFormat, String str);

    public static Chipset create(String str) {
        if (str.startsWith("OMX.hisi.")) {
            return new HisiChipset();
        }
        if (str.startsWith("OMX.qcom.") || str.startsWith("c2.qti.")) {
            return new QcomChipset();
        }
        if (str.startsWith("OMX.Exynos.")) {
            return new ExynosChipset();
        }
        if (str.startsWith("OMX.MTK.") || str.startsWith("c2.mtk.")) {
            return new MTKChipset();
        }
        String str2 = TAG;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("create Clip instance error. codecName:");
        LIZ.append(str);
        AVLog.ioe(str2, X1D.LIZIZ(LIZ));
        return null;
    }
}
