package com.bytedance.android.livesdk.livesetting.publicscreen;

import X.C221108m2;
import X.C5H3;
import X.CQZ;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;

@SettingsKey("live_public_screen_interaction_message_avatar")
/* loaded from: classes6.dex */
public final class LivePublicScreenInteractionMessageAvatarSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final LivePublicScreenInteractionMessageAvatarSetting INSTANCE = new LivePublicScreenInteractionMessageAvatarSetting();
    public static final C5H3 value$delegate = C221108m2.LIZIZ(CQZ.LJLIL);

    public final boolean getValue() {
        return ((Boolean) value$delegate.getValue()).booleanValue();
    }
}
