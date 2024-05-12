package X;

/* loaded from: classes9.dex */
public final class KBO extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final KBO LJLIL = new KBO();

    public KBO() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z = false;
        try {
            FFL.LJIIIZ().getClass();
            if (FFL.LJIIJ(31744, 0, "ec_search_middle_guess_optimize", true) == 2) {
                z = true;
            }
        } catch (Throwable unused) {
        }
        return Boolean.valueOf(z);
    }
}
