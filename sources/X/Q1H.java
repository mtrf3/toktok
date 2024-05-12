package X;

import kotlin.jvm.internal.o;
import org.json.JSONObject;
import ujb.s;

/* loaded from: classes12.dex */
public final class Q1H extends AbstractC65781Prl implements InterfaceC88472Yns<C66322Q1e, C76800UCe> {
    public final /* synthetic */ C66318Q1a LJLIL;
    public final /* synthetic */ int LJLILLLLZI;
    public final /* synthetic */ int LJLJI;
    public final /* synthetic */ int LJLJJI;
    public final /* synthetic */ String LJLJJL;
    public final /* synthetic */ String LJLJJLL;
    public final /* synthetic */ C66320Q1c LJLJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Q1H(int i, int i2, int i3, C66320Q1c c66320Q1c, C66318Q1a c66318Q1a, String str, String str2) {
        super(1);
        this.LJLIL = c66318Q1a;
        this.LJLILLLLZI = i;
        this.LJLJI = i2;
        this.LJLJJI = i3;
        this.LJLJJL = str;
        this.LJLJJLL = str2;
        this.LJLJL = c66320Q1c;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(C66322Q1e c66322Q1e) {
        C66322Q1e receiver = c66322Q1e;
        o.LJIIJ(receiver, "$receiver");
        receiver.LIZ = "event_expr_execute";
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("code", this.LJLIL.LJLILLLLZI);
        jSONObject.put("cache", this.LJLILLLLZI);
        jSONObject.put("is_il_cache", this.LJLJI);
        jSONObject.put("is_quick_executor", this.LJLJJI);
        String str = this.LJLJJL;
        if (str != null && str.length() != 0) {
            jSONObject.put("ab_tag", this.LJLJJL);
        }
        receiver.LIZIZ = jSONObject;
        JSONObject jSONObject2 = new JSONObject();
        String str2 = this.LJLJJLL;
        if (str2 != null) {
            jSONObject2.put("cel", s.LJZI(str2).toString());
            receiver.LIZJ = jSONObject2;
            JSONObject jSONObject3 = new JSONObject();
            long j = 1000;
            jSONObject3.put("cost", this.LJLJL.LIZJ / j);
            C66320Q1c c66320Q1c = this.LJLJL;
            jSONObject3.put("net_cost", (c66320Q1c.LIZJ - c66320Q1c.LIZLLL) / j);
            jSONObject3.put("thread_cost", this.LJLJL.LJ);
            receiver.LIZLLL = jSONObject3;
            return C76800UCe.LIZ;
        }
        throw new C37692Eqm("null cannot be cast to non-null type kotlin.CharSequence");
    }
}
