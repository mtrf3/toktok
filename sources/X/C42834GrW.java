package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.config.HashtagFeedbackValue;

/* renamed from: X.GrW, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42834GrW {
    public static HashtagFeedbackValue LIZ;

    public static HashtagFeedbackValue LIZ() {
        HashtagFeedbackValue hashtagFeedbackValue = LIZ;
        if (hashtagFeedbackValue != null) {
            return hashtagFeedbackValue;
        }
        HashtagFeedbackValue hashtagFeedbackValue2 = (HashtagFeedbackValue) SettingsManager.LIZLLL().LJIIIIZZ("search_creation_hashtag_feesback_optional_config", HashtagFeedbackValue.class, null);
        LIZ = hashtagFeedbackValue2;
        return hashtagFeedbackValue2;
    }
}
