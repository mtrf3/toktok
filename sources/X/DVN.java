package X;

/* loaded from: classes7.dex */
public final class DVN extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final DVN LJLIL = new DVN();

    public DVN() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z;
        if (((Number) DVL.LIZ.getValue()).intValue() == 2) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
