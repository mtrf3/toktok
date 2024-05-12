package X;

/* renamed from: X.72X, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C72X extends AbstractC65781Prl implements InterfaceC65784Pro<Integer> {
    public static final C72X LJLIL = new C72X();

    public C72X() {
        super(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC65784Pro
    public final Integer invoke() {
        Integer num;
        try {
            int i = 0;
            if (!LFH.LIZIZ.LIZLLL().LJIILJJIL().LLJJLIIIJLLLLLLLZ()) {
                FFL.LJIIIZ().getClass();
                i = FFL.LJIIJ(31744, 0, "detail_page_optimize_experiment", true);
            }
            Integer valueOf = Integer.valueOf(i);
            C3C5.m7constructorimpl(valueOf);
            num = valueOf;
        } catch (Throwable th) {
            C3C4 LIZ = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ);
            num = LIZ;
        }
        if (C3C5.m10exceptionOrNullimpl(num) == null) {
            return num;
        }
        return 10;
    }
}
