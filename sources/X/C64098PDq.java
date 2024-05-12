package X;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.PDq, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64098PDq implements InterfaceC64090PDi {
    public final String LIZ;
    public final String LIZIZ;
    public final float LIZJ;

    @Override // X.InterfaceC64090PDi
    public final String LIZIZ() {
        return "timer";
    }

    @Override // X.InterfaceC64090PDi
    public final boolean LIZJ() {
        return false;
    }

    @Override // X.InterfaceC64090PDi
    public final String LJ() {
        return "timer";
    }

    @Override // X.InterfaceC64090PDi
    public final JSONObject LIZ() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("type", this.LIZ);
            jSONObject.put("key", this.LIZIZ);
            jSONObject.put("value", this.LIZJ);
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }

    @Override // X.InterfaceC64090PDi
    public final boolean LIZLLL(JSONObject jSONObject) {
        return C64099PDr.LIZ.LJIIZILJ(this.LIZ);
    }

    public C64098PDq(String str, String str2, float f) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = f;
    }
}
