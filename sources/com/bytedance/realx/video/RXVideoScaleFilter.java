package com.bytedance.realx.video;

import X.V0N;
import com.bytedance.vcloud.abrmodule.ABRConfig;

/* loaded from: classes33.dex */
public enum RXVideoScaleFilter {
    kLibYUVNone(0),
    kLibYUVLinear(1),
    kLibYUVBilinear(2),
    kLibYUVBox(3),
    kFFMPegFastBilinear(4),
    kFFMPegBilinear(5),
    kFFMPegBicubic(6),
    kFFMPegGauss(7),
    kFFMPegLanczos(8),
    kOpenGLOrigin(9),
    kOpenGLBilinear(10),
    kOpenGLBicubic(11),
    kOpenGLBox(12);

    public int value;

    /* renamed from: com.bytedance.realx.video.RXVideoScaleFilter$1, reason: invalid class name */
    /* loaded from: classes33.dex */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$com$bytedance$realx$video$RXVideoScaleFilter;

        static {
            int[] iArr = new int[RXVideoScaleFilter.values().length];
            $SwitchMap$com$bytedance$realx$video$RXVideoScaleFilter = iArr;
            try {
                iArr[RXVideoScaleFilter.kLibYUVNone.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$bytedance$realx$video$RXVideoScaleFilter[RXVideoScaleFilter.kLibYUVLinear.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$bytedance$realx$video$RXVideoScaleFilter[RXVideoScaleFilter.kLibYUVBilinear.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$bytedance$realx$video$RXVideoScaleFilter[RXVideoScaleFilter.kLibYUVBox.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$bytedance$realx$video$RXVideoScaleFilter[RXVideoScaleFilter.kFFMPegFastBilinear.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$bytedance$realx$video$RXVideoScaleFilter[RXVideoScaleFilter.kFFMPegBilinear.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$bytedance$realx$video$RXVideoScaleFilter[RXVideoScaleFilter.kFFMPegBicubic.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$bytedance$realx$video$RXVideoScaleFilter[RXVideoScaleFilter.kFFMPegGauss.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$bytedance$realx$video$RXVideoScaleFilter[RXVideoScaleFilter.kFFMPegLanczos.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$com$bytedance$realx$video$RXVideoScaleFilter[RXVideoScaleFilter.kOpenGLOrigin.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$com$bytedance$realx$video$RXVideoScaleFilter[RXVideoScaleFilter.kOpenGLBilinear.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$com$bytedance$realx$video$RXVideoScaleFilter[RXVideoScaleFilter.kOpenGLBicubic.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                $SwitchMap$com$bytedance$realx$video$RXVideoScaleFilter[RXVideoScaleFilter.kOpenGLBox.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
        }
    }

    @Override // java.lang.Enum
    public String toString() {
        switch (AnonymousClass1.$SwitchMap$com$bytedance$realx$video$RXVideoScaleFilter[ordinal()]) {
            case 1:
                return "kLibYUVNone";
            case 2:
                return "kLibYUVLinear";
            case 3:
                return "kLibYUVBilinear";
            case 4:
                return "kLibYUVBox";
            case 5:
                return "kFFMPegFastBilinear";
            case 6:
                return "kFFMPegBilinear";
            case 7:
                return "kFFMPegBicubic";
            case 8:
                return "kFFMPegGauss";
            case 9:
                return "kFFMPegLanczos";
            case 10:
                return "kOpenGLOrigin";
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                return "kOpenGLBilinear";
            case 12:
                return "kOpenGLBicubic";
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                return "kOpenGLBox";
            default:
                return "unknownValue";
        }
    }

    public int value() {
        return this.value;
    }

    public static RXVideoScaleFilter fromId(int i) {
        for (RXVideoScaleFilter rXVideoScaleFilter : values()) {
            if (rXVideoScaleFilter.value() == i) {
                return rXVideoScaleFilter;
            }
        }
        return null;
    }

    public static RXVideoScaleFilter valueOf(String str) {
        return (RXVideoScaleFilter) V0N.LJJJ(RXVideoScaleFilter.class, str);
    }

    RXVideoScaleFilter(int i) {
        this.value = i;
    }
}
