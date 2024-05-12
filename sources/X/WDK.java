package X;

import com.bytedance.lighten.core.config.ILightenConfigOutService;

/* loaded from: classes15.dex */
public final class WDK extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final WDK LJLIL = new WDK();

    public WDK() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        ILightenConfigOutService LIZ = C73368Sqq.LIZ();
        if (LIZ != null) {
            return LIZ.LJIJJ();
        }
        return null;
    }
}
