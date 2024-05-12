package X;

/* loaded from: classes7.dex */
public final class DRL extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final DRL LJLIL = new DRL();

    public DRL() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z = true;
        if (((Number) DRM.LIZ.getValue()).intValue() != 1) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
