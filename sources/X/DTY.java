package X;

/* loaded from: classes7.dex */
public final class DTY extends AbstractC65781Prl implements InterfaceC65784Pro<Integer> {
    public static final DTY LJLIL = new DTY();

    public DTY() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Integer invoke() {
        int intValue;
        if (C35810E3q.LJIIIIZZ() && ((Number) DTZ.LIZ.getValue()).intValue() == 0) {
            intValue = 200;
        } else {
            intValue = ((Number) DTZ.LIZ.getValue()).intValue();
        }
        return Integer.valueOf(intValue);
    }
}
