package X;

/* loaded from: classes7.dex */
public final class DTF extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final DTF LJLIL = new DTF();

    public DTF() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z = true;
        if (((Number) DTE.LJLJI.getValue()).intValue() != 1) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
