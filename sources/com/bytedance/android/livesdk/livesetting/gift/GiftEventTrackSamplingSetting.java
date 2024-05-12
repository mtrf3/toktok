package com.bytedance.android.livesdk.livesetting.gift;

import X.C025908h;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.model.message.GiftMessage;
import com.bytedance.android.livesdk.model.message.GiftMonitorInfo;

@SettingsKey("live_gift_event_track_sampling_enable")
/* loaded from: classes6.dex */
public final class GiftEventTrackSamplingSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 0;
    public static final GiftEventTrackSamplingSetting INSTANCE = new GiftEventTrackSamplingSetting();

    public static final boolean enable() {
        if (SettingsManager.INSTANCE.getIntValue(GiftEventTrackSamplingSetting.class) == 1) {
            return true;
        }
        return false;
    }

    public static final boolean hit() {
        if (!enable()) {
            return true;
        }
        if (C025908h.LIZ() % 100 < GiftEventTrackSamplingRatio.INSTANCE.getValue()) {
            return true;
        }
        return false;
    }

    public static final boolean shouldBlock(GiftMessage giftMessage) {
        Long l;
        boolean z;
        long j;
        if (giftMessage != null) {
            User user = giftMessage.toUser;
            if (user != null) {
                j = user.getId();
            } else {
                GiftMonitorInfo giftMonitorInfo = giftMessage.giftMonitorInfo;
                if (giftMonitorInfo != null) {
                    j = giftMonitorInfo.to_user_id;
                }
            }
            l = Long.valueOf(j);
            long LIZ = C025908h.LIZ();
            if (l == null || l.longValue() != LIZ) {
                z = false;
            } else {
                z = true;
            }
            return shouldBlock(z);
        }
        l = null;
        long LIZ2 = C025908h.LIZ();
        if (l == null) {
            z = true;
            return shouldBlock(z);
        }
        z = false;
        return shouldBlock(z);
    }

    public static final boolean shouldBlock(boolean z) {
        if (!z) {
            return !hit();
        }
        return false;
    }
}
