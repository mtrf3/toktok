package X;

/* loaded from: classes7.dex */
public final class DRO extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final DRO LJLIL = new DRO();

    public DRO() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z;
        if (((Number) DRM.LIZ.getValue()).intValue() == 3) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
