package X;

import com.bytedance.lighten.core.config.ILightenConfigOutService;

/* loaded from: classes15.dex */
public final class WDE extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final WDE LJLIL = new WDE();

    public WDE() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        ILightenConfigOutService LIZ = C73368Sqq.LIZ();
        if (LIZ != null) {
            return Boolean.valueOf(LIZ.LJJIII());
        }
        return null;
    }
}
