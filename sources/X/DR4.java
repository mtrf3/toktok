package X;

/* loaded from: classes7.dex */
public final class DR4 extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final DR4 LJLIL = new DR4();

    public DR4() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z = true;
        if (((Number) DR3.LIZ.getValue()).intValue() != 1) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
