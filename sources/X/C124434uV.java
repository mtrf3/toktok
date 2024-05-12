package X;

import com.ss.android.ugc.gamora.editor.audioservice.service.audioenhance.AudioEnhanceSnrModelConfig;
import kotlin.jvm.internal.o;

/* renamed from: X.4uV, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C124434uV extends AbstractC65781Prl implements InterfaceC65784Pro<AudioEnhanceSnrModelConfig> {
    public static final C124434uV LJLIL = new C124434uV();

    public C124434uV() {
        super(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC65784Pro
    public final AudioEnhanceSnrModelConfig invoke() {
        FFL LJIIIZ = FFL.LJIIIZ();
        AudioEnhanceSnrModelConfig audioEnhanceSnrModelConfig = C124424uU.LIZIZ;
        LJIIIZ.getClass();
        Object LJIJ = FFL.LJIJ(true, "edit_ce_denoise_model_config", 31744, AudioEnhanceSnrModelConfig.class, audioEnhanceSnrModelConfig);
        if (LJIJ == 0) {
            C124424uU.LIZ.getClass();
        } else {
            audioEnhanceSnrModelConfig = LJIJ;
        }
        o.LJIIIIZZ(audioEnhanceSnrModelConfig, "ABManager.getInstance()\n…rModelConfigSwitch.CONFIG");
        return audioEnhanceSnrModelConfig;
    }
}
