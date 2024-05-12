package X;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AqS141S0200000_10;
import kotlin.jvm.internal.o;

/* renamed from: X.Njr, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C60195Njr implements InterfaceC60205Nk1, InterfaceC37788EsK {
    public InterfaceC60196Njs LJLILLLLZI;
    public final C60197Njt LJLIL = new C60197Njt();
    public String LJLJI = "";

    @Override // X.InterfaceC37788EsK
    public final void release() {
        InterfaceC60196Njs interfaceC60196Njs = this.LJLILLLLZI;
        if (interfaceC60196Njs != null) {
            interfaceC60196Njs.db(this.LJLIL);
        }
        this.LJLIL.release();
    }

    public final void LIZ(InterfaceC59504NWy coreProvider) {
        o.LJIIJ(coreProvider, "coreProvider");
        InterfaceC60196Njs LIZ = coreProvider.LIZ();
        LIZ.a4(this.LJLIL);
        this.LJLILLLLZI = LIZ;
    }

    public final void LIZLLL(String str) {
        o.LJIIJ(str, "<set-?>");
        this.LJLJI = str;
    }

    @Override // X.InterfaceC60205Nk1
    public final InterfaceC40516FvE a0(String sessionId) {
        o.LJIIJ(sessionId, "sessionId");
        return this.LJLIL.a0(sessionId);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [X.Njs] */
    /* JADX WARN: Type inference failed for: r7v0, types: [X.OQg] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.util.ArrayList] */
    public final void LIZJ(android.net.Uri uri, F3T providerFactory, C60210Nk6 c60210Nk6, AqS141S0200000_10 aqS141S0200000_10) {
        ?? r7;
        o.LJIIJ(uri, "uri");
        o.LJIIJ(providerFactory, "providerFactory");
        providerFactory.LJ(InterfaceC48224IwG.class, new F25(new C48223IwF()));
        C59476NVw c59476NVw = new C59476NVw();
        c59476NVw.LIZJ(android.net.Uri.class, uri, null);
        android.net.Uri uri2 = (android.net.Uri) c59476NVw.LIZLLL.getValue();
        if (uri2 != null) {
            ?? r3 = this.LJLILLLLZI;
            if (r3 != 0) {
                C60197Njt c60197Njt = this.LJLIL;
                F21 f21 = new F21(this.LJLJI);
                List<String> list = (List) c59476NVw.LIZJ.getValue();
                if (list != null) {
                    r7 = new ArrayList();
                    for (String str : list) {
                        if (!ujb.o.LJJJJJL(str) && str != null) {
                            r7.add(str);
                        }
                    }
                } else {
                    r7 = C61878OQg.INSTANCE;
                }
                r3.F2(c60197Njt, f21, uri2, r7, providerFactory, c60210Nk6, aqS141S0200000_10);
                return;
            }
            o.LJIJI("core");
            throw null;
        }
        aqS141S0200000_10.invoke(new IllegalStateException(C43588H8u.LIZ("bullet uri parse failed ", uri)));
    }
}
