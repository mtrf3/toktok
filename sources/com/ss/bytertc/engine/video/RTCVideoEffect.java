package com.ss.bytertc.engine.video;

import com.ss.bytertc.engine.InternalExpressDetectConfig;
import com.ss.bytertc.engine.NativeFunctions;
import com.ss.bytertc.engine.NativeRTCVideoFunctions;
import com.ss.bytertc.engine.data.VirtualBackgroundSource;
import com.ss.bytertc.engine.handler.RTCFaceDetectionObserver;
import com.ss.bytertc.engine.utils.LogUtil;
import java.util.List;

/* loaded from: classes33.dex */
public class RTCVideoEffect extends IVideoEffect {
    public IFaceDetectionObserver mFaceDetectionObserver;
    public long mNativeEngine;
    public RTCFaceDetectionObserver mRTCFaceDetectionObserver = new RTCFaceDetectionObserver(this);
    public boolean mUseVideoEngine;

    private boolean engineInvalid() {
        if (this.mNativeEngine == 0) {
            return true;
        }
        return false;
    }

    public void dispose() {
        LogUtil.i("RTCVideoEffect", "dispose rtc video effect");
        this.mNativeEngine = 0L;
    }

    @Override // com.ss.bytertc.engine.video.IVideoEffect
    public int disableFaceDetection() {
        if (engineInvalid()) {
            LogUtil.e("RTCVideoEffect", "invalid, registerFaceDetectionObserver failed.");
            return -1006;
        }
        this.mFaceDetectionObserver = null;
        if (this.mUseVideoEngine) {
            return NativeRTCVideoFunctions.nativeDisableFaceDetection(this.mNativeEngine);
        }
        return NativeFunctions.nativeDisableFaceDetection(this.mNativeEngine);
    }

    @Override // com.ss.bytertc.engine.video.IVideoEffect
    public int disableVideoEffect() {
        if (engineInvalid()) {
            LogUtil.e("RTCVideoEffect", "invalid, disableVideoEffect failed.");
            return -1006;
        }
        if (this.mUseVideoEngine) {
            return NativeRTCVideoFunctions.nativeDisableVideoEffect(this.mNativeEngine);
        }
        return NativeFunctions.nativeDisableVideoEffect(this.mNativeEngine);
    }

    @Override // com.ss.bytertc.engine.video.IVideoEffect
    public int disableVirtualBackground() {
        if (engineInvalid()) {
            LogUtil.e("RTCVideoEffect", "invalid, disableVirtualBackground failed.");
            return -1006;
        }
        if (this.mUseVideoEngine) {
            return NativeRTCVideoFunctions.nativeDisableVirtualBackground(this.mNativeEngine);
        }
        return NativeFunctions.nativeDisableVirtualBackground(this.mNativeEngine);
    }

    @Override // com.ss.bytertc.engine.video.IVideoEffect
    public int enableVideoEffect() {
        if (engineInvalid()) {
            LogUtil.e("RTCVideoEffect", "invalid, enableVideoEffect failed.");
            return -1006;
        }
        if (this.mUseVideoEngine) {
            return NativeRTCVideoFunctions.nativeEnableVideoEffect2(this.mNativeEngine);
        }
        return NativeFunctions.nativeEnableVideoEffect2(this.mNativeEngine);
    }

    @Override // com.ss.bytertc.engine.video.IVideoEffect
    public long getVideoEffectHandle() {
        if (engineInvalid()) {
            LogUtil.e("RTCVideoEffect", "native engine is invalid, getVideoEffectHandle failed.");
            return -1006L;
        }
        return NativeRTCVideoFunctions.nativeGetVideoEffectHandle(this.mNativeEngine);
    }

    public IFaceDetectionObserver getFaceDetectionObserver() {
        return this.mFaceDetectionObserver;
    }

    @Override // com.ss.bytertc.engine.video.IVideoEffect
    public int appendEffectNodes(List<String> list) {
        if (engineInvalid()) {
            LogUtil.e("RTCVideoEffect", "invalid, appendEffectNodes failed.");
            return -1006;
        }
        String[] strArr = new String[list.size()];
        list.toArray(strArr);
        if (this.mUseVideoEngine) {
            return NativeRTCVideoFunctions.nativeAppendVideoEffectNodes(this.mNativeEngine, strArr);
        }
        return NativeFunctions.nativeAppendVideoEffectNodes(this.mNativeEngine, strArr);
    }

