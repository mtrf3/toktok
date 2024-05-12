package X;

/* renamed from: X.DZl, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C34089DZl extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C34089DZl LJLIL = new C34089DZl();

    public C34089DZl() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z = false;
        try {
            FFL.LJIIIZ().getClass();
            z = FFL.LJ(31744, "search_dual_stream_prefetch", true, false);
        } catch (Throwable unused) {
        }
        return Boolean.valueOf(z);
    }
}
