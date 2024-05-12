package X;

import com.bytedance.lighten.core.config.ILightenConfigOutService;

/* loaded from: classes15.dex */
public final class WDX extends AbstractC65781Prl implements InterfaceC65784Pro<QGA> {
    public static final WDX LJLIL = new WDX();

    public WDX() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final QGA invoke() {
        ILightenConfigOutService LIZ = C73368Sqq.LIZ();
        if (LIZ != null) {
            return LIZ.LJIIIIZZ();
        }
        return null;
    }
}
