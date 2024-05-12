package X;

/* loaded from: classes7.dex */
public final class FXM extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final FXM LJLIL = new FXM();

    public FXM() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z = true;
        if ((((Number) FXL.LIZ.getValue()).intValue() & 1) != 1) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
