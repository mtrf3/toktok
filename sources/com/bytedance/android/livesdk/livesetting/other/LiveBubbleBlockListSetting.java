package com.bytedance.android.livesdk.livesetting.other;

import X.C61878OQg;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import java.util.List;

@SettingsKey("live_message_platform_bubble_block_list")
/* loaded from: classes6.dex */
public final class LiveBubbleBlockListSetting {
    public static final LiveBubbleBlockListSetting INSTANCE = new LiveBubbleBlockListSetting();

    @Group(isDefault = true, value = "default group")
    public static final List<String> DEFAULT = C61878OQg.INSTANCE;

    public final List<String> getValue() {
        List<String> list = (List) SettingsManager.INSTANCE.getValueSafely(LiveBubbleBlockListSetting.class);
        if (list == null) {
            return DEFAULT;
        }
        return list;
    }
}
