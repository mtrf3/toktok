package X;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class QVS extends QW1 {
    public final boolean LJ;
    public final int LJFF;

    @Override // X.QW1
    public final void LIZ() {
        JSONObject jSONObject = new JSONObject();
        C77413UZt.LJJII(this.LIZ, "send_method", jSONObject);
        C77413UZt.LJJII(this.LIZIZ, "send_result", jSONObject);
        try {
            jSONObject.put("is_foreground", this.LJ);
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
        }
        C77413UZt.LJJII(this.LJFF, "strategy", jSONObject);
        C77413UZt.LJJII(this.LIZJ, "send_msg_type", jSONObject);
        C77413UZt.LJJII(this.LIZLLL, "ws_connect", jSONObject);
        PV6.LIZ("sync_sdk_compensator_net_monitor", jSONObject, null, null);
    }

    public QVS(boolean z, InterfaceC67081QUj interfaceC67081QUj) {
        int i;
        this.LJ = z;
        if (interfaceC67081QUj != null) {
            i = interfaceC67081QUj.LIZLLL();
        } else {
            i = 0;
        }
        this.LJFF = i;
    }
}
