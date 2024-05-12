package X;

import com.bytedance.lighten.core.config.ILightenConfigOutService;
import java.util.List;

/* loaded from: classes15.dex */
public final class WD5 extends AbstractC65781Prl implements InterfaceC65784Pro<List<? extends C208518Gh>> {
    public static final WD5 LJLIL = new WD5();

    public WD5() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final List<? extends C208518Gh> invoke() {
        ILightenConfigOutService LIZ = C73368Sqq.LIZ();
        if (LIZ != null) {
            return LIZ.LJIILIIL();
        }
        return null;
    }
}
