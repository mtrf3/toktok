package X;

/* renamed from: X.7DP, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C7DP extends AbstractC65781Prl implements InterfaceC88472Yns<Boolean, C76800UCe> {
    public static final C7DP LJLIL = new C7DP();

    public C7DP() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(Boolean bool) {
        if (bool.booleanValue()) {
            C7DO.LIZ = String.valueOf(System.currentTimeMillis());
        }
        return C76800UCe.LIZ;
    }
}
