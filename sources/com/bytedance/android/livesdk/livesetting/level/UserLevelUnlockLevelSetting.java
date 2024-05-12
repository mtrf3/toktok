package com.bytedance.android.livesdk.livesetting.level;

import X.C47261Igj;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import java.util.List;

@SettingsKey("live_user_level_unlock_level")
/* loaded from: classes6.dex */
public final class UserLevelUnlockLevelSetting {
    public static final UserLevelUnlockLevelSetting INSTANCE = new UserLevelUnlockLevelSetting();

    @Group(isDefault = true, value = "default group")
    public static final List<Integer> DEFAULT = C47261Igj.LJJIJIIJI(10, 15, 20, 25, 30, 40);

    public final List<Integer> getValue() {
        List<Integer> list = (List) SettingsManager.INSTANCE.getValueSafely(UserLevelUnlockLevelSetting.class);
        if (list == null) {
            return DEFAULT;
        }
        return list;
    }
}
