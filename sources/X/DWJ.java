package X;

/* loaded from: classes7.dex */
public final class DWJ extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final DWJ LJLIL = new DWJ();

    public DWJ() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z = true;
        if (((Number) DWK.LIZ.getValue()).intValue() < 1) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
