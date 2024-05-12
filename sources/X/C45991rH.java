package X;

import kotlin.jvm.internal.o;

/* renamed from: X.1rH, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C45991rH extends AbstractC65781Prl implements InterfaceC88472Yns<AbstractC538029g, C76800UCe> {
    public static final C45991rH LJLIL = new C45991rH();

    public C45991rH() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(AbstractC538029g abstractC538029g) {
        AbstractC538029g coordinator = abstractC538029g;
        o.LJIIIZ(coordinator, "coordinator");
        C0DN c0dn = coordinator.LLFF;
        if (c0dn != null) {
            c0dn.invalidate();
        }
        return C76800UCe.LIZ;
    }
}
