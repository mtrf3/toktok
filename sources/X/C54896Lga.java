package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.stemfeed.settings.StemFeedConfig;
import com.ss.android.ugc.aweme.stemfeed.settings.WelcomePopup;

/* renamed from: X.Lga, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C54896Lga {
    public static final StemFeedConfig LIZ = new StemFeedConfig(new WelcomePopup(null, null, null, 7, null), null, null, 4, null);

    public static final StemFeedConfig LIZ() {
        SettingsManager LIZLLL = SettingsManager.LIZLLL();
        StemFeedConfig stemFeedConfig = LIZ;
        StemFeedConfig stemFeedConfig2 = (StemFeedConfig) LIZLLL.LJIIIIZZ("stem_feed", StemFeedConfig.class, stemFeedConfig);
        if (stemFeedConfig2 == null) {
            return stemFeedConfig;
        }
        return stemFeedConfig2;
    }
}
