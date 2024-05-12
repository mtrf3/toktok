package X;

import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class POQ implements PIQ {
    public int LIZ;
    public final String LIZIZ;

    @Override // X.PIQ
    public final JSONObject LIZ() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("status", this.LIZ);
        jSONObject.put("btm", this.LIZIZ);
        return jSONObject;
    }

    public POQ(boolean z, String str) {
        int i;
        if (z) {
            i = 1;
        } else {
            i = 2;
        }
        this.LIZ = i;
        this.LIZIZ = str;
    }
}
