package X;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.0x1, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C24070x1 {
    public final /* synthetic */ int LIZ = 1;
    public String LIZIZ;
    public String LIZJ;
    public Object LIZLLL;
    public Object LJ;

    public C24070x1() {
    }

    public final String toString() {
        switch (this.LIZ) {
            case 0:
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("mBody", this.LIZLLL);
                    jSONObject.put("mHeader", this.LJ);
                    jSONObject.put("mMethod", this.LIZIZ);
                    jSONObject.put("mUrl", this.LIZJ);
                } catch (JSONException e) {
                    C16880lQ.LLLLIIL(e);
                }
                return jSONObject.toString();
            default:
                return super.toString();
        }
    }

    public C24070x1(String str, String str2, JSONObject jSONObject, JSONObject jSONObject2) {
        this.LIZLLL = jSONObject;
        this.LJ = jSONObject2;
        this.LIZIZ = str;
        this.LIZJ = str2;
    }
}