    @Override // com.ss.bytertc.engine.video.IVideoEffect
    public int applyStickerEffect(String str) {
        if (engineInvalid()) {
            LogUtil.e("RTCVideoEffect", "native engine is invalid, applyStickerEffect failed.");
            return -1006;
        }
        return NativeRTCVideoFunctions.nativeApplyStickerEffect(this.mNativeEngine, str);
    }

    @Override // com.ss.bytertc.engine.video.IVideoEffect
    public int removeEffectNodes(List<String> list) {
        if (engineInvalid()) {
            LogUtil.e("RTCVideoEffect", "invalid, removeEffectNodes failed.");
            return -1006;
        }
        String[] strArr = new String[list.size()];
        list.toArray(strArr);
        if (this.mUseVideoEngine) {
            return NativeRTCVideoFunctions.nativeRemoveVideoEffectNodes(this.mNativeEngine, strArr);
        }
        return NativeFunctions.nativeRemoveVideoEffectNodes(this.mNativeEngine, strArr);
    }

    @Override // com.ss.bytertc.engine.video.IVideoEffect
    public int setColorFilter(String str) {
        if (engineInvalid()) {
            LogUtil.e("RTCVideoEffect", "invalid, setColorFilter failed.");
            return -1006;
        }
        if (this.mUseVideoEngine) {
            return NativeRTCVideoFunctions.nativeSetVideoEffectColorFilter(this.mNativeEngine, str);
        }
        return NativeFunctions.nativeSetVideoEffectColorFilter(this.mNativeEngine, str);
    }

    @Override // com.ss.bytertc.engine.video.IVideoEffect
    public int setColorFilterIntensity(float f) {
        if (engineInvalid()) {
            LogUtil.e("RTCVideoEffect", "invalid, setColorFilterIntensity failed.");
            return -1006;
        }
        if (this.mUseVideoEngine) {
            return NativeRTCVideoFunctions.nativeSetVideoEffectColorFilterIntensity(this.mNativeEngine, f);
        }
        return NativeFunctions.nativeSetVideoEffectColorFilterIntensity(this.mNativeEngine, f);
    }

    @Override // com.ss.bytertc.engine.video.IVideoEffect
    public int setEffectNodes(List<String> list) {
        if (engineInvalid()) {
            LogUtil.e("RTCVideoEffect", "invalid, setEffectNodes failed.");
            return -1006;
        }
        String[] strArr = new String[list.size()];
        list.toArray(strArr);
        if (this.mUseVideoEngine) {
            return NativeRTCVideoFunctions.nativeSetVideoEffectNodes(this.mNativeEngine, strArr);
        }
        return NativeFunctions.nativeSetVideoEffectNodes(this.mNativeEngine, strArr);
    }

    @Override // com.ss.bytertc.engine.video.IVideoEffect
    public int setVideoEffectExpressionDetect(VideoEffectExpressionConfig videoEffectExpressionConfig) {
        if (engineInvalid()) {
            LogUtil.e("RTCVideoEffect", "invalid, setVideoEffectExpressionDetect failed.");
            return -1006;
        }
        InternalExpressDetectConfig internalExpressDetectConfig = new InternalExpressDetectConfig(videoEffectExpressionConfig);
        if (this.mUseVideoEngine) {
            return NativeRTCVideoFunctions.nativeSetVideoEffectExpressionDetect(this.mNativeEngine, internalExpressDetectConfig);
        }
        return NativeFunctions.nativeSetVideoEffectExpressionDetect(this.mNativeEngine, internalExpressDetectConfig);
    }

    public RTCVideoEffect(long j, boolean z) {
        this.mNativeEngine = j;
        this.mUseVideoEngine = z;
        LogUtil.i("RTCVideoEffect", "create rtc video effect");
    }

