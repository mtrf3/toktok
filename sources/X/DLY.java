package X;

/* loaded from: classes7.dex */
public final class DLY extends AbstractC65781Prl implements InterfaceC65784Pro<Integer> {
    public static final DLY LJLIL = new DLY();

    public DLY() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Integer invoke() {
        int intValue;
        if (C2NW.LIZ().LJIILL() && ((Number) DLZ.LIZ.getValue()).intValue() == 0) {
            intValue = 1;
        } else {
            intValue = ((Number) DLZ.LIZ.getValue()).intValue();
        }
        return Integer.valueOf(intValue);
    }
}
