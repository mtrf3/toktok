package X;

/* loaded from: classes7.dex */
public final class DVP extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final DVP LJLIL = new DVP();

    public DVP() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        C62822Ol8 c62822Ol8 = DVL.LIZ;
        boolean z = false;
        if (((Number) c62822Ol8.getValue()).intValue() == 1 || ((Number) c62822Ol8.getValue()).intValue() == 2) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
