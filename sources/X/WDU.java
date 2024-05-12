package X;

import com.bytedance.lighten.core.config.ILightenConfigOutService;

/* loaded from: classes15.dex */
public final class WDU extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final WDU LJLIL = new WDU();

    public WDU() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        ILightenConfigOutService LIZ = C73368Sqq.LIZ();
        if (LIZ != null) {
            return LIZ.LJIL();
        }
        return null;
    }
}
