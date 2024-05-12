package com.bytedance.android.livesdk.livesetting.broadcast;

import X.C221108m2;
import X.C29928Boq;
import X.C5H3;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;

@SettingsKey("mute_anchor_room_audio")
/* loaded from: classes6.dex */
public final class MuteAnchorRoomAudioSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final MuteAnchorRoomAudioSetting INSTANCE = new MuteAnchorRoomAudioSetting();
    public static final C5H3 enable$delegate = C221108m2.LIZIZ(C29928Boq.LJLIL);

    private final boolean getEnable() {
        return ((Boolean) enable$delegate.getValue()).booleanValue();
    }

    public final boolean enableMute() {
        return getEnable();
    }
}
