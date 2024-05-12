package X;

import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.CfS, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31894CfS extends AbstractC38123Exj<JSONObject, JSONObject> {
    public final /* synthetic */ String LJLIL;
    public final /* synthetic */ InterfaceC37666EqM LJLILLLLZI;
    public final /* synthetic */ InterfaceC65784Pro<Boolean> LJLJI;

    @Override // X.AbstractC38123Exj
    public final void onTerminate() {
    }

    @Override // X.AbstractC38123Exj
    public final void invoke(JSONObject jSONObject, C38131Exr context) {
        EnumC37844EtE enumC37844EtE;
        JSONObject params = jSONObject;
        o.LJIIIZ(params, "params");
        o.LJIIIZ(context, "context");
        params.put("func", this.LJLIL);
        InterfaceC37666EqM interfaceC37666EqM = this.LJLILLLLZI;
        java.util.Map<String, ? extends Object> LJIIIIZZ = C38381F4n.LJIIIIZZ(params);
        InterfaceC65784Pro<Boolean> interfaceC65784Pro = this.LJLJI;
        C29333BfF c29333BfF = new C29333BfF(interfaceC65784Pro, this);
        if (interfaceC65784Pro.invoke().booleanValue()) {
            enumC37844EtE = EnumC37844EtE.WEB;
        } else {
            enumC37844EtE = EnumC37844EtE.LYNX;
        }
        interfaceC37666EqM.LIZIZ(LJIIIIZZ, c29333BfF, enumC37844EtE);
    }

    public C31894CfS(String str, InterfaceC37666EqM interfaceC37666EqM, InterfaceC65784Pro<Boolean> interfaceC65784Pro) {
        this.LJLIL = str;
        this.LJLILLLLZI = interfaceC37666EqM;
        this.LJLJI = interfaceC65784Pro;
    }
}
