package com.bytedance.realx.video;

import X.V0N;

/* loaded from: classes33.dex */
public enum RXVideoCodecStandard {
    H264(0),
    ByteVC1(1),
    Unknown(2),
    VP8(8),
    VP9(9);

    public final int value;

    public String mimeType() {
        int i = this.value;
        if (i != 1) {
            if (i != 8) {
                return "video/avc";
            }
            return "video/x-vnd.on2.vp8";
        }
        return "video/hevc";
    }

    public int toInt() {
        return this.value;
    }

    public static RXVideoCodecStandard fromValue(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 8) {
                    return H264;
                }
                return VP8;
            }
            return ByteVC1;
        }
        return H264;
    }

    public static RXVideoCodecStandard valueOf(String str) {
        return (RXVideoCodecStandard) V0N.LJJJ(RXVideoCodecStandard.class, str);
    }

    RXVideoCodecStandard(int i) {
        this.value = i;
    }
}
