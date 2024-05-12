package X;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.JHf, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public class C48903JHf {
    public long LIZ;
    public long LIZIZ;
    public long LIZJ;
    public boolean LIZLLL;
    public int LJ;
    public String LJFF;

    public final JSONObject LIZ() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("startTime", this.LIZ);
            jSONObject.put("cost", this.LIZIZ);
            jSONObject.put("delay", this.LIZJ);
            jSONObject.put("isMessage", String.valueOf(this.LIZLLL));
            jSONObject.put("seqNum", this.LJ);
            jSONObject.put("stack", this.LJFF);
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
        }
        return jSONObject;
    }
}
