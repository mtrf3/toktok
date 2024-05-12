package com.bytedance.android.livesdk.livesetting.linkmic.multilive;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_linkmic_preview_panel_opt")
/* loaded from: classes6.dex */
public final class MultiGuestV3GuestGoLivePreviewPanelOpt {

    @Group("add close btn")
    public static final int ADD_CLOSE_BTN = 1;

    @Group("add close, pause and silent.")
    public static final int ADD_CLOSE_PAUSE_AND_SILENT = 4;

    @Group("add pause")
    public static final int ADD_PAUSE = 2;

    @Group("add pause and silent")
    public static final int ADD_PAUSE_AND_SILENT = 3;

    @Group(isDefault = true, value = "default")
    public static final int DEFAULT = 0;
    public static final MultiGuestV3GuestGoLivePreviewPanelOpt INSTANCE = new MultiGuestV3GuestGoLivePreviewPanelOpt();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(MultiGuestV3GuestGoLivePreviewPanelOpt.class);
    }

    private final boolean enableCloseClickBtnInPreviewPanel() {
        if (getValue() == 1) {
            return true;
        }
        return false;
    }

    private final boolean enablePauseAndSilentMicWhenInPreviewPanel() {
        if (getValue() == 3) {
            return true;
        }
        return false;
    }

    private final boolean enablePauseWhenInPreviewPanel() {
        if (getValue() == 2) {
            return true;
        }
        return false;
    }

    public final boolean enableCloseAndPauseAndSilentMicWhenInPreviewPanel() {
        if (getValue() == 4) {
            return true;
        }
        return false;
    }

    public final boolean isSupportCloseGoLive() {
        if (enableCloseClickBtnInPreviewPanel() || enableCloseAndPauseAndSilentMicWhenInPreviewPanel()) {
            return true;
        }
        return false;
    }

    public final boolean isSupportPauseGoLiveInPreviewPanel() {
        if (enablePauseWhenInPreviewPanel() || enablePauseAndSilentMicWhenInPreviewPanel() || enableCloseAndPauseAndSilentMicWhenInPreviewPanel()) {
            return true;
        }
        return false;
    }

    public final boolean isSupportSilentMic() {
        if (enablePauseAndSilentMicWhenInPreviewPanel() || enableCloseAndPauseAndSilentMicWhenInPreviewPanel()) {
            return true;
        }
        return false;
    }
}
