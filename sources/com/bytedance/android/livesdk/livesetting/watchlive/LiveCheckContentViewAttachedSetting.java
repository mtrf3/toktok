package com.bytedance.android.livesdk.livesetting.watchlive;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_check_content_view_attached_setting")
/* loaded from: classes6.dex */
public final class LiveCheckContentViewAttachedSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final LiveCheckContentViewAttachedSetting INSTANCE = new LiveCheckContentViewAttachedSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(LiveCheckContentViewAttachedSetting.class);
    }
}
