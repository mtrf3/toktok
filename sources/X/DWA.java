package X;

/* loaded from: classes7.dex */
public final class DWA extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final DWA LJLIL = new DWA();

    public DWA() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z = true;
        if (((Number) DWB.LIZ.getValue()).intValue() < 1) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
