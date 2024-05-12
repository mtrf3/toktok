package com.bytedance.android.livesdk.livesetting.linkmic;

import X.C221108m2;
import X.C58502Mxe;
import X.C5H3;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;

@SettingsKey(preciseExperiment = false, value = "livesdk_voice_chat_audience_container_switch")
/* loaded from: classes11.dex */
public final class LivesdkVoiceChatAudienceContainerSwitchSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = true;
    public static final LivesdkVoiceChatAudienceContainerSwitchSetting INSTANCE = new LivesdkVoiceChatAudienceContainerSwitchSetting();
    public static final C5H3 enable$delegate = C221108m2.LIZIZ(C58502Mxe.LJLIL);

    private final boolean getEnable() {
        return ((Boolean) enable$delegate.getValue()).booleanValue();
    }

    public final boolean userInteractAnchorContainer() {
        return getEnable();
    }
}
