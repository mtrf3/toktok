package X;

/* loaded from: classes7.dex */
public final class DTP extends AbstractC65781Prl implements InterfaceC65784Pro<Integer> {
    public static final DTP LJLIL = new DTP();

    public DTP() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Integer invoke() {
        int intValue;
        if (C35810E3q.LJIIIIZZ() && ((Number) DTQ.LIZ.getValue()).intValue() == 0) {
            intValue = 1;
        } else {
            intValue = ((Number) DTQ.LIZ.getValue()).intValue();
        }
        return Integer.valueOf(intValue);
    }
}
