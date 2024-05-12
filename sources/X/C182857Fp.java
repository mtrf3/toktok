package X;

/* renamed from: X.7Fp, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C182857Fp extends AbstractC65781Prl implements InterfaceC65784Pro<Integer> {
    public static final C182857Fp LJLIL = new C182857Fp();

    public C182857Fp() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Integer invoke() {
        int i;
        if (((Boolean) C79488VHo.LJ.getValue()).booleanValue()) {
            i = ((Number) C79488VHo.LJFF.getValue()).intValue();
            if (i < 0) {
                i = 0;
            }
        } else {
            i = 16;
        }
        return Integer.valueOf(i);
    }
}
