package X;

import com.ss.android.ugc.aweme.property.BrightnessEnhanceConfig;
import kotlin.jvm.internal.o;

/* renamed from: X.IyH, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48349IyH extends AbstractC65781Prl implements InterfaceC65784Pro<BrightnessEnhanceConfig> {
    public static final C48349IyH INSTANCE = new C48349IyH();

    public C48349IyH() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // X.InterfaceC65784Pro
    public final BrightnessEnhanceConfig invoke() {
        try {
            FFL LJIIIZ = FFL.LJIIIZ();
            BrightnessEnhanceConfig brightnessEnhanceConfig = C48348IyG.LIZ;
            LJIIIZ.getClass();
            BrightnessEnhanceConfig brightnessEnhanceConfig2 = (BrightnessEnhanceConfig) FFL.LJIJ(true, "creative_tools_brightness_enhance_config", 31744, BrightnessEnhanceConfig.class, brightnessEnhanceConfig);
            if (brightnessEnhanceConfig2 != null) {
                brightnessEnhanceConfig = brightnessEnhanceConfig2;
            }
            o.LJIIIIZZ(brightnessEnhanceConfig, "ABManager.getInstance().…               ?: DEFAULT");
            return brightnessEnhanceConfig;
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
            return C48348IyG.LIZ;
        }
    }
}
