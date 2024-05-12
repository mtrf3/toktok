package X;

import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class PZG implements InterfaceC64642PYo<Object> {
    public final /* synthetic */ XJL LIZ;

    public PZG(XKS xks) {
        this.LIZ = xks;
    }

    @Override // X.InterfaceC64642PYo
    public final void onFailure(InterfaceC65079PgR<Object> call, Throwable t) {
        o.LJIIJ(call, "call");
        o.LJIIJ(t, "t");
        XJL xjl = this.LIZ;
        C3C4 LIZ = C141335gf.LIZ(t);
        C3C5.m7constructorimpl(LIZ);
        xjl.resumeWith(LIZ);
    }

    @Override // X.InterfaceC64642PYo
    public final void onResponse(InterfaceC65079PgR<Object> call, C64653PYz<Object> response) {
        o.LJIIJ(call, "call");
        o.LJIIJ(response, "response");
        if (response.LIZ()) {
            XJL xjl = this.LIZ;
            Object obj = response.LIZIZ;
            C3C5.m7constructorimpl(obj);
            xjl.resumeWith(obj);
            return;
        }
        XJL xjl2 = this.LIZ;
        C3C4 LIZ = C141335gf.LIZ(new PZF(response));
        C3C5.m7constructorimpl(LIZ);
        xjl2.resumeWith(LIZ);
    }
}
