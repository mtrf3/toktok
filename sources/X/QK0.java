package X;

import android.content.SharedPreferences;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class QK0 extends QKR {
    public final QIF LJ;
    public final C48852JFg LJFF;

    @Override // X.QKR
    public final boolean LIZ(JSONObject jSONObject) {
        SharedPreferences LIZ = this.LJFF.LIZ(this.LJ);
        String deviceId = ((QKU) JFZ.LIZ(QKU.class, String.valueOf(this.LJ.LIZ))).getDeviceId();
        String string = LIZ.getString("bd_did", null);
        String string2 = LIZ.getString("install_id", null);
        String string3 = LIZ.getString("ssid", null);
        C36860EdM.LJFF("install_id", string2, jSONObject);
        C36860EdM.LJFF("device_id", deviceId, jSONObject);
        C36860EdM.LJFF("ssid", string3, jSONObject);
        C36860EdM.LJFF("bd_did", string, jSONObject);
        return true;
    }

    @Override // X.QKR
    public final void LIZIZ(JSONObject jSONObject) {
        jSONObject.remove("bd_did");
        jSONObject.remove("install_id");
        jSONObject.remove("ssid");
        jSONObject.remove("device_id");
    }

    public QK0(QIF qif, C48852JFg c48852JFg) {
        this.LJ = qif;
        this.LJFF = c48852JFg;
    }
}
