package X;

import org.json.JSONObject;

/* loaded from: classes15.dex */
public final class VLX implements VLW {
    @Override // X.VLW
    public final boolean LIZ(JSONObject jSONObject, JSONObject jSONObject2) {
        if (jSONObject != null) {
            return jSONObject2.toString().equals(jSONObject.toString());
        }
        return false;
    }
}
