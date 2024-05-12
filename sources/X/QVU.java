package X;

import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class QVU extends QW1 {
    @Override // X.QW1
    public final void LIZ() {
        JSONObject jSONObject = new JSONObject();
        C77413UZt.LJJII(this.LIZ, "send_method", jSONObject);
        C77413UZt.LJJII(this.LIZIZ, "send_result", jSONObject);
        C77413UZt.LJJII(this.LIZJ, "send_msg_type", jSONObject);
        C77413UZt.LJJII(this.LIZLLL, "ws_connect", jSONObject);
        PV6.LIZ("sync_sdk_ws_poll", jSONObject, null, null);
    }
}
