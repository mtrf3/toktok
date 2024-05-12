package com.bytedance.realx.video;

import X.V0N;

/* loaded from: classes33.dex */
public enum VideoCodecStatus {
    OK(0),
    ERR_PARAMETER(2001),
    ERR_SIZE(2001),
    LEVEL_EXCEEDED(2001),
    UNINITIALIZED(2003),
    MEMORY(2004),
    ERROR(2004),
    TIMEOUT(2004),
    NO_OUTPUT(2008),
    FALLBACK_SOFTWARE(2009),
    MEDIACODEC_EXCEPTION(2016),
    USING_INTERNAL_SURFACE(2017),
    OVERLOAD(2018),
    MEDIACODEC_OUT_OF_RESOLUTION(2022),
    DROP_DECODED_FRAME(2023);

    public final int number;

    public int getNumber() {
        return this.number;
    }

    public static VideoCodecStatus valueOf(String str) {
        return (VideoCodecStatus) V0N.LJJJ(VideoCodecStatus.class, str);
    }

    VideoCodecStatus(int i) {
        this.number = i;
    }
}
