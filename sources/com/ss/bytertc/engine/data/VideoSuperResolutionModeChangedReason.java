package com.ss.bytertc.engine.data;

import X.V0N;

/* loaded from: classes33.dex */
public enum VideoSuperResolutionModeChangedReason {
    VIDEO_SUPER_RESOLUTION_MODE_CHANGED_REASON_API_OFF(0),
    VIDEO_SUPER_RESOLUTION_MODE_CHANGED_REASON_API_ON(1),
    VIDEO_SUPER_RESOLUTION_MODE_CHANGED_REASON_RESOLUTION_EXCEED(2),
    VIDEO_SUPER_RESOLUTION_MODE_CHANGED_REASON_OVER_USE(3),
    VIDEO_SUPER_RESOLUTION_MODE_CHANGED_REASON_DEVICE_NOT_SUPPORT(4),
    VIDEO_SUPER_RESOLUTION_MODE_CHANGED_REASON_DYNAMIC_CLOSE(5),
    VIDEO_SUPER_RESOLUTION_MODE_CHANGED_REASON_OTHER_SETTING_DISABLED(6),
    VIDEO_SUPER_RESOLUTION_MODE_CHANGED_REASON_OTHER_SETTING_ENABLED(7),
    VIDEO_SUPER_RESOLUTION_MODE_CHANGED_REASON_NO_COMPONENT(8),
    VIDEO_SUPER_RESOLUTION_MODE_CHANGED_REASON_STREAM_NOT_EXIST(9);

    public int value;

    @Override // java.lang.Enum
    public String toString() {
        int i = this.value;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i != 5) {
                                if (i != 100) {
                                    if (i != 101) {
                                        if (i != 200) {
                                            return "";
                                        }
                                        return "kVideoSuperResolutionModeChangedReasonOther";
                                    }
                                    return "kVideoSuperResolutionModeChangedReasonStreamNotExist";
                                }
                                return "kVideoSuperResolutionModeChangedReasonNoComponent";
                            }
                            return "kVideoSuperResolutionModeChangedReasonDynamicClose";
                        }
                        return "kVideoSuperResolutionModeChangedReasonDeviceNotSupport";
                    }
                    return "kVideoSuperResolutionModeChangedReasonOverUse";
                }
                return "kVideoSuperResolutionModeChangedReasonResolutionExceed";
            }
            return "kVideoSuperResolutionModeChangedReasonAPIOn";
        }
        return "kVideoSuperResolutionModeChangedReasonAPIOff";
    }

    public int value() {
        return this.value;
    }

    public static VideoSuperResolutionModeChangedReason fromId(int i) {
        for (VideoSuperResolutionModeChangedReason videoSuperResolutionModeChangedReason : values()) {
            if (videoSuperResolutionModeChangedReason.value() == i) {
                return videoSuperResolutionModeChangedReason;
            }
        }
        return null;
    }

    public static VideoSuperResolutionModeChangedReason valueOf(String str) {
        return (VideoSuperResolutionModeChangedReason) V0N.LJJJ(VideoSuperResolutionModeChangedReason.class, str);
    }

    VideoSuperResolutionModeChangedReason(int i) {
        this.value = i;
    }
}
