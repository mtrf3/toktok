package X;

import org.json.JSONObject;

/* renamed from: X.VLc, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C79580VLc extends QXX {
    public static final /* synthetic */ int LJLJLJ = 0;
    public long LJLIL;
    public long LJLILLLLZI;
    public long LJLJI;
    public long LJLJJI;
    public long LJLJJL;
    public long LJLJJLL;
    public int LJLJL;

    public C79580VLc() {
        super((Object) null);
        this.LJLJL = -1;
    }

    @Override // X.QXX
    public final void LLFFF(JSONObject jSONObject) {
        C77123UOp.LJJJJZ("load_start", this.LJLIL, jSONObject);
        C77123UOp.LJJJJZ("load_finish", this.LJLILLLLZI, jSONObject);
        C77123UOp.LJJJJZ("load_failed", 0L, jSONObject);
        C77123UOp.LJJJJZ("show_start", this.LJLJI, jSONObject);
        C77123UOp.LJJJJZ("show_end", this.LJLJJI, jSONObject);
        C77123UOp.LJJJJZ("receive_error", 0L, jSONObject);
        C77123UOp.LJJJJZ("first_screen", this.LJLJJL, jSONObject);
        C77123UOp.LJJJJZ("runtime_ready", this.LJLJJLL, jSONObject);
    }
}
