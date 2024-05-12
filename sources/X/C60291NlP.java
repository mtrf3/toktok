package X;

import kotlin.jvm.internal.o;

/* renamed from: X.NlP, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C60291NlP implements InterfaceC60253Nkn<InterfaceC39446Fdy, InterfaceC60304Nlc> {
    public final /* synthetic */ Object LIZ;

    public C60291NlP(InterfaceC60283NlH interfaceC60283NlH) {
        this.LIZ = interfaceC60283NlH;
    }

    @Override // X.InterfaceC60253Nkn
    public final InterfaceC60304Nlc LIZ(F3T providerFactory) {
        o.LJIIJ(providerFactory, "providerFactory");
        return ((InterfaceC40491Fup) this.LIZ).LJIIIIZZ(providerFactory);
    }

    @Override // X.InterfaceC60253Nkn
    public final InterfaceC39446Fdy LIZIZ(F3T providerFactory) {
        o.LJIIJ(providerFactory, "providerFactory");
        return ((InterfaceC40491Fup) this.LIZ).LJ(providerFactory);
    }
}
