package X;

import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class PJ1 implements PIQ {
    public final String LIZ;

    @Override // X.PIQ
    public final JSONObject LIZ() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("event", this.LIZ);
        return jSONObject;
    }

    public PJ1(String str) {
        this.LIZ = str;
    }
}
