package X;

/* loaded from: classes7.dex */
public final class DOP extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final DOP LJLIL = new DOP();

    public DOP() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z = true;
        if (((Number) DOR.LIZ.getValue()).intValue() < 1) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
