package X;

import android.text.TextUtils;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class PCD implements InterfaceC64036PBg {
    public final String LIZ;
    public final int LIZIZ;
    public JSONObject LIZJ;
    public JSONObject LIZLLL;
    public JSONObject LJ;
    public JSONObject LJFF;

    @Override // X.InterfaceC64036PBg
    public final String LIZIZ() {
        return "service_monitor";
    }

    @Override // X.InterfaceC64036PBg
    public final boolean LIZJ() {
        return false;
    }

    @Override // X.InterfaceC64036PBg
    public final JSONObject LIZ() {
        InterfaceC64004PAa interfaceC64004PAa;
        try {
            JSONObject jSONObject = this.LJFF;
            if (jSONObject == null) {
                jSONObject = new JSONObject();
            }
            jSONObject.put("log_type", "service_monitor");
            jSONObject.put("service", this.LIZ);
            jSONObject.put("status", this.LIZIZ);
            JSONObject jSONObject2 = this.LIZJ;
            if (jSONObject2 != null) {
                jSONObject.put("value", jSONObject2);
            }
            JSONObject jSONObject3 = this.LIZLLL;
            if (jSONObject3 != null) {
                jSONObject.put("category", jSONObject3);
            }
            JSONObject jSONObject4 = this.LJ;
            if (jSONObject4 != null) {
                jSONObject.put("metric", jSONObject4);
            }
            return jSONObject;
        } catch (Exception unused) {
            if (C78248UnM.LJIIJ() && (interfaceC64004PAa = C64028PAy.LIZ) != null) {
                interfaceC64004PAa.LIZIZ();
                return null;
            }
            return null;
        }
    }

    public final void LIZLLL() {
        this.LIZJ = C64055PBz.LJFF(this.LIZJ);
        this.LIZLLL = C64055PBz.LJFF(this.LIZLLL);
        this.LJ = C64055PBz.LJFF(this.LJ);
        this.LJFF = C64055PBz.LJFF(this.LJFF);
    }

    @Override // X.InterfaceC64036PBg
    public final boolean isValid() {
        return !TextUtils.isEmpty(this.LIZ);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("CommonEvent{serviceName='");
        return C77800Ug8.LIZJ(LIZ, this.LIZ, '\'', '}', LIZ);
    }

    public PCD(String str, int i, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4) {
        this.LIZ = str;
        this.LIZIZ = i;
        this.LIZJ = jSONObject;
        this.LIZLLL = jSONObject2;
        this.LJ = jSONObject3;
        this.LJFF = jSONObject4;
    }
}
