package X;

/* loaded from: classes7.dex */
public final class DY2 extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final DY2 LJLIL = new DY2();

    public DY2() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z = true;
        try {
            FFL.LJIIIZ().getClass();
            if (FFL.LJIIJ(31744, 1, "ec_search_event_oom_fix", true) != 1) {
                z = false;
            }
        } catch (Throwable unused) {
        }
        return Boolean.valueOf(z);
    }
}
