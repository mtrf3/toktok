package X;

/* renamed from: X.2X9, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C2X9 extends AbstractC65781Prl implements InterfaceC65784Pro<Integer> {
    public static final C2X9 LJLIL = new C2X9();

    public C2X9() {
        super(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC65784Pro
    public final Integer invoke() {
        Integer num;
        try {
            FFL.LJIIIZ().getClass();
            Integer valueOf = Integer.valueOf(FFL.LJIIJ(31744, 0, "lego_boot_finish_async_experiment", true));
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
        return 0;
    }
}