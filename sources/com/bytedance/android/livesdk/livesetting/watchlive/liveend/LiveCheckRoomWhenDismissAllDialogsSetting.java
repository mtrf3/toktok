package com.bytedance.android.livesdk.livesetting.watchlive.liveend;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_check_room_when_dismiss_all_dialogs")
/* loaded from: classes6.dex */
public final class LiveCheckRoomWhenDismissAllDialogsSetting {
    public static final LiveCheckRoomWhenDismissAllDialogsSetting INSTANCE = new LiveCheckRoomWhenDismissAllDialogsSetting();

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = true;

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(LiveCheckRoomWhenDismissAllDialogsSetting.class);
    }

    public final boolean getDEFAULT() {
        return DEFAULT;
    }
}
