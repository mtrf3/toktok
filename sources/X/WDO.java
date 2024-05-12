package X;

import com.bytedance.lighten.core.config.ILightenConfigOutService;

/* loaded from: classes15.dex */
public final class WDO extends AbstractC65781Prl implements InterfaceC65784Pro<Integer> {
    public static final WDO LJLIL = new WDO();

    public WDO() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Integer invoke() {
        ILightenConfigOutService LIZ = C73368Sqq.LIZ();
        if (LIZ != null) {
            return LIZ.LJIILL();
        }
        return null;
    }
}
