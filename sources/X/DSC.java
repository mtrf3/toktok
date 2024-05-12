package X;

/* loaded from: classes7.dex */
public final class DSC extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final DSC LJLIL = new DSC();

    public DSC() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z;
        if (((Number) DS8.LIZ.getValue()).intValue() == 3) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
