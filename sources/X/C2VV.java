package X;

/* renamed from: X.2VV, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C2VV extends AbstractC65781Prl implements InterfaceC65784Pro<Integer> {
    public static final C2VV LJLIL = new C2VV();

    public C2VV() {
        super(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC65784Pro
    public final Integer invoke() {
        Integer num;
        try {
            FFL.LJIIIZ().getClass();
            Integer valueOf = Integer.valueOf(FFL.LJIIJ(31744, 0, "main_thread_monitor_invalid_remove_observer_experiment", true));
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
