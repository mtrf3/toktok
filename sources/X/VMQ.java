package X;

import org.json.JSONObject;

/* loaded from: classes15.dex */
public final class VMQ extends AbstractC38228EzQ {
    public float LJLILLLLZI;
    public int LJLJI;
    public int LJLJJI;
    public long LJLJJL;
    public long LJLJJLL;
    public long LJLJL;
    public int LJLJLJ;
    public long LJLJLLL;
    public long LJLL;
    public int LJLLI;
    public int LJLLILLLL;
    public int LJLLJ;
    public float LJLLL;
    public int LJLLLL;
    public int LJLLLLLL;
    public String LJLZ;
    public int LJZ;
    public int LJZI;

    public VMQ() {
        super("blank");
        this.LJLLJ = -1;
        this.LJLLL = -1.0f;
        this.LJLZ = "";
    }

    @Override // X.QXX
    public final void LLFFF(JSONObject jSONObject) {
        C77123UOp.LJJJLIIL(jSONObject, "effective_percentage", Float.valueOf(this.LJLILLLLZI));
        C77123UOp.LJJJJLL(this.LJLJI, "view_height", jSONObject);
        C77123UOp.LJJJJLL(this.LJLJJI, "view_width", jSONObject);
        C77123UOp.LJJJJLL(this.LJLLLL, "view_alpha", jSONObject);
        C77123UOp.LJJJJLL(this.LJLLLLLL, "element_count", jSONObject);
        C77123UOp.LJJJJZ("collect_time", this.LJLJJLL, jSONObject);
        C77123UOp.LJJJJZ("calculate_time", this.LJLJL, jSONObject);
        C77123UOp.LJJJJZ("cost_time", this.LJLJJL, jSONObject);
        C77123UOp.LJJJJLL(this.LJLJLJ, "detect_type", jSONObject);
        C77123UOp.LJJJJZ("enter_page_time", this.LJLJLLL, jSONObject);
        C77123UOp.LJJJJZ("detect_start_time", this.LJLL, jSONObject);
        float f = this.LJLLL;
        if (f > 0) {
            C77123UOp.LJJJLIIL(jSONObject, "max_blank_rect_radio", Float.valueOf(f));
        }
        JSONObject jSONObject2 = new JSONObject();
        int i = this.LJLLI;
        if (i != 0) {
            C77123UOp.LJJJJLL(i, "http_rtt_ms", jSONObject2);
        }
        int i2 = this.LJLLILLLL;
        if (i2 != 0) {
            C77123UOp.LJJJJLL(i2, "transport_rtt_ms", jSONObject2);
        }
        int i3 = this.LJLLJ;
        if (i3 >= 0) {
            C77123UOp.LJJJJLL(i3, "load_state", jSONObject2);
        }
        C77123UOp.LJJJLIIL(jSONObject, "assist_info", jSONObject2);
        C77123UOp.LJJJJZI("bitmap", this.LJLZ, jSONObject);
        C77123UOp.LJJJJLL(this.LJZ, "bitmap_width", jSONObject);
        C77123UOp.LJJJJLL(this.LJZI, "bitmap_height", jSONObject);
    }
}
