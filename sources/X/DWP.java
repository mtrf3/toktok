package X;

/* loaded from: classes7.dex */
public final class DWP extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final DWP LJLIL = new DWP();

    public DWP() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z;
        if (((Number) DWQ.LIZ.getValue()).intValue() > 0) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
