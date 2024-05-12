package com.bytedance.android.livesdk.livesetting.broadcast;

import X.C221108m2;
import X.C5H3;
import X.CKY;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;

@SettingsKey("ttlivestreamer_use_camera_capture_pts_in_rtc")
/* loaded from: classes6.dex */
public final class TTLSUseCameraCaptureVideoPtsInRtc {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final TTLSUseCameraCaptureVideoPtsInRtc INSTANCE = new TTLSUseCameraCaptureVideoPtsInRtc();
    public static final C5H3 value$delegate = C221108m2.LIZIZ(CKY.LJLIL);

    private final boolean getValue() {
        return ((Boolean) value$delegate.getValue()).booleanValue();
    }

    public final boolean enabled() {
        return getValue();
    }
}
