package com.ss.ttlivestreamer.livestreamv2.filter;

import X.AnonymousClass028;
import X.C00F;
import X.C06460Ne;
import X.C16880lQ;
import X.C1B6;
import X.C30533Byb;
import X.C30741C4r;
import X.KMP;
import X.P3B;
import X.RunnableC31321CQz;
import X.X1D;
import Y.ARunnableS12S0101000_8;
import Y.ARunnableS15S0101000_11;
import Y.ARunnableS7S0201000_4;
import Y.ARunnableS7S0301000_6;
import Y.IDRunnableS6S0101000;
import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.opengl.GLES20;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.view.OrientationEventListener;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.ss.ttlivestreamer.core.buffer.GlTextureFrameBuffer;
import com.ss.ttlivestreamer.core.buffer.RoiInfo;
import com.ss.ttlivestreamer.core.buffer.TextureBufferImpl;
import com.ss.ttlivestreamer.core.buffer.VideoFrame;
import com.ss.ttlivestreamer.core.effect.EffectImageInfo;
import com.ss.ttlivestreamer.core.effect.EffectWrapper;
import com.ss.ttlivestreamer.core.effect.IAudioStrangeVoice;
import com.ss.ttlivestreamer.core.effect.IVideoEffectProcessor;
import com.ss.ttlivestreamer.core.effect.NativeAudioStrange;
import com.ss.ttlivestreamer.core.engine.AudioDeviceModule;
import com.ss.ttlivestreamer.core.engine.MediaEngineFactory;
import com.ss.ttlivestreamer.core.engine.VideoProcessor;
import com.ss.ttlivestreamer.core.mixer.AudioMixer;
import com.ss.ttlivestreamer.core.opengl.GLThread;
import com.ss.ttlivestreamer.core.opengl.GLThreadManager;
import com.ss.ttlivestreamer.core.opengl.GlRenderDrawer;
import com.ss.ttlivestreamer.core.opengl.GlUtil;
import com.ss.ttlivestreamer.core.opengl.YuvConverter;
import com.ss.ttlivestreamer.core.utils.AVLog;
import com.ss.ttlivestreamer.core.utils.AVLog2;
import com.ss.ttlivestreamer.core.utils.DebugLogUtils;
import com.ss.ttlivestreamer.core.utils.SafeHandlerThreadPoolExecutor;
import com.ss.ttlivestreamer.core.utils.ScopeMonitor;
import com.ss.ttlivestreamer.core.utils.TTLSBuildConfig;
import com.ss.ttlivestreamer.core.utils.TTLSPreInitBusiness;
import com.ss.ttlivestreamer.core.utils.TTLSSladarBugReportUtils;
import com.ss.ttlivestreamer.core.utils.ThreadUtils;
import com.ss.ttlivestreamer.core.utils.TimeUtils;
import com.ss.ttlivestreamer.livestreamv2.IInputAudioStream;
import com.ss.ttlivestreamer.livestreamv2.ILiveStream;
import com.ss.ttlivestreamer.livestreamv2.LiveStreamBuilder;
import com.ss.ttlivestreamer.livestreamv2.LiveStreamGpuTurboWrapper;
import com.ss.ttlivestreamer.livestreamv2.core.velivepusher.IVeLivePusher;
import com.ss.ttlivestreamer.livestreamv2.filter.FilterManager;
import com.ss.ttlivestreamer.livestreamv2.filter.FilterVideoBufferPool;
import com.ss.ttlivestreamer.livestreamv2.filter.IFilterManager;
import com.ss.ttlivestreamer.livestreamv2.filter.VideoCatcher;
import com.ss.ttlivestreamer.livestreamv2.filter.bmf.BmfBrightenFilter;
import com.ss.ttlivestreamer.livestreamv2.filter.bmf.BmfColorHistFilter;
import com.ss.ttlivestreamer.livestreamv2.filter.bmf.BmfNoiseEvaluateFilter;
import com.ss.ttlivestreamer.livestreamv2.filter.bmf.BmfVQScoreFilter;
import com.ss.ttlivestreamer.livestreamv2.filter.bmf.BmfVideoDenoiseFilter;
import com.ss.ttlivestreamer.livestreamv2.utils.AdaptResolutionUtils;
import com.ss.ttlivestreamer.livestreamv2.utils.ImageLoadUtils;
import com.ss.ttlivestreamer.livestreamv2.utils.VideoDumpProxy;
import com.ss.ttlivestreamer.livestreamv2.utils.ZlibCompressUtils;
import defpackage.i0;
import java.lang.ref.WeakReference;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.util.Map;
import java.util.Random;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public class FilterManager extends VideoProcessor implements IFilterManager, ILiveStream.IAudioFrameAvailableListener, TextureBufferImpl.ToI420Interface, VideoCatcher.VideoCatcherCallback {
    public static final String EFF_ALGORITHM_NAME_AVATAR_DRIVE = i0.LJFF("ani", "moji");
    public AdaptResolutionUtils adaptResolutionUtils;
    public long effectAlgorithmRequirment;
    public long effectAlgorithmRequirmentParams;
    public int effectProcessError;
    public AudioDeviceModule mAdm;
    public Object mAudioEffectLock;
    public boolean mAudioRecognizing;
    public IInputAudioStream mAudioStreamObserver;
    public int mBlackFrameBlockSize;
    public int mBlackFrameCountAfterEffect;
    public int mBlackFrameCountBeforeEffect;
    public int mBlackFrameCounter;
    public int mBlackFrameDetectResult;
    public int mBlackFrameDetectThreshold;
    public BmfBrightenFilter mBrightenFilter;
    public final FilterVideoBufferPool mBufferPool;
    public ILiveStream.CatchMediaDataCallback mCatchVideoCallback;
    public int mCatchVideoFrameCount;
    public int mCatchVideoFrameInterval;
    public BmfColorHistFilter mColorHistFilter;
    public final Context mContext;
    public IFilterManager.ContourDataCallBack mContourDataCallBack;
    public int mContourDataSendInterval;
    public String mContourInfoInteractId;
    public IFilterManager.ContourInfoListener mContourInfoListener;
    public final FilterVideoBufferPool mCropBufferPool;
    public int mCurrentOut2dTex;
    public IVideoEffectProcessor mEffect;
    public long mEffectAudioTimestampMs;
    public float mEffectAudioVolume;
    public VideoCatcher mEffectFrameCatcher;
    public boolean mEnableDropFrameWhenNoBuffer;
    public boolean mEnableFindContour;
    public boolean mEnableOesTo2DAsync;
    public boolean mEnableThreeBuffer;
    public boolean mEnableVideoBlackFrameCheck;
    public boolean mEnabled;
    public boolean mEnalbeAudioGraphSticker;
    public IFilterManager.ErrorListener mErrorListener;
    public long mExtrDataFlags;
    public int mExtraDataGop;
    public IFilterManager.FindContourListener mFindContourListener;
    public boolean mForceOutput2DTex;
    public boolean mForceSticker;
    public GLThread mGLThread;
    public Handler mHandler;
    public boolean mKeepVideoCatcherAlive;
    public long mLastCatchTimestamp;
    public FilterVideoBufferPool.Recycle mLastRecycle;
    public IVideoEffectProcessor.EffectMsgListener mMsgListener;
    public int mNoBufferCount;
    public int mNoExtraSendFrameCounts;
    public BmfNoiseEvaluateFilter mNoiseEvaluateFilter;
    public GlRenderDrawer mOffscreenDraw;
    public int mOrientation;
    public AlbumOrientationEventListener mOrientationListener;
    public long mOriginAudioRenderQuirks;
    public VideoCatcher mOriginFrameCatcher;
    public FilterVideoBufferPool.Recycle mOut2DTexRecycle;
    public ILiveStream.CatchPicCallback mPicCallback;
    public int mProcessErrorCount;
    public final int mProcessType;
    public final VideoDumpProxy.RawVideoDumperProxy[] mRawVideoDumpers;
    public boolean mReleased;
    public boolean mRoiEnabled;
    public final FilterVideoBufferPool mSRBufferPool;
    public int mSendContourInfoType;
    public boolean mShouldCatch;
    public boolean mShowRoiRegion;
    public boolean mStretchRoi;
    public FilterVideoBufferPool.Recycle mTextureFrameBufferRecycle;
    public boolean mUseAudioGraphStickerOutput;
    public BmfVQScoreFilter mVQScoreFilter;
    public IVeLivePusher mVeLivePusher;
    public BmfVideoDenoiseFilter mVideoDenoiseFilter;
    public boolean mVpassEnableFindContour;
    public Handler mYuvConvertHandler;
    public GLThread mYuvConvertThread;
    public YuvConverter mYuvConverter;
    public int mYuvHeight;
    public int[] mYuvTexs;
    public int mYuvWidth;
    public LiveStreamGpuTurboWrapper wrapper;

    /* renamed from: com.ss.ttlivestreamer.livestreamv2.filter.FilterManager$1 */
    /* loaded from: classes6.dex */
    public final class AnonymousClass1 implements IFilterManager {
        @Override // com.ss.ttlivestreamer.livestreamv2.filter.IFilterManager
        public int composerAppendNodes(String[] strArr, int i) {
            return 0;
        }

        @Override // com.ss.ttlivestreamer.livestreamv2.filter.IFilterManager
        public int composerAppendNodesWithTags(String[] strArr, int i, String[] strArr2) {
            return 0;
        }

        @Override // com.ss.ttlivestreamer.livestreamv2.filter.IFilterManager
        public int composerAppendNodesWithTags(String[] strArr, int i, String[] strArr2, boolean z, boolean z2, boolean z3) {
            return 0;
        }

        @Override // com.ss.ttlivestreamer.livestreamv2.filter.IFilterManager
        public int composerCheckNodeExclusion(String str, String str2, int[] iArr) {
            return 0;
        }

        @Override // com.ss.ttlivestreamer.livestreamv2.filter.IFilterManager
        public int composerExclusionCompare(String str, String str2, String str3, int[] iArr) {
            return 0;
        }

        @Override // com.ss.ttlivestreamer.livestreamv2.filter.IFilterManager
        public int composerReloadNodes(String[] strArr, int i) {
            return 0;
        }

        @Override // com.ss.ttlivestreamer.livestreamv2.filter.IFilterManager
        public int composerReloadNodesWithTags(String[] strArr, int i, String[] strArr2) {
            return 0;
        }

        @Override // com.ss.ttlivestreamer.livestreamv2.filter.IFilterManager
        public int composerRemoveNodes(String[] strArr, int i) {
            return 0;
        }

        @Override // com.ss.ttlivestreamer.livestreamv2.filter.IFilterManager
        public int composerReplaceNodesWithTags(String[] strArr, int i, String[] strArr2, int i2, String[] strArr3) {
            return 0;
        }

        @Override // com.ss.ttlivestreamer.livestreamv2.filter.IFilterManager
        public int composerSetMode(int i, int i2) {
            return 0;
        }

        @Override // com.ss.ttlivestreamer.livestreamv2.filter.IFilterManager
        public int composerSetNodes(String[] strArr, int i) {
            return 0;
        }

        @Override // com.ss.ttlivestreamer.livestreamv2.filter.IFilterManager
        public int composerSetNodesWithTags(String[] strArr, int i, String[] strArr2) {
            return 0;
        }

        @Override // com.ss.ttlivestreamer.livestreamv2.filter.IFilterManager
        public int composerSetNodesWithTags(String[] strArr, int i, String[] strArr2, boolean z, boolean z2, boolean z3) {
            return 0;
        }

        @Override // com.ss.ttlivestreamer.livestreamv2.filter.IFilterManager
        public int composerUpdateMultipleNodes(int i, String[] strArr, String[] strArr2, float[] fArr) {
            return 0;
        }

        @Override // com.ss.ttlivestreamer.livestreamv2.filter.IFilterManager
        public int composerUpdateNode(String str, String str2, float f) {
            return 0;
        }

        @Override // com.ss.ttlivestreamer.livestreamv2.filter.IFilterManager
        public final /* synthetic */ void configGpuTurbo(LiveStreamGpuTurboWrapper liveStreamGpuTurboWrapper, AdaptResolutionUtils adaptResolutionUtils) {
            C30741C4r.LIZ(this, liveStreamGpuTurboWrapper, adaptResolutionUtils);
        }

        @Override // com.ss.ttlivestreamer.livestreamv2.filter.IFilterManager
        public IAudioStrangeVoice createAudioStrangeVoice(AudioDeviceModule.AudioRenderSink audioRenderSink, int i, int i2, boolean z) {
            return null;
        }

        @Override // com.ss.ttlivestreamer.livestreamv2.filter.IFilterManager
        public void destroyAudioGraphStickerContext() {
        }

        @Override // com.ss.ttlivestreamer.livestreamv2.filter.IFilterManager
        public boolean detectFaceFromBitMap(Bitmap bitmap) {
            return false;
        }

        @Override // com.ss.ttlivestreamer.livestreamv2.filter.IFilterManager
        public void enable(boolean z) {
        }

        @Override // com.ss.ttlivestreamer.livestreamv2.filter.IFilterManager
        public void enableAutoBrightenFilter(boolean z) {
        }

        @Override // com.ss.ttlivestreamer.livestreamv2.filter.IFilterManager
        public void enableExpressionDetect(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        }

        @Override // com.ss.ttlivestreamer.livestreamv2.filter.IFilterManager
        public int enableFindContour(boolean z, String str) {
            return 0;
        }

        @Override // com.ss.ttlivestreamer.livestreamv2.filter.IFilterManager
        public int enableMockFace(boolean z) {
            return 0;
        }

        @Override // com.ss.ttlivestreamer.livestreamv2.filter.IFilterManager
        public void forceOutput2DTex(boolean z) {
        }

        @Override // com.ss.ttlivestreamer.livestreamv2.filter.IFilterManager
        public String getABDefaultInfoFromEffect(String str) {
            return null;
        }

        @Override // com.ss.ttlivestreamer.livestreamv2.filter.IFilterManager
        public final /* synthetic */ int getBufferBlockCnd() {
            return C30741C4r.LIZIZ(this);
        }

        @Override // com.ss.ttlivestreamer.livestreamv2.filter.IFilterManager
        public IFilterManager.ContourDataCallBack getContourDataCallBack() {
            return null;
        }

        @Override // com.ss.ttlivestreamer.livestreamv2.filter.IFilterManager
        public long getEffectAudioQuirk() {
            return 0L;
        }

        @Override // com.ss.ttlivestreamer.livestreamv2.filter.IFilterManager
        public float getEffectAudioVolume() {
            return 0.0f;
        }

        @Override // com.ss.ttlivestreamer.livestreamv2.filter.IFilterManager
        public EffectImageInfo getEffectCapturedImagewithKey(String str) {
            return null;
        }

        @Override // com.ss.ttlivestreamer.livestreamv2.filter.IFilterManager
        public long getEffectNativeHandler() {
            return 0L;
        }

        @Override // com.ss.ttlivestreamer.livestreamv2.filter.IFilterManager
        public final /* synthetic */ int getEffectProcessError() {
            return C30741C4r.LIZJ(this);
        }

        @Override // com.ss.ttlivestreamer.livestreamv2.filter.IFilterManager
        public String getEffectVersion() {
            return null;
        }

        @Override // com.ss.ttlivestreamer.livestreamv2.filter.IFilterManager
        public int getFaceCount() {
            return 0;
        }

        @Override // com.ss.ttlivestreamer.livestreamv2.filter.IFilterManager
        public float getFilterIntensity(String str) {
            return 0.0f;
        }

        @Override // com.ss.ttlivestreamer.livestreamv2.filter.IFilterManager
        public String getFrameCostStatistics() {
            return null;
        }

        @Override // com.ss.ttlivestreamer.livestreamv2.filter.IFilterManager
        public String getFrameProgressParams() {
            return null;
        }

        @Override // com.ss.ttlivestreamer.livestreamv2.filter.IFilterManager
        public String getVersion() {
            return "";
        }

        @Override // com.ss.ttlivestreamer.livestreamv2.filter.IFilterManager
        public IVideoEffectProcessor getVideoEffectProcessor() {
            return null;
        }

        @Override // com.ss.ttlivestreamer.livestreamv2.filter.IFilterManager
        public boolean isEnable() {
            return true;
        }

        @Override // com.ss.ttlivestreamer.livestreamv2.filter.IFilterManager
        public boolean isEnableFindContour() {
            return false;
        }

        @Override // com.ss.ttlivestreamer.livestreamv2.filter.IFilterManager
        public boolean isValid() {
            return false;
        }

        @Override // com.ss.ttlivestreamer.livestreamv2.filter.IFilterManager
        public String name() {
            return "DummyFilter";
        }

        @Override // com.ss.ttlivestreamer.livestreamv2.filter.IFilterManager
        public int notifyKeyboardHide(boolean z) {
            return 0;
        }

        @Override // com.ss.ttlivestreamer.livestreamv2.filter.IFilterManager
        public int pauseEffect() {
            return 0;
        }

        @Override // com.ss.ttlivestreamer.livestreamv2.filter.IFilterManager
        public void processDoubleClickEvent(float f, float f2) {
        }

        @Override // com.ss.ttlivestreamer.livestreamv2.filter.IFilterManager
        public void processLongPressEvent(float f, float f2) {
        }

        @Override // com.ss.ttlivestreamer.livestreamv2.filter.IFilterManager
        public void processPanEvent(float f, float f2, float f3, float f4, float f5) {
        }

        @Override // com.ss.ttlivestreamer.livestreamv2.filter.IFilterManager
        public void processRotationEvent(float f, float f2) {
        }

        @Override // com.ss.ttlivestreamer.livestreamv2.filter.IFilterManager
        public void processScaleEvent(float f, float f2) {
        }

        @Override // com.ss.ttlivestreamer.livestreamv2.filter.IFilterManager
        public void processTouchDownEvent(float f, float f2, int i) {
        }

        @Override // com.ss.ttlivestreamer.livestreamv2.filter.IFilterManager
        public void processTouchEvent(float f, float f2) {
        }

        @Override // com.ss.ttlivestreamer.livestreamv2.filter.IFilterManager
        public void processTouchEventWithTouchType(long j, float f, float f2, float f3, float f4, int i, int i2) {
        }

        @Override // com.ss.ttlivestreamer.livestreamv2.filter.IFilterManager
        public void processTouchUpEvent(float f, float f2, int i) {
        }

        @Override // com.ss.ttlivestreamer.livestreamv2.filter.IFilterManager
        public void releaseContetDetector() {
        }

        @Override // com.ss.ttlivestreamer.livestreamv2.filter.IFilterManager
        public int resetFrameCostStatistics() {
            return 0;
        }

        @Override // com.ss.ttlivestreamer.livestreamv2.filter.IFilterManager
        public int resumeEffect() {
            return 0;
        }

        @Override // com.ss.ttlivestreamer.livestreamv2.filter.IFilterManager
        public int sendEffectMsg(int i, int i2, int i3, String str) {
            return 0;
        }

        @Override // com.ss.ttlivestreamer.livestreamv2.filter.IFilterManager
        public void setABInfoToEffect(JSONObject jSONObject, String str) {
        }

        @Override // com.ss.ttlivestreamer.livestreamv2.filter.IFilterManager
        public int setAudioRecognizeDict(Map<String, String[]> map) {
            return 0;
        }

        @Override // com.ss.ttlivestreamer.livestreamv2.filter.IFilterManager
        public int setBeautify(String str, float f, float f2) {
            return 0;
        }

        @Override // com.ss.ttlivestreamer.livestreamv2.filter.IFilterManager
        public int setBeautify(String str, float f, float f2, float f3) {
            return 0;
        }

        @Override // com.ss.ttlivestreamer.livestreamv2.filter.IFilterManager
        public void setContourDataCallBack(IFilterManager.ContourDataCallBack contourDataCallBack) {
        }

        @Override // com.ss.ttlivestreamer.livestreamv2.filter.IFilterManager
        public void setContourDataSendInterval(int i) {
        }

        @Override // com.ss.ttlivestreamer.livestreamv2.filter.IFilterManager
        public void setContourInfoIndex(String str) {
        }

        @Override // com.ss.ttlivestreamer.livestreamv2.filter.IFilterManager
        public int setCustomEffect(String str, String str2) {
            return 0;
        }

        @Override // com.ss.ttlivestreamer.livestreamv2.filter.IFilterManager
        public int setCustomEffectOrientation(String str, int i) {
            return 0;
        }

        @Override // com.ss.ttlivestreamer.livestreamv2.filter.IFilterManager
        public int setCustomEffectWithUri(String str, String str2, int i, int i2) {
            return 0;
        }

        @Override // com.ss.ttlivestreamer.livestreamv2.filter.IFilterManager
        public void setDoubleViewRect(double d, double d2, double d3, double d4) {
        }

        @Override // com.ss.ttlivestreamer.livestreamv2.filter.IFilterManager
        public int setEffect(String str) {
            return 0;
        }

        @Override // com.ss.ttlivestreamer.livestreamv2.filter.IFilterManager
        public int setEffect(String str, boolean z) {
            return 0;
        }

        @Override // com.ss.ttlivestreamer.livestreamv2.filter.IFilterManager
        public void setEffectAudioQuirk(long j) {
        }

        @Override // com.ss.ttlivestreamer.livestreamv2.filter.IFilterManager
        public void setEffectAudioVolume(float f) {
        }

        @Override // com.ss.ttlivestreamer.livestreamv2.filter.IFilterManager
        public void setEffectInfoChangeListener(IVideoEffectProcessor.IEffectInfoChangeListener iEffectInfoChangeListener) {
        }

        @Override // com.ss.ttlivestreamer.livestreamv2.filter.IFilterManager
        public void setEffectMsgListener(IFilterManager.EffectMsgListener effectMsgListener) {
        }

        @Override // com.ss.ttlivestreamer.livestreamv2.filter.IFilterManager
        public void setErrorListener(IFilterManager.ErrorListener errorListener) {
        }

        @Override // com.ss.ttlivestreamer.livestreamv2.filter.IFilterManager
        public void setExpressionDetectListener(IFilterManager.ExpressionDetectListener expressionDetectListener) {
        }

        @Override // com.ss.ttlivestreamer.livestreamv2.filter.IFilterManager
        public int setFaceAttribute(boolean z) {
            return 0;
        }

        @Override // com.ss.ttlivestreamer.livestreamv2.filter.IFilterManager
        public void setFaceDetectListener(IFilterManager.FaceDetectListener faceDetectListener) {
        }

        @Override // com.ss.ttlivestreamer.livestreamv2.filter.IFilterManager
        public int setFilter(String str, float f) {
            return 0;
        }

        @Override // com.ss.ttlivestreamer.livestreamv2.filter.IFilterManager
        public int setFilter(String str, float f, boolean z) {
            return 0;
        }

        @Override // com.ss.ttlivestreamer.livestreamv2.filter.IFilterManager
        public int setFilter(String str, String str2, float f, float f2, float f3) {
            return 0;
        }

        @Override // com.ss.ttlivestreamer.livestreamv2.filter.IFilterManager
        public int setFilter(String str, String str2, float f, float f2, float f3, boolean z) {
            return 0;
        }

        @Override // com.ss.ttlivestreamer.livestreamv2.filter.IFilterManager
        public void setFindContourListener(IFilterManager.FindContourListener findContourListener) {
        }

        @Override // com.ss.ttlivestreamer.livestreamv2.filter.IFilterManager
        public int setInputText(String str, int i, int i2, String str2) {
            return 0;
        }

        @Override // com.ss.ttlivestreamer.livestreamv2.filter.IFilterManager
        public void setLicenseToEffect(String str) {
        }

        @Override // com.ss.ttlivestreamer.livestreamv2.filter.IFilterManager
        public void setLicenseToEffect(String str, boolean z) {
        }

        @Override // com.ss.ttlivestreamer.livestreamv2.filter.IFilterManager
        public void setMicrophoneDetectListener(IFilterManager.MicrophoneDetectListener microphoneDetectListener) {
        }

        @Override // com.ss.ttlivestreamer.livestreamv2.filter.IFilterManager
        public void setMusicNodeFilePath(String str) {
        }

        @Override // com.ss.ttlivestreamer.livestreamv2.filter.IFilterManager
        public void setRenderCacheInt(String str, int i) {
        }

        @Override // com.ss.ttlivestreamer.livestreamv2.filter.IFilterManager
        public void setRenderCacheString(String str, String str2) {
        }

        @Override // com.ss.ttlivestreamer.livestreamv2.filter.IFilterManager
        public void setRenderSinkOnlyMixWithRTC(boolean z) {
        }

        @Override // com.ss.ttlivestreamer.livestreamv2.filter.IFilterManager
        public int setReshape(String str, float f, float f2) {
            return 0;
        }

        @Override // com.ss.ttlivestreamer.livestreamv2.filter.IFilterManager
        public void setSendContourInfoType(int i) {
        }

        @Override // com.ss.ttlivestreamer.livestreamv2.filter.IFilterManager
        public void setupAudioGraphStickerContext(boolean z, boolean z2, boolean z3) {
        }

        @Override // com.ss.ttlivestreamer.livestreamv2.filter.IFilterManager
        public int startAudioRecognize() {
            return 0;
        }

        @Override // com.ss.ttlivestreamer.livestreamv2.filter.IFilterManager
        public int startEffectAudio() {
            return 0;
        }

        @Override // com.ss.ttlivestreamer.livestreamv2.filter.IFilterManager
        public int stopAudioRecognize() {
            return 0;
        }

        @Override // com.ss.ttlivestreamer.livestreamv2.filter.IFilterManager
        public int stopEffectAudio() {
            return 0;
        }

        @Override // com.ss.ttlivestreamer.livestreamv2.filter.IFilterManager
        public void updateEffAudioTimestampMs(long j) {
        }
    }

    /* renamed from: com.ss.ttlivestreamer.livestreamv2.filter.FilterManager$10 */
    /* loaded from: classes12.dex */
    public class AnonymousClass10 implements Runnable {
        public final /* synthetic */ String val$callInfo;
        public final /* synthetic */ float val$fBrightIntensity;
        public final /* synthetic */ float val$fSmoothIntensity;
        public final /* synthetic */ String val$resPath;

        @Override // java.lang.Runnable
        public void run() {
            com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$10_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
        }

        public void com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$10__run$___twin___() {
            int beautify;
            if (FilterManager.this.isValid() && (beautify = FilterManager.this.mEffect.setBeautify(r2, r3, r4)) != 0) {
                FilterManager.this.mErrorListener.onError(beautify, r5);
            }
        }

        public static void com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$10_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass10 anonymousClass10) {
            boolean LIZ;
            try {
                anonymousClass10.com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$10__run$___twin___();
            } finally {
                if (LIZ) {
                }
            }
        }

        public AnonymousClass10(String str, float f, float f2, String str2) {
            r2 = str;
            r3 = f;
            r4 = f2;
            r5 = str2;
        }
    }

    /* renamed from: com.ss.ttlivestreamer.livestreamv2.filter.FilterManager$11 */
    /* loaded from: classes12.dex */
    public class AnonymousClass11 implements Runnable {
        public final /* synthetic */ String val$callInfo;
        public final /* synthetic */ float val$fBrightIntensity;
        public final /* synthetic */ float val$fSharpIntensity;
        public final /* synthetic */ float val$fSmoothIntensity;
        public final /* synthetic */ String val$resPath;

        @Override // java.lang.Runnable
        public void run() {
            com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$11_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
        }

        public void com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$11__run$___twin___() {
            int beautify;
            if (FilterManager.this.isValid() && (beautify = FilterManager.this.mEffect.setBeautify(r2, r3, r4, r5)) != 0) {
                FilterManager.this.mErrorListener.onError(beautify, r6);
            }
        }

        public static void com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$11_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass11 anonymousClass11) {
            boolean LIZ;
            try {
                anonymousClass11.com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$11__run$___twin___();
            } finally {
                if (LIZ) {
                }
            }
        }

        public AnonymousClass11(String str, float f, float f2, float f3, String str2) {
            r2 = str;
            r3 = f;
            r4 = f2;
            r5 = f3;
            r6 = str2;
        }
    }

    /* renamed from: com.ss.ttlivestreamer.livestreamv2.filter.FilterManager$12 */
    /* loaded from: classes12.dex */
    public class AnonymousClass12 implements Runnable {
        public final /* synthetic */ String val$callInfo;
        public final /* synthetic */ float val$cheekIntensity;
        public final /* synthetic */ float val$eyeIntensity;
        public final /* synthetic */ String val$resPath;

        @Override // java.lang.Runnable
        public void run() {
            com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$12_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
        }

        public void com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$12__run$___twin___() {
            int reshape;
            if (FilterManager.this.isValid() && (reshape = FilterManager.this.mEffect.setReshape(r2, r3, r4)) != 0) {
                FilterManager.this.mErrorListener.onError(reshape, r5);
            }
        }

        public static void com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$12_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass12 anonymousClass12) {
            boolean LIZ;
            try {
                anonymousClass12.com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$12__run$___twin___();
            } finally {
                if (LIZ) {
                }
            }
        }

        public AnonymousClass12(String str, float f, float f2, String str2) {
            r2 = str;
            r3 = f;
            r4 = f2;
            r5 = str2;
        }
    }

    /* renamed from: com.ss.ttlivestreamer.livestreamv2.filter.FilterManager$13 */
    /* loaded from: classes12.dex */
    public class AnonymousClass13 implements Runnable {
        public final /* synthetic */ String val$callInfo;
        public final /* synthetic */ boolean val$needFaceAttribute;

        @Override // java.lang.Runnable
        public void run() {
            com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$13_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
        }

        public void com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$13__run$___twin___() {
            int faceAttribute;
            if (FilterManager.this.isValid() && (faceAttribute = FilterManager.this.mEffect.setFaceAttribute(r2)) != 0) {
                FilterManager.this.mErrorListener.onError(faceAttribute, r3);
            }
        }

        public static void com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$13_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass13 anonymousClass13) {
            boolean LIZ;
            try {
                anonymousClass13.com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$13__run$___twin___();
            } finally {
                if (LIZ) {
                }
            }
        }

        public AnonymousClass13(boolean z, String str) {
            r2 = z;
            r3 = str;
        }
    }

    /* renamed from: com.ss.ttlivestreamer.livestreamv2.filter.FilterManager$14 */
    /* loaded from: classes12.dex */
    public class AnonymousClass14 implements Runnable {
        public final /* synthetic */ String val$callInfo;
        public final /* synthetic */ boolean val$forceSticker;
        public final /* synthetic */ String val$resPath;

        @Override // java.lang.Runnable
        public void run() {
            com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$14_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
        }

        public void com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$14__run$___twin___() {
            if (FilterManager.this.isValid()) {
                FilterManager filterManager = FilterManager.this;
                filterManager.mForceSticker = r2;
                int effect = filterManager.mEffect.setEffect(r3);
                if (effect != 0) {
                    FilterManager.this.mErrorListener.onError(effect, r4);
                }
            }
        }

        public static void com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$14_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass14 anonymousClass14) {
            boolean LIZ;
            try {
                anonymousClass14.com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$14__run$___twin___();
            } finally {
                if (LIZ) {
                }
            }
        }

        public AnonymousClass14(boolean z, String str, String str2) {
            r2 = z;
            r3 = str;
            r4 = str2;
        }
    }

    /* renamed from: com.ss.ttlivestreamer.livestreamv2.filter.FilterManager$15 */
    /* loaded from: classes12.dex */
    public class AnonymousClass15 implements Runnable {
        public final /* synthetic */ String val$callInfo;
        public final /* synthetic */ String val$resPath;

        @Override // java.lang.Runnable
        public void run() {
            com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$15_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
        }

        public void com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$15__run$___twin___() {
            int effect;
            if (FilterManager.this.isValid() && (effect = FilterManager.this.mEffect.setEffect(r2)) != 0) {
                FilterManager.this.mErrorListener.onError(effect, r3);
            }
        }

        public static void com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$15_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass15 anonymousClass15) {
            boolean LIZ;
            try {
                anonymousClass15.com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$15__run$___twin___();
            } finally {
                if (LIZ) {
                }
            }
        }

        public AnonymousClass15(String str, String str2) {
            r2 = str;
            r3 = str2;
        }
    }

    /* renamed from: com.ss.ttlivestreamer.livestreamv2.filter.FilterManager$16 */
    /* loaded from: classes12.dex */
    public class AnonymousClass16 implements Runnable {
        public final /* synthetic */ String val$callInfo;
        public final /* synthetic */ String val$renderCacheKey;
        public final /* synthetic */ String val$resPath;

        @Override // java.lang.Runnable
        public void run() {
            com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$16_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
        }

        public void com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$16__run$___twin___() {
            int customEffect;
            if (FilterManager.this.isValid() && (customEffect = FilterManager.this.mEffect.setCustomEffect(r2, r3)) != 0) {
                FilterManager.this.mErrorListener.onError(customEffect, r4);
            }
        }

        public static void com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$16_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass16 anonymousClass16) {
            boolean LIZ;
            try {
                anonymousClass16.com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$16__run$___twin___();
            } finally {
                if (LIZ) {
                }
            }
        }

        public AnonymousClass16(String str, String str2, String str3) {
            r2 = str;
            r3 = str2;
            r4 = str3;
        }
    }

    /* renamed from: com.ss.ttlivestreamer.livestreamv2.filter.FilterManager$17 */
    /* loaded from: classes12.dex */
    public class AnonymousClass17 implements Runnable {
        public final /* synthetic */ String val$callInfo;
        public final /* synthetic */ String val$renderCacheKey;
        public final /* synthetic */ int val$requireHeight;
        public final /* synthetic */ int val$requireWidth;
        public final /* synthetic */ String val$uriString;

        @Override // java.lang.Runnable
        public void run() {
            com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$17_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
        }

        public void com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$17__run$___twin___() {
            if (FilterManager.this.isValid()) {
                Bitmap loadBitmapCompat = ImageLoadUtils.loadBitmapCompat(FilterManager.this.mContext, r2, r3, r4);
                if (loadBitmapCompat == null) {
                    AVLog.ioe("FilterManager", "loadBitmapCompat failed");
                    return;
                }
                int customEffectBitmap = FilterManager.this.mEffect.setCustomEffectBitmap(r5, loadBitmapCompat);
                if (customEffectBitmap == 0) {
                    return;
                }
                FilterManager.this.mErrorListener.onError(customEffectBitmap, r6);
            }
        }

        public static void com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$17_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass17 anonymousClass17) {
            boolean LIZ;
            try {
                anonymousClass17.com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$17__run$___twin___();
            } finally {
                if (LIZ) {
                }
            }
        }

        public AnonymousClass17(String str, int i, int i2, String str2, String str3) {
            r2 = str;
            r3 = i;
            r4 = i2;
            r5 = str2;
            r6 = str3;
        }
    }

    /* renamed from: com.ss.ttlivestreamer.livestreamv2.filter.FilterManager$18 */
    /* loaded from: classes12.dex */
    public class AnonymousClass18 implements Runnable {
        public final /* synthetic */ String val$callInfo;
        public final /* synthetic */ String val$renderCacheKey;
        public final /* synthetic */ int val$rotateType;

        @Override // java.lang.Runnable
        public void run() {
            com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$18_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
        }

        public void com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$18__run$___twin___() {
            int customEffectOrientation;
            if (FilterManager.this.isValid() && (customEffectOrientation = FilterManager.this.mEffect.setCustomEffectOrientation(r2, r3)) != 0) {
                FilterManager.this.mErrorListener.onError(customEffectOrientation, r4);
            }
        }

        public static void com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$18_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass18 anonymousClass18) {
            boolean LIZ;
            try {
                anonymousClass18.com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$18__run$___twin___();
            } finally {
                if (LIZ) {
                }
            }
        }

        public AnonymousClass18(String str, int i, String str2) {
            r2 = str;
            r3 = i;
            r4 = str2;
        }
    }

    /* renamed from: com.ss.ttlivestreamer.livestreamv2.filter.FilterManager$19 */
    /* loaded from: classes12.dex */
    public class AnonymousClass19 implements Runnable {
        public final /* synthetic */ String val$callInfo;
        public final /* synthetic */ float val$intensity;
        public final /* synthetic */ String val$resPath;

        @Override // java.lang.Runnable
        public void run() {
            com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$19_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
        }

        public void com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$19__run$___twin___() {
            int filter;
            if (FilterManager.this.isValid() && (filter = FilterManager.this.mEffect.setFilter(r2, r3)) != 0) {
                FilterManager.this.mErrorListener.onError(filter, r4);
            }
        }

        public static void com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$19_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass19 anonymousClass19) {
            boolean LIZ;
            try {
                anonymousClass19.com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$19__run$___twin___();
            } finally {
                if (LIZ) {
                }
            }
        }

        public AnonymousClass19(String str, float f, String str2) {
            r2 = str;
            r3 = f;
            r4 = str2;
        }
    }

    /* renamed from: com.ss.ttlivestreamer.livestreamv2.filter.FilterManager$20 */
    /* loaded from: classes12.dex */
    public class AnonymousClass20 implements Runnable {
        public final /* synthetic */ String val$callInfo;
        public final /* synthetic */ float val$intensity;
        public final /* synthetic */ String val$resPath;
        public final /* synthetic */ boolean val$useV2;

        @Override // java.lang.Runnable
        public void run() {
            com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$20_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
        }

        public void com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$20__run$___twin___() {
            int filter;
            if (FilterManager.this.isValid() && (filter = FilterManager.this.mEffect.setFilter(r2, r3, r4)) != 0) {
                FilterManager.this.mErrorListener.onError(filter, r5);
            }
        }

        public static void com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$20_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass20 anonymousClass20) {
            boolean LIZ;
            try {
                anonymousClass20.com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$20__run$___twin___();
            } finally {
                if (LIZ) {
                }
            }
        }

        public AnonymousClass20(String str, float f, boolean z, String str2) {
            r2 = str;
            r3 = f;
            r4 = z;
            r5 = str2;
        }
    }

    /* renamed from: com.ss.ttlivestreamer.livestreamv2.filter.FilterManager$21 */
    /* loaded from: classes12.dex */
    public class AnonymousClass21 implements Runnable {
        public final /* synthetic */ String val$callInfo;
        public final /* synthetic */ String val$leftFilterPath;
        public final /* synthetic */ float val$leftIntensity;
        public final /* synthetic */ float val$position;
        public final /* synthetic */ String val$rightFilterPath;
        public final /* synthetic */ float val$rightIntensity;

        @Override // java.lang.Runnable
        public void run() {
            com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$21_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
        }

        public void com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$21__run$___twin___() {
            int filter;
            if (FilterManager.this.isValid() && (filter = FilterManager.this.mEffect.setFilter(r2, r3, r4, r5, r6)) != 0) {
                FilterManager.this.mErrorListener.onError(filter, r7);
            }
        }

        public static void com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$21_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass21 anonymousClass21) {
            boolean LIZ;
            try {
                anonymousClass21.com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$21__run$___twin___();
            } finally {
                if (LIZ) {
                }
            }
        }

        public AnonymousClass21(String str, String str2, float f, float f2, float f3, String str3) {
            r2 = str;
            r3 = str2;
            r4 = f;
            r5 = f2;
            r6 = f3;
            r7 = str3;
        }
    }

    /* renamed from: com.ss.ttlivestreamer.livestreamv2.filter.FilterManager$22 */
    /* loaded from: classes12.dex */
    public class AnonymousClass22 implements Runnable {
        public final /* synthetic */ String val$callInfo;
        public final /* synthetic */ String val$leftFilterPath;
        public final /* synthetic */ float val$leftIntensity;
        public final /* synthetic */ float val$position;
        public final /* synthetic */ String val$rightFilterPath;
        public final /* synthetic */ float val$rightIntensity;
        public final /* synthetic */ boolean val$useV2;

        @Override // java.lang.Runnable
        public void run() {
            com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$22_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
        }

        public void com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$22__run$___twin___() {
            int filter;
            if (FilterManager.this.isValid() && (filter = FilterManager.this.mEffect.setFilter(r2, r3, r4, r5, r6, r7)) != 0) {
                FilterManager.this.mErrorListener.onError(filter, r8);
            }
        }

        public static void com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$22_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass22 anonymousClass22) {
            boolean LIZ;
            try {
                anonymousClass22.com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$22__run$___twin___();
            } finally {
                if (LIZ) {
                }
            }
        }

        public AnonymousClass22(String str, String str2, float f, float f2, float f3, boolean z, String str3) {
            r2 = str;
            r3 = str2;
            r4 = f;
            r5 = f2;
            r6 = f3;
            r7 = z;
            r8 = str3;
        }
    }

    /* renamed from: com.ss.ttlivestreamer.livestreamv2.filter.FilterManager$23 */
    /* loaded from: classes12.dex */
    public class AnonymousClass23 implements Runnable {
        public final /* synthetic */ String val$callInfo;
        public final /* synthetic */ Map val$dict;

        @Override // java.lang.Runnable
        public void run() {
            com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$23_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
        }

        public void com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$23__run$___twin___() {
            int audioRecognizeDict;
            if (FilterManager.this.isValid() && (audioRecognizeDict = FilterManager.this.mEffect.setAudioRecognizeDict(r2)) != 0) {
                FilterManager.this.mErrorListener.onError(audioRecognizeDict, r3);
            }
        }

        public static void com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$23_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass23 anonymousClass23) {
            boolean LIZ;
            try {
                anonymousClass23.com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$23__run$___twin___();
            } finally {
                if (LIZ) {
                }
            }
        }

        public AnonymousClass23(Map map, String str) {
            r2 = map;
            r3 = str;
        }
    }

    /* renamed from: com.ss.ttlivestreamer.livestreamv2.filter.FilterManager$24 */
    /* loaded from: classes12.dex */
    public class AnonymousClass24 implements Runnable {
        public final /* synthetic */ boolean val$useOutput;

        @Override // java.lang.Runnable
        public void run() {
            com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$24_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
        }

        public void com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$24__run$___twin___() {
            FilterManager filterManager = FilterManager.this;
            if (filterManager.mEnalbeAudioGraphSticker) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("setupAudioGraphStickerContext failed! mEnalbeAudioGraphSticker: ");
                LIZ.append(FilterManager.this.mEnalbeAudioGraphSticker);
                AVLog.logKibana(5, "FilterManager", X1D.LIZIZ(LIZ), null);
                return;
            }
            if (filterManager.isValid()) {
                FilterManager filterManager2 = FilterManager.this;
                filterManager2.mUseAudioGraphStickerOutput = r2;
                int i = filterManager2.mEffect.setupEffectAudioHandler();
                if (i != 0) {
                    FilterManager.this.mErrorListener.onError(i, "");
                }
                synchronized (FilterManager.this.mAudioEffectLock) {
                    FilterManager.this.mEnalbeAudioGraphSticker = true;
                    AVLog.logKibana(5, "FilterManager", "mEnalbeAudioGraphSticker is set to true in setupAudioGraphStickerContext", null);
                }
                AudioDeviceModule audioDeviceModule = FilterManager.this.mAdm;
                if (audioDeviceModule != null) {
                    audioDeviceModule.enableAsyncProcess(true);
                }
                FilterManager.this.mEffect.effectAudioSetPlaybackDeviceType(1);
                FilterManager filterManager3 = FilterManager.this;
                if (filterManager3.mUseAudioGraphStickerOutput) {
                    IInputAudioStream iInputAudioStream = filterManager3.mAudioStreamObserver;
                    if (iInputAudioStream != null && iInputAudioStream.getAudioTrack() != null) {
                        FilterManager.this.mAudioStreamObserver.getAudioTrack().setEnable(true);
                        return;
                    }
                    return;
                }
                IInputAudioStream iInputAudioStream2 = filterManager3.mAudioStreamObserver;
                if (iInputAudioStream2 == null || iInputAudioStream2.getAudioTrack() == null) {
                    return;
                }
                FilterManager.this.mAudioStreamObserver.getAudioTrack().setEnable(false);
            }
        }

        public static void com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$24_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass24 anonymousClass24) {
            boolean LIZ;
            try {
                anonymousClass24.com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$24__run$___twin___();
            } finally {
                if (LIZ) {
                }
            }
        }

        public AnonymousClass24(boolean z) {
            r2 = z;
        }
    }

    /* renamed from: com.ss.ttlivestreamer.livestreamv2.filter.FilterManager$25 */
    /* loaded from: classes12.dex */
    public class AnonymousClass25 implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$25_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
        }

        public void com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$25__run$___twin___() {
            FilterManager filterManager = FilterManager.this;
            if (!filterManager.mEnalbeAudioGraphSticker) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("destroyAudioGraphStickerContext failed! mEnalbeAudioGraphSticker: ");
                LIZ.append(FilterManager.this.mEnalbeAudioGraphSticker);
                AVLog.logKibana(5, "FilterManager", X1D.LIZIZ(LIZ), null);
                return;
            }
            if (filterManager.isValid()) {
                synchronized (FilterManager.this.mAudioEffectLock) {
                    FilterManager.this.mEnalbeAudioGraphSticker = false;
                    AVLog.logKibana(5, "FilterManager", "mEnalbeAudioGraphSticker is set to false in destroyAudioGraphStickerContext", null);
                }
                FilterManager filterManager2 = FilterManager.this;
                filterManager2.mAdm.enableAsyncProcess(filterManager2.mAudioRecognizing);
                FilterManager filterManager3 = FilterManager.this;
                if (!filterManager3.mUseAudioGraphStickerOutput) {
                    filterManager3.mAudioStreamObserver.getAudioTrack().setEnable(true);
                }
                int destroyEffectAudioHandler = FilterManager.this.mEffect.destroyEffectAudioHandler();
                if (destroyEffectAudioHandler != 0) {
                    FilterManager.this.mErrorListener.onError(destroyEffectAudioHandler, "");
                }
            }
        }

        public AnonymousClass25() {
        }

        public static void com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$25_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass25 anonymousClass25) {
            boolean LIZ;
            try {
                anonymousClass25.com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$25__run$___twin___();
            } finally {
                if (LIZ) {
                }
            }
        }
    }

    /* renamed from: com.ss.ttlivestreamer.livestreamv2.filter.FilterManager$26 */
    /* loaded from: classes12.dex */
    public class AnonymousClass26 implements Runnable {
        public final /* synthetic */ String val$callInfo;
        public final /* synthetic */ int val$mode;
        public final /* synthetic */ int val$orderType;

        @Override // java.lang.Runnable
        public void run() {
            com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$26_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
        }

        public void com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$26__run$___twin___() {
            int composerSetMode;
            if (FilterManager.this.isValid() && (composerSetMode = FilterManager.this.mEffect.composerSetMode(r2, r3)) != 0) {
                FilterManager.this.mErrorListener.onError(composerSetMode, r4);
            }
        }

        public static void com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$26_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass26 anonymousClass26) {
            boolean LIZ;
            try {
                anonymousClass26.com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$26__run$___twin___();
            } finally {
                if (LIZ) {
                }
            }
        }

        public AnonymousClass26(int i, int i2, String str) {
            r2 = i;
            r3 = i2;
            r4 = str;
        }
    }

    /* renamed from: com.ss.ttlivestreamer.livestreamv2.filter.FilterManager$27 */
    /* loaded from: classes12.dex */
    public class AnonymousClass27 implements Runnable {
        public final /* synthetic */ String val$callInfo;
        public final /* synthetic */ int val$nodeNum;
        public final /* synthetic */ String[] val$nodePaths;

        @Override // java.lang.Runnable
        public void run() {
            com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$27_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
        }

        public void com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$27__run$___twin___() {
            int composerSetNodes;
            if (FilterManager.this.isValid() && (composerSetNodes = FilterManager.this.mEffect.composerSetNodes(r2, r3)) != 0) {
                FilterManager.this.mErrorListener.onError(composerSetNodes, r4);
            }
        }

        public static void com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$27_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass27 anonymousClass27) {
            boolean LIZ;
            try {
                anonymousClass27.com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$27__run$___twin___();
            } finally {
                if (LIZ) {
                }
            }
        }

        public AnonymousClass27(String[] strArr, int i, String str) {
            r2 = strArr;
            r3 = i;
            r4 = str;
        }
    }

    /* renamed from: com.ss.ttlivestreamer.livestreamv2.filter.FilterManager$28 */
    /* loaded from: classes12.dex */
    public class AnonymousClass28 implements Runnable {
        public final /* synthetic */ String val$callInfo;
        public final /* synthetic */ String val$nodePath;
        public final /* synthetic */ String val$nodeTag;
        public final /* synthetic */ float val$nodeValue;

        @Override // java.lang.Runnable
        public void run() {
            com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$28_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
        }

        public void com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$28__run$___twin___() {
            int composerUpdateNode;
            if (FilterManager.this.isValid() && (composerUpdateNode = FilterManager.this.mEffect.composerUpdateNode(r2, r3, r4)) != 0) {
                FilterManager.this.mErrorListener.onError(composerUpdateNode, r5);
            }
        }

        public static void com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$28_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass28 anonymousClass28) {
            boolean LIZ;
            try {
                anonymousClass28.com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$28__run$___twin___();
            } finally {
                if (LIZ) {
                }
            }
        }

        public AnonymousClass28(String str, String str2, float f, String str3) {
            r2 = str;
            r3 = str2;
            r4 = f;
            r5 = str3;
        }
    }

    /* renamed from: com.ss.ttlivestreamer.livestreamv2.filter.FilterManager$29 */
    /* loaded from: classes12.dex */
    public class AnonymousClass29 implements Runnable {
        public final /* synthetic */ String val$callInfo;
        public final /* synthetic */ String[] val$nodeKeys;
        public final /* synthetic */ int val$nodeNum;
        public final /* synthetic */ String[] val$nodePaths;
        public final /* synthetic */ float[] val$nodeValues;

        @Override // java.lang.Runnable
        public void run() {
            com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$29_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
        }

        public void com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$29__run$___twin___() {
            int composerUpdateMultipleNodes;
            if (FilterManager.this.isValid() && (composerUpdateMultipleNodes = FilterManager.this.mEffect.composerUpdateMultipleNodes(r2, r3, r4, r5)) != 0) {
                FilterManager.this.mErrorListener.onError(composerUpdateMultipleNodes, r6);
            }
        }

        public static void com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$29_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass29 anonymousClass29) {
            boolean LIZ;
            try {
                anonymousClass29.com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$29__run$___twin___();
            } finally {
                if (LIZ) {
                }
            }
        }

        public AnonymousClass29(int i, String[] strArr, String[] strArr2, float[] fArr, String str) {
            r2 = i;
            r3 = strArr;
            r4 = strArr2;
            r5 = fArr;
            r6 = str;
        }
    }

    /* renamed from: com.ss.ttlivestreamer.livestreamv2.filter.FilterManager$3 */
    /* loaded from: classes12.dex */
    public class AnonymousClass3 implements Runnable {
        public final /* synthetic */ boolean val$isEdgeRender;
        public final /* synthetic */ AudioDeviceModule val$module;
        public final /* synthetic */ IVideoEffectProcessor val$videoEffectProcessor;

        @Override // java.lang.Runnable
        public void run() {
            com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$3_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
        }

        public void com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$3__run$___twin___() {
            IInputAudioStream iInputAudioStream;
            IVideoEffectProcessor iVideoEffectProcessor = r2;
            if (iVideoEffectProcessor != null) {
                FilterManager.this.mEffect = iVideoEffectProcessor;
            } else {
                FilterManager.this.mEffect = new EffectWrapper(r3, r4);
            }
            if (!FilterManager.this.mEffect.valid()) {
                FilterManager.this.mEffect.release();
                FilterManager.this.mEffect = null;
                return;
            }
            AudioDeviceModule.AudioRenderSink effectAudioRender = FilterManager.this.mEffect.getEffectAudioRender();
            if (effectAudioRender != null && (iInputAudioStream = FilterManager.this.mAudioStreamObserver) != null) {
                effectAudioRender.setAudioTrack(iInputAudioStream.getAudioTrack());
                effectAudioRender.setVolume(FilterManager.this.mEffectAudioVolume);
                AudioMixer.AudioMixerDescription mixerDescription = FilterManager.this.mAudioStreamObserver.getMixerDescription();
                FilterManager filterManager = FilterManager.this;
                mixerDescription.volumeCoeff = filterManager.mEffectAudioVolume;
                filterManager.mAudioStreamObserver.start();
            }
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Using Effect info ");
            LIZ.append(FilterManager.this.mEffect.name());
            LIZ.append(" ");
            LIZ.append(FilterManager.this.mEffect.getEffectVersion());
            AVLog.iow("FilterManager", X1D.LIZIZ(LIZ));
            FilterManager.this.mOffscreenDraw = new GlRenderDrawer();
        }

        public static void com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$3_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass3 anonymousClass3) {
            boolean LIZ;
            try {
                anonymousClass3.com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$3__run$___twin___();
            } finally {
                if (LIZ) {
                }
            }
        }

        public AnonymousClass3(IVideoEffectProcessor iVideoEffectProcessor, AudioDeviceModule audioDeviceModule, boolean z) {
            r2 = iVideoEffectProcessor;
            r3 = audioDeviceModule;
            r4 = z;
        }
    }

    /* renamed from: com.ss.ttlivestreamer.livestreamv2.filter.FilterManager$30 */
    /* loaded from: classes12.dex */
    public class AnonymousClass30 implements Runnable {
        public final /* synthetic */ String val$callInfo;
        public final /* synthetic */ int val$nodeNum;
        public final /* synthetic */ String[] val$nodePaths;

        @Override // java.lang.Runnable
        public void run() {
            com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$30_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
        }

        public void com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$30__run$___twin___() {
            int composerReloadNodes;
            if (FilterManager.this.isValid() && (composerReloadNodes = FilterManager.this.mEffect.composerReloadNodes(r2, r3)) != 0) {
                FilterManager.this.mErrorListener.onError(composerReloadNodes, r4);
            }
        }

        public static void com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$30_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass30 anonymousClass30) {
            boolean LIZ;
            try {
                anonymousClass30.com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$30__run$___twin___();
            } finally {
                if (LIZ) {
                }
            }
        }

        public AnonymousClass30(String[] strArr, int i, String str) {
            r2 = strArr;
            r3 = i;
            r4 = str;
        }
    }

    /* renamed from: com.ss.ttlivestreamer.livestreamv2.filter.FilterManager$31 */
    /* loaded from: classes12.dex */
    public class AnonymousClass31 implements Runnable {
        public final /* synthetic */ String val$callInfo;
        public final /* synthetic */ int val$nodeNum;
        public final /* synthetic */ String[] val$nodes;

        @Override // java.lang.Runnable
        public void run() {
            com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$31_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
        }

        public void com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$31__run$___twin___() {
            int composerAppendNodes;
            if (FilterManager.this.isValid() && (composerAppendNodes = FilterManager.this.mEffect.composerAppendNodes(r2, r3)) != 0) {
                FilterManager.this.mErrorListener.onError(composerAppendNodes, r4);
            }
        }

        public static void com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$31_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass31 anonymousClass31) {
            boolean LIZ;
            try {
                anonymousClass31.com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$31__run$___twin___();
            } finally {
                if (LIZ) {
                }
            }
        }

        public AnonymousClass31(String[] strArr, int i, String str) {
            r2 = strArr;
            r3 = i;
            r4 = str;
        }
    }

    /* renamed from: com.ss.ttlivestreamer.livestreamv2.filter.FilterManager$32 */
    /* loaded from: classes12.dex */
    public class AnonymousClass32 implements Runnable {
        public final /* synthetic */ String val$callInfo;
        public final /* synthetic */ int val$nodeNum;
        public final /* synthetic */ String[] val$nodePaths;

        @Override // java.lang.Runnable
        public void run() {
            com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$32_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
        }

        public void com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$32__run$___twin___() {
            if (FilterManager.this.isValid()) {
                int composerRemoveNodes = FilterManager.this.mEffect.composerRemoveNodes(r2, r3);
                if (composerRemoveNodes != 0) {
                    FilterManager.this.mErrorListener.onError(composerRemoveNodes, r4);
                }
                FilterManager filterManager = FilterManager.this;
                if (filterManager.mEnalbeAudioGraphSticker) {
                    filterManager.destroyAudioGraphStickerContext();
                }
            }
        }

        public static void com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$32_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass32 anonymousClass32) {
            boolean LIZ;
            try {
                anonymousClass32.com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$32__run$___twin___();
            } finally {
                if (LIZ) {
                }
            }
        }

        public AnonymousClass32(String[] strArr, int i, String str) {
            r2 = strArr;
            r3 = i;
            r4 = str;
        }
    }

    /* renamed from: com.ss.ttlivestreamer.livestreamv2.filter.FilterManager$33 */
    /* loaded from: classes12.dex */
    public class AnonymousClass33 implements Runnable {
        public final /* synthetic */ boolean val$inMic;
        public final /* synthetic */ boolean val$inMusic;
        public final /* synthetic */ int val$nodeNum;
        public final /* synthetic */ String[] val$nodePaths;
        public final /* synthetic */ String[] val$tags;
        public final /* synthetic */ boolean val$useOutput;

        @Override // java.lang.Runnable
        public void run() {
            com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$33_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
        }

        public void com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$33__run$___twin___() {
            if (FilterManager.this.isValid()) {
                boolean z = r2;
                if (z || r3) {
                    FilterManager.this.setupAudioGraphStickerContext(z, r3, r4);
                    FilterManager.this.composerSetNodesWithTags(r5, r6, r7);
                } else {
                    FilterManager.this.composerSetNodesWithTags(r5, r6, r7);
                }
            }
        }

        public static void com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$33_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass33 anonymousClass33) {
            boolean LIZ;
            try {
                anonymousClass33.com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$33__run$___twin___();
            } finally {
                if (LIZ) {
                }
            }
        }

        public AnonymousClass33(boolean z, boolean z2, boolean z3, String[] strArr, int i, String[] strArr2) {
            r2 = z;
            r3 = z2;
            r4 = z3;
            r5 = strArr;
            r6 = i;
            r7 = strArr2;
        }
    }

    /* renamed from: com.ss.ttlivestreamer.livestreamv2.filter.FilterManager$34 */
    /* loaded from: classes12.dex */
    public class AnonymousClass34 implements Runnable {
        public final /* synthetic */ String val$callInfo;
        public final /* synthetic */ int val$nodeNum;
        public final /* synthetic */ String[] val$nodePaths;
        public final /* synthetic */ String[] val$tags;

        @Override // java.lang.Runnable
        public void run() {
            com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$34_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
        }

        public void com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$34__run$___twin___() {
            int composerSetNodesWithTags;
            if (FilterManager.this.isValid() && (composerSetNodesWithTags = FilterManager.this.mEffect.composerSetNodesWithTags(r2, r3, r4)) != 0) {
                FilterManager.this.mErrorListener.onError(composerSetNodesWithTags, r5);
            }
        }

        public static void com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$34_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass34 anonymousClass34) {
            boolean LIZ;
            try {
                anonymousClass34.com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$34__run$___twin___();
            } finally {
                if (LIZ) {
                }
            }
        }

        public AnonymousClass34(String[] strArr, int i, String[] strArr2, String str) {
            r2 = strArr;
            r3 = i;
            r4 = strArr2;
            r5 = str;
        }
    }

    /* renamed from: com.ss.ttlivestreamer.livestreamv2.filter.FilterManager$35 */
    /* loaded from: classes12.dex */
    public class AnonymousClass35 implements Runnable {
        public final /* synthetic */ String val$callInfo;
        public final /* synthetic */ int val$nodeNum;
        public final /* synthetic */ String[] val$nodePaths;
        public final /* synthetic */ String[] val$tags;

        @Override // java.lang.Runnable
        public void run() {
            com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$35_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
        }

        public void com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$35__run$___twin___() {
            int composerReloadNodesWithTags;
            if (FilterManager.this.isValid() && (composerReloadNodesWithTags = FilterManager.this.mEffect.composerReloadNodesWithTags(r2, r3, r4)) != 0) {
                FilterManager.this.mErrorListener.onError(composerReloadNodesWithTags, r5);
            }
        }

        public static void com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$35_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass35 anonymousClass35) {
            boolean LIZ;
            try {
                anonymousClass35.com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$35__run$___twin___();
            } finally {
                if (LIZ) {
                }
            }
        }

        public AnonymousClass35(String[] strArr, int i, String[] strArr2, String str) {
            r2 = strArr;
            r3 = i;
            r4 = strArr2;
            r5 = str;
        }
    }

    /* renamed from: com.ss.ttlivestreamer.livestreamv2.filter.FilterManager$36 */
    /* loaded from: classes12.dex */
    public class AnonymousClass36 implements Runnable {
        public final /* synthetic */ boolean val$inMic;
        public final /* synthetic */ boolean val$inMusic;
        public final /* synthetic */ int val$nodeNum;
        public final /* synthetic */ String[] val$nodePaths;
        public final /* synthetic */ String[] val$tags;
        public final /* synthetic */ boolean val$useOutput;

        @Override // java.lang.Runnable
        public void run() {
            com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$36_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
        }

        public void com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$36__run$___twin___() {
            if (FilterManager.this.isValid()) {
                boolean z = r2;
                if (z || r3) {
                    FilterManager.this.setupAudioGraphStickerContext(z, r3, r4);
                    FilterManager.this.composerAppendNodesWithTags(r5, r6, r7);
                } else {
                    FilterManager.this.composerAppendNodesWithTags(r5, r6, r7);
                }
            }
        }

        public static void com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$36_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass36 anonymousClass36) {
            boolean LIZ;
            try {
                anonymousClass36.com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$36__run$___twin___();
            } finally {
                if (LIZ) {
                }
            }
        }

        public AnonymousClass36(boolean z, boolean z2, boolean z3, String[] strArr, int i, String[] strArr2) {
            r2 = z;
            r3 = z2;
            r4 = z3;
            r5 = strArr;
            r6 = i;
            r7 = strArr2;
        }
    }

    /* renamed from: com.ss.ttlivestreamer.livestreamv2.filter.FilterManager$37 */
    /* loaded from: classes12.dex */
    public class AnonymousClass37 implements Runnable {
        public final /* synthetic */ String val$callInfo;
        public final /* synthetic */ int val$nodeNum;
        public final /* synthetic */ String[] val$nodes;
        public final /* synthetic */ String[] val$tags;

        @Override // java.lang.Runnable
        public void run() {
            com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$37_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
        }

        public void com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$37__run$___twin___() {
            int composerAppendNodesWithTags;
            if (FilterManager.this.isValid() && (composerAppendNodesWithTags = FilterManager.this.mEffect.composerAppendNodesWithTags(r2, r3, r4)) != 0) {
                FilterManager.this.mErrorListener.onError(composerAppendNodesWithTags, r5);
            }
        }

        public static void com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$37_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass37 anonymousClass37) {
            boolean LIZ;
            try {
                anonymousClass37.com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$37__run$___twin___();
            } finally {
                if (LIZ) {
                }
            }
        }

        public AnonymousClass37(String[] strArr, int i, String[] strArr2, String str) {
            r2 = strArr;
            r3 = i;
            r4 = strArr2;
            r5 = str;
        }
    }

    /* renamed from: com.ss.ttlivestreamer.livestreamv2.filter.FilterManager$38 */
    /* loaded from: classes12.dex */
    public class AnonymousClass38 implements Runnable {
        public final /* synthetic */ String val$callInfo;
        public final /* synthetic */ int val$newPathNum;
        public final /* synthetic */ String[] val$newPaths;
        public final /* synthetic */ String[] val$newTags;
        public final /* synthetic */ int val$oldPathNum;
        public final /* synthetic */ String[] val$oldPaths;

        @Override // java.lang.Runnable
        public void run() {
            com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$38_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
        }

        public void com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$38__run$___twin___() {
            int composerReplaceNodesWithTags;
            if (FilterManager.this.isValid() && (composerReplaceNodesWithTags = FilterManager.this.mEffect.composerReplaceNodesWithTags(r2, r3, r4, r5, r6)) != 0) {
                FilterManager.this.mErrorListener.onError(composerReplaceNodesWithTags, r7);
            }
        }

        public static void com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$38_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass38 anonymousClass38) {
            boolean LIZ;
            try {
                anonymousClass38.com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$38__run$___twin___();
            } finally {
                if (LIZ) {
                }
            }
        }

        public AnonymousClass38(String[] strArr, int i, String[] strArr2, int i2, String[] strArr3, String str) {
            r2 = strArr;
            r3 = i;
            r4 = strArr2;
            r5 = i2;
            r6 = strArr3;
            r7 = str;
        }
    }

    /* renamed from: com.ss.ttlivestreamer.livestreamv2.filter.FilterManager$39 */
    /* loaded from: classes12.dex */
    public class AnonymousClass39 implements Runnable {
        public final /* synthetic */ int[] val$ret;

        @Override // java.lang.Runnable
        public void run() {
            com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$39_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
        }

        public void com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$39__run$___twin___() {
            r2[0] = FilterManager.this.mEffect.getFaceCount();
        }

        public static void com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$39_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass39 anonymousClass39) {
            boolean LIZ;
            try {
                anonymousClass39.com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$39__run$___twin___();
            } finally {
                if (LIZ) {
                }
            }
        }

        public AnonymousClass39(int[] iArr) {
            r2 = iArr;
        }
    }

    /* renamed from: com.ss.ttlivestreamer.livestreamv2.filter.FilterManager$4 */
    /* loaded from: classes12.dex */
    public class AnonymousClass4 implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$4_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
        }

        public void com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$4__run$___twin___() {
            IVideoEffectProcessor iVideoEffectProcessor = FilterManager.this.mEffect;
            if (iVideoEffectProcessor != null) {
                iVideoEffectProcessor.release();
                FilterManager.this.mEffect.setEffectMsgListener(null);
                FilterManager filterManager = FilterManager.this;
                filterManager.mEffect = null;
                IVideoEffectProcessor.EffectMsgListener effectMsgListener = filterManager.mMsgListener;
                if (effectMsgListener != null) {
                    effectMsgListener.onMessageReceived(2139095042, 0, 0, null);
                }
            }
        }

        public AnonymousClass4() {
        }

        public static void com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$4_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass4 anonymousClass4) {
            boolean LIZ;
            try {
                anonymousClass4.com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$4__run$___twin___();
            } finally {
                if (LIZ) {
                }
            }
        }
    }

    /* renamed from: com.ss.ttlivestreamer.livestreamv2.filter.FilterManager$40 */
    /* loaded from: classes12.dex */
    public class AnonymousClass40 implements Runnable {
        public final /* synthetic */ String val$callInfo;
        public final /* synthetic */ String val$nodePath;
        public final /* synthetic */ String val$nodeTag;
        public final /* synthetic */ int[] val$result;

        @Override // java.lang.Runnable
        public void run() {
            com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$40_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
        }

        public void com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$40__run$___twin___() {
            int composerCheckNodeExclusion = FilterManager.this.mEffect.composerCheckNodeExclusion(r2, r3, r4);
            if (composerCheckNodeExclusion != 0) {
                FilterManager.this.mErrorListener.onError(composerCheckNodeExclusion, r5);
            }
        }

        public static void com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$40_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass40 anonymousClass40) {
            boolean LIZ;
            try {
                anonymousClass40.com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$40__run$___twin___();
            } finally {
                if (LIZ) {
                }
            }
        }

        public AnonymousClass40(String str, String str2, int[] iArr, String str3) {
            r2 = str;
            r3 = str2;
            r4 = iArr;
            r5 = str3;
        }
    }

    /* renamed from: com.ss.ttlivestreamer.livestreamv2.filter.FilterManager$41 */
    /* loaded from: classes12.dex */
    public class AnonymousClass41 implements Runnable {
        public final /* synthetic */ String val$callInfo;
        public final /* synthetic */ String val$newNodePath;
        public final /* synthetic */ String val$nodeKey;
        public final /* synthetic */ String val$oldNodePath;
        public final /* synthetic */ int[] val$result;

        @Override // java.lang.Runnable
        public void run() {
            com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$41_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
        }

        public void com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$41__run$___twin___() {
            int composerExclusionCompare = FilterManager.this.mEffect.composerExclusionCompare(r2, r3, r4, r5);
            if (composerExclusionCompare != 0) {
                FilterManager.this.mErrorListener.onError(composerExclusionCompare, r6);
            }
        }

        public static void com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$41_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass41 anonymousClass41) {
            boolean LIZ;
            try {
                anonymousClass41.com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$41__run$___twin___();
            } finally {
                if (LIZ) {
                }
            }
        }

        public AnonymousClass41(String str, String str2, String str3, int[] iArr, String str4) {
            r2 = str;
            r3 = str2;
            r4 = str3;
            r5 = iArr;
            r6 = str4;
        }
    }

    /* renamed from: com.ss.ttlivestreamer.livestreamv2.filter.FilterManager$42 */
    /* loaded from: classes12.dex */
    public class AnonymousClass42 implements Runnable {
        public final /* synthetic */ double val$height;
        public final /* synthetic */ double val$topLeftX;
        public final /* synthetic */ double val$topLeftY;
        public final /* synthetic */ double val$width;

        @Override // java.lang.Runnable
        public void run() {
            com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$42_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
        }

        public void com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$42__run$___twin___() {
            if (FilterManager.this.isValid()) {
                FilterManager.this.mEffect.setDoubleViewRect(r2, r4, r6, r8);
            }
        }

        public static void com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$42_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass42 anonymousClass42) {
            boolean LIZ;
            try {
                anonymousClass42.com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$42__run$___twin___();
            } finally {
                if (LIZ) {
                }
            }
        }

        public AnonymousClass42(double d, double d2, double d3, double d4) {
            r2 = d;
            r4 = d2;
            r6 = d3;
            r8 = d4;
        }
    }

    /* renamed from: com.ss.ttlivestreamer.livestreamv2.filter.FilterManager$43 */
    /* loaded from: classes12.dex */
    public class AnonymousClass43 implements Runnable {
        public final /* synthetic */ float val$x;
        public final /* synthetic */ float val$y;

        @Override // java.lang.Runnable
        public void run() {
            com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$43_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
        }

        public void com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$43__run$___twin___() {
            if (FilterManager.this.isValid()) {
                FilterManager.this.mEffect.processTouchEvent(r2, r3);
            }
        }

        public static void com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$43_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass43 anonymousClass43) {
            boolean LIZ;
            try {
                anonymousClass43.com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$43__run$___twin___();
            } finally {
                if (LIZ) {
                }
            }
        }

        public AnonymousClass43(float f, float f2) {
            r2 = f;
            r3 = f2;
        }
    }

    /* renamed from: com.ss.ttlivestreamer.livestreamv2.filter.FilterManager$44 */
    /* loaded from: classes12.dex */
    public class AnonymousClass44 implements Runnable {
        public final /* synthetic */ int val$evt;
        public final /* synthetic */ float val$force;
        public final /* synthetic */ float val$majorRadius;
        public final /* synthetic */ int val$pointerCount;
        public final /* synthetic */ long val$pointerId;
        public final /* synthetic */ float val$x;
        public final /* synthetic */ float val$y;

        @Override // java.lang.Runnable
        public void run() {
            com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$44_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
        }

        public void com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$44__run$___twin___() {
            if (FilterManager.this.isValid()) {
                FilterManager.this.mEffect.processTouchEventWithTouchType(r2, r4, r5, r6, r7, r8, r9);
            }
        }

        public static void com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$44_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass44 anonymousClass44) {
            boolean LIZ;
            try {
                anonymousClass44.com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$44__run$___twin___();
            } finally {
                if (LIZ) {
                }
            }
        }

        public AnonymousClass44(long j, float f, float f2, float f3, float f4, int i, int i2) {
            r2 = j;
            r4 = f;
            r5 = f2;
            r6 = f3;
            r7 = f4;
            r8 = i;
            r9 = i2;
        }
    }

    /* renamed from: com.ss.ttlivestreamer.livestreamv2.filter.FilterManager$45 */
    /* loaded from: classes12.dex */
    public class AnonymousClass45 implements Runnable {
        public final /* synthetic */ float val$dx;
        public final /* synthetic */ float val$dy;
        public final /* synthetic */ float val$factor;
        public final /* synthetic */ float val$x;
        public final /* synthetic */ float val$y;

        @Override // java.lang.Runnable
        public void run() {
            com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$45_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
        }

        public void com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$45__run$___twin___() {
            if (FilterManager.this.isValid()) {
                FilterManager.this.mEffect.processPanEvent(r2, r3, r4, r5, r6);
            }
        }

        public static void com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$45_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass45 anonymousClass45) {
            boolean LIZ;
            try {
                anonymousClass45.com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$45__run$___twin___();
            } finally {
                if (LIZ) {
                }
            }
        }

        public AnonymousClass45(float f, float f2, float f3, float f4, float f5) {
            r2 = f;
            r3 = f2;
            r4 = f3;
            r5 = f4;
            r6 = f5;
        }
    }

    /* renamed from: com.ss.ttlivestreamer.livestreamv2.filter.FilterManager$46 */
    /* loaded from: classes12.dex */
    public class AnonymousClass46 implements Runnable {
        public final /* synthetic */ float val$x;
        public final /* synthetic */ float val$y;

        @Override // java.lang.Runnable
        public void run() {
            com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$46_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
        }

        public void com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$46__run$___twin___() {
            if (FilterManager.this.isValid()) {
                FilterManager.this.mEffect.processLongPressEvent(r2, r3);
            }
        }

        public static void com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$46_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass46 anonymousClass46) {
            boolean LIZ;
            try {
                anonymousClass46.com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$46__run$___twin___();
            } finally {
                if (LIZ) {
                }
            }
        }

        public AnonymousClass46(float f, float f2) {
            r2 = f;
            r3 = f2;
        }
    }

    /* renamed from: com.ss.ttlivestreamer.livestreamv2.filter.FilterManager$47 */
    /* loaded from: classes12.dex */
    public class AnonymousClass47 implements Runnable {
        public final /* synthetic */ float val$x;
        public final /* synthetic */ float val$y;

        @Override // java.lang.Runnable
        public void run() {
            com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$47_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
        }

        public void com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$47__run$___twin___() {
            if (FilterManager.this.isValid()) {
                FilterManager.this.mEffect.processDoubleClickEvent(r2, r3);
            }
        }

        public static void com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$47_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass47 anonymousClass47) {
            boolean LIZ;
            try {
                anonymousClass47.com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$47__run$___twin___();
            } finally {
                if (LIZ) {
                }
            }
        }

        public AnonymousClass47(float f, float f2) {
            r2 = f;
            r3 = f2;
        }
    }

    /* renamed from: com.ss.ttlivestreamer.livestreamv2.filter.FilterManager$48 */
    /* loaded from: classes12.dex */
    public class AnonymousClass48 implements Runnable {
        public final /* synthetic */ int val$type;
        public final /* synthetic */ float val$x;
        public final /* synthetic */ float val$y;

        @Override // java.lang.Runnable
        public void run() {
            com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$48_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
        }

        public void com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$48__run$___twin___() {
            if (FilterManager.this.isValid()) {
                FilterManager.this.mEffect.processTouchDownEvent(r2, r3, r4);
            }
        }

        public static void com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$48_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass48 anonymousClass48) {
            boolean LIZ;
            try {
                anonymousClass48.com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$48__run$___twin___();
            } finally {
                if (LIZ) {
                }
            }
        }

        public AnonymousClass48(float f, float f2, int i) {
            r2 = f;
            r3 = f2;
            r4 = i;
        }
    }

    /* renamed from: com.ss.ttlivestreamer.livestreamv2.filter.FilterManager$49 */
    /* loaded from: classes12.dex */
    public class AnonymousClass49 implements Runnable {
        public final /* synthetic */ int val$type;
        public final /* synthetic */ float val$x;
        public final /* synthetic */ float val$y;

        @Override // java.lang.Runnable
        public void run() {
            com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$49_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
        }

        public void com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$49__run$___twin___() {
            if (FilterManager.this.isValid()) {
                FilterManager.this.mEffect.processTouchUpEvent(r2, r3, r4);
            }
        }

        public static void com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$49_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass49 anonymousClass49) {
            boolean LIZ;
            try {
                anonymousClass49.com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$49__run$___twin___();
            } finally {
                if (LIZ) {
                }
            }
        }

        public AnonymousClass49(float f, float f2, int i) {
            r2 = f;
            r3 = f2;
            r4 = i;
        }
    }

    /* renamed from: com.ss.ttlivestreamer.livestreamv2.filter.FilterManager$5 */
    /* loaded from: classes12.dex */
    public class AnonymousClass5 implements Runnable {
        public final /* synthetic */ boolean val$isEdgeRender;
        public final /* synthetic */ AudioDeviceModule val$module;

        @Override // java.lang.Runnable
        public void run() {
            com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$5_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
        }

        public void com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$5__run$___twin___() {
            IInputAudioStream iInputAudioStream;
            FilterManager filterManager = FilterManager.this;
            if (filterManager.mEffect == null) {
                filterManager.mEffect = new EffectWrapper(r2, r3);
                if (!FilterManager.this.mEffect.valid()) {
                    FilterManager.this.mEffect.release();
                    FilterManager.this.mEffect = null;
                    return;
                }
                AudioDeviceModule.AudioRenderSink effectAudioRender = FilterManager.this.mEffect.getEffectAudioRender();
                if (effectAudioRender != null && (iInputAudioStream = FilterManager.this.mAudioStreamObserver) != null) {
                    effectAudioRender.setAudioTrack(iInputAudioStream.getAudioTrack());
                    effectAudioRender.setVolume(FilterManager.this.mEffectAudioVolume);
                    AudioMixer.AudioMixerDescription mixerDescription = FilterManager.this.mAudioStreamObserver.getMixerDescription();
                    FilterManager filterManager2 = FilterManager.this;
                    mixerDescription.volumeCoeff = filterManager2.mEffectAudioVolume;
                    filterManager2.mAudioStreamObserver.start();
                }
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("Using Effect info ");
                LIZ.append(FilterManager.this.mEffect.name());
                LIZ.append(" ");
                LIZ.append(FilterManager.this.mEffect.getEffectVersion());
                AVLog.iow("FilterManager", X1D.LIZIZ(LIZ));
            }
        }

        public static void com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$5_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass5 anonymousClass5) {
            boolean LIZ;
            try {
                anonymousClass5.com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$5__run$___twin___();
            } finally {
                if (LIZ) {
                }
            }
        }

        public AnonymousClass5(AudioDeviceModule audioDeviceModule, boolean z) {
            r2 = audioDeviceModule;
            r3 = z;
        }
    }

    /* renamed from: com.ss.ttlivestreamer.livestreamv2.filter.FilterManager$50 */
    /* loaded from: classes12.dex */
    public class AnonymousClass50 implements Runnable {
        public final /* synthetic */ float val$factor;
        public final /* synthetic */ float val$scale;

        @Override // java.lang.Runnable
        public void run() {
            com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$50_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
        }

        public void com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$50__run$___twin___() {
            if (FilterManager.this.isValid()) {
                FilterManager.this.mEffect.processScaleEvent(r2, r3);
            }
        }

        public static void com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$50_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass50 anonymousClass50) {
            boolean LIZ;
            try {
                anonymousClass50.com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$50__run$___twin___();
            } finally {
                if (LIZ) {
                }
            }
        }

        public AnonymousClass50(float f, float f2) {
            r2 = f;
            r3 = f2;
        }
    }

    /* renamed from: com.ss.ttlivestreamer.livestreamv2.filter.FilterManager$51 */
    /* loaded from: classes12.dex */
    public class AnonymousClass51 implements Runnable {
        public final /* synthetic */ float val$factor;
        public final /* synthetic */ float val$rotation;

        @Override // java.lang.Runnable
        public void run() {
            com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$51_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
        }

        public void com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$51__run$___twin___() {
            if (FilterManager.this.isValid()) {
                FilterManager.this.mEffect.processRotationEvent(r2, r3);
            }
        }

        public static void com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$51_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass51 anonymousClass51) {
            boolean LIZ;
            try {
                anonymousClass51.com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$51__run$___twin___();
            } finally {
                if (LIZ) {
                }
            }
        }

        public AnonymousClass51(float f, float f2) {
            r2 = f;
            r3 = f2;
        }
    }

    /* renamed from: com.ss.ttlivestreamer.livestreamv2.filter.FilterManager$52 */
    /* loaded from: classes12.dex */
    public class AnonymousClass52 implements Runnable {
        public final /* synthetic */ String val$callInfo;

        @Override // java.lang.Runnable
        public void run() {
            com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$52_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
        }

        public void com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$52__run$___twin___() {
            int pauseEffect;
            if (FilterManager.this.isValid() && (pauseEffect = FilterManager.this.mEffect.pauseEffect()) != 0) {
                FilterManager.this.mErrorListener.onError(pauseEffect, r2);
            }
        }

        public static void com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$52_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass52 anonymousClass52) {
            boolean LIZ;
            try {
                anonymousClass52.com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$52__run$___twin___();
            } finally {
                if (LIZ) {
                }
            }
        }

        public AnonymousClass52(String str) {
            r2 = str;
        }
    }

    /* renamed from: com.ss.ttlivestreamer.livestreamv2.filter.FilterManager$53 */
    /* loaded from: classes12.dex */
    public class AnonymousClass53 implements Runnable {
        public final /* synthetic */ String val$callInfo;

        @Override // java.lang.Runnable
        public void run() {
            com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$53_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
        }

        public void com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$53__run$___twin___() {
            int resumeEffect;
            if (FilterManager.this.isValid() && (resumeEffect = FilterManager.this.mEffect.resumeEffect()) != 0) {
                FilterManager.this.mErrorListener.onError(resumeEffect, r2);
            }
        }

        public static void com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$53_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass53 anonymousClass53) {
            boolean LIZ;
            try {
                anonymousClass53.com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$53__run$___twin___();
            } finally {
                if (LIZ) {
                }
            }
        }

        public AnonymousClass53(String str) {
            r2 = str;
        }
    }

    /* renamed from: com.ss.ttlivestreamer.livestreamv2.filter.FilterManager$54 */
    /* loaded from: classes12.dex */
    public class AnonymousClass54 implements Runnable {
        public final /* synthetic */ int val$arg1;
        public final /* synthetic */ int val$arg2;
        public final /* synthetic */ String val$arg3;
        public final /* synthetic */ String val$callInfo;
        public final /* synthetic */ int val$msgType;

        @Override // java.lang.Runnable
        public void run() {
            com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$54_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
        }

        public void com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$54__run$___twin___() {
            int sendEffectMsg;
            if (FilterManager.this.isValid() && (sendEffectMsg = FilterManager.this.mEffect.sendEffectMsg(r2, r3, r4, r5)) != 0) {
                FilterManager.this.mErrorListener.onError(sendEffectMsg, r6);
            }
        }

        public static void com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$54_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass54 anonymousClass54) {
            boolean LIZ;
            try {
                anonymousClass54.com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$54__run$___twin___();
            } finally {
                if (LIZ) {
                }
            }
        }

        public AnonymousClass54(int i, int i2, int i3, String str, String str2) {
            r2 = i;
            r3 = i2;
            r4 = i3;
            r5 = str;
            r6 = str2;
        }
    }

    /* renamed from: com.ss.ttlivestreamer.livestreamv2.filter.FilterManager$55 */
    /* loaded from: classes12.dex */
    public class AnonymousClass55 implements Runnable {
        public final /* synthetic */ IFilterManager.EffectMsgListener val$listener;

        @Override // java.lang.Runnable
        public void run() {
            com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$55_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
        }

        public void com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$55__run$___twin___() {
            IVideoEffectProcessor iVideoEffectProcessor = FilterManager.this.mEffect;
            if (iVideoEffectProcessor != null) {
                iVideoEffectProcessor.setEffectMsgListener(r2);
            }
        }

        public static void com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$55_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass55 anonymousClass55) {
            boolean LIZ;
            try {
                anonymousClass55.com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$55__run$___twin___();
            } finally {
                if (LIZ) {
                }
            }
        }

        public AnonymousClass55(IFilterManager.EffectMsgListener effectMsgListener) {
            r2 = effectMsgListener;
        }
    }

    /* renamed from: com.ss.ttlivestreamer.livestreamv2.filter.FilterManager$56 */
    /* loaded from: classes12.dex */
    public class AnonymousClass56 implements Runnable {
        public final /* synthetic */ IFilterManager.FaceDetectListener val$listener;

        @Override // java.lang.Runnable
        public void run() {
            com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$56_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
        }

        public void com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$56__run$___twin___() {
            IVideoEffectProcessor iVideoEffectProcessor = FilterManager.this.mEffect;
            if (iVideoEffectProcessor != null) {
                iVideoEffectProcessor.setFaceDetectListener(r2);
            }
        }

        public static void com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$56_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass56 anonymousClass56) {
            boolean LIZ;
            try {
                anonymousClass56.com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$56__run$___twin___();
            } finally {
                if (LIZ) {
                }
            }
        }

        public AnonymousClass56(IFilterManager.FaceDetectListener faceDetectListener) {
            r2 = faceDetectListener;
        }
    }

    /* renamed from: com.ss.ttlivestreamer.livestreamv2.filter.FilterManager$57 */
    /* loaded from: classes12.dex */
    public class AnonymousClass57 implements Runnable {
        public final /* synthetic */ boolean val$enableAgeDetect;
        public final /* synthetic */ boolean val$enableAttractivenessDetect;
        public final /* synthetic */ boolean val$enableEmotionDetect;
        public final /* synthetic */ boolean val$enableGenderDetect;
        public final /* synthetic */ boolean val$enableHappinessDetect;
        public final /* synthetic */ boolean val$enableRenZhongDetect;

        @Override // java.lang.Runnable
        public void run() {
            com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$57_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
        }

        public void com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$57__run$___twin___() {
            IVideoEffectProcessor iVideoEffectProcessor = FilterManager.this.mEffect;
            if (iVideoEffectProcessor != null) {
                iVideoEffectProcessor.enableExpressionDetect(r2, r3, r4, r5, r6, r7);
            }
        }

        public static void com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$57_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass57 anonymousClass57) {
            boolean LIZ;
            try {
                anonymousClass57.com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$57__run$___twin___();
            } finally {
                if (LIZ) {
                }
            }
        }

        public AnonymousClass57(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
            r2 = z;
            r3 = z2;
            r4 = z3;
            r5 = z4;
            r6 = z5;
            r7 = z6;
        }
    }

    /* renamed from: com.ss.ttlivestreamer.livestreamv2.filter.FilterManager$58 */
    /* loaded from: classes12.dex */
    public class AnonymousClass58 implements Runnable {
        public final /* synthetic */ IFilterManager.ExpressionDetectListener val$listener;

        @Override // java.lang.Runnable
        public void run() {
            com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$58_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
        }

        public void com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$58__run$___twin___() {
            IVideoEffectProcessor iVideoEffectProcessor = FilterManager.this.mEffect;
            if (iVideoEffectProcessor != null) {
                iVideoEffectProcessor.setExpressionDetectListener(r2);
            }
        }

        public static void com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$58_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass58 anonymousClass58) {
            boolean LIZ;
            try {
                anonymousClass58.com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$58__run$___twin___();
            } finally {
                if (LIZ) {
                }
            }
        }

        public AnonymousClass58(IFilterManager.ExpressionDetectListener expressionDetectListener) {
            r2 = expressionDetectListener;
        }
    }

    /* renamed from: com.ss.ttlivestreamer.livestreamv2.filter.FilterManager$59 */
    /* loaded from: classes12.dex */
    public class AnonymousClass59 implements Runnable {
        public final /* synthetic */ IFilterManager.MicrophoneDetectListener val$listener;

        @Override // java.lang.Runnable
        public void run() {
            com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$59_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
        }

        public void com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$59__run$___twin___() {
            IVideoEffectProcessor iVideoEffectProcessor = FilterManager.this.mEffect;
            if (iVideoEffectProcessor != null) {
                iVideoEffectProcessor.setMicrophoneDetectListener(r2);
            }
        }

        public static void com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$59_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass59 anonymousClass59) {
            boolean LIZ;
            try {
                anonymousClass59.com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$59__run$___twin___();
            } finally {
                if (LIZ) {
                }
            }
        }

        public AnonymousClass59(IFilterManager.MicrophoneDetectListener microphoneDetectListener) {
            r2 = microphoneDetectListener;
        }
    }

    /* renamed from: com.ss.ttlivestreamer.livestreamv2.filter.FilterManager$6 */
    /* loaded from: classes12.dex */
    public class AnonymousClass6 implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$6_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
        }

        public void com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$6__run$___twin___() {
            FilterManager.this.stopCatchTask(-100, "Video catching is interrupted.");
            IVideoEffectProcessor iVideoEffectProcessor = FilterManager.this.mEffect;
            if (iVideoEffectProcessor != null) {
                iVideoEffectProcessor.release();
                FilterManager.this.mEffect.setEffectMsgListener(null);
                FilterManager filterManager = FilterManager.this;
                filterManager.mEffect = null;
                IVideoEffectProcessor.EffectMsgListener effectMsgListener = filterManager.mMsgListener;
                if (effectMsgListener != null) {
                    effectMsgListener.onMessageReceived(2139095042, 0, 0, null);
                }
            }
            FilterManager filterManager2 = FilterManager.this;
            filterManager2.mMsgListener = null;
            filterManager2.mErrorListener = new IFilterManager.ErrorListener() { // from class: X.P3A
                @Override // com.ss.ttlivestreamer.livestreamv2.filter.IFilterManager.ErrorListener
                public final void onError(int i, String str) {
                    FilterManager.AnonymousClass6.lambda$run$0(i, str);
                }
            };
            GlRenderDrawer glRenderDrawer = filterManager2.mOffscreenDraw;
            if (glRenderDrawer != null) {
                glRenderDrawer.release();
                FilterManager.this.mOffscreenDraw = null;
            }
            FilterVideoBufferPool filterVideoBufferPool = FilterManager.this.mBufferPool;
            if (filterVideoBufferPool != null) {
                FilterVideoBufferPool.Recycle pop = filterVideoBufferPool.pop();
                while (pop != null) {
                    if (pop.getRefCounts() != 0) {
                        StringBuilder LIZ = X1D.LIZ();
                        LIZ.append("Texture buffer(");
                        LIZ.append(pop.toString());
                        LIZ.append(") not release");
                        AVLog.e("FilterManager", X1D.LIZIZ(LIZ));
                    }
                    GlTextureFrameBuffer buffer = pop.getBuffer();
                    pop.release();
                    buffer.release();
                    if (pop.getExtraData() != null) {
                        pop.getExtraData().releaseExtraData(pop.getExtraData());
                    }
                    pop = FilterManager.this.mBufferPool.pop();
                }
            }
            int[] iArr = FilterManager.this.mYuvTexs;
            if (iArr != null) {
                GLES20.glDeleteTextures(iArr.length, iArr, 0);
                FilterManager.this.mYuvTexs = null;
            }
            FilterManager.this.releaseRawVideoDumpers();
            BmfBrightenFilter bmfBrightenFilter = FilterManager.this.mBrightenFilter;
            if (bmfBrightenFilter != null) {
                bmfBrightenFilter.release();
                FilterManager.this.mBrightenFilter = null;
            }
            BmfNoiseEvaluateFilter bmfNoiseEvaluateFilter = FilterManager.this.mNoiseEvaluateFilter;
            if (bmfNoiseEvaluateFilter != null) {
                bmfNoiseEvaluateFilter.release();
                FilterManager.this.mNoiseEvaluateFilter = null;
            }
            BmfVQScoreFilter bmfVQScoreFilter = FilterManager.this.mVQScoreFilter;
            if (bmfVQScoreFilter != null) {
                bmfVQScoreFilter.release();
                FilterManager.this.mVQScoreFilter = null;
            }
            BmfColorHistFilter bmfColorHistFilter = FilterManager.this.mColorHistFilter;
            if (bmfColorHistFilter != null) {
                bmfColorHistFilter.release();
                FilterManager.this.mColorHistFilter = null;
            }
            BmfVideoDenoiseFilter bmfVideoDenoiseFilter = FilterManager.this.mVideoDenoiseFilter;
            if (bmfVideoDenoiseFilter != null) {
                bmfVideoDenoiseFilter.release();
                FilterManager.this.mVideoDenoiseFilter = null;
            }
        }

        public AnonymousClass6() {
        }

        public static void com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$6_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass6 anonymousClass6) {
            boolean LIZ;
            try {
                anonymousClass6.com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$6__run$___twin___();
            } finally {
                if (LIZ) {
                }
            }
        }

        public static /* synthetic */ void lambda$run$0(int i, String str) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Effect api return error: ");
            LIZ.append(i);
            LIZ.append(". Calling info: ");
            LIZ.append(str);
            AVLog.ioe("FilterManager", X1D.LIZIZ(LIZ));
        }
    }

    /* renamed from: com.ss.ttlivestreamer.livestreamv2.filter.FilterManager$60 */
    /* loaded from: classes12.dex */
    public class AnonymousClass60 implements Runnable {
        public final /* synthetic */ String val$finalFilePath;

        @Override // java.lang.Runnable
        public void run() {
            com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$60_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
        }

        public void com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$60__run$___twin___() {
            IVideoEffectProcessor iVideoEffectProcessor = FilterManager.this.mEffect;
            if (iVideoEffectProcessor != null) {
                iVideoEffectProcessor.setMusicNodeFilePath(r2);
            }
        }

        public static void com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$60_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass60 anonymousClass60) {
            boolean LIZ;
            try {
                anonymousClass60.com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$60__run$___twin___();
            } finally {
                if (LIZ) {
                }
            }
        }

        public AnonymousClass60(String str) {
            r2 = str;
        }
    }

    /* renamed from: com.ss.ttlivestreamer.livestreamv2.filter.FilterManager$61 */
    /* loaded from: classes12.dex */
    public class AnonymousClass61 implements Runnable {
        public final /* synthetic */ String val$callInfo;
        public final /* synthetic */ JSONObject val$json;
        public final /* synthetic */ String val$license;

        @Override // java.lang.Runnable
        public void run() {
            com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$61_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
        }

        public void com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$61__run$___twin___() {
            int effectABInfo;
            if (FilterManager.this.isValid() && (effectABInfo = FilterManager.this.mEffect.setEffectABInfo(r2, r3)) != 0) {
                FilterManager.this.mErrorListener.onError(effectABInfo, r4);
            }
        }

        public static void com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$61_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass61 anonymousClass61) {
            boolean LIZ;
            try {
                anonymousClass61.com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$61__run$___twin___();
            } finally {
                if (LIZ) {
                }
            }
        }

        public AnonymousClass61(JSONObject jSONObject, String str, String str2) {
            r2 = jSONObject;
            r3 = str;
            r4 = str2;
        }
    }

    /* renamed from: com.ss.ttlivestreamer.livestreamv2.filter.FilterManager$62 */
    /* loaded from: classes12.dex */
    public class AnonymousClass62 implements Runnable {
        public final /* synthetic */ String val$callInfo;
        public final /* synthetic */ String val$license;

        @Override // java.lang.Runnable
        public void run() {
            com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$62_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
        }

        public void com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$62__run$___twin___() {
            int effectLicense;
            if (FilterManager.this.isValid() && (effectLicense = FilterManager.this.mEffect.setEffectLicense(r2)) != 0) {
                FilterManager.this.mErrorListener.onError(effectLicense, r3);
            }
        }

        public static void com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$62_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass62 anonymousClass62) {
            boolean LIZ;
            try {
                anonymousClass62.com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$62__run$___twin___();
            } finally {
                if (LIZ) {
                }
            }
        }

        public AnonymousClass62(String str, String str2) {
            r2 = str;
            r3 = str2;
        }
    }

    /* renamed from: com.ss.ttlivestreamer.livestreamv2.filter.FilterManager$63 */
    /* loaded from: classes12.dex */
    public class AnonymousClass63 implements Runnable {
        public final /* synthetic */ String val$license;

        @Override // java.lang.Runnable
        public void run() {
            com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$63_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
        }

        public void com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$63__run$___twin___() {
            if (FilterManager.this.isValid()) {
                FilterManager.this.mEffect.insertEffectLicense(r2);
            }
        }

        public static void com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$63_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass63 anonymousClass63) {
            boolean LIZ;
            try {
                anonymousClass63.com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$63__run$___twin___();
            } finally {
                if (LIZ) {
                }
            }
        }

        public AnonymousClass63(String str) {
            r2 = str;
        }
    }

    /* renamed from: com.ss.ttlivestreamer.livestreamv2.filter.FilterManager$64 */
    /* loaded from: classes12.dex */
    public class AnonymousClass64 implements Runnable {
        public final /* synthetic */ String val$cArg3;
        public final /* synthetic */ String val$callInfo;
        public final /* synthetic */ String val$input_text;
        public final /* synthetic */ int val$nArg1;
        public final /* synthetic */ int val$nArg2;

        @Override // java.lang.Runnable
        public void run() {
            com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$64_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
        }

        public void com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$64__run$___twin___() {
            int inputText;
            if (FilterManager.this.isValid() && (inputText = FilterManager.this.mEffect.setInputText(r2, r3, r4, r5)) != 0) {
                FilterManager.this.mErrorListener.onError(inputText, r6);
            }
        }

        public static void com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$64_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass64 anonymousClass64) {
            boolean LIZ;
            try {
                anonymousClass64.com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$64__run$___twin___();
            } finally {
                if (LIZ) {
                }
            }
        }

        public AnonymousClass64(String str, int i, int i2, String str2, String str3) {
            r2 = str;
            r3 = i;
            r4 = i2;
            r5 = str2;
            r6 = str3;
        }
    }

    /* renamed from: com.ss.ttlivestreamer.livestreamv2.filter.FilterManager$65 */
    /* loaded from: classes12.dex */
    public class AnonymousClass65 implements Runnable {
        public final /* synthetic */ String val$callInfo;
        public final /* synthetic */ boolean val$finished;

        @Override // java.lang.Runnable
        public void run() {
            com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$65_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
        }

        public void com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$65__run$___twin___() {
            int notifyKeyboardHide;
            if (FilterManager.this.isValid() && (notifyKeyboardHide = FilterManager.this.mEffect.notifyKeyboardHide(r2)) != 0) {
                FilterManager.this.mErrorListener.onError(notifyKeyboardHide, r3);
            }
        }

        public static void com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$65_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass65 anonymousClass65) {
            boolean LIZ;
            try {
                anonymousClass65.com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$65__run$___twin___();
            } finally {
                if (LIZ) {
                }
            }
        }

        public AnonymousClass65(boolean z, String str) {
            r2 = z;
            r3 = str;
        }
    }

    /* renamed from: com.ss.ttlivestreamer.livestreamv2.filter.FilterManager$66 */
    /* loaded from: classes12.dex */
    public class AnonymousClass66 implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$66_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
        }

        public void com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$66__run$___twin___() {
            int resetFrameCostStatistics;
            if (FilterManager.this.isValid() && (resetFrameCostStatistics = FilterManager.this.mEffect.resetFrameCostStatistics()) != 0) {
                FilterManager.this.mErrorListener.onError(resetFrameCostStatistics, null);
            }
        }

        public AnonymousClass66() {
        }

        public static void com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$66_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass66 anonymousClass66) {
            boolean LIZ;
            try {
                anonymousClass66.com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$66__run$___twin___();
            } finally {
                if (LIZ) {
                }
            }
        }
    }

    /* renamed from: com.ss.ttlivestreamer.livestreamv2.filter.FilterManager$67 */
    /* loaded from: classes12.dex */
    public class AnonymousClass67 implements Runnable {
        public final /* synthetic */ String[] val$ret;

        @Override // java.lang.Runnable
        public void run() {
            com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$67_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
        }

        public void com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$67__run$___twin___() {
            if (FilterManager.this.isValid()) {
                r2[0] = FilterManager.this.mEffect.getFrameCostStatistics();
            }
        }

        public static void com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$67_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass67 anonymousClass67) {
            boolean LIZ;
            try {
                anonymousClass67.com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$67__run$___twin___();
            } finally {
                if (LIZ) {
                }
            }
        }

        public AnonymousClass67(String[] strArr) {
            r2 = strArr;
        }
    }

    /* renamed from: com.ss.ttlivestreamer.livestreamv2.filter.FilterManager$68 */
    /* loaded from: classes12.dex */
    public class AnonymousClass68 implements Runnable {
        public final /* synthetic */ String[] val$ret;

        @Override // java.lang.Runnable
        public void run() {
            com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$68_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
        }

        public void com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$68__run$___twin___() {
            if (FilterManager.this.isValid()) {
                r2[0] = FilterManager.this.mEffect.getFrameProgressParams();
            }
        }

        public static void com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$68_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass68 anonymousClass68) {
            boolean LIZ;
            try {
                anonymousClass68.com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$68__run$___twin___();
            } finally {
                if (LIZ) {
                }
            }
        }

        public AnonymousClass68(String[] strArr) {
            r2 = strArr;
        }
    }

    /* renamed from: com.ss.ttlivestreamer.livestreamv2.filter.FilterManager$69 */
    /* loaded from: classes12.dex */
    public class AnonymousClass69 implements Runnable {
        public final /* synthetic */ ILiveStream.CatchPicCallback val$callback;
        public final /* synthetic */ Bundle val$param;

        @Override // java.lang.Runnable
        public void run() {
            com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$69_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
        }

        public void com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$69__run$___twin___() {
            int i = r2.getInt("width");
            int i2 = r2.getInt("height");
            boolean z = r2.getBoolean("outputPixelBufferOrigin");
            boolean z2 = r2.getBoolean("outputPixelBufferWithEffect");
            FilterManager.this.mKeepVideoCatcherAlive = r2.getBoolean("keepVideoCatcherAlive");
            FilterManager filterManager = FilterManager.this;
            filterManager.mPicCallback = r3;
            if (z) {
                if (filterManager.mOriginFrameCatcher == null) {
                    filterManager.mOriginFrameCatcher = new VideoCatcher();
                    FilterManager filterManager2 = FilterManager.this;
                    filterManager2.mOriginFrameCatcher.start(i, i2, filterManager2, filterManager2.mHandler);
                }
            } else {
                VideoCatcher videoCatcher = filterManager.mOriginFrameCatcher;
                if (videoCatcher != null) {
                    videoCatcher.stop(0);
                    FilterManager.this.mOriginFrameCatcher = null;
                }
            }
            if (z2) {
                FilterManager filterManager3 = FilterManager.this;
                if (filterManager3.mEffectFrameCatcher == null) {
                    filterManager3.mEffectFrameCatcher = new VideoCatcher();
                    FilterManager filterManager4 = FilterManager.this;
                    filterManager4.mEffectFrameCatcher.start(i, i2, filterManager4, filterManager4.mHandler);
                }
            } else {
                VideoCatcher videoCatcher2 = FilterManager.this.mEffectFrameCatcher;
                if (videoCatcher2 != null) {
                    videoCatcher2.stop(0);
                    FilterManager.this.mEffectFrameCatcher = null;
                }
            }
            if (z || z2) {
                FilterManager.this.mCatchVideoFrameCount = r2.getInt("frameCount");
                FilterManager.this.mCatchVideoFrameInterval = (int) (r2.getFloat("interval") * 1000.0f);
            }
        }

        public static void com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$69_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass69 anonymousClass69) {
            boolean LIZ;
            try {
                anonymousClass69.com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$69__run$___twin___();
            } finally {
                if (LIZ) {
                }
            }
        }

        public AnonymousClass69(Bundle bundle, ILiveStream.CatchPicCallback catchPicCallback) {
            r2 = bundle;
            r3 = catchPicCallback;
        }
    }

    /* renamed from: com.ss.ttlivestreamer.livestreamv2.filter.FilterManager$70 */
    /* loaded from: classes12.dex */
    public class AnonymousClass70 implements Runnable {
        public final /* synthetic */ ILiveStream.CatchMediaDataCallback val$callback;
        public final /* synthetic */ Bundle val$param;
        public final /* synthetic */ WeakReference val$weakFactory;

        @Override // java.lang.Runnable
        public void run() {
            com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$70_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
        }

        public void com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$70__run$___twin___() {
            FilterManager filterManager = FilterManager.this;
            if (filterManager.mOriginFrameCatcher != null || filterManager.mEffectFrameCatcher != null) {
                ILiveStream.CatchMediaDataCallback catchMediaDataCallback = r2;
                if (catchMediaDataCallback != null) {
                    catchMediaDataCallback.onError(-2, "Already started a catching task");
                    return;
                }
                return;
            }
            MediaEngineFactory mediaEngineFactory = (MediaEngineFactory) r3.get();
            int i = r4.getInt("mode", -1);
            int i2 = r4.getInt("width");
            int i3 = r4.getInt("height");
            int i4 = r4.getInt("fps");
            boolean z = r4.getBoolean("hardwareEncode", true);
            String string = r4.getString("outputPathOrigin");
            String string2 = r4.getString("outputPathWithEffect");
            FilterManager.this.mCatchVideoFrameCount = r4.getInt("frameCount");
            if (i == 0 && r4.containsKey("duration")) {
                FilterManager.this.mCatchVideoFrameCount = (int) (r4.getFloat("duration") * i4);
            }
            FilterManager.this.mCatchVideoFrameInterval = (int) (r4.getFloat("interval") * 1000.0f);
            FilterManager.this.mCatchVideoCallback = r2;
            new ILiveStream.CatchMediaDataCallback() { // from class: com.ss.ttlivestreamer.livestreamv2.filter.FilterManager.70.1
                @Override // com.ss.ttlivestreamer.livestreamv2.ILiveStream.CatchMediaDataCallback
                public void onComplete() {
                }

                @Override // com.ss.ttlivestreamer.livestreamv2.ILiveStream.CatchMediaDataCallback
                public final /* synthetic */ void onCompleteOnce(String str, long j, long j2, int i5, int i6, int i7) {
                    C30533Byb.LIZ(this, str, j, j2, i5, i6, i7);
                }

                public AnonymousClass1() {
                }

                @Override // com.ss.ttlivestreamer.livestreamv2.ILiveStream.CatchMediaDataCallback
                public void onError(int i5, String str) {
                    FilterManager.this.onCatchError(i5, str);
                }
            };
            if (!TextUtils.isEmpty(string)) {
                FilterManager.this.mOriginFrameCatcher = new VideoCatcher();
                FilterManager filterManager2 = FilterManager.this;
                filterManager2.mOriginFrameCatcher.start(i, i2, i3, i4, z, string, filterManager2, mediaEngineFactory, filterManager2.mHandler);
            }
            if (!TextUtils.isEmpty(string2)) {
                FilterManager.this.mEffectFrameCatcher = new VideoCatcher();
                FilterManager filterManager3 = FilterManager.this;
                filterManager3.mEffectFrameCatcher.start(i, i2, i3, i4, z, string2, filterManager3, mediaEngineFactory, filterManager3.mHandler);
            }
        }

        /* renamed from: com.ss.ttlivestreamer.livestreamv2.filter.FilterManager$70$1 */
        /* loaded from: classes12.dex */
        public class AnonymousClass1 implements ILiveStream.CatchMediaDataCallback {
            @Override // com.ss.ttlivestreamer.livestreamv2.ILiveStream.CatchMediaDataCallback
            public void onComplete() {
            }

            @Override // com.ss.ttlivestreamer.livestreamv2.ILiveStream.CatchMediaDataCallback
            public final /* synthetic */ void onCompleteOnce(String str, long j, long j2, int i5, int i6, int i7) {
                C30533Byb.LIZ(this, str, j, j2, i5, i6, i7);
            }

            public AnonymousClass1() {
            }

            @Override // com.ss.ttlivestreamer.livestreamv2.ILiveStream.CatchMediaDataCallback
            public void onError(int i5, String str) {
                FilterManager.this.onCatchError(i5, str);
            }
        }

        public static void com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$70_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass70 anonymousClass70) {
            boolean LIZ;
            try {
                anonymousClass70.com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$70__run$___twin___();
            } finally {
                if (LIZ) {
                }
            }
        }

        public AnonymousClass70(ILiveStream.CatchMediaDataCallback catchMediaDataCallback, WeakReference weakReference, Bundle bundle) {
            r2 = catchMediaDataCallback;
            r3 = weakReference;
            r4 = bundle;
        }
    }

    /* renamed from: com.ss.ttlivestreamer.livestreamv2.filter.FilterManager$71 */
    /* loaded from: classes12.dex */
    public class AnonymousClass71 implements Runnable {
        public final /* synthetic */ int val$code;
        public final /* synthetic */ String val$msg;

        @Override // java.lang.Runnable
        public void run() {
            com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$71_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
        }

        public void com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$71__run$___twin___() {
            FilterManager.this.stopCatchTask(r2, r3);
        }

        public static void com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$71_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass71 anonymousClass71) {
            boolean LIZ;
            try {
                anonymousClass71.com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$71__run$___twin___();
            } finally {
                if (LIZ) {
                }
            }
        }

        public AnonymousClass71(int i, String str) {
            r2 = i;
            r3 = str;
        }
    }

    /* renamed from: com.ss.ttlivestreamer.livestreamv2.filter.FilterManager$72 */
    /* loaded from: classes12.dex */
    public class AnonymousClass72 implements Runnable {
        public final /* synthetic */ FilterVideoBufferPool.Recycle val$finalIncomeRecycle;
        public final /* synthetic */ VideoFrame val$frame;
        public final /* synthetic */ VideoFrame[] val$frame1;

        @Override // java.lang.Runnable
        public void run() {
            com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$72_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
        }

        public void com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$72__run$___twin___() {
            FilterManager filterManager = FilterManager.this;
            int i = filterManager.mProcessType;
            if (i == 3) {
                filterManager.mTextureFrameBufferRecycle = r2;
                r3[0] = filterManager.processInternalV3(r4);
            } else if (i == 2) {
                r3[0] = filterManager.processInternalV2(r4);
            } else {
                r3[0] = filterManager.processInternalV1(r4);
            }
            FilterVideoBufferPool.Recycle recycle = FilterManager.this.mTextureFrameBufferRecycle;
            if (recycle != null) {
                recycle.decRef();
                FilterManager.this.mTextureFrameBufferRecycle = null;
            }
            FilterVideoBufferPool.Recycle recycle2 = FilterManager.this.mOut2DTexRecycle;
            if (recycle2 != null) {
                recycle2.decRef();
                FilterManager.this.mOut2DTexRecycle = null;
            }
        }

        public static void com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$72_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass72 anonymousClass72) {
            boolean LIZ;
            try {
                anonymousClass72.com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$72__run$___twin___();
            } finally {
                if (LIZ) {
                }
            }
        }

        public AnonymousClass72(FilterVideoBufferPool.Recycle recycle, VideoFrame[] videoFrameArr, VideoFrame videoFrame) {
            r2 = recycle;
            r3 = videoFrameArr;
            r4 = videoFrame;
        }
    }

    /* renamed from: com.ss.ttlivestreamer.livestreamv2.filter.FilterManager$73 */
    /* loaded from: classes12.dex */
    public class AnonymousClass73 implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$73_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
        }

        public void com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$73__run$___twin___() {
            FilterManager.this.stopCatchTask(0, null);
        }

        public AnonymousClass73() {
        }

        public static void com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$73_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass73 anonymousClass73) {
            boolean LIZ;
            try {
                anonymousClass73.com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$73__run$___twin___();
            } finally {
                if (LIZ) {
                }
            }
        }
    }

    /* renamed from: com.ss.ttlivestreamer.livestreamv2.filter.FilterManager$8 */
    /* loaded from: classes12.dex */
    public class AnonymousClass8 implements Runnable {
        public final /* synthetic */ AssetManager val$assetMgr;
        public final /* synthetic */ String val$deviceName;
        public final /* synthetic */ int val$height;
        public final /* synthetic */ boolean val$isUseTTDetect;
        public final /* synthetic */ String val$modelPath;
        public final /* synthetic */ String val$platformConfig;
        public final /* synthetic */ Object val$resourceFinder;
        public final /* synthetic */ boolean val$useNewEngine;
        public final /* synthetic */ int val$width;

        @Override // java.lang.Runnable
        public void run() {
            com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$8_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
        }

        public void com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$8__run$___twin___() {
            if (FilterManager.this.isValid()) {
                Object obj = r2;
                if (obj != null) {
                    FilterManager.this.mEffect.setResourceFinder(obj);
                }
                AssetManager assetManager = r3;
                if (assetManager != null) {
                    FilterManager.this.mEffect.setAssetManager(assetManager);
                }
                FilterManager.this.mEffect.configEffect(r4, r5, r6, r7, r8, r9, r10);
                IVideoEffectProcessor.EffectMsgListener effectMsgListener = FilterManager.this.mMsgListener;
                if (effectMsgListener != null) {
                    effectMsgListener.onMessageReceived(2139095041, 0, 0, null);
                }
            }
        }

        public static void com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$8_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass8 anonymousClass8) {
            boolean LIZ;
            try {
                anonymousClass8.com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$8__run$___twin___();
            } finally {
                if (LIZ) {
                }
            }
        }

        public AnonymousClass8(Object obj, AssetManager assetManager, int i, int i2, String str, String str2, boolean z, boolean z2, String str3) {
            r2 = obj;
            r3 = assetManager;
            r4 = i;
            r5 = i2;
            r6 = str;
            r7 = str2;
            r8 = z;
            r9 = z2;
            r10 = str3;
        }
    }

    /* renamed from: com.ss.ttlivestreamer.livestreamv2.filter.FilterManager$9 */
    /* loaded from: classes12.dex */
    public class AnonymousClass9 implements Runnable {
        public final /* synthetic */ boolean val$ABSwitch;

        @Override // java.lang.Runnable
        public void run() {
            com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$9_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
        }

        public void com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$9__run$___twin___() {
            if (FilterManager.this.isValid()) {
                FilterManager.this.mEffect.setAlgorithmAB(r2);
            }
        }

        public static void com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$9_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass9 anonymousClass9) {
            boolean LIZ;
            try {
                anonymousClass9.com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$9__run$___twin___();
            } finally {
                if (LIZ) {
                }
            }
        }

        public AnonymousClass9(boolean z) {
            r2 = z;
        }
    }

    public static /* synthetic */ void LJIIIIZZ(FilterVideoBufferPool.Recycle recycle) {
        recycle.run();
    }

    public static /* synthetic */ void LJIILLIIL(FilterManager filterManager) {
        filterManager.lambda$releaseContetDetector$2();
    }

    private void checkIfNeedCatch() {
        this.mShouldCatch = false;
        if (this.mCatchVideoFrameCount > 0) {
            if (this.mOriginFrameCatcher != null || this.mEffectFrameCatcher != null) {
                long currentTimeMillis = System.currentTimeMillis();
                if (currentTimeMillis - this.mLastCatchTimestamp > this.mCatchVideoFrameInterval) {
                    this.mShouldCatch = true;
                    this.mLastCatchTimestamp = currentTimeMillis;
                }
            }
        }
    }

    private void dumpOriginFrame(VideoFrame.Buffer buffer) {
    }

    private void onVideoDumpTextureFrame(VideoDumpProxy.RawVideoDumperProxy rawVideoDumperProxy, int i, boolean z, int i2, int i3, int i4, float[] fArr, String str) {
    }

    private void showRoiRegion(RoiInfo roiInfo, int i, int i2) {
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.filter.IFilterManager
    public int getFaceCount() {
        int[] iArr = {-1};
        ThreadUtils.invokeAtFrontUninterruptibly(this.mHandler, new Runnable() { // from class: com.ss.ttlivestreamer.livestreamv2.filter.FilterManager.39
            public final /* synthetic */ int[] val$ret;

            @Override // java.lang.Runnable
            public void run() {
                com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$39_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public void com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$39__run$___twin___() {
                r2[0] = FilterManager.this.mEffect.getFaceCount();
            }

            public static void com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$39_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass39 anonymousClass39) {
                boolean LIZ;
                try {
                    anonymousClass39.com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$39__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }

            public AnonymousClass39(int[] iArr2) {
                r2 = iArr2;
            }
        });
        return iArr2[0];
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.filter.IFilterManager
    public int pauseEffect() {
        this.mHandler.post(new Runnable() { // from class: com.ss.ttlivestreamer.livestreamv2.filter.FilterManager.52
            public final /* synthetic */ String val$callInfo;

            @Override // java.lang.Runnable
            public void run() {
                com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$52_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public void com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$52__run$___twin___() {
                int pauseEffect;
                if (FilterManager.this.isValid() && (pauseEffect = FilterManager.this.mEffect.pauseEffect()) != 0) {
                    FilterManager.this.mErrorListener.onError(pauseEffect, r2);
                }
            }

            public static void com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$52_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass52 anonymousClass52) {
                boolean LIZ;
                try {
                    anonymousClass52.com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$52__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }

            public AnonymousClass52(String str) {
                r2 = str;
            }
        });
        return 0;
    }

    @Override // com.ss.ttlivestreamer.core.engine.NativeObject
    public synchronized void release() {
        Handler handler;
        if (this.mReleased) {
            return;
        }
        if (this.mEnableFindContour) {
            enableFindContour(false, null);
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Release filterManager ");
        LIZ.append(this);
        AVLog.ioi("FilterManager", X1D.LIZIZ(LIZ));
        this.mReleased = true;
        stopEffectAudio();
        YuvConverter yuvConverter = this.mYuvConverter;
        this.mYuvConverter = null;
        if (yuvConverter != null && ((handler = this.mYuvConvertHandler) == null || this.mYuvConvertThread == null || !handler.post(new ARunnableS12S0101000_8(3, yuvConverter, 4)))) {
            AVLog.ioe("FilterManager", "YuvConverter mem leak!");
            AndroidRuntimeException androidRuntimeException = new AndroidRuntimeException("YuvConverter mem leak!");
            TTLSSladarBugReportUtils.getInstance().report(androidRuntimeException, "FilterManager.release");
            if (TTLSBuildConfig.canThrowException()) {
                throw androidRuntimeException;
            }
        }
        GLThread gLThread = this.mYuvConvertThread;
        if (gLThread != null) {
            SafeHandlerThreadPoolExecutor.unlockThread(gLThread);
            this.mYuvConvertThread = null;
        }
        this.mHandler.post(new AnonymousClass6());
        GLThread gLThread2 = this.mGLThread;
        if (gLThread2 != null) {
            SafeHandlerThreadPoolExecutor.unlockThread(gLThread2);
            this.mGLThread = null;
        } else {
            ThreadUtils.invokeAtFrontUninterruptibly(this.mHandler, new Runnable() { // from class: com.ss.ttlivestreamer.livestreamv2.filter.FilterManager.7
                public void com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$7__run$___twin___() {
                }

                @Override // java.lang.Runnable
                public void run() {
                    com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$7_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                }

                public AnonymousClass7() {
                }

                public static void com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$7_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass7 anonymousClass7) {
                    boolean LIZ2;
                    try {
                        anonymousClass7.com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$7__run$___twin___();
                    } finally {
                        if (LIZ2) {
                        }
                    }
                }
            });
        }
        AlbumOrientationEventListener albumOrientationEventListener = this.mOrientationListener;
        if (albumOrientationEventListener != null) {
            albumOrientationEventListener.disable();
            this.mOrientationListener = null;
        }
        IInputAudioStream iInputAudioStream = this.mAudioStreamObserver;
        if (iInputAudioStream != null) {
            iInputAudioStream.release();
            this.mAudioStreamObserver = null;
        }
        if (this.mFindContourListener != null) {
            this.mFindContourListener = null;
        }
        if (this.mContourDataCallBack != null) {
            this.mContourDataCallBack = null;
        }
        if (this.mAdm != null) {
            this.mAdm = null;
        }
        FilterVideoBufferPool filterVideoBufferPool = this.mBufferPool;
        if (filterVideoBufferPool != null) {
            filterVideoBufferPool.release();
        }
        super.release();
    }

    public synchronized void releaseEffectWrapper() {
        this.mHandler.post(new Runnable() { // from class: com.ss.ttlivestreamer.livestreamv2.filter.FilterManager.4
            @Override // java.lang.Runnable
            public void run() {
                com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$4_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public void com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$4__run$___twin___() {
                IVideoEffectProcessor iVideoEffectProcessor = FilterManager.this.mEffect;
                if (iVideoEffectProcessor != null) {
                    iVideoEffectProcessor.release();
                    FilterManager.this.mEffect.setEffectMsgListener(null);
                    FilterManager filterManager = FilterManager.this;
                    filterManager.mEffect = null;
                    IVideoEffectProcessor.EffectMsgListener effectMsgListener = filterManager.mMsgListener;
                    if (effectMsgListener != null) {
                        effectMsgListener.onMessageReceived(2139095042, 0, 0, null);
                    }
                }
            }

            public AnonymousClass4() {
            }

            public static void com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$4_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass4 anonymousClass4) {
                boolean LIZ;
                try {
                    anonymousClass4.com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$4__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }
        });
    }

    public void releaseRawVideoDumpers() {
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.filter.IFilterManager
    public int resumeEffect() {
        this.mHandler.post(new Runnable() { // from class: com.ss.ttlivestreamer.livestreamv2.filter.FilterManager.53
            public final /* synthetic */ String val$callInfo;

            @Override // java.lang.Runnable
            public void run() {
                com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$53_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public void com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$53__run$___twin___() {
                int resumeEffect;
                if (FilterManager.this.isValid() && (resumeEffect = FilterManager.this.mEffect.resumeEffect()) != 0) {
                    FilterManager.this.mErrorListener.onError(resumeEffect, r2);
                }
            }

            public static void com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$53_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass53 anonymousClass53) {
                boolean LIZ;
                try {
                    anonymousClass53.com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$53__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }

            public AnonymousClass53(String str) {
                r2 = str;
            }
        });
        return 0;
    }

    public void setDumpFrameParams(JSONObject jSONObject) {
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.filter.IFilterManager
    public int startEffectAudio() {
        return -1;
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.filter.IFilterManager
    public int stopEffectAudio() {
        return -1;
    }

    /* renamed from: com.ss.ttlivestreamer.livestreamv2.filter.FilterManager$2 */
    /* loaded from: classes12.dex */
    public class AnonymousClass2 implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$2_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
        }

        public void com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$2__run$___twin___() {
            if (!GlUtil.nativeIsOpenGlThread()) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("Thread is not a gl thread.");
                LIZ.append(FilterManager.this.mHandler.getLooper().getThread().getName());
                AVLog.logKibana(5, "FilterManager", X1D.LIZIZ(LIZ), null);
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("not a gl thread.");
                LIZ2.append(FilterManager.this.mHandler.getLooper().getThread().getName());
                AndroidRuntimeException androidRuntimeException = new AndroidRuntimeException(X1D.LIZIZ(LIZ2));
                if (!AnonymousClass028.LJI(androidRuntimeException, "FilterManager.FilterManager")) {
                    FilterManager.this.mHandler = null;
                    return;
                }
                throw androidRuntimeException;
            }
        }

        public AnonymousClass2() {
        }

        public static void com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$2_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass2 anonymousClass2) {
            boolean LIZ;
            try {
                anonymousClass2.com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$2__run$___twin___();
            } finally {
                if (LIZ) {
                }
            }
        }
    }

    static {
        try {
            C16880lQ.LLJJJIL("effect");
        } catch (Throwable unused) {
        }
    }

    public static IFilterManager createDummy() {
        return new IFilterManager() { // from class: com.ss.ttlivestreamer.livestreamv2.filter.FilterManager.1
            @Override // com.ss.ttlivestreamer.livestreamv2.filter.IFilterManager
            public int composerAppendNodes(String[] strArr, int i) {
                return 0;
            }

            @Override // com.ss.ttlivestreamer.livestreamv2.filter.IFilterManager
            public int composerAppendNodesWithTags(String[] strArr, int i, String[] strArr2) {
                return 0;
            }

            @Override // com.ss.ttlivestreamer.livestreamv2.filter.IFilterManager
            public int composerAppendNodesWithTags(String[] strArr, int i, String[] strArr2, boolean z, boolean z2, boolean z3) {
                return 0;
            }

            @Override // com.ss.ttlivestreamer.livestreamv2.filter.IFilterManager
            public int composerCheckNodeExclusion(String str, String str2, int[] iArr) {
                return 0;
            }

            @Override // com.ss.ttlivestreamer.livestreamv2.filter.IFilterManager
            public int composerExclusionCompare(String str, String str2, String str3, int[] iArr) {
                return 0;
            }

            @Override // com.ss.ttlivestreamer.livestreamv2.filter.IFilterManager
            public int composerReloadNodes(String[] strArr, int i) {
                return 0;
            }

            @Override // com.ss.ttlivestreamer.livestreamv2.filter.IFilterManager
            public int composerReloadNodesWithTags(String[] strArr, int i, String[] strArr2) {
                return 0;
            }

            @Override // com.ss.ttlivestreamer.livestreamv2.filter.IFilterManager
            public int composerRemoveNodes(String[] strArr, int i) {
                return 0;
            }

            @Override // com.ss.ttlivestreamer.livestreamv2.filter.IFilterManager
            public int composerReplaceNodesWithTags(String[] strArr, int i, String[] strArr2, int i2, String[] strArr3) {
                return 0;
            }

            @Override // com.ss.ttlivestreamer.livestreamv2.filter.IFilterManager
            public int composerSetMode(int i, int i2) {
                return 0;
            }

            @Override // com.ss.ttlivestreamer.livestreamv2.filter.IFilterManager
            public int composerSetNodes(String[] strArr, int i) {
                return 0;
            }

            @Override // com.ss.ttlivestreamer.livestreamv2.filter.IFilterManager
            public int composerSetNodesWithTags(String[] strArr, int i, String[] strArr2) {
                return 0;
            }

            @Override // com.ss.ttlivestreamer.livestreamv2.filter.IFilterManager
            public int composerSetNodesWithTags(String[] strArr, int i, String[] strArr2, boolean z, boolean z2, boolean z3) {
                return 0;
            }

            @Override // com.ss.ttlivestreamer.livestreamv2.filter.IFilterManager
            public int composerUpdateMultipleNodes(int i, String[] strArr, String[] strArr2, float[] fArr) {
                return 0;
            }

            @Override // com.ss.ttlivestreamer.livestreamv2.filter.IFilterManager
            public int composerUpdateNode(String str, String str2, float f) {
                return 0;
            }

            @Override // com.ss.ttlivestreamer.livestreamv2.filter.IFilterManager
            public final /* synthetic */ void configGpuTurbo(LiveStreamGpuTurboWrapper liveStreamGpuTurboWrapper, AdaptResolutionUtils adaptResolutionUtils) {
                C30741C4r.LIZ(this, liveStreamGpuTurboWrapper, adaptResolutionUtils);
            }

            @Override // com.ss.ttlivestreamer.livestreamv2.filter.IFilterManager
            public IAudioStrangeVoice createAudioStrangeVoice(AudioDeviceModule.AudioRenderSink audioRenderSink, int i, int i2, boolean z) {
                return null;
            }

            @Override // com.ss.ttlivestreamer.livestreamv2.filter.IFilterManager
            public void destroyAudioGraphStickerContext() {
            }

            @Override // com.ss.ttlivestreamer.livestreamv2.filter.IFilterManager
            public boolean detectFaceFromBitMap(Bitmap bitmap) {
                return false;
            }

            @Override // com.ss.ttlivestreamer.livestreamv2.filter.IFilterManager
            public void enable(boolean z) {
            }

            @Override // com.ss.ttlivestreamer.livestreamv2.filter.IFilterManager
            public void enableAutoBrightenFilter(boolean z) {
            }

            @Override // com.ss.ttlivestreamer.livestreamv2.filter.IFilterManager
            public void enableExpressionDetect(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
            }

            @Override // com.ss.ttlivestreamer.livestreamv2.filter.IFilterManager
            public int enableFindContour(boolean z, String str) {
                return 0;
            }

            @Override // com.ss.ttlivestreamer.livestreamv2.filter.IFilterManager
            public int enableMockFace(boolean z) {
                return 0;
            }

            @Override // com.ss.ttlivestreamer.livestreamv2.filter.IFilterManager
            public void forceOutput2DTex(boolean z) {
            }

            @Override // com.ss.ttlivestreamer.livestreamv2.filter.IFilterManager
            public String getABDefaultInfoFromEffect(String str) {
                return null;
            }

            @Override // com.ss.ttlivestreamer.livestreamv2.filter.IFilterManager
            public final /* synthetic */ int getBufferBlockCnd() {
                return C30741C4r.LIZIZ(this);
            }

            @Override // com.ss.ttlivestreamer.livestreamv2.filter.IFilterManager
            public IFilterManager.ContourDataCallBack getContourDataCallBack() {
                return null;
            }

            @Override // com.ss.ttlivestreamer.livestreamv2.filter.IFilterManager
            public long getEffectAudioQuirk() {
                return 0L;
            }

            @Override // com.ss.ttlivestreamer.livestreamv2.filter.IFilterManager
            public float getEffectAudioVolume() {
                return 0.0f;
            }

            @Override // com.ss.ttlivestreamer.livestreamv2.filter.IFilterManager
            public EffectImageInfo getEffectCapturedImagewithKey(String str) {
                return null;
            }

            @Override // com.ss.ttlivestreamer.livestreamv2.filter.IFilterManager
            public long getEffectNativeHandler() {
                return 0L;
            }

            @Override // com.ss.ttlivestreamer.livestreamv2.filter.IFilterManager
            public final /* synthetic */ int getEffectProcessError() {
                return C30741C4r.LIZJ(this);
            }

            @Override // com.ss.ttlivestreamer.livestreamv2.filter.IFilterManager
            public String getEffectVersion() {
                return null;
            }

            @Override // com.ss.ttlivestreamer.livestreamv2.filter.IFilterManager
            public int getFaceCount() {
                return 0;
            }

            @Override // com.ss.ttlivestreamer.livestreamv2.filter.IFilterManager
            public float getFilterIntensity(String str) {
                return 0.0f;
            }

            @Override // com.ss.ttlivestreamer.livestreamv2.filter.IFilterManager
            public String getFrameCostStatistics() {
                return null;
            }

            @Override // com.ss.ttlivestreamer.livestreamv2.filter.IFilterManager
            public String getFrameProgressParams() {
                return null;
            }

            @Override // com.ss.ttlivestreamer.livestreamv2.filter.IFilterManager
            public String getVersion() {
                return "";
            }

            @Override // com.ss.ttlivestreamer.livestreamv2.filter.IFilterManager
            public IVideoEffectProcessor getVideoEffectProcessor() {
                return null;
            }

            @Override // com.ss.ttlivestreamer.livestreamv2.filter.IFilterManager
            public boolean isEnable() {
                return true;
            }

            @Override // com.ss.ttlivestreamer.livestreamv2.filter.IFilterManager
            public boolean isEnableFindContour() {
                return false;
            }

            @Override // com.ss.ttlivestreamer.livestreamv2.filter.IFilterManager
            public boolean isValid() {
                return false;
            }

            @Override // com.ss.ttlivestreamer.livestreamv2.filter.IFilterManager
            public String name() {
                return "DummyFilter";
            }

            @Override // com.ss.ttlivestreamer.livestreamv2.filter.IFilterManager
            public int notifyKeyboardHide(boolean z) {
                return 0;
            }

            @Override // com.ss.ttlivestreamer.livestreamv2.filter.IFilterManager
            public int pauseEffect() {
                return 0;
            }

            @Override // com.ss.ttlivestreamer.livestreamv2.filter.IFilterManager
            public void processDoubleClickEvent(float f, float f2) {
            }

            @Override // com.ss.ttlivestreamer.livestreamv2.filter.IFilterManager
            public void processLongPressEvent(float f, float f2) {
            }

            @Override // com.ss.ttlivestreamer.livestreamv2.filter.IFilterManager
            public void processPanEvent(float f, float f2, float f3, float f4, float f5) {
            }

            @Override // com.ss.ttlivestreamer.livestreamv2.filter.IFilterManager
            public void processRotationEvent(float f, float f2) {
            }

            @Override // com.ss.ttlivestreamer.livestreamv2.filter.IFilterManager
            public void processScaleEvent(float f, float f2) {
            }

            @Override // com.ss.ttlivestreamer.livestreamv2.filter.IFilterManager
            public void processTouchDownEvent(float f, float f2, int i) {
            }

            @Override // com.ss.ttlivestreamer.livestreamv2.filter.IFilterManager
            public void processTouchEvent(float f, float f2) {
            }

            @Override // com.ss.ttlivestreamer.livestreamv2.filter.IFilterManager
            public void processTouchEventWithTouchType(long j, float f, float f2, float f3, float f4, int i, int i2) {
            }

            @Override // com.ss.ttlivestreamer.livestreamv2.filter.IFilterManager
            public void processTouchUpEvent(float f, float f2, int i) {
            }

            @Override // com.ss.ttlivestreamer.livestreamv2.filter.IFilterManager
            public void releaseContetDetector() {
            }

            @Override // com.ss.ttlivestreamer.livestreamv2.filter.IFilterManager
            public int resetFrameCostStatistics() {
                return 0;
            }

            @Override // com.ss.ttlivestreamer.livestreamv2.filter.IFilterManager
            public int resumeEffect() {
                return 0;
            }

            @Override // com.ss.ttlivestreamer.livestreamv2.filter.IFilterManager
            public int sendEffectMsg(int i, int i2, int i3, String str) {
                return 0;
            }

            @Override // com.ss.ttlivestreamer.livestreamv2.filter.IFilterManager
            public void setABInfoToEffect(JSONObject jSONObject, String str) {
            }

            @Override // com.ss.ttlivestreamer.livestreamv2.filter.IFilterManager
            public int setAudioRecognizeDict(Map<String, String[]> map) {
                return 0;
            }

            @Override // com.ss.ttlivestreamer.livestreamv2.filter.IFilterManager
            public int setBeautify(String str, float f, float f2) {
                return 0;
            }

            @Override // com.ss.ttlivestreamer.livestreamv2.filter.IFilterManager
            public int setBeautify(String str, float f, float f2, float f3) {
                return 0;
            }

            @Override // com.ss.ttlivestreamer.livestreamv2.filter.IFilterManager
            public void setContourDataCallBack(IFilterManager.ContourDataCallBack contourDataCallBack) {
            }

            @Override // com.ss.ttlivestreamer.livestreamv2.filter.IFilterManager
            public void setContourDataSendInterval(int i) {
            }

            @Override // com.ss.ttlivestreamer.livestreamv2.filter.IFilterManager
            public void setContourInfoIndex(String str) {
            }

            @Override // com.ss.ttlivestreamer.livestreamv2.filter.IFilterManager
            public int setCustomEffect(String str, String str2) {
                return 0;
            }

            @Override // com.ss.ttlivestreamer.livestreamv2.filter.IFilterManager
            public int setCustomEffectOrientation(String str, int i) {
                return 0;
            }

            @Override // com.ss.ttlivestreamer.livestreamv2.filter.IFilterManager
            public int setCustomEffectWithUri(String str, String str2, int i, int i2) {
                return 0;
            }

            @Override // com.ss.ttlivestreamer.livestreamv2.filter.IFilterManager
            public void setDoubleViewRect(double d, double d2, double d3, double d4) {
            }

            @Override // com.ss.ttlivestreamer.livestreamv2.filter.IFilterManager
            public int setEffect(String str) {
                return 0;
            }

            @Override // com.ss.ttlivestreamer.livestreamv2.filter.IFilterManager
            public int setEffect(String str, boolean z) {
                return 0;
            }

            @Override // com.ss.ttlivestreamer.livestreamv2.filter.IFilterManager
            public void setEffectAudioQuirk(long j) {
            }

            @Override // com.ss.ttlivestreamer.livestreamv2.filter.IFilterManager
            public void setEffectAudioVolume(float f) {
            }

            @Override // com.ss.ttlivestreamer.livestreamv2.filter.IFilterManager
            public void setEffectInfoChangeListener(IVideoEffectProcessor.IEffectInfoChangeListener iEffectInfoChangeListener) {
            }

            @Override // com.ss.ttlivestreamer.livestreamv2.filter.IFilterManager
            public void setEffectMsgListener(IFilterManager.EffectMsgListener effectMsgListener) {
            }

            @Override // com.ss.ttlivestreamer.livestreamv2.filter.IFilterManager
            public void setErrorListener(IFilterManager.ErrorListener errorListener) {
            }

            @Override // com.ss.ttlivestreamer.livestreamv2.filter.IFilterManager
            public void setExpressionDetectListener(IFilterManager.ExpressionDetectListener expressionDetectListener) {
            }

            @Override // com.ss.ttlivestreamer.livestreamv2.filter.IFilterManager
            public int setFaceAttribute(boolean z) {
                return 0;
            }

            @Override // com.ss.ttlivestreamer.livestreamv2.filter.IFilterManager
            public void setFaceDetectListener(IFilterManager.FaceDetectListener faceDetectListener) {
            }

            @Override // com.ss.ttlivestreamer.livestreamv2.filter.IFilterManager
            public int setFilter(String str, float f) {
                return 0;
            }

            @Override // com.ss.ttlivestreamer.livestreamv2.filter.IFilterManager
            public int setFilter(String str, float f, boolean z) {
                return 0;
            }

            @Override // com.ss.ttlivestreamer.livestreamv2.filter.IFilterManager
            public int setFilter(String str, String str2, float f, float f2, float f3) {
                return 0;
            }

            @Override // com.ss.ttlivestreamer.livestreamv2.filter.IFilterManager
            public int setFilter(String str, String str2, float f, float f2, float f3, boolean z) {
                return 0;
            }

            @Override // com.ss.ttlivestreamer.livestreamv2.filter.IFilterManager
            public void setFindContourListener(IFilterManager.FindContourListener findContourListener) {
            }

            @Override // com.ss.ttlivestreamer.livestreamv2.filter.IFilterManager
            public int setInputText(String str, int i, int i2, String str2) {
                return 0;
            }

            @Override // com.ss.ttlivestreamer.livestreamv2.filter.IFilterManager
            public void setLicenseToEffect(String str) {
            }

            @Override // com.ss.ttlivestreamer.livestreamv2.filter.IFilterManager
            public void setLicenseToEffect(String str, boolean z) {
            }

            @Override // com.ss.ttlivestreamer.livestreamv2.filter.IFilterManager
            public void setMicrophoneDetectListener(IFilterManager.MicrophoneDetectListener microphoneDetectListener) {
            }

            @Override // com.ss.ttlivestreamer.livestreamv2.filter.IFilterManager
            public void setMusicNodeFilePath(String str) {
            }

            @Override // com.ss.ttlivestreamer.livestreamv2.filter.IFilterManager
            public void setRenderCacheInt(String str, int i) {
            }

            @Override // com.ss.ttlivestreamer.livestreamv2.filter.IFilterManager
            public void setRenderCacheString(String str, String str2) {
            }

            @Override // com.ss.ttlivestreamer.livestreamv2.filter.IFilterManager
            public void setRenderSinkOnlyMixWithRTC(boolean z) {
            }

            @Override // com.ss.ttlivestreamer.livestreamv2.filter.IFilterManager
            public int setReshape(String str, float f, float f2) {
                return 0;
            }

            @Override // com.ss.ttlivestreamer.livestreamv2.filter.IFilterManager
            public void setSendContourInfoType(int i) {
            }

            @Override // com.ss.ttlivestreamer.livestreamv2.filter.IFilterManager
            public void setupAudioGraphStickerContext(boolean z, boolean z2, boolean z3) {
            }

            @Override // com.ss.ttlivestreamer.livestreamv2.filter.IFilterManager
            public int startAudioRecognize() {
                return 0;
            }

            @Override // com.ss.ttlivestreamer.livestreamv2.filter.IFilterManager
            public int startEffectAudio() {
                return 0;
            }

            @Override // com.ss.ttlivestreamer.livestreamv2.filter.IFilterManager
            public int stopAudioRecognize() {
                return 0;
            }

            @Override // com.ss.ttlivestreamer.livestreamv2.filter.IFilterManager
            public int stopEffectAudio() {
                return 0;
            }

            @Override // com.ss.ttlivestreamer.livestreamv2.filter.IFilterManager
            public void updateEffAudioTimestampMs(long j) {
            }
        };
    }

    private boolean needPostProcess() {
        if (this.mBrightenFilter != null || this.mNoiseEvaluateFilter != null || this.mColorHistFilter != null || ((this.mEffectFrameCatcher != null && this.mShouldCatch) || this.mEnableVideoBlackFrameCheck)) {
            return true;
        }
        return false;
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.filter.IFilterManager
    public void destroyAudioGraphStickerContext() {
        this.mHandler.post(new Runnable() { // from class: com.ss.ttlivestreamer.livestreamv2.filter.FilterManager.25
            @Override // java.lang.Runnable
            public void run() {
                com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$25_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public void com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$25__run$___twin___() {
                FilterManager filterManager = FilterManager.this;
                if (!filterManager.mEnalbeAudioGraphSticker) {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("destroyAudioGraphStickerContext failed! mEnalbeAudioGraphSticker: ");
                    LIZ.append(FilterManager.this.mEnalbeAudioGraphSticker);
                    AVLog.logKibana(5, "FilterManager", X1D.LIZIZ(LIZ), null);
                    return;
                }
                if (filterManager.isValid()) {
                    synchronized (FilterManager.this.mAudioEffectLock) {
                        FilterManager.this.mEnalbeAudioGraphSticker = false;
                        AVLog.logKibana(5, "FilterManager", "mEnalbeAudioGraphSticker is set to false in destroyAudioGraphStickerContext", null);
                    }
                    FilterManager filterManager2 = FilterManager.this;
                    filterManager2.mAdm.enableAsyncProcess(filterManager2.mAudioRecognizing);
                    FilterManager filterManager3 = FilterManager.this;
                    if (!filterManager3.mUseAudioGraphStickerOutput) {
                        filterManager3.mAudioStreamObserver.getAudioTrack().setEnable(true);
                    }
                    int destroyEffectAudioHandler = FilterManager.this.mEffect.destroyEffectAudioHandler();
                    if (destroyEffectAudioHandler != 0) {
                        FilterManager.this.mErrorListener.onError(destroyEffectAudioHandler, "");
                    }
                }
            }

            public AnonymousClass25() {
            }

            public static void com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$25_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass25 anonymousClass25) {
                boolean LIZ;
                try {
                    anonymousClass25.com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$25__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }
        });
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.filter.IFilterManager
    public int getBufferBlockCnd() {
        return this.mBufferPool.getBlockCnt();
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.filter.IFilterManager
    public long getEffectAudioQuirk() {
        AudioDeviceModule.AudioRenderSink effectAudioRender;
        IVideoEffectProcessor iVideoEffectProcessor = this.mEffect;
        if (iVideoEffectProcessor != null && (effectAudioRender = iVideoEffectProcessor.getEffectAudioRender()) != null) {
            return effectAudioRender.getQuirks() & 7;
        }
        return 0L;
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.filter.IFilterManager
    public String getEffectVersion() {
        IVideoEffectProcessor iVideoEffectProcessor = this.mEffect;
        if (iVideoEffectProcessor == null) {
            return "";
        }
        return iVideoEffectProcessor.getEffectVersion();
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.filter.IFilterManager
    public String getFrameCostStatistics() {
        String[] strArr = {""};
        ThreadUtils.invokeAtFrontUninterruptibly(this.mHandler, new Runnable() { // from class: com.ss.ttlivestreamer.livestreamv2.filter.FilterManager.67
            public final /* synthetic */ String[] val$ret;

            @Override // java.lang.Runnable
            public void run() {
                com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$67_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public void com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$67__run$___twin___() {
                if (FilterManager.this.isValid()) {
                    r2[0] = FilterManager.this.mEffect.getFrameCostStatistics();
                }
            }

            public static void com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$67_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass67 anonymousClass67) {
                boolean LIZ;
                try {
                    anonymousClass67.com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$67__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }

            public AnonymousClass67(String[] strArr2) {
                r2 = strArr2;
            }
        });
        return strArr2[0];
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.filter.IFilterManager
    public String getFrameProgressParams() {
        String[] strArr = {""};
        ThreadUtils.invokeAtFrontUninterruptibly(this.mHandler, new Runnable() { // from class: com.ss.ttlivestreamer.livestreamv2.filter.FilterManager.68
            public final /* synthetic */ String[] val$ret;

            @Override // java.lang.Runnable
            public void run() {
                com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$68_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public void com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$68__run$___twin___() {
                if (FilterManager.this.isValid()) {
                    r2[0] = FilterManager.this.mEffect.getFrameProgressParams();
                }
            }

            public static void com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$68_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass68 anonymousClass68) {
                boolean LIZ;
                try {
                    anonymousClass68.com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$68__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }

            public AnonymousClass68(String[] strArr2) {
                r2 = strArr2;
            }
        });
        return strArr2[0];
    }

    public int getNoBufferCountAndClear() {
        int i = this.mNoBufferCount;
        this.mNoBufferCount = 0;
        return i;
    }

    public JSONObject getStatus() {
        JSONObject jSONObject = new JSONObject();
        try {
            BmfBrightenFilter bmfBrightenFilter = this.mBrightenFilter;
            if (bmfBrightenFilter != null) {
                jSONObject.put("auto_brighten", bmfBrightenFilter.getStatus());
            }
            BmfNoiseEvaluateFilter bmfNoiseEvaluateFilter = this.mNoiseEvaluateFilter;
            if (bmfNoiseEvaluateFilter != null) {
                jSONObject.put("video_noise_evaluate", bmfNoiseEvaluateFilter.getStatus());
            }
            BmfVQScoreFilter bmfVQScoreFilter = this.mVQScoreFilter;
            if (bmfVQScoreFilter != null) {
                jSONObject.put("vqscore", bmfVQScoreFilter.getStatus());
            }
            BmfColorHistFilter bmfColorHistFilter = this.mColorHistFilter;
            if (bmfColorHistFilter != null) {
                jSONObject.put("video_color_hist", bmfColorHistFilter.getStatus());
            }
            BmfVideoDenoiseFilter bmfVideoDenoiseFilter = this.mVideoDenoiseFilter;
            if (bmfVideoDenoiseFilter != null) {
                jSONObject.put("video_denoise", bmfVideoDenoiseFilter.getStatus());
            }
        } catch (Exception unused) {
        }
        if (jSONObject.length() <= 0) {
            return null;
        }
        return jSONObject;
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.filter.IFilterManager
    public boolean isValid() {
        IVideoEffectProcessor iVideoEffectProcessor = this.mEffect;
        if (iVideoEffectProcessor != null && iVideoEffectProcessor.valid()) {
            return true;
        }
        return false;
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.filter.IFilterManager
    public void releaseContetDetector() {
        this.mHandler.post(new ARunnableS15S0101000_11(9, this, 8));
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.filter.IFilterManager
    public int resetFrameCostStatistics() {
        ThreadUtils.invokeAtFrontUninterruptibly(this.mHandler, new Runnable() { // from class: com.ss.ttlivestreamer.livestreamv2.filter.FilterManager.66
            @Override // java.lang.Runnable
            public void run() {
                com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$66_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public void com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$66__run$___twin___() {
                int resetFrameCostStatistics;
                if (FilterManager.this.isValid() && (resetFrameCostStatistics = FilterManager.this.mEffect.resetFrameCostStatistics()) != 0) {
                    FilterManager.this.mErrorListener.onError(resetFrameCostStatistics, null);
                }
            }

            public AnonymousClass66() {
            }

            public static void com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$66_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass66 anonymousClass66) {
                boolean LIZ;
                try {
                    anonymousClass66.com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$66__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }
        });
        return 0;
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.filter.IFilterManager
    public int startAudioRecognize() {
        if (this.mAudioRecognizing) {
            return -1;
        }
        IVideoEffectProcessor.EffectMsgListener effectMsgListener = this.mMsgListener;
        if (effectMsgListener != null) {
            effectMsgListener.onMessageReceived(20, 2139095043, 0, "");
        }
        this.mAudioRecognizing = true;
        AudioDeviceModule audioDeviceModule = this.mAdm;
        if (audioDeviceModule != null) {
            audioDeviceModule.enableAsyncProcess(true);
        }
        return 0;
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.filter.IFilterManager
    public int stopAudioRecognize() {
        if (!this.mAudioRecognizing) {
            return -1;
        }
        IVideoEffectProcessor.EffectMsgListener effectMsgListener = this.mMsgListener;
        if (effectMsgListener != null) {
            effectMsgListener.onMessageReceived(20, 2139095044, 0, "");
        }
        this.mAudioRecognizing = false;
        AudioDeviceModule audioDeviceModule = this.mAdm;
        if (audioDeviceModule != null) {
            audioDeviceModule.enableAsyncProcess(this.mEnalbeAudioGraphSticker);
        }
        return 0;
    }

    private boolean isGlFenceSyncEnabled() {
        if (GLThreadManager.isEnableForceGLFence() && !needPostProcess()) {
            return true;
        }
        return false;
    }

    public /* synthetic */ void lambda$releaseContetDetector$2() {
        if (isValid()) {
            this.mEffect.releaseContetDetector();
        }
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.filter.IFilterManager
    public long getEffectNativeHandler() {
        IVideoEffectProcessor iVideoEffectProcessor;
        if (isValid() && (iVideoEffectProcessor = this.mEffect) != null && (iVideoEffectProcessor instanceof EffectWrapper)) {
            return ((EffectWrapper) iVideoEffectProcessor).getEffectNativeHandler();
        }
        return 0L;
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.filter.IFilterManager
    public String getVersion() {
        if (isValid()) {
            return this.mEffect.getEffectVersion();
        }
        return "";
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.filter.IFilterManager
    public String name() {
        if (isValid()) {
            return this.mEffect.name();
        }
        return "";
    }

    public int getBlackFrameDetectResult() {
        return this.mBlackFrameDetectResult;
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.filter.IFilterManager
    public IFilterManager.ContourDataCallBack getContourDataCallBack() {
        return this.mContourDataCallBack;
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.filter.IFilterManager
    public float getEffectAudioVolume() {
        return this.mEffectAudioVolume;
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.filter.IFilterManager
    public int getEffectProcessError() {
        return this.effectProcessError;
    }

    public BmfVQScoreFilter getVQScoreFilter() {
        return this.mVQScoreFilter;
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.filter.IFilterManager
    public IVideoEffectProcessor getVideoEffectProcessor() {
        return this.mEffect;
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.filter.IFilterManager
    public boolean isEnable() {
        return this.mEnabled;
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.filter.IFilterManager
    public boolean isEnableFindContour() {
        return this.mEnableFindContour;
    }

    public boolean isEnableVideoBlackFrameCheck() {
        return this.mEnableVideoBlackFrameCheck;
    }

    /* renamed from: com.ss.ttlivestreamer.livestreamv2.filter.FilterManager$7 */
    /* loaded from: classes12.dex */
    public class AnonymousClass7 implements Runnable {
        public void com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$7__run$___twin___() {
        }

        @Override // java.lang.Runnable
        public void run() {
            com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$7_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
        }

        public AnonymousClass7() {
        }

        public static void com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$7_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass7 anonymousClass7) {
            boolean LIZ2;
            try {
                anonymousClass7.com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$7__run$___twin___();
            } finally {
                if (LIZ2) {
                }
            }
        }
    }

    /* loaded from: classes12.dex */
    public class AlbumOrientationEventListener extends OrientationEventListener {
        @Override // android.view.OrientationEventListener
        public void onOrientationChanged(int i) {
            if (i == -1) {
                return;
            }
            int i2 = (((i + 45) / 90) * 90) % 360;
            FilterManager filterManager = FilterManager.this;
            if (i2 != filterManager.mOrientation) {
                filterManager.mOrientation = i2;
            }
        }

        public AlbumOrientationEventListener(Context context) {
            super(context);
            try {
                if (canDetectOrientation()) {
                    enable();
                } else {
                    AVLog.e("FilterManager", "Can't Detect Orientation");
                }
            } catch (Exception e) {
                AVLog.logKibana(6, "FilterManager", "AlbumOrientationEventListener register failed:", e);
            }
        }
    }

    private String getCallInfo(Object... objArr) {
        String str;
        if (!DebugLogUtils.isEnableDebugLog()) {
            return "";
        }
        String str2 = "(";
        try {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(C16880lQ.LLLLIIIILLL().getStackTrace()[3].getMethodName());
            LIZ.append("(");
            str2 = X1D.LIZIZ(LIZ);
        } catch (Exception unused) {
        }
        for (int i = 0; objArr != null && i < objArr.length; i++) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append(str2);
            LIZ2.append(objArr[i]);
            if (i == objArr.length - 1) {
                str = "";
            } else {
                str = ", ";
            }
            LIZ2.append(str);
            str2 = X1D.LIZIZ(LIZ2);
        }
        return i0.LJFF(str2, ")");
    }

    public static /* synthetic */ void lambda$release$1(YuvConverter yuvConverter) {
        yuvConverter.release();
        AVLog.iow("FilterManager", "YuvConverter release");
    }

    public /* synthetic */ void lambda$setEffectInfoChangeListener$3(IVideoEffectProcessor.IEffectInfoChangeListener iEffectInfoChangeListener) {
        IVideoEffectProcessor iVideoEffectProcessor = this.mEffect;
        if (iVideoEffectProcessor != null && (iVideoEffectProcessor instanceof EffectWrapper)) {
            ((EffectWrapper) iVideoEffectProcessor).setEffectInfoChangeListener(iEffectInfoChangeListener);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x002d, code lost:
    
        if (r0 == false) goto L37;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean needOriginFrame(com.ss.ttlivestreamer.core.buffer.VideoFrame.Buffer r6) {
        /*
            r5 = this;
            boolean r0 = r5.mEnabled
            r4 = 0
            r3 = 1
            if (r0 == 0) goto Ld
            boolean r0 = r5.isValid()
            if (r0 == 0) goto Ld
        Lc:
            return r4
        Ld:
            boolean r0 = r5.mForceOutput2DTex
            if (r0 == 0) goto L2f
            boolean r0 = r6 instanceof com.ss.ttlivestreamer.core.buffer.VideoFrame.TextureBuffer
            if (r0 == 0) goto Lc
            r2 = r6
            com.ss.ttlivestreamer.core.buffer.VideoFrame$TextureBuffer r2 = (com.ss.ttlivestreamer.core.buffer.VideoFrame.TextureBuffer) r2
            com.ss.ttlivestreamer.core.buffer.VideoFrame$TextureBuffer$Type r1 = r2.getType()
            com.ss.ttlivestreamer.core.buffer.VideoFrame$TextureBuffer$Type r0 = com.ss.ttlivestreamer.core.buffer.VideoFrame.TextureBuffer.Type.RGB
            if (r1 != r0) goto L33
            r1 = 1
        L21:
            android.graphics.Matrix r0 = r2.getTransformMatrix()
            boolean r0 = r0.isIdentity()
            r0 = r0 ^ 1
            if (r1 == 0) goto Lc
            if (r0 != 0) goto Lc
        L2f:
            r5.dumpOriginFrame(r6)
            return r3
        L33:
            r1 = 0
            goto L21
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.ttlivestreamer.livestreamv2.filter.FilterManager.needOriginFrame(com.ss.ttlivestreamer.core.buffer.VideoFrame$Buffer):boolean");
    }

    private VideoFrame returnCurrent2dTex(VideoFrame videoFrame) {
        FilterVideoBufferPool.Recycle recycleWithTexId;
        if (this.mCurrentOut2dTex > 0) {
            int rotatedWidth = videoFrame.getRotatedWidth();
            int rotatedHeight = videoFrame.getRotatedHeight();
            LiveStreamGpuTurboWrapper liveStreamGpuTurboWrapper = this.wrapper;
            if (liveStreamGpuTurboWrapper != null && liveStreamGpuTurboWrapper.isGpuTurboEnabled()) {
                rotatedWidth = this.wrapper.getSRResolutionWidth();
                rotatedHeight = this.wrapper.getSRResolutionHeight();
                recycleWithTexId = this.mSRBufferPool.getRecycleWithTexId(this.mCurrentOut2dTex);
            } else {
                recycleWithTexId = this.mBufferPool.getRecycleWithTexId(this.mCurrentOut2dTex);
            }
            if (recycleWithTexId != null) {
                return wrapperFrame(recycleWithTexId, videoFrame, rotatedWidth, rotatedHeight, null, null);
            }
            AndroidRuntimeException androidRuntimeException = new AndroidRuntimeException("BUG! recycle is null");
            if (AnonymousClass028.LJI(androidRuntimeException, "FilterManager.returnCurrent2dTex")) {
                throw androidRuntimeException;
            }
        }
        return videoFrame;
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.filter.IFilterManager
    public boolean detectFaceFromBitMap(Bitmap bitmap) {
        return this.mEffect.detectFaceFromBitMap(bitmap);
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.filter.IFilterManager
    public void enable(boolean z) {
        AudioDeviceModule.AudioRenderSink effectAudioRender;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("enable ");
        LIZ.append(this.mEnabled);
        LIZ.append(" -> ");
        LIZ.append(z);
        AVLog.iod("FilterManager", X1D.LIZIZ(LIZ));
        this.mEnabled = z;
        if (!z) {
            enableAutoBrightenFilter(false);
        }
        IVideoEffectProcessor iVideoEffectProcessor = this.mEffect;
        if (iVideoEffectProcessor != null && (effectAudioRender = iVideoEffectProcessor.getEffectAudioRender()) != null) {
            effectAudioRender.setMute(!z);
        }
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.filter.IFilterManager
    public void enableAutoBrightenFilter(boolean z) {
        BmfBrightenFilter bmfBrightenFilter = this.mBrightenFilter;
        if (bmfBrightenFilter != null) {
            bmfBrightenFilter.enable(z);
        }
    }

    public void enableColorHist(boolean z) {
        BmfColorHistFilter bmfColorHistFilter = this.mColorHistFilter;
        if (bmfColorHistFilter != null) {
            bmfColorHistFilter.enable(z);
        }
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.filter.IFilterManager
    public int enableMockFace(boolean z) {
        this.mForceSticker = z;
        return 0;
    }

    public void enableNoiseEvaluateFilter(boolean z) {
        BmfNoiseEvaluateFilter bmfNoiseEvaluateFilter = this.mNoiseEvaluateFilter;
        if (bmfNoiseEvaluateFilter != null) {
            bmfNoiseEvaluateFilter.enable(z);
        }
    }

    public void enableRoi(boolean z) {
        this.mRoiEnabled = z;
    }

    public void enableVQScoreFilter(boolean z) {
        BmfVQScoreFilter bmfVQScoreFilter = this.mVQScoreFilter;
        if (bmfVQScoreFilter != null) {
            bmfVQScoreFilter.enable(z);
        }
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.filter.IFilterManager
    public void forceOutput2DTex(boolean z) {
        this.mForceOutput2DTex = z;
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.filter.IFilterManager
    public String getABDefaultInfoFromEffect(String str) {
        IVideoEffectProcessor iVideoEffectProcessor = this.mEffect;
        if (iVideoEffectProcessor != null && (iVideoEffectProcessor instanceof EffectWrapper)) {
            return ((EffectWrapper) iVideoEffectProcessor).getEffectABInfo(str);
        }
        return null;
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.filter.IFilterManager
    public EffectImageInfo getEffectCapturedImagewithKey(String str) {
        IVideoEffectProcessor iVideoEffectProcessor;
        if (isValid() && (iVideoEffectProcessor = this.mEffect) != null && (iVideoEffectProcessor instanceof EffectWrapper)) {
            return ((EffectWrapper) iVideoEffectProcessor).getEffectCapturedImagewithKey(str);
        }
        return null;
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.filter.IFilterManager
    public float getFilterIntensity(String str) {
        return this.mEffect.getFilterIntensity(str);
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.filter.IFilterManager
    public int notifyKeyboardHide(boolean z) {
        this.mHandler.post(new Runnable() { // from class: com.ss.ttlivestreamer.livestreamv2.filter.FilterManager.65
            public final /* synthetic */ String val$callInfo;
            public final /* synthetic */ boolean val$finished;

            @Override // java.lang.Runnable
            public void run() {
                com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$65_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public void com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$65__run$___twin___() {
                int notifyKeyboardHide;
                if (FilterManager.this.isValid() && (notifyKeyboardHide = FilterManager.this.mEffect.notifyKeyboardHide(r2)) != 0) {
                    FilterManager.this.mErrorListener.onError(notifyKeyboardHide, r3);
                }
            }

            public static void com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$65_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass65 anonymousClass65) {
                boolean LIZ;
                try {
                    anonymousClass65.com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$65__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }

            public AnonymousClass65(boolean z2, String str) {
                r2 = z2;
                r3 = str;
            }
        });
        return 0;
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.filter.VideoCatcher.VideoCatcherCallback
    public void onCatchedBuffer(VideoCatcher videoCatcher) {
        ILiveStream.CatchPicCallback catchPicCallback = this.mPicCallback;
        if (catchPicCallback != null) {
            if (videoCatcher == this.mOriginFrameCatcher) {
                catchPicCallback.onCatchedPic(false, videoCatcher);
            } else {
                if (videoCatcher != this.mEffectFrameCatcher) {
                    return;
                }
                catchPicCallback.onCatchedPic(true, videoCatcher);
            }
        }
    }

    public void onFpsPerformanceLevel(int i) {
        if (i == -1) {
            BmfVideoDenoiseFilter bmfVideoDenoiseFilter = this.mVideoDenoiseFilter;
            if (bmfVideoDenoiseFilter != null && bmfVideoDenoiseFilter.enable()) {
                this.mVideoDenoiseFilter.enable(false, 2);
                return;
            }
            BmfNoiseEvaluateFilter bmfNoiseEvaluateFilter = this.mNoiseEvaluateFilter;
            if (bmfNoiseEvaluateFilter != null && bmfNoiseEvaluateFilter.enable()) {
                this.mNoiseEvaluateFilter.enable(false);
                return;
            }
            BmfBrightenFilter bmfBrightenFilter = this.mBrightenFilter;
            if (bmfBrightenFilter == null || !bmfBrightenFilter.enable()) {
                return;
            }
            this.mBrightenFilter.enable(false);
            return;
        }
        if (i < -1) {
            BmfVideoDenoiseFilter bmfVideoDenoiseFilter2 = this.mVideoDenoiseFilter;
            if (bmfVideoDenoiseFilter2 != null && bmfVideoDenoiseFilter2.enable()) {
                this.mVideoDenoiseFilter.enable(false, 2);
            }
            BmfNoiseEvaluateFilter bmfNoiseEvaluateFilter2 = this.mNoiseEvaluateFilter;
            if (bmfNoiseEvaluateFilter2 != null && bmfNoiseEvaluateFilter2.enable()) {
                this.mNoiseEvaluateFilter.enable(false);
            }
            BmfBrightenFilter bmfBrightenFilter2 = this.mBrightenFilter;
            if (bmfBrightenFilter2 == null || !bmfBrightenFilter2.enable()) {
                return;
            }
            this.mBrightenFilter.enable(false);
            return;
        }
        if (i <= 0) {
            return;
        }
        BmfBrightenFilter bmfBrightenFilter3 = this.mBrightenFilter;
        if (bmfBrightenFilter3 != null && !bmfBrightenFilter3.enable()) {
            this.mBrightenFilter.enable(true);
            return;
        }
        BmfNoiseEvaluateFilter bmfNoiseEvaluateFilter3 = this.mNoiseEvaluateFilter;
        if (bmfNoiseEvaluateFilter3 != null && !bmfNoiseEvaluateFilter3.enable()) {
            this.mNoiseEvaluateFilter.enable(true);
            return;
        }
        BmfVideoDenoiseFilter bmfVideoDenoiseFilter3 = this.mVideoDenoiseFilter;
        if (bmfVideoDenoiseFilter3 == null || bmfVideoDenoiseFilter3.enable()) {
            return;
        }
        this.mVideoDenoiseFilter.enable(true, 2);
    }

    @Override // com.ss.ttlivestreamer.core.engine.VideoProcessor
    public VideoFrame process(VideoFrame videoFrame) {
        int i;
        checkIfNeedCatch();
        videoFrame.retain();
        if (needOriginFrame(videoFrame.getBuffer())) {
            return videoFrame;
        }
        VideoFrame[] videoFrameArr = new VideoFrame[1];
        if (this.mEnableThreeBuffer && this.mProcessType != 1) {
            AndroidRuntimeException androidRuntimeException = new AndroidRuntimeException("only processInternalV1 is supported with enableThreeBuffer=true");
            if (AnonymousClass028.LJI(androidRuntimeException, "FilterManager.process1")) {
                throw androidRuntimeException;
            }
        }
        FilterVideoBufferPool.Recycle recycle = null;
        if (this.mProcessType == 3) {
            if (!GlUtil.nativeIsOpenGlThread()) {
                AndroidRuntimeException androidRuntimeException2 = new AndroidRuntimeException("BUG!");
                if (AnonymousClass028.LJI(androidRuntimeException2, "FilterManager.process2")) {
                    throw androidRuntimeException2;
                }
            }
            FilterVideoBufferPool.Recycle buffer = this.mCropBufferPool.getBuffer(videoFrame.getRotatedWidth(), videoFrame.getRotatedHeight());
            if (buffer == null) {
                return null;
            }
            cropAndScale(buffer, videoFrame, false);
            if (!this.mEnabled) {
                return wrapperFrame(buffer, videoFrame, null, null);
            }
            recycle = buffer;
        }
        ThreadUtils.invokeAtFrontUninterruptibly(this.mHandler, new Runnable() { // from class: com.ss.ttlivestreamer.livestreamv2.filter.FilterManager.72
            public final /* synthetic */ FilterVideoBufferPool.Recycle val$finalIncomeRecycle;
            public final /* synthetic */ VideoFrame val$frame;
            public final /* synthetic */ VideoFrame[] val$frame1;

            @Override // java.lang.Runnable
            public void run() {
                com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$72_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public void com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$72__run$___twin___() {
                FilterManager filterManager = FilterManager.this;
                int i2 = filterManager.mProcessType;
                if (i2 == 3) {
                    filterManager.mTextureFrameBufferRecycle = r2;
                    r3[0] = filterManager.processInternalV3(r4);
                } else if (i2 == 2) {
                    r3[0] = filterManager.processInternalV2(r4);
                } else {
                    r3[0] = filterManager.processInternalV1(r4);
                }
                FilterVideoBufferPool.Recycle recycle2 = FilterManager.this.mTextureFrameBufferRecycle;
                if (recycle2 != null) {
                    recycle2.decRef();
                    FilterManager.this.mTextureFrameBufferRecycle = null;
                }
                FilterVideoBufferPool.Recycle recycle22 = FilterManager.this.mOut2DTexRecycle;
                if (recycle22 != null) {
                    recycle22.decRef();
                    FilterManager.this.mOut2DTexRecycle = null;
                }
            }

            public static void com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$72_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass72 anonymousClass72) {
                boolean LIZ;
                try {
                    anonymousClass72.com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$72__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }

            public AnonymousClass72(FilterVideoBufferPool.Recycle recycle2, VideoFrame[] videoFrameArr2, VideoFrame videoFrame2) {
                r2 = recycle2;
                r3 = videoFrameArr2;
                r4 = videoFrame2;
            }
        });
        if (this.mShouldCatch && (i = this.mCatchVideoFrameCount) > 0) {
            int i2 = i - 1;
            this.mCatchVideoFrameCount = i2;
            if (i2 <= 0 && !this.mKeepVideoCatcherAlive) {
                this.mHandler.postDelayed(new Runnable() { // from class: com.ss.ttlivestreamer.livestreamv2.filter.FilterManager.73
                    @Override // java.lang.Runnable
                    public void run() {
                        com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$73_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                    }

                    public void com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$73__run$___twin___() {
                        FilterManager.this.stopCatchTask(0, null);
                    }

                    public AnonymousClass73() {
                    }

                    public static void com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$73_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass73 anonymousClass73) {
                        boolean LIZ;
                        try {
                            anonymousClass73.com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$73__run$___twin___();
                        } finally {
                            if (LIZ) {
                            }
                        }
                    }
                }, 1000L);
            }
        }
        if (videoFrameArr2[0] != videoFrame2) {
            videoFrame2.release();
        }
        return videoFrameArr2[0];
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x005d A[Catch: all -> 0x00e2, TryCatch #0 {all -> 0x00e2, blocks: (B:3:0x0003, B:5:0x0015, B:10:0x0037, B:12:0x003c, B:14:0x0045, B:16:0x0049, B:18:0x0053, B:19:0x0057, B:21:0x005d, B:22:0x0063, B:24:0x0067, B:26:0x0070, B:28:0x0074, B:30:0x007a, B:31:0x008e, B:33:0x0092, B:37:0x00bd, B:39:0x00c2, B:41:0x00c6, B:43:0x00cc, B:45:0x00d0, B:46:0x00dd, B:48:0x00b4), top: B:2:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0067 A[Catch: all -> 0x00e2, TryCatch #0 {all -> 0x00e2, blocks: (B:3:0x0003, B:5:0x0015, B:10:0x0037, B:12:0x003c, B:14:0x0045, B:16:0x0049, B:18:0x0053, B:19:0x0057, B:21:0x005d, B:22:0x0063, B:24:0x0067, B:26:0x0070, B:28:0x0074, B:30:0x007a, B:31:0x008e, B:33:0x0092, B:37:0x00bd, B:39:0x00c2, B:41:0x00c6, B:43:0x00cc, B:45:0x00d0, B:46:0x00dd, B:48:0x00b4), top: B:2:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0070 A[Catch: all -> 0x00e2, TryCatch #0 {all -> 0x00e2, blocks: (B:3:0x0003, B:5:0x0015, B:10:0x0037, B:12:0x003c, B:14:0x0045, B:16:0x0049, B:18:0x0053, B:19:0x0057, B:21:0x005d, B:22:0x0063, B:24:0x0067, B:26:0x0070, B:28:0x0074, B:30:0x007a, B:31:0x008e, B:33:0x0092, B:37:0x00bd, B:39:0x00c2, B:41:0x00c6, B:43:0x00cc, B:45:0x00d0, B:46:0x00dd, B:48:0x00b4), top: B:2:0x0003 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.ss.ttlivestreamer.core.buffer.VideoFrame processInternalV1(com.ss.ttlivestreamer.core.buffer.VideoFrame r9) {
        /*
            Method dump skipped, instructions count: 315
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.ttlivestreamer.livestreamv2.filter.FilterManager.processInternalV1(com.ss.ttlivestreamer.core.buffer.VideoFrame):com.ss.ttlivestreamer.core.buffer.VideoFrame");
    }

    public VideoFrame processInternalV2(VideoFrame videoFrame) {
        int i;
        try {
            int rotatedWidth = videoFrame.getRotatedWidth();
            int rotatedHeight = videoFrame.getRotatedHeight();
            if (!getBufferCnt(rotatedWidth, rotatedHeight)) {
                if (this.mEnableDropFrameWhenNoBuffer) {
                    return null;
                }
                return returnCurrent2dTex(videoFrame);
            }
            boolean isGlFenceSyncEnabled = isGlFenceSyncEnabled();
            int cropAndScale = cropAndScale(this.mTextureFrameBufferRecycle, videoFrame, isGlFenceSyncEnabled);
            if (!this.mEnabled) {
                FilterVideoBufferPool.Recycle recycle = this.mTextureFrameBufferRecycle;
                if (recycle != null) {
                    return wrapperFrame(recycle, videoFrame, null, null);
                }
                AndroidRuntimeException androidRuntimeException = new AndroidRuntimeException("BUG!?!");
                TTLSSladarBugReportUtils.getInstance().report(androidRuntimeException, "FilterManager.processInternalV2@1");
                if (TTLSBuildConfig.canThrowException()) {
                    throw androidRuntimeException;
                }
            }
            if (this.mEnabled && isValid() && this.mOut2DTexRecycle != null) {
                LiveStreamGpuTurboWrapper liveStreamGpuTurboWrapper = this.wrapper;
                if (liveStreamGpuTurboWrapper != null && liveStreamGpuTurboWrapper.isGpuTurboEnabled()) {
                    rotatedWidth = this.wrapper.getSRResolutionWidth();
                    rotatedHeight = this.wrapper.getSRResolutionHeight();
                }
                this.mOut2DTexRecycle.setSize(rotatedWidth, rotatedHeight);
                i = this.mOut2DTexRecycle.getBuffer().getTextureId();
            } else {
                i = -1;
            }
            return onProcess(videoFrame, cropAndScale, i, isGlFenceSyncEnabled);
        } catch (Throwable th) {
            this.mProcessErrorCount++;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("FilterManager process error:");
            LIZ.append(this.mProcessErrorCount);
            AVLog.logKibana(6, "FilterManager", X1D.LIZIZ(LIZ), th);
            TTLSSladarBugReportUtils.getInstance().report(th, "FilterManager.processInternalV2@2");
            if (!TTLSBuildConfig.canThrowException() && this.mProcessErrorCount <= 30) {
                if (this.mEnableDropFrameWhenNoBuffer) {
                    return null;
                }
                return returnCurrent2dTex(videoFrame);
            }
            throw new AndroidRuntimeException("EffectProcess", th);
        }
    }

    public VideoFrame processInternalV3(VideoFrame videoFrame) {
        int i;
        FilterVideoBufferPool.Recycle recycle;
        int rotatedWidth = videoFrame.getRotatedWidth();
        int rotatedHeight = videoFrame.getRotatedHeight();
        LiveStreamGpuTurboWrapper liveStreamGpuTurboWrapper = this.wrapper;
        if (liveStreamGpuTurboWrapper != null && liveStreamGpuTurboWrapper.isGpuTurboEnabled()) {
            rotatedWidth = this.wrapper.getSRResolutionWidth();
            rotatedHeight = this.wrapper.getSRResolutionHeight();
            this.mOut2DTexRecycle = this.mSRBufferPool.getBuffer(rotatedWidth, rotatedHeight);
        } else {
            this.mOut2DTexRecycle = this.mBufferPool.getBuffer(rotatedWidth, rotatedHeight);
        }
        if (this.mOut2DTexRecycle == null) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("No enough out buffer space and drop frame at ");
            LIZ.append(videoFrame.getTimestampNs());
            AVLog.ioe("FilterManager", X1D.LIZIZ(LIZ));
            this.mNoBufferCount++;
            return null;
        }
        if (this.mEnabled && isValid() && (recycle = this.mOut2DTexRecycle) != null) {
            recycle.setSize(rotatedWidth, rotatedHeight);
            i = this.mOut2DTexRecycle.getBuffer().getTextureId();
        } else {
            i = -1;
        }
        return onProcess(videoFrame, this.mTextureFrameBufferRecycle.getBuffer().getTextureId(), i, isGlFenceSyncEnabled());
    }

    public VideoFrame processOnJava(VideoFrame videoFrame) {
        return process(videoFrame);
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.filter.IFilterManager
    public int setAudioRecognizeDict(Map<String, String[]> map) {
        this.mHandler.post(new Runnable() { // from class: com.ss.ttlivestreamer.livestreamv2.filter.FilterManager.23
            public final /* synthetic */ String val$callInfo;
            public final /* synthetic */ Map val$dict;

            @Override // java.lang.Runnable
            public void run() {
                com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$23_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public void com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$23__run$___twin___() {
                int audioRecognizeDict;
                if (FilterManager.this.isValid() && (audioRecognizeDict = FilterManager.this.mEffect.setAudioRecognizeDict(r2)) != 0) {
                    FilterManager.this.mErrorListener.onError(audioRecognizeDict, r3);
                }
            }

            public static void com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$23_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass23 anonymousClass23) {
                boolean LIZ;
                try {
                    anonymousClass23.com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$23__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }

            public AnonymousClass23(Map map2, String str) {
                r2 = map2;
                r3 = str;
            }
        });
        return 0;
    }

    public void setBlackFrameDetectThreshold(int i) {
        this.mBlackFrameDetectThreshold = i;
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.filter.IFilterManager
    public void setContourDataCallBack(IFilterManager.ContourDataCallBack contourDataCallBack) {
        this.mContourDataCallBack = contourDataCallBack;
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.filter.IFilterManager
    public void setContourDataSendInterval(int i) {
        this.mContourDataSendInterval = i;
        enableExtData(8L, i - 1);
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.filter.IFilterManager
    public void setContourInfoIndex(String str) {
        this.mContourInfoInteractId = str;
        this.mEffect.setContourInfoIndex(str);
    }

    public void setContourInfoListener(IFilterManager.ContourInfoListener contourInfoListener) {
        this.mContourInfoListener = contourInfoListener;
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.filter.IFilterManager
    public int setEffect(String str) {
        this.mHandler.post(new Runnable() { // from class: com.ss.ttlivestreamer.livestreamv2.filter.FilterManager.15
            public final /* synthetic */ String val$callInfo;
            public final /* synthetic */ String val$resPath;

            @Override // java.lang.Runnable
            public void run() {
                com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$15_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public void com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$15__run$___twin___() {
                int effect;
                if (FilterManager.this.isValid() && (effect = FilterManager.this.mEffect.setEffect(r2)) != 0) {
                    FilterManager.this.mErrorListener.onError(effect, r3);
                }
            }

            public static void com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$15_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass15 anonymousClass15) {
                boolean LIZ;
                try {
                    anonymousClass15.com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$15__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }

            public AnonymousClass15(String str2, String str22) {
                r2 = str2;
                r3 = str22;
            }
        });
        return 0;
    }

    public void setEffectAlgorithmAB(boolean z) {
        this.mHandler.post(new Runnable() { // from class: com.ss.ttlivestreamer.livestreamv2.filter.FilterManager.9
            public final /* synthetic */ boolean val$ABSwitch;

            @Override // java.lang.Runnable
            public void run() {
                com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$9_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public void com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$9__run$___twin___() {
                if (FilterManager.this.isValid()) {
                    FilterManager.this.mEffect.setAlgorithmAB(r2);
                }
            }

            public static void com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$9_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass9 anonymousClass9) {
                boolean LIZ;
                try {
                    anonymousClass9.com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$9__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }

            public AnonymousClass9(boolean z2) {
                r2 = z2;
            }
        });
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.filter.IFilterManager
    public void setEffectAudioQuirk(long j) {
        AudioDeviceModule.AudioRenderSink effectAudioRender;
        IVideoEffectProcessor iVideoEffectProcessor = this.mEffect;
        if (iVideoEffectProcessor != null && (effectAudioRender = iVideoEffectProcessor.getEffectAudioRender()) != null) {
            effectAudioRender.setQuirks(j & 7);
        }
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.filter.IFilterManager
    public void setEffectAudioVolume(float f) {
        AudioDeviceModule.AudioRenderSink effectAudioRender;
        IVideoEffectProcessor iVideoEffectProcessor = this.mEffect;
        if (iVideoEffectProcessor != null && (effectAudioRender = iVideoEffectProcessor.getEffectAudioRender()) != null) {
            this.mEffectAudioVolume = f;
            effectAudioRender.setVolume(f);
        }
        IInputAudioStream iInputAudioStream = this.mAudioStreamObserver;
        if (iInputAudioStream != null) {
            AudioMixer.AudioMixerDescription mixerDescription = iInputAudioStream.getMixerDescription();
            mixerDescription.volumeCoeff = f;
            iInputAudioStream.setMixerDescription(mixerDescription);
        }
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.filter.IFilterManager
    public void setEffectInfoChangeListener(IVideoEffectProcessor.IEffectInfoChangeListener iEffectInfoChangeListener) {
        this.mHandler.post(new RunnableC31321CQz(2, this, iEffectInfoChangeListener));
    }

    public void setEffectLogLevel(int i) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("setEffectLogLevel : ");
        LIZ.append(i);
        AVLog.logKibana(4, "FilterManager", X1D.LIZIZ(LIZ), null);
        IVideoEffectProcessor iVideoEffectProcessor = this.mEffect;
        if (iVideoEffectProcessor != null) {
            iVideoEffectProcessor.setEffectLogLevel(i);
        }
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.filter.IFilterManager
    public void setEffectMsgListener(IFilterManager.EffectMsgListener effectMsgListener) {
        this.mMsgListener = effectMsgListener;
        this.mHandler.post(new Runnable() { // from class: com.ss.ttlivestreamer.livestreamv2.filter.FilterManager.55
            public final /* synthetic */ IFilterManager.EffectMsgListener val$listener;

            @Override // java.lang.Runnable
            public void run() {
                com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$55_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public void com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$55__run$___twin___() {
                IVideoEffectProcessor iVideoEffectProcessor = FilterManager.this.mEffect;
                if (iVideoEffectProcessor != null) {
                    iVideoEffectProcessor.setEffectMsgListener(r2);
                }
            }

            public static void com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$55_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass55 anonymousClass55) {
                boolean LIZ;
                try {
                    anonymousClass55.com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$55__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }

            public AnonymousClass55(IFilterManager.EffectMsgListener effectMsgListener2) {
                r2 = effectMsgListener2;
            }
        });
    }

    public void setEnableAlgorithmSyncer(boolean z) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("setEnableAlgorithmSyncer : ");
        LIZ.append(z);
        AVLog.logKibana(4, "FilterManager", X1D.LIZIZ(LIZ), null);
        IVideoEffectProcessor iVideoEffectProcessor = this.mEffect;
        if (iVideoEffectProcessor != null) {
            iVideoEffectProcessor.setEnableAlgorithmSyncer(z);
        }
    }

    public void setEnableDropFrameWhenNoBuffer(boolean z) {
        this.mEnableDropFrameWhenNoBuffer = z;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("setEnableDropFrameWhenNoBuffer : ");
        LIZ.append(z);
        AVLog.logKibana(4, "FilterManager", X1D.LIZIZ(LIZ), null);
    }

    public void setEnableOesTo2DAsync(boolean z) {
        this.mEnableOesTo2DAsync = z;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("setEnableOesTo2DAsync : ");
        LIZ.append(z);
        AVLog.logKibana(4, "FilterManager", X1D.LIZIZ(LIZ), null);
    }

    public void setEnableThreeBuffer(boolean z) {
        this.mEnableThreeBuffer = z;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("setEnableThreeBuffer : ");
        LIZ.append(z);
        AVLog.logKibana(4, "FilterManager", X1D.LIZIZ(LIZ), null);
        IVideoEffectProcessor iVideoEffectProcessor = this.mEffect;
        if (iVideoEffectProcessor != null) {
            iVideoEffectProcessor.setEnableThreeBuffer(z);
        }
    }

    public void setEnableVideoBlackFrameCheck(boolean z) {
        this.mEnableVideoBlackFrameCheck = z;
    }

    public void setEnableVpassEnableFindContour(boolean z) {
        this.mVpassEnableFindContour = z;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("setEnableVpassEnableFindContour. enable = ");
        LIZ.append(z);
        AVLog.ioi("FilterManager", X1D.LIZIZ(LIZ));
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.filter.IFilterManager
    public void setErrorListener(IFilterManager.ErrorListener errorListener) {
        this.mErrorListener = errorListener;
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.filter.IFilterManager
    public void setExpressionDetectListener(IFilterManager.ExpressionDetectListener expressionDetectListener) {
        this.mHandler.post(new Runnable() { // from class: com.ss.ttlivestreamer.livestreamv2.filter.FilterManager.58
            public final /* synthetic */ IFilterManager.ExpressionDetectListener val$listener;

            @Override // java.lang.Runnable
            public void run() {
                com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$58_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public void com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$58__run$___twin___() {
                IVideoEffectProcessor iVideoEffectProcessor = FilterManager.this.mEffect;
                if (iVideoEffectProcessor != null) {
                    iVideoEffectProcessor.setExpressionDetectListener(r2);
                }
            }

            public static void com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$58_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass58 anonymousClass58) {
                boolean LIZ;
                try {
                    anonymousClass58.com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$58__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }

            public AnonymousClass58(IFilterManager.ExpressionDetectListener expressionDetectListener2) {
                r2 = expressionDetectListener2;
            }
        });
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.filter.IFilterManager
    public int setFaceAttribute(boolean z) {
        this.mHandler.post(new Runnable() { // from class: com.ss.ttlivestreamer.livestreamv2.filter.FilterManager.13
            public final /* synthetic */ String val$callInfo;
            public final /* synthetic */ boolean val$needFaceAttribute;

            @Override // java.lang.Runnable
            public void run() {
                com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$13_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public void com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$13__run$___twin___() {
                int faceAttribute;
                if (FilterManager.this.isValid() && (faceAttribute = FilterManager.this.mEffect.setFaceAttribute(r2)) != 0) {
                    FilterManager.this.mErrorListener.onError(faceAttribute, r3);
                }
            }

            public static void com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$13_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass13 anonymousClass13) {
                boolean LIZ;
                try {
                    anonymousClass13.com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$13__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }

            public AnonymousClass13(boolean z2, String str) {
                r2 = z2;
                r3 = str;
            }
        });
        return 0;
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.filter.IFilterManager
    public void setFaceDetectListener(IFilterManager.FaceDetectListener faceDetectListener) {
        this.mHandler.post(new Runnable() { // from class: com.ss.ttlivestreamer.livestreamv2.filter.FilterManager.56
            public final /* synthetic */ IFilterManager.FaceDetectListener val$listener;

            @Override // java.lang.Runnable
            public void run() {
                com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$56_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public void com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$56__run$___twin___() {
                IVideoEffectProcessor iVideoEffectProcessor = FilterManager.this.mEffect;
                if (iVideoEffectProcessor != null) {
                    iVideoEffectProcessor.setFaceDetectListener(r2);
                }
            }

            public static void com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$56_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass56 anonymousClass56) {
                boolean LIZ;
                try {
                    anonymousClass56.com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$56__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }

            public AnonymousClass56(IFilterManager.FaceDetectListener faceDetectListener2) {
                r2 = faceDetectListener2;
            }
        });
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.filter.IFilterManager
    public void setFindContourListener(IFilterManager.FindContourListener findContourListener) {
        this.mFindContourListener = findContourListener;
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.filter.IFilterManager
    public void setLicenseToEffect(String str) {
        this.mHandler.post(new Runnable() { // from class: com.ss.ttlivestreamer.livestreamv2.filter.FilterManager.62
            public final /* synthetic */ String val$callInfo;
            public final /* synthetic */ String val$license;

            @Override // java.lang.Runnable
            public void run() {
                com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$62_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public void com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$62__run$___twin___() {
                int effectLicense;
                if (FilterManager.this.isValid() && (effectLicense = FilterManager.this.mEffect.setEffectLicense(r2)) != 0) {
                    FilterManager.this.mErrorListener.onError(effectLicense, r3);
                }
            }

            public static void com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$62_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass62 anonymousClass62) {
                boolean LIZ;
                try {
                    anonymousClass62.com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$62__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }

            public AnonymousClass62(String str2, String str22) {
                r2 = str2;
                r3 = str22;
            }
        });
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.filter.IFilterManager
    public void setMicrophoneDetectListener(IFilterManager.MicrophoneDetectListener microphoneDetectListener) {
        this.mHandler.post(new Runnable() { // from class: com.ss.ttlivestreamer.livestreamv2.filter.FilterManager.59
            public final /* synthetic */ IFilterManager.MicrophoneDetectListener val$listener;

            @Override // java.lang.Runnable
            public void run() {
                com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$59_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public void com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$59__run$___twin___() {
                IVideoEffectProcessor iVideoEffectProcessor = FilterManager.this.mEffect;
                if (iVideoEffectProcessor != null) {
                    iVideoEffectProcessor.setMicrophoneDetectListener(r2);
                }
            }

            public static void com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$59_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass59 anonymousClass59) {
                boolean LIZ;
                try {
                    anonymousClass59.com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$59__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }

            public AnonymousClass59(IFilterManager.MicrophoneDetectListener microphoneDetectListener2) {
                r2 = microphoneDetectListener2;
            }
        });
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.filter.IFilterManager
    public void setMusicNodeFilePath(String str) {
        if (str == null) {
            str = "";
        }
        this.mHandler.post(new Runnable() { // from class: com.ss.ttlivestreamer.livestreamv2.filter.FilterManager.60
            public final /* synthetic */ String val$finalFilePath;

            @Override // java.lang.Runnable
            public void run() {
                com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$60_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public void com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$60__run$___twin___() {
                IVideoEffectProcessor iVideoEffectProcessor = FilterManager.this.mEffect;
                if (iVideoEffectProcessor != null) {
                    iVideoEffectProcessor.setMusicNodeFilePath(r2);
                }
            }

            public static void com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$60_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass60 anonymousClass60) {
                boolean LIZ;
                try {
                    anonymousClass60.com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$60__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }

            public AnonymousClass60(String str2) {
                r2 = str2;
            }
        });
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.filter.IFilterManager
    public void setRenderSinkOnlyMixWithRTC(boolean z) {
        AudioDeviceModule.AudioRenderSink effectAudioRender;
        long j;
        IVideoEffectProcessor iVideoEffectProcessor = this.mEffect;
        if (iVideoEffectProcessor != null && (effectAudioRender = iVideoEffectProcessor.getEffectAudioRender()) != null) {
            if (z) {
                this.mOriginAudioRenderQuirks = effectAudioRender.getQuirks();
                j = 4;
            } else {
                j = this.mOriginAudioRenderQuirks;
            }
            effectAudioRender.setQuirks(j);
        }
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.filter.IFilterManager
    public void setSendContourInfoType(int i) {
        if (i == 1 || i == 2) {
            this.mEffect.setSendContourInfoType(i);
            this.mSendContourInfoType = i;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("setSendContourInfoType success. type = ");
            LIZ.append(i);
            AVLog.ioi("FilterManager", X1D.LIZIZ(LIZ));
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("setSendContourInfoType fail. type = ");
        LIZ2.append(i);
        AVLog.iow("FilterManager", X1D.LIZIZ(LIZ2));
    }

    @Override // com.ss.ttlivestreamer.core.buffer.TextureBufferImpl.ToI420Interface
    public VideoFrame.I420Buffer toI420(VideoFrame.TextureBuffer textureBuffer) {
        VideoFrame.I420Buffer[] i420BufferArr = new VideoFrame.I420Buffer[1];
        if (this.mYuvConvertThread == null && this.mYuvConvertHandler == null) {
            GLThread glThread = TTLSPreInitBusiness.getInstance().getGlThread("YuvConvertThread");
            this.mYuvConvertThread = glThread;
            if (glThread == null) {
                GLThread lockGLThread = SafeHandlerThreadPoolExecutor.lockGLThread("YuvConvertThread");
                this.mYuvConvertThread = lockGLThread;
                lockGLThread.start();
            }
            this.mYuvConvertHandler = this.mYuvConvertThread.getHandler();
        }
        Handler handler = this.mYuvConvertHandler;
        if (handler != null && this.mYuvConvertThread != null) {
            ThreadUtils.invokeAtFrontUninterruptibly(handler, new ARunnableS7S0301000_6(1, this, i420BufferArr, textureBuffer, 1));
        }
        if (i420BufferArr[0] == null) {
            AndroidRuntimeException androidRuntimeException = new AndroidRuntimeException("BUG, Please fixed me");
            if (AnonymousClass028.LJI(androidRuntimeException, "FilterManager.toI420")) {
                throw androidRuntimeException;
            }
        }
        return i420BufferArr[0];
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.filter.IFilterManager
    public void updateEffAudioTimestampMs(long j) {
        this.mEffectAudioTimestampMs = j;
    }

    /* renamed from: updateVideoDenoiseFilter */
    public void lambda$updateVideoDenoiseFilter$9(JSONObject jSONObject) {
        if (C16880lQ.LLLLIIIILLL() != this.mHandler.getLooper().getThread()) {
            this.mHandler.post(new ARunnableS7S0201000_4(3, this, jSONObject, 2));
            return;
        }
        BmfVideoDenoiseFilter bmfVideoDenoiseFilter = this.mVideoDenoiseFilter;
        if (bmfVideoDenoiseFilter != null) {
            bmfVideoDenoiseFilter.updateParams(jSONObject);
        }
    }

    private int brightnControl(VideoFrame videoFrame, int i) {
        FilterVideoBufferPool.Recycle buffer;
        if (this.mBrightenFilter == null) {
            return i;
        }
        int rotatedWidth = videoFrame.getRotatedWidth();
        int rotatedHeight = videoFrame.getRotatedHeight();
        LiveStreamGpuTurboWrapper liveStreamGpuTurboWrapper = this.wrapper;
        if (liveStreamGpuTurboWrapper != null && liveStreamGpuTurboWrapper.isGpuTurboEnabled()) {
            rotatedWidth = this.wrapper.getSRResolutionWidth();
            rotatedHeight = this.wrapper.getSRResolutionHeight();
            buffer = this.mSRBufferPool.getBuffer(rotatedWidth, rotatedHeight);
        } else {
            buffer = this.mBufferPool.getBuffer(rotatedWidth, rotatedHeight);
        }
        if (buffer == null) {
            return i;
        }
        buffer.setSize(rotatedWidth, rotatedHeight);
        GLES20.glBindFramebuffer(36160, buffer.getBuffer().getFrameBufferId());
        int process = this.mBrightenFilter.process(i, buffer.getBuffer().getTextureId(), rotatedWidth, rotatedHeight, videoFrame.getTimestampNs() / 1000000);
        GLES20.glBindFramebuffer(36160, 0);
        if (process == 0) {
            this.mOut2DTexRecycle.decRef();
            this.mOut2DTexRecycle = buffer;
            return buffer.getBuffer().getTextureId();
        }
        buffer.decRef();
        return i;
    }

    private boolean getBufferCnt(int i, int i2) {
        FilterVideoBufferPool.Recycle buffer = this.mBufferPool.getBuffer(i, i2);
        this.mTextureFrameBufferRecycle = buffer;
        if (buffer == null) {
            AVLog.ioe("FilterManager", "No enough in buffer space and drop frame");
            this.mNoBufferCount++;
            return false;
        }
        if (this.mEnabled || this.mForceOutput2DTex) {
            LiveStreamGpuTurboWrapper liveStreamGpuTurboWrapper = this.wrapper;
            if (liveStreamGpuTurboWrapper != null && liveStreamGpuTurboWrapper.isGpuTurboEnabled()) {
                this.mOut2DTexRecycle = this.mSRBufferPool.getBuffer(this.wrapper.getSRResolutionWidth(), this.wrapper.getSRResolutionHeight());
            } else {
                this.mOut2DTexRecycle = this.mBufferPool.getBuffer(i, i2);
            }
            if (this.mOut2DTexRecycle == null) {
                AVLog.ioe("FilterManager", "No enough out buffer space and drop frame");
                this.mNoBufferCount++;
                return false;
            }
        }
        return true;
    }

    public static /* synthetic */ void lambda$new$0(int i, String str) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Effect api return error: ");
        LIZ.append(i);
        LIZ.append(". Calling info: ");
        LIZ.append(str);
        AVLog.ioe("FilterManager", X1D.LIZIZ(LIZ));
    }

    public /* synthetic */ void lambda$toI420$11(VideoFrame.I420Buffer[] i420BufferArr, VideoFrame.TextureBuffer textureBuffer) {
        if (this.mEffect != null && this.mYuvConverter == null) {
            this.mYuvConverter = new YuvConverter();
        }
        YuvConverter yuvConverter = this.mYuvConverter;
        if (yuvConverter != null) {
            i420BufferArr[0] = yuvConverter.convert(textureBuffer);
        }
    }

    public void catchPic(Bundle bundle, ILiveStream.CatchPicCallback catchPicCallback) {
        this.mHandler.post(new Runnable() { // from class: com.ss.ttlivestreamer.livestreamv2.filter.FilterManager.69
            public final /* synthetic */ ILiveStream.CatchPicCallback val$callback;
            public final /* synthetic */ Bundle val$param;

            @Override // java.lang.Runnable
            public void run() {
                com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$69_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public void com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$69__run$___twin___() {
                int i = r2.getInt("width");
                int i2 = r2.getInt("height");
                boolean z = r2.getBoolean("outputPixelBufferOrigin");
                boolean z2 = r2.getBoolean("outputPixelBufferWithEffect");
                FilterManager.this.mKeepVideoCatcherAlive = r2.getBoolean("keepVideoCatcherAlive");
                FilterManager filterManager = FilterManager.this;
                filterManager.mPicCallback = r3;
                if (z) {
                    if (filterManager.mOriginFrameCatcher == null) {
                        filterManager.mOriginFrameCatcher = new VideoCatcher();
                        FilterManager filterManager2 = FilterManager.this;
                        filterManager2.mOriginFrameCatcher.start(i, i2, filterManager2, filterManager2.mHandler);
                    }
                } else {
                    VideoCatcher videoCatcher = filterManager.mOriginFrameCatcher;
                    if (videoCatcher != null) {
                        videoCatcher.stop(0);
                        FilterManager.this.mOriginFrameCatcher = null;
                    }
                }
                if (z2) {
                    FilterManager filterManager3 = FilterManager.this;
                    if (filterManager3.mEffectFrameCatcher == null) {
                        filterManager3.mEffectFrameCatcher = new VideoCatcher();
                        FilterManager filterManager4 = FilterManager.this;
                        filterManager4.mEffectFrameCatcher.start(i, i2, filterManager4, filterManager4.mHandler);
                    }
                } else {
                    VideoCatcher videoCatcher2 = FilterManager.this.mEffectFrameCatcher;
                    if (videoCatcher2 != null) {
                        videoCatcher2.stop(0);
                        FilterManager.this.mEffectFrameCatcher = null;
                    }
                }
                if (z || z2) {
                    FilterManager.this.mCatchVideoFrameCount = r2.getInt("frameCount");
                    FilterManager.this.mCatchVideoFrameInterval = (int) (r2.getFloat("interval") * 1000.0f);
                }
            }

            public static void com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$69_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass69 anonymousClass69) {
                boolean LIZ;
                try {
                    anonymousClass69.com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$69__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }

            public AnonymousClass69(Bundle bundle2, ILiveStream.CatchPicCallback catchPicCallback2) {
                r2 = bundle2;
                r3 = catchPicCallback2;
            }
        });
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.filter.IFilterManager
    public int composerAppendNodes(String[] strArr, int i) {
        this.mHandler.post(new Runnable() { // from class: com.ss.ttlivestreamer.livestreamv2.filter.FilterManager.31
            public final /* synthetic */ String val$callInfo;
            public final /* synthetic */ int val$nodeNum;
            public final /* synthetic */ String[] val$nodes;

            @Override // java.lang.Runnable
            public void run() {
                com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$31_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public void com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$31__run$___twin___() {
                int composerAppendNodes;
                if (FilterManager.this.isValid() && (composerAppendNodes = FilterManager.this.mEffect.composerAppendNodes(r2, r3)) != 0) {
                    FilterManager.this.mErrorListener.onError(composerAppendNodes, r4);
                }
            }

            public static void com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$31_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass31 anonymousClass31) {
                boolean LIZ;
                try {
                    anonymousClass31.com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$31__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }

            public AnonymousClass31(String[] strArr2, int i2, String str) {
                r2 = strArr2;
                r3 = i2;
                r4 = str;
            }
        });
        return 0;
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.filter.IFilterManager
    public int composerReloadNodes(String[] strArr, int i) {
        this.mHandler.post(new Runnable() { // from class: com.ss.ttlivestreamer.livestreamv2.filter.FilterManager.30
            public final /* synthetic */ String val$callInfo;
            public final /* synthetic */ int val$nodeNum;
            public final /* synthetic */ String[] val$nodePaths;

            @Override // java.lang.Runnable
            public void run() {
                com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$30_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public void com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$30__run$___twin___() {
                int composerReloadNodes;
                if (FilterManager.this.isValid() && (composerReloadNodes = FilterManager.this.mEffect.composerReloadNodes(r2, r3)) != 0) {
                    FilterManager.this.mErrorListener.onError(composerReloadNodes, r4);
                }
            }

            public static void com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$30_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass30 anonymousClass30) {
                boolean LIZ;
                try {
                    anonymousClass30.com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$30__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }

            public AnonymousClass30(String[] strArr2, int i2, String str) {
                r2 = strArr2;
                r3 = i2;
                r4 = str;
            }
        });
        return 0;
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.filter.IFilterManager
    public int composerRemoveNodes(String[] strArr, int i) {
        this.mHandler.post(new Runnable() { // from class: com.ss.ttlivestreamer.livestreamv2.filter.FilterManager.32
            public final /* synthetic */ String val$callInfo;
            public final /* synthetic */ int val$nodeNum;
            public final /* synthetic */ String[] val$nodePaths;

            @Override // java.lang.Runnable
            public void run() {
                com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$32_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public void com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$32__run$___twin___() {
                if (FilterManager.this.isValid()) {
                    int composerRemoveNodes = FilterManager.this.mEffect.composerRemoveNodes(r2, r3);
                    if (composerRemoveNodes != 0) {
                        FilterManager.this.mErrorListener.onError(composerRemoveNodes, r4);
                    }
                    FilterManager filterManager = FilterManager.this;
                    if (filterManager.mEnalbeAudioGraphSticker) {
                        filterManager.destroyAudioGraphStickerContext();
                    }
                }
            }

            public static void com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$32_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass32 anonymousClass32) {
                boolean LIZ;
                try {
                    anonymousClass32.com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$32__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }

            public AnonymousClass32(String[] strArr2, int i2, String str) {
                r2 = strArr2;
                r3 = i2;
                r4 = str;
            }
        });
        return 0;
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.filter.IFilterManager
    public int composerSetMode(int i, int i2) {
        this.mHandler.post(new Runnable() { // from class: com.ss.ttlivestreamer.livestreamv2.filter.FilterManager.26
            public final /* synthetic */ String val$callInfo;
            public final /* synthetic */ int val$mode;
            public final /* synthetic */ int val$orderType;

            @Override // java.lang.Runnable
            public void run() {
                com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$26_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public void com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$26__run$___twin___() {
                int composerSetMode;
                if (FilterManager.this.isValid() && (composerSetMode = FilterManager.this.mEffect.composerSetMode(r2, r3)) != 0) {
                    FilterManager.this.mErrorListener.onError(composerSetMode, r4);
                }
            }

            public static void com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$26_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass26 anonymousClass26) {
                boolean LIZ;
                try {
                    anonymousClass26.com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$26__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }

            public AnonymousClass26(int i3, int i22, String str) {
                r2 = i3;
                r3 = i22;
                r4 = str;
            }
        });
        return 0;
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.filter.IFilterManager
    public int composerSetNodes(String[] strArr, int i) {
        this.mHandler.post(new Runnable() { // from class: com.ss.ttlivestreamer.livestreamv2.filter.FilterManager.27
            public final /* synthetic */ String val$callInfo;
            public final /* synthetic */ int val$nodeNum;
            public final /* synthetic */ String[] val$nodePaths;

            @Override // java.lang.Runnable
            public void run() {
                com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$27_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public void com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$27__run$___twin___() {
                int composerSetNodes;
                if (FilterManager.this.isValid() && (composerSetNodes = FilterManager.this.mEffect.composerSetNodes(r2, r3)) != 0) {
                    FilterManager.this.mErrorListener.onError(composerSetNodes, r4);
                }
            }

            public static void com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$27_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass27 anonymousClass27) {
                boolean LIZ;
                try {
                    anonymousClass27.com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$27__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }

            public AnonymousClass27(String[] strArr2, int i2, String str) {
                r2 = strArr2;
                r3 = i2;
                r4 = str;
            }
        });
        return 0;
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.filter.IFilterManager
    public void configGpuTurbo(LiveStreamGpuTurboWrapper liveStreamGpuTurboWrapper, AdaptResolutionUtils adaptResolutionUtils) {
        this.wrapper = liveStreamGpuTurboWrapper;
        this.adaptResolutionUtils = adaptResolutionUtils;
    }

    public void enableExtData(long j, int i) {
        this.mExtrDataFlags |= j;
        if (i >= 0 && i < this.mExtraDataGop) {
            this.mExtraDataGop = i;
        }
        this.mExtraDataGop = i;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("enableExtData ");
        LIZ.append(j);
        LIZ.append(" gop ");
        LIZ.append(i);
        AVLog.iod("FilterManager", X1D.LIZIZ(LIZ));
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.filter.IFilterManager
    public int enableFindContour(boolean z, String str) {
        if (!this.mVpassEnableFindContour) {
            return -2;
        }
        if (isValid()) {
            int enableFindContour = this.mEffect.enableFindContour(z, str);
            if (enableFindContour == 0) {
                this.mEnableFindContour = z;
                enableExtData(8L, this.mContourDataSendInterval - 1);
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("enableFindContour. enable = ");
                LIZ.append(z);
                AVLog.ioi("FilterManager", X1D.LIZIZ(LIZ));
                return enableFindContour;
            }
            return enableFindContour;
        }
        return -1;
    }

    public void enableVideoDenoise(boolean z, int i) {
        BmfVideoDenoiseFilter bmfVideoDenoiseFilter = this.mVideoDenoiseFilter;
        if (bmfVideoDenoiseFilter != null) {
            bmfVideoDenoiseFilter.enable(z, i);
        }
    }

    /* renamed from: initColorHistFilter */
    public void lambda$initColorHistFilter$7(final JSONObject jSONObject, final BmfColorHistFilter.ResultCallback resultCallback) {
        if (C16880lQ.LLLLIIIILLL() != this.mHandler.getLooper().getThread()) {
            this.mHandler.post(new Runnable() { // from class: X.P39
                @Override // java.lang.Runnable
                public final void run() {
                    FilterManager.this.lambda$initColorHistFilter$7(jSONObject, resultCallback);
                }
            });
        } else if (this.mColorHistFilter == null) {
            this.mColorHistFilter = BmfColorHistFilter.Create(jSONObject, resultCallback);
        }
    }

    public synchronized void initEffectWrapper(AudioDeviceModule audioDeviceModule, boolean z) {
        ThreadUtils.invokeAtFrontUninterruptibly(this.mHandler, new Runnable() { // from class: com.ss.ttlivestreamer.livestreamv2.filter.FilterManager.5
            public final /* synthetic */ boolean val$isEdgeRender;
            public final /* synthetic */ AudioDeviceModule val$module;

            @Override // java.lang.Runnable
            public void run() {
                com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$5_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public void com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$5__run$___twin___() {
                IInputAudioStream iInputAudioStream;
                FilterManager filterManager = FilterManager.this;
                if (filterManager.mEffect == null) {
                    filterManager.mEffect = new EffectWrapper(r2, r3);
                    if (!FilterManager.this.mEffect.valid()) {
                        FilterManager.this.mEffect.release();
                        FilterManager.this.mEffect = null;
                        return;
                    }
                    AudioDeviceModule.AudioRenderSink effectAudioRender = FilterManager.this.mEffect.getEffectAudioRender();
                    if (effectAudioRender != null && (iInputAudioStream = FilterManager.this.mAudioStreamObserver) != null) {
                        effectAudioRender.setAudioTrack(iInputAudioStream.getAudioTrack());
                        effectAudioRender.setVolume(FilterManager.this.mEffectAudioVolume);
                        AudioMixer.AudioMixerDescription mixerDescription = FilterManager.this.mAudioStreamObserver.getMixerDescription();
                        FilterManager filterManager2 = FilterManager.this;
                        mixerDescription.volumeCoeff = filterManager2.mEffectAudioVolume;
                        filterManager2.mAudioStreamObserver.start();
                    }
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("Using Effect info ");
                    LIZ.append(FilterManager.this.mEffect.name());
                    LIZ.append(" ");
                    LIZ.append(FilterManager.this.mEffect.getEffectVersion());
                    AVLog.iow("FilterManager", X1D.LIZIZ(LIZ));
                }
            }

            public static void com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$5_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass5 anonymousClass5) {
                boolean LIZ;
                try {
                    anonymousClass5.com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$5__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }

            public AnonymousClass5(AudioDeviceModule audioDeviceModule2, boolean z2) {
                r2 = audioDeviceModule2;
                r3 = z2;
            }
        });
    }

    public void onCatchError(int i, String str) {
        stopCatchTask(i, str);
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.filter.VideoCatcher.VideoCatcherCallback
    public void onError(int i, String str) {
        onCatchError(i, str);
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.filter.IFilterManager
    public void processDoubleClickEvent(float f, float f2) {
        this.mHandler.post(new Runnable() { // from class: com.ss.ttlivestreamer.livestreamv2.filter.FilterManager.47
            public final /* synthetic */ float val$x;
            public final /* synthetic */ float val$y;

            @Override // java.lang.Runnable
            public void run() {
                com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$47_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public void com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$47__run$___twin___() {
                if (FilterManager.this.isValid()) {
                    FilterManager.this.mEffect.processDoubleClickEvent(r2, r3);
                }
            }

            public static void com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$47_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass47 anonymousClass47) {
                boolean LIZ;
                try {
                    anonymousClass47.com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$47__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }

            public AnonymousClass47(float f3, float f22) {
                r2 = f3;
                r3 = f22;
            }
        });
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.filter.IFilterManager
    public void processLongPressEvent(float f, float f2) {
        this.mHandler.post(new Runnable() { // from class: com.ss.ttlivestreamer.livestreamv2.filter.FilterManager.46
            public final /* synthetic */ float val$x;
            public final /* synthetic */ float val$y;

            @Override // java.lang.Runnable
            public void run() {
                com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$46_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public void com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$46__run$___twin___() {
                if (FilterManager.this.isValid()) {
                    FilterManager.this.mEffect.processLongPressEvent(r2, r3);
                }
            }

            public static void com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$46_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass46 anonymousClass46) {
                boolean LIZ;
                try {
                    anonymousClass46.com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$46__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }

            public AnonymousClass46(float f3, float f22) {
                r2 = f3;
                r3 = f22;
            }
        });
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.filter.IFilterManager
    public void processRotationEvent(float f, float f2) {
        this.mHandler.post(new Runnable() { // from class: com.ss.ttlivestreamer.livestreamv2.filter.FilterManager.51
            public final /* synthetic */ float val$factor;
            public final /* synthetic */ float val$rotation;

            @Override // java.lang.Runnable
            public void run() {
                com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$51_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public void com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$51__run$___twin___() {
                if (FilterManager.this.isValid()) {
                    FilterManager.this.mEffect.processRotationEvent(r2, r3);
                }
            }

            public static void com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$51_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass51 anonymousClass51) {
                boolean LIZ;
                try {
                    anonymousClass51.com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$51__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }

            public AnonymousClass51(float f3, float f22) {
                r2 = f3;
                r3 = f22;
            }
        });
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.filter.IFilterManager
    public void processScaleEvent(float f, float f2) {
        this.mHandler.post(new Runnable() { // from class: com.ss.ttlivestreamer.livestreamv2.filter.FilterManager.50
            public final /* synthetic */ float val$factor;
            public final /* synthetic */ float val$scale;

            @Override // java.lang.Runnable
            public void run() {
                com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$50_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public void com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$50__run$___twin___() {
                if (FilterManager.this.isValid()) {
                    FilterManager.this.mEffect.processScaleEvent(r2, r3);
                }
            }

            public static void com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$50_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass50 anonymousClass50) {
                boolean LIZ;
                try {
                    anonymousClass50.com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$50__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }

            public AnonymousClass50(float f3, float f22) {
                r2 = f3;
                r3 = f22;
            }
        });
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.filter.IFilterManager
    public void processTouchEvent(float f, float f2) {
        this.mHandler.post(new Runnable() { // from class: com.ss.ttlivestreamer.livestreamv2.filter.FilterManager.43
            public final /* synthetic */ float val$x;
            public final /* synthetic */ float val$y;

            @Override // java.lang.Runnable
            public void run() {
                com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$43_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public void com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$43__run$___twin___() {
                if (FilterManager.this.isValid()) {
                    FilterManager.this.mEffect.processTouchEvent(r2, r3);
                }
            }

            public static void com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$43_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass43 anonymousClass43) {
                boolean LIZ;
                try {
                    anonymousClass43.com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$43__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }

            public AnonymousClass43(float f3, float f22) {
                r2 = f3;
                r3 = f22;
            }
        });
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.filter.IFilterManager
    public void setABInfoToEffect(JSONObject jSONObject, String str) {
        this.mHandler.post(new Runnable() { // from class: com.ss.ttlivestreamer.livestreamv2.filter.FilterManager.61
            public final /* synthetic */ String val$callInfo;
            public final /* synthetic */ JSONObject val$json;
            public final /* synthetic */ String val$license;

            @Override // java.lang.Runnable
            public void run() {
                com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$61_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public void com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$61__run$___twin___() {
                int effectABInfo;
                if (FilterManager.this.isValid() && (effectABInfo = FilterManager.this.mEffect.setEffectABInfo(r2, r3)) != 0) {
                    FilterManager.this.mErrorListener.onError(effectABInfo, r4);
                }
            }

            public static void com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$61_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass61 anonymousClass61) {
                boolean LIZ;
                try {
                    anonymousClass61.com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$61__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }

            public AnonymousClass61(JSONObject jSONObject2, String str2, String str22) {
                r2 = jSONObject2;
                r3 = str2;
                r4 = str22;
            }
        });
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.filter.IFilterManager
    public int setCustomEffect(String str, String str2) {
        this.mHandler.post(new Runnable() { // from class: com.ss.ttlivestreamer.livestreamv2.filter.FilterManager.16
            public final /* synthetic */ String val$callInfo;
            public final /* synthetic */ String val$renderCacheKey;
            public final /* synthetic */ String val$resPath;

            @Override // java.lang.Runnable
            public void run() {
                com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$16_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public void com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$16__run$___twin___() {
                int customEffect;
                if (FilterManager.this.isValid() && (customEffect = FilterManager.this.mEffect.setCustomEffect(r2, r3)) != 0) {
                    FilterManager.this.mErrorListener.onError(customEffect, r4);
                }
            }

            public static void com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$16_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass16 anonymousClass16) {
                boolean LIZ;
                try {
                    anonymousClass16.com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$16__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }

            public AnonymousClass16(String str3, String str22, String str32) {
                r2 = str3;
                r3 = str22;
                r4 = str32;
            }
        });
        return 0;
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.filter.IFilterManager
    public int setCustomEffectOrientation(String str, int i) {
        this.mHandler.post(new Runnable() { // from class: com.ss.ttlivestreamer.livestreamv2.filter.FilterManager.18
            public final /* synthetic */ String val$callInfo;
            public final /* synthetic */ String val$renderCacheKey;
            public final /* synthetic */ int val$rotateType;

            @Override // java.lang.Runnable
            public void run() {
                com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$18_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public void com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$18__run$___twin___() {
                int customEffectOrientation;
                if (FilterManager.this.isValid() && (customEffectOrientation = FilterManager.this.mEffect.setCustomEffectOrientation(r2, r3)) != 0) {
                    FilterManager.this.mErrorListener.onError(customEffectOrientation, r4);
                }
            }

            public static void com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$18_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass18 anonymousClass18) {
                boolean LIZ;
                try {
                    anonymousClass18.com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$18__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }

            public AnonymousClass18(String str2, int i2, String str22) {
                r2 = str2;
                r3 = i2;
                r4 = str22;
            }
        });
        return 0;
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.filter.IFilterManager
    public int setEffect(String str, boolean z) {
        this.mHandler.post(new Runnable() { // from class: com.ss.ttlivestreamer.livestreamv2.filter.FilterManager.14
            public final /* synthetic */ String val$callInfo;
            public final /* synthetic */ boolean val$forceSticker;
            public final /* synthetic */ String val$resPath;

            @Override // java.lang.Runnable
            public void run() {
                com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$14_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public void com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$14__run$___twin___() {
                if (FilterManager.this.isValid()) {
                    FilterManager filterManager = FilterManager.this;
                    filterManager.mForceSticker = r2;
                    int effect = filterManager.mEffect.setEffect(r3);
                    if (effect != 0) {
                        FilterManager.this.mErrorListener.onError(effect, r4);
                    }
                }
            }

            public static void com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$14_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass14 anonymousClass14) {
                boolean LIZ;
                try {
                    anonymousClass14.com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$14__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }

            public AnonymousClass14(boolean z2, String str2, String str22) {
                r2 = z2;
                r3 = str2;
                r4 = str22;
            }
        });
        return 0;
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.filter.IFilterManager
    public int setFilter(String str, float f) {
        this.mHandler.post(new Runnable() { // from class: com.ss.ttlivestreamer.livestreamv2.filter.FilterManager.19
            public final /* synthetic */ String val$callInfo;
            public final /* synthetic */ float val$intensity;
            public final /* synthetic */ String val$resPath;

            @Override // java.lang.Runnable
            public void run() {
                com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$19_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public void com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$19__run$___twin___() {
                int filter;
                if (FilterManager.this.isValid() && (filter = FilterManager.this.mEffect.setFilter(r2, r3)) != 0) {
                    FilterManager.this.mErrorListener.onError(filter, r4);
                }
            }

            public static void com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$19_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass19 anonymousClass19) {
                boolean LIZ;
                try {
                    anonymousClass19.com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$19__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }

            public AnonymousClass19(String str2, float f2, String str22) {
                r2 = str2;
                r3 = f2;
                r4 = str22;
            }
        });
        return 0;
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.filter.IFilterManager
    public void setLicenseToEffect(String str, boolean z) {
        if (z) {
            this.mHandler.post(new Runnable() { // from class: com.ss.ttlivestreamer.livestreamv2.filter.FilterManager.63
                public final /* synthetic */ String val$license;

                @Override // java.lang.Runnable
                public void run() {
                    com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$63_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                }

                public void com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$63__run$___twin___() {
                    if (FilterManager.this.isValid()) {
                        FilterManager.this.mEffect.insertEffectLicense(r2);
                    }
                }

                public static void com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$63_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass63 anonymousClass63) {
                    boolean LIZ;
                    try {
                        anonymousClass63.com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$63__run$___twin___();
                    } finally {
                        if (LIZ) {
                        }
                    }
                }

                public AnonymousClass63(String str2) {
                    r2 = str2;
                }
            });
        } else {
            setLicenseToEffect(str2);
        }
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.filter.IFilterManager
    public void setRenderCacheInt(String str, int i) {
        if (isValid()) {
            this.mEffect.setRenderCacheInt(str, i);
        }
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.filter.IFilterManager
    public void setRenderCacheString(String str, String str2) {
        if (isValid()) {
            this.mEffect.setRenderCacheString(str, str2);
        }
    }

    public void stopCatchTask(int i, String str) {
        if (C16880lQ.LLLLIIIILLL() != this.mHandler.getLooper().getThread()) {
            this.mHandler.post(new Runnable() { // from class: com.ss.ttlivestreamer.livestreamv2.filter.FilterManager.71
                public final /* synthetic */ int val$code;
                public final /* synthetic */ String val$msg;

                @Override // java.lang.Runnable
                public void run() {
                    com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$71_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                }

                public void com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$71__run$___twin___() {
                    FilterManager.this.stopCatchTask(r2, r3);
                }

                public static void com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$71_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass71 anonymousClass71) {
                    boolean LIZ;
                    try {
                        anonymousClass71.com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$71__run$___twin___();
                    } finally {
                        if (LIZ) {
                        }
                    }
                }

                public AnonymousClass71(int i2, String str2) {
                    r2 = i2;
                    r3 = str2;
                }
            });
            return;
        }
        VideoCatcher videoCatcher = this.mOriginFrameCatcher;
        if (videoCatcher != null) {
            videoCatcher.stop(i2);
            this.mOriginFrameCatcher = null;
        }
        VideoCatcher videoCatcher2 = this.mEffectFrameCatcher;
        if (videoCatcher2 != null) {
            videoCatcher2.stop(i2);
            this.mEffectFrameCatcher = null;
        }
        ILiveStream.CatchMediaDataCallback catchMediaDataCallback = this.mCatchVideoCallback;
        if (catchMediaDataCallback != null) {
            if (i2 == 0) {
                catchMediaDataCallback.onComplete();
            } else {
                catchMediaDataCallback.onError(i2, str2);
            }
            this.mCatchVideoCallback = null;
        }
        this.mCatchVideoFrameCount = 0;
    }

    private boolean blackFrameCheck(int i, int i2, int i3) {
        int i4 = this.mBlackFrameBlockSize;
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(i4 * i4 * 4);
        int i5 = (i / 2) - i3;
        if (i5 <= 0) {
            i5 = 0;
        }
        int i6 = (i2 / 2) - i3;
        if (i6 <= 0) {
            i6 = 0;
        }
        int i7 = this.mBlackFrameBlockSize;
        if (i7 + i5 > i) {
            i5 = i - i7;
        }
        if (i7 + i6 > i2) {
            i6 = i2 - i7;
        }
        GLES20.glReadPixels(i5, i6, i7, i7, 6408, 5121, allocateDirect);
        int i8 = 0;
        while (true) {
            int i9 = this.mBlackFrameBlockSize;
            if (i8 < i9 * i9) {
                if (allocateDirect.getInt() != 0) {
                    return false;
                }
                i8++;
            } else {
                return true;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0094, code lost:
    
        if (r4[0] == r8) goto L85;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int cropAndScale(com.ss.ttlivestreamer.livestreamv2.filter.FilterVideoBufferPool.Recycle r28, com.ss.ttlivestreamer.core.buffer.VideoFrame r29, boolean r30) {
        /*
            Method dump skipped, instructions count: 560
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.ttlivestreamer.livestreamv2.filter.FilterManager.cropAndScale(com.ss.ttlivestreamer.livestreamv2.filter.FilterVideoBufferPool$Recycle, com.ss.ttlivestreamer.core.buffer.VideoFrame, boolean):int");
    }

    private void pureDarkFrameCheck(VideoFrame.Buffer buffer, int i, int i2) {
        int i3;
        if (this.mBlackFrameCounter == 0) {
            FilterVideoBufferPool.Recycle recycle = this.mOut2DTexRecycle;
            if (recycle != null && i2 == recycle.getBuffer().getTextureId()) {
                i3 = this.mOut2DTexRecycle.getBuffer().getFrameBufferId();
            } else if (i2 == this.mTextureFrameBufferRecycle.getBuffer().getTextureId()) {
                i3 = this.mTextureFrameBufferRecycle.getBuffer().getFrameBufferId();
            } else {
                i3 = 0;
            }
            int width = buffer.getWidth();
            int height = buffer.getHeight();
            int width2 = buffer.getWidth();
            int height2 = buffer.getHeight();
            LiveStreamGpuTurboWrapper liveStreamGpuTurboWrapper = this.wrapper;
            if (liveStreamGpuTurboWrapper != null && liveStreamGpuTurboWrapper.isGpuTurboEnabled()) {
                width2 = this.wrapper.getSRResolutionWidth();
                height2 = this.wrapper.getSRResolutionHeight();
            }
            if (i3 > 0) {
                int nextInt = new Random().nextInt(100);
                GLES20.glBindFramebuffer(36160, i3);
                boolean blackFrameCheck = blackFrameCheck(width2, height2, nextInt);
                GLES20.glBindFramebuffer(36160, 0);
                if (blackFrameCheck) {
                    this.mBlackFrameCountAfterEffect++;
                    if (i > 0) {
                        GLES20.glBindFramebuffer(36160, i);
                        boolean blackFrameCheck2 = blackFrameCheck(width, height, nextInt);
                        GLES20.glBindFramebuffer(36160, 0);
                        if (blackFrameCheck2) {
                            this.mBlackFrameCountBeforeEffect++;
                            this.mBlackFrameDetectResult = -102;
                            StringBuilder LIZ = X1D.LIZ();
                            LIZ.append("black frame check. beforeEffect = ");
                            LIZ.append(this.mBlackFrameCountBeforeEffect);
                            LIZ.append(", afterEffect = ");
                            LIZ.append(this.mBlackFrameCountAfterEffect);
                            AVLog.ioi("FilterManager", X1D.LIZIZ(LIZ));
                        }
                    }
                    this.mBlackFrameDetectResult = -101;
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("black frame check. beforeEffect = ");
                    LIZ2.append(this.mBlackFrameCountBeforeEffect);
                    LIZ2.append(", afterEffect = ");
                    LIZ2.append(this.mBlackFrameCountAfterEffect);
                    AVLog.ioi("FilterManager", X1D.LIZIZ(LIZ2));
                } else {
                    this.mBlackFrameCountAfterEffect = 0;
                    this.mBlackFrameCountBeforeEffect = 0;
                }
            }
        }
        int i4 = this.mBlackFrameCounter + 1;
        this.mBlackFrameCounter = i4;
        this.mBlackFrameCounter = i4 % this.mBlackFrameDetectThreshold;
    }

    public void catchVideo(MediaEngineFactory mediaEngineFactory, Bundle bundle, ILiveStream.CatchMediaDataCallback catchMediaDataCallback) {
        this.mHandler.post(new Runnable() { // from class: com.ss.ttlivestreamer.livestreamv2.filter.FilterManager.70
            public final /* synthetic */ ILiveStream.CatchMediaDataCallback val$callback;
            public final /* synthetic */ Bundle val$param;
            public final /* synthetic */ WeakReference val$weakFactory;

            @Override // java.lang.Runnable
            public void run() {
                com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$70_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public void com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$70__run$___twin___() {
                FilterManager filterManager = FilterManager.this;
                if (filterManager.mOriginFrameCatcher != null || filterManager.mEffectFrameCatcher != null) {
                    ILiveStream.CatchMediaDataCallback catchMediaDataCallback2 = r2;
                    if (catchMediaDataCallback2 != null) {
                        catchMediaDataCallback2.onError(-2, "Already started a catching task");
                        return;
                    }
                    return;
                }
                MediaEngineFactory mediaEngineFactory2 = (MediaEngineFactory) r3.get();
                int i = r4.getInt("mode", -1);
                int i2 = r4.getInt("width");
                int i3 = r4.getInt("height");
                int i4 = r4.getInt("fps");
                boolean z = r4.getBoolean("hardwareEncode", true);
                String string = r4.getString("outputPathOrigin");
                String string2 = r4.getString("outputPathWithEffect");
                FilterManager.this.mCatchVideoFrameCount = r4.getInt("frameCount");
                if (i == 0 && r4.containsKey("duration")) {
                    FilterManager.this.mCatchVideoFrameCount = (int) (r4.getFloat("duration") * i4);
                }
                FilterManager.this.mCatchVideoFrameInterval = (int) (r4.getFloat("interval") * 1000.0f);
                FilterManager.this.mCatchVideoCallback = r2;
                new ILiveStream.CatchMediaDataCallback() { // from class: com.ss.ttlivestreamer.livestreamv2.filter.FilterManager.70.1
                    @Override // com.ss.ttlivestreamer.livestreamv2.ILiveStream.CatchMediaDataCallback
                    public void onComplete() {
                    }

                    @Override // com.ss.ttlivestreamer.livestreamv2.ILiveStream.CatchMediaDataCallback
                    public final /* synthetic */ void onCompleteOnce(String str, long j, long j2, int i5, int i6, int i7) {
                        C30533Byb.LIZ(this, str, j, j2, i5, i6, i7);
                    }

                    public AnonymousClass1() {
                    }

                    @Override // com.ss.ttlivestreamer.livestreamv2.ILiveStream.CatchMediaDataCallback
                    public void onError(int i5, String str) {
                        FilterManager.this.onCatchError(i5, str);
                    }
                };
                if (!TextUtils.isEmpty(string)) {
                    FilterManager.this.mOriginFrameCatcher = new VideoCatcher();
                    FilterManager filterManager2 = FilterManager.this;
                    filterManager2.mOriginFrameCatcher.start(i, i2, i3, i4, z, string, filterManager2, mediaEngineFactory2, filterManager2.mHandler);
                }
                if (!TextUtils.isEmpty(string2)) {
                    FilterManager.this.mEffectFrameCatcher = new VideoCatcher();
                    FilterManager filterManager3 = FilterManager.this;
                    filterManager3.mEffectFrameCatcher.start(i, i2, i3, i4, z, string2, filterManager3, mediaEngineFactory2, filterManager3.mHandler);
                }
            }

            /* renamed from: com.ss.ttlivestreamer.livestreamv2.filter.FilterManager$70$1 */
            /* loaded from: classes12.dex */
            public class AnonymousClass1 implements ILiveStream.CatchMediaDataCallback {
                @Override // com.ss.ttlivestreamer.livestreamv2.ILiveStream.CatchMediaDataCallback
                public void onComplete() {
                }

                @Override // com.ss.ttlivestreamer.livestreamv2.ILiveStream.CatchMediaDataCallback
                public final /* synthetic */ void onCompleteOnce(String str, long j, long j2, int i5, int i6, int i7) {
                    C30533Byb.LIZ(this, str, j, j2, i5, i6, i7);
                }

                public AnonymousClass1() {
                }

                @Override // com.ss.ttlivestreamer.livestreamv2.ILiveStream.CatchMediaDataCallback
                public void onError(int i5, String str) {
                    FilterManager.this.onCatchError(i5, str);
                }
            }

            public static void com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$70_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass70 anonymousClass70) {
                boolean LIZ;
                try {
                    anonymousClass70.com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$70__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }

            public AnonymousClass70(ILiveStream.CatchMediaDataCallback catchMediaDataCallback2, WeakReference weakReference, Bundle bundle2) {
                r2 = catchMediaDataCallback2;
                r3 = weakReference;
                r4 = bundle2;
            }
        });
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.filter.IFilterManager
    public int composerAppendNodesWithTags(String[] strArr, int i, String[] strArr2) {
        this.mHandler.post(new Runnable() { // from class: com.ss.ttlivestreamer.livestreamv2.filter.FilterManager.37
            public final /* synthetic */ String val$callInfo;
            public final /* synthetic */ int val$nodeNum;
            public final /* synthetic */ String[] val$nodes;
            public final /* synthetic */ String[] val$tags;

            @Override // java.lang.Runnable
            public void run() {
                com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$37_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public void com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$37__run$___twin___() {
                int composerAppendNodesWithTags;
                if (FilterManager.this.isValid() && (composerAppendNodesWithTags = FilterManager.this.mEffect.composerAppendNodesWithTags(r2, r3, r4)) != 0) {
                    FilterManager.this.mErrorListener.onError(composerAppendNodesWithTags, r5);
                }
            }

            public static void com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$37_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass37 anonymousClass37) {
                boolean LIZ;
                try {
                    anonymousClass37.com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$37__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }

            public AnonymousClass37(String[] strArr3, int i2, String[] strArr22, String str) {
                r2 = strArr3;
                r3 = i2;
                r4 = strArr22;
                r5 = str;
            }
        });
        return 0;
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.filter.IFilterManager
    public int composerCheckNodeExclusion(String str, String str2, int[] iArr) {
        String callInfo = getCallInfo(str, str2, iArr);
        if (isValid() && iArr.length > 0) {
            ThreadUtils.invokeAtFrontUninterruptibly(this.mHandler, new Runnable() { // from class: com.ss.ttlivestreamer.livestreamv2.filter.FilterManager.40
                public final /* synthetic */ String val$callInfo;
                public final /* synthetic */ String val$nodePath;
                public final /* synthetic */ String val$nodeTag;
                public final /* synthetic */ int[] val$result;

                @Override // java.lang.Runnable
                public void run() {
                    com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$40_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                }

                public void com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$40__run$___twin___() {
                    int composerCheckNodeExclusion = FilterManager.this.mEffect.composerCheckNodeExclusion(r2, r3, r4);
                    if (composerCheckNodeExclusion != 0) {
                        FilterManager.this.mErrorListener.onError(composerCheckNodeExclusion, r5);
                    }
                }

                public static void com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$40_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass40 anonymousClass40) {
                    boolean LIZ;
                    try {
                        anonymousClass40.com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$40__run$___twin___();
                    } finally {
                        if (LIZ) {
                        }
                    }
                }

                public AnonymousClass40(String str3, String str22, int[] iArr2, String callInfo2) {
                    r2 = str3;
                    r3 = str22;
                    r4 = iArr2;
                    r5 = callInfo2;
                }
            });
        }
        return 0;
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.filter.IFilterManager
    public int composerReloadNodesWithTags(String[] strArr, int i, String[] strArr2) {
        this.mHandler.post(new Runnable() { // from class: com.ss.ttlivestreamer.livestreamv2.filter.FilterManager.35
            public final /* synthetic */ String val$callInfo;
            public final /* synthetic */ int val$nodeNum;
            public final /* synthetic */ String[] val$nodePaths;
            public final /* synthetic */ String[] val$tags;

            @Override // java.lang.Runnable
            public void run() {
                com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$35_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public void com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$35__run$___twin___() {
                int composerReloadNodesWithTags;
                if (FilterManager.this.isValid() && (composerReloadNodesWithTags = FilterManager.this.mEffect.composerReloadNodesWithTags(r2, r3, r4)) != 0) {
                    FilterManager.this.mErrorListener.onError(composerReloadNodesWithTags, r5);
                }
            }

            public static void com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$35_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass35 anonymousClass35) {
                boolean LIZ;
                try {
                    anonymousClass35.com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$35__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }

            public AnonymousClass35(String[] strArr3, int i2, String[] strArr22, String str) {
                r2 = strArr3;
                r3 = i2;
                r4 = strArr22;
                r5 = str;
            }
        });
        return 0;
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.filter.IFilterManager
    public int composerSetNodesWithTags(String[] strArr, int i, String[] strArr2) {
        AVLog.logKibana(5, "FilterManager", "composerSetNodesWithTags", null);
        this.mHandler.post(new Runnable() { // from class: com.ss.ttlivestreamer.livestreamv2.filter.FilterManager.34
            public final /* synthetic */ String val$callInfo;
            public final /* synthetic */ int val$nodeNum;
            public final /* synthetic */ String[] val$nodePaths;
            public final /* synthetic */ String[] val$tags;

            @Override // java.lang.Runnable
            public void run() {
                com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$34_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public void com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$34__run$___twin___() {
                int composerSetNodesWithTags;
                if (FilterManager.this.isValid() && (composerSetNodesWithTags = FilterManager.this.mEffect.composerSetNodesWithTags(r2, r3, r4)) != 0) {
                    FilterManager.this.mErrorListener.onError(composerSetNodesWithTags, r5);
                }
            }

            public static void com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$34_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass34 anonymousClass34) {
                boolean LIZ;
                try {
                    anonymousClass34.com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$34__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }

            public AnonymousClass34(String[] strArr3, int i2, String[] strArr22, String str) {
                r2 = strArr3;
                r3 = i2;
                r4 = strArr22;
                r5 = str;
            }
        });
        return 0;
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.filter.IFilterManager
    public int composerUpdateNode(String str, String str2, float f) {
        this.mHandler.post(new Runnable() { // from class: com.ss.ttlivestreamer.livestreamv2.filter.FilterManager.28
            public final /* synthetic */ String val$callInfo;
            public final /* synthetic */ String val$nodePath;
            public final /* synthetic */ String val$nodeTag;
            public final /* synthetic */ float val$nodeValue;

            @Override // java.lang.Runnable
            public void run() {
                com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$28_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public void com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$28__run$___twin___() {
                int composerUpdateNode;
                if (FilterManager.this.isValid() && (composerUpdateNode = FilterManager.this.mEffect.composerUpdateNode(r2, r3, r4)) != 0) {
                    FilterManager.this.mErrorListener.onError(composerUpdateNode, r5);
                }
            }

            public static void com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$28_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass28 anonymousClass28) {
                boolean LIZ;
                try {
                    anonymousClass28.com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$28__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }

            public AnonymousClass28(String str3, String str22, float f2, String str32) {
                r2 = str3;
                r3 = str22;
                r4 = f2;
                r5 = str32;
            }
        });
        return 0;
    }

    /* renamed from: initAutoBrightenFilter */
    public void lambda$initAutoBrightenFilter$4(Context context, JSONObject jSONObject, BmfBrightenFilter.Listener listener) {
        if (C16880lQ.LLLLIIIILLL() != this.mHandler.getLooper().getThread()) {
            this.mHandler.post(new P3B(this, context, jSONObject, listener, 1));
        } else if (this.mBrightenFilter == null) {
            this.mBrightenFilter = BmfBrightenFilter.Create(context, jSONObject, listener);
        }
    }

    /* renamed from: initNoiseEvaluateFilter */
    public void lambda$initNoiseEvaluateFilter$5(final Context context, final JSONObject jSONObject, final Handler handler) {
        if (C16880lQ.LLLLIIIILLL() != this.mHandler.getLooper().getThread()) {
            this.mHandler.post(new Runnable() { // from class: X.P37
                @Override // java.lang.Runnable
                public final void run() {
                    FilterManager.this.lambda$initNoiseEvaluateFilter$5(context, jSONObject, handler);
                }
            });
        } else if (this.mNoiseEvaluateFilter == null) {
            if (jSONObject != null) {
                try {
                    JSONObjectProtectorUtils.getJSONObject(jSONObject, "modelDownloadParams").put("sdkVersion", getEffectVersion());
                } catch (Exception unused) {
                }
            }
            this.mNoiseEvaluateFilter = BmfNoiseEvaluateFilter.Create(context, jSONObject, handler, this.mHandler);
        }
    }

    /* renamed from: initVQScoreFilter */
    public void lambda$initVQScoreFilter$6(final Context context, final JSONObject jSONObject, final Handler handler) {
        if (C16880lQ.LLLLIIIILLL() != this.mHandler.getLooper().getThread()) {
            this.mHandler.post(new Runnable() { // from class: X.P38
                @Override // java.lang.Runnable
                public final void run() {
                    FilterManager.this.lambda$initVQScoreFilter$6(context, jSONObject, handler);
                }
            });
        } else if (this.mVQScoreFilter == null) {
            if (jSONObject != null) {
                try {
                    JSONObjectProtectorUtils.getJSONObject(jSONObject, "modelDownloadParams").put("sdkVersion", getEffectVersion());
                } catch (Exception unused) {
                }
            }
            this.mVQScoreFilter = BmfVQScoreFilter.Create(context, jSONObject, handler, this.mHandler);
        }
    }

    /* renamed from: initVideoDenoiseFilter */
    public void lambda$initVideoDenoiseFilter$8(final Context context, final JSONObject jSONObject, final BmfVideoDenoiseFilter.Callback callback) {
        if (C16880lQ.LLLLIIIILLL() != this.mHandler.getLooper().getThread()) {
            this.mHandler.post(new Runnable() { // from class: X.P36
                @Override // java.lang.Runnable
                public final void run() {
                    FilterManager.this.lambda$initVideoDenoiseFilter$8(context, jSONObject, callback);
                }
            });
        } else if (this.mVideoDenoiseFilter == null) {
            this.mVideoDenoiseFilter = BmfVideoDenoiseFilter.Create(context, jSONObject, callback);
        }
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.filter.IFilterManager
    public void processTouchDownEvent(float f, float f2, int i) {
        this.mHandler.post(new Runnable() { // from class: com.ss.ttlivestreamer.livestreamv2.filter.FilterManager.48
            public final /* synthetic */ int val$type;
            public final /* synthetic */ float val$x;
            public final /* synthetic */ float val$y;

            @Override // java.lang.Runnable
            public void run() {
                com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$48_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public void com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$48__run$___twin___() {
                if (FilterManager.this.isValid()) {
                    FilterManager.this.mEffect.processTouchDownEvent(r2, r3, r4);
                }
            }

            public static void com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$48_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass48 anonymousClass48) {
                boolean LIZ;
                try {
                    anonymousClass48.com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$48__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }

            public AnonymousClass48(float f3, float f22, int i2) {
                r2 = f3;
                r3 = f22;
                r4 = i2;
            }
        });
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.filter.IFilterManager
    public void processTouchUpEvent(float f, float f2, int i) {
        this.mHandler.post(new Runnable() { // from class: com.ss.ttlivestreamer.livestreamv2.filter.FilterManager.49
            public final /* synthetic */ int val$type;
            public final /* synthetic */ float val$x;
            public final /* synthetic */ float val$y;

            @Override // java.lang.Runnable
            public void run() {
                com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$49_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public void com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$49__run$___twin___() {
                if (FilterManager.this.isValid()) {
                    FilterManager.this.mEffect.processTouchUpEvent(r2, r3, r4);
                }
            }

            public static void com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$49_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass49 anonymousClass49) {
                boolean LIZ;
                try {
                    anonymousClass49.com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$49__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }

            public AnonymousClass49(float f3, float f22, int i2) {
                r2 = f3;
                r3 = f22;
                r4 = i2;
            }
        });
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.filter.IFilterManager
    public int setBeautify(String str, float f, float f2) {
        this.mHandler.post(new Runnable() { // from class: com.ss.ttlivestreamer.livestreamv2.filter.FilterManager.10
            public final /* synthetic */ String val$callInfo;
            public final /* synthetic */ float val$fBrightIntensity;
            public final /* synthetic */ float val$fSmoothIntensity;
            public final /* synthetic */ String val$resPath;

            @Override // java.lang.Runnable
            public void run() {
                com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$10_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public void com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$10__run$___twin___() {
                int beautify;
                if (FilterManager.this.isValid() && (beautify = FilterManager.this.mEffect.setBeautify(r2, r3, r4)) != 0) {
                    FilterManager.this.mErrorListener.onError(beautify, r5);
                }
            }

            public static void com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$10_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass10 anonymousClass10) {
                boolean LIZ;
                try {
                    anonymousClass10.com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$10__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }

            public AnonymousClass10(String str2, float f3, float f22, String str22) {
                r2 = str2;
                r3 = f3;
                r4 = f22;
                r5 = str22;
            }
        });
        return 0;
    }

    public void setConfig(String[] strArr, boolean[] zArr, JSONObject jSONObject) {
        long j;
        long j2;
        IVideoEffectProcessor iVideoEffectProcessor = this.mEffect;
        if (iVideoEffectProcessor != null) {
            if (iVideoEffectProcessor instanceof EffectWrapper) {
                if (strArr != null) {
                    if (zArr != null) {
                        long algorithmRequirment = ((EffectWrapper) iVideoEffectProcessor).getAlgorithmRequirment();
                        this.effectAlgorithmRequirment = algorithmRequirment;
                        long algorithmRequirmentParams = ((EffectWrapper) this.mEffect).getAlgorithmRequirmentParams();
                        this.effectAlgorithmRequirmentParams = algorithmRequirmentParams;
                        StringBuilder LIZ = X1D.LIZ();
                        LIZ.append("Current requirment ");
                        LIZ.append(Long.toHexString(algorithmRequirment));
                        AVLog.iod("FilterManager", X1D.LIZIZ(LIZ));
                        for (String str : strArr) {
                            for (boolean z : zArr) {
                                StringBuilder LIZ2 = X1D.LIZ();
                                LIZ2.append("Requirment name ");
                                LIZ2.append(str);
                                LIZ2.append(" enable ");
                                LIZ2.append(z);
                                AVLog.ioi("FilterManager", X1D.LIZIZ(LIZ2));
                                if (str.equalsIgnoreCase(EFF_ALGORITHM_NAME_AVATAR_DRIVE)) {
                                    if (z) {
                                        j2 = 17592186044416L;
                                        algorithmRequirment |= j2;
                                    } else {
                                        j = -17592186044417L;
                                        algorithmRequirment &= j;
                                    }
                                } else if (str.equalsIgnoreCase("faceinfo")) {
                                    if (z) {
                                        j2 = 1;
                                        algorithmRequirment |= j2;
                                    } else {
                                        j = -2;
                                        algorithmRequirment &= j;
                                    }
                                } else if (str.equalsIgnoreCase("mouthPout")) {
                                    algorithmRequirmentParams |= 67108864;
                                }
                            }
                        }
                        StringBuilder LIZ3 = X1D.LIZ();
                        LIZ3.append("update requirment ");
                        LIZ3.append(Long.toHexString(algorithmRequirment));
                        LIZ3.append(", flagsParams:");
                        LIZ3.append(Long.toHexString(algorithmRequirmentParams));
                        AVLog.iod("FilterManager", X1D.LIZIZ(LIZ3));
                        ((EffectWrapper) this.mEffect).refreshAlgorithmRequirment(algorithmRequirment, algorithmRequirmentParams);
                        StringBuilder LIZ4 = X1D.LIZ();
                        LIZ4.append("after requirment ");
                        LIZ4.append(Long.toHexString(((EffectWrapper) this.mEffect).getAlgorithmRequirment()));
                        LIZ4.append(", flagsParams:");
                        LIZ4.append(Long.toHexString(((EffectWrapper) this.mEffect).getAlgorithmRequirmentParams()));
                        AVLog.iod("FilterManager", X1D.LIZIZ(LIZ4));
                        return;
                    }
                    return;
                }
            } else if (strArr != null) {
                return;
            }
            StringBuilder LIZ5 = X1D.LIZ();
            LIZ5.append("restore requirment ");
            LIZ5.append(Long.toHexString(this.effectAlgorithmRequirment));
            LIZ5.append(",flagsParams:");
            LIZ5.append(Long.toHexString(this.effectAlgorithmRequirmentParams));
            AVLog.iod("FilterManager", X1D.LIZIZ(LIZ5));
            ((EffectWrapper) this.mEffect).refreshAlgorithmRequirment(this.effectAlgorithmRequirment, this.effectAlgorithmRequirmentParams);
        }
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.filter.IFilterManager
    public int setFilter(String str, float f, boolean z) {
        this.mHandler.post(new Runnable() { // from class: com.ss.ttlivestreamer.livestreamv2.filter.FilterManager.20
            public final /* synthetic */ String val$callInfo;
            public final /* synthetic */ float val$intensity;
            public final /* synthetic */ String val$resPath;
            public final /* synthetic */ boolean val$useV2;

            @Override // java.lang.Runnable
            public void run() {
                com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$20_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public void com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$20__run$___twin___() {
                int filter;
                if (FilterManager.this.isValid() && (filter = FilterManager.this.mEffect.setFilter(r2, r3, r4)) != 0) {
                    FilterManager.this.mErrorListener.onError(filter, r5);
                }
            }

            public static void com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$20_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass20 anonymousClass20) {
                boolean LIZ;
                try {
                    anonymousClass20.com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$20__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }

            public AnonymousClass20(String str2, float f2, boolean z2, String str22) {
                r2 = str2;
                r3 = f2;
                r4 = z2;
                r5 = str22;
            }
        });
        return 0;
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.filter.IFilterManager
    public int setReshape(String str, float f, float f2) {
        this.mHandler.post(new Runnable() { // from class: com.ss.ttlivestreamer.livestreamv2.filter.FilterManager.12
            public final /* synthetic */ String val$callInfo;
            public final /* synthetic */ float val$cheekIntensity;
            public final /* synthetic */ float val$eyeIntensity;
            public final /* synthetic */ String val$resPath;

            @Override // java.lang.Runnable
            public void run() {
                com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$12_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public void com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$12__run$___twin___() {
                int reshape;
                if (FilterManager.this.isValid() && (reshape = FilterManager.this.mEffect.setReshape(r2, r3, r4)) != 0) {
                    FilterManager.this.mErrorListener.onError(reshape, r5);
                }
            }

            public static void com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$12_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass12 anonymousClass12) {
                boolean LIZ;
                try {
                    anonymousClass12.com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$12__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }

            public AnonymousClass12(String str2, float f3, float f22, String str22) {
                r2 = str2;
                r3 = f3;
                r4 = f22;
                r5 = str22;
            }
        });
        return 0;
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.filter.IFilterManager
    public void setupAudioGraphStickerContext(boolean z, boolean z2, boolean z3) {
        this.mHandler.post(new Runnable() { // from class: com.ss.ttlivestreamer.livestreamv2.filter.FilterManager.24
            public final /* synthetic */ boolean val$useOutput;

            @Override // java.lang.Runnable
            public void run() {
                com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$24_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public void com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$24__run$___twin___() {
                FilterManager filterManager = FilterManager.this;
                if (filterManager.mEnalbeAudioGraphSticker) {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("setupAudioGraphStickerContext failed! mEnalbeAudioGraphSticker: ");
                    LIZ.append(FilterManager.this.mEnalbeAudioGraphSticker);
                    AVLog.logKibana(5, "FilterManager", X1D.LIZIZ(LIZ), null);
                    return;
                }
                if (filterManager.isValid()) {
                    FilterManager filterManager2 = FilterManager.this;
                    filterManager2.mUseAudioGraphStickerOutput = r2;
                    int i = filterManager2.mEffect.setupEffectAudioHandler();
                    if (i != 0) {
                        FilterManager.this.mErrorListener.onError(i, "");
                    }
                    synchronized (FilterManager.this.mAudioEffectLock) {
                        FilterManager.this.mEnalbeAudioGraphSticker = true;
                        AVLog.logKibana(5, "FilterManager", "mEnalbeAudioGraphSticker is set to true in setupAudioGraphStickerContext", null);
                    }
                    AudioDeviceModule audioDeviceModule = FilterManager.this.mAdm;
                    if (audioDeviceModule != null) {
                        audioDeviceModule.enableAsyncProcess(true);
                    }
                    FilterManager.this.mEffect.effectAudioSetPlaybackDeviceType(1);
                    FilterManager filterManager3 = FilterManager.this;
                    if (filterManager3.mUseAudioGraphStickerOutput) {
                        IInputAudioStream iInputAudioStream = filterManager3.mAudioStreamObserver;
                        if (iInputAudioStream != null && iInputAudioStream.getAudioTrack() != null) {
                            FilterManager.this.mAudioStreamObserver.getAudioTrack().setEnable(true);
                            return;
                        }
                        return;
                    }
                    IInputAudioStream iInputAudioStream2 = filterManager3.mAudioStreamObserver;
                    if (iInputAudioStream2 == null || iInputAudioStream2.getAudioTrack() == null) {
                        return;
                    }
                    FilterManager.this.mAudioStreamObserver.getAudioTrack().setEnable(false);
                }
            }

            public static void com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$24_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass24 anonymousClass24) {
                boolean LIZ;
                try {
                    anonymousClass24.com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$24__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }

            public AnonymousClass24(boolean z32) {
                r2 = z32;
            }
        });
    }

    private VideoFrame onProcess(VideoFrame videoFrame, int i, int i2, boolean z) {
        VideoFrame videoFrame2;
        VideoFrame.Buffer buffer = videoFrame.getBuffer();
        int rotatedWidth = videoFrame.getRotatedWidth();
        int rotatedHeight = videoFrame.getRotatedHeight();
        if (this.mShouldCatch && this.mOriginFrameCatcher != null) {
            VideoFrame wrapperFrame = wrapperFrame(this.mTextureFrameBufferRecycle, videoFrame, null, null);
            catchFrame(this.mOriginFrameCatcher, wrapperFrame, this.mTextureFrameBufferRecycle.getBuffer().getFrameBufferId(), buffer.getWidth(), buffer.getHeight());
            wrapperFrame.release();
        }
        int i3 = i;
        onVideoDumpTextureFrame(this.mRawVideoDumpers[0], i3, false, rotatedWidth, rotatedHeight, 15, null, "BeforeEffect");
        BmfVideoDenoiseFilter bmfVideoDenoiseFilter = this.mVideoDenoiseFilter;
        if (bmfVideoDenoiseFilter != null && bmfVideoDenoiseFilter.isInplaceProcess2D()) {
            i3 = i3;
            rotatedWidth = rotatedWidth;
            rotatedHeight = rotatedHeight;
            this.mVideoDenoiseFilter.process(i3, false, rotatedWidth, rotatedHeight, null, null);
        }
        if (i3 > 0 && i2 > 0 && i3 != i2) {
            videoFrame2 = processEffect(videoFrame, i3, i2, z);
            this.mCurrentOut2dTex = i2;
        } else if (this.mEnabled) {
            videoFrame2 = returnCurrent2dTex(videoFrame);
        } else {
            videoFrame2 = videoFrame;
        }
        LiveStreamGpuTurboWrapper liveStreamGpuTurboWrapper = this.wrapper;
        if (liveStreamGpuTurboWrapper != null && liveStreamGpuTurboWrapper.isGpuTurboEnabled()) {
            rotatedWidth = this.wrapper.getSRResolutionWidth();
            rotatedHeight = this.wrapper.getSRResolutionHeight();
        }
        if (needPostProcess()) {
            BmfNoiseEvaluateFilter bmfNoiseEvaluateFilter = this.mNoiseEvaluateFilter;
            if (bmfNoiseEvaluateFilter != null) {
                bmfNoiseEvaluateFilter.process(i2, rotatedWidth, rotatedHeight);
            }
            BmfColorHistFilter bmfColorHistFilter = this.mColorHistFilter;
            if (bmfColorHistFilter != null) {
                bmfColorHistFilter.process(i2, false, rotatedWidth, rotatedHeight, null, videoFrame.getTimestampNs() / 1000000);
            }
            VideoCatcher videoCatcher = this.mEffectFrameCatcher;
            if (videoCatcher != null && this.mShouldCatch) {
                catchFrame(videoCatcher, videoFrame2, this.mOut2DTexRecycle.getBuffer().getFrameBufferId(), rotatedWidth, rotatedHeight);
            }
            if (this.mEnableVideoBlackFrameCheck) {
                pureDarkFrameCheck(buffer, i3, i2);
            }
        }
        ScopeMonitor.CalcElapse(8, videoFrame.getBuffer().getCaptureMs(), TimeUtils.currentTimeMs());
        return videoFrame2;
    }

    private EffectWrapper.AlgorithmResult postExtraDataProcess(int i, long j, int i2, int i3) {
        boolean z;
        EffectWrapper.AlgorithmResult algorithmResult;
        ByteBuffer contourInfo;
        int i4 = this.mNoExtraSendFrameCounts;
        if (i4 >= this.mExtraDataGop) {
            z = true;
            this.mNoExtraSendFrameCounts = 0;
        } else {
            z = false;
            this.mNoExtraSendFrameCounts = i4 + 1;
        }
        long j2 = this.mExtrDataFlags;
        if (j2 != 0 && z && (this.mEffect instanceof EffectWrapper)) {
            if (i == this.mTextureFrameBufferRecycle.getBuffer().getTextureId()) {
                algorithmResult = (EffectWrapper.AlgorithmResult) this.mTextureFrameBufferRecycle.getExtraData();
                if (algorithmResult == null) {
                    algorithmResult = ((EffectWrapper) this.mEffect).getAlgorithmResult(j2);
                    this.mTextureFrameBufferRecycle.setExtrData(algorithmResult);
                } else {
                    ((EffectWrapper) this.mEffect).getAlgorithmResult(algorithmResult, j2);
                }
            } else {
                algorithmResult = (EffectWrapper.AlgorithmResult) this.mOut2DTexRecycle.getExtraData();
                if (algorithmResult == null) {
                    algorithmResult = ((EffectWrapper) this.mEffect).getAlgorithmResult(j2);
                    this.mOut2DTexRecycle.setExtrData(algorithmResult);
                } else {
                    ((EffectWrapper) this.mEffect).getAlgorithmResult(algorithmResult, j2);
                }
            }
            if (this.mEnableFindContour && algorithmResult != null && (contourInfo = this.mEffect.getContourInfo(algorithmResult)) != null && contourInfo.capacity() > 0) {
                IFilterManager.FindContourListener findContourListener = this.mFindContourListener;
                if (findContourListener != null) {
                    findContourListener.onSendFindContourSei(contourInfo, j, this.mSendContourInfoType);
                }
                if (this.mContourDataCallBack != null) {
                    this.mContourDataCallBack.onReceivedLocalData(ZlibCompressUtils.getContourInfoFromByteBuffer(contourInfo));
                    return algorithmResult;
                }
                return algorithmResult;
            }
            return algorithmResult;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12, types: [com.ss.ttlivestreamer.core.buffer.RoiInfo, com.ss.ttlivestreamer.core.effect.EffectWrapper$AlgorithmResult] */
    /* JADX WARN: Type inference failed for: r1v20 */
    private VideoFrame processEffect(VideoFrame videoFrame, int i, int i2, boolean z) {
        boolean z2;
        int i3;
        int i4;
        int process;
        Throwable th;
        int i5 = i2;
        int rotatedWidth = videoFrame.getRotatedWidth();
        int rotatedHeight = videoFrame.getRotatedHeight();
        LiveStreamGpuTurboWrapper liveStreamGpuTurboWrapper = this.wrapper;
        if (liveStreamGpuTurboWrapper != null && liveStreamGpuTurboWrapper.isGpuTurboEnabled()) {
            z2 = true;
            i3 = this.wrapper.getSRResolutionWidth();
            i4 = this.wrapper.getSRResolutionHeight();
        } else {
            z2 = false;
            i3 = rotatedWidth;
            i4 = rotatedHeight;
        }
        this.mEffect.configGpuTurboBeforeProcessEffect(i3, i4, z2);
        long timestampNs = videoFrame.getTimestampNs();
        long captureMs = videoFrame.getBuffer().getCaptureMs();
        RoiInfo roiInfo = null;
        if (this.mRoiEnabled) {
            roiInfo = new RoiInfo();
        }
        if (this.mEnableThreeBuffer) {
            long[] jArr = {videoFrame.getTimestampNs()};
            process = this.mEffect.processV2(i, rotatedWidth, rotatedHeight, i5, this.mOrientation / 90, roiInfo, jArr, this.mForceSticker, this.mEffectAudioTimestampMs);
            videoFrame.setTimestampNs(jArr[0]);
        } else {
            process = this.mEffect.process(i, rotatedWidth, rotatedHeight, i5, this.mOrientation / 90, roiInfo, videoFrame.getTimestampNs(), this.mForceSticker, this.mEffectAudioTimestampMs);
        }
        if (this.mEnableThreeBuffer && process == 1) {
            process = this.mEffect.process(i, rotatedWidth, rotatedHeight, i5, this.mOrientation / 90, roiInfo, videoFrame.getTimestampNs(), this.mForceSticker, this.mEffectAudioTimestampMs);
        }
        ScopeMonitor.CalcElapse(6, videoFrame.getBuffer().getCaptureMs(), TimeUtils.currentTimeMs());
        if (this.mEnableThreeBuffer) {
            FilterVideoBufferPool.Recycle recycle = this.mLastRecycle;
            th = 0;
            this.mLastRecycle = null;
            if (recycle != null) {
                recycle.decRef();
            }
            FilterVideoBufferPool.Recycle recycle2 = this.mTextureFrameBufferRecycle;
            if (recycle2 != null) {
                recycle2.addRef();
            }
            this.mLastRecycle = recycle2;
        } else {
            th = 0;
        }
        this.effectProcessError = process;
        if (process != 0 && process != 3) {
            AVLog2.logToIODevice2(6, "FilterManager", KMP.LJ("effect process failed:", process), th, 22, 30000);
            return wrapperFrame(this.mOut2DTexRecycle, videoFrame, th, th);
        }
        ScopeMonitor.CalcElapse(6, captureMs, TimeUtils.currentTimeMs());
        if (GLThreadManager.isNeedFinish() && !z) {
            GLES20.glFinish();
        } else {
            GLES20.glFlush();
        }
        if (this.mBrightenFilter != null) {
            i5 = brightnControl(videoFrame, i5);
        }
        ScopeMonitor.CalcElapse(7, captureMs, TimeUtils.currentTimeMs());
        AVLog2.logToIODevice2(3, "FilterManager", "effect process success", null, 21, 30000);
        showRoiRegion(roiInfo, i3, i3);
        int i6 = i3;
        onVideoDumpTextureFrame(this.mRawVideoDumpers[1], i5, false, i3, i4, 15, null, "AfterEffect");
        return wrapperFrame(this.mOut2DTexRecycle, videoFrame, i6, i4, roiInfo, postExtraDataProcess(i5, timestampNs, i3, i4));
    }

    private VideoFrame wrapperFrame(FilterVideoBufferPool.Recycle recycle, VideoFrame videoFrame, RoiInfo roiInfo, EffectWrapper.AlgorithmResult algorithmResult) {
        return wrapperFrame(recycle, videoFrame, videoFrame.getRotatedWidth(), videoFrame.getRotatedHeight(), roiInfo, algorithmResult);
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.filter.IFilterManager
    public int composerExclusionCompare(String str, String str2, String str3, int[] iArr) {
        String callInfo = getCallInfo(str, str2, str3, iArr);
        if (isValid() && iArr.length > 0) {
            ThreadUtils.invokeAtFrontUninterruptibly(this.mHandler, new Runnable() { // from class: com.ss.ttlivestreamer.livestreamv2.filter.FilterManager.41
                public final /* synthetic */ String val$callInfo;
                public final /* synthetic */ String val$newNodePath;
                public final /* synthetic */ String val$nodeKey;
                public final /* synthetic */ String val$oldNodePath;
                public final /* synthetic */ int[] val$result;

                @Override // java.lang.Runnable
                public void run() {
                    com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$41_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                }

                public void com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$41__run$___twin___() {
                    int composerExclusionCompare = FilterManager.this.mEffect.composerExclusionCompare(r2, r3, r4, r5);
                    if (composerExclusionCompare != 0) {
                        FilterManager.this.mErrorListener.onError(composerExclusionCompare, r6);
                    }
                }

                public static void com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$41_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass41 anonymousClass41) {
                    boolean LIZ;
                    try {
                        anonymousClass41.com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$41__run$___twin___();
                    } finally {
                        if (LIZ) {
                        }
                    }
                }

                public AnonymousClass41(String str4, String str22, String str32, int[] iArr2, String callInfo2) {
                    r2 = str4;
                    r3 = str22;
                    r4 = str32;
                    r5 = iArr2;
                    r6 = callInfo2;
                }
            });
        }
        return 0;
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.filter.IFilterManager
    public int composerUpdateMultipleNodes(int i, String[] strArr, String[] strArr2, float[] fArr) {
        this.mHandler.post(new Runnable() { // from class: com.ss.ttlivestreamer.livestreamv2.filter.FilterManager.29
            public final /* synthetic */ String val$callInfo;
            public final /* synthetic */ String[] val$nodeKeys;
            public final /* synthetic */ int val$nodeNum;
            public final /* synthetic */ String[] val$nodePaths;
            public final /* synthetic */ float[] val$nodeValues;

            @Override // java.lang.Runnable
            public void run() {
                com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$29_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public void com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$29__run$___twin___() {
                int composerUpdateMultipleNodes;
                if (FilterManager.this.isValid() && (composerUpdateMultipleNodes = FilterManager.this.mEffect.composerUpdateMultipleNodes(r2, r3, r4, r5)) != 0) {
                    FilterManager.this.mErrorListener.onError(composerUpdateMultipleNodes, r6);
                }
            }

            public static void com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$29_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass29 anonymousClass29) {
                boolean LIZ;
                try {
                    anonymousClass29.com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$29__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }

            public AnonymousClass29(int i2, String[] strArr3, String[] strArr22, float[] fArr2, String str) {
                r2 = i2;
                r3 = strArr3;
                r4 = strArr22;
                r5 = fArr2;
                r6 = str;
            }
        });
        return 0;
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.filter.IFilterManager
    public IAudioStrangeVoice createAudioStrangeVoice(AudioDeviceModule.AudioRenderSink audioRenderSink, int i, int i2, boolean z) {
        IVideoEffectProcessor iVideoEffectProcessor = this.mEffect;
        if (iVideoEffectProcessor != null && (iVideoEffectProcessor instanceof EffectWrapper)) {
            return new NativeAudioStrange(audioRenderSink, i, i2, z);
        }
        return null;
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.filter.IFilterManager
    public int sendEffectMsg(int i, int i2, int i3, String str) {
        this.mHandler.post(new Runnable() { // from class: com.ss.ttlivestreamer.livestreamv2.filter.FilterManager.54
            public final /* synthetic */ int val$arg1;
            public final /* synthetic */ int val$arg2;
            public final /* synthetic */ String val$arg3;
            public final /* synthetic */ String val$callInfo;
            public final /* synthetic */ int val$msgType;

            @Override // java.lang.Runnable
            public void run() {
                com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$54_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public void com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$54__run$___twin___() {
                int sendEffectMsg;
                if (FilterManager.this.isValid() && (sendEffectMsg = FilterManager.this.mEffect.sendEffectMsg(r2, r3, r4, r5)) != 0) {
                    FilterManager.this.mErrorListener.onError(sendEffectMsg, r6);
                }
            }

            public static void com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$54_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass54 anonymousClass54) {
                boolean LIZ;
                try {
                    anonymousClass54.com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$54__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }

            public AnonymousClass54(int i4, int i22, int i32, String str2, String str22) {
                r2 = i4;
                r3 = i22;
                r4 = i32;
                r5 = str2;
                r6 = str22;
            }
        });
        return 0;
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.filter.IFilterManager
    public int setBeautify(String str, float f, float f2, float f3) {
        this.mHandler.post(new Runnable() { // from class: com.ss.ttlivestreamer.livestreamv2.filter.FilterManager.11
            public final /* synthetic */ String val$callInfo;
            public final /* synthetic */ float val$fBrightIntensity;
            public final /* synthetic */ float val$fSharpIntensity;
            public final /* synthetic */ float val$fSmoothIntensity;
            public final /* synthetic */ String val$resPath;

            @Override // java.lang.Runnable
            public void run() {
                com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$11_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public void com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$11__run$___twin___() {
                int beautify;
                if (FilterManager.this.isValid() && (beautify = FilterManager.this.mEffect.setBeautify(r2, r3, r4, r5)) != 0) {
                    FilterManager.this.mErrorListener.onError(beautify, r6);
                }
            }

            public static void com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$11_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass11 anonymousClass11) {
                boolean LIZ;
                try {
                    anonymousClass11.com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$11__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }

            public AnonymousClass11(String str2, float f4, float f22, float f32, String str22) {
                r2 = str2;
                r3 = f4;
                r4 = f22;
                r5 = f32;
                r6 = str22;
            }
        });
        return 0;
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.filter.IFilterManager
    public int setCustomEffectWithUri(String str, String str2, int i, int i2) {
        this.mHandler.post(new Runnable() { // from class: com.ss.ttlivestreamer.livestreamv2.filter.FilterManager.17
            public final /* synthetic */ String val$callInfo;
            public final /* synthetic */ String val$renderCacheKey;
            public final /* synthetic */ int val$requireHeight;
            public final /* synthetic */ int val$requireWidth;
            public final /* synthetic */ String val$uriString;

            @Override // java.lang.Runnable
            public void run() {
                com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$17_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public void com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$17__run$___twin___() {
                if (FilterManager.this.isValid()) {
                    Bitmap loadBitmapCompat = ImageLoadUtils.loadBitmapCompat(FilterManager.this.mContext, r2, r3, r4);
                    if (loadBitmapCompat == null) {
                        AVLog.ioe("FilterManager", "loadBitmapCompat failed");
                        return;
                    }
                    int customEffectBitmap = FilterManager.this.mEffect.setCustomEffectBitmap(r5, loadBitmapCompat);
                    if (customEffectBitmap == 0) {
                        return;
                    }
                    FilterManager.this.mErrorListener.onError(customEffectBitmap, r6);
                }
            }

            public static void com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$17_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass17 anonymousClass17) {
                boolean LIZ;
                try {
                    anonymousClass17.com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$17__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }

            public AnonymousClass17(String str22, int i3, int i22, String str3, String str32) {
                r2 = str22;
                r3 = i3;
                r4 = i22;
                r5 = str3;
                r6 = str32;
            }
        });
        return 0;
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.filter.IFilterManager
    public void setDoubleViewRect(double d, double d2, double d3, double d4) {
        getCallInfo(Double.valueOf(d), Double.valueOf(d2), Double.valueOf(d3), Double.valueOf(d4));
        this.mHandler.post(new Runnable() { // from class: com.ss.ttlivestreamer.livestreamv2.filter.FilterManager.42
            public final /* synthetic */ double val$height;
            public final /* synthetic */ double val$topLeftX;
            public final /* synthetic */ double val$topLeftY;
            public final /* synthetic */ double val$width;

            @Override // java.lang.Runnable
            public void run() {
                com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$42_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public void com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$42__run$___twin___() {
                if (FilterManager.this.isValid()) {
                    FilterManager.this.mEffect.setDoubleViewRect(r2, r4, r6, r8);
                }
            }

            public static void com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$42_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass42 anonymousClass42) {
                boolean LIZ;
                try {
                    anonymousClass42.com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$42__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }

            public AnonymousClass42(double d5, double d22, double d32, double d42) {
                r2 = d5;
                r4 = d22;
                r6 = d32;
                r8 = d42;
            }
        });
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.filter.IFilterManager
    public int setInputText(String str, int i, int i2, String str2) {
        this.mHandler.post(new Runnable() { // from class: com.ss.ttlivestreamer.livestreamv2.filter.FilterManager.64
            public final /* synthetic */ String val$cArg3;
            public final /* synthetic */ String val$callInfo;
            public final /* synthetic */ String val$input_text;
            public final /* synthetic */ int val$nArg1;
            public final /* synthetic */ int val$nArg2;

            @Override // java.lang.Runnable
            public void run() {
                com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$64_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public void com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$64__run$___twin___() {
                int inputText;
                if (FilterManager.this.isValid() && (inputText = FilterManager.this.mEffect.setInputText(r2, r3, r4, r5)) != 0) {
                    FilterManager.this.mErrorListener.onError(inputText, r6);
                }
            }

            public static void com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$64_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass64 anonymousClass64) {
                boolean LIZ;
                try {
                    anonymousClass64.com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$64__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }

            public AnonymousClass64(String str3, int i3, int i22, String str22, String str32) {
                r2 = str3;
                r3 = i3;
                r4 = i22;
                r5 = str22;
                r6 = str32;
            }
        });
        return 0;
    }

    private void catchFrame(VideoCatcher videoCatcher, VideoFrame videoFrame, int i, int i2, int i3) {
        if (videoCatcher != null) {
            if (videoCatcher.getMode() == 0) {
                videoCatcher.onFrame(videoFrame);
            } else {
                if (videoCatcher.getMode() != 1) {
                    return;
                }
                GLES20.glBindFramebuffer(36160, i);
                videoCatcher.readPixels(i2, i3);
                GLES20.glBindFramebuffer(36160, 0);
            }
        }
    }

    public static IFilterManager create(IInputAudioStream iInputAudioStream, Context context, Handler handler, IVideoEffectProcessor iVideoEffectProcessor, AudioDeviceModule audioDeviceModule) {
        return new FilterManager(iInputAudioStream, context, handler, iVideoEffectProcessor, audioDeviceModule, false, 4, true, 1);
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.filter.IFilterManager
    public int composerReplaceNodesWithTags(String[] strArr, int i, String[] strArr2, int i2, String[] strArr3) {
        this.mHandler.post(new Runnable() { // from class: com.ss.ttlivestreamer.livestreamv2.filter.FilterManager.38
            public final /* synthetic */ String val$callInfo;
            public final /* synthetic */ int val$newPathNum;
            public final /* synthetic */ String[] val$newPaths;
            public final /* synthetic */ String[] val$newTags;
            public final /* synthetic */ int val$oldPathNum;
            public final /* synthetic */ String[] val$oldPaths;

            @Override // java.lang.Runnable
            public void run() {
                com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$38_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public void com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$38__run$___twin___() {
                int composerReplaceNodesWithTags;
                if (FilterManager.this.isValid() && (composerReplaceNodesWithTags = FilterManager.this.mEffect.composerReplaceNodesWithTags(r2, r3, r4, r5, r6)) != 0) {
                    FilterManager.this.mErrorListener.onError(composerReplaceNodesWithTags, r7);
                }
            }

            public static void com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$38_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass38 anonymousClass38) {
                boolean LIZ;
                try {
                    anonymousClass38.com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$38__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }

            public AnonymousClass38(String[] strArr4, int i3, String[] strArr22, int i22, String[] strArr32, String str) {
                r2 = strArr4;
                r3 = i3;
                r4 = strArr22;
                r5 = i22;
                r6 = strArr32;
                r7 = str;
            }
        });
        return 0;
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.ILiveStream.IAudioFrameAvailableListener
    public void onAudioFrameAvailable(Buffer buffer, int i, int i2, int i3, long j) {
        AudioDeviceModule audioDeviceModule;
        AudioDeviceModule.AudioRenderSink effectAudioRender;
        int startAudioRecognize;
        if ((buffer instanceof ByteBuffer) && buffer.isDirect()) {
            if (i * 100 == i2) {
                if (!this.mAudioRecognizing && !this.mEnalbeAudioGraphSticker) {
                    return;
                }
                if (isValid() && this.mEffect.isAudioRecognizeAvailable() && (startAudioRecognize = this.mEffect.startAudioRecognize((ByteBuffer) buffer, i, i2, i3)) != 0) {
                    IFilterManager.ErrorListener errorListener = this.mErrorListener;
                    StringBuilder LIZJ = C06460Ne.LIZJ("startAudioRecognize(ByteBuffer, ", i, ", ", i2, ", ");
                    LIZJ.append(i3);
                    LIZJ.append(")");
                    errorListener.onError(startAudioRecognize, X1D.LIZIZ(LIZJ));
                }
                synchronized (this.mAudioEffectLock) {
                    if (isValid() && this.mEnalbeAudioGraphSticker) {
                        int effectAudioProcessData = this.mEffect.effectAudioProcessData((ByteBuffer) buffer, i, i2, i3);
                        if (effectAudioProcessData != 0) {
                            this.mErrorListener.onError(effectAudioProcessData, "");
                        }
                        if (this.mUseAudioGraphStickerOutput && (audioDeviceModule = this.mAdm) != null && audioDeviceModule.isEchoMode() && (effectAudioRender = this.mEffect.getEffectAudioRender()) != null) {
                            effectAudioRender.onData(buffer, i, i2, i3, j);
                            effectAudioRender.setQuirks(1L);
                        }
                    }
                }
                return;
            }
            throw new AndroidRuntimeException("Audio data should be 10ms per frame!");
        }
        throw new AndroidRuntimeException("Audio buffer should be a direct byte buffer!");
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.filter.IFilterManager
    public void processPanEvent(float f, float f2, float f3, float f4, float f5) {
        this.mHandler.post(new Runnable() { // from class: com.ss.ttlivestreamer.livestreamv2.filter.FilterManager.45
            public final /* synthetic */ float val$dx;
            public final /* synthetic */ float val$dy;
            public final /* synthetic */ float val$factor;
            public final /* synthetic */ float val$x;
            public final /* synthetic */ float val$y;

            @Override // java.lang.Runnable
            public void run() {
                com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$45_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public void com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$45__run$___twin___() {
                if (FilterManager.this.isValid()) {
                    FilterManager.this.mEffect.processPanEvent(r2, r3, r4, r5, r6);
                }
            }

            public static void com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$45_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass45 anonymousClass45) {
                boolean LIZ;
                try {
                    anonymousClass45.com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$45__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }

            public AnonymousClass45(float f6, float f22, float f32, float f42, float f52) {
                r2 = f6;
                r3 = f22;
                r4 = f32;
                r5 = f42;
                r6 = f52;
            }
        });
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.filter.IFilterManager
    public int setFilter(String str, String str2, float f, float f2, float f3) {
        this.mHandler.post(new Runnable() { // from class: com.ss.ttlivestreamer.livestreamv2.filter.FilterManager.21
            public final /* synthetic */ String val$callInfo;
            public final /* synthetic */ String val$leftFilterPath;
            public final /* synthetic */ float val$leftIntensity;
            public final /* synthetic */ float val$position;
            public final /* synthetic */ String val$rightFilterPath;
            public final /* synthetic */ float val$rightIntensity;

            @Override // java.lang.Runnable
            public void run() {
                com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$21_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public void com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$21__run$___twin___() {
                int filter;
                if (FilterManager.this.isValid() && (filter = FilterManager.this.mEffect.setFilter(r2, r3, r4, r5, r6)) != 0) {
                    FilterManager.this.mErrorListener.onError(filter, r7);
                }
            }

            public static void com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$21_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass21 anonymousClass21) {
                boolean LIZ;
                try {
                    anonymousClass21.com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$21__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }

            public AnonymousClass21(String str3, String str22, float f22, float f32, float f4, String str32) {
                r2 = str3;
                r3 = str22;
                r4 = f22;
                r5 = f32;
                r6 = f4;
                r7 = str32;
            }
        });
        return 0;
    }

    public static IFilterManager create(IInputAudioStream iInputAudioStream, Context context, Handler handler, IVideoEffectProcessor iVideoEffectProcessor, AudioDeviceModule audioDeviceModule, LiveStreamBuilder liveStreamBuilder) {
        return new FilterManager(iInputAudioStream, context, handler, iVideoEffectProcessor, audioDeviceModule, liveStreamBuilder.getEdgeRender(), liveStreamBuilder.getFilterBufferPoolSize(), liveStreamBuilder.isFilterBufferPoolSyncMode(), liveStreamBuilder.getFilterProcessType(), liveStreamBuilder.getVeLivePusher(), liveStreamBuilder);
    }

    private VideoFrame wrapperFrame(FilterVideoBufferPool.Recycle recycle, VideoFrame videoFrame, int i, int i2, RoiInfo roiInfo, EffectWrapper.AlgorithmResult algorithmResult) {
        Matrix matrix = new Matrix();
        matrix.reset();
        matrix.preTranslate(0.5f, 0.5f);
        matrix.preScale(1.0f, -1.0f);
        matrix.preTranslate(-0.5f, -0.5f);
        int textureId = recycle.getBuffer().getTextureId();
        recycle.addRef();
        TextureBufferImpl textureBufferImpl = new TextureBufferImpl(i, i2, VideoFrame.TextureBuffer.Type.RGB, textureId, matrix, this, new IDRunnableS6S0101000(7, recycle, 17), algorithmResult);
        textureBufferImpl.updateCaptureMs(videoFrame.getBuffer().getCaptureMs());
        textureBufferImpl.setROIInfo(roiInfo);
        return new VideoFrame(textureBufferImpl, 0, videoFrame.getTimestampNs());
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.filter.IFilterManager
    public int composerAppendNodesWithTags(String[] strArr, int i, String[] strArr2, boolean z, boolean z2, boolean z3) {
        getCallInfo(strArr, Integer.valueOf(i), strArr2);
        StringBuilder LIZLLL = C00F.LIZLLL("composerAppendNodesWithTags, inMic: ", z, " inMusic: ", z2, " useOutput: ");
        LIZLLL.append(z3);
        AVLog.logKibana(4, "FilterManager", X1D.LIZIZ(LIZLLL), null);
        this.mHandler.post(new Runnable() { // from class: com.ss.ttlivestreamer.livestreamv2.filter.FilterManager.36
            public final /* synthetic */ boolean val$inMic;
            public final /* synthetic */ boolean val$inMusic;
            public final /* synthetic */ int val$nodeNum;
            public final /* synthetic */ String[] val$nodePaths;
            public final /* synthetic */ String[] val$tags;
            public final /* synthetic */ boolean val$useOutput;

            @Override // java.lang.Runnable
            public void run() {
                com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$36_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public void com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$36__run$___twin___() {
                if (FilterManager.this.isValid()) {
                    boolean z4 = r2;
                    if (z4 || r3) {
                        FilterManager.this.setupAudioGraphStickerContext(z4, r3, r4);
                        FilterManager.this.composerAppendNodesWithTags(r5, r6, r7);
                    } else {
                        FilterManager.this.composerAppendNodesWithTags(r5, r6, r7);
                    }
                }
            }

            public static void com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$36_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass36 anonymousClass36) {
                boolean LIZ;
                try {
                    anonymousClass36.com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$36__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }

            public AnonymousClass36(boolean z4, boolean z22, boolean z32, String[] strArr3, int i2, String[] strArr22) {
                r2 = z4;
                r3 = z22;
                r4 = z32;
                r5 = strArr3;
                r6 = i2;
                r7 = strArr22;
            }
        });
        return 0;
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.filter.IFilterManager
    public int composerSetNodesWithTags(String[] strArr, int i, String[] strArr2, boolean z, boolean z2, boolean z3) {
        getCallInfo(strArr, Integer.valueOf(i), strArr2);
        StringBuilder LIZLLL = C00F.LIZLLL("composerSetNodesWithTags, inMic: ", z, " inMusic: ", z2, " useOutput: ");
        LIZLLL.append(z3);
        AVLog.logKibana(5, "FilterManager", X1D.LIZIZ(LIZLLL), null);
        this.mHandler.post(new Runnable() { // from class: com.ss.ttlivestreamer.livestreamv2.filter.FilterManager.33
            public final /* synthetic */ boolean val$inMic;
            public final /* synthetic */ boolean val$inMusic;
            public final /* synthetic */ int val$nodeNum;
            public final /* synthetic */ String[] val$nodePaths;
            public final /* synthetic */ String[] val$tags;
            public final /* synthetic */ boolean val$useOutput;

            @Override // java.lang.Runnable
            public void run() {
                com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$33_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public void com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$33__run$___twin___() {
                if (FilterManager.this.isValid()) {
                    boolean z4 = r2;
                    if (z4 || r3) {
                        FilterManager.this.setupAudioGraphStickerContext(z4, r3, r4);
                        FilterManager.this.composerSetNodesWithTags(r5, r6, r7);
                    } else {
                        FilterManager.this.composerSetNodesWithTags(r5, r6, r7);
                    }
                }
            }

            public static void com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$33_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass33 anonymousClass33) {
                boolean LIZ;
                try {
                    anonymousClass33.com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$33__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }

            public AnonymousClass33(boolean z4, boolean z22, boolean z32, String[] strArr3, int i2, String[] strArr22) {
                r2 = z4;
                r3 = z22;
                r4 = z32;
                r5 = strArr3;
                r6 = i2;
                r7 = strArr22;
            }
        });
        return 0;
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.filter.IFilterManager
    public void enableExpressionDetect(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.mHandler.post(new Runnable() { // from class: com.ss.ttlivestreamer.livestreamv2.filter.FilterManager.57
            public final /* synthetic */ boolean val$enableAgeDetect;
            public final /* synthetic */ boolean val$enableAttractivenessDetect;
            public final /* synthetic */ boolean val$enableEmotionDetect;
            public final /* synthetic */ boolean val$enableGenderDetect;
            public final /* synthetic */ boolean val$enableHappinessDetect;
            public final /* synthetic */ boolean val$enableRenZhongDetect;

            @Override // java.lang.Runnable
            public void run() {
                com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$57_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public void com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$57__run$___twin___() {
                IVideoEffectProcessor iVideoEffectProcessor = FilterManager.this.mEffect;
                if (iVideoEffectProcessor != null) {
                    iVideoEffectProcessor.enableExpressionDetect(r2, r3, r4, r5, r6, r7);
                }
            }

            public static void com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$57_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass57 anonymousClass57) {
                boolean LIZ;
                try {
                    anonymousClass57.com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$57__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }

            public AnonymousClass57(boolean z7, boolean z22, boolean z32, boolean z42, boolean z52, boolean z62) {
                r2 = z7;
                r3 = z22;
                r4 = z32;
                r5 = z42;
                r6 = z52;
                r7 = z62;
            }
        });
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.filter.IFilterManager
    public int setFilter(String str, String str2, float f, float f2, float f3, boolean z) {
        this.mHandler.post(new Runnable() { // from class: com.ss.ttlivestreamer.livestreamv2.filter.FilterManager.22
            public final /* synthetic */ String val$callInfo;
            public final /* synthetic */ String val$leftFilterPath;
            public final /* synthetic */ float val$leftIntensity;
            public final /* synthetic */ float val$position;
            public final /* synthetic */ String val$rightFilterPath;
            public final /* synthetic */ float val$rightIntensity;
            public final /* synthetic */ boolean val$useV2;

            @Override // java.lang.Runnable
            public void run() {
                com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$22_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public void com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$22__run$___twin___() {
                int filter;
                if (FilterManager.this.isValid() && (filter = FilterManager.this.mEffect.setFilter(r2, r3, r4, r5, r6, r7)) != 0) {
                    FilterManager.this.mErrorListener.onError(filter, r8);
                }
            }

            public static void com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$22_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass22 anonymousClass22) {
                boolean LIZ;
                try {
                    anonymousClass22.com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$22__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }

            public AnonymousClass22(String str3, String str22, float f22, float f32, float f4, boolean z2, String str32) {
                r2 = str3;
                r3 = str22;
                r4 = f22;
                r5 = f32;
                r6 = f4;
                r7 = z2;
                r8 = str32;
            }
        });
        return 0;
    }

    public static IFilterManager create(IInputAudioStream iInputAudioStream, Context context, Handler handler, IVideoEffectProcessor iVideoEffectProcessor, AudioDeviceModule audioDeviceModule, boolean z) {
        return new FilterManager(iInputAudioStream, context, handler, iVideoEffectProcessor, audioDeviceModule, z, 4, true, 1);
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.filter.IFilterManager
    public void processTouchEventWithTouchType(long j, float f, float f2, float f3, float f4, int i, int i2) {
        this.mHandler.post(new Runnable() { // from class: com.ss.ttlivestreamer.livestreamv2.filter.FilterManager.44
            public final /* synthetic */ int val$evt;
            public final /* synthetic */ float val$force;
            public final /* synthetic */ float val$majorRadius;
            public final /* synthetic */ int val$pointerCount;
            public final /* synthetic */ long val$pointerId;
            public final /* synthetic */ float val$x;
            public final /* synthetic */ float val$y;

            @Override // java.lang.Runnable
            public void run() {
                com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$44_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public void com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$44__run$___twin___() {
                if (FilterManager.this.isValid()) {
                    FilterManager.this.mEffect.processTouchEventWithTouchType(r2, r4, r5, r6, r7, r8, r9);
                }
            }

            public static void com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$44_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass44 anonymousClass44) {
                boolean LIZ;
                try {
                    anonymousClass44.com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$44__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }

            public AnonymousClass44(long j2, float f5, float f22, float f32, float f42, int i3, int i22) {
                r2 = j2;
                r4 = f5;
                r5 = f22;
                r6 = f32;
                r7 = f42;
                r8 = i3;
                r9 = i22;
            }
        });
    }

    public FilterManager(IInputAudioStream iInputAudioStream, Context context, Handler handler, IVideoEffectProcessor iVideoEffectProcessor, AudioDeviceModule audioDeviceModule, boolean z, int i, boolean z2, int i2) {
        this(iInputAudioStream, context, handler, iVideoEffectProcessor, audioDeviceModule, z, i, z2, i2, null, null);
    }

    public void configEffect(int i, int i2, String str, String str2, boolean z, boolean z2, String str3, AssetManager assetManager, Object obj) {
        this.mHandler.post(new Runnable() { // from class: com.ss.ttlivestreamer.livestreamv2.filter.FilterManager.8
            public final /* synthetic */ AssetManager val$assetMgr;
            public final /* synthetic */ String val$deviceName;
            public final /* synthetic */ int val$height;
            public final /* synthetic */ boolean val$isUseTTDetect;
            public final /* synthetic */ String val$modelPath;
            public final /* synthetic */ String val$platformConfig;
            public final /* synthetic */ Object val$resourceFinder;
            public final /* synthetic */ boolean val$useNewEngine;
            public final /* synthetic */ int val$width;

            @Override // java.lang.Runnable
            public void run() {
                com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$8_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public void com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$8__run$___twin___() {
                if (FilterManager.this.isValid()) {
                    Object obj2 = r2;
                    if (obj2 != null) {
                        FilterManager.this.mEffect.setResourceFinder(obj2);
                    }
                    AssetManager assetManager2 = r3;
                    if (assetManager2 != null) {
                        FilterManager.this.mEffect.setAssetManager(assetManager2);
                    }
                    FilterManager.this.mEffect.configEffect(r4, r5, r6, r7, r8, r9, r10);
                    IVideoEffectProcessor.EffectMsgListener effectMsgListener = FilterManager.this.mMsgListener;
                    if (effectMsgListener != null) {
                        effectMsgListener.onMessageReceived(2139095041, 0, 0, null);
                    }
                }
            }

            public static void com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$8_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass8 anonymousClass8) {
                boolean LIZ;
                try {
                    anonymousClass8.com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$8__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }

            public AnonymousClass8(Object obj2, AssetManager assetManager2, int i3, int i22, String str4, String str22, boolean z3, boolean z22, String str32) {
                r2 = obj2;
                r3 = assetManager2;
                r4 = i3;
                r5 = i22;
                r6 = str4;
                r7 = str22;
                r8 = z3;
                r9 = z22;
                r10 = str32;
            }
        });
    }

    public FilterManager(IInputAudioStream iInputAudioStream, Context context, Handler handler, IVideoEffectProcessor iVideoEffectProcessor, AudioDeviceModule audioDeviceModule, boolean z, int i, boolean z2, int i2, IVeLivePusher iVeLivePusher, LiveStreamBuilder liveStreamBuilder) {
        int sRBufferPoolSize;
        int cropBufferPoolSize;
        this.mAudioEffectLock = new Object();
        this.mExtrDataFlags = 0L;
        this.mExtraDataGop = 0;
        this.mNoExtraSendFrameCounts = 0;
        this.mRawVideoDumpers = new VideoDumpProxy.RawVideoDumperProxy[2];
        this.mShowRoiRegion = false;
        this.mStretchRoi = false;
        this.mEffectAudioVolume = 1.0f;
        this.mKeepVideoCatcherAlive = false;
        this.mFindContourListener = null;
        this.mEnableFindContour = false;
        this.mVpassEnableFindContour = true;
        this.mContourDataCallBack = null;
        this.mContourInfoListener = null;
        this.mContourDataSendInterval = 1;
        this.mContourInfoInteractId = "";
        this.mSendContourInfoType = 2;
        this.mCurrentOut2dTex = -1;
        this.mProcessErrorCount = 0;
        this.mEnableThreeBuffer = false;
        this.mEnableOesTo2DAsync = false;
        this.mEnableDropFrameWhenNoBuffer = false;
        this.mEnableVideoBlackFrameCheck = false;
        this.mBlackFrameBlockSize = 4;
        this.mBlackFrameDetectThreshold = 10;
        this.mBlackFrameCounter = 0;
        this.mBlackFrameCountBeforeEffect = 0;
        this.mBlackFrameCountAfterEffect = 0;
        this.mBlackFrameDetectResult = 0;
        this.mOriginAudioRenderQuirks = 0L;
        this.effectProcessError = 0;
        this.mProcessType = i2;
        handler = i2 == 3 ? null : handler;
        this.mHandler = handler;
        this.mContext = context;
        this.mVeLivePusher = iVeLivePusher;
        if (handler != null) {
            ThreadUtils.invokeAtFrontUninterruptibly(handler, new Runnable() { // from class: com.ss.ttlivestreamer.livestreamv2.filter.FilterManager.2
                @Override // java.lang.Runnable
                public void run() {
                    com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$2_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                }

                public void com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$2__run$___twin___() {
                    if (!GlUtil.nativeIsOpenGlThread()) {
                        StringBuilder LIZ = X1D.LIZ();
                        LIZ.append("Thread is not a gl thread.");
                        LIZ.append(FilterManager.this.mHandler.getLooper().getThread().getName());
                        AVLog.logKibana(5, "FilterManager", X1D.LIZIZ(LIZ), null);
                        StringBuilder LIZ2 = X1D.LIZ();
                        LIZ2.append("not a gl thread.");
                        LIZ2.append(FilterManager.this.mHandler.getLooper().getThread().getName());
                        AndroidRuntimeException androidRuntimeException = new AndroidRuntimeException(X1D.LIZIZ(LIZ2));
                        if (!AnonymousClass028.LJI(androidRuntimeException, "FilterManager.FilterManager")) {
                            FilterManager.this.mHandler = null;
                            return;
                        }
                        throw androidRuntimeException;
                    }
                }

                public AnonymousClass2() {
                }

                public static void com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$2_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass2 anonymousClass2) {
                    boolean LIZ;
                    try {
                        anonymousClass2.com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$2__run$___twin___();
                    } finally {
                        if (LIZ) {
                        }
                    }
                }
            });
        }
        if (this.mHandler == null) {
            GLThread lockGLThread = SafeHandlerThreadPoolExecutor.lockGLThread("LiveFilterThread");
            this.mGLThread = lockGLThread;
            lockGLThread.start();
            this.mHandler = this.mGLThread.getHandler();
        }
        this.mAdm = audioDeviceModule;
        this.mAudioStreamObserver = iInputAudioStream;
        this.mOrientationListener = new AlbumOrientationEventListener(context);
        this.mErrorListener = new C1B6();
        ThreadUtils.invokeAtFrontUninterruptibly(this.mHandler, new Runnable() { // from class: com.ss.ttlivestreamer.livestreamv2.filter.FilterManager.3
            public final /* synthetic */ boolean val$isEdgeRender;
            public final /* synthetic */ AudioDeviceModule val$module;
            public final /* synthetic */ IVideoEffectProcessor val$videoEffectProcessor;

            @Override // java.lang.Runnable
            public void run() {
                com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$3_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public void com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$3__run$___twin___() {
                IInputAudioStream iInputAudioStream2;
                IVideoEffectProcessor iVideoEffectProcessor2 = r2;
                if (iVideoEffectProcessor2 != null) {
                    FilterManager.this.mEffect = iVideoEffectProcessor2;
                } else {
                    FilterManager.this.mEffect = new EffectWrapper(r3, r4);
                }
                if (!FilterManager.this.mEffect.valid()) {
                    FilterManager.this.mEffect.release();
                    FilterManager.this.mEffect = null;
                    return;
                }
                AudioDeviceModule.AudioRenderSink effectAudioRender = FilterManager.this.mEffect.getEffectAudioRender();
                if (effectAudioRender != null && (iInputAudioStream2 = FilterManager.this.mAudioStreamObserver) != null) {
                    effectAudioRender.setAudioTrack(iInputAudioStream2.getAudioTrack());
                    effectAudioRender.setVolume(FilterManager.this.mEffectAudioVolume);
                    AudioMixer.AudioMixerDescription mixerDescription = FilterManager.this.mAudioStreamObserver.getMixerDescription();
                    FilterManager filterManager = FilterManager.this;
                    mixerDescription.volumeCoeff = filterManager.mEffectAudioVolume;
                    filterManager.mAudioStreamObserver.start();
                }
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("Using Effect info ");
                LIZ.append(FilterManager.this.mEffect.name());
                LIZ.append(" ");
                LIZ.append(FilterManager.this.mEffect.getEffectVersion());
                AVLog.iow("FilterManager", X1D.LIZIZ(LIZ));
                FilterManager.this.mOffscreenDraw = new GlRenderDrawer();
            }

            public static void com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$3_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass3 anonymousClass3) {
                boolean LIZ;
                try {
                    anonymousClass3.com_ss_ttlivestreamer_livestreamv2_filter_FilterManager$3__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }

            public AnonymousClass3(IVideoEffectProcessor iVideoEffectProcessor2, AudioDeviceModule audioDeviceModule2, boolean z3) {
                r2 = iVideoEffectProcessor2;
                r3 = audioDeviceModule2;
                r4 = z3;
            }
        });
        this.mBufferPool = new FilterVideoBufferPool(Math.max(i, 4), z2, true);
        DebugLogUtils.isEnableDebugLog();
        if (i2 == 3) {
            if (liveStreamBuilder == null) {
                cropBufferPoolSize = 3;
            } else {
                cropBufferPoolSize = liveStreamBuilder.getCropBufferPoolSize();
            }
            this.mCropBufferPool = new FilterVideoBufferPool(Math.max(cropBufferPoolSize, 3), z2);
            DebugLogUtils.isEnableDebugLog();
        } else {
            this.mCropBufferPool = null;
        }
        if (liveStreamBuilder == null) {
            sRBufferPoolSize = 3;
        } else {
            sRBufferPoolSize = liveStreamBuilder.getSRBufferPoolSize();
        }
        this.mSRBufferPool = new FilterVideoBufferPool(Math.max(sRBufferPoolSize, 3), z2);
        DebugLogUtils.isEnableDebugLog();
    }
}
