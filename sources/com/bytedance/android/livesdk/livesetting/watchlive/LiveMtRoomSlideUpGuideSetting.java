package com.bytedance.android.livesdk.livesetting.watchlive;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.live.model.RoomSlideUpGuide;
import kotlin.jvm.internal.o;

@SettingsKey("live_mt_room_slide_up_guide")
/* loaded from: classes6.dex */
public final class LiveMtRoomSlideUpGuideSetting {

    @Group(isDefault = true, value = "default group")
    public static final RoomSlideUpGuide DEFAULT;
    public static final LiveMtRoomSlideUpGuideSetting INSTANCE = new LiveMtRoomSlideUpGuideSetting();

    static {
        RoomSlideUpGuide defaultInstance = RoomSlideUpGuide.defaultInstance();
        o.LJIIIIZZ(defaultInstance, "defaultInstance()");
        DEFAULT = defaultInstance;
    }

    public final RoomSlideUpGuide getValue() {
        RoomSlideUpGuide roomSlideUpGuide = (RoomSlideUpGuide) SettingsManager.INSTANCE.getValueSafely(LiveMtRoomSlideUpGuideSetting.class);
        if (roomSlideUpGuide == null) {
            return DEFAULT;
        }
        return roomSlideUpGuide;
    }

    public final RoomSlideUpGuide getDEFAULT() {
        return DEFAULT;
    }
}
