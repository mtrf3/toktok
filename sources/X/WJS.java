package X;

import com.ss.android.ugc.gamora.editor.audioservice.service.experiment.EnableMicWithBGMConfig;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class WJS extends AbstractC65781Prl implements InterfaceC65784Pro<EnableMicWithBGMConfig> {
    public static final WJS LJLIL = new WJS();

    public WJS() {
        super(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC65784Pro
    public final EnableMicWithBGMConfig invoke() {
        FFL LJIIIZ = FFL.LJIIIZ();
        EnableMicWithBGMConfig enableMicWithBGMConfig = WJR.LIZIZ;
        LJIIIZ.getClass();
        Object LJIJ = FFL.LJIJ(true, "enable_mic_with_bgm", 31744, EnableMicWithBGMConfig.class, enableMicWithBGMConfig);
        if (LJIJ == 0) {
            WJR.LIZ.getClass();
        } else {
            enableMicWithBGMConfig = LJIJ;
        }
        o.LJIIIIZZ(enableMicWithBGMConfig, "ABManager.getInstance()\n…         ?: defaultConfig");
        return enableMicWithBGMConfig;
    }
}
