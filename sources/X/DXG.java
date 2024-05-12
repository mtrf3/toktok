package X;

/* loaded from: classes7.dex */
public final class DXG extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final DXG LJLIL = new DXG();

    public DXG() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z = true;
        if ((((Number) DXH.LIZ.getValue()).intValue() & 1) == 0) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
