package X;

import com.bytedance.lighten.core.config.ILightenConfigOutService;

/* loaded from: classes15.dex */
public final class WDL extends AbstractC65781Prl implements InterfaceC65784Pro<QGO> {
    public static final WDL LJLIL = new WDL();

    public WDL() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final QGO invoke() {
        ILightenConfigOutService LIZ = C73368Sqq.LIZ();
        if (LIZ != null) {
            return LIZ.LJ();
        }
        return null;
    }
}
