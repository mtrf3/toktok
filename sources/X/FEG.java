package X;

import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class FEG implements InterfaceC88472Yns<FE5, Boolean> {
    public final String LJLIL;

    public FEG(String str) {
        this.LJLIL = str;
    }

    @Override // X.InterfaceC88472Yns
    public final Boolean invoke(FE5 fe5) {
        FE5 cacheItem = fe5;
        o.LJIIJ(cacheItem, "cacheItem");
        return Boolean.valueOf(o.LJ(cacheItem.LJLJJI, this.LJLIL));
    }
}
