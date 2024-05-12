package X;

import jp3.c;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.Wy2, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C84006Wy2 implements InterfaceC84052Wym {
    public final /* synthetic */ InterfaceC84052Wym LIZ;

    public C84006Wy2(C84010Wy6 c84010Wy6) {
        this.LIZ = c84010Wy6;
    }

    @Override // X.InterfaceC84052Wym
    public final void LIZ(int i) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("resultCode", i);
            c.LIZ("vesdk_event_recorder_record_finish", "business", jSONObject);
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
        }
        InterfaceC84052Wym interfaceC84052Wym = this.LIZ;
        if (interfaceC84052Wym != null) {
            interfaceC84052Wym.LIZ(i);
        }
    }
}
