package X;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.QJw, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66808QJw extends QXX {
    public long LJLIL;
    public long LJLILLLLZI;
    public int LJLJI;
    public boolean LJLJJI;
    public boolean LJLJJL;
    public int LJLJJLL;
    public int LJLJL;
    public boolean LJLJLJ;

    public C66808QJw() {
        super((Object) null);
    }

    @Override // X.QXX
    public final JSONObject LLIIL() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("params_for_special", "uc_login");
            jSONObject.put("duration", this.LJLILLLLZI - this.LJLIL);
            jSONObject.put("retry_count", this.LJLJI);
            jSONObject.put("is_first", this.LJLJJL);
            jSONObject.put("did_change", this.LJLJJI);
            jSONObject.put("is_new_user_mode", this.LJLJJLL);
            jSONObject.put(WM7.SCENE_SERVICE, this.LJLJL);
            jSONObject.put("result", this.LJLJLJ);
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
        }
        return jSONObject;
    }

    @Override // X.QXX
    public final void LLLLILI() {
        this.LJLIL = 0L;
        this.LJLILLLLZI = 0L;
        this.LJLJI = 0;
        this.LJLJJI = false;
        this.LJLJJL = false;
        this.LJLJLJ = false;
    }
}
