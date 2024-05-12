package X;

/* renamed from: X.1vs, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C48841vs extends AbstractC65781Prl implements InterfaceC88472Yns<Boolean, C76800UCe> {
    public static final C48841vs LJLIL = new C48841vs();

    public C48841vs() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(Boolean bool) {
        if (bool.booleanValue()) {
            C0W0 c0w0 = C0W0.DisconnectTypeAutoDetectionPermissionRecycled;
            C0RK.LIZIZ(c0w0.getCode(), c0w0.getMessage());
        }
        return C76800UCe.LIZ;
    }
}
