package X;

/* loaded from: classes7.dex */
public final class DWS extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final DWS LJLIL = new DWS();

    public DWS() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z = true;
        if (((Number) DWT.LIZ.getValue()).intValue() < 1) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
