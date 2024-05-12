package X;

import kotlin.jvm.internal.o;

/* renamed from: X.LhT, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C54951LhT extends AbstractC65781Prl implements InterfaceC88472Yns<C54668Lcu, Boolean> {
    public static final C54951LhT LJLIL = new C54951LhT();

    public C54951LhT() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final Boolean invoke(C54668Lcu c54668Lcu) {
        boolean z;
        C54668Lcu it = c54668Lcu;
        o.LJIIIZ(it, "it");
        if (it.LJLILLLLZI && !(it.getLoadMoreState() instanceof C72922tc)) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
