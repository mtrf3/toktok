package X;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class QK1 extends QXX {
    public int LJLIL;
    public int LJLILLLLZI;
    public int LJLJI;
    public long LJLJJI;

    public QK1() {
        super((Object) null);
    }

    @Override // X.QXX
    public final void LLLLILI() {
    }

    @Override // X.QXX
    public final JSONObject LLIIL() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("params_for_special", "uc_login");
            jSONObject.put("type", this.LJLIL);
            jSONObject.put("state", this.LJLILLLLZI);
            jSONObject.put("flag", this.LJLJI);
            jSONObject.put("duration", this.LJLJJI);
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
        }
        return jSONObject;
    }
}
