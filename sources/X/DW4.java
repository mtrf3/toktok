package X;

/* loaded from: classes7.dex */
public final class DW4 extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final DW4 LJLIL = new DW4();

    public DW4() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z = true;
        if (((Number) DW5.LIZ.getValue()).intValue() < 1) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
