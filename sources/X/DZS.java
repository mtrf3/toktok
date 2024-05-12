package X;

/* loaded from: classes7.dex */
public final class DZS extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final DZS LJLIL = new DZS();

    public DZS() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z = false;
        try {
            FFL.LJIIIZ().getClass();
            if (FFL.LJ(31744, "time_utils_lazy_enable", true, false)) {
                z = true;
            }
        } catch (Exception unused) {
        }
        return Boolean.valueOf(z);
    }
}
