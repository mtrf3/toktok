package X;

import java.lang.ref.WeakReference;

/* renamed from: X.XcO, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C85212XcO extends AbstractC65781Prl implements InterfaceC88472Yns<Long, C76800UCe> {
    public static final C85212XcO LJLIL = new C85212XcO();

    public C85212XcO() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(Long l) {
        InterfaceC85215XcR interfaceC85215XcR;
        l.longValue();
        WeakReference<InterfaceC85215XcR> weakReference = C85049XZl.LJFF;
        if (weakReference != null && (interfaceC85215XcR = weakReference.get()) != null) {
            interfaceC85215XcR.LLLLLLLLL();
        }
        return C76800UCe.LIZ;
    }
}
