package com.bytedance.realx.video;

import X.V0N;
import com.bytedance.vcloud.abrmodule.ABRConfig;

/* loaded from: classes33.dex */
public enum RXVideoCodecProfile {
    Unknown(0),
    ProfileConstrainedBaseline(1),
    ProfileBaseline(2),
    ProfileMain(3),
    ProfileConstrainedHigh(4),
    ProfileHigh(5),
    ByteVC1ProfileUnknown(10),
    ByteVC1ProfileMain(11),
    ByteVC1ProfileMain10(12),
    VP8ProfileMain(80),
    ByteVC1ProfileMain10HDR10(100),
    ByteVC1ProfileMax(128);

    public int value;

    public int toInt() {
        return this.value;
    }

    public static RXVideoCodecProfile fromValue(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i != 5) {
                                if (i != 80) {
                                    if (i != 100) {
                                        if (i != 128) {
                                            switch (i) {
                                                case 10:
                                                    return ByteVC1ProfileUnknown;
                                                case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                                                    return ByteVC1ProfileMain;
                                                case 12:
                                                    return ByteVC1ProfileMain10;
                                                default:
                                                    return Unknown;
                                            }
                                        }
                                        return ByteVC1ProfileMax;
                                    }
                                    return ByteVC1ProfileMain10HDR10;
                                }
                                return VP8ProfileMain;
                            }
                            return ProfileHigh;
                        }
                        return ProfileConstrainedHigh;
                    }
                    return ProfileMain;
                }
                return ProfileBaseline;
            }
            return ProfileConstrainedBaseline;
        }
        return Unknown;
    }

    public static RXVideoCodecProfile valueOf(String str) {
        return (RXVideoCodecProfile) V0N.LJJJ(RXVideoCodecProfile.class, str);
    }

    RXVideoCodecProfile(int i) {
        this.value = i;
    }
}
