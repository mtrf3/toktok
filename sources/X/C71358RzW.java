package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.ecommerce.anchor.settings.AnchorStaticViewConfig;

/* renamed from: X.RzW, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71358RzW {
    public static final AnchorStaticViewConfig LIZ;

    static {
        new C71358RzW();
        LIZ = new AnchorStaticViewConfig(0, false, false, false, false, 31, null);
    }

    public static final int LIZ() {
        if (LIZJ().enable) {
            return LIZJ().anchorIconStyle;
        }
        return EnumC58739N3n.ONLINE.ordinal();
    }

    public static final int LIZIZ() {
        if (LIZJ().enableAds) {
            return LIZJ().anchorIconStyle;
        }
        return EnumC58739N3n.ONLINE.ordinal();
    }

    public static final AnchorStaticViewConfig LIZJ() {
        SettingsManager LIZLLL = SettingsManager.LIZLLL();
        AnchorStaticViewConfig anchorStaticViewConfig = LIZ;
        AnchorStaticViewConfig anchorStaticViewConfig2 = (AnchorStaticViewConfig) LIZLLL.LJIIIIZZ("ec_anchor_static_view", AnchorStaticViewConfig.class, anchorStaticViewConfig);
        if (anchorStaticViewConfig2 == null) {
            return anchorStaticViewConfig;
        }
        return anchorStaticViewConfig2;
    }
}
