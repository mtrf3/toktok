package com.byted.cast.mediacommon.render.parameters;

import X.V0N;

/* loaded from: classes29.dex */
public enum CodecId {
    H264,
    H265,
    PCM,
    ALAC,
    AACLC,
    AACELD;

    public static CodecId valueOf(String str) {
        return (CodecId) V0N.LJJJ(CodecId.class, str);
    }
}
