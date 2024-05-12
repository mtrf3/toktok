package com.bytedance.android.livesdk.livesetting.publicscreen;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("public_message_async_dispatch")
/* loaded from: classes6.dex */
public final class LivePublicScreenMessageBufferFree {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final LivePublicScreenMessageBufferFree INSTANCE = new LivePublicScreenMessageBufferFree();

    public static final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(LivePublicScreenMessageBufferFree.class);
    }
}
