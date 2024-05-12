package X;

/* loaded from: classes7.dex */
public final class DXV extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final DXV LJLIL = new DXV();

    public DXV() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z;
        if (((Number) DXW.LIZ.getValue()).intValue() > 0) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
