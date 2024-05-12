package com.bytedance.android.livesdk.livesetting.linkmic.multilive;

import X.CN1;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdkapi.host.IHostAppContext;

@SettingsKey("multi_linkmic_skip_allow")
/* loaded from: classes6.dex */
public final class MultiGuestV3SkipAllowSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = true;
    public static final MultiGuestV3SkipAllowSetting INSTANCE = new MultiGuestV3SkipAllowSetting();

    public final boolean getValue() {
        if (SettingsManager.INSTANCE.getBooleanValue(MultiGuestV3SkipAllowSetting.class) && ((IHostAppContext) CN1.LIZ(IHostAppContext.class)).isOffline()) {
            return true;
        }
        return false;
    }
}
