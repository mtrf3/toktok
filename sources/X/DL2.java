package X;

/* loaded from: classes7.dex */
public final class DL2 extends AbstractC65781Prl implements InterfaceC65784Pro<Integer> {
    public static final DL2 LJLIL = new DL2();

    public DL2() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Integer invoke() {
        int intValue;
        if (C2NW.LIZ().LJIILL() && ((Number) DL1.LIZ.getValue()).intValue() == 0) {
            intValue = 1;
        } else {
            intValue = ((Number) DL1.LIZ.getValue()).intValue();
        }
        return Integer.valueOf(intValue);
    }
}
