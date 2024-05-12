package X;

import java.util.Collection;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes15.dex */
public class VMG extends QXX {
    public String LJLIL;
    public String LJLILLLLZI;
    public String LJLJI;
    public String LJLJJI;
    public long LJLJJL;
    public String LJLJJLL;
    public JSONObject LJLJL;
    public final JSONObject LJLJLJ;
    public long LJLJLLL;
    public long LJLL;
    public long LJLLI;
    public Boolean LJLLILLLL;
    public final List<String> LJLLJ;

    public VMG() {
        super((Object) null);
        this.LJLILLLLZI = C3DQ.LIZ();
        this.LJLJI = null;
        this.LJLJJI = null;
        this.LJLJJL = 0L;
        this.LJLJLJ = new JSONObject();
        this.LJLLJ = C38697FGr.LIZ;
    }

    @Override // X.QXX
    public void LLFFF(JSONObject jSONObject) {
        C77123UOp.LJJJJZI("navigation_id", this.LJLILLLLZI, jSONObject);
        C77123UOp.LJJJJZI("url", this.LJLIL, jSONObject);
        C77123UOp.LJJJJZI("container_type", this.LJLJI, jSONObject);
        C77123UOp.LJJJJZI("native_page", this.LJLJJI, jSONObject);
        C77123UOp.LJJJJZI("sdk_version", "1.5.14-rc.16-oversea", jSONObject);
        C77123UOp.LJJJJZI("virtual_aid", this.LJLJJLL, jSONObject);
        C77123UOp.LJJJLIIL(jSONObject, "context", this.LJLJL);
        C77123UOp.LJJJJZI("sdk_version", "1.5.14-rc.16-oversea", jSONObject);
        C77123UOp.LJJJLIIL(jSONObject, "debug_context", this.LJLJLJ);
        long j = this.LJLJLLL;
        if (j != 0) {
            C77123UOp.LJJJJZ("container_init_ts", j, jSONObject);
        }
        long j2 = this.LJLL;
        if (j2 != 0) {
            C77123UOp.LJJJJZ("attach_ts", j2, jSONObject);
        }
        long j3 = this.LJLLI;
        if (j3 != 0) {
            C77123UOp.LJJJJZ("detach_ts", j3, jSONObject);
        }
        Boolean bool = this.LJLLILLLL;
        if (bool != null) {
            C77123UOp.LJJJLIIL(jSONObject, "container_reuse", bool);
        }
        C77123UOp.LJJJJZI("monitor_package", "monitorV2", this.LJLJLJ);
        if (VMS.vidReport.isEnabled()) {
            C77123UOp.LJJJLIIL(jSONObject, "vids", new JSONArray((Collection) this.LJLLJ));
        }
    }

    public final void LLLLZ(Object obj, String str) {
        if (this.LJLJL == null) {
            this.LJLJL = new JSONObject();
        }
        C77123UOp.LJJJJZI(str, String.valueOf(obj), this.LJLJL);
    }
}
