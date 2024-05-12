package X;

/* loaded from: classes7.dex */
public final class DLT extends AbstractC65781Prl implements InterfaceC65784Pro<Integer> {
    public static final DLT LJLIL = new DLT();

    public DLT() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Integer invoke() {
        int intValue;
        if (C2NW.LIZ().LJIILL() && ((Number) DLU.LIZ.getValue()).intValue() == 0) {
            intValue = 1;
        } else {
            intValue = ((Number) DLU.LIZ.getValue()).intValue();
        }
        return Integer.valueOf(intValue);
    }
}
