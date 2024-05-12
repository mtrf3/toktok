package X;

import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public final class F12 implements InterfaceC38012Evw {
    public final /* synthetic */ F15 LJLIL;
    public final /* synthetic */ F14 LJLILLLLZI;
    public final /* synthetic */ C31889CfN LJLJI;

    public F12(F15 f15, F14 f14, C31889CfN c31889CfN) {
        this.LJLIL = f15;
        this.LJLILLLLZI = f14;
        this.LJLJI = c31889CfN;
    }

    @Override // X.InterfaceC38012Evw
    public final void call(C38048EwW c38048EwW, JSONObject jSONObject) {
        JSONObject jSONObject2 = c38048EwW.LIZLLL;
        if (jSONObject2 == null) {
            jSONObject2 = new JSONObject();
        }
        jSONObject2.put("func", c38048EwW.LIZJ);
        c38048EwW.LJIIJ = false;
        F15 f15 = this.LJLIL;
        String str = c38048EwW.LIZJ;
        o.LJFF(str, "msg.func");
        f15.LIZIZ(str, new C78531Urv(jSONObject2), new F13(this, c38048EwW), this.LJLJI);
    }
}
