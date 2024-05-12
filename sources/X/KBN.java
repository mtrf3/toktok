package X;

/* loaded from: classes9.dex */
public final class KBN extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final KBN LJLIL = new KBN();

    public KBN() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z = false;
        try {
            FFL.LJIIIZ().getClass();
            if (FFL.LJIIJ(31744, 0, "ec_search_middle_guess_optimize", true) != 0) {
                z = true;
            }
        } catch (Throwable unused) {
        }
        return Boolean.valueOf(z);
    }
}
