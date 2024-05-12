package X;

/* loaded from: classes7.dex */
public final class DKG extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final DKG LJLIL = new DKG();

    public DKG() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z = false;
        if (C00F.LIZ(31744, 0, "xjl_feed_hot_area_async_report_exp", true) == 1) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
