package X;

import com.bytedance.lighten.core.config.ILightenConfigOutService;

/* loaded from: classes15.dex */
public final class WD4 extends AbstractC65781Prl implements InterfaceC65784Pro<java.util.Map<String, ? extends Long>> {
    public static final WD4 LJLIL = new WD4();

    public WD4() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final java.util.Map<String, ? extends Long> invoke() {
        ILightenConfigOutService LIZ = C73368Sqq.LIZ();
        if (LIZ != null) {
            return LIZ.LJJIJ();
        }
        return null;
    }
}
