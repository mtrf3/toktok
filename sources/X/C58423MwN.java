package X;

/* renamed from: X.MwN, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C58423MwN extends AbstractC65781Prl implements InterfaceC65784Pro<Integer> {
    public static final C58423MwN LJLIL = new C58423MwN();

    public C58423MwN() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Integer invoke() {
        int i;
        if (((Boolean) C58424MwO.LIZIZ.getValue()).booleanValue()) {
            i = ((Number) C58424MwO.LIZ.getValue()).intValue() % 10;
        } else {
            i = 0;
        }
        return Integer.valueOf(i);
    }
}
