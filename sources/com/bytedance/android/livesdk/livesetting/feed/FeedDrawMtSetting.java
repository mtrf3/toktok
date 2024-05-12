package com.bytedance.android.livesdk.livesetting.feed;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.live.model.LiveFeedDraw;

@SettingsKey("feed_draw_mt")
/* loaded from: classes6.dex */
public final class FeedDrawMtSetting {

    @Group(isDefault = true, value = "default group")
    public static final LiveFeedDraw DEFAULT;
    public static final FeedDrawMtSetting INSTANCE = new FeedDrawMtSetting();

    static {
        LiveFeedDraw.Companion.getClass();
        DEFAULT = new LiveFeedDraw();
    }

    public final LiveFeedDraw getValue() {
        LiveFeedDraw liveFeedDraw = (LiveFeedDraw) SettingsManager.INSTANCE.getValueSafely(FeedDrawMtSetting.class);
        if (liveFeedDraw == null) {
            return DEFAULT;
        }
        return liveFeedDraw;
    }

    public final LiveFeedDraw getDEFAULT() {
        return DEFAULT;
    }
}
