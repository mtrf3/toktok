package X;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.view.Surface;
import com.bef.effectsdk.message.MessageCenter;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import com.bytedance.bpea.basics.Cert;
import com.ss.android.medialib.model.EnigmaResult;
import com.ss.android.medialib.presenter.IStickerRequestCallback;
import com.ss.android.ttve.model.VEFrame;
import com.ss.android.ttve.model.VERenderContext;
import com.ss.android.ttve.model.VETrackParams;
import com.ss.android.vesdk.VEAudioCapture;
import com.ss.android.vesdk.VEAudioCaptureSettings;
import com.ss.android.vesdk.VEAudioEncodeSettings;
import com.ss.android.vesdk.VECameraFrameTime;
import com.ss.android.vesdk.VECameraSettings;
import com.ss.android.vesdk.VECherEffectParam;
import com.ss.android.vesdk.VEConfigCenter;
import com.ss.android.vesdk.VEDebugSettings;
import com.ss.android.vesdk.VEDisplaySettings;
import com.ss.android.vesdk.VEDuetSettings;
import com.ss.android.vesdk.VEEffectParams;
import com.ss.android.vesdk.VEFocusSettings;
import com.ss.android.vesdk.VEPreviewSettings;
import com.ss.android.vesdk.VEReactSettings;
import com.ss.android.vesdk.VERecordMode;
import com.ss.android.vesdk.VERecorder;
import com.ss.android.vesdk.VESafeAreaParams;
import com.ss.android.vesdk.VESize;
import com.ss.android.vesdk.VETouchPointer;
import com.ss.android.vesdk.VEVideoEncodeSettings;
import com.ss.android.vesdk.VEVolumeParam;
import com.ss.android.vesdk.VEWatermarkParam;
import com.ss.android.vesdk.clipparam.VEClipTimelineParam;
import com.ss.android.vesdk.effect.IEffect;
import com.ss.android.vesdk.filterparam.VEEffectFilterParam;
import com.ss.android.vesdk.lens.VEBaseRecorderLensParams;
import com.ss.android.vesdk.model.VEPrePlayParams;
import com.ss.android.vesdk.model.VERecordPerformanceData;
import com.ss.android.vesdk.runtime.VEMapBufferInfo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.WyL, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public abstract class AbstractC84025WyL {
    public VEAudioEncodeSettings mAudioEncodeSettings;
    public InterfaceC84055Wyp mAudioRecorderStateListener;
    public String mBgmPath;
    public int mBgmType;
    public VECameraSettings mCameraSettings;
    public InterfaceC84139X0l mCameraStateListener;
    public X0Z mCameraZoomListener;
    public Context mContext;
    public boolean mCreateEffectUseAmazing;
    public InterfaceC83744Wto mDetectListener;
    public String mDetectModelsDir;
    public InterfaceC84056Wyq mEffectAudioManagerCallback;
    public boolean mEnablePBO;
    public boolean mEnableWaterMark;
    public boolean mIsBindingViewMode;
    public VECameraSettings.CAMERA_FACING_ID mLastCameraFacing;
    public MessageCenter.Listener mMessageListener;
    public VERecorder.OnFrameAvailableListenerExt mOnFrameAvailableListenerExt;
    public InterfaceC84059Wyt mPictureTakenProxyListener;
    public InterfaceC84060Wyu mPreviewDataCallbackListener;
    public X0U mRecorderPreviewListener;
    public X0E mRecorderStateListener;
    public C63975P8x mRenderView;
    public AbstractC84033WyT mResManager;
    public InterfaceC83712WtI mSATZoomListener;
    public X0S mShaderZoomListener;
    public IStickerRequestCallback mStickerRequestCallback;
    public C84119Wzr mSystemResManager;
    public long mTrimIn;
    public VEAudioCapture mVEAudioCapture;
    public InterfaceC84053Wyn mVEAudioRecordStateCallback;
    public InterfaceC84061Wyv mVECherEffectParamCallback;
    public VEDuetSettings mVEDuetSettings;
    public X0O mVEEffectAlgorithmCallback;
    public InterfaceC84042Wyc mVEFaceInfoCallback;
    public InterfaceC84065Wyz mVEHandDetectCallback;
    public InterfaceC84069Wz3 mVEPreviewRadioListener;
    public VEReactSettings mVEReactSettings;
    public InterfaceC84070Wz4 mVESceneDetectCallback;
    public X0K mVESkeletonDetectCallback;
    public X0T mVESmartBeautyCallback;
    public VEWatermarkParam mVEWatermarkParam;
    public InterfaceC84054Wyo mVeAudioRecordVolumeCallback;
    public InterfaceC87319YOt mVeVoiceActivityDetectionCallback;
    public VEVideoEncodeSettings mVideoEncodeSettings;
    public final ArrayList<X0L> mRecStateListeners = new ArrayList<>();
    public final Object mRecStateLisLock = new Object();
    public C169706lK<InterfaceC84071Wz5> mVESlamDetectListeners = new C169706lK<>();
    public HashMap<Integer, Object> callbackMap = new HashMap<>();
    public final Object mCallbackMapLock = new Object();
    public long voiceHandler = -1;
    public VERecordMode mVERecordMode = VERecordMode.DEFAULT;
    public long mTrimOut = -1;
    public int mPreviewRadioMode = EnumC63976P8y.RADIO_FULL.ordinal();
    public VESize mRenderViewSize = null;
    public boolean mRenderViewSizeChanged = false;
    public C84066Wz0 mCurBeauty = new C84066Wz0();
    public VEEffectFilterParam mCurEffectRequest = new VEEffectFilterParam();
    public C84049Wyj mCurFilter = new C84049Wyj();
    public C84068Wz2 mCurReShape = new C84068Wz2();
    public C84067Wz1 mCurMakeup = new C84067Wz1();
    public VEVolumeParam mVolumes = new VEVolumeParam();
    public VESize mVideoOutputSize = new VESize(0, 0);
    public float mPaddingBottomInRadio34 = 0.125f;
    public float mViewportPaddingBottomInRadio34 = 0.125f;
    public boolean mForceFirstFrameHasEffect = false;
    public boolean mEnableAEC = false;
    public boolean mUseFlip = false;
    public String mAECModelPath = null;
    public boolean mVolumeDetect = false;
    public AssetManager mAssetManager = null;
    public boolean mIsSupportStyleFeature = false;
    public int recordLagCount = 0;
    public int recordSeriousLagCount = 0;
    public int recordLagMaxDuration = 0;
    public int recordLagTotalDuration = 0;
    public float recordRenderFps = 0.0f;
    public float recordRenderDropFps = 0.0f;
    public int recordCount = 0;
    public float recordWriteFps = 0.0f;
    public int previewLagCount = 0;
    public int previewSeriousLagCount = 0;
    public int previewSubLagCount = 0;
    public int previewLagMaxDuration = 0;
    public int previewSubLagMaxDuration = 0;
    public int previewLagTotalDuration = 0;
    public int previewSubLagTotalDuration = 0;
    public float previewRenderFps = 0.0f;
    public float previewSubRenderFps = 0.0f;
    public float previewDropFps = 0.0f;
    public double recordPreviewFpsStart = LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX;
    public double recordPreviewFpsEnd = LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX;
    public double renderFrameTime = LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX;
    public double renderEffectTime = LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX;
    public float cameraOpenpreviewFirstNFrameIntervalsAverageMS = -1.0f;
    public float previewFirstNFrameIntervalsAverageMS = -1.0f;
    public float recordFirstNFrameIntervalsAverageMS = -1.0f;
    public boolean mEnableEarBack = false;
    public boolean mIsEnableVBoost = false;
    public boolean mAttachAudioFromOther = false;
    public EnumC83975WxX mMulticamEffectMode = EnumC83975WxX.NONE;
    public InterfaceC84078WzC recordScanControl = new C84034WyU(this);
    public OF0 recordMotionPhotoControl = new C61575OEp(this);

    public void addDataSource(AbstractC124534uf abstractC124534uf) {
    }

    public boolean addMetadata(String str, String str2) {
        return false;
    }

    public boolean addPipRenderTarget(Surface surface, int i, int i2, Bitmap bitmap, boolean z) {
        return false;
    }

    public abstract void addSticker(Bitmap bitmap, int i, int i2);

    public abstract int animateImageToPreview(String str, String str2);

    public int animateImagesToPreview(List<String> list, List<VEFrame> list2) {
        return -1;
    }

    public abstract int appendComposerNodes(String[] strArr, int i);

    public abstract void capture(int i, int i2, int i3, boolean z, boolean z2, InterfaceC84058Wys interfaceC84058Wys, InterfaceC84057Wyr interfaceC84057Wyr);

    public abstract void capture(int i, boolean z, boolean z2, InterfaceC84058Wys interfaceC84058Wys, InterfaceC84057Wyr interfaceC84057Wyr);

    public void captureNightEnhance(C84084WzI c84084WzI, InterfaceC84057Wyr interfaceC84057Wyr) {
    }

    public abstract void changeDuetVideo(String str, String str2);

    public boolean changePreviewSize(VESize vESize) {
        return false;
    }

    public void changeRecordContentType(EnumC46476ILw enumC46476ILw) {
    }

    public abstract void changeRecordMode(VERecordMode vERecordMode);

    public void changeRecorderState(int i) {
    }

    public int changeRenderSize(VESize vESize) {
        return 0;
    }

    public abstract int changeSurface(Surface surface);

    public int changeSurface(Surface surface, int i, int i2) {
        return 0;
    }

    public int changeSurfaceSync(Surface surface, int i, int i2) {
        return 0;
    }

    public void changeVideoEncodeSettings(VEVideoEncodeSettings vEVideoEncodeSettings) {
    }

    public abstract int[] checkComposerNodeExclusion(String str, String str2);

    public abstract int[] checkComposerNodeExclusion(String str, String str2, String str3);

    public void chooseSlamFace(int i) {
    }

    public void clearAllFrags() {
    }

    public void clearDisplayColor(int i, int i2, int i3, int i4) {
    }

    public abstract void clearSticker();

    public abstract int concat(String str, String str2, int i, String str3, String str4);

    public abstract int concat(String str, String str2, int i, String str3, String str4, int i2);

    public abstract void deleteLastFrag();

    public abstract void disableRender(boolean z);

    public void enable34To916RatioForEffectRender(boolean z) {
    }

    public abstract void enableAudio(boolean z);

    public void enableAudioPlayGlitchMetrics(boolean z) {
    }

    public void enableAudioPlayerFromVE(boolean z) {
    }

    public void enableBachScan(boolean z, X0F x0f) {
    }

    public abstract void enableDuetMicRecord(boolean z);

    public abstract void enableEffect(boolean z);

    public abstract void enableFaceBeautifyDetect(int i);

    public abstract void enableFaceExtInfo(int i);

    public void enableFastCVProcess(int i, boolean z) {
    }

    public void enableFirstFrameBypassEffectFrame(boolean z) {
    }

    public void enableFollowingShotWindowLoopPlayWhenRecord(boolean z) {
    }

    public void enableGetPropTrack(boolean z) {
    }

    public void enableLensProcess(int i, boolean z) {
    }

    public void enablePictureTestMode(boolean z, boolean z2) {
    }

    public void enablePreviewPureColorFakeFrame(boolean z) {
    }

    public void enableRecordBGMToMp4(boolean z) {
    }

    public void enableRecordFlip(boolean z) {
    }

    public abstract void enableScan(boolean z, long j);

    public abstract void enableSceneRecognition(boolean z);

    public abstract void enableSkeletonDetect(boolean z);

    public abstract void enableSmartBeauty(boolean z);

    public abstract void enableStickerRecognition(boolean z);

    public int exportResource(String str) {
        return -1;
    }

    public boolean fetchDistortionInfo(InterfaceC84062Wyw interfaceC84062Wyw) {
        return false;
    }

    public void forceVEPermanceRunOnceNow(Boolean bool) {
    }

    public abstract float[] getAECSuggestVolume();

    public P4F getAudioConsumer() {
        return null;
    }

    public C168396jD getAudioPlayGlitchInfo() {
        return null;
    }

    public int getBGMTrackIndex() {
        return 0;
    }

    public abstract float getCameraFps();

    public VECameraFrameTime getCameraFrameTime() {
        return null;
    }

    public abstract String getComposerNodePaths();

    public abstract float getComposerNodeValue(String str, String str2);

    public VERenderContext getCurVERenderContext() {
        return null;
    }

    public InterfaceC84100WzY getCurrentCameraCapture() {
        return null;
    }

    public VEDisplaySettings getDisplaySettings() {
        return null;
    }

    public int getDuetAVTrackIndex(int i) {
        return -1;
    }

    public abstract String getDuetAudioPath();

    public IEffect getEffect() {
        return null;
    }

    public String getEffectETData(int i) {
        return null;
    }

    public C78941UyX getEffectFrameCostStatistics() {
        return null;
    }

    public long getEffectHandler() {
        return 0L;
    }

    public HYA getEffectStickerLagInfo() {
        return null;
    }

    public abstract long getEndFrameTime();

    public abstract EnigmaResult getEnigmaResult();

    public abstract float getFilterIntensity(String str);

    public C63877P5d getInternalRecorder() {
        return null;
    }

    public VERecordPerformanceData getLastPerformanceData() {
        return null;
    }

    public int getLastRecordFrameNum() {
        return 0;
    }

    public VEMapBufferInfo getMapBuffer() {
        return null;
    }

    public int getMicState() {
        return 0;
    }

    public long getPerfStageCostByKey(String str) {
        return -1L;
    }

    public int getPreviewFrame(C84098WzW c84098WzW) {
        return 0;
    }

    public int getPreviewFrameWithOrigin(C84098WzW c84098WzW) {
        return 0;
    }

    public int[] getPreviewRenderRect() {
        return null;
    }

    public abstract String getReactAudioPath();

    public abstract int[] getReactRegionInRecordVideoPixel();

    public abstract int[] getReactRegionInViewPixel();

    public abstract int[] getReactionPosMarginInViewPixel();

    public abstract float getReactionWindowRotation();

    public long getRealSegmentFrameTimeUS() {
        return 0L;
    }

    public int getRecordStatus() {
        return 0;
    }

    public InterfaceC84082WzG getRecorderModelControl() {
        return null;
    }

    public InterfaceC84083WzH getRecorderPrePlayControl() {
        return null;
    }

    public long getSegmentAudioPlayBackTimestamp() {
        return 0L;
    }

    public long getSegmentAudioUS() {
        return 0L;
    }

    public long getSegmentFrameTimeUS() {
        return 0L;
    }

    public int getSlamFaceCount() {
        return 0;
    }

    public boolean getSmallWindowSnapshot(int i, int i2, InterfaceC84072Wz6 interfaceC84072Wz6) {
        return false;
    }

    public VEAudioCaptureSettings getSuggestionSettingsForKaraoke() {
        return null;
    }

    public abstract ICH getVideoController();

    public void handleEffectAudio(boolean z, long j) {
    }

    public abstract void handleEffectAudioPlay(boolean z);

    public abstract void initFaceBeautifyDetectExtParam(C84074Wz8 c84074Wz8);

    public abstract void initFaceBeautyDetectExtParam(C84075Wz9 c84075Wz9);

    public abstract void initFaceDetectExtParam(C84073Wz7 c84073Wz7);

    public int initFollowingShotWindow(String str, long j, long j2) {
        return 0;
    }

    public abstract void initHDRNetDetectExtParam(C84076WzA c84076WzA);

    public abstract void initHandDetectExtParam(C84077WzB c84077WzB);

    public abstract boolean isGestureRegistered(OOG oog);

    public int loadDraft(C84086WzK c84086WzK) {
        return 0;
    }

    public void notifyFollowShotSurfaceChanged(Surface surface, int i, int i2, boolean z) {
    }

    public void notifySurfaceChanged(int i, int i2, int i3, boolean z) {
    }

    public void onDestroy() {
        this.mCameraStateListener = null;
        this.mCameraZoomListener = null;
        this.mRecorderStateListener = null;
        clearRecorderStateListener();
        this.mOnFrameAvailableListenerExt = null;
        this.mVEFaceInfoCallback = null;
        this.mVEEffectAlgorithmCallback = null;
        this.mDetectListener = null;
        this.mMessageListener = null;
        this.mVECherEffectParamCallback = null;
        this.mVESkeletonDetectCallback = null;
        this.mContext = null;
        this.mRenderView = null;
        this.recordScanControl = null;
        this.recordMotionPhotoControl = null;
        this.callbackMap.clear();
    }

    public void onPause() {
    }

    public void onResume() {
    }

    public abstract void pauseEffectAudio(boolean z);

    public void pauseMediaRecord() {
    }

    public int pauseRender() {
        return -200;
    }

    public void pauseRenderAsync(InterfaceC84052Wym interfaceC84052Wym) {
    }

    public abstract boolean posInReactionRegion(int i, int i2);

    public abstract void preventTextureRender(boolean z);

    public abstract boolean previewDuetVideo();

    public abstract int processTouchEvent(float f, float f2);

    public abstract boolean processTouchEvent(VETouchPointer vETouchPointer, int i);

    public abstract void recoverCherEffect(VECherEffectParam vECherEffectParam);

    public int refreshMotionPhoto() {
        return -1;
    }

    public void regHandDetectCallback(int[] iArr, InterfaceC84065Wyz interfaceC84065Wyz) {
    }

    public void regSmartBeautyCallback(X0T x0t) {
    }

    public void releaseGPUResources() {
    }

    public void releaseGPUResourcesAsync(InterfaceC84052Wym interfaceC84052Wym) {
    }

    public abstract int reloadComposerNodes(String[] strArr, int i);

    public abstract int removeComposerNodes(String[] strArr, int i);

    public void renderFrame(Bitmap bitmap, int i, int i2, boolean z, InterfaceC84064Wyy interfaceC84064Wyy) {
    }

    public void renderFrame(VEFrame vEFrame, int i, int i2, InterfaceC84064Wyy interfaceC84064Wyy) {
    }

    public void renderFrame(VEFrame vEFrame, C84098WzW c84098WzW) {
    }

    public void renderFrame(String str) {
    }

    public abstract int replaceComposerNodes(String[] strArr, int i, String[] strArr2, int i2);

    public void resetCameraFrameTime() {
    }

    public void resetEffectETData(int i) {
    }

    public void resetEffectFrameCostStatistics() {
    }

    public void resetQRDetectZoom(float f, boolean z) {
    }

    public void resumeMediaRecord() {
    }

    public abstract float rotateReactionWindow(float f);

    public abstract int[] scaleReactionWindow(float f);

    public abstract void sendEffectMsg(int i, long j, long j2, String str);

    public void setAlgorithmChangeMsgEnable(int i, boolean z) {
    }

    public abstract int setAlgorithmPreConfig(int i, int i2);

    public void setAudioCaptureListener(P4F p4f) {
    }

    public void setAudioDevice(boolean z) {
    }

    public void setAudioRecordStateCallback(InterfaceC84053Wyn interfaceC84053Wyn) {
    }

    public void setBackground(int i, int i2, int i3, int i4) {
    }

    public abstract int setBeautyFace(int i, String str);

    public abstract int setBeautyFaceIntensity(float f, float f2);

    public abstract int setBeautyIntensity(int i, float f);

    public void setBgmMute(boolean z) {
    }

    public void setCameraClose(boolean z) {
    }

    public abstract void setCameraFirstFrameOptimize(boolean z);

    public void setCaptureMirror(int i) {
    }

    public abstract void setCaptureMirror(boolean z);

    public void setCaptureResize(boolean z, int[] iArr, int[] iArr2) {
    }

    public void setClientState(int i) {
    }

    public abstract int setComposerMode(int i, int i2);

    public abstract int setComposerNodes(String[] strArr, int i);

    public abstract int setComposerResourcePath(String str);

    public void setCustomVideoBg(String str, String str2) {
    }

    public abstract void setCustomVideoBg(String str, String str2, String str3);

    public abstract void setDLEEnable(boolean z);

    public void setDebugSettings(VEDebugSettings vEDebugSettings) {
    }

    public void setDetectInterval(int i) {
    }

    public void setDetectionMode(boolean z) {
    }

    public void setDeviceRotation(int i) {
    }

    public abstract void setDeviceRotation(float[] fArr);

    public void setDisplayBlendFrameParam(C84085WzJ c84085WzJ) {
    }

    public void setDisplayParamsListener(InterfaceC84087WzL interfaceC84087WzL) {
    }

    public int setDisplaySettings(VEDisplaySettings vEDisplaySettings) {
        return 0;
    }

    public abstract void setDropFrame(int i);

    public abstract void setDuetVideoCompleteCallback(Runnable runnable);

    public boolean setEffectAudioManagerCallback(InterfaceC84056Wyq interfaceC84056Wyq) {
        return false;
    }

    public abstract void setEffectBgmEnable(boolean z);

    public abstract int setEffectMaxMemoryCache(int i);

    public void setEffectSlamEnable(boolean z) {
    }

    public abstract int setEnableAEC(boolean z, String str);

    public abstract void setEnableDuetV2(boolean z);

    public int setEnableEarBack(boolean z) {
        return 0;
    }

    public abstract int setEnableLoudness(boolean z, int i);

    public void setExternalFaceMakeupOpacity(String str, float f, float f2) {
    }

    public abstract int setFaceMakeUp(String str);

    public abstract int setFaceMakeUp(String str, float f, float f2);

    public abstract int setFaceReshape(String str, float f, float f2);

    public abstract int setFilter(String str, float f, boolean z);

    public abstract void setFilter(String str, String str2, float f);

    public abstract int setFilterNew(String str, float f);

    public abstract void setFilterNew(String str, String str2, float f, float f2, float f3);

    public void setFollowShotDisplayDegree(int i) {
    }

    public void setFollowingShotWindowsBackground(int i, int i2, int i3, int i4) {
    }

    public void setForceAlgorithmEnableCount(int i) {
    }

    public void setForceAlgorithmExecuteCount(int i) {
    }

    public void setFrameEffectCallback(InterfaceC84063Wyx interfaceC84063Wyx) {
    }

    public void setHandDetectLowpowerEnable(boolean z) {
    }

    public void setImageExposure(float f) {
    }

    public int setLandscape(int i, int i2, int i3) {
        return 0;
    }

    public void setLargeMattingModelEnable(boolean z) {
    }

    public void setLensParams(VEBaseRecorderLensParams vEBaseRecorderLensParams, X03 x03) {
    }

    public abstract int setMaleMakeupState(boolean z);

    public int setMultiCamMode(EnumC83975WxX enumC83975WxX) {
        return 0;
    }

    public int setMultiCamModeAsync(EnumC83975WxX enumC83975WxX) {
        return 0;
    }

    public void setMusicNodes(String str) {
    }

    public void setPerfTimingByKey(String str, long j) {
    }

    public void setPreSavePcmSize(int i) {
    }

    public abstract void setPreviewDuetVideoPaused(boolean z);

    public abstract void setPreviewRatio(int i, float f, VESize vESize, VESize vESize2);

    public abstract void setPreviewRotation(int i);

    public abstract void setReactPosMarginInVideoRecordPixel(int i, int i2, int i3, int i4);

    public abstract void setReactionBorderParam(int i, int i2);

    public abstract boolean setReactionMaskImagePath(String str, boolean z);

    public void setRecordMode(int i) {
    }

    public void setRecordScanSettings(C84045Wyf c84045Wyf, boolean z) {
    }

    public abstract void setRenderCacheString(String str, String str2);

    public abstract void setRenderCacheTexture(String str, String str2);

    public abstract int setReshapeIntensity(int i, float f);

    public abstract int setReshapeIntensityDict(java.util.Map<Integer, Float> map);

    public abstract int setReshapeParam(String str, java.util.Map<Integer, Float> map);

    public abstract int setReshapeResource(String str);

    public int setSafeArea(int i, VESafeAreaParams[] vESafeAreaParamsArr) {
        return 0;
    }

    public abstract void setScanArea(float f, float f2, float f3, float f4);

    public void setScanListener(InterfaceC84088WzM interfaceC84088WzM, InterfaceC63909P6j interfaceC63909P6j) {
    }

    public void setShaderZoomListener(X0S x0s) {
    }

    public abstract boolean setSharedTextureStatus(boolean z);

    public abstract int setSkinTone(String str);

    public abstract int setSkinToneIntensity(float f);

    public int setSlamFace(Bitmap bitmap) {
        return -1;
    }

    public void setSpeed(float f) {
    }

    public abstract void setStickerRequestCallback(IStickerRequestCallback iStickerRequestCallback);

    public void setSubSurface(Surface surface, int i, int i2) {
    }

    public abstract void setSwapDuetRegion(boolean z);

    public abstract void setSwapReactionRegion(boolean z);

    public void setUseMultiPreviewRatio(boolean z) {
    }

    public abstract int setVEEffectParams(VEEffectParams vEEffectParams);

    public abstract void setVideoBgSpeed(double d);

    public void setVideoEncodeRotation(int i) {
    }

    public abstract int shotScreen(int i, int i2, boolean z, InterfaceC63955P8d interfaceC63955P8d, boolean z2, VERecorder.IVEFrameShotScreenCallback iVEFrameShotScreenCallback, boolean z3);

    public abstract int shotScreen(int i, int i2, boolean z, boolean z2, InterfaceC63955P8d interfaceC63955P8d);

    public abstract int shotScreen(int i, int i2, boolean z, boolean z2, VERecorder.IVEFrameShotScreenCallback iVEFrameShotScreenCallback, boolean z3);

    public abstract int shotScreen(C63965P8n c63965P8n);

    public abstract int shotScreen(String str, int i, int i2, boolean z, boolean z2, Bitmap.CompressFormat compressFormat, InterfaceC63961P8j interfaceC63961P8j);

    public abstract int shotScreen(String str, int i, int i2, boolean z, boolean z2, Bitmap.CompressFormat compressFormat, InterfaceC63961P8j interfaceC63961P8j, boolean z3);

    public abstract int slamDeviceConfig(boolean z, boolean z2, boolean z3, boolean z4);

    public abstract int slamGetTextBitmap(X09 x09);

    public abstract int slamGetTextLimitCount(X0H x0h);

    public abstract int slamGetTextParagraphContent(X0H x0h);

    public abstract int slamNotifyHideKeyBoard(boolean z);

    public abstract int slamProcessDoubleClickEvent(float f, float f2);

    public abstract int slamProcessIngestAcc(double d, double d2, double d3, double d4);

    public abstract int slamProcessIngestGra(double d, double d2, double d3, double d4);

    public abstract int slamProcessIngestGyr(double d, double d2, double d3, double d4);

    public abstract int slamProcessIngestOri(double[] dArr, double d);

    public abstract int slamProcessPanEvent(float f, float f2, float f3, float f4, float f5);

    public abstract int slamProcessRotationEvent(float f, float f2);

    public abstract int slamProcessScaleEvent(float f, float f2);

    public abstract int slamProcessTouchEventByType(int i, float f, float f2, int i2);

    public abstract int slamSetInputText(String str, int i, int i2, String str2);

    public abstract int slamSetLanguage(String str);

    public abstract void startAudioRecorder();

    public void startCameraPreview(P6Q p6q, boolean z) {
    }

    public int startFollowingShotPreview() {
        return 0;
    }

    public void startMediaRecord(String str, InterfaceC84100WzY interfaceC84100WzY) {
    }

    public abstract void startPreview(Surface surface);

    public int startRender() {
        return -200;
    }

    public void startRenderAsync(InterfaceC84052Wym interfaceC84052Wym) {
    }

    public abstract void stopAudioRecorder();

    public void stopFollowShowRender(boolean z) {
    }

    public void stopFollowingShotPreview() {
    }

    public void stopMediaRecord(InterfaceC84100WzY interfaceC84100WzY) {
    }

    public int stopPreview(boolean z) {
        return 0;
    }

    public abstract void stopPreview();

    public int stopPreviewParallel() {
        return 0;
    }

    public abstract int stopRecord();

    public abstract int stopRecord(boolean z);

    public void stopRender(boolean z) {
    }

    public abstract boolean suspendGestureRecognizer(OOG oog, boolean z);

    public boolean swapMainAndPipRenderTarget(boolean z) {
        return false;
    }

    public void switchSingleOrDualCamera(InterfaceC84100WzY interfaceC84100WzY, boolean z) {
    }

    public void unRegFaceInfoCallback() {
        this.mVEFaceInfoCallback = null;
    }

    public void unRegHandDetectCallback() {
    }

    public void unRegSkeletonDetectCallback() {
        this.mVESkeletonDetectCallback = null;
    }

    public void unRegSmartBeautyCallback() {
    }

    public void unregEffectAlgorithmCallback() {
        this.mVEEffectAlgorithmCallback = null;
    }

    public void unregSceneDetectCallback() {
    }

    public abstract void updateAlgorithmRuntimeParam(int i, float f);

    public abstract int updateComposerNode(String str, String str2, float f);

    public void updateDuetLayout(EnumC62342cY enumC62342cY) {
    }

    public void updateLensParams(VEBaseRecorderLensParams vEBaseRecorderLensParams) {
    }

    public int updateMultiComposerNodes(int i, String[] strArr, String[] strArr2, float[] fArr) {
        return 0;
    }

    public abstract int[] updateReactionRegion(int i, int i2, int i3, int i4, float f);

    public abstract void updateRotation(float f, float f2, float f3);

    public void updateVideoDecodeChainByTimeline() {
    }

    public void useAudioGraphOutput(boolean z, boolean z2, boolean z3, boolean z4) {
    }

    public abstract void useMusic(boolean z);

    public void changeCamera() {
        throw new UnsupportedOperationException("No longer supported in new refactored version");
    }

    public void clearLandMarkDetectListener() {
        throw new UnsupportedOperationException("Not supported yet. Use TECameraVideoRecorder");
    }

    public void clearRecorderStateListener() {
        synchronized (this.mRecStateLisLock) {
            this.mRecStateListeners.clear();
        }
    }

    public C63877P5d createInternalRecorder() {
        return new C63877P5d();
    }

    public InterfaceC84100WzY detachCameraCapture() {
        throw new UnsupportedOperationException("Not supported yet. Use TECameraVideoRecorder");
    }

    public void downExposureCompensation() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public X0R getCameraECInfo() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public VECameraSettings.CAMERA_FACING_ID getCameraFacing() {
        throw new UnsupportedOperationException("No longer supported in new refactored version");
    }

    public boolean getEnableVBoost() {
        return C65429Pm5.LJFF("ve_enable_vboost", false);
    }

    public float getMaxZoom() {
        throw new UnsupportedOperationException("No longer supported in new refactored version");
    }

    public long getPrePlayTimeStamp() {
        throw new UnsupportedOperationException("Only supported in new refactored version");
    }

    public String[] getRecordedVideoPaths() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public ArrayList<X0L> getRecorderStateExtListeners() {
        ArrayList<X0L> arrayList;
        synchronized (this.mRecStateLisLock) {
            arrayList = new ArrayList<>(this.mRecStateListeners);
            X0E x0e = this.mRecorderStateListener;
            if (x0e != null && (x0e instanceof X0L)) {
                arrayList.add((X0L) x0e);
            }
        }
        return arrayList;
    }

    public ArrayList<X0E> getRecorderStateListeners() {
        ArrayList<X0E> arrayList;
        synchronized (this.mRecStateLisLock) {
            arrayList = new ArrayList<>(this.mRecStateListeners);
            X0E x0e = this.mRecorderStateListener;
            if (x0e != null) {
                arrayList.add(x0e);
            }
        }
        return arrayList;
    }

    public Object getStyleAudioProxy() {
        P4Q.LIZJ("TERecorderBase", "getStyleAudioProxy not impl");
        return null;
    }

    public Object getStyleProxy() {
        P4Q.LIZJ("TERecorderBase", "getStyleProxy not impl");
        return null;
    }

    public boolean isSupportedExposureCompensation() {
        throw new UnsupportedOperationException("No longer supported in new refactored version");
    }

    public int pausePrePlay() {
        throw new UnsupportedOperationException("Only supported in new refactored version");
    }

    public float queryShaderStep() {
        throw new UnsupportedOperationException("No longer supported in new refactored version");
    }

    public int queryZoomAbility() {
        throw new UnsupportedOperationException("No longer supported in new refactored version");
    }

    public void setFocusWithFaceDetect() {
        throw new UnsupportedOperationException("No longer supported in new refactored version");
    }

    public void startCameraPreview() {
        throw new UnsupportedOperationException("No longer supported in new refactored version");
    }

    public void stopCameraPreview() {
        throw new UnsupportedOperationException("No longer supported in new refactored version");
    }

    public void stopZoom() {
        throw new UnsupportedOperationException("No longer supported in new refactored version");
    }

    public void upExposureCompensation() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void updateCameraOrientation() {
        throw new UnsupportedOperationException("No longer supported in new refactored version");
    }

    public int getVBoostTimeout() {
        VEConfigCenter.ValuePkt value = VEConfigCenter.getInstance().getValue("ve_vboost_timeout");
        if (value != null && (value.getValue() instanceof Integer)) {
            return ((Integer) value.getValue()).intValue();
        }
        return 50;
    }

    public VERecordMode getCurRecordMode() {
        return this.mVERecordMode;
    }

    public int getRecordCount() {
        return this.recordCount;
    }

    public void addCommonCallback(InterfaceC133905Ni interfaceC133905Ni) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void addLandMarkDetectListener(X0W x0w) {
        throw new UnsupportedOperationException("Not supported yet. Use TECameraVideoRecorder");
    }

    public void addRecorderStateListener(X0L x0l) {
        synchronized (this.mRecStateLisLock) {
            this.mRecStateListeners.add(x0l);
        }
    }

    public void addSlamDetectListener(InterfaceC84071Wz5 interfaceC84071Wz5) {
        if (interfaceC84071Wz5 != null) {
            this.mVESlamDetectListeners.LIZ(interfaceC84071Wz5);
        }
    }

    public void attachCameraCapture(InterfaceC84100WzY interfaceC84100WzY) {
        throw new UnsupportedOperationException("Not supported yet. Use TECameraVideoRecorder");
    }

    public void changeCamera(VECameraSettings.CAMERA_FACING_ID camera_facing_id) {
        throw new UnsupportedOperationException("No longer supported in new refactored version");
    }

    public int changeResManager(AbstractC84033WyT abstractC84033WyT) {
        this.mResManager = abstractC84033WyT;
        return 0;
    }

    public void configStyleResourceFinder(AssetManager assetManager) {
        this.mIsSupportStyleFeature = true;
        this.mAssetManager = assetManager;
    }

    public int deleteFrag(int i) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void deleteLastFrag(InterfaceC84052Wym interfaceC84052Wym) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void enableAudioRecorder(boolean z) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void enableEffectAmazing(boolean z) {
        this.mCreateEffectUseAmazing = z;
    }

    public void enableNewAudioCapture(boolean z) {
        this.mAttachAudioFromOther = z;
        if (z) {
            P4Q.LJFF("TERecorderBase", "attach VEAudioCapture from other");
        }
    }

    public void enableRecordingMp4(boolean z) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void enableTimestampCallback(boolean z) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void enableWaterMark(boolean z) {
        this.mEnableWaterMark = z;
    }

    public VEFrame getFrameByConfig(C84041Wyb c84041Wyb) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public String getResourceMultiViewTag(String str) {
        throw new UnsupportedOperationException("Not supported yet. Use TECameraVideoRecorder");
    }

    public void initDuet(VEDuetSettings vEDuetSettings) {
        this.mVEDuetSettings = vEDuetSettings;
        this.mVERecordMode = VERecordMode.DUET;
    }

    public void initReact(VEReactSettings vEReactSettings) {
        this.mVEReactSettings = vEReactSettings;
        this.mVERecordMode = VERecordMode.REACTION;
    }

    public boolean isSupportWideAngle(VECameraSettings.CAMERA_TYPE camera_type) {
        throw new UnsupportedOperationException("No longer supported in new refactored version");
    }

    public void regEffectAlgorithmCallback(X0O x0o) {
        this.mVEEffectAlgorithmCallback = x0o;
    }

    public void regFaceInfoCallback(InterfaceC84042Wyc interfaceC84042Wyc) {
        this.mVEFaceInfoCallback = interfaceC84042Wyc;
    }

    public void regSkeletonDetectCallback(X0K x0k) {
        this.mVESkeletonDetectCallback = x0k;
    }

    public void removeCommonCallback(InterfaceC133905Ni interfaceC133905Ni) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void removeFaceInfoCallback(InterfaceC84042Wyc interfaceC84042Wyc) {
        this.mVEFaceInfoCallback = null;
    }

    public void removeLandMarkDetectListener(X0W x0w) {
        throw new UnsupportedOperationException("Not supported yet. Use TECameraVideoRecorder");
    }

    public void removeRecorderStateListener(X0L x0l) {
        synchronized (this.mRecStateLisLock) {
            this.mRecStateListeners.remove(x0l);
        }
    }

    public void removeSlamDetectListener(InterfaceC84071Wz5 interfaceC84071Wz5) {
        this.mVESlamDetectListeners.LJ(interfaceC84071Wz5);
    }

    public void runTask(Runnable runnable) {
        throw new UnsupportedOperationException("Only supported in new refactored version");
    }

    public void setCameraStateListener(InterfaceC84139X0l interfaceC84139X0l) {
        this.mCameraStateListener = interfaceC84139X0l;
    }

    public void setCameraZoomListener(X0Z x0z) {
        this.mCameraZoomListener = x0z;
    }

    public void setCommonCallback(InterfaceC133905Ni interfaceC133905Ni) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void setEffectMessageListener(MessageCenter.Listener listener) {
        this.mMessageListener = listener;
    }

    public void setExposureCompensation(int i) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void setFocus(VEFocusSettings vEFocusSettings) {
        throw new UnsupportedOperationException("No longer supported in new refactored version");
    }

    public void setFocusWithFaceDetect(VEFocusSettings vEFocusSettings) {
        throw new UnsupportedOperationException("No longer supported in new refactored version");
    }

    public void setOnErrorListener(InterfaceC133905Ni interfaceC133905Ni) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void setOnFrameAvailableListenerExt(VERecorder.OnFrameAvailableListenerExt onFrameAvailableListenerExt) {
        this.mOnFrameAvailableListenerExt = onFrameAvailableListenerExt;
    }

    public void setOnInfoListener(InterfaceC133905Ni interfaceC133905Ni) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void setPaddingBottomInRatio34(float f) {
        this.mViewportPaddingBottomInRadio34 = f;
    }

    public void setRecordMaxDuration(long j) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public int setRecordPrepareTime(long j) {
        throw new UnsupportedOperationException("Only supported in new refactored version");
    }

    public void setRecorderStateListener(X0E x0e) {
        synchronized (this.mRecStateLisLock) {
            this.mRecorderStateListener = x0e;
        }
    }

    public void setSATZoomListener(InterfaceC83712WtI interfaceC83712WtI) {
        this.mSATZoomListener = interfaceC83712WtI;
    }

    public void setVolume(VEVolumeParam vEVolumeParam) {
        this.mVolumes = vEVolumeParam;
    }

    public void setWaterMark(VEWatermarkParam vEWatermarkParam) {
        this.mVEWatermarkParam = vEWatermarkParam;
    }

    public void startAudioRecorder(Cert cert) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void startCameraPreview(P6Q p6q) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public int startPrePlay(VEPrePlayParams vEPrePlayParams) {
        throw new UnsupportedOperationException("Only supported in new refactored version");
    }

    public int startRecord(float f) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void startShaderZoom(float f) {
        throw new UnsupportedOperationException("No longer supported in new refactored version");
    }

    public void startZoom(float f) {
        throw new UnsupportedOperationException("No longer supported in new refactored version");
    }

    public void stopAudioRecorder(Cert cert) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public int stopPrePlay(InterfaceC84052Wym interfaceC84052Wym) {
        throw new UnsupportedOperationException("Only supported in new refactored version");
    }

    public void stopPreviewAsync(InterfaceC84052Wym interfaceC84052Wym) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public int stopRecord(InterfaceC84052Wym interfaceC84052Wym) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void stopRecordAsync(InterfaceC84052Wym interfaceC84052Wym) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public int switchCameraMode(int i) {
        throw new UnsupportedOperationException("No longer supported in new refactored version");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(15:4|(2:6|(13:8|9|(1:11)(1:29)|12|(1:14)(1:28)|15|(1:17)|18|19|20|(1:22)|23|24))|30|9|(0)(0)|12|(0)(0)|15|(0)|18|19|20|(0)|23|24) */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0074, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0075, code lost:
    
        X.C16880lQ.LLLLIIL(r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0051  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int switchEffect(com.ss.android.vesdk.filterparam.VEEffectFilterParam r7) {
        /*
            r6 = this;
            if (r7 != 0) goto L5
            r0 = -100
            return r0
        L5:
            X.P4w r3 = new X.P4w
            r3.<init>()
            java.lang.String r0 = r7.effectPath
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r2 = 1
            if (r0 != 0) goto L53
            java.lang.String r1 = r7.effectPath
            java.lang.String r0 = java.io.File.separator
            java.lang.String[] r1 = r1.split(r0)
            int r0 = r1.length
            if (r0 <= 0) goto L53
            int r0 = r1.length
            int r0 = r0 - r2
            r5 = r1[r0]
        L22:
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            java.lang.String r4 = "0"
            if (r0 == 0) goto L51
            r1 = r4
        L2b:
            java.lang.String r0 = "iesve_verecorder_set_sticker_id"
            r3.LIZJ(r0, r1)
            java.lang.String r0 = "old"
            r3.LIZIZ(r2, r0)
            java.lang.String r0 = "iesve_verecorder_set_sticker"
            X.C63867P4t.LIZLLL(r0, r3)
            boolean r0 = r7.multicamMode
            if (r0 == 0) goto L4e
            X.WxX r1 = X.EnumC83975WxX.DEFAULT_PRIMARY
        L40:
            X.WxX r0 = r6.mMulticamEffectMode
            if (r1 == r0) goto L49
            r6.setMultiCamMode(r1)
            r6.mMulticamEffectMode = r1
        L49:
            int r3 = r6.switchEffectInternal(r7)
            goto L56
        L4e:
            X.WxX r1 = X.EnumC83975WxX.NONE
            goto L40
        L51:
            r1 = r5
            goto L2b
        L53:
            java.lang.String r5 = ""
            goto L22
        L56:
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch: org.json.JSONException -> L74
            r2.<init>()     // Catch: org.json.JSONException -> L74
            java.lang.String r1 = "stickerId"
            boolean r0 = android.text.TextUtils.isEmpty(r5)     // Catch: org.json.JSONException -> L74
            if (r0 == 0) goto L64
            r5 = r4
        L64:
            r2.put(r1, r5)     // Catch: org.json.JSONException -> L74
            java.lang.String r0 = "resultCode"
            r2.put(r0, r3)     // Catch: org.json.JSONException -> L74
            java.lang.String r1 = "vesdk_event_recorder_switch_effect"
            java.lang.String r0 = "business"
            jp3.c.LIZ(r1, r0, r2)     // Catch: org.json.JSONException -> L74
            goto L78
        L74:
            r0 = move-exception
            X.C16880lQ.LLLLIIL(r0)
        L78:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC84025WyL.switchEffect(com.ss.android.vesdk.filterparam.VEEffectFilterParam):int");
    }

    public int switchEffectInternal(VEEffectFilterParam vEEffectFilterParam) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void switchFlashMode(VECameraSettings.CAMERA_FLASH_MODE camera_flash_mode) {
        throw new UnsupportedOperationException("No longer supported in new refactored version");
    }

    public void switchTorch(boolean z) {
        throw new UnsupportedOperationException("No longer supported in new refactored version");
    }

    public int addTrack(int i, VETrackParams vETrackParams) {
        throw new UnsupportedOperationException("Only supported in new refactored version");
    }

    public void changeVideoOutputSize(int i, int i2) {
        VESize vESize = this.mVideoOutputSize;
        vESize.width = i;
        vESize.height = i2;
    }

    public void enableAudioRecorder(boolean z, Cert cert) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public int pausePlayTrack(int i, int i2) {
        throw new UnsupportedOperationException("Only supported in new refactored version");
    }

    public int removeTrack(int i, int i2) {
        throw new UnsupportedOperationException("Only supported in new refactored version");
    }

    public void setDetectListener(InterfaceC83744Wto interfaceC83744Wto, int i) {
        this.mDetectListener = interfaceC83744Wto;
    }

    public void setDeviceRotation(float[] fArr, double d) {
        setDeviceRotation(fArr);
    }

    public void setFocus(float f, float f2) {
        throw new UnsupportedOperationException("No longer supported in new refactored version");
    }

    public int startPlayTrack(int i, int i2) {
        throw new UnsupportedOperationException("Only supported in new refactored version");
    }

    public void startPreviewAsync(Surface surface, InterfaceC84052Wym interfaceC84052Wym) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public int startRecord(String str, float f) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void startRecordAsync(float f, InterfaceC84052Wym interfaceC84052Wym) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public int stopPrePlay(InterfaceC84052Wym interfaceC84052Wym, C84013Wy9 c84013Wy9) {
        throw new UnsupportedOperationException("Only supported in new refactored version");
    }

    public void stopPreviewAsync(InterfaceC84052Wym interfaceC84052Wym, boolean z) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public AbstractC84025WyL(Context context, AbstractC84033WyT abstractC84033WyT, C63975P8x c63975P8x) {
        this.mIsBindingViewMode = false;
        this.mContext = context;
        this.mResManager = abstractC84033WyT;
        this.mRenderView = c63975P8x;
        if (c63975P8x != null) {
            this.mIsBindingViewMode = true;
        }
    }

    public int seekTrack(int i, int i2, long j) {
        throw new UnsupportedOperationException("Only supported in new refactored version");
    }

    public void setMockPreviewSettings(Bitmap bitmap, int i, int i2) {
        if (bitmap != null) {
            renderFrame(bitmap, i, i2, false, null);
        } else {
            P4Q.LJII("TERecorderBase", "setMockPreviewSettings warning, bitmap is null");
        }
    }

    public int setTrackSpeed(int i, int i2, float f) {
        throw new UnsupportedOperationException("Only supported in new refactored version");
    }

    public int startPlayTrack(int i, int i2, boolean z) {
        throw new UnsupportedOperationException("Only supported in new refactored version");
    }

    public int startRecord(String str, String str2, float f) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public int updateClipsTimelineParam(int i, int i2, java.util.Map<Integer, VEClipTimelineParam> map) {
        throw new UnsupportedOperationException("Only supported in new refactored version");
    }

    public int updateTrack(int i, int i2, VETrackParams vETrackParams) {
        throw new UnsupportedOperationException("Only supported in new refactored version");
    }

    public int alignTo(int i, int i2, int i3, int i4) {
        throw new UnsupportedOperationException("Only supported in new refactored version");
    }

    public void setFocus(float f, float f2, int i, int i2) {
        throw new UnsupportedOperationException("No longer supported in new refactored version");
    }

    public int setRecordBGM(String str, long j, long j2, int i) {
        this.mBgmPath = str;
        this.mTrimIn = j;
        this.mTrimOut = j2;
        this.mBgmType = i;
        return 0;
    }

    public int tryRestore(List<C84014WyA> list, String str, int i, int i2) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public int init(VECameraSettings vECameraSettings, VEVideoEncodeSettings vEVideoEncodeSettings, VEAudioEncodeSettings vEAudioEncodeSettings, String str, String str2) {
        if (vECameraSettings != null) {
            if (vEVideoEncodeSettings != null) {
                if (str != null) {
                    if (str2 != null) {
                        this.mCameraSettings = vECameraSettings;
                        this.mVideoEncodeSettings = vEVideoEncodeSettings;
                        this.mAudioEncodeSettings = vEAudioEncodeSettings;
                        this.mDetectModelsDir = str2;
                        return 0;
                    }
                    throw new NullPointerException("modelsDir could not be null");
                }
                throw new NullPointerException("recordDir could not be null");
            }
            throw new NullPointerException("VideoEncodeSettings could not be null");
        }
        throw new NullPointerException("CameraSettings could not be null");
    }

    public int tryRestore(String str, int i, int i2, int i3, int i4) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void tryRestoreAsync(List<C84014WyA> list, String str, int i, int i2, InterfaceC84052Wym interfaceC84052Wym) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public int init(VECameraSettings vECameraSettings, VEVideoEncodeSettings vEVideoEncodeSettings, VEAudioEncodeSettings vEAudioEncodeSettings, VEPreviewSettings vEPreviewSettings, String str, String str2) {
        throw new UnsupportedOperationException("Not supported yet. Use TECameraVideoRecorder");
    }

    public void concatAsync(String str, String str2, int i, String str3, String str4, InterfaceC84052Wym interfaceC84052Wym, int i2) {
        if (interfaceC84052Wym != null) {
            interfaceC84052Wym.LIZ(-1);
        }
    }

    public int init(InterfaceC84100WzY interfaceC84100WzY, VEVideoEncodeSettings vEVideoEncodeSettings, VEAudioEncodeSettings vEAudioEncodeSettings, VEPreviewSettings vEPreviewSettings, String str, String str2, boolean z) {
        throw new UnsupportedOperationException("Not supported yet. Use TECameraVideoRecorder");
    }

    public int init(VECameraSettings vECameraSettings, VEVideoEncodeSettings vEVideoEncodeSettings, VEAudioEncodeSettings vEAudioEncodeSettings, VEPreviewSettings vEPreviewSettings, String str, String str2, boolean z) {
        throw new UnsupportedOperationException("Not supported yet. Use TECameraVideoRecorder");
    }
}
