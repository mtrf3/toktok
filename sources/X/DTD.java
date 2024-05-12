package X;

/* loaded from: classes7.dex */
public final class DTD extends AbstractC65781Prl implements InterfaceC65784Pro<Integer> {
    public static final DTD LJLIL = new DTD();

    public DTD() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Integer invoke() {
        int intValue;
        if (C35810E3q.LJIIIIZZ() && ((Number) DTE.LJLILLLLZI.getValue()).intValue() == 0) {
            intValue = 1;
        } else {
            intValue = ((Number) DTE.LJLILLLLZI.getValue()).intValue();
        }
        return Integer.valueOf(intValue);
    }
}
