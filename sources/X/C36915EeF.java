package X;

import org.json.JSONObject;

/* renamed from: X.EeF, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C36915EeF {
    public long LIZ;
    public int LIZIZ;
    public String LIZJ;
    public int LIZLLL;
    public String LJ;

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("MessageObj{id=");
        LIZ.append(this.LIZ);
        LIZ.append(", type=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", obj='");
        Q89.LIZIZ(LIZ, this.LIZJ, '\'', ", from=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", extra='");
        return C77800Ug8.LIZJ(LIZ, this.LJ, '\'', '}', LIZ);
    }

    public final void LIZ(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            this.LIZ = jSONObject.optLong("id");
            this.LIZIZ = jSONObject.optInt("type");
            this.LIZJ = jSONObject.optString("obj");
            this.LIZLLL = jSONObject.optInt("from");
            this.LJ = jSONObject.optString("extra");
        } catch (Throwable unused) {
        }
    }
}
