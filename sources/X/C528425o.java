package X;

/* renamed from: X.25o, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C528425o extends AbstractC65781Prl implements InterfaceC65784Pro<Integer> {
    public static final C528425o LJLIL = new C528425o();

    public C528425o() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Integer invoke() {
        int intValue = ((Number) C23850wf.LIZ.getValue()).intValue();
        if ((((Number) C23800wa.LIZ.getValue()).intValue() & 1) == 1) {
            int LJFF = (int) ((C39687Fhr.LJFF() / 1048576) - ((Number) C23810wb.LIZ.getValue()).intValue());
            int intValue2 = ((Number) C23870wh.LIZ.getValue()).intValue();
            if (intValue2 > 0) {
                intValue = Math.max((LJFF / intValue2) + intValue, 1);
            }
            intValue = Math.min(((Number) C23820wc.LIZ.getValue()).intValue(), intValue);
        }
        return Integer.valueOf(intValue);
    }
}
