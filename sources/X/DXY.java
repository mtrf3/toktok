package X;

/* loaded from: classes7.dex */
public final class DXY extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final DXY LJLIL = new DXY();

    public DXY() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z = true;
        if (((Number) DXZ.LIZ.getValue()).intValue() != 1) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
