package com.bytedance.realx.video;

import X.V0N;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.vcloud.abrmodule.ABRConfig;

/* loaded from: classes33.dex */
public enum RXPixelFormat {
    kUnknown(0),
    kArgb(1),
    kBgra(2),
    kRgba(3),
    kI420(4),
    kNv12(5),
    kNv21(6),
    kRgb(7),
    kNative(8),
    kIYUV(9),
    kYUY2(10),
    kYV12(11),
    kUYVY(12),
    kRGB565(13),
    kMJPEG(14),
    kVideoPixelFormatTexture2D(3553),
    kVideoPixelFormatTextureOES(36197);

    public int value;

    /* renamed from: com.bytedance.realx.video.RXPixelFormat$1, reason: invalid class name */
    /* loaded from: classes33.dex */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$com$bytedance$realx$video$RXPixelFormat;

        static {
            int[] iArr = new int[RXPixelFormat.values().length];
            $SwitchMap$com$bytedance$realx$video$RXPixelFormat = iArr;
            try {
                iArr[RXPixelFormat.kUnknown.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$bytedance$realx$video$RXPixelFormat[RXPixelFormat.kArgb.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$bytedance$realx$video$RXPixelFormat[RXPixelFormat.kBgra.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$bytedance$realx$video$RXPixelFormat[RXPixelFormat.kRgba.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$bytedance$realx$video$RXPixelFormat[RXPixelFormat.kI420.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$bytedance$realx$video$RXPixelFormat[RXPixelFormat.kNv12.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$bytedance$realx$video$RXPixelFormat[RXPixelFormat.kNv21.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$bytedance$realx$video$RXPixelFormat[RXPixelFormat.kRgb.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$bytedance$realx$video$RXPixelFormat[RXPixelFormat.kNative.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$com$bytedance$realx$video$RXPixelFormat[RXPixelFormat.kIYUV.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$com$bytedance$realx$video$RXPixelFormat[RXPixelFormat.kYUY2.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$com$bytedance$realx$video$RXPixelFormat[RXPixelFormat.kYV12.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                $SwitchMap$com$bytedance$realx$video$RXPixelFormat[RXPixelFormat.kUYVY.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                $SwitchMap$com$bytedance$realx$video$RXPixelFormat[RXPixelFormat.kRGB565.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                $SwitchMap$com$bytedance$realx$video$RXPixelFormat[RXPixelFormat.kMJPEG.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                $SwitchMap$com$bytedance$realx$video$RXPixelFormat[RXPixelFormat.kVideoPixelFormatTexture2D.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                $SwitchMap$com$bytedance$realx$video$RXPixelFormat[RXPixelFormat.kVideoPixelFormatTextureOES.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
        }
    }

    @Override // java.lang.Enum
    public String toString() {
        switch (AnonymousClass1.$SwitchMap$com$bytedance$realx$video$RXPixelFormat[ordinal()]) {
            case 1:
                return "kUnknown";
            case 2:
                return "kArgb";
            case 3:
                return "kBgra";
            case 4:
                return "kRgba";
            case 5:
                return "kI420";
            case 6:
                return "kNv12";
            case 7:
                return "kNv21";
            case 8:
                return "kRgb";
            case 9:
                return "kNative";
            case 10:
                return "kIYUV";
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                return "kYUY2";
            case 12:
                return "kYV12";
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                return "kUYVY";
            case 14:
                return "kRGB565";
            case 15:
                return "kMJPEG";
            case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                return "kVideoPixelFormatTexture2D";
            case 17:
                return "kVideoPixelFormatTextureOES";
            default:
                return "kVideoPixelFormatUnknown";
        }
    }

    public int value() {
        return this.value;
    }

    public static RXPixelFormat fromId(int i) {
        for (RXPixelFormat rXPixelFormat : values()) {
            if (rXPixelFormat.value() == i) {
                return rXPixelFormat;
            }
        }
        return null;
    }

    public static RXPixelFormat valueOf(String str) {
        return (RXPixelFormat) V0N.LJJJ(RXPixelFormat.class, str);
    }

    RXPixelFormat(int i) {
        this.value = i;
    }
}
