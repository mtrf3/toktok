package X;

/* loaded from: classes7.dex */
public final class DRD extends AbstractC65781Prl implements InterfaceC65784Pro<Integer> {
    public static final DRD LJLIL = new DRD();

    public DRD() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Integer invoke() {
        int intValue;
        if (C35810E3q.LJIIIIZZ() && ((Number) DRE.LIZ.getValue()).intValue() == 0) {
            intValue = 1;
        } else {
            intValue = ((Number) DRE.LIZ.getValue()).intValue();
        }
        return Integer.valueOf(intValue);
    }
}
