package X;

/* loaded from: classes7.dex */
public final class DWG extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final DWG LJLIL = new DWG();

    public DWG() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z = true;
        if (((Number) DWH.LIZ.getValue()).intValue() < 1) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
