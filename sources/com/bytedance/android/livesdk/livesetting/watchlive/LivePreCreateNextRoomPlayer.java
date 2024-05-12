package com.bytedance.android.livesdk.livesetting.watchlive;

import X.C221108m2;
import X.C28612BKu;
import X.C5H3;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;

@SettingsKey("live_pre_create_next_room_player")
/* loaded from: classes6.dex */
public final class LivePreCreateNextRoomPlayer {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = -1;

    @Group("v1")
    public static final int ENABLE = 3000;
    public static final LivePreCreateNextRoomPlayer INSTANCE = new LivePreCreateNextRoomPlayer();
    public static final C5H3 value$delegate = C221108m2.LIZIZ(C28612BKu.LJLIL);

    public final int getValue() {
        return ((Number) value$delegate.getValue()).intValue();
    }
}
