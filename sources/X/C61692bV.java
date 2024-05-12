package X;

/* renamed from: X.2bV, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C61692bV extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C61692bV LJLIL = new C61692bV();

    public C61692bV() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z = false;
        try {
            FFL.LJIIIZ().getClass();
            z = FFL.LJ(31744, "ec_search_pdp_guess_use_cache", true, false);
        } catch (Throwable th) {
            C78983UzD.LJIIZILJ(th);
        }
        return Boolean.valueOf(z);
    }
}
