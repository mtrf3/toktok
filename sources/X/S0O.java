package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.ecommerce.anchor.settings.AnchorDynamicAnimationConfig;

/* loaded from: classes13.dex */
public final class S0O {
    public static final AnchorDynamicAnimationConfig LIZ;

    static {
        new S0O();
        LIZ = new AnchorDynamicAnimationConfig(false, 0, false, 7, null);
    }

    public static final boolean LIZ() {
        if (LIZIZ().enableAds && LIZIZ().delayShowSubtitle > 0) {
            return true;
        }
        return false;
    }

    public static final AnchorDynamicAnimationConfig LIZIZ() {
        SettingsManager LIZLLL = SettingsManager.LIZLLL();
        AnchorDynamicAnimationConfig anchorDynamicAnimationConfig = LIZ;
        AnchorDynamicAnimationConfig anchorDynamicAnimationConfig2 = (AnchorDynamicAnimationConfig) LIZLLL.LJIIIIZZ("ec_anchor_dynamic_view", AnchorDynamicAnimationConfig.class, anchorDynamicAnimationConfig);
        if (anchorDynamicAnimationConfig2 == null) {
            return anchorDynamicAnimationConfig;
        }
        return anchorDynamicAnimationConfig2;
    }
}
