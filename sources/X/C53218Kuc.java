package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.ecommerce.anchor.settings.AnchorPanelStyleConfig;

/* renamed from: X.Kuc, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C53218Kuc {
    public static final AnchorPanelStyleConfig LIZ;

    static {
        new C53218Kuc();
        LIZ = new AnchorPanelStyleConfig(0, 0, 3, null);
    }

    public static final AnchorPanelStyleConfig LIZ() {
        SettingsManager LIZLLL = SettingsManager.LIZLLL();
        AnchorPanelStyleConfig anchorPanelStyleConfig = LIZ;
        AnchorPanelStyleConfig anchorPanelStyleConfig2 = (AnchorPanelStyleConfig) LIZLLL.LJIIIIZZ("ec_anchor_panel", AnchorPanelStyleConfig.class, anchorPanelStyleConfig);
        if (anchorPanelStyleConfig2 == null) {
            return anchorPanelStyleConfig;
        }
        return anchorPanelStyleConfig2;
    }
}
