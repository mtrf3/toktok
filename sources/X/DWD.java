package X;

/* loaded from: classes7.dex */
public final class DWD extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final DWD LJLIL = new DWD();

    public DWD() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z;
        if (((Number) DWE.LIZIZ.getValue()).intValue() > 0) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
