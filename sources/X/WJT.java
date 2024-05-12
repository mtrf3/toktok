package X;

import com.ss.android.ugc.gamora.editor.audioservice.service.experiment.EnableLoudNormAndAlignInDuetConfig;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class WJT extends AbstractC65781Prl implements InterfaceC65784Pro<EnableLoudNormAndAlignInDuetConfig> {
    public static final WJT LJLIL = new WJT();

    public WJT() {
        super(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC65784Pro
    public final EnableLoudNormAndAlignInDuetConfig invoke() {
        FFL LJIIIZ = FFL.LJIIIZ();
        EnableLoudNormAndAlignInDuetConfig enableLoudNormAndAlignInDuetConfig = WJU.LIZIZ;
        LJIIIZ.getClass();
        Object LJIJ = FFL.LJIJ(true, "enable_loudnorm_and_align_in_duet", 31744, EnableLoudNormAndAlignInDuetConfig.class, enableLoudNormAndAlignInDuetConfig);
        if (LJIJ == 0) {
            WJU.LIZ.getClass();
        } else {
            enableLoudNormAndAlignInDuetConfig = LJIJ;
        }
        o.LJIIIIZZ(enableLoudNormAndAlignInDuetConfig, "ABManager.getInstance()\n…         ?: defaultConfig");
        return enableLoudNormAndAlignInDuetConfig;
    }
}
