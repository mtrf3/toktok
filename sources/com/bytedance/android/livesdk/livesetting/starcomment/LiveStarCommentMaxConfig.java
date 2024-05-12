package com.bytedance.android.livesdk.livesetting.starcomment;

import X.C221108m2;
import X.C31531CZb;
import X.C5H3;
import X.EnumC221088m0;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;

@SettingsKey("live_star_comment_max_retry_count")
/* loaded from: classes6.dex */
public final class LiveStarCommentMaxConfig {
    public static final LiveStarCommentMaxConfig INSTANCE = new LiveStarCommentMaxConfig();

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 5;
    public static final C5H3 settingValue$delegate = C221108m2.LIZ(EnumC221088m0.NONE, C31531CZb.LJLIL);

    public final int getSettingValue() {
        return ((Number) settingValue$delegate.getValue()).intValue();
    }
}
