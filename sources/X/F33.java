package X;

import com.bytedance.android.monitorV2.lynx.LynxViewMonitor;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public final class F33 extends AbstractC65781Prl implements InterfaceC65784Pro<C76800UCe> {
    public final /* synthetic */ LynxViewMonitor LJLIL;
    public final /* synthetic */ VNS LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ String LJLJJI;
    public final /* synthetic */ String LJLJJL;
    public final /* synthetic */ String LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public F33(LynxViewMonitor lynxViewMonitor, VNS vns, String str, String str2, String str3, String str4) {
        super(0);
        this.LJLIL = lynxViewMonitor;
        this.LJLILLLLZI = vns;
        this.LJLJI = str;
        this.LJLJJI = str2;
        this.LJLJJL = str3;
        this.LJLJJLL = str4;
    }

    @Override // X.InterfaceC65784Pro
    public final C76800UCe invoke() {
        try {
            if (this.LJLILLLLZI != null) {
                JSONObject jSONObject = new JSONObject();
                C77123UOp.LJJJJZI("res_status", this.LJLJI, jSONObject);
                C77123UOp.LJJJJZI("res_type", this.LJLJJI, jSONObject);
                C77123UOp.LJJJJZI("res_url", this.LJLJJL, jSONObject);
                C77123UOp.LJJJJZI("container", "lynx", jSONObject);
                C77123UOp.LJJJJZI("res_version", this.LJLJJLL, jSONObject);
                LynxViewMonitor lynxViewMonitor = this.LJLIL;
                VNS vns = this.LJLILLLLZI;
                lynxViewMonitor.reportCustom(vns, "bd_monitor_get_resource", vns.getTemplateUrl(), jSONObject, null, null, null, 0);
            }
        } catch (Exception e) {
            C77117UOj.LJIIZILJ(e);
        }
        return C76800UCe.LIZ;
    }
}
