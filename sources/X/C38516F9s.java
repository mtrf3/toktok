package X;

import com.bytedance.android.monitorV2.HybridMultiMonitor;
import org.json.JSONObject;
import ujb.o;

/* renamed from: X.F9s, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38516F9s extends AbstractC65781Prl implements InterfaceC65784Pro<C76800UCe> {
    public final /* synthetic */ String LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ String LJLJJI;
    public final /* synthetic */ String LJLJJL;
    public final /* synthetic */ String LJLJJLL;
    public final /* synthetic */ String LJLJL;
    public final /* synthetic */ String LJLJLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C38516F9s(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        super(0);
        this.LJLIL = str;
        this.LJLILLLLZI = str2;
        this.LJLJI = str3;
        this.LJLJJI = str4;
        this.LJLJJL = str5;
        this.LJLJJLL = str6;
        this.LJLJL = str7;
        this.LJLJLJ = str8;
    }

    @Override // X.InterfaceC65784Pro
    public final C76800UCe invoke() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("optimization_name", this.LJLIL);
        jSONObject.put("optimization_stage", this.LJLILLLLZI);
        jSONObject.put("config_method", this.LJLJI);
        jSONObject.put("schema", this.LJLJJI);
        jSONObject.put("bid", this.LJLJJL);
        jSONObject.put("extra", this.LJLJJLL);
        jSONObject.put("state", this.LJLJL);
        C79605VMb c79605VMb = new C79605VMb("hybrid_monitor_container_optimization_capability");
        c79605VMb.LIZIZ = this.LJLJJL;
        c79605VMb.LJIIJJI = EnumC40073Fo5.Both;
        c79605VMb.LIZLLL = jSONObject;
        c79605VMb.LJIIIIZZ = this.LJLJLJ;
        C79604VMa LIZ = c79605VMb.LIZ();
        String str = this.LJLJLJ;
        if (str == null || o.LJJJJJL(str)) {
            HybridMultiMonitor.getInstance().customReport(LIZ);
        } else {
            OFH.LIZLLL.getClass();
            OFH.LIZLLL(LIZ);
        }
        C39048FUe c39048FUe = C39048FUe.LIZIZ;
        String jSONObject2 = jSONObject.toString();
        kotlin.jvm.internal.o.LJFF(jSONObject2, "category.toString()");
        C39048FUe.LIZIZ(c39048FUe, jSONObject2, null, "OptimizationCapability", 2);
        return C76800UCe.LIZ;
    }
}
