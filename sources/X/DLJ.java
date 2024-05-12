package X;

/* loaded from: classes7.dex */
public final class DLJ extends AbstractC65781Prl implements InterfaceC65784Pro<Integer> {
    public static final DLJ LJLIL = new DLJ();

    public DLJ() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Integer invoke() {
        int intValue;
        if (C2NW.LIZ().LJIILL() && ((Number) DLK.LIZ.getValue()).intValue() == 0) {
            intValue = 1;
        } else {
            intValue = ((Number) DLK.LIZ.getValue()).intValue();
        }
        return Integer.valueOf(intValue);
    }
}
