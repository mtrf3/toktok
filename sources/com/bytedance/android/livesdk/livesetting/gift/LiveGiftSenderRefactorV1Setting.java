package com.bytedance.android.livesdk.livesetting.gift;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_gift_sender_refactor_v1")
/* loaded from: classes6.dex */
public final class LiveGiftSenderRefactorV1Setting {

    @Group(isDefault = true, value = "old_sender")
    public static final int DEFAULT = 0;
    public static final LiveGiftSenderRefactorV1Setting INSTANCE = new LiveGiftSenderRefactorV1Setting();

    public final int executorCount() {
        try {
            return SettingsManager.INSTANCE.getIntValue(LiveGiftSenderRefactorV1Setting.class);
        } catch (Throwable unused) {
            return 0;
        }
    }

    public final boolean enable() {
        if (executorCount() != 0) {
            return true;
        }
        return false;
    }
}
