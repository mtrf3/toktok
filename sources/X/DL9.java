package X;

/* loaded from: classes7.dex */
public final class DL9 extends AbstractC65781Prl implements InterfaceC65784Pro<Integer> {
    public static final DL9 LJLIL = new DL9();

    public DL9() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Integer invoke() {
        int intValue;
        if (C2NW.LIZ().LJIILL() && ((Number) DLA.LIZ.getValue()).intValue() == 0) {
            intValue = 1;
        } else {
            intValue = ((Number) DLA.LIZ.getValue()).intValue();
        }
        return Integer.valueOf(intValue);
    }
}
