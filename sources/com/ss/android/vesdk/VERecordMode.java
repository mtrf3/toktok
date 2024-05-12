package com.ss.android.vesdk;

import X.V0N;

/* loaded from: classes15.dex */
public enum VERecordMode {
    DEFAULT,
    DUET,
    REACTION,
    CUSTOM_VIDEO_BG,
    DUET_KARAOKE,
    KARAOKE,
    KARAOKE_PURE_AUDIO,
    CUSTOM_VIDEO_BG_GIF,
    AUDIO,
    SCREEN,
    MOTION_PHOTO;

    public static VERecordMode valueOf(String str) {
        return (VERecordMode) V0N.LJJJ(VERecordMode.class, str);
    }
}
