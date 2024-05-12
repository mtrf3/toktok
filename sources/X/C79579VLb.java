package X;

import org.json.JSONObject;

/* renamed from: X.VLb, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C79579VLb extends AbstractC38228EzQ {
    public final /* synthetic */ C79578VLa LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C79579VLb(C79578VLa c79578VLa) {
        super("performance");
        this.LJLILLLLZI = c79578VLa;
    }

    @Override // X.QXX
    public final void LLFFF(JSONObject jSONObject) {
        C77123UOp.LJJJJZ("page_start", this.LJLILLLLZI.LJ, jSONObject);
        C77123UOp.LJJJJZ("page_finish", this.LJLILLLLZI.LJFF, jSONObject);
        C77123UOp.LJJJJZ("page_progress_100", this.LJLILLLLZI.LJI, jSONObject);
        C77123UOp.LJJJJZ("show_start", this.LJLILLLLZI.LJIIIIZZ, jSONObject);
        C77123UOp.LJJJJZ("show_end", this.LJLILLLLZI.LJIIIZ, jSONObject);
        C79578VLa c79578VLa = this.LJLILLLLZI;
        if (c79578VLa.LJIIL) {
            C77123UOp.LJJJJZ("init_time", c79578VLa.LJIIJ, jSONObject);
        }
        C77123UOp.LJJJJZ("inject_js_time", this.LJLILLLLZI.LJII, jSONObject);
        C77123UOp.LJJJJLL(this.LJLILLLLZI.LJIIJJI, "load_state", jSONObject);
        C77123UOp.LJJJLIIL(jSONObject, "event_counts", this.LJLILLLLZI.LJIILJJIL);
        C77123UOp.LJJJJZ("load_start", this.LJLILLLLZI.LIZ.LJLLL, jSONObject);
        C77123UOp.LJJJLIIL(jSONObject, "is_first_page_started", Boolean.valueOf(this.LJLILLLLZI.LJIILIIL));
    }
}
