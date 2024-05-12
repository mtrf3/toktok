package X;

/* renamed from: X.Dra, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C35194Dra extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C35194Dra LJLIL = new C35194Dra();

    public C35194Dra() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z = false;
        try {
            FFL.LJIIIZ().getClass();
            z = FFL.LJ(31744, "ec_search_opt_more_request", true, false);
        } catch (Throwable th) {
            C78983UzD.LJIIZILJ(th);
        }
        return Boolean.valueOf(z);
    }
}
