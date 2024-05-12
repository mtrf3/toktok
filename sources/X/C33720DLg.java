package X;

/* renamed from: X.DLg, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33720DLg extends AbstractC65781Prl implements InterfaceC65784Pro<Integer> {
    public static final C33720DLg LJLIL = new C33720DLg();

    public C33720DLg() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Integer invoke() {
        int intValue;
        if (C2NW.LIZ().LJIILL() && ((Number) C33721DLh.LIZIZ.getValue()).intValue() == 0) {
            intValue = 1;
        } else {
            intValue = ((Number) C33721DLh.LIZIZ.getValue()).intValue();
        }
        return Integer.valueOf(intValue);
    }
}
