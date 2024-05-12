package X;

/* renamed from: X.DYm, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C34064DYm extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C34064DYm LJLIL = new C34064DYm();

    public C34064DYm() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z = false;
        try {
            FFL.LJIIIZ().getClass();
            z = FFL.LJ(31744, "enable_user_card_vertical_scroll", true, false);
        } catch (Throwable unused) {
            C34063DYl.LJLILLLLZI.getClass();
        }
        return Boolean.valueOf(z);
    }
}
