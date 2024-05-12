package X;

/* loaded from: classes7.dex */
public final class DU4 extends AbstractC65781Prl implements InterfaceC65784Pro<Long> {
    public static final DU4 LJLIL = new DU4();

    public DU4() {
        super(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC65784Pro
    public final Long invoke() {
        Long l;
        try {
            FFL.LJIIIZ().getClass();
            Long valueOf = Long.valueOf(FFL.LJIILIIL(31744, 1L, "prefetch_desc_translation_num_prefetch"));
            C3C5.m7constructorimpl(valueOf);
            l = valueOf;
        } catch (Throwable th) {
            C3C4 LIZ = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ);
            l = LIZ;
        }
        if (C3C5.m12isFailureimpl(l)) {
            return null;
        }
        return l;
    }
}
