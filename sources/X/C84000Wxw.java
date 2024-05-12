package X;

import jp3.c;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.Wxw, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C84000Wxw implements InterfaceC84052Wym {
    public final /* synthetic */ float LIZ;
    public final /* synthetic */ InterfaceC84052Wym LIZIZ;

    @Override // X.InterfaceC84052Wym
    public final void LIZ(int i) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("speed", this.LIZ);
            jSONObject.put("resultCode", i);
            c.LIZ("vesdk_event_recorder_start_record_async", "business", jSONObject);
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
        }
        InterfaceC84052Wym interfaceC84052Wym = this.LIZIZ;
        if (interfaceC84052Wym != null) {
            interfaceC84052Wym.LIZ(i);
        }
    }

    public C84000Wxw(float f, C83999Wxv c83999Wxv) {
        this.LIZ = f;
        this.LIZIZ = c83999Wxv;
    }
}
