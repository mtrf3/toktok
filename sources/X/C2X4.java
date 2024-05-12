package X;

/* renamed from: X.2X4, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C2X4 extends AbstractC65781Prl implements InterfaceC65784Pro<Integer> {
    public static final C2X4 LJLIL = new C2X4();

    public C2X4() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Integer invoke() {
        int intValue;
        if (C2NW.LIZ().LJIILL() && ((Number) C2X3.LIZ.getValue()).intValue() == 0) {
            intValue = 1;
        } else {
            intValue = ((Number) C2X3.LIZ.getValue()).intValue();
        }
        return Integer.valueOf(intValue);
    }
}
