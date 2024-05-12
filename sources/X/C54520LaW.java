package X;

import kotlin.jvm.internal.o;

/* renamed from: X.LaW, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C54520LaW extends AbstractC65781Prl implements InterfaceC88472Yns<C54667Lct, Boolean> {
    public static final C54520LaW LJLIL = new C54520LaW();

    public C54520LaW() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final Boolean invoke(C54667Lct c54667Lct) {
        boolean z;
        C54667Lct it = c54667Lct;
        o.LJIIIZ(it, "it");
        if (it.LJLILLLLZI && !(it.getLoadMoreState() instanceof C72922tc)) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
