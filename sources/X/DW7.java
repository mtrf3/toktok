package X;

/* loaded from: classes7.dex */
public final class DW7 extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final DW7 LJLIL = new DW7();

    public DW7() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z = true;
        if (((Number) DW8.LIZ.getValue()).intValue() != 1) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
