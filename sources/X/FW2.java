package X;

import org.json.JSONObject;

/* loaded from: classes7.dex */
public class FW2 {
    public String LIZ;
    public long LIZIZ;

    public final int hashCode() {
        return super.hashCode();
    }

    public static FW2 LIZ(JSONObject jSONObject) {
        FW2 fw2 = new FW2();
        fw2.LIZ = jSONObject.optString("aid", "");
        fw2.LIZIZ = jSONObject.optLong("time", 0L);
        return fw2;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof FW2) && C38354F3m.LIZJ(((FW2) obj).LIZ, this.LIZ)) {
            return true;
        }
        return false;
    }
}
