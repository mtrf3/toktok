package X;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.IkV, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C47495IkV {
    public final float LIZ;
    public final float LIZIZ;
    public final float LIZJ;
    public final int LIZLLL;
    public final int LJ;
    public final int LJFF;
    public final long LJI;
    public final double LJII;
    public final double LJIIIIZZ;

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SpeedCalculateConfig{mMinRangeRobustFactor=");
        LIZ.append(this.LIZ);
        LIZ.append(", mMaxRangeRobustFactor=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", mDefaultRangeRobustFactor=");
        LIZ.append(this.LIZJ);
        LIZ.append(", mRoughRTTms=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", mAdjRangeSizeByte=");
        LIZ.append(this.LJ);
        LIZ.append(", mMinTaskSizeByte=");
        LIZ.append(this.LJFF);
        LIZ.append(", mMaxTaskSizeByte=");
        LIZ.append(this.LJI);
        LIZ.append(", mMinTaskDownloadMs=");
        LIZ.append(this.LJII);
        LIZ.append(", mMaxTaskDownloadMs=");
        return C07670Rv.LIZ(LIZ, this.LJIIIIZZ, '}', LIZ);
    }

    public C47495IkV(String str) {
        this.LIZ = 1.0f;
        this.LIZIZ = 1.0f;
        this.LIZJ = 1.0f;
        this.LJ = 81920000;
        this.LJI = 52428800L;
        this.LJII = 1.0E-4d;
        this.LJIIIIZZ = 1200000.0d;
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.LIZ = (float) jSONObject.optDouble("min_range_robust_factor", 1.0d);
            this.LIZIZ = (float) jSONObject.optDouble("max_range_robust_factor", 1.0d);
            this.LIZJ = (float) jSONObject.optDouble("default_range_robust_factor", 1.0d);
            this.LIZLLL = jSONObject.optInt("rough_rtt_ms", 0);
            this.LJ = jSONObject.optInt("adj_range_size_byte", 81920000);
            this.LJFF = jSONObject.optInt("min_task_size_byte", 0);
            this.LJI = jSONObject.optLong("max_task_size_byte", 52428800L);
            this.LJII = jSONObject.optDouble("min_task_download_ms", 1.0E-4d);
            this.LJIIIIZZ = jSONObject.optDouble("max_task_download_ms", 1200000.0d);
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
        }
    }
}
