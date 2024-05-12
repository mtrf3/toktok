package X;

import com.lynx.tasm.LynxEnv;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes15.dex */
public final class VMF extends VMG {
    public int LJLLL;
    public String LJLLLL = "";
    public final String LJLLLLLL;

    public VMF() {
        o.LJFF(LynxEnv.LJIIIZ(), "LynxEnv.inst()");
        this.LJLLLLLL = "2.10.16-rc.10";
        this.LJLJI = "lynx";
    }

    @Override // X.VMG, X.QXX
    public final void LLFFF(JSONObject jSONObject) {
        super.LLFFF(jSONObject);
        C77123UOp.LJJJJLL(this.LJLLL, "template_state", jSONObject);
        C77123UOp.LJJJJZI("lynx_version", this.LJLLLLLL, jSONObject);
        C77123UOp.LJJJJZI("page_version", this.LJLLLL, jSONObject);
    }
}
