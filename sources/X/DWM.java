package X;

/* loaded from: classes7.dex */
public final class DWM extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final DWM LJLIL = new DWM();

    public DWM() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z = true;
        if (((Number) DWN.LIZ.getValue()).intValue() < 1) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
