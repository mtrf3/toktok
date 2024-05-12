package X;

import com.ss.ttvideoengine.utils.TTVideoEngineLog;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.IbN, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C46929IbN implements InterfaceC46930IbO {
    public final int LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final int LIZLLL;
    public final String LJ;
    public final int LJFF;
    public final long LJI;

    @Override // X.InterfaceC46930IbO
    public final JSONObject LJJIII() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("url", this.LIZIZ);
            jSONObject.put("language_id", this.LIZ);
            jSONObject.put("format", this.LIZJ);
            jSONObject.put("language", this.LJ);
            jSONObject.put("id", this.LJFF);
            jSONObject.put("expire", this.LJI);
            jSONObject.put("sub_id", this.LIZLLL);
        } catch (JSONException e) {
            TTVideoEngineLog.d(e);
        }
        return jSONObject;
    }

    public final String toString() {
        JSONObject LJJIII = LJJIII();
        if (LJJIII.has("url") && LJJIII.has("language_id") && LJJIII.has("format") && LJJIII.has("sub_id")) {
            return LJJIII.toString();
        }
        return null;
    }

    public C46929IbN(JSONObject jSONObject) {
        this.LIZIZ = jSONObject.optString("url");
        this.LIZ = jSONObject.optInt("language_id");
        this.LIZJ = jSONObject.optString("format");
        this.LJ = jSONObject.optString("language");
        this.LJFF = jSONObject.optInt("id");
        this.LJI = jSONObject.optLong("expire");
        this.LIZLLL = jSONObject.optInt("sub_id");
    }
}
