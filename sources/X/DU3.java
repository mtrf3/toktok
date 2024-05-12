package X;

/* loaded from: classes7.dex */
public final class DU3 extends AbstractC65781Prl implements InterfaceC65784Pro<Long> {
    public static final DU3 LJLIL = new DU3();

    public DU3() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Long invoke() {
        long j = 0;
        try {
            FFL.LJIIIZ().getClass();
            j = FFL.LJIILIIL(31744, 0L, "applog_flush_when_slide_up_delay_time");
        } catch (Exception unused) {
        }
        return Long.valueOf(j);
    }
}
