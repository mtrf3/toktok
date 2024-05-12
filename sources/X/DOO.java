package X;

/* loaded from: classes7.dex */
public final class DOO extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final DOO LJLIL = new DOO();

    public DOO() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z;
        if (((Number) DOR.LIZ.getValue()).intValue() >= 3) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
