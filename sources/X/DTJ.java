package X;

/* loaded from: classes7.dex */
public final class DTJ extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final DTJ LJLIL = new DTJ();

    public DTJ() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z = true;
        if (((Number) DTI.LJLJI.getValue()).intValue() != 1) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
