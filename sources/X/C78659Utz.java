package X;

import org.json.JSONObject;

/* renamed from: X.Utz, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C78659Utz implements SIR {
    public boolean LIZ;
    public String LIZIZ;
    public long LIZJ = -1;

    @Override // X.SIR
    public final /* synthetic */ void LIZ(JSONObject jSONObject) {
    }

    @Override // X.SIR
    public final void LJJLIIIJLLLLLLLZ(JSONObject jSONObject, String str, boolean z) {
        long j;
        String str2;
        if (str != null && str.length() != 0) {
            this.LIZ = true;
        }
        if (jSONObject != null) {
            j = jSONObject.optLong("file_size");
        } else {
            j = -1;
        }
        this.LIZJ = j;
        if (jSONObject != null) {
            str2 = jSONObject.optString("hit_cdn_cache");
        } else {
            str2 = null;
        }
        this.LIZIZ = str2;
    }
}
