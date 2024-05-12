package X;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.0wy, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C24040wy {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public boolean LIZLLL;

    public final JSONObject LIZ() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("element", this.LIZ);
            jSONObject.put("param_name", this.LIZIZ);
            jSONObject.put("param_value", this.LIZJ);
            jSONObject.put("is_encrypted", this.LIZLLL);
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
        }
        return jSONObject;
    }

    public C24040wy(String str, String str2, String str3) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
    }
}
