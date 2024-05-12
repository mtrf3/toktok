package com.bytedance.realx.video;

import X.X1D;
import android.media.MediaCodecInfo;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes33.dex */
public class MediaCodecUtils {
    public static final String[] SOFTWARE_IMPLEMENTATION_PREFIXES = {"OMX.google.", "OMX.SEC."};
    public static final int[] DECODER_COLOR_FORMATS = {19, 21, 2141391872, 2141391873, 2141391874, 2141391875, 2141391876};
    public static final int[] ENCODER_COLOR_FORMATS = {19, 21, 2141391872, 2141391876};
    public static final int[] ENCODER_COLOR_FORMATS_FOR_HISI = {21, 19};
    public static final int[] TEXTURE_COLOR_FORMATS = getTextureColorFormats();

    public static int[] getTextureColorFormats() {
        return new int[]{2130708361};
    }

    /* renamed from: com.bytedance.realx.video.MediaCodecUtils$1, reason: invalid class name */
    /* loaded from: classes33.dex */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$com$bytedance$realx$video$RXVideoCodecStandard;

        static {
            int[] iArr = new int[RXVideoCodecStandard.values().length];
            $SwitchMap$com$bytedance$realx$video$RXVideoCodecStandard = iArr;
            try {
                iArr[RXVideoCodecStandard.VP8.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$bytedance$realx$video$RXVideoCodecStandard[RXVideoCodecStandard.VP9.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$bytedance$realx$video$RXVideoCodecStandard[RXVideoCodecStandard.H264.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static boolean codecSupportsType(MediaCodecInfo mediaCodecInfo, RXVideoCodecStandard rXVideoCodecStandard) {
        for (String str : mediaCodecInfo.getSupportedTypes()) {
            if (rXVideoCodecStandard.mimeType().equals(str)) {
                return true;
            }
        }
        return false;
    }

    public static Map<String, String> getCodecProperties(RXVideoCodecStandard rXVideoCodecStandard, boolean z) {
        int i = AnonymousClass1.$SwitchMap$com$bytedance$realx$video$RXVideoCodecStandard[rXVideoCodecStandard.ordinal()];
        if (i != 1 && i != 2) {
            if (i == 3) {
                return new HashMap();
            }
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Unsupported codec: ");
            LIZ.append(rXVideoCodecStandard);
            throw new IllegalArgumentException(X1D.LIZIZ(LIZ));
        }
        return new HashMap();
    }

    public static Integer selectColorFormat(int[] iArr, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        for (int i : iArr) {
            for (int i2 : codecCapabilities.colorFormats) {
                if (i2 == i) {
                    return Integer.valueOf(i2);
                }
            }
        }
        return null;
    }
}
