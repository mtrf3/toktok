package X;

import com.bytedance.lighten.core.config.ILightenConfigOutService;

/* loaded from: classes15.dex */
public final class WDH extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final WDH LJLIL = new WDH();

    public WDH() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        ILightenConfigOutService LIZ = C73368Sqq.LIZ();
        if (LIZ != null) {
            return LIZ.LJJIIJ();
        }
        return null;
    }
}
