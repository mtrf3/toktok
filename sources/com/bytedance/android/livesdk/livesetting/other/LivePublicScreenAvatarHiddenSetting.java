package com.bytedance.android.livesdk.livesetting.other;

import X.C221108m2;
import X.C29306Beo;
import X.C5H3;
import X.CTS;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.ies.sdk.datachannel.DataChannel;

@SettingsKey("live_public_screen_avatar_hidden_setting")
/* loaded from: classes6.dex */
public final class LivePublicScreenAvatarHiddenSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 0;
    public static final LivePublicScreenAvatarHiddenSetting INSTANCE = new LivePublicScreenAvatarHiddenSetting();
    public static final C5H3 v$delegate = C221108m2.LIZIZ(CTS.LJLIL);

    public static final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(LivePublicScreenAvatarHiddenSetting.class);
    }

    public final int getV() {
        return ((Number) v$delegate.getValue()).intValue();
    }

    public static final boolean canPreLoadAvatar(DataChannel dataChannel) {
        LivePublicScreenAvatarHiddenSetting livePublicScreenAvatarHiddenSetting = INSTANCE;
        if (livePublicScreenAvatarHiddenSetting.getV() == 0 || livePublicScreenAvatarHiddenSetting.getV() == 2 || C29306Beo.LJIIJ(dataChannel)) {
            return true;
        }
        return false;
    }
}
