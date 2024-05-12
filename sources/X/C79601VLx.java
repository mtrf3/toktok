package X;

import org.json.JSONObject;

/* renamed from: X.VLx, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C79601VLx extends AbstractC38228EzQ {
    public double LJLILLLLZI;
    public double LJLJI;
    public double LJLJJI;
    public double LJLJJL;
    public double LJLJJLL;
    public double LJLJL;
    public double LJLJLJ;
    public double LJLJLLL;
    public double LJLL;
    public double LJLLI;
    public C79580VLc LJLLILLLL;
    public JSONObject LJLLJ;
    public int LJLLL;
    public final long LJLLLL;
    public java.util.Map<String, Object> LJLLLLLL;

    public C79601VLx() {
        super("performance");
        this.LJLLLL = System.currentTimeMillis();
    }

    @Override // X.QXX
    public final void LLFFF(JSONObject jSONObject) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        C77123UOp.LJIJJLI(jSONObject, this.LJLLJ);
        C77123UOp.LJJJLIIL(jSONObject, "fp", Double.valueOf(this.LJLILLLLZI));
        C77123UOp.LJJJLIIL(jSONObject, "fmp", Double.valueOf(this.LJLJI));
        C77123UOp.LJJJLIIL(jSONObject, "tti", Double.valueOf(this.LJLJJI));
        C77123UOp.LJJJLIIL(jSONObject, "Layout", Double.valueOf(this.LJLJJL));
        C77123UOp.LJJJLIIL(jSONObject, "render_page", Double.valueOf(this.LJLLI));
        C77123UOp.LJJJLIIL(jSONObject, "Diff_root_create", Double.valueOf(this.LJLJJLL));
        C77123UOp.LJJJLIIL(jSONObject, "Diff_same_root", Double.valueOf(this.LJLJL));
        C77123UOp.LJJJLIIL(jSONObject, "tasm_binary_decode", Double.valueOf(this.LJLJLLL));
        C77123UOp.LJJJLIIL(jSONObject, "tasm_end_decode_finish_load_template", Double.valueOf(this.LJLJLJ));
        C77123UOp.LJJJLIIL(jSONObject, "tasm_finish_load_template", Double.valueOf(this.LJLL));
        C77123UOp.LJJJJLL(this.LJLLL, "state", jSONObject);
        C77123UOp.LJJJJZ("report_ts", this.LJLLLL, jSONObject);
        JSONObject jSONObject2 = new JSONObject();
        java.util.Map<String, Object> map = this.LJLLLLLL;
        Object obj7 = null;
        if (map != null && map.get("metrics") != null) {
            java.util.Map<String, Object> map2 = this.LJLLLLLL;
            if (map2 != null) {
                obj6 = map2.get("metrics");
            } else {
                obj6 = null;
            }
            C77123UOp.LJJJLIIL(jSONObject2, "metrics", C77123UOp.LJJJLL(String.valueOf(obj6)));
        }
        java.util.Map<String, Object> map3 = this.LJLLLLLL;
        if (map3 != null && map3.get("setup_timing") != null) {
            java.util.Map<String, Object> map4 = this.LJLLLLLL;
            if (map4 != null) {
                obj5 = map4.get("setup_timing");
            } else {
                obj5 = null;
            }
            C77123UOp.LJJJLIIL(jSONObject2, "setup_timing", C77123UOp.LJJJLL(String.valueOf(obj5)));
        }
        java.util.Map<String, Object> map5 = this.LJLLLLLL;
        if (map5 != null && map5.get("update_timings") != null) {
            java.util.Map<String, Object> map6 = this.LJLLLLLL;
            if (map6 != null) {
                obj4 = map6.get("update_timings");
            } else {
                obj4 = null;
            }
            C77123UOp.LJJJLIIL(jSONObject2, "update_timings", C77123UOp.LJJJLL(String.valueOf(obj4)));
        }
        java.util.Map<String, Object> map7 = this.LJLLLLLL;
        if (map7 != null && map7.get("extra_timing") != null) {
            java.util.Map<String, Object> map8 = this.LJLLLLLL;
            if (map8 != null) {
                obj3 = map8.get("extra_timing");
            } else {
                obj3 = null;
            }
            C77123UOp.LJJJLIIL(jSONObject2, "extra_timing", C77123UOp.LJJJLL(String.valueOf(obj3)));
        }
        java.util.Map<String, Object> map9 = this.LJLLLLLL;
        if (map9 != null && map9.get("thread_strategy") != null) {
            java.util.Map<String, Object> map10 = this.LJLLLLLL;
            if (map10 != null) {
                obj2 = map10.get("thread_strategy");
            } else {
                obj2 = null;
            }
            C77123UOp.LJJJLIIL(jSONObject2, "thread_strategy", obj2);
        }
        java.util.Map<String, Object> map11 = this.LJLLLLLL;
        if (map11 != null) {
            obj = map11.get("url");
        } else {
            obj = null;
        }
        if (String.valueOf(obj).length() > 0) {
            java.util.Map<String, Object> map12 = this.LJLLLLLL;
            if (map12 != null) {
                obj7 = map12.get("url");
            }
            C77123UOp.LJJJLIIL(jSONObject2, "url", obj7);
        }
        C77123UOp.LJIJJLI(jSONObject, jSONObject2);
        C79580VLc c79580VLc = this.LJLLILLLL;
        if (c79580VLc != null) {
            c79580VLc.LLFFF(jSONObject);
        }
    }

    public final void LLLLZ(int i) {
        UC7.LIZLLL("set lynx_state = ", i);
        this.LJLLL = i;
    }
}
