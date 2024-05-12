package com.bytedance.android.livesdk.livesetting.gift;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("gift_send_become_guest_black_list")
/* loaded from: classes6.dex */
public final class LiveGiftSendBecomeGuestBlackList {
    public static final LiveGiftSendBecomeGuestBlackList INSTANCE = new LiveGiftSendBecomeGuestBlackList();

    @Group(isDefault = true, value = "default group")
    public static final FindGiftBlackList DEFAULT = new FindGiftBlackList(null, 1, null);

    public final FindGiftBlackList getValue() {
        FindGiftBlackList findGiftBlackList = (FindGiftBlackList) SettingsManager.INSTANCE.getValueSafely(LiveGiftSendBecomeGuestBlackList.class);
        if (findGiftBlackList == null) {
            return DEFAULT;
        }
        return findGiftBlackList;
    }
}
