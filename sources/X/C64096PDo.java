package X;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.PDo, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64096PDo implements InterfaceC64090PDi {
    public final String LIZ;
    public final int LIZIZ;
    public final JSONObject LIZJ;
    public final JSONObject LIZLLL;
    public final JSONObject LJ;
    public JSONObject LJFF;

    @Override // X.InterfaceC64090PDi
    public final String LIZIZ() {
        return "service_monitor";
    }

    @Override // X.InterfaceC64090PDi
    public final boolean LIZJ() {
        return true;
    }

    @Override // X.InterfaceC64090PDi
    public final String LJ() {
        return "service_monitor";
    }

    @Override // X.InterfaceC64090PDi
    public final JSONObject LIZ() {
        if (this.LJFF == null) {
            this.LJFF = new JSONObject();
        }
        try {
            this.LJFF.put("log_type", "service_monitor");
            this.LJFF.put("service", this.LIZ);
            this.LJFF.put("status", this.LIZIZ);
            JSONObject jSONObject = this.LIZJ;
            if (jSONObject != null) {
                this.LJFF.put("value", jSONObject);
            }
            JSONObject jSONObject2 = this.LIZLLL;
            if (jSONObject2 != null) {
                this.LJFF.put("category", jSONObject2);
            }
            JSONObject jSONObject3 = this.LJ;
            if (jSONObject3 != null) {
                this.LJFF.put("metric", jSONObject3);
            }
            return this.LJFF;
        } catch (JSONException unused) {
            return null;
        }
    }

    @Override // X.InterfaceC64090PDi
    public final boolean LIZLLL(JSONObject jSONObject) {
        return C64099PDr.LIZ.getServiceSwitch(this.LIZ);
    }

    public C64096PDo(String str, int i, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        this.LIZ = str;
        this.LIZIZ = i;
        this.LIZJ = null;
        this.LIZLLL = jSONObject;
        this.LJ = jSONObject2;
        this.LJFF = jSONObject3;
    }

    public C64096PDo(String str, int i, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4) {
        this.LIZ = str;
        this.LIZIZ = i;
        this.LIZJ = jSONObject;
        this.LIZLLL = jSONObject2;
        this.LJ = jSONObject3;
        this.LJFF = jSONObject4;
    }
}
