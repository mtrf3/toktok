package X;

import org.json.JSONObject;

/* renamed from: X.10R, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C10R {
    public final JSONObject LIZ;
    public final String LIZIZ;
    public String LIZJ;
    public String LIZLLL;
    public String LJ;

    public C10R() {
    }

    public C10R(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            Object obj = jSONObject.get("response");
            if (obj instanceof JSONObject) {
                this.LIZ = (JSONObject) obj;
            } else if (obj instanceof String) {
                this.LIZ = new JSONObject((String) obj);
            }
            this.LIZLLL = this.LIZ.optString("error_code");
            this.LJ = this.LIZ.optString("error_message");
            this.LIZJ = this.LIZ.optString("result_code");
            this.LIZIZ = jSONObject.optString("sign");
        } catch (Throwable unused) {
        }
    }
}
