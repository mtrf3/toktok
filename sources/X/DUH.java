package X;

/* loaded from: classes7.dex */
public final class DUH extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final DUH LJLIL = new DUH();

    public DUH() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z;
        if ((((Number) DUI.LIZ.getValue()).intValue() & 4) == 4) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
