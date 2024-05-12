package X;

import com.bytedance.android.livesdk.livesetting.broadcast.LiveMaxRetainAlogMessageSizeSetting;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class PGJ implements PCW {
    public final /* synthetic */ C64154PFu LIZ;

    public PGJ(C64154PFu c64154PFu) {
        this.LIZ = c64154PFu;
    }

    @Override // X.PCW
    public final void LIZ(JSONObject jSONObject) {
        JSONObject optJSONObject;
        C64154PFu c64154PFu = this.LIZ;
        c64154PFu.getClass();
        JSONObject optJSONObject2 = jSONObject.optJSONObject("performance_modules");
        if (optJSONObject2 == null || (optJSONObject = optJSONObject2.optJSONObject("traffic")) == null) {
            return;
        }
        if (C09970aH.LJII()) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("parseConfig: ");
            LIZ.append(optJSONObject);
            X1D.LIZIZ(LIZ);
        }
        PGK pgk = new PGK();
        pgk.LIZ = optJSONObject;
        boolean z = false;
        if (optJSONObject.optInt("cause_analysis", 0) == 1) {
            z = true;
        }
        pgk.LIZIZ = z;
        if (z) {
            long optInt = optJSONObject.optInt("exception_threshold_mb", LiveMaxRetainAlogMessageSizeSetting.DEFAULT);
            PGL pgl = PGL.MB;
            pgk.LIZJ = pgl.getBytes() * optInt;
            pgk.LIZLLL = pgl.getBytes() * optJSONObject.optInt("exception_threshold_bg_mb", LiveMaxRetainAlogMessageSizeSetting.DEFAULT);
            pgk.LJ = optJSONObject.optInt("high_freq_threshold", 200);
            pgk.LJFF = optJSONObject.optDouble("large_usage_threshold_mb", 10.0d) * pgl.getBytes();
            pgk.LJI = optJSONObject.optDouble("alog_record_threshold", 100.0d) * PGL.KB.getBytes();
        }
        pgk.LJII = PGL.KB.getBytes() * optJSONObject.optLong("record_usage_kb", 1L);
        c64154PFu.LIZ = pgk;
        EGB.LIZ.LIZIZ(pgk);
    }
}
