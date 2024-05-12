package com.ss.android.ugc.aweme.feed.model;

import X.V0N;

/* loaded from: classes4.dex */
public enum MultiBitrateAdapterErrorCode {
    DEFAULT_CODE(0),
    SETTING_MULTI_BITRATE_CONFIG_ERROR(100),
    INTERNET_SPEED_ERROR(102),
    IMAGE_RESOURCE_EMPTY(101),
    IMAGE_RESOURCE_MATCH_ERROR(103),
    SETTING_DEFAULT_RESOURCE_MATCH_ERROR(104),
    SETTING_MULTI_BITRATE_CONFIG_MATCH_ERROR(105);

    public final int code;

    public static MultiBitrateAdapterErrorCode valueOf(String str) {
        return (MultiBitrateAdapterErrorCode) V0N.LJJJ(MultiBitrateAdapterErrorCode.class, str);
    }

    public final int getCode() {
        return this.code;
    }

    MultiBitrateAdapterErrorCode(int i) {
        this.code = i;
    }
}
