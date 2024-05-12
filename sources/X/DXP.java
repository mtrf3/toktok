package X;

/* loaded from: classes7.dex */
public final class DXP extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final DXP LJLIL = new DXP();

    public DXP() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z = true;
        if (((Number) DXQ.LIZ.getValue()).intValue() != 1) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
