package com.bytedance.android.livesdk.livesetting.linkmic.multilive;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("multiguest_exception_upload_alog_switch")
/* loaded from: classes6.dex */
public final class MultiGuestExceptionUploadAlogSwitch {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final MultiGuestExceptionUploadAlogSwitch INSTANCE = new MultiGuestExceptionUploadAlogSwitch();

    public final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue(MultiGuestExceptionUploadAlogSwitch.class);
    }
}
