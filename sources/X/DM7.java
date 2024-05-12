package X;

/* loaded from: classes7.dex */
public final class DM7 extends AbstractC65781Prl implements InterfaceC65784Pro<Integer> {
    public static final DM7 LJLIL = new DM7();

    public DM7() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Integer invoke() {
        int intValue;
        if (C2NW.LIZ().LJIILL() && ((Number) DMB.LIZ.getValue()).intValue() == 0) {
            intValue = 15;
        } else {
            intValue = ((Number) DMB.LIZ.getValue()).intValue();
        }
        return Integer.valueOf(intValue);
    }
}
