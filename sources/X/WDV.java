package X;

import com.bytedance.lighten.core.config.ILightenConfigOutService;

/* loaded from: classes15.dex */
public final class WDV extends AbstractC65781Prl implements InterfaceC65784Pro<InterfaceC72547Sdb> {
    public static final WDV LJLIL = new WDV();

    public WDV() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final InterfaceC72547Sdb invoke() {
        ILightenConfigOutService LIZ = C73368Sqq.LIZ();
        if (LIZ != null) {
            return LIZ.LJIILJJIL();
        }
        return null;
    }
}
