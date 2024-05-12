package X;

import org.json.JSONObject;

/* loaded from: classes15.dex */
public final class VMT extends VMG {
    public long LJLLL;
    public String LJLLLL = "web";
    public final JSONObject LJLLLLLL = new JSONObject();
    public final JSONObject LJLZ = new JSONObject();

    @Override // X.VMG, X.QXX
    public final void LLFFF(JSONObject jSONObject) {
        boolean z;
        super.LLFFF(jSONObject);
        C77123UOp.LJJJJZI("js_dependency_version", "2.2.1", jSONObject);
        C77123UOp.LJJJJZI("webview_type", this.LJLLLL, jSONObject);
        C77123UOp.LJIJJLI(jSONObject, this.LJLLLLLL);
        C77123UOp.LJIJJLI(jSONObject, this.LJLZ);
        JSONObject optJSONObject = jSONObject.optJSONObject("debug_context");
        if (optJSONObject == null) {
            optJSONObject = new JSONObject();
            C77123UOp.LJJJLIIL(jSONObject, "debug_context", optJSONObject);
        }
        VMI vmi = VMI.LJ;
        vmi.LIZLLL.getClass();
        if (vmi.LIZLLL.LIZ && VMS.webTTWebDelegate.isEnabled()) {
            z = true;
        } else {
            z = false;
        }
        C77123UOp.LJJJJZI("is_ttweb_enable", String.valueOf(z), optJSONObject);
    }
}
