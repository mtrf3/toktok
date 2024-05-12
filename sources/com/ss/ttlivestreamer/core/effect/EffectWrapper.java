package com.ss.ttlivestreamer.core.effect;

import X.C025908h;
import X.C16880lQ;
import X.X1D;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import com.bef.effectsdk.EffectABConfig;
import com.bytedance.mt.protector.impl.JSONArrayProtectorUtils;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.ss.ttlivestreamer.core.buffer.RoiInfo;
import com.ss.ttlivestreamer.core.buffer.VideoFrame;
import com.ss.ttlivestreamer.core.effect.IVideoEffectProcessor;
import com.ss.ttlivestreamer.core.engine.AudioDeviceModule;
import com.ss.ttlivestreamer.core.engine.NativeObject;
import com.ss.ttlivestreamer.core.opengl.GLThreadManager;
import com.ss.ttlivestreamer.core.utils.AVLog;
import com.ss.ttlivestreamer.core.utils.AVLog2;
import com.ss.ttlivestreamer.core.utils.TEBundle;
import java.lang.ref.WeakReference;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public class EffectWrapper extends NativeObject implements IVideoEffectProcessor {
    public static WeakReference<IEffectEdgeRenderLog> mEffectEdgeLog = new WeakReference<>(null);
    public AudioDeviceModule.AudioRenderSink mAudioRenderSink;
    public Long mDetectFlag = new Long(0);
    public IVideoEffectProcessor.EffectMsgListener mEffectMsgListener;
    public ExpressionBundleImpl[] mExpressionBundles;
    public IVideoEffectProcessor.ExpressionDetectListener mExpressionListener;
    public TEBundle[] mExpressionTEBundles;
    public IVideoEffectProcessor.FaceDetectListener mFaceListener;
    public boolean mFromExtern;
    public IVideoEffectProcessor.IEffectInfoChangeListener mIEffectInfoChangeListener;
    public IVideoEffectProcessor.MicrophoneDetectListener mMicrophoneListener;
    public boolean mValid;

    /* loaded from: classes12.dex */
    public interface IEffectEdgeRenderLog {
        void onEdgeRenderLog(JSONObject jSONObject);
    }

    public static String NonNull(String str) {
        return str == null ? "" : str;
    }

    private boolean checkVersion() {
        boolean z;
        try {
            String effectVersion = getEffectVersion();
            if (!TextUtils.isEmpty(effectVersion)) {
                z = true;
            } else {
                z = false;
            }
            this.mValid = z;
            if (z) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("Effect Version:");
                LIZ.append(effectVersion);
                AVLog.ioe("EffectWrapper", X1D.LIZIZ(LIZ));
            }
        } catch (Throwable unused) {
            this.mValid = false;
        }
        return this.mValid;
    }

    public static native String nativeAlgorithmResultGameSizeCheck(long j);

    private native int nativeAudioStrangeVoiceProcess(Buffer buffer, int i, int i2, int i3, long j);

    public static native int nativeBuildBufferFromString(int i, String str, ByteBuffer byteBuffer);

    private native int nativeComposerAppendNodes(String[] strArr, int i);

    private native int nativeComposerAppendNodesWithTags(String[] strArr, int i, String[] strArr2);

    private native int nativeComposerCheckNodeExclusion(String str, String str2, int[] iArr);

    private native int nativeComposerExclusionCompare(String str, String str2, String str3, int[] iArr);

    private native int nativeComposerReloadNodes(String[] strArr, int i);

    private native int nativeComposerReloadNodesWithTags(String[] strArr, int i, String[] strArr2);

    private native int nativeComposerRemoveNodes(String[] strArr, int i);

    private native int nativeComposerReplaceNodesWithTags(String[] strArr, int i, String[] strArr2, int i2, String[] strArr3);

    private native int nativeComposerSetMode(int i, int i2);

    private native int nativeComposerSetNodes(String[] strArr, int i);

    private native int nativeComposerSetNodesWithTags(String[] strArr, int i, String[] strArr2);

    private native int nativeComposerUpdateMultipleNodes(int i, String[] strArr, String[] strArr2, float[] fArr);

    private native int nativeComposerUpdateNode(String str, String str2, float f);

    public static native int nativeConfigABBooleanValue(String str, boolean z);

    public static native int nativeConfigABFloatValue(String str, float f);

    public static native int nativeConfigABIntValue(String str, int i);

    public static native int nativeConfigABStringValue(String str, String str2);

    private native int nativeConfigEffect(int i, int i2, String str, String str2, boolean z, boolean z2, String str3, int i3);

    private native void nativeConfigGpuTurboMode(int i, int i2, boolean z);

    private native AlgorithmResult nativeCreateAlgorithmResult();

    private native void nativeCreateEffectWrapper(AudioDeviceModule audioDeviceModule, AudioDeviceModule.AudioRenderSink audioRenderSink, boolean z);

    private native int nativeDestroyEffectAudioHandler();

    private native int nativeDetectFaceFromBitMap(Bitmap bitmap);

    private native int nativeEffectAudioProcessData(ByteBuffer byteBuffer, int i, int i2, int i3);

    private native int nativeEffectAudioSetPlaybackDeviceType(int i);

    private native long nativeEffectNativeHandler();

    private native void nativeEnableExpressionDetect(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6);

    private native int nativeEnableFindContour(boolean z, String str);

    private native long nativeGetAlgorithmRequirment();

    private native long nativeGetAlgorithmRequirmentParams();

    private native long nativeGetAlgorithmResult(AlgorithmResult algorithmResult, long j);

    private native boolean nativeGetAudioRecognizeStatus();

    private native ByteBuffer nativeGetContourInfo(AlgorithmResult algorithmResult);

    private native EffectImageInfo nativeGetEffectCapturedImageWithKey(String str);

    public static native String nativeGetEffectVersion();

    private native boolean nativeGetExpressionDetectResult(TEBundle[] tEBundleArr, int i);

    private native int nativeGetFaceCount();

    private native float nativeGetFilterIntensity(String str);

    private native String nativeGetFrameCostStatistics();

    private native String nativeGetFrameProgressParams();

    private native int nativeGetMattingResult(ByteBuffer byteBuffer);

    private native void nativeInsertABLicense(String str);

    private native boolean nativeIsEffectGpuTurboEnable();

    private native String nativeName();

    private native int nativeNotifyKeyboardHide(boolean z);

    public static native AlgorithmResult nativeParseParcelBuffer(AlgorithmResult algorithmResult, long j, ByteBuffer byteBuffer, int i, int i2);

    public static native String nativeParseStringFromByteBuffer(int i, ByteBuffer byteBuffer);

    private native int nativePauseEffect();

    public static native int nativePeekParcelSize();

    private native int nativeProcess(int i, int i2, int i3, int i4, long j, Long l, RoiInfo roiInfo, boolean z, int i5, long j2);

    private native void nativeProcessDoubleClickEvent(float f, float f2);

    private native void nativeProcessLongPressEvent(float f, float f2);

    private native void nativeProcessPanEvent(float f, float f2, float f3, float f4, float f5);

    private native void nativeProcessRotationEvent(float f, float f2);

    private native void nativeProcessScaleEvent(float f, float f2);

    private native void nativeProcessTouchDownEvent(float f, float f2, int i);

    private native void nativeProcessTouchEvent(float f, float f2);

    private native void nativeProcessTouchEventWithTouchType(long j, float f, float f2, float f3, float f4, int i, int i2);

    private native void nativeProcessTouchUpEvent(float f, float f2, int i);

    private native int nativeProcessV2(int i, int i2, int i3, int i4, long[] jArr, Long l, RoiInfo roiInfo, boolean z, int i5, long j);

    public static native int nativeReadParcel(long j, ByteBuffer byteBuffer);

    private native int nativeRefreshAlgorithmRequirment(long j, long j2);

    private native void nativeReleaseContetDetector();

    private native int nativeRenderCacheBitmap(String str, Bitmap bitmap);

    private native int nativeRenderCacheInt(String str, int i);

    private native int nativeRenderCacheString(String str, String str2);

    private native int nativeRenderCacheTexture(String str, String str2);

    private native int nativeResetFrameCostStatistics();

    private native int nativeResumeEffect();

    private native int nativeSendEffectMsg(int i, int i2, int i3, String str);

    private native int nativeSetABLicense(String str);

    private native void nativeSetAlgorithmAB(boolean z);

    private native int nativeSetAlgorithmRequirment(long j);

    private native int nativeSetAssetManager(AssetManager assetManager);

    private native int nativeSetAudioRecognizeDict(String str);

    private native int nativeSetBeautify(String str, float f, float f2);

    private native int nativeSetBeautifyWithSharp(String str, float f, float f2, float f3);

    private native void nativeSetContourInfoInteractId(String str);

    private native int nativeSetCustomEffectOrientation(String str, int i);

    private native void nativeSetDoubleViewRect(double d, double d2, double d3, double d4);

    private native int nativeSetEffect(String str);

    private native void nativeSetEffectLogLevel(int i);

    private native void nativeSetEnableAlgorithmSyncer(boolean z);

    private native void nativeSetEnableThreeBuffer(boolean z);

    private native int nativeSetFaceAttribute(boolean z);

    private native int nativeSetFilter(String str, float f, boolean z);

    private native int nativeSetInputText(String str, int i, int i2, String str2);

    private native int nativeSetMusicNodeFilePath(String str);

    private native int nativeSetReshape(String str, float f, float f2);

    private native int nativeSetResourceFinder(Object obj);

    private native int nativeSetSendContourInfoType(int i);

    private native int nativeSetTwoFilters(String str, String str2, float f, float f2, float f3, boolean z);

    private native int nativeSetupEffectAudioHandler();

    private native int nativeStartAudioRecognize(ByteBuffer byteBuffer, int i, int i2, int i3);

    private native int nativeUpdateAudioConfig(String str);

    public void createEffectAudioSource(AudioDeviceModule audioDeviceModule) {
    }

    @Override // com.ss.ttlivestreamer.core.effect.IVideoEffectProcessor
    public int enableMockFace(boolean z) {
        return 0;
    }

    @Override // com.ss.ttlivestreamer.core.engine.NativeObject
    public synchronized void release() {
        mEffectEdgeLog = new WeakReference<>(null);
        IVideoEffectProcessor.EffectMsgListener effectMsgListener = this.mEffectMsgListener;
        if (effectMsgListener != null) {
            VideoEffectUtilsWrapper.removeMessageCenterListener(effectMsgListener);
            this.mEffectMsgListener = null;
        }
        this.mFaceListener = null;
        this.mExpressionListener = null;
        if (!this.mFromExtern) {
            super.release();
        }
        AudioDeviceModule.AudioRenderSink audioRenderSink = this.mAudioRenderSink;
        if (audioRenderSink != null) {
            audioRenderSink.setQuirks(0L);
            this.mAudioRenderSink.setAudioTrack(null);
            this.mAudioRenderSink.release();
            this.mAudioRenderSink = null;
        }
    }

    @Override // com.ss.ttlivestreamer.core.effect.IVideoEffectProcessor
    public int setEffect(String str, boolean z) {
        return 0;
    }

    @Override // com.ss.ttlivestreamer.core.effect.IVideoEffectProcessor
    public int startEffectAudio() {
        return 0;
    }

    @Override // com.ss.ttlivestreamer.core.effect.IVideoEffectProcessor
    public int stopEffectAudio() {
        return 0;
    }

    /* loaded from: classes12.dex */
    public static class AlgorithmResult extends NativeObject implements VideoFrame.IExtraData {
        public long mContourInfo;
        public long mFlags;
        public long mMiniGameResult;
        public long mStRoiInfo;

        @Override // com.ss.ttlivestreamer.core.buffer.VideoFrame.IExtraData
        public int peekParcelSize() {
            return EffectWrapper.nativePeekParcelSize();
        }

        public long getContourInfo() {
            return this.mContourInfo;
        }

        @Override // com.ss.ttlivestreamer.core.buffer.VideoFrame.IExtraData
        public long getExtraDataFlag() {
            return this.mFlags;
        }

        public long getMiniGameResult() {
            return this.mMiniGameResult;
        }

        public long mStRoiInfo() {
            return this.mStRoiInfo;
        }

        public AlgorithmResult(long j) {
            setNativeObj(j);
        }

        public static String checkGameSize(long j) {
            return EffectWrapper.nativeAlgorithmResultGameSizeCheck(j);
        }

        private void setContourInfo(long j) {
            this.mContourInfo = j;
        }

        private void setMiniGmeResult(long j) {
            this.mMiniGameResult = j;
        }

        private void setStRoiInfo(long j) {
            this.mStRoiInfo = j;
        }

        @Override // com.ss.ttlivestreamer.core.buffer.VideoFrame.IExtraData
        public int readParcel(ByteBuffer byteBuffer) {
            return EffectWrapper.nativeReadParcel(this.mNativeObj, byteBuffer);
        }

        @Override // com.ss.ttlivestreamer.core.buffer.VideoFrame.IExtraData
        public void releaseExtraData(Object obj) {
            release();
        }

        public static int buildBufferFromString(String str, ByteBuffer byteBuffer) {
            return EffectWrapper.nativeBuildBufferFromString(0, str, byteBuffer);
        }

        public static String parseStringFromByteBuffer(int i, ByteBuffer byteBuffer) {
            return EffectWrapper.nativeParseStringFromByteBuffer(i, byteBuffer);
        }

        public static AlgorithmResult parseParcel(int i, int i2, ByteBuffer byteBuffer, AlgorithmResult algorithmResult) {
            long j;
            if (algorithmResult == null) {
                j = 0;
            } else {
                j = algorithmResult.mNativeObj;
            }
            return EffectWrapper.nativeParseParcelBuffer(algorithmResult, j, byteBuffer, i, i2);
        }
    }

    @Override // com.ss.ttlivestreamer.core.effect.IVideoEffectProcessor
    public int destroyEffectAudioHandler() {
        if (!this.mValid) {
            return -1;
        }
        return nativeDestroyEffectAudioHandler();
    }

    public long getEffectNativeHandler() {
        if (this.mValid) {
            return nativeEffectNativeHandler();
        }
        return 0L;
    }

    @Override // com.ss.ttlivestreamer.core.effect.IVideoEffectProcessor
    public int getFaceCount() {
        if (!this.mValid) {
            return 0;
        }
        return nativeGetFaceCount();
    }

    @Override // com.ss.ttlivestreamer.core.effect.IVideoEffectProcessor
    public String getFrameCostStatistics() {
        if (!this.mValid) {
            return null;
        }
        return nativeGetFrameCostStatistics();
    }

    @Override // com.ss.ttlivestreamer.core.effect.IVideoEffectProcessor
    public String getFrameProgressParams() {
        if (!this.mValid) {
            return null;
        }
        return nativeGetFrameProgressParams();
    }

    @Override // com.ss.ttlivestreamer.core.effect.IVideoEffectProcessor
    public boolean isAudioRecognizeAvailable() {
        if (!this.mValid) {
            return false;
        }
        return nativeGetAudioRecognizeStatus();
    }

    @Override // com.ss.ttlivestreamer.core.effect.IVideoEffectProcessor
    public String name() {
        if (!this.mValid) {
            return "Dummy Effect";
        }
        return nativeName();
    }

    @Override // com.ss.ttlivestreamer.core.effect.IVideoEffectProcessor
    public int pauseEffect() {
        if (!this.mValid) {
            return 0;
        }
        return nativePauseEffect();
    }

    @Override // com.ss.ttlivestreamer.core.effect.IVideoEffectProcessor
    public void releaseContetDetector() {
        if (!this.mValid) {
            return;
        }
        nativeReleaseContetDetector();
    }

    @Override // com.ss.ttlivestreamer.core.effect.IVideoEffectProcessor
    public int resetFrameCostStatistics() {
        if (!this.mValid) {
            return -1;
        }
        return nativeResetFrameCostStatistics();
    }

    @Override // com.ss.ttlivestreamer.core.effect.IVideoEffectProcessor
    public int resumeEffect() {
        if (!this.mValid) {
            return 0;
        }
        return nativeResumeEffect();
    }

    @Override // com.ss.ttlivestreamer.core.effect.IVideoEffectProcessor
    public int setupEffectAudioHandler() {
        if (!this.mValid) {
            return -1;
        }
        return nativeSetupEffectAudioHandler();
    }

    public EffectWrapper() {
        if (!checkVersion()) {
            this.mFromExtern = false;
            return;
        }
        throw new AndroidRuntimeException("unsupport");
    }

    public long getAlgorithmRequirment() {
        return nativeGetAlgorithmRequirment();
    }

    public long getAlgorithmRequirmentParams() {
        return nativeGetAlgorithmRequirmentParams();
    }

    @Override // com.ss.ttlivestreamer.core.effect.IVideoEffectProcessor
    public String getEffectVersion() {
        return nativeGetEffectVersion();
    }

    @Override // com.ss.ttlivestreamer.core.effect.IVideoEffectProcessor
    public boolean isEffectGpuTurboEnable() {
        return nativeIsEffectGpuTurboEnable();
    }

    /* loaded from: classes12.dex */
    public class ExpressionBundleImpl implements IVideoEffectProcessor.ExpressionBundle {
        public float age;
        public float angry_score;
        public float arousal;
        public float attractive;
        public float blur_score;
        public float boy_prob;
        public int exp_type;
        public float happy_score;
        public float illumination;
        public float lipstick_prob;
        public float mask_prob;
        public float mustache_prob;
        public float quality;
        public float real_face_prob;
        public float sad_score;
        public float surprise_score;
        public float valence;
        public float wear_glass_prob;
        public float wear_hat_prob;
        public float wear_sunglass_prob;

        @Override // com.ss.ttlivestreamer.core.effect.IVideoEffectProcessor.ExpressionBundle
        public float getAngryScore() {
            return this.angry_score;
        }

        @Override // com.ss.ttlivestreamer.core.effect.IVideoEffectProcessor.ExpressionBundle
        public float getArousal() {
            return this.arousal;
        }

        @Override // com.ss.ttlivestreamer.core.effect.IVideoEffectProcessor.ExpressionBundle
        public float getAttractive() {
            return this.attractive;
        }

        @Override // com.ss.ttlivestreamer.core.effect.IVideoEffectProcessor.ExpressionBundle
        public float getBlurScore() {
            return this.blur_score;
        }

        @Override // com.ss.ttlivestreamer.core.effect.IVideoEffectProcessor.ExpressionBundle
        public float getBoyProb() {
            return this.boy_prob;
        }

        @Override // com.ss.ttlivestreamer.core.effect.IVideoEffectProcessor.ExpressionBundle
        public float getEge() {
            return this.age;
        }

        @Override // com.ss.ttlivestreamer.core.effect.IVideoEffectProcessor.ExpressionBundle
        public int getExpressionType() {
            return this.exp_type;
        }

        @Override // com.ss.ttlivestreamer.core.effect.IVideoEffectProcessor.ExpressionBundle
        public float getHappyScore() {
            return this.happy_score;
        }

        @Override // com.ss.ttlivestreamer.core.effect.IVideoEffectProcessor.ExpressionBundle
        public float getIllumination() {
            return this.illumination;
        }

        @Override // com.ss.ttlivestreamer.core.effect.IVideoEffectProcessor.ExpressionBundle
        public float getLipstickProb() {
            return this.lipstick_prob;
        }

        @Override // com.ss.ttlivestreamer.core.effect.IVideoEffectProcessor.ExpressionBundle
        public float getMaskProb() {
            return this.mask_prob;
        }

        @Override // com.ss.ttlivestreamer.core.effect.IVideoEffectProcessor.ExpressionBundle
        public float getMustacheProb() {
            return this.mustache_prob;
        }

        @Override // com.ss.ttlivestreamer.core.effect.IVideoEffectProcessor.ExpressionBundle
        public float getQuality() {
            return this.quality;
        }

        @Override // com.ss.ttlivestreamer.core.effect.IVideoEffectProcessor.ExpressionBundle
        public float getRealFaceProb() {
            return this.real_face_prob;
        }

        @Override // com.ss.ttlivestreamer.core.effect.IVideoEffectProcessor.ExpressionBundle
        public float getSadScore() {
            return this.sad_score;
        }

        @Override // com.ss.ttlivestreamer.core.effect.IVideoEffectProcessor.ExpressionBundle
        public float getSurpriseScore() {
            return this.surprise_score;
        }

        @Override // com.ss.ttlivestreamer.core.effect.IVideoEffectProcessor.ExpressionBundle
        public float getValence() {
            return this.valence;
        }

        @Override // com.ss.ttlivestreamer.core.effect.IVideoEffectProcessor.ExpressionBundle
        public float getWearGlassProb() {
            return this.wear_glass_prob;
        }

        @Override // com.ss.ttlivestreamer.core.effect.IVideoEffectProcessor.ExpressionBundle
        public float getWearHatProb() {
            return this.wear_hat_prob;
        }

        @Override // com.ss.ttlivestreamer.core.effect.IVideoEffectProcessor.ExpressionBundle
        public float getWearSunglassProb() {
            return this.wear_sunglass_prob;
        }

        public ExpressionBundleImpl() {
        }
    }

    @Override // com.ss.ttlivestreamer.core.effect.IVideoEffectProcessor
    public AudioDeviceModule.AudioRenderSink getEffectAudioRender() {
        return this.mAudioRenderSink;
    }

    @Override // com.ss.ttlivestreamer.core.effect.IVideoEffectProcessor
    public boolean valid() {
        return this.mValid;
    }

    public EffectWrapper(long j) {
        this.mNativeObj = j;
        this.mFromExtern = true;
        if (checkVersion()) {
            createEffectAudioSource(null);
        }
    }

    public static void setEffectEdgeLog(IEffectEdgeRenderLog iEffectEdgeRenderLog) {
        mEffectEdgeLog = new WeakReference<>(iEffectEdgeRenderLog);
    }

    @Override // com.ss.ttlivestreamer.core.effect.IVideoEffectProcessor
    public boolean detectFaceFromBitMap(Bitmap bitmap) {
        if (!this.mValid || nativeDetectFaceFromBitMap(bitmap) != 0) {
            return false;
        }
        return true;
    }

    @Override // com.ss.ttlivestreamer.core.effect.IVideoEffectProcessor
    public int effectAudioSetPlaybackDeviceType(int i) {
        if (!this.mValid) {
            return -1;
        }
        return nativeEffectAudioSetPlaybackDeviceType(i);
    }

    public AlgorithmResult getAlgorithmResult(long j) {
        AlgorithmResult nativeCreateAlgorithmResult = nativeCreateAlgorithmResult();
        nativeCreateAlgorithmResult.mFlags = nativeGetAlgorithmResult(nativeCreateAlgorithmResult, j);
        return nativeCreateAlgorithmResult;
    }

    @Override // com.ss.ttlivestreamer.core.effect.IVideoEffectProcessor
    public ByteBuffer getContourInfo(AlgorithmResult algorithmResult) {
        if (!this.mValid) {
            return null;
        }
        return nativeGetContourInfo(algorithmResult);
    }

    public String getEffectABInfo(String str) {
        return EffectABConfig.requestABInfoWithLicense(str);
    }

    public EffectImageInfo getEffectCapturedImagewithKey(String str) {
        return nativeGetEffectCapturedImageWithKey(str);
    }

    @Override // com.ss.ttlivestreamer.core.effect.IVideoEffectProcessor
    public float getFilterIntensity(String str) {
        if (!this.mValid) {
            return -1.0f;
        }
        return nativeGetFilterIntensity(str);
    }

    @Override // com.ss.ttlivestreamer.core.effect.IVideoEffectProcessor
    public void insertEffectLicense(String str) {
        if (str != null) {
            nativeInsertABLicense(str);
        }
    }

    @Override // com.ss.ttlivestreamer.core.effect.IVideoEffectProcessor
    public int notifyKeyboardHide(boolean z) {
        if (!this.mValid) {
            return -1;
        }
        return nativeNotifyKeyboardHide(z);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: CFG modification limit reached, blocks count: 141
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:64)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:44)
        */
    public void onExpressionDetectResultCallback(int r7) {
        /*
            Method dump skipped, instructions count: 464
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.ttlivestreamer.core.effect.EffectWrapper.onExpressionDetectResultCallback(int):void");
    }

    public void onFaceDetectResultCallback(int i) {
        if (!this.mValid) {
            return;
        }
        try {
            IVideoEffectProcessor.FaceDetectListener faceDetectListener = this.mFaceListener;
            if (faceDetectListener != null) {
                faceDetectListener.onFaceDetectResultCallback(i);
            }
        } catch (Throwable th) {
            AVLog2.logToIODevice2(6, "EffectWrapper", "onFaceDetectResultCallback exception. ", th, 37, 30000);
        }
    }

    public void onMicrophoneDetectResultCallback(float f) {
        IVideoEffectProcessor.MicrophoneDetectListener microphoneDetectListener;
        if (this.mValid && (microphoneDetectListener = this.mMicrophoneListener) != null) {
            microphoneDetectListener.onMicrophoneDetectResultCallback(f);
        }
    }

    @Override // com.ss.ttlivestreamer.core.effect.IVideoEffectProcessor
    public void setAlgorithmAB(boolean z) {
        if (!this.mValid) {
            return;
        }
        nativeSetAlgorithmAB(z);
    }

    public int setAlgorithmRequirment(long j) {
        return nativeSetAlgorithmRequirment(j);
    }

    @Override // com.ss.ttlivestreamer.core.effect.IVideoEffectProcessor
    public int setAssetManager(AssetManager assetManager) {
        return nativeSetAssetManager(assetManager);
    }

    public int setAudioEffectConfig(String str) {
        return nativeUpdateAudioConfig(str);
    }

    @Override // com.ss.ttlivestreamer.core.effect.IVideoEffectProcessor
    public int setAudioRecognizeDict(Map<String, String[]> map) {
        String str;
        if (!this.mValid) {
            return 0;
        }
        String str2 = "";
        if (map != null) {
            String str3 = "";
            for (Map.Entry<String, String[]> entry : map.entrySet()) {
                for (String str4 : entry.getValue()) {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append(str3);
                    if (str3.isEmpty()) {
                        str = "";
                    } else {
                        str = ",";
                    }
                    LIZ.append(str);
                    str3 = C025908h.LIZIZ(LIZ, entry.getKey(), ":", str4, LIZ);
                }
            }
            str2 = str3;
        }
        return nativeSetAudioRecognizeDict(str2);
    }

    @Override // com.ss.ttlivestreamer.core.effect.IVideoEffectProcessor
    public void setContourInfoIndex(String str) {
        if (!this.mValid) {
            return;
        }
        nativeSetContourInfoInteractId(str);
    }

    @Override // com.ss.ttlivestreamer.core.effect.IVideoEffectProcessor
    public int setEffect(String str) {
        if (!this.mValid) {
            return 0;
        }
        return nativeSetEffect(NonNull(str));
    }

    public void setEffectInfoChangeListener(IVideoEffectProcessor.IEffectInfoChangeListener iEffectInfoChangeListener) {
        this.mIEffectInfoChangeListener = iEffectInfoChangeListener;
    }

    @Override // com.ss.ttlivestreamer.core.effect.IVideoEffectProcessor
    public int setEffectLicense(String str) {
        if (str != null) {
            int nativeSetABLicense = nativeSetABLicense(str);
            IVideoEffectProcessor.IEffectInfoChangeListener iEffectInfoChangeListener = this.mIEffectInfoChangeListener;
            if (iEffectInfoChangeListener != null) {
                iEffectInfoChangeListener.onLicenseInfoChange(str, nativeSetABLicense);
                return 0;
            }
            return 0;
        }
        return 0;
    }

    @Override // com.ss.ttlivestreamer.core.effect.IVideoEffectProcessor
    public void setEffectLogLevel(int i) {
        if (!this.mValid) {
            return;
        }
        nativeSetEffectLogLevel(i);
    }

    @Override // com.ss.ttlivestreamer.core.effect.IVideoEffectProcessor
    public void setEffectMsgListener(IVideoEffectProcessor.EffectMsgListener effectMsgListener) {
        if (!this.mValid) {
            return;
        }
        IVideoEffectProcessor.EffectMsgListener effectMsgListener2 = this.mEffectMsgListener;
        if (effectMsgListener2 != null) {
            VideoEffectUtilsWrapper.removeMessageCenterListener(effectMsgListener2);
            this.mEffectMsgListener = null;
        }
        if (effectMsgListener != null) {
            this.mEffectMsgListener = effectMsgListener;
            VideoEffectUtilsWrapper.addMessageCenterListener(effectMsgListener);
        }
    }

    @Override // com.ss.ttlivestreamer.core.effect.IVideoEffectProcessor
    public void setEnableAlgorithmSyncer(boolean z) {
        if (!this.mValid) {
            return;
        }
        nativeSetEnableAlgorithmSyncer(z);
    }

    @Override // com.ss.ttlivestreamer.core.effect.IVideoEffectProcessor
    public void setEnableThreeBuffer(boolean z) {
        if (!this.mValid) {
            return;
        }
        nativeSetEnableThreeBuffer(z);
    }

    @Override // com.ss.ttlivestreamer.core.effect.IVideoEffectProcessor
    public void setExpressionDetectListener(IVideoEffectProcessor.ExpressionDetectListener expressionDetectListener) {
        if (!this.mValid) {
            return;
        }
        this.mExpressionListener = expressionDetectListener;
    }

    @Override // com.ss.ttlivestreamer.core.effect.IVideoEffectProcessor
    public int setFaceAttribute(boolean z) {
        if (!this.mValid) {
            return 0;
        }
        return nativeSetFaceAttribute(z);
    }

    @Override // com.ss.ttlivestreamer.core.effect.IVideoEffectProcessor
    public void setFaceDetectListener(IVideoEffectProcessor.FaceDetectListener faceDetectListener) {
        if (!this.mValid) {
            return;
        }
        this.mFaceListener = faceDetectListener;
    }

    @Override // com.ss.ttlivestreamer.core.effect.IVideoEffectProcessor
    public void setMicrophoneDetectListener(IVideoEffectProcessor.MicrophoneDetectListener microphoneDetectListener) {
        if (!this.mValid) {
            return;
        }
        this.mMicrophoneListener = microphoneDetectListener;
    }

    @Override // com.ss.ttlivestreamer.core.effect.IVideoEffectProcessor
    public void setMusicNodeFilePath(String str) {
        if (!this.mValid) {
            return;
        }
        nativeSetMusicNodeFilePath(str);
    }

    @Override // com.ss.ttlivestreamer.core.engine.NativeObject
    public void setNativeObj(long j) {
        super.setNativeObj(j);
    }

    @Override // com.ss.ttlivestreamer.core.effect.IVideoEffectProcessor
    public int setResourceFinder(Object obj) {
        return nativeSetResourceFinder(obj);
    }

    @Override // com.ss.ttlivestreamer.core.effect.IVideoEffectProcessor
    public int setSendContourInfoType(int i) {
        if (!this.mValid) {
            return -1;
        }
        return nativeSetSendContourInfoType(i);
    }

    public EffectWrapper(AudioDeviceModule audioDeviceModule, boolean z) {
        if (checkVersion()) {
            if (audioDeviceModule != null) {
                AudioDeviceModule.AudioRenderSink createRenderSink = audioDeviceModule.createRenderSink();
                this.mAudioRenderSink = createRenderSink;
                createRenderSink.setQuirks(0L);
            }
            nativeCreateEffectWrapper(audioDeviceModule, this.mAudioRenderSink, z);
        }
        this.mFromExtern = false;
    }

    public static <T> boolean CheckCount(T[] tArr, int i) {
        int length;
        if (tArr == null) {
            length = 0;
        } else {
            length = tArr.length;
        }
        if (i != length) {
            return false;
        }
        return true;
    }

    public static void onEdgeRenderLog(String str, String str2) {
        IEffectEdgeRenderLog iEffectEdgeRenderLog;
        WeakReference<IEffectEdgeRenderLog> weakReference = mEffectEdgeLog;
        if (weakReference != null && (iEffectEdgeRenderLog = weakReference.get()) != null) {
            try {
                JSONObject jSONObject = new JSONObject(str2);
                if (!str.equals("live_webrtc_monitor_log")) {
                    jSONObject.put("server", str);
                    jSONObject.put("mode", "effect");
                }
                iEffectEdgeRenderLog.onEdgeRenderLog(jSONObject);
            } catch (JSONException e) {
                C16880lQ.LLLLIIL(e);
            }
        }
    }

    @Override // com.ss.ttlivestreamer.core.effect.IVideoEffectProcessor
    public int composerAppendNodes(String[] strArr, int i) {
        if (!this.mValid) {
            return 0;
        }
        if (!CheckCount(strArr, i)) {
            return -1;
        }
        return nativeComposerAppendNodes(strArr, i);
    }

    @Override // com.ss.ttlivestreamer.core.effect.IVideoEffectProcessor
    public int composerReloadNodes(String[] strArr, int i) {
        if (!this.mValid) {
            return 0;
        }
        if (!CheckCount(strArr, i)) {
            return -1;
        }
        return nativeComposerReloadNodes(strArr, i);
    }

    @Override // com.ss.ttlivestreamer.core.effect.IVideoEffectProcessor
    public int composerRemoveNodes(String[] strArr, int i) {
        if (!this.mValid) {
            return 0;
        }
        if (!CheckCount(strArr, i)) {
            return -1;
        }
        return nativeComposerRemoveNodes(strArr, i);
    }

    @Override // com.ss.ttlivestreamer.core.effect.IVideoEffectProcessor
    public int composerSetMode(int i, int i2) {
        if (!this.mValid) {
            return 0;
        }
        return nativeComposerSetMode(i, i2);
    }

    @Override // com.ss.ttlivestreamer.core.effect.IVideoEffectProcessor
    public int composerSetNodes(String[] strArr, int i) {
        if (!this.mValid) {
            return 0;
        }
        if (!CheckCount(strArr, i)) {
            return -1;
        }
        return nativeComposerSetNodes(strArr, i);
    }

    @Override // com.ss.ttlivestreamer.core.effect.IVideoEffectProcessor
    public int enableFindContour(boolean z, String str) {
        if (!this.mValid) {
            return 0;
        }
        return nativeEnableFindContour(z, str);
    }

    public void getAlgorithmResult(AlgorithmResult algorithmResult, long j) {
        algorithmResult.mFlags = nativeGetAlgorithmResult(algorithmResult, j);
    }

    @Override // com.ss.ttlivestreamer.core.effect.IVideoEffectProcessor
    public void processDoubleClickEvent(float f, float f2) {
        if (!this.mValid) {
            return;
        }
        nativeProcessDoubleClickEvent(f, f2);
    }

    @Override // com.ss.ttlivestreamer.core.effect.IVideoEffectProcessor
    public void processLongPressEvent(float f, float f2) {
        if (!this.mValid) {
            return;
        }
        nativeProcessLongPressEvent(f, f2);
    }

    @Override // com.ss.ttlivestreamer.core.effect.IVideoEffectProcessor
    public void processRotationEvent(float f, float f2) {
        if (!this.mValid) {
            return;
        }
        nativeProcessRotationEvent(f, f2);
    }

    @Override // com.ss.ttlivestreamer.core.effect.IVideoEffectProcessor
    public void processScaleEvent(float f, float f2) {
        if (!this.mValid) {
            return;
        }
        nativeProcessScaleEvent(f, f2);
    }

    @Override // com.ss.ttlivestreamer.core.effect.IVideoEffectProcessor
    public void processTouchEvent(float f, float f2) {
        if (!this.mValid) {
            return;
        }
        nativeProcessTouchEvent(f, f2);
    }

    public int refreshAlgorithmRequirment(long j, long j2) {
        return nativeRefreshAlgorithmRequirment(j, j2);
    }

    @Override // com.ss.ttlivestreamer.core.effect.IVideoEffectProcessor
    public int setCustomEffect(String str, String str2) {
        if (!this.mValid) {
            return 0;
        }
        return nativeRenderCacheTexture(NonNull(str), NonNull(str2));
    }

    @Override // com.ss.ttlivestreamer.core.effect.IVideoEffectProcessor
    public int setCustomEffectBitmap(String str, Bitmap bitmap) {
        if (!this.mValid) {
            return 0;
        }
        return nativeRenderCacheBitmap(NonNull(str), bitmap);
    }

    @Override // com.ss.ttlivestreamer.core.effect.IVideoEffectProcessor
    public int setCustomEffectOrientation(String str, int i) {
        if (!this.mValid) {
            return 0;
        }
        return nativeSetCustomEffectOrientation(NonNull(str), i);
    }

    @Override // com.ss.ttlivestreamer.core.effect.IVideoEffectProcessor
    public int setEffectABInfo(JSONObject jSONObject, String str) {
        String str2;
        try {
            JSONArray jSONArray = new JSONArray(EffectABConfig.requestABInfoWithLicense(str));
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObject2 = JSONArrayProtectorUtils.getJSONObject(jSONArray, i);
                String string = JSONObjectProtectorUtils.getString(jSONObject2, "key");
                if (jSONObject.has(string)) {
                    int i2 = JSONObjectProtectorUtils.getInt(jSONObject2, "dataType");
                    if (i2 == 0) {
                        int nativeConfigABBooleanValue = nativeConfigABBooleanValue(string, JSONObjectProtectorUtils.getBoolean(jSONObject, string));
                        IVideoEffectProcessor.IEffectInfoChangeListener iEffectInfoChangeListener = this.mIEffectInfoChangeListener;
                        if (iEffectInfoChangeListener != null) {
                            if (JSONObjectProtectorUtils.getBoolean(jSONObject, string)) {
                                str2 = "TRUE";
                            } else {
                                str2 = "FALSE";
                            }
                            iEffectInfoChangeListener.onEffectInfoChange(string, str2, 0, nativeConfigABBooleanValue);
                        }
                    } else if (i2 != 1) {
                        if (i2 != 2) {
                            if (i2 == 3) {
                                String string2 = JSONObjectProtectorUtils.getString(jSONObject, string);
                                int nativeConfigABStringValue = nativeConfigABStringValue(string, string2);
                                IVideoEffectProcessor.IEffectInfoChangeListener iEffectInfoChangeListener2 = this.mIEffectInfoChangeListener;
                                if (iEffectInfoChangeListener2 != null) {
                                    iEffectInfoChangeListener2.onEffectInfoChange(string, string2, 3, nativeConfigABStringValue);
                                }
                            }
                        } else {
                            float f = (float) JSONObjectProtectorUtils.getDouble(jSONObject, string);
                            int nativeConfigABFloatValue = nativeConfigABFloatValue(string, f);
                            IVideoEffectProcessor.IEffectInfoChangeListener iEffectInfoChangeListener3 = this.mIEffectInfoChangeListener;
                            if (iEffectInfoChangeListener3 != null) {
                                StringBuilder LIZ = X1D.LIZ();
                                LIZ.append("");
                                LIZ.append(f);
                                iEffectInfoChangeListener3.onEffectInfoChange(string, X1D.LIZIZ(LIZ), 2, nativeConfigABFloatValue);
                            }
                        }
                    } else {
                        int i3 = JSONObjectProtectorUtils.getInt(jSONObject, string);
                        int nativeConfigABIntValue = nativeConfigABIntValue(string, i3);
                        IVideoEffectProcessor.IEffectInfoChangeListener iEffectInfoChangeListener4 = this.mIEffectInfoChangeListener;
                        if (iEffectInfoChangeListener4 != null) {
                            StringBuilder LIZ2 = X1D.LIZ();
                            LIZ2.append("");
                            LIZ2.append(i3);
                            iEffectInfoChangeListener4.onEffectInfoChange(string, X1D.LIZIZ(LIZ2), 1, nativeConfigABIntValue);
                        }
                    }
                }
            }
            return 0;
        } catch (JSONException unused) {
            return -1;
        }
    }

    @Override // com.ss.ttlivestreamer.core.effect.IVideoEffectProcessor
    public int setFilter(String str, float f) {
        if (!this.mValid) {
            return 0;
        }
        return nativeSetFilter(NonNull(str), f, false);
    }

    @Override // com.ss.ttlivestreamer.core.effect.IVideoEffectProcessor
    public void setRenderCacheInt(String str, int i) {
        if (!this.mValid) {
            return;
        }
        nativeRenderCacheInt(str, i);
    }

    @Override // com.ss.ttlivestreamer.core.effect.IVideoEffectProcessor
    public void setRenderCacheString(String str, String str2) {
        if (!this.mValid) {
            return;
        }
        nativeRenderCacheString(NonNull(str), NonNull(str2));
    }

    @Override // com.ss.ttlivestreamer.core.effect.IVideoEffectProcessor
    public int composerAppendNodesWithTags(String[] strArr, int i, String[] strArr2) {
        if (!this.mValid) {
            return 0;
        }
        if (!CheckCount(strArr, i) || !CheckCount(strArr2, i)) {
            return -1;
        }
        return nativeComposerAppendNodesWithTags(strArr, i, strArr2);
    }

    @Override // com.ss.ttlivestreamer.core.effect.IVideoEffectProcessor
    public int composerCheckNodeExclusion(String str, String str2, int[] iArr) {
        if (!this.mValid) {
            return 0;
        }
        return nativeComposerCheckNodeExclusion(str, str2, iArr);
    }

    @Override // com.ss.ttlivestreamer.core.effect.IVideoEffectProcessor
    public int composerReloadNodesWithTags(String[] strArr, int i, String[] strArr2) {
        if (!this.mValid) {
            return 0;
        }
        if (!CheckCount(strArr, i) || !CheckCount(strArr2, i)) {
            return -1;
        }
        return nativeComposerReloadNodesWithTags(strArr, i, strArr2);
    }

    @Override // com.ss.ttlivestreamer.core.effect.IVideoEffectProcessor
    public int composerSetNodesWithTags(String[] strArr, int i, String[] strArr2) {
        if (!this.mValid) {
            return 0;
        }
        if (!CheckCount(strArr, i) || !CheckCount(strArr2, i)) {
            return -1;
        }
        return nativeComposerSetNodesWithTags(strArr, i, strArr2);
    }

    @Override // com.ss.ttlivestreamer.core.effect.IVideoEffectProcessor
    public int composerUpdateNode(String str, String str2, float f) {
        if (!this.mValid) {
            return 0;
        }
        return nativeComposerUpdateNode(NonNull(str), NonNull(str2), f);
    }

    @Override // com.ss.ttlivestreamer.core.effect.IVideoEffectProcessor
    public void configGpuTurboBeforeProcessEffect(int i, int i2, boolean z) {
        nativeConfigGpuTurboMode(i, i2, z);
    }

    @Override // com.ss.ttlivestreamer.core.effect.IVideoEffectProcessor
    public void processTouchDownEvent(float f, float f2, int i) {
        if (!this.mValid) {
            return;
        }
        nativeProcessTouchDownEvent(f, f2, i);
    }

    @Override // com.ss.ttlivestreamer.core.effect.IVideoEffectProcessor
    public void processTouchUpEvent(float f, float f2, int i) {
        if (!this.mValid) {
            return;
        }
        nativeProcessTouchUpEvent(f, f2, i);
    }

    @Override // com.ss.ttlivestreamer.core.effect.IVideoEffectProcessor
    public int setBeautify(String str, float f, float f2) {
        if (!this.mValid) {
            return 0;
        }
        return nativeSetBeautify(NonNull(str), f, f2);
    }

    @Override // com.ss.ttlivestreamer.core.effect.IVideoEffectProcessor
    public int setFilter(String str, float f, boolean z) {
        if (!this.mValid) {
            return 0;
        }
        return nativeSetFilter(NonNull(str), f, z);
    }

    @Override // com.ss.ttlivestreamer.core.effect.IVideoEffectProcessor
    public int setReshape(String str, float f, float f2) {
        if (!this.mValid) {
            return 0;
        }
        return nativeSetReshape(NonNull(str), f, f2);
    }

    @Override // com.ss.ttlivestreamer.core.effect.IVideoEffectProcessor
    public int composerExclusionCompare(String str, String str2, String str3, int[] iArr) {
        if (!this.mValid) {
            return 0;
        }
        return nativeComposerExclusionCompare(str, str2, str3, iArr);
    }

    @Override // com.ss.ttlivestreamer.core.effect.IVideoEffectProcessor
    public int composerUpdateMultipleNodes(int i, String[] strArr, String[] strArr2, float[] fArr) {
        if (!this.mValid) {
            return 0;
        }
        return nativeComposerUpdateMultipleNodes(i, strArr, strArr2, fArr);
    }

    @Override // com.ss.ttlivestreamer.core.effect.IVideoEffectProcessor
    public int effectAudioProcessData(ByteBuffer byteBuffer, int i, int i2, int i3) {
        if (!this.mValid) {
            return -1;
        }
        return nativeEffectAudioProcessData(byteBuffer, i, i2, i3);
    }

    public int onReceiveEffectMessage(int i, int i2, int i3, String str) {
        if (!this.mValid) {
            return -1;
        }
        return 0;
    }

    @Override // com.ss.ttlivestreamer.core.effect.IVideoEffectProcessor
    public int sendEffectMsg(int i, int i2, int i3, String str) {
        if (!this.mValid) {
            return 0;
        }
        return nativeSendEffectMsg(i, i2, i3, NonNull(str));
    }

    @Override // com.ss.ttlivestreamer.core.effect.IVideoEffectProcessor
    public int setBeautify(String str, float f, float f2, float f3) {
        if (!this.mValid) {
            return 0;
        }
        return nativeSetBeautifyWithSharp(NonNull(str), f, f2, f3);
    }

    @Override // com.ss.ttlivestreamer.core.effect.IVideoEffectProcessor
    public void setDoubleViewRect(double d, double d2, double d3, double d4) {
        if (this.mValid) {
            nativeSetDoubleViewRect(d, d2, d3, d4);
        }
    }

    @Override // com.ss.ttlivestreamer.core.effect.IVideoEffectProcessor
    public int setInputText(String str, int i, int i2, String str2) {
        if (!this.mValid) {
            return -1;
        }
        return nativeSetInputText(str, i, i2, str2);
    }

    @Override // com.ss.ttlivestreamer.core.effect.IVideoEffectProcessor
    public int startAudioRecognize(ByteBuffer byteBuffer, int i, int i2, int i3) {
        if (!this.mValid) {
            return 0;
        }
        return nativeStartAudioRecognize(byteBuffer, i, i2, i3);
    }

    @Override // com.ss.ttlivestreamer.core.effect.IVideoEffectProcessor
    public int composerReplaceNodesWithTags(String[] strArr, int i, String[] strArr2, int i2, String[] strArr3) {
        if (!this.mValid) {
            return 0;
        }
        if (!CheckCount(strArr, i) || !CheckCount(strArr2, i2) || !CheckCount(strArr3, i2)) {
            return -1;
        }
        return nativeComposerReplaceNodesWithTags(strArr, i, strArr2, i2, strArr3);
    }

    @Override // com.ss.ttlivestreamer.core.effect.IVideoEffectProcessor
    public void processPanEvent(float f, float f2, float f3, float f4, float f5) {
        if (!this.mValid) {
            return;
        }
        nativeProcessPanEvent(f, f2, f3, f4, f5);
    }

    public int processStrangeVoice(Buffer buffer, int i, int i2, int i3, long j) {
        return nativeAudioStrangeVoiceProcess(buffer, i, i2, i3, j);
    }

    @Override // com.ss.ttlivestreamer.core.effect.IVideoEffectProcessor
    public int setFilter(String str, String str2, float f, float f2, float f3) {
        if (!this.mValid) {
            return 0;
        }
        return nativeSetTwoFilters(NonNull(str), NonNull(str2), f3, f, f2, false);
    }

    @Override // com.ss.ttlivestreamer.core.effect.IVideoEffectProcessor
    public void enableExpressionDetect(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        if (!this.mValid) {
            return;
        }
        nativeEnableExpressionDetect(z, z2, z3, z4, z5, z6);
    }

    public int process(int i, int i2, int i3, int i4, long j, boolean z) {
        if (!this.mValid) {
            return 0;
        }
        return nativeProcess(i, i2, i3, i4, j, null, null, z, 0, 0L);
    }

    @Override // com.ss.ttlivestreamer.core.effect.IVideoEffectProcessor
    public int setFilter(String str, String str2, float f, float f2, float f3, boolean z) {
        if (!this.mValid) {
            return 0;
        }
        return nativeSetTwoFilters(NonNull(str), NonNull(str2), f3, f, f2, z);
    }

    @Override // com.ss.ttlivestreamer.core.effect.IVideoEffectProcessor
    public void configEffect(int i, int i2, String str, String str2, boolean z, boolean z2, String str3) {
        if (!this.mValid) {
            return;
        }
        nativeConfigEffect(i, i2, NonNull(str), NonNull(str2), z, z2, NonNull(str3), GLThreadManager.getConfigGLVersion());
    }

    @Override // com.ss.ttlivestreamer.core.effect.IVideoEffectProcessor
    public int process(int i, int i2, int i3, int i4, int i5, long j, boolean z) {
        if (!this.mValid) {
            return 0;
        }
        return nativeProcess(i, i2, i3, i4, j, null, null, z, i5, 0L);
    }

    @Override // com.ss.ttlivestreamer.core.effect.IVideoEffectProcessor
    public void processTouchEventWithTouchType(long j, float f, float f2, float f3, float f4, int i, int i2) {
        if (!this.mValid) {
            return;
        }
        nativeProcessTouchEventWithTouchType(j, f, f2, f3, f4, i, i2);
    }

    public int process(int i, int i2, int i3, int i4, long j, boolean z, long j2) {
        if (!this.mValid) {
            return 0;
        }
        return nativeProcess(i, i2, i3, i4, j, null, null, z, 0, 0L);
    }

    @Override // com.ss.ttlivestreamer.core.effect.IVideoEffectProcessor
    public int process(int i, int i2, int i3, int i4, int i5, RoiInfo roiInfo, long j, boolean z, long j2) {
        if (!this.mValid) {
            return 0;
        }
        return nativeProcess(i, i2, i3, i4, j, null, roiInfo, z, i5, j2);
    }

    @Override // com.ss.ttlivestreamer.core.effect.IVideoEffectProcessor
    public int processV2(int i, int i2, int i3, int i4, int i5, RoiInfo roiInfo, long[] jArr, boolean z, long j) {
        if (!this.mValid) {
            return 0;
        }
        return nativeProcessV2(i, i2, i3, i4, jArr, null, roiInfo, z, i5, j);
    }
}
