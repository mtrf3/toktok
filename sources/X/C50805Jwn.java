package X;

import com.lynx.tasm.LynxViewClient;

/* renamed from: X.Jwn, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50805Jwn extends LynxViewClient {
    public final /* synthetic */ C50799Jwh LIZ;

    @Override // com.lynx.tasm.LynxViewClient
    public final void LIZLLL() {
    }

    @Override // com.lynx.tasm.LynxViewClient
    public final void LJIIJJI() {
        C50799Jwh c50799Jwh;
        InterfaceC50825Jx7 interfaceC50825Jx7;
        if (((Boolean) this.LIZ.LJIILJJIL.getValue()).booleanValue() && (interfaceC50825Jx7 = (c50799Jwh = this.LIZ).LJIIJ) != null) {
            interfaceC50825Jx7.LIZ(c50799Jwh.LJIIJJI);
        }
    }

    public C50805Jwn(C50799Jwh c50799Jwh) {
        this.LIZ = c50799Jwh;
    }

    @Override // com.lynx.tasm.LynxViewClient
    public final void LJJIIJ(String str, java.util.Map map, java.util.Map map2) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("flag:");
        LIZ.append(str);
        LIZ.append(" timingInfo:");
        LIZ.append(map);
        LIZ.append(" updateTiming:");
        LIZ.append(map2);
        C15280iq.LIZIZ("SparkViewContainer", X1D.LIZIZ(LIZ));
    }
}