    @Override // com.ss.bytertc.engine.video.IVideoEffect
    public int enableVirtualBackground(String str, VirtualBackgroundSource virtualBackgroundSource) {
        String str2;
        if (engineInvalid()) {
            LogUtil.e("RTCVideoEffect", "invalid, enableVirtualBackground failed.");
            return -1006;
        }
        if (virtualBackgroundSource == null || (str2 = virtualBackgroundSource.sourcePath) == null) {
            str2 = "";
        }
        if (this.mUseVideoEngine) {
            return NativeRTCVideoFunctions.nativeEnableVirtualBackground(this.mNativeEngine, str, virtualBackgroundSource.sourceType.ordinal(), virtualBackgroundSource.sourceColor, str2);
        }
        return NativeFunctions.nativeEnableVirtualBackground(this.mNativeEngine, str, virtualBackgroundSource.sourceType.ordinal(), virtualBackgroundSource.sourceColor, str2);
    }

    @Override // com.ss.bytertc.engine.video.IVideoEffect
    public int initCVResource(String str, String str2) {
        if (engineInvalid()) {
            LogUtil.e("RTCVideoEffect", "invalid, initCVResource failed.");
            return -1006;
        }
        if (this.mUseVideoEngine) {
            return NativeRTCVideoFunctions.nativeInitCVResource(this.mNativeEngine, str, str2);
        }
        return NativeFunctions.nativeInitCVResource(this.mNativeEngine, str, str2);
    }

    @Override // com.ss.bytertc.engine.video.IVideoEffect
    public int registerFaceDetectionObserver(IFaceDetectionObserver iFaceDetectionObserver, int i) {
        if (engineInvalid()) {
            LogUtil.e("RTCVideoEffect", "invalid, registerFaceDetectionObserver failed.");
            return -1006;
        }
        this.mFaceDetectionObserver = iFaceDetectionObserver;
        if (this.mUseVideoEngine) {
            if (iFaceDetectionObserver == null) {
                NativeRTCVideoFunctions.nativeRegisterFaceDetectionObserver(this.mNativeEngine, null, i);
                return 0;
            }
            NativeRTCVideoFunctions.nativeRegisterFaceDetectionObserver(this.mNativeEngine, this.mRTCFaceDetectionObserver, i);
            return 0;
        }
        if (iFaceDetectionObserver == null) {
            NativeFunctions.nativeRegisterFaceDetectionObserver(this.mNativeEngine, null, i);
            return 0;
        }
        NativeFunctions.nativeRegisterFaceDetectionObserver(this.mNativeEngine, this.mRTCFaceDetectionObserver, i);
        return 0;
    }

    @Override // com.ss.bytertc.engine.video.IVideoEffect
    public int setAlgoModelResourceFinder(long j, long j2) {
        if (engineInvalid()) {
            LogUtil.e("RTCVideoEffect", "invalid, setAlgoModelResourceFinder failed.");
            return -1006;
        }
        if (this.mUseVideoEngine) {
            return NativeRTCVideoFunctions.nativeSetVideoEffectAlgoModelResourceFinder(this.mNativeEngine, j, j2);
        }
        return NativeFunctions.nativeSetVideoEffectAlgoModelResourceFinder(this.mNativeEngine, j, j2);
    }

    @Override // com.ss.bytertc.engine.video.IVideoEffect
    public int enableFaceDetection(IFaceDetectionObserver iFaceDetectionObserver, int i, String str) {
        if (engineInvalid()) {
            LogUtil.e("RTCVideoEffect", "invalid, registerFaceDetectionObserver failed.");
            return -1006;
        }
        this.mFaceDetectionObserver = iFaceDetectionObserver;
        if (this.mUseVideoEngine) {
            return NativeRTCVideoFunctions.nativeEnableFaceDetection(this.mNativeEngine, this.mRTCFaceDetectionObserver, i, str);
        }
        return NativeFunctions.nativeEnableFaceDetection(this.mNativeEngine, this.mRTCFaceDetectionObserver, i, str);
    }

    @Override // com.ss.bytertc.engine.video.IVideoEffect
    public int updateEffectNode(String str, String str2, float f) {
        if (engineInvalid()) {
            LogUtil.e("RTCVideoEffect", "invalid, updateEffectNode failed.");
            return -1006;
        }
        if (this.mUseVideoEngine) {
            return NativeRTCVideoFunctions.nativeUpdateVideoEffectNode(this.mNativeEngine, str, str2, f);
        }
        return NativeFunctions.nativeUpdateVideoEffectNode(this.mNativeEngine, str, str2, f);
    }
}
