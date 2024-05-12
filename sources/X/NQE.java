package X;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class NQE implements F22 {
    public final /* synthetic */ long LJLIL;

    @Override // X.F22
    public final String getName() {
        return "progressUpdate";
    }

    @Override // X.F22
    public final Object getParams() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("current_time", this.LJLIL);
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
        }
        return jSONObject;
    }

    public NQE(long j) {
        this.LJLIL = j;
    }
}
