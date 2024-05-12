package X;

import org.json.JSONObject;

/* loaded from: classes13.dex */
public final class SIL implements SIR {
    public final /* synthetic */ SIK LIZ;

    public SIL(SIK sik) {
        this.LIZ = sik;
    }

    @Override // X.SIR
    public final void LIZ(JSONObject jSONObject) {
        boolean z;
        SIK sik = this.LIZ;
        if (jSONObject.optInt("hit_cache") == 0) {
            z = true;
        } else {
            z = false;
        }
        sik.LIZJ = !z;
        this.LIZ.LIZLLL = jSONObject.optInt("duration");
    }

    @Override // X.SIR
    public final void LJJLIIIJLLLLLLLZ(JSONObject jSONObject, String str, boolean z) {
        long j;
        boolean z2;
        SIK sik = this.LIZ;
        if (jSONObject != null) {
            j = jSONObject.optLong("file_size");
        } else {
            j = -1;
        }
        sik.LIZIZ = j;
        SIK sik2 = this.LIZ;
        if (jSONObject != null) {
            z2 = jSONObject.optBoolean("hit_cdn_cache");
        } else {
            z2 = false;
        }
        sik2.LIZ = z2;
    }
}
