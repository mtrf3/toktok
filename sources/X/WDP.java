package X;

import com.bytedance.lighten.core.config.ILightenConfigOutService;
import java.io.File;

/* loaded from: classes15.dex */
public final class WDP extends AbstractC65781Prl implements InterfaceC65784Pro<File> {
    public static final WDP LJLIL = new WDP();

    public WDP() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final File invoke() {
        ILightenConfigOutService LIZ = C73368Sqq.LIZ();
        if (LIZ != null) {
            return LIZ.LJJIIJZLJL();
        }
        return null;
    }
}
