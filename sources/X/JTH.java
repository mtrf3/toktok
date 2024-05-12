package X;

/* loaded from: classes9.dex */
public final class JTH extends AbstractC65781Prl implements InterfaceC65784Pro<Integer> {
    public static final JTH LJLIL = new JTH();

    public JTH() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Integer invoke() {
        int i;
        try {
            FFL.LJIIIZ().getClass();
            i = FFL.LJIIJ(31744, 1, "search_disable_multiple_touch", true);
        } catch (Throwable unused) {
            i = 0;
        }
        return Integer.valueOf(i);
    }
}
