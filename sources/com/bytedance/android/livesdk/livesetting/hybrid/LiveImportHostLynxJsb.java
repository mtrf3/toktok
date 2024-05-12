package com.bytedance.android.livesdk.livesetting.hybrid;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("mt_live_import_lynx_jsb")
/* loaded from: classes6.dex */
public final class LiveImportHostLynxJsb {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = true;
    public static final LiveImportHostLynxJsb INSTANCE = new LiveImportHostLynxJsb();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(LiveImportHostLynxJsb.class);
    }
}
