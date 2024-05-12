package X;

/* loaded from: classes7.dex */
public final class FN3 extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final FN3 LJLIL = new FN3();

    public FN3() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z = false;
        if (C00F.LIZ(31744, 0, "xjl_feed_app_log_global_async", true) == 1) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
