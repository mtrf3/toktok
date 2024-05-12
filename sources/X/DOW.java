package X;

/* loaded from: classes7.dex */
public final class DOW extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final DOW LJLIL = new DOW();

    public DOW() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z;
        if ((((Number) DOX.LIZ.getValue()).intValue() & 64) == 64) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
