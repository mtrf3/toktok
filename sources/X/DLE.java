package X;

/* loaded from: classes7.dex */
public final class DLE extends AbstractC65781Prl implements InterfaceC65784Pro<Integer> {
    public static final DLE LJLIL = new DLE();

    public DLE() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Integer invoke() {
        int intValue;
        if (C2NW.LIZ().LJIILL() && ((Number) DLF.LIZ.getValue()).intValue() == 0) {
            intValue = 1;
        } else {
            intValue = ((Number) DLF.LIZ.getValue()).intValue();
        }
        return Integer.valueOf(intValue);
    }
}
