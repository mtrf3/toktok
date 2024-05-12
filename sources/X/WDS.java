package X;

import com.bytedance.lighten.core.config.ILightenConfigOutService;

/* loaded from: classes15.dex */
public final class WDS extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final WDS LJLIL = new WDS();

    public WDS() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        ILightenConfigOutService LIZ = C73368Sqq.LIZ();
        if (LIZ != null) {
            return LIZ.LJIIZILJ();
        }
        return null;
    }
}
