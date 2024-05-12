package X;

import kotlin.jvm.internal.o;

/* renamed from: X.LaS, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C54516LaS extends AbstractC65781Prl implements InterfaceC88472Yns<C54666Lcs, Boolean> {
    public static final C54516LaS LJLIL = new C54516LaS();

    public C54516LaS() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final Boolean invoke(C54666Lcs c54666Lcs) {
        boolean z;
        C54666Lcs it = c54666Lcs;
        o.LJIIIZ(it, "it");
        if (it.LJLILLLLZI && !(it.getLoadMoreState() instanceof C72922tc)) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
