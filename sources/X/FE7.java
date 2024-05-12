package X;

import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class FE7 implements InterfaceC88472Yns<FE5, Boolean> {
    public final FEH LJLIL;

    public FE7(FEH owner) {
        o.LJIIJ(owner, "owner");
        this.LJLIL = owner;
    }

    @Override // X.InterfaceC88472Yns
    public final Boolean invoke(FE5 fe5) {
        boolean z;
        FE5 cacheItem = fe5;
        o.LJIIJ(cacheItem, "cacheItem");
        if (cacheItem.LJLJLJ) {
            if (cacheItem.LJLJL == this.LJLIL.getActivity().hashCode()) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
        return Boolean.FALSE;
    }
}
