package X;

/* renamed from: X.Jkb, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50049Jkb extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C50049Jkb LJLIL = new C50049Jkb();

    public C50049Jkb() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z = false;
        try {
            FFL.LJIIIZ().getClass();
            z = FFL.LJ(31744, "search_dual_caton_optimize", true, false);
        } catch (Throwable unused) {
        }
        return Boolean.valueOf(z);
    }
}
