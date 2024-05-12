package X;

/* loaded from: classes7.dex */
public final class DTV extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final DTV LJLIL = new DTV();

    public DTV() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z = true;
        if (((Number) DTU.LJLJI.getValue()).intValue() != 1) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
