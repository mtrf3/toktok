package com.bytedance.realx.video;

import X.X1D;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.os.Build;
import com.bytedance.realx.base.RXLogging;
import com.bytedance.realx.video.EglBase;
import java.util.ArrayList;

/* loaded from: classes33.dex */
public class MediaCodecVideoDecoderFactory {
    public EglBase.Context sharedContext;

    public RXVideoCodecDesc[] getSupportedCodecs() {
        ArrayList arrayList = new ArrayList();
        RXVideoCodecStandard rXVideoCodecStandard = RXVideoCodecStandard.H264;
        MediaCodecInfo findCodecForType = findCodecForType(rXVideoCodecStandard);
        if (findCodecForType != null) {
            if (isH264HighProfileSupported(findCodecForType, rXVideoCodecStandard)) {
                arrayList.add(new RXVideoCodecDesc(rXVideoCodecStandard, RXVideoCodecProfile.ProfileHigh));
            }
            arrayList.add(new RXVideoCodecDesc(rXVideoCodecStandard, RXVideoCodecProfile.ProfileBaseline));
        }
        return (RXVideoCodecDesc[]) arrayList.toArray(new RXVideoCodecDesc[arrayList.size()]);
    }

    public MediaCodecVideoDecoderFactory(EglBase.Context context) {
        this.sharedContext = context;
    }

    private MediaCodecInfo findCodecForType(RXVideoCodecStandard rXVideoCodecStandard) {
        int i = 0;
        while (true) {
            MediaCodecInfo mediaCodecInfo = null;
            if (i >= MediaCodecList.getCodecCount()) {
                return null;
            }
            try {
                mediaCodecInfo = MediaCodecList.getCodecInfoAt(i);
            } catch (IllegalArgumentException e) {
                RXLogging.e("MediaCodecVideoDecoderFactory", "Cannot retrieve decoder codec info", e);
            }
            if (mediaCodecInfo == null || mediaCodecInfo.isEncoder() || !isSupportedCodec(mediaCodecInfo, rXVideoCodecStandard)) {
                i++;
            } else {
                return mediaCodecInfo;
            }
        }
    }

    public VideoDecoder createDecoder(RXVideoCodecDesc rXVideoCodecDesc) {
        RXVideoCodecStandard standard = rXVideoCodecDesc.getStandard();
        MediaCodecInfo findCodecForType = findCodecForType(standard);
        if (findCodecForType == null) {
            return null;
        }
        return new AndroidVideoDecoder(new MediaCodecWrapperFactoryImpl(), findCodecForType.getName(), standard, MediaCodecUtils.selectColorFormat(MediaCodecUtils.DECODER_COLOR_FORMATS, findCodecForType.getCapabilitiesForType(standard.mimeType())).intValue(), this.sharedContext);
    }

    public void enableEglLock(boolean z) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("MediaCodecVideoDecoderFactory enableEglLock:");
        LIZ.append(z);
        RXLogging.e("MediaCodecVideoDecoderFactory", X1D.LIZIZ(LIZ));
        EglBase.EglLock.enableEglLock = z;
    }

    public void setHardwareContext(EglBase.Context context) {
        this.sharedContext = context;
    }

    private boolean isH264HighProfileSupported(MediaCodecInfo mediaCodecInfo, RXVideoCodecStandard rXVideoCodecStandard) {
        String name = mediaCodecInfo.getName();
        if (name.startsWith("OMX.qcom.")) {
            return true;
        }
        if (Build.VERSION.SDK_INT >= 23 && name.startsWith("OMX.Exynos.")) {
            return true;
        }
        MediaCodecInfo.CodecCapabilities capabilitiesForType = mediaCodecInfo.getCapabilitiesForType(rXVideoCodecStandard.mimeType());
        int i = 0;
        while (true) {
            MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr = capabilitiesForType.profileLevels;
            if (i >= codecProfileLevelArr.length) {
                return false;
            }
            if (8 == codecProfileLevelArr[i].profile) {
                return true;
            }
            i++;
        }
    }

    private boolean isSupportedCodec(MediaCodecInfo mediaCodecInfo, RXVideoCodecStandard rXVideoCodecStandard) {
        mediaCodecInfo.getName();
        if (!MediaCodecUtils.codecSupportsType(mediaCodecInfo, rXVideoCodecStandard) || MediaCodecUtils.selectColorFormat(MediaCodecUtils.DECODER_COLOR_FORMATS, mediaCodecInfo.getCapabilitiesForType(rXVideoCodecStandard.mimeType())) == null) {
            return false;
        }
        return true;
    }
}
