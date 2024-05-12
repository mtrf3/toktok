package X;

import android.content.Context;
import kotlin.jvm.internal.AqS141S0200000_10;
import kotlin.jvm.internal.AqS176S0100000_10;
import kotlin.jvm.internal.IDqS185S0200000_10;
import kotlin.jvm.internal.o;

/* renamed from: X.Njq, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C60194Njq implements InterfaceC60205Nk1, InterfaceC37788EsK {
    public final C60195Njr LJLIL;
    public volatile String LJLILLLLZI;
    public final F3T LJLJI;

    @Override // X.InterfaceC37788EsK
    public final void release() {
        this.LJLIL.release();
        this.LJLJI.LJI(Context.class);
        C60373Nmj.LIZIZ().LJFF(this.LJLILLLLZI);
    }

    public C60194Njq(Context context) {
        o.LJIIJ(context, "context");
        this.LJLIL = new C60195Njr();
        this.LJLILLLLZI = "";
        F3T f3t = new F3T();
        f3t.LJ(Context.class, new F25(context));
        this.LJLJI = f3t;
    }

    public final void LIZ(InterfaceC59504NWy coreProvider) {
        o.LJIIJ(coreProvider, "coreProvider");
        this.LJLIL.LIZ(coreProvider);
    }

    @Override // X.InterfaceC60205Nk1
    public final InterfaceC40516FvE a0(String sessionId) {
        o.LJIIJ(sessionId, "sessionId");
        return this.LJLIL.a0(sessionId);
    }

    public final void LIZJ(android.net.Uri uri, F3T f3t, AqS176S0100000_10 aqS176S0100000_10, AqS176S0100000_10 aqS176S0100000_102, IDqS185S0200000_10 iDqS185S0200000_10, AqS141S0200000_10 aqS141S0200000_10) {
        String LJ;
        o.LJIIJ(uri, "uri");
        F3T f3t2 = this.LJLJI;
        f3t2.LIZIZ(f3t);
        f3t2.LJ(android.net.Uri.class, new F25(uri));
        C60203Njz c60203Njz = (C60203Njz) this.LJLJI.LIZJ(C60203Njz.class);
        if (c60203Njz == null || (LJ = c60203Njz.LIZ) == null) {
            LJ = C77119UOl.LJ();
        }
        this.LJLILLLLZI = LJ;
        Context context = (Context) this.LJLJI.LIZJ(Context.class);
        if (context != null) {
            C60373Nmj.LIZIZ().LJ(context, this.LJLILLLLZI);
        }
        C60195Njr c60195Njr = this.LJLIL;
        c60195Njr.LIZLLL(this.LJLILLLLZI);
        c60195Njr.LIZJ(uri, this.LJLJI, new C60210Nk6(this, aqS176S0100000_10, aqS176S0100000_102, iDqS185S0200000_10, aqS141S0200000_10), aqS141S0200000_10);
    }
}
