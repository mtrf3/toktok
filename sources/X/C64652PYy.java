package X;

import kotlin.jvm.internal.o;

/* renamed from: X.PYy, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64652PYy implements InterfaceC64642PYo<Object> {
    public final /* synthetic */ XJL LIZ;

    public C64652PYy(XKS xks) {
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
        XJL xjl = this.LIZ;
        C3C5.m7constructorimpl(response);
        xjl.resumeWith(response);
    }
}
