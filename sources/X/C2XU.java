package X;

/* renamed from: X.2XU, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C2XU extends AbstractC65781Prl implements InterfaceC65784Pro<Integer> {
    public static final C2XU LJLIL = new C2XU();

    public C2XU() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Integer invoke() {
        int intValue;
        if (C35810E3q.LJIIIIZZ() && ((Number) C2XT.LIZ.getValue()).intValue() == 0) {
            intValue = 1;
        } else {
            intValue = ((Number) C2XT.LIZ.getValue()).intValue();
        }
        return Integer.valueOf(intValue);
    }
}
