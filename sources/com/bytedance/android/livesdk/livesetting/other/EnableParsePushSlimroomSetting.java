package com.bytedance.android.livesdk.livesetting.other;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("enable_parse_push_slimroom")
/* loaded from: classes6.dex */
public final class EnableParsePushSlimroomSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final EnableParsePushSlimroomSetting INSTANCE = new EnableParsePushSlimroomSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(EnableParsePushSlimroomSetting.class);
    }
}
