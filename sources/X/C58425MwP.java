package X;

/* renamed from: X.MwP, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C58425MwP extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C58425MwP LJLIL = new C58425MwP();

    public C58425MwP() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        if (((Number) C58424MwO.LIZJ.getValue()).intValue() == 1) {
            int intValue = ((Number) C58424MwO.LIZLLL.getValue()).intValue();
            if (intValue != 1 && intValue != 2) {
                return Boolean.FALSE;
            }
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }
}
