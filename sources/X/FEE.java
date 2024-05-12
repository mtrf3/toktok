package X;

import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class FEE extends AbstractC65781Prl implements InterfaceC88472Yns<FE5, C76800UCe> {
    public static final FEE LJLIL = new FEE();

    public FEE() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(FE5 fe5) {
        FE5 cacheItem = fe5;
        o.LJIIJ(cacheItem, "cacheItem");
        InterfaceC38613FDl LJ = FE8.LJ();
        if (LJ != null) {
            LJ.LJIIIIZZ(cacheItem.L(), FEF.EXPIRED);
        }
        return C76800UCe.LIZ;
    }
}
