package X;

import android.content.Context;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.QJl, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66797QJl implements QJU {
    public final Context LIZ;
    public QIF LIZIZ;

    public C66797QJl(Context context) {
        this.LIZ = context;
    }

    @Override // X.QJU
    public final void LIZIZ(C66799QJn c66799QJn) {
        if (this.LIZIZ == null) {
            return;
        }
        c66799QJn.getClass();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("did", c66799QJn.LJLIL);
            jSONObject.put("iid", c66799QJn.LJLILLLLZI);
            jSONObject.put("openudid", c66799QJn.LJLJI);
            jSONObject.put("cliend_udid", c66799QJn.LJLJJI);
            jSONObject.put("ssid", c66799QJn.LJLJJL);
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
        }
        String jSONObject2 = jSONObject.toString();
        if (this.LIZIZ.LJJIIZI) {
            F9J.LIZIZ(this.LIZ, 0, "ug_install_op_pref").edit().putString("install_info", jSONObject2).apply();
        }
        JG8.LIZ(this.LIZ).LIZJ(this.LIZIZ.LIZ(), "install_info", jSONObject2);
    }
}
