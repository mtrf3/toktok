package X;

import android.text.TextUtils;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class PCC implements InterfaceC64036PBg {
    public final String LIZ;
    public JSONObject LIZIZ;

    @Override // X.InterfaceC64036PBg
    public final boolean LIZJ() {
        return false;
    }

    @Override // X.InterfaceC64036PBg
    public final JSONObject LIZ() {
        InterfaceC64004PAa interfaceC64004PAa;
        try {
            JSONObject jSONObject = this.LIZIZ;
            if (jSONObject == null) {
                jSONObject = new JSONObject();
            }
            jSONObject.put("log_type", this.LIZ);
            return jSONObject;
        } catch (Exception unused) {
            if (C78248UnM.LJIIJ() && (interfaceC64004PAa = C64028PAy.LIZ) != null) {
                interfaceC64004PAa.LIZIZ();
                return null;
            }
            return null;
        }
    }

    @Override // X.InterfaceC64036PBg
    public final boolean isValid() {
        return !TextUtils.isEmpty(this.LIZ);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("CommonLog{logType='");
        return C77800Ug8.LIZJ(LIZ, this.LIZ, '\'', '}', LIZ);
    }

    @Override // X.InterfaceC64036PBg
    public final String LIZIZ() {
        return this.LIZ;
    }

    public PCC(String str, JSONObject jSONObject) {
        this.LIZ = str;
        this.LIZIZ = jSONObject;
    }
}
