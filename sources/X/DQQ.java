package X;

/* loaded from: classes7.dex */
public final class DQQ extends AbstractC65781Prl implements InterfaceC65784Pro<Integer> {
    public static final DQQ LJLIL = new DQQ();

    public DQQ() {
        super(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC65784Pro
    public final Integer invoke() {
        Integer num;
        try {
            FFL.LJIIIZ().getClass();
            Integer valueOf = Integer.valueOf(FFL.LJIIJ(31744, 0, "system_launch_1_minute_do_frame_balancer_experiment", true));
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
