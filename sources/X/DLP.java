package X;

/* loaded from: classes7.dex */
public final class DLP extends AbstractC65781Prl implements InterfaceC65784Pro<Integer> {
    public static final DLP LJLIL = new DLP();

    public DLP() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Integer invoke() {
        int intValue;
        if (C2NW.LIZ().LJIILL() && ((Number) DLQ.LIZ.getValue()).intValue() == 0) {
            intValue = 1;
        } else {
            intValue = ((Number) DLQ.LIZ.getValue()).intValue();
        }
        return Integer.valueOf(intValue);
    }
}
