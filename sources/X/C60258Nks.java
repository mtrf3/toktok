package X;

import kotlin.jvm.internal.o;

/* renamed from: X.Nks, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C60258Nks implements InterfaceC60253Nkn<InterfaceC60244Nke, InterfaceC60257Nkr> {
    public final /* synthetic */ Object LIZ;

    public C60258Nks(InterfaceC60283NlH interfaceC60283NlH) {
        this.LIZ = interfaceC60283NlH;
    }

    @Override // X.InterfaceC60253Nkn
    public final InterfaceC60257Nkr LIZ(F3T providerFactory) {
        o.LJIIJ(providerFactory, "providerFactory");
        return ((InterfaceC60269Nl3) this.LIZ).LIZLLL(providerFactory);
    }

    @Override // X.InterfaceC60253Nkn
    public final InterfaceC60244Nke LIZIZ(F3T providerFactory) {
        o.LJIIJ(providerFactory, "providerFactory");
        return ((InterfaceC60269Nl3) this.LIZ).LJII(providerFactory);
    }
}
