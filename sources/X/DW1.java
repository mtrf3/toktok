package X;

/* loaded from: classes7.dex */
public final class DW1 extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final DW1 LJLIL = new DW1();

    public DW1() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z;
        if (((Number) DW2.LIZ.getValue()).intValue() == 3) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
