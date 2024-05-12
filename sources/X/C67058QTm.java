package X;

import com.bytedance.sync.model.Topic;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.QTm, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C67058QTm implements InterfaceC67066QTu<Void> {
    public final InterfaceC67066QTu<Void> LIZ;
    public final Topic LIZIZ;
    public final String LIZJ;

    public final void LIZJ() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(this.LIZIZ);
        LIZ.append(" ");
        LIZ.append(this.LIZJ);
        LIZ.append(" success");
        C66629QCz.LIZ(X1D.LIZIZ(LIZ));
        InterfaceC67066QTu<Void> interfaceC67066QTu = this.LIZ;
        if (interfaceC67066QTu != null) {
            ((C67058QTm) interfaceC67066QTu).LIZJ();
        }
        LIZ(0, null, true);
    }

    public final void LIZIZ(InterfaceC67065QTt interfaceC67065QTt) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(this.LIZIZ);
        LIZ.append(" ");
        LIZ.append(this.LIZJ);
        LIZ.append(" failed. reason :code-> ");
        LIZ.append(interfaceC67065QTt.getErrorCode());
        LIZ.append(", msg = ");
        LIZ.append(interfaceC67065QTt.getErrorMsg());
        C66629QCz.LIZ(X1D.LIZIZ(LIZ));
        InterfaceC67066QTu<Void> interfaceC67066QTu = this.LIZ;
        if (interfaceC67066QTu != null) {
            ((C67058QTm) interfaceC67066QTu).LIZIZ(interfaceC67065QTt);
        }
        LIZ(interfaceC67065QTt.getErrorCode(), interfaceC67065QTt.getErrorMsg(), false);
    }

    public C67058QTm(Topic topic, String str, InterfaceC67066QTu<Void> interfaceC67066QTu) {
        this.LIZ = interfaceC67066QTu;
        this.LIZIZ = topic;
        this.LIZJ = str;
    }

    public final void LIZ(int i, String str, boolean z) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("success", z);
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
        }
        C77413UZt.LJJIII("method", this.LIZJ, jSONObject);
        try {
            jSONObject.put("business", this.LIZIZ.business);
        } catch (JSONException e2) {
            C16880lQ.LLLLIIL(e2);
        }
        if (!z) {
            C77413UZt.LJJII(i, "error_code", jSONObject);
            C77413UZt.LJJIII("error_msg", str, jSONObject);
        }
        PV6.LIZ("sync_sdk_custom_topic", jSONObject, null, null);
    }
}
