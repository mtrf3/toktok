package com.byted.cast.common.api;

import X.V0N;

/* loaded from: classes29.dex */
public class CodecType {

    /* loaded from: classes29.dex */
    public enum ACODEC_ID {
        AUTO,
        ISACFIX,
        ILBC,
        OPUS,
        G729FEC2,
        G729FEC1,
        OPUSFEC1,
        OPUSFEC2,
        OPUS_8K,
        AAC;

        public static ACODEC_ID valueOf(String str) {
            return (ACODEC_ID) V0N.LJJJ(ACODEC_ID.class, str);
        }
    }

    /* loaded from: classes29.dex */
    public enum VCODEC_ID {
        AUTO,
        H264,
        H265,
        LOSSLESS;

        public static VCODEC_ID valueOf(String str) {
            return (VCODEC_ID) V0N.LJJJ(VCODEC_ID.class, str);
        }
    }

    public static ACODEC_ID valueOfAudio(int i) {
        if (i != 1) {
            if (i != 3) {
                switch (i) {
                    case 6:
                        return ACODEC_ID.OPUSFEC1;
                    case 7:
                        return ACODEC_ID.OPUSFEC2;
                    case 8:
                        return ACODEC_ID.OPUS_8K;
                    case 9:
                        return ACODEC_ID.AAC;
                    default:
                        return ACODEC_ID.AUTO;
                }
            }
            return ACODEC_ID.OPUS;
        }
        return ACODEC_ID.ISACFIX;
    }

    public static VCODEC_ID valueOfVideo(int i) {
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return VCODEC_ID.AUTO;
                }
                return VCODEC_ID.LOSSLESS;
            }
            return VCODEC_ID.H265;
        }
        return VCODEC_ID.H264;
    }
}
