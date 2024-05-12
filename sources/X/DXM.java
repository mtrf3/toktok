package X;

/* loaded from: classes7.dex */
public final class DXM extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final DXM LJLIL = new DXM();

    public DXM() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z = true;
        if (((Number) DXN.LIZ.getValue()).intValue() < 1) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
