package com.bytedance.android.livesdk.livesetting.watchlive;

import X.C221108m2;
import X.C5H3;
import X.OOD;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.livesdk.live.model.LivePreviewCardMaskConfig;

@SettingsKey("live_preview_card_mask")
/* loaded from: classes11.dex */
public final class LivePreViewMaskSettings {
    public static final LivePreViewMaskSettings INSTANCE = new LivePreViewMaskSettings();

    @Group(isDefault = true, value = "default group")
    public static final LivePreviewCardMaskConfig DEFAULT = new LivePreviewCardMaskConfig();
    public static final C5H3 settingVal$delegate = C221108m2.LIZIZ(OOD.LJLIL);

    private final LivePreviewCardMaskConfig getSettingVal() {
        return (LivePreviewCardMaskConfig) settingVal$delegate.getValue();
    }

    public final LivePreviewCardMaskConfig getValue() {
        return getSettingVal();
    }

    public final LivePreviewCardMaskConfig getDEFAULT() {
        return DEFAULT;
    }
}
