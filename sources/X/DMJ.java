package X;

/* loaded from: classes7.dex */
public final class DMJ extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final DMJ LJLIL = new DMJ();

    public DMJ() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z = true;
        if (((Number) DMK.LIZ.getValue()).intValue() != 1) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
