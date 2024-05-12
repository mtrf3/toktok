package X;

import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class PZJ implements InterfaceC64642PYo<PVM> {
    public final /* synthetic */ InterfaceC39612Fge LIZ;

    public PZJ(C39602FgU c39602FgU) {
        this.LIZ = c39602FgU;
    }

    @Override // X.InterfaceC64642PYo
    public final void onFailure(InterfaceC65079PgR<PVM> call, Throwable t) {
        o.LJIIJ(call, "call");
        o.LJIIJ(t, "t");
        this.LIZ.onFailure(t);
    }

    @Override // X.InterfaceC64642PYo
    public final void onResponse(InterfaceC65079PgR<PVM> call, C64653PYz<PVM> response) {
        o.LJIIJ(call, "call");
        o.LJIIJ(response, "response");
        this.LIZ.LIZ(String.valueOf(response.LIZIZ));
    }
}
