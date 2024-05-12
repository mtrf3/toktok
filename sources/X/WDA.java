package X;

import com.bytedance.lighten.core.config.ILightenConfigOutService;

/* loaded from: classes15.dex */
public final class WDA extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final WDA LJLIL = new WDA();

    public WDA() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        ILightenConfigOutService LIZ = C73368Sqq.LIZ();
        if (LIZ != null) {
            return Boolean.valueOf(LIZ.LJJIL());
        }
        return null;
    }
}
