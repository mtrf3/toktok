package X;

import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class PIP {
    public final String LIZ;
    public final int LIZIZ;
    public final int LIZJ;
    public final PIQ LIZLLL;
    public final JSONObject LJ;

    public final JSONObject LIZ() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("traceparent", this.LIZ);
        jSONObject.put("type", this.LIZIZ);
        jSONObject.put("category", this.LIZJ);
        jSONObject.put("data", this.LIZLLL.LIZ());
        jSONObject.put("extra", this.LJ);
        return jSONObject;
    }

    public PIP(PIR pir, int i, int i2, PIQ piq, JSONObject jSONObject) {
        this.LIZ = pir.LIZJ();
        this.LIZIZ = i;
        this.LIZJ = i2;
        this.LIZLLL = piq;
        this.LJ = jSONObject;
    }
}
