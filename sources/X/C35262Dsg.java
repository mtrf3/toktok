package X;

/* renamed from: X.Dsg, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C35262Dsg extends AbstractC65781Prl implements InterfaceC65784Pro<Integer> {
    public static final C35262Dsg LJLIL = new C35262Dsg();

    public C35262Dsg() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Integer invoke() {
        int intValue;
        if (C36152EGu.LJ()) {
            if (!C35818E3y.LIZ() && C2NW.LIZ().LJJIL()) {
                intValue = 1;
            } else {
                intValue = 0;
            }
        } else {
            intValue = ((Number) C35570Dxe.LIZ.getValue()).intValue();
        }
        return Integer.valueOf(intValue);
    }
}
