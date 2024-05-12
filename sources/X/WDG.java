package X;

import com.bytedance.lighten.core.config.ILightenConfigOutService;

/* loaded from: classes15.dex */
public final class WDG extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final WDG LJLIL = new WDG();

    public WDG() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        ILightenConfigOutService LIZ = C73368Sqq.LIZ();
        if (LIZ != null) {
            LIZ.isLocalTest();
            return Boolean.FALSE;
        }
        return null;
    }
}
