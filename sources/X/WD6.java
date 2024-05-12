package X;

import com.bytedance.lighten.core.config.ILightenConfigOutService;

/* loaded from: classes15.dex */
public final class WD6 extends AbstractC65781Prl implements InterfaceC65784Pro<Integer> {
    public static final WD6 LJLIL = new WD6();

    public WD6() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Integer invoke() {
        int i;
        ILightenConfigOutService LIZ = C73368Sqq.LIZ();
        if (LIZ != null) {
            i = LIZ.LJIIJJI();
        } else {
            i = 0;
        }
        return Integer.valueOf(i);
    }
}
