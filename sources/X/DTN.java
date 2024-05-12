package X;

/* loaded from: classes7.dex */
public final class DTN extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final DTN LJLIL = new DTN();

    public DTN() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z;
        int intValue = ((Number) DTM.LIZIZ.getValue()).intValue();
        if (intValue != 200 && intValue != 250 && intValue != 300 && intValue != 350) {
            z = false;
        } else {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
