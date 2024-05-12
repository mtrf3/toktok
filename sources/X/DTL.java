package X;

/* loaded from: classes7.dex */
public final class DTL extends AbstractC65781Prl implements InterfaceC65784Pro<Integer> {
    public static final DTL LJLIL = new DTL();

    public DTL() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Integer invoke() {
        int intValue;
        if (C35810E3q.LJIIIIZZ() && ((Number) DTM.LIZ.getValue()).intValue() == 0) {
            intValue = 200;
        } else {
            intValue = ((Number) DTM.LIZ.getValue()).intValue();
        }
        return Integer.valueOf(intValue);
    }
}
