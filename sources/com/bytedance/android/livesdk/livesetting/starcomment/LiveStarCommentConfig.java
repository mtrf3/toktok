package com.bytedance.android.livesdk.livesetting.starcomment;

import X.C221108m2;
import X.C31530CZa;
import X.C5H3;
import X.EnumC221088m0;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;

@SettingsKey("live_star_comment_self_waiting_time")
/* loaded from: classes6.dex */
public final class LiveStarCommentConfig {
    public static final LiveStarCommentConfig INSTANCE = new LiveStarCommentConfig();

    @Group(isDefault = true, value = "default group")
    public static final long DEFAULT = 3000;
    public static final C5H3 settingValue$delegate = C221108m2.LIZ(EnumC221088m0.NONE, C31530CZa.LJLIL);

    public final long getSettingValue() {
        return ((Number) settingValue$delegate.getValue()).longValue();
    }
}
