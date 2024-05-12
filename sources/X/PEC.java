package X;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class PEC implements InterfaceC64090PDi {
    public final String LIZ;
    public final String LIZIZ;
    public final JSONObject LIZJ;
    public JSONObject LIZLLL = null;

    @Override // X.InterfaceC64090PDi
    public final String LIZIZ() {
        return "ui_action";
    }

    @Override // X.InterfaceC64090PDi
    public final boolean LIZJ() {
        return true;
    }

    @Override // X.InterfaceC64090PDi
    public final String LJ() {
        return "ui_action";
    }

    @Override // X.InterfaceC64090PDi
    public final JSONObject LIZ() {
        try {
            if (this.LIZLLL == null) {
                this.LIZLLL = new JSONObject();
            }
            this.LIZLLL.put("log_type", "ui_action");
            this.LIZLLL.put("action", this.LIZ);
            this.LIZLLL.put("page", this.LIZIZ);
            this.LIZLLL.put("context", this.LIZJ);
            return this.LIZLLL;
        } catch (JSONException unused) {
            return null;
        }
    }

    @Override // X.InterfaceC64090PDi
    public final boolean LIZLLL(JSONObject jSONObject) {
        return C64099PDr.LIZ("ui");
    }

    public PEC(String str, String str2, JSONObject jSONObject) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = jSONObject;
    }
}
