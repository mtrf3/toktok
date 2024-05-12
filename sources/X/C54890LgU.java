package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.popularfeed.settings.PopularFeedConfig;
import com.ss.android.ugc.aweme.popularfeed.settings.WelcomePopup;

/* renamed from: X.LgU, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C54890LgU {
    public static final PopularFeedConfig LIZ = new PopularFeedConfig(new WelcomePopup(null, null, null, 7, null), null, null, 4, null);

    public static final PopularFeedConfig LIZ() {
        SettingsManager LIZLLL = SettingsManager.LIZLLL();
        PopularFeedConfig popularFeedConfig = LIZ;
        PopularFeedConfig popularFeedConfig2 = (PopularFeedConfig) LIZLLL.LJIIIIZZ("popular_feed", PopularFeedConfig.class, popularFeedConfig);
        if (popularFeedConfig2 == null) {
            return popularFeedConfig;
        }
        return popularFeedConfig2;
    }
}
