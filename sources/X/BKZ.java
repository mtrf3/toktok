package X;

import android.text.TextUtils;
import com.bytedance.android.livesdk.livesetting.feed.LiveLandscapeInnerFeedSetting;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class BKZ {
    public static final /* synthetic */ int LIZ = 0;

    public static final boolean LIZ(String str, String str2, boolean z, Boolean bool) {
        if (!LiveLandscapeInnerFeedSetting.INSTANCE.isEnable() || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str) || z) {
            return false;
        }
        if ((!o.LJ("live_cover", str2) || !o.LJ("live_merge", str)) && ((!o.LJ("live_cell", str2) || !o.LJ("homepage_hot", str)) && (!o.LJ("video_head", str2) || !o.LJ("homepage_hot", str)))) {
            if (o.LJ("video_head", str2) && o.LJ("homepage_follow", str)) {
                return o.LJ(bool, Boolean.TRUE);
            }
            if (o.LJ("live_cover", str2) && o.LJ("message", str)) {
                return o.LJ(bool, Boolean.TRUE);
            }
            if (o.LJ("live_cover", str2) && o.LJ("homepage_follow", str)) {
                return o.LJ(bool, Boolean.TRUE);
            }
            if ((!o.LJ("homepage_follow", str2) || !o.LJ("follow_recommend", str)) && (!o.LJ("message", str2) || !o.LJ("follow_recommend", str))) {
                return false;
            }
        }
        return true;
    }
}
