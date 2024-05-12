package X;

import com.bytedance.android.livesdk.live.model.LiveFeedSettings;
import com.bytedance.android.livesdk.livesetting.feed.FeedDrawMtSetting;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class BLP {
    public static LiveFeedSettings LIZIZ(String str) {
        java.util.Map<String, LiveFeedSettings> settings = FeedDrawMtSetting.INSTANCE.getValue().getSettings();
        if (str == null) {
            str = "";
        }
        LiveFeedSettings liveFeedSettings = settings.get(str);
        if (liveFeedSettings == null) {
            liveFeedSettings = new LiveFeedSettings();
        }
        return liveFeedSettings;
    }

    public static String LIZ(String str, String str2) {
        if (o.LJ("homepage_hot", str) && o.LJ("video_head", str2)) {
            return "homepage_hot_head_draw";
        }
        if (o.LJ("live_merge", str) && o.LJ("live_cover", str2)) {
            return "feed_draw";
        }
        return "";
    }

    public static LiveFeedSettings LIZJ(String str, String str2) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(str);
        LIZ.append('_');
        LIZ.append(str2);
        return LIZIZ(X1D.LIZIZ(LIZ));
    }
}
