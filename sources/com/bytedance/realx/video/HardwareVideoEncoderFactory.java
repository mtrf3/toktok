package com.bytedance.realx.video;

import X.X1D;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.os.Build;
import com.bytedance.realx.base.RXDeviceInfoAndroid;
import com.bytedance.realx.base.RXLogging;
import com.bytedance.realx.video.EglBase;
import com.bytedance.realx.video.EglBase14;
import java.util.ArrayList;

/* loaded from: classes33.dex */
public class HardwareVideoEncoderFactory {
    public EglBase14.Context sharedContext;

    public static boolean isTrustedCodec(RXVideoCodecDesc rXVideoCodecDesc) {
        return false;
    }

    /* renamed from: com.bytedance.realx.video.HardwareVideoEncoderFactory$1, reason: invalid class name */
    /* loaded from: classes33.dex */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$com$bytedance$realx$video$RXVideoCodecStandard;

        static {
            int[] iArr = new int[RXVideoCodecStandard.values().length];
            $SwitchMap$com$bytedance$realx$video$RXVideoCodecStandard = iArr;
            try {
                iArr[RXVideoCodecStandard.H264.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$bytedance$realx$video$RXVideoCodecStandard[RXVideoCodecStandard.ByteVC1.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$bytedance$realx$video$RXVideoCodecStandard[RXVideoCodecStandard.VP8.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$bytedance$realx$video$RXVideoCodecStandard[RXVideoCodecStandard.VP9.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public static RXVideoCodecDesc[] getSupportedCodecs() {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        RXVideoCodecStandard[] rXVideoCodecStandardArr = {RXVideoCodecStandard.ByteVC1, RXVideoCodecStandard.H264, RXVideoCodecStandard.VP8};
        do {
            RXVideoCodecStandard rXVideoCodecStandard = rXVideoCodecStandardArr[i];
            MediaCodecInfo findCodecForType = findCodecForType(rXVideoCodecStandard);
            if (findCodecForType != null) {
                if (rXVideoCodecStandard == RXVideoCodecStandard.ByteVC1 && isSupportedCodec(findCodecForType, rXVideoCodecStandard)) {
                    arrayList.add(new RXVideoCodecDesc(rXVideoCodecStandard, RXVideoCodecProfile.ByteVC1ProfileMain));
                }
                if (rXVideoCodecStandard == RXVideoCodecStandard.H264) {
                    if (isH264HighProfileSupported(findCodecForType)) {
                        arrayList.add(new RXVideoCodecDesc(rXVideoCodecStandard, RXVideoCodecProfile.ProfileHigh));
                    }
                    arrayList.add(new RXVideoCodecDesc(rXVideoCodecStandard, RXVideoCodecProfile.ProfileBaseline));
                }
                if (rXVideoCodecStandard == RXVideoCodecStandard.VP8) {
                    arrayList.add(new RXVideoCodecDesc(rXVideoCodecStandard, RXVideoCodecProfile.VP8ProfileMain));
                }
            }
            i++;
        } while (i < 3);
        return (RXVideoCodecDesc[]) arrayList.toArray(new RXVideoCodecDesc[arrayList.size()]);
    }

    public static MediaCodecInfo findCodecForType(RXVideoCodecStandard rXVideoCodecStandard) {
        MediaCodecInfo mediaCodecInfo;
        try {
            int codecCount = MediaCodecList.getCodecCount();
            for (int i = 0; i < codecCount; i++) {
                try {
                    mediaCodecInfo = MediaCodecList.getCodecInfoAt(i);
                } catch (IllegalArgumentException unused) {
                    mediaCodecInfo = null;
                }
                if (mediaCodecInfo != null && mediaCodecInfo.isEncoder() && !isSoftwareOnly(mediaCodecInfo) && isSupportedCodec(mediaCodecInfo, rXVideoCodecStandard)) {
                    return mediaCodecInfo;
                }
            }
        } catch (Exception unused2) {
        }
        return null;
    }

    public static int getKeyFrameIntervalSec(RXVideoCodecStandard rXVideoCodecStandard) {
        int i = AnonymousClass1.$SwitchMap$com$bytedance$realx$video$RXVideoCodecStandard[rXVideoCodecStandard.ordinal()];
        if (i == 1 || i == 2) {
            return 720;
        }
        if (i == 3 || i == 4) {
            return 100;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Unsupported VideoCodecType ");
        LIZ.append(rXVideoCodecStandard);
        throw new IllegalArgumentException(X1D.LIZIZ(LIZ));
    }

    public static boolean isH264HighProfileSupported(MediaCodecInfo mediaCodecInfo) {
        if (RXDeviceInfoAndroid.GetCpuModel().contains("Amlogic") || Build.VERSION.SDK_INT <= 23) {
            return false;
        }
        return true;
    }

    public static boolean isHardwareSupportedInCurrentSdkByteVC1(MediaCodecInfo mediaCodecInfo) {
        String name = mediaCodecInfo.getName();
        if (name.startsWith("OMX.qcom.")) {
            return true;
        }
        name.startsWith("OMX.Exynos.");
        return true;
    }

    public static boolean isHardwareSupportedInCurrentSdkH264(MediaCodecInfo mediaCodecInfo) {
        String name = mediaCodecInfo.getName();
        if (name.startsWith("OMX.qcom.") || name.startsWith("OMX.sprd.")) {
            return true;
        }
        name.startsWith("OMX.Exynos.");
        return true;
    }

    public static boolean isHardwareSupportedInCurrentSdkVP8(MediaCodecInfo mediaCodecInfo) {
        String name = mediaCodecInfo.getName();
        if (name.startsWith("OMX.qcom.")) {
            return true;
        }
        if (name.startsWith("OMX.Exynos.")) {
            if (Build.VERSION.SDK_INT >= 23) {
                return true;
            }
            return false;
        }
        name.startsWith("OMX.Intel.");
        return true;
    }

    public static boolean isSoftwareOnly(MediaCodecInfo mediaCodecInfo) {
        try {
            if (Build.VERSION.SDK_INT >= 29) {
                return mediaCodecInfo.isSoftwareOnly();
            }
            String name = mediaCodecInfo.getName();
            if (name == null) {
                return false;
            }
            String lowerCase = name.toLowerCase();
            if (lowerCase.startsWith("arc.")) {
                return false;
            }
            if (!lowerCase.startsWith("omx.google.") && !lowerCase.startsWith("omx.ffmpeg.") && ((!lowerCase.startsWith("omx.sec.") || !lowerCase.contains(".sw.")) && !lowerCase.startsWith("c2.android.") && !lowerCase.startsWith("c2.google.") && (lowerCase.startsWith("omx.") || lowerCase.startsWith("c2.")))) {
                return false;
            }
            return true;
        } catch (Exception e) {
            RXLogging.e("HwVideoEncoderFactory", "check encoder softonly error.", e);
            return false;
        }
    }

    public VideoEncoder createEncoder(RXVideoCodecDesc rXVideoCodecDesc) {
        int[] iArr;
        RXVideoCodecStandard standard = rXVideoCodecDesc.getStandard();
        MediaCodecInfo findCodecForType = findCodecForType(standard);
        if (findCodecForType == null) {
            return null;
        }
        String name = findCodecForType.getName();
        String mimeType = standard.mimeType();
        Integer selectColorFormat = MediaCodecUtils.selectColorFormat(MediaCodecUtils.TEXTURE_COLOR_FORMATS, findCodecForType.getCapabilitiesForType(mimeType));
        if (selectColorFormat == null) {
            return null;
        }
        if (name.contains("OMX.hisi.")) {
            iArr = MediaCodecUtils.ENCODER_COLOR_FORMATS_FOR_HISI;
        } else {
            iArr = MediaCodecUtils.ENCODER_COLOR_FORMATS;
        }
        Integer selectColorFormat2 = MediaCodecUtils.selectColorFormat(iArr, findCodecForType.getCapabilitiesForType(mimeType));
        if (selectColorFormat2 == null) {
            return null;
        }
        return new HardwareVideoEncoder(new MediaCodecWrapperFactoryImpl(), name, rXVideoCodecDesc, selectColorFormat, selectColorFormat2, getKeyFrameIntervalSec(standard), getForcedKeyFrameIntervalMs(standard, name), this.sharedContext);
    }

    public void setHardwareContext(EglBase.Context context) {
        if (context instanceof EglBase14.Context) {
            this.sharedContext = (EglBase14.Context) context;
        }
    }

    public static int getForcedKeyFrameIntervalMs(RXVideoCodecStandard rXVideoCodecStandard, String str) {
        if (rXVideoCodecStandard == RXVideoCodecStandard.VP8 && str.startsWith("OMX.qcom.")) {
            int i = Build.VERSION.SDK_INT;
            if (i != 21 && i != 22) {
                if (i == 23) {
                    return 20000;
                }
                if (i <= 23) {
                    return 0;
                }
            }
            return 15000;
        }
        return 0;
    }

    public static boolean isHardwareSupportedInCurrentSdk(MediaCodecInfo mediaCodecInfo, RXVideoCodecStandard rXVideoCodecStandard) {
        int i = AnonymousClass1.$SwitchMap$com$bytedance$realx$video$RXVideoCodecStandard[rXVideoCodecStandard.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return false;
                }
                return isHardwareSupportedInCurrentSdkVP8(mediaCodecInfo);
            }
            return isHardwareSupportedInCurrentSdkByteVC1(mediaCodecInfo);
        }
        return isHardwareSupportedInCurrentSdkH264(mediaCodecInfo);
    }

    public static boolean isSupportedCodec(MediaCodecInfo mediaCodecInfo, RXVideoCodecStandard rXVideoCodecStandard) {
        if (!MediaCodecUtils.codecSupportsType(mediaCodecInfo, rXVideoCodecStandard)) {
            return false;
        }
        try {
            if (MediaCodecUtils.selectColorFormat(MediaCodecUtils.ENCODER_COLOR_FORMATS, mediaCodecInfo.getCapabilitiesForType(rXVideoCodecStandard.mimeType())) == null) {
                return false;
            }
            return isHardwareSupportedInCurrentSdk(mediaCodecInfo, rXVideoCodecStandard);
        } catch (IllegalArgumentException unused) {
            return false;
        }
    }

    public static boolean isBitrateModeSupported(MediaCodecInfo mediaCodecInfo, RXVideoCodecStandard rXVideoCodecStandard, int i) {
        MediaCodecInfo.CodecCapabilities capabilitiesForType = mediaCodecInfo.getCapabilitiesForType(rXVideoCodecStandard.mimeType());
        if (capabilitiesForType == null) {
            RXLogging.e("HwVideoEncoderFactory", "get capability return null.");
            return false;
        }
        MediaCodecInfo.EncoderCapabilities encoderCapabilities = capabilitiesForType.getEncoderCapabilities();
        if (encoderCapabilities == null) {
            RXLogging.e("HwVideoEncoderFactory", "get EncoderCapabilities return null.");
            return false;
        }
        return encoderCapabilities.isBitrateModeSupported(i);
    }
}
