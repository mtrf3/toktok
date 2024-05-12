package X;

import com.bytedance.lighten.core.config.ILightenConfigOutService;

/* loaded from: classes15.dex */
public final class WDI extends AbstractC65781Prl implements InterfaceC65784Pro<WE8> {
    public static final WDI LJLIL = new WDI();

    public WDI() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final WE8 invoke() {
        ILightenConfigOutService LIZ = C73368Sqq.LIZ();
        if (LIZ != null) {
            return LIZ.LJIIL();
        }
        return null;
    }
}
