package X;

import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class FE6 implements InterfaceC88472Yns<FE5, Boolean> {
    public final InterfaceC38616FDo LJLIL;

    public FE6(InterfaceC38616FDo creator) {
        o.LJIIJ(creator, "creator");
        this.LJLIL = creator;
    }

    @Override // X.InterfaceC88472Yns
    public final Boolean invoke(FE5 fe5) {
        FE5 cacheItem = fe5;
        o.LJIIJ(cacheItem, "cacheItem");
        InterfaceC38616FDo interfaceC38616FDo = cacheItem.LJLJJL;
        if (o.LJ(interfaceC38616FDo, this.LJLIL)) {
            return Boolean.TRUE;
        }
        if (interfaceC38616FDo instanceof C38620FDs) {
            return Boolean.valueOf(o.LJ(((C38620FDs) interfaceC38616FDo).LIZJ.getValue(), this.LJLIL));
        }
        return Boolean.FALSE;
    }
}
