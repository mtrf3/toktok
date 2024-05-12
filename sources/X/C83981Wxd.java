package X;

import jp3.c;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.Wxd, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C83981Wxd implements InterfaceC84052Wym {
    public final /* synthetic */ InterfaceC84052Wym LIZ;

    public C83981Wxd(InterfaceC84052Wym interfaceC84052Wym) {
        this.LIZ = interfaceC84052Wym;
    }

    @Override // X.InterfaceC84052Wym
    public final void LIZ(int i) {
        InterfaceC84052Wym interfaceC84052Wym = this.LIZ;
        if (interfaceC84052Wym != null) {
            interfaceC84052Wym.LIZ(i);
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("resultCode", i);
            c.LIZ("vesdk_event_recorder_start_preview_async", "business", jSONObject);
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
        }
    }
}
