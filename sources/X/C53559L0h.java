package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.experiment.SlideSlipBottomStickerConfig;

/* renamed from: X.L0h, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C53559L0h extends AbstractC65781Prl implements InterfaceC65784Pro<SlideSlipBottomStickerConfig> {
    public static final C53559L0h LJLIL = new C53559L0h();

    public C53559L0h() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final SlideSlipBottomStickerConfig invoke() {
        try {
            SettingsManager LIZLLL = SettingsManager.LIZLLL();
            SlideSlipBottomStickerConfig slideSlipBottomStickerConfig = C53558L0g.LIZ;
            SlideSlipBottomStickerConfig slideSlipBottomStickerConfig2 = (SlideSlipBottomStickerConfig) LIZLLL.LJIIIIZZ("sticker_bottom_slide_slip", SlideSlipBottomStickerConfig.class, slideSlipBottomStickerConfig);
            if (slideSlipBottomStickerConfig2 != null) {
                return slideSlipBottomStickerConfig2;
            }
            return slideSlipBottomStickerConfig;
        } catch (Throwable unused) {
            return C53558L0g.LIZ;
        }
    }
}
