package X;

/* loaded from: classes7.dex */
public final class DU9 extends AbstractC65781Prl implements InterfaceC65784Pro<Integer> {
    public static final DU9 LJLIL = new DU9();

    public DU9() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Integer invoke() {
        int i = 0;
        try {
            FFL.LJIIIZ().getClass();
            i = FFL.LJIIJ(31744, 0, "feed_query_real_time_client_info", true);
        } catch (Exception unused) {
        }
        return Integer.valueOf(i);
    }
}
