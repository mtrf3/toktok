package X;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.QJx, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66809QJx extends QXX {
    public long LJLIL;
    public long LJLILLLLZI;
    public long LJLJI;
    public boolean LJLJJI;
    public int LJLJJL;
    public int LJLJJLL;
    public boolean LJLJL;

    public C66809QJx() {
        super((Object) null);
    }

    @Override // X.QXX
    public final JSONObject LLIIL() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("params_for_special", "uc_login");
            jSONObject.put("duration", this.LJLILLLLZI - this.LJLIL);
            jSONObject.put("retry_count", this.LJLJI);
            jSONObject.put("is_first", this.LJLJJI);
            jSONObject.put("is_new_user_mode", this.LJLJJL);
            jSONObject.put(WM7.SCENE_SERVICE, this.LJLJJLL);
            jSONObject.put("result", this.LJLJL);
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
        }
        return jSONObject;
    }

    @Override // X.QXX
    public final void LLLLILI() {
        this.LJLIL = 0L;
        this.LJLILLLLZI = 0L;
        this.LJLJI = 0L;
        this.LJLJJI = false;
        this.LJLJL = false;
    }
}
