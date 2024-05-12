package X;

import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.EtY, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37864EtY implements InterfaceC38012Evw {
    public final /* synthetic */ InterfaceC37666EqM LJLIL;
    public final /* synthetic */ C38150EyA LJLILLLLZI;

    public C37864EtY(InterfaceC37666EqM interfaceC37666EqM, C38150EyA c38150EyA) {
        this.LJLIL = interfaceC37666EqM;
        this.LJLILLLLZI = c38150EyA;
    }

    @Override // X.InterfaceC38012Evw
    public final void call(C38048EwW c38048EwW, JSONObject jSONObject) {
        JSONObject jSONObject2 = c38048EwW.LIZLLL;
        if (jSONObject2 == null) {
            jSONObject2 = new JSONObject();
        }
        jSONObject2.put("func", c38048EwW.LIZJ);
        c38048EwW.LJIIJ = false;
        String str = c38048EwW.LIZJ;
        o.LJIIIIZZ(str, "msg.func");
        InterfaceC37666EqM bridge = this.LJLIL;
        o.LJIIIIZZ(bridge, "bridge");
        new C37662EqI(bridge, jSONObject2).LIZJ(new EX1(new C37865EtZ(this.LJLILLLLZI, c38048EwW), str));
    }
}
