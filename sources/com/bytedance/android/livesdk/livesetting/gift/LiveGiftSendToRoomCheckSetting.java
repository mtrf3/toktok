package com.bytedance.android.livesdk.livesetting.gift;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_gift_send_to_room_check")
/* loaded from: classes6.dex */
public final class LiveGiftSendToRoomCheckSetting {

    @Group("DATA_CHANNEL_BLOCK_ANY")
    public static final int DATA_CHANNEL_BLOCK_ANY = 3;

    @Group("DATA_CHANNEL_BLOCK_CHECK_ANCHOR")
    public static final int DATA_CHANNEL_BLOCK_CHECK_ANCHOR = 2;

    @Group(isDefault = true, value = "SKIP")
    public static final int DEFAULT = 0;

    @Group("GLOBAL_BLOCK_ANY")
    public static final int GLOBAL_BLOCK_ANY = 5;

    @Group("GLOBAL_BLOCK_CHECK_ANCHOR")
    public static final int GLOBAL_BLOCK_CHECK_ANCHOR = 4;
    public static final LiveGiftSendToRoomCheckSetting INSTANCE = new LiveGiftSendToRoomCheckSetting();

    @Group("SCAN")
    public static final int SCAN = 1;

    public final boolean dataChannelBlockAny() {
        if (SettingsManager.INSTANCE.getIntValue(LiveGiftSendToRoomCheckSetting.class) == 3) {
            return true;
        }
        return false;
    }

    public final boolean dataChannelBlockCheckAnchor() {
        if (SettingsManager.INSTANCE.getIntValue(LiveGiftSendToRoomCheckSetting.class) == 2) {
            return true;
        }
        return false;
    }

    public final boolean globalBlockAny() {
        if (SettingsManager.INSTANCE.getIntValue(LiveGiftSendToRoomCheckSetting.class) == 5) {
            return true;
        }
        return false;
    }

    public final boolean globalBlockCheckAnchor() {
        if (SettingsManager.INSTANCE.getIntValue(LiveGiftSendToRoomCheckSetting.class) == 4) {
            return true;
        }
        return false;
    }

    public final boolean skip() {
        if (SettingsManager.INSTANCE.getIntValue(LiveGiftSendToRoomCheckSetting.class) == 0) {
            return true;
        }
        return false;
    }
}
