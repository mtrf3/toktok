package X;

import android.content.Context;
import com.bytedance.lighten.core.config.ILightenConfigOutService;

/* loaded from: classes15.dex */
public final class WDJ extends AbstractC65781Prl implements InterfaceC65784Pro<Context> {
    public static final WDJ LJLIL = new WDJ();

    public WDJ() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Context invoke() {
        ILightenConfigOutService LIZ = C73368Sqq.LIZ();
        if (LIZ != null) {
            return LIZ.getContext();
        }
        return null;
    }
}
