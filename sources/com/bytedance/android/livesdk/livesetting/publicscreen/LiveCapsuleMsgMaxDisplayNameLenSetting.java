package com.bytedance.android.livesdk.livesetting.publicscreen;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_capsule_msg_max_display_name_len_setting")
/* loaded from: classes6.dex */
public final class LiveCapsuleMsgMaxDisplayNameLenSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 0;
    public static final LiveCapsuleMsgMaxDisplayNameLenSetting INSTANCE = new LiveCapsuleMsgMaxDisplayNameLenSetting();
    public static final int maxDisplayNameLen = SettingsManager.INSTANCE.getIntValue(LiveCapsuleMsgMaxDisplayNameLenSetting.class);

    public final int getMaxDisplayNameLen() {
        return maxDisplayNameLen;
    }
}
