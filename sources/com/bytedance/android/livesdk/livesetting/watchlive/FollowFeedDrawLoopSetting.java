package com.bytedance.android.livesdk.livesetting.watchlive;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.live.model.LiveFollowFeedDrawLoop;
import kotlin.jvm.internal.o;

@SettingsKey("follow_feed_draw_loop")
/* loaded from: classes6.dex */
public final class FollowFeedDrawLoopSetting {

    @Group(isDefault = true, value = "default group")
    public static final LiveFollowFeedDrawLoop DEFAULT;
    public static final FollowFeedDrawLoopSetting INSTANCE = new FollowFeedDrawLoopSetting();

    static {
        LiveFollowFeedDrawLoop liveFollowFeedDrawLoop = LiveFollowFeedDrawLoop.getDefault();
        o.LJIIIIZZ(liveFollowFeedDrawLoop, "getDefault()");
        DEFAULT = liveFollowFeedDrawLoop;
    }

    public final LiveFollowFeedDrawLoop getValue() {
        LiveFollowFeedDrawLoop liveFollowFeedDrawLoop = (LiveFollowFeedDrawLoop) SettingsManager.INSTANCE.getValueSafely(FollowFeedDrawLoopSetting.class);
        if (liveFollowFeedDrawLoop == null) {
            return DEFAULT;
        }
        return liveFollowFeedDrawLoop;
    }

    public final LiveFollowFeedDrawLoop getDEFAULT() {
        return DEFAULT;
    }
}
