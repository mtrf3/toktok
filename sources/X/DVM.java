package X;

/* loaded from: classes7.dex */
public final class DVM extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final DVM LJLIL = new DVM();

    public DVM() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z = true;
        if (((Number) DVL.LIZ.getValue()).intValue() != 1) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
