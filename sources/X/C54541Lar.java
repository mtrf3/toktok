package X;

import kotlin.jvm.internal.o;

/* renamed from: X.Lar, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C54541Lar extends AbstractC65781Prl implements InterfaceC88472Yns<C54664Lcq, Boolean> {
    public static final C54541Lar LJLIL = new C54541Lar();

    public C54541Lar() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final Boolean invoke(C54664Lcq c54664Lcq) {
        boolean z;
        C54664Lcq it = c54664Lcq;
        o.LJIIIZ(it, "it");
        if (it.LJLILLLLZI && !(it.getLoadMoreState() instanceof C72922tc)) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
