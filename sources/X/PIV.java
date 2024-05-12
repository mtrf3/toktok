package X;

import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class PIV implements PIQ {
    public final String LIZ;

    @Override // X.PIQ
    public final JSONObject LIZ() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("service_name", this.LIZ);
        jSONObject.put("log_type", "service_monitor");
        return jSONObject;
    }

    public PIV(String str) {
        this.LIZ = str;
    }
}
