package X;

import com.bytedance.lighten.core.config.ILightenConfigOutService;

/* loaded from: classes15.dex */
public final class WDF extends AbstractC65781Prl implements InterfaceC65784Pro<String[]> {
    public static final WDF LJLIL = new WDF();

    public WDF() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final String[] invoke() {
        ILightenConfigOutService LIZ = C73368Sqq.LIZ();
        if (LIZ != null) {
            return LIZ.LJIIIZ();
        }
        return null;
    }
}
