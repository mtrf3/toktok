package X;

/* renamed from: X.K3r, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51099K3r extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C51099K3r LJLIL = new C51099K3r();

    public C51099K3r() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z = false;
        try {
            FFL.LJIIIZ().getClass();
            z = FFL.LJ(31744, "enable_search_middle_page_search_square_early_init", true, false);
        } catch (Throwable unused) {
        }
        return Boolean.valueOf(z);
    }
}
