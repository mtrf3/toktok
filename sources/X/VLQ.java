package X;

import org.json.JSONObject;

/* loaded from: classes15.dex */
public final class VLQ extends AbstractC38228EzQ {
    public String LJLILLLLZI;
    public String LJLJI;
    public int LJLJJI;
    public int LJLJJL;
    public String LJLJJLL;
    public int LJLJL;
    public String LJLJLJ;
    public int LJLJLLL;

    public VLQ() {
        super("fetchError");
    }

    @Override // X.QXX
    public final void LLFFF(JSONObject jSONObject) {
        C77123UOp.LJJJJZI("method", this.LJLILLLLZI, jSONObject);
        C77123UOp.LJJJJLL(this.LJLJLLL, "error_no", jSONObject);
        C77123UOp.LJJJJZI("error_msg", this.LJLJLJ, jSONObject);
        C77123UOp.LJJJJZI("url", this.LJLJI, jSONObject);
        C77123UOp.LJJJJLL(this.LJLJJI, "status_code", jSONObject);
        C77123UOp.LJJJJLL(this.LJLJJL, "request_error_code", jSONObject);
        C77123UOp.LJJJJZI("request_error_msg", this.LJLJJLL, jSONObject);
        C77123UOp.LJJJJLL(this.LJLJL, "jsb_ret", jSONObject);
        C77123UOp.LJJJJLL(0, "hit_prefetch", jSONObject);
    }
}
