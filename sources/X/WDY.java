package X;

import com.bytedance.lighten.core.config.ILightenConfigOutService;

/* loaded from: classes15.dex */
public final class WDY extends AbstractC65781Prl implements InterfaceC65784Pro<SIR> {
    public static final WDY LJLIL = new WDY();

    public WDY() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final SIR invoke() {
        ILightenConfigOutService LIZ = C73368Sqq.LIZ();
        if (LIZ != null) {
            return LIZ.LJIIJ();
        }
        return null;
    }
}
