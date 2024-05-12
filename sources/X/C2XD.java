package X;

/* renamed from: X.2XD, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C2XD extends AbstractC65781Prl implements InterfaceC65784Pro<Integer> {
    public static final C2XD LJLIL = new C2XD();

    public C2XD() {
        super(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC65784Pro
    public final Integer invoke() {
        Integer num;
        try {
            FFL.LJIIIZ().getClass();
            Integer valueOf = Integer.valueOf(FFL.LJIIJ(31744, 0, "do_frame_balancer_try_catch_dispatch_message_experiment", true));
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
