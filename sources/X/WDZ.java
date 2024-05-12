package X;

import com.bytedance.lighten.core.config.ILightenConfigOutService;

/* loaded from: classes15.dex */
public final class WDZ extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final WDZ LJLIL = new WDZ();

    public WDZ() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        ILightenConfigOutService LIZ = C73368Sqq.LIZ();
        if (LIZ != null) {
            return LIZ.LJJIJIIJIL();
        }
        return null;
    }
}
