package com.bytedance.android.livesdk.livesetting.gift;

import X.CN1;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdkapi.host.IHostAppContext;

@SettingsKey("live_gift_debug_tools_config")
/* loaded from: classes6.dex */
public final class LiveGiftDebugToolsSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = true;
    public static final LiveGiftDebugToolsSetting INSTANCE = new LiveGiftDebugToolsSetting();

    public final boolean getValue() {
        if (((IHostAppContext) CN1.LIZ(IHostAppContext.class)).isLocalTest()) {
            return SettingsManager.INSTANCE.getBooleanValue(LiveGiftDebugToolsSetting.class);
        }
        return false;
    }
}
