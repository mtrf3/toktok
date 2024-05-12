package com.bytedance.android.livesdk.livesetting.message;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_msg_manager_recycle_enable")
/* loaded from: classes6.dex */
public final class EnableLiveMsgManagerRecycle {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final EnableLiveMsgManagerRecycle INSTANCE = new EnableLiveMsgManagerRecycle();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(EnableLiveMsgManagerRecycle.class);
    }
}
