package com.bytedance.android.livesdk.livesetting.comment;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_comment_input_dialog_dismiss_fix")
/* loaded from: classes6.dex */
public final class LiveCommentInputDialogDismissFixSetting {
    public static final LiveCommentInputDialogDismissFixSetting INSTANCE = new LiveCommentInputDialogDismissFixSetting();

    @Group(isDefault = true, value = "default group")
    public static final InputDialogFixSettingModel DEFAULT = new InputDialogFixSettingModel(false, 0);

    public static final InputDialogFixSettingModel getValue() {
        InputDialogFixSettingModel inputDialogFixSettingModel = (InputDialogFixSettingModel) SettingsManager.INSTANCE.getValueSafely(LiveCommentInputDialogDismissFixSetting.class);
        if (inputDialogFixSettingModel == null) {
            return DEFAULT;
        }
        return inputDialogFixSettingModel;
    }
}
