package X;

/* loaded from: classes7.dex */
public final class DXS extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final DXS LJLIL = new DXS();

    public DXS() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z;
        if (((Number) DXT.LIZ.getValue()).intValue() > 0) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
