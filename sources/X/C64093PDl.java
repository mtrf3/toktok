package X;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.PDl, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64093PDl implements InterfaceC64090PDi {
    public final String LIZ;
    public final JSONObject LIZIZ;

    @Override // X.InterfaceC64090PDi
    public final boolean LIZJ() {
        return true;
    }

    @Override // X.InterfaceC64090PDi
    public final String LJ() {
        return "common_log";
    }

    @Override // X.InterfaceC64090PDi
    public final JSONObject LIZ() {
        JSONObject jSONObject = this.LIZIZ;
        if (jSONObject != null) {
            try {
                jSONObject.put("log_type", this.LIZ);
            } catch (JSONException unused) {
            }
            return this.LIZIZ;
        }
        return null;
    }

    @Override // X.InterfaceC64090PDi
    public final String LIZIZ() {
        return this.LIZ;
    }

    @Override // X.InterfaceC64090PDi
    public final boolean LIZLLL(JSONObject jSONObject) {
        return C64099PDr.LIZ.getLogTypeSwitch(this.LIZ);
    }

    public C64093PDl(JSONObject jSONObject, String str) {
        this.LIZ = str;
        this.LIZIZ = jSONObject;
    }
}
