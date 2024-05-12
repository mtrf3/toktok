package X;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.0x2, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C24080x2 {
    public String LIZ;
    public String LIZIZ;
    public String LIZJ;
    public String LIZLLL;

    public final JSONObject LIZ() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("environment", this.LIZ);
            jSONObject.put("locale", this.LIZIZ);
            jSONObject.put("origin_key", this.LIZJ);
            jSONObject.put("platform", this.LIZLLL);
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
        }
        return jSONObject;
    }
}
