package X;

/* loaded from: classes7.dex */
public final class DOV extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final DOV LJLIL = new DOV();

    public DOV() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z = true;
        if ((((Number) DOX.LIZ.getValue()).intValue() & 1) != 1) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
