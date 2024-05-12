package X;

import org.json.JSONObject;

/* loaded from: classes15.dex */
public final class VM0 extends AbstractC38228EzQ {
    public String LJLILLLLZI;
    public int LJLJI;
    public String LJLJJI;

    public VM0() {
        super("nativeError");
        this.LJLILLLLZI = "lynx_error";
    }

    @Override // X.QXX
    public final void LLFFF(JSONObject jSONObject) {
        C77123UOp.LJJJJZI(WM7.SCENE_SERVICE, this.LJLILLLLZI, jSONObject);
        C77123UOp.LJJJJLL(this.LJLJI, "error_code", jSONObject);
        C77123UOp.LJJJJZI("error_msg", this.LJLJJI, jSONObject);
    }
}
