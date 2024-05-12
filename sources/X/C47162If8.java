package X;

import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.ss.ttvideoengine.utils.TTVideoEngineLog;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.If8, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C47162If8 {
    public float[] LIZ;
    public int LIZIZ;
    public int LIZJ;
    public int LIZLLL;

    public final int LIZ(float f) {
        float[] fArr = this.LIZ;
        if (fArr.length > 50) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("bitrateFitterParams num: ");
            LIZ.append(fArr.length);
            C78253UnR.LIZLLL("FitterInfo", X1D.LIZIZ(LIZ));
            return 0;
        }
        double d = LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX;
        for (int i = 0; i < fArr.length; i++) {
            double d2 = 1.0d;
            for (int i2 = 0; i2 < (fArr.length - i) - 1; i2++) {
                d2 *= f;
            }
            d += d2 * fArr[i];
        }
        return (int) (((d * f) * 1024.0d) / 8.0d);
    }

    public final int LIZIZ(float f) {
        float[] fArr = this.LIZ;
        if (fArr == null) {
            C78253UnR.LIZLLL("FitterInfo", "fitter params empty");
            return 0;
        }
        if (f > this.LIZJ || f <= 0.0f) {
            C78253UnR.LIZLLL("FitterInfo", C16880lQ.LLLZ("preload second:%f, fitter duration:%d", new Object[]{Float.valueOf(f), Integer.valueOf(this.LIZJ)}));
            return 0;
        }
        int i = this.LIZLLL;
        if (i == 0) {
            return LIZ(f);
        }
        if (i == 1) {
            if (fArr.length != 3) {
                return 0;
            }
            double d = f;
            return (int) (((((fArr[0] / Math.pow(d, fArr[2])) + fArr[1]) * d) * 1024.0d) / 8.0d);
        }
        return LIZ(f);
    }

    public final void LIZJ(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            if (jSONObject.has("func_params")) {
                JSONArray jSONArray = JSONObjectProtectorUtils.getJSONArray(jSONObject, "func_params");
                if (jSONArray.length() <= 0) {
                    return;
                }
                this.LIZ = new float[jSONArray.length()];
                for (int i = 0; i < jSONArray.length(); i++) {
                    this.LIZ[i] = (float) jSONArray.optDouble(i);
                }
            }
            this.LIZIZ = jSONObject.optInt("header_size");
            this.LIZJ = jSONObject.optInt("duration");
            this.LIZLLL = jSONObject.optInt("func_method");
        } catch (Exception e) {
            TTVideoEngineLog.d(e);
        }
    }
}
