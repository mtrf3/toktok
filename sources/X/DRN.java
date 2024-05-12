package X;

/* loaded from: classes7.dex */
public final class DRN extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final DRN LJLIL = new DRN();

    public DRN() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z;
        if (((Number) DRM.LIZ.getValue()).intValue() == 2) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
