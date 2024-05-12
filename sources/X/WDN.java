package X;

import com.bytedance.lighten.core.config.ILightenConfigOutService;

/* loaded from: classes15.dex */
public final class WDN extends AbstractC65781Prl implements InterfaceC65784Pro<AbstractC61742OLa> {
    public static final WDN LJLIL = new WDN();

    public WDN() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final AbstractC61742OLa invoke() {
        ILightenConfigOutService LIZ = C73368Sqq.LIZ();
        if (LIZ != null) {
            return LIZ.LJJIIZI();
        }
        return null;
    }
}
