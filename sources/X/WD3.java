package X;

import android.graphics.Bitmap;
import com.bytedance.lighten.core.config.ILightenConfigOutService;

/* loaded from: classes15.dex */
public final class WD3 extends AbstractC65781Prl implements InterfaceC65784Pro<Bitmap.Config> {
    public static final WD3 LJLIL = new WD3();

    public WD3() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Bitmap.Config invoke() {
        ILightenConfigOutService LIZ = C73368Sqq.LIZ();
        if (LIZ != null) {
            return LIZ.LIZ();
        }
        return null;
    }
}
