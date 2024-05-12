package com.ss.ttlivestreamer.livestreamv2;

import X.AnonymousClass028;
import X.C16880lQ;
import X.X1D;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveMaxRetainAlogMessageSizeSetting;
import com.livecore.base.tinyjson.TinyJson;
import com.ss.ttlivestreamer.core.codec.MediaCodecUtils;
import com.ss.ttlivestreamer.core.effect.IVideoEffectProcessor;
import com.ss.ttlivestreamer.core.engine.AudioDeviceModule;
import com.ss.ttlivestreamer.core.opengl.GLThreadManager;
import com.ss.ttlivestreamer.core.opengl.YuvConverter;
import com.ss.ttlivestreamer.core.transport.ContextUtils;
import com.ss.ttlivestreamer.core.transport.JNIUtils;
import com.ss.ttlivestreamer.core.utils.AVLog;
import com.ss.ttlivestreamer.core.utils.DebugLogUtils;
import com.ss.ttlivestreamer.core.utils.GlobalControler;
import com.ss.ttlivestreamer.core.utils.LiveStreamGpuHintSettings;
import com.ss.ttlivestreamer.core.utils.LiveStreamThreadPrioritySettings;
import com.ss.ttlivestreamer.core.utils.SafeHandlerThreadPoolExecutor;
import com.ss.ttlivestreamer.core.utils.ScopeMonitor;
import com.ss.ttlivestreamer.core.utils.TEBundle;
import com.ss.ttlivestreamer.core.utils.TTLSBuildConfig;
import com.ss.ttlivestreamer.core.utils.TTLSSladarBugReportUtils;
import com.ss.ttlivestreamer.livestreamv2.core.DummyLiveCoreImpl;
import com.ss.ttlivestreamer.livestreamv2.core.LiveCore;
import com.ss.ttlivestreamer.livestreamv2.core.velivepusher.IVeLivePusher;
import com.ss.ttlivestreamer.livestreamv2.log.ILogUploader;
import com.ss.ttlivestreamer.livestreamv2.sdkparams.BwEstBaseBWConfig;
import com.ss.ttlivestreamer.livestreamv2.sdkparams.BwEstCfg;
import com.ss.ttlivestreamer.livestreamv2.sdkparams.CaptureBase;
import com.ss.ttlivestreamer.livestreamv2.sdkparams.KcpParams;
import com.ss.ttlivestreamer.livestreamv2.sdkparams.LWReconnectCfg;
import com.ss.ttlivestreamer.livestreamv2.sdkparams.LiveSdkSetting;
import com.ss.ttlivestreamer.livestreamv2.sdkparams.NodeOptParams;
import com.ss.ttlivestreamer.livestreamv2.sdkparams.PsnrStatisics;
import com.ss.ttlivestreamer.livestreamv2.sdkparams.PushBase;
import com.ss.ttlivestreamer.livestreamv2.sdkparams.PushStallConfig;
import com.ss.ttlivestreamer.livestreamv2.sdkparams.QuicParams;
import com.ss.ttlivestreamer.livestreamv2.sdkparams.ReconnectConfig;
import com.ss.ttlivestreamer.livestreamv2.sdkparams.RtmpCacheConfig;
import com.ss.ttlivestreamer.livestreamv2.sdkparams.SandboxParams;
import com.ss.ttlivestreamer.livestreamv2.sdkparams.VPassInteractCfg;
import com.ss.ttlivestreamer.livestreamv2.utils.NumberInit;
import com.ss.ttlivestreamer.livestreamv2.utils.StringUtils;
import defpackage.i0;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public class LiveStreamBuilder {
    public static final int AUDIO_CAPTURE_DEVICE_AUDIORECORD = 1;
    public static final int AUDIO_CAPTURE_DEVICE_OPENSL = 2;
    public Object assetManager;
    public JSONObject dumpFrameParams;
    public boolean effectAlgorithmAB;
    public String effectModePath;
    public String effectPlatformConfig;
    public Object effectResourceFinder;
    public String encryptedLiveAuth;
    public LiveStreamGpuHintSettings gpuHintSettings;
    public AppInfo mAppInfo;
    public Context mContext;
    public boolean mEnableKTV;
    public ILogUploader mLogUploader;
    public JSONObject mSdkParams;
    public IVeLivePusher mVeLivePusher;
    public LiveStreamThreadPrioritySettings prioritySettings;
    public Intent screenCaptureIntent;
    public String streamID;
    public boolean useNewEffectEngine;
    public boolean useTTFaceDetect;
    public final LiveSdkSetting mSdkSetting = new LiveSdkSetting();
    public String mProjectKey = null;
    public String mPushUrlPrefix = "";
    public int mRtmpPort = -1;
    public boolean mUseShareRecorder = true;
    public boolean enableVelivePusher = false;
    public boolean initEncodeAndPublish = true;
    public int mVideoE2EDelaySampleInterval = 0;
    public int pauseFps = -1;
    public boolean pauseDisableEffectSwitch = false;
    public boolean videoMixerSwitch = true;
    public boolean videoLayerMixerSwitch = true;
    public int audioQuantizeGapPeriod = 0;
    public int videoWidth = 720;
    public int videoHeight = 1280;
    public int videoLevel = 2;
    public int videoGop = 0;
    public boolean enableAudioEncodeAccelera = false;
    public int audioBitwidth = 16;
    public int rtmpReconnectIntervalSeconds = 3;
    public int vsyncModuleMaxIntevalOnNowMs = LiveMaxRetainAlogMessageSizeSetting.DEFAULT;
    public int vsyncModuleMaxIntevalOnFrameMs = 3000;
    public boolean filterLogSwitch = true;
    public boolean isGpuTurboDisabled = false;
    public Map<String, Integer> threadConfigs = null;
    public boolean encodeLockOptimize = false;
    public boolean captureReleaseLockOptimize = false;
    public boolean enableFovSmallWindowOpt = false;
    public int fovOptCropAspectWidth = 9;
    public int fovOptCropAspectHeight = 16;
    public int fovOptMaxPiexelSize = 76800;
    public boolean useCameraVideoPtsInRtc = false;
    public boolean mAllowMicCaptureOnBackground = false;

    /* loaded from: classes6.dex */
    public static class AppInfo {
        public String appID;
        public String appVersion;
        public String deviceId;

        public JSONObject toJSONObject() {
            try {
                return new JSONObject().put("appId", this.appID).put("appVersion", this.appVersion).put("deviceId", this.deviceId);
            } catch (Exception unused) {
                return null;
            }
        }

        public AppInfo() {
        }

        public String getAppID() {
            return this.appID;
        }

        public String getAppVersion() {
            return this.appVersion;
        }

        public String getDeviceId() {
            return this.deviceId;
        }

        public AppInfo(JSONObject jSONObject) {
            try {
                String optString = jSONObject.optString("appId");
                if (!TextUtils.isEmpty(optString)) {
                    this.appID = optString;
                }
                String optString2 = jSONObject.optString("appVersion");
                if (!TextUtils.isEmpty(optString2)) {
                    this.appVersion = optString2;
                }
                String optString3 = jSONObject.optString("deviceId");
                if (!TextUtils.isEmpty(optString3)) {
                    this.deviceId = optString3;
                }
            } catch (Exception unused) {
            }
        }

        public AppInfo setAppID(String str) {
            this.appID = str;
            return this;
        }

        public AppInfo setAppVersion(String str) {
            this.appVersion = str;
            return this;
        }

        public AppInfo setDeviceId(String str) {
            this.deviceId = str;
            return this;
        }
    }

    public LiveCore.Builder.ILogMonitor getLiveCoreLogMonitor() {
        return null;
    }

    public boolean is2DTransDisabled() {
        return false;
    }

    public boolean isCropScaleDisabled() {
        return false;
    }

    public boolean isDropFramesDisabled() {
        return false;
    }

    public boolean isInitEncodeAndPublish() {
        return false;
    }

    public boolean isNetFpsAdaptiveEnable() {
        try {
            RtmpCacheConfig rtmpCacheCfgParams = getRtmpCacheCfgParams();
            if (NumberInit.isDefined(Integer.valueOf(rtmpCacheCfgParams.getEnableFpsAdjust()))) {
                return rtmpCacheCfgParams.getEnableFpsAdjust() > 0;
            }
            return false;
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
            TTLSSladarBugReportUtils.getInstance().report(e, "LiveStreamBuilder.isNetFpsAdaptiveEnable");
            if (!TTLSBuildConfig.canThrowException()) {
                AVLog.logKibana(6, "TinyJson", "parse sdkParams json failed", e);
                return false;
            }
            throw new AndroidRuntimeException(e);
        }
    }

    public boolean isUsingLiveStreamAudioCapture() {
        return true;
    }

    public void releaseHandles() {
        this.mContext = null;
        this.assetManager = null;
        this.effectResourceFinder = null;
        this.mLogUploader = new ILogUploader() { // from class: com.ss.ttlivestreamer.livestreamv2.LiveStreamBuilder.1
            @Override // com.ss.ttlivestreamer.livestreamv2.log.ILogUploader
            public void uploadLog(JSONObject jSONObject) {
            }
        };
        this.screenCaptureIntent = null;
    }

    public LiveStreamBuilder setUsingLiveStreamAudioCapture(boolean z) {
        return this;
    }

    private void parseUrlPrefixAndPort() {
        String str = this.mSdkSetting.suggestProtocol;
        str.getClass();
        switch (str.hashCode()) {
            case 106008:
                if (!str.equals("kcp")) {
                    return;
                }
                this.mPushUrlPrefix = "rtmpk://";
                this.mRtmpPort = this.mSdkSetting.rtmpPorts.get("kcp").intValue();
                return;
            case 114657:
                if (!str.equals("tcp")) {
                    return;
                }
                this.mPushUrlPrefix = "rtmp://";
                this.mRtmpPort = this.mSdkSetting.rtmpPorts.get("tcp").intValue();
                return;
            case 114939:
                if (!str.equals("tls")) {
                    return;
                }
                this.mPushUrlPrefix = "rtmps://";
                this.mRtmpPort = this.mSdkSetting.rtmpPorts.get("tls").intValue();
                return;
            case 3482174:
                if (!str.equals("quic")) {
                    return;
                }
                this.mPushUrlPrefix = "rtmpq://";
                this.mRtmpPort = this.mSdkSetting.rtmpPorts.get("quic").intValue();
                return;
            default:
                return;
        }
    }

    public ILiveStream create() {
        return new LiveStream(this);
    }

    public ILiveStream createDummy() {
        return new DummyLiveCoreImpl();
    }

    public CaptureBase.AudioCaptureParams getAudioCaptureParams() {
        return this.mSdkSetting.captureBase.audioCapture;
    }

    public BwEstBaseBWConfig getBwEstBaseBWConfig() {
        return this.mSdkSetting.bwEstBaseBWConfig;
    }

    public VPassInteractCfg getInteract() {
        return this.mSdkSetting.mVPassInteractCfg;
    }

    public KcpParams getKcpParams() {
        return this.mSdkSetting.kcpParams;
    }

    public NodeOptParams getNodeOptParams() {
        return this.mSdkSetting.nodeOpt;
    }

    public PushBase.OnekeyProcessParams getOneKeyProcessParams() {
        return this.mSdkSetting.mPushBase.oneKeyProcess;
    }

    public PushBase getPushBase() {
        return this.mSdkSetting.mPushBase;
    }

    public PushStallConfig getPushStallConfigParams() {
        return this.mSdkSetting.pushStallConfig;
    }

    public QuicParams getQuicParams() {
        return this.mSdkSetting.quicParams;
    }

    public ReconnectConfig getReconnectCfgParams() {
        return this.mSdkSetting.reconnectConfig;
    }

    public BwEstCfg getRtmpBwEstCfgParams() {
        return this.mSdkSetting.rtmpCacheConfig.getRtmpBwEstCfg();
    }

    public RtmpCacheConfig getRtmpCacheCfgParams() {
        return this.mSdkSetting.rtmpCacheConfig;
    }

    public LWReconnectCfg getRtmpLWReconnectCfgParams() {
        return this.mSdkSetting.rtmpCacheConfig.getRtmpReconnectCfg();
    }

    public SandboxParams getSandboxParams() {
        return this.mSdkSetting.sandboxParams;
    }

    public String getStreamId() {
        if (!TextUtils.isEmpty(this.streamID)) {
            return this.streamID;
        }
        if (!TextUtils.isEmpty(getSessionID())) {
            this.streamID = getSessionID();
        } else {
            this.streamID = UUID.randomUUID().toString().replace("-", "");
        }
        return this.streamID;
    }

    public CaptureBase.VideoCaptureParams getVideoCaptureParams() {
        return this.mSdkSetting.captureBase.videoCapture;
    }

    public int getVideoMixerOutHeight() {
        AndroidRuntimeException androidRuntimeException = new AndroidRuntimeException("BUG");
        if (!AnonymousClass028.LJI(androidRuntimeException, "LiveStreamBuilder.getVideoMixerOutHeight")) {
            return 0;
        }
        throw androidRuntimeException;
    }

    public int getVideoMixerOutWidth() {
        AndroidRuntimeException androidRuntimeException = new AndroidRuntimeException("BUG");
        if (!AnonymousClass028.LJI(androidRuntimeException, "LiveStreamBuilder.getVideoMixerOutWidth")) {
            return 0;
        }
        throw androidRuntimeException;
    }

    public boolean enableKaraokeRegulator() {
        return getSdkSetting().enableKaraokeRegulator;
    }

    public boolean enableNew3ARmsStatistics() {
        return getPushBase().enableNew3ARmsStatistics;
    }

    public boolean enableProtocolDegrade() {
        return getSdkSetting().commonParams.getEnableProtocolDegrade();
    }

    public int getAudioBitrate() {
        return getPushBase().audioBitrate;
    }

    public int getAudioCalDBSwitch() {
        return getPushBase().audioCalDBSwitch;
    }

    public int getAudioCaptureBitwidth() {
        return getAudioCaptureParams().audioCaptureBitwidth;
    }

    public int getAudioCaptureChannel() {
        return getAudioCaptureParams().channel;
    }

    public int getAudioCaptureChannelOnVoIP() {
        return getAudioCaptureParams().channelOnVoIP;
    }

    public int getAudioCaptureDevice() {
        return getAudioCaptureParams().device;
    }

    public int getAudioCaptureSampleHZ() {
        return getAudioCaptureParams().sample;
    }

    public int getAudioCaptureSampleHZOnVoIP() {
        return getAudioCaptureParams().sampleOnVoIP;
    }

    public int getAudioChannel() {
        return getPushBase().audioChannel;
    }

    public int getAudioEncoder() {
        return getPushBase().audioEncoder;
    }

    public int getAudioProfile() {
        return getPushBase().audioProfile;
    }

    public int getAudioSampleHZ() {
        return getPushBase().audioSample;
    }

    public boolean getAutoGlRecycler() {
        return getPushBase().enableGlobalGLSharedContextRecycler;
    }

    public int getBgMode() {
        return getPushBase().bgMode;
    }

    public int getBitrateAdaptStrategy() {
        return getPushBase().bitrateStrategy;
    }

    public int getBitrateAdjustSwitch() {
        return getPushBase().disAbleBitrateAdjust;
    }

    public int getByteVC1MosaicIssueOptimize() {
        return getPushBase().byteVC1MosaicIssueOptimizeLevel;
    }

    public int getByteVC1Preset() {
        return getPushBase().byteVC1Preset;
    }

    public int getCameraFaceAEStratety() {
        return getVideoCaptureParams().cameraFaceAEStrategy;
    }

    public int getCameraFrameFormat() {
        return getVideoCaptureParams().cameraFrameFormat;
    }

    public int getCameraFrameRateStrategy() {
        return getVideoCaptureParams().cameraFrameRateStrategy;
    }

    public int getCameraLogLevel() {
        return getVideoCaptureParams().cameraLogLevel;
    }

    public int getCameraMode() {
        return getVideoCaptureParams().cameraMode;
    }

    public boolean getCameraOpenCloseSync() {
        return getVideoCaptureParams().isCameraOpenCloseSync;
    }

    public int getCameraOpenRetryCnt() {
        return getVideoCaptureParams().cameraOpenRetryCount;
    }

    public int getCameraRetryStartPreviewCnt() {
        return getVideoCaptureParams().cameraRetryStartPreviewCount;
    }

    public String getCameraTexMinFilter() {
        return getVideoCaptureParams().textureMinFilter;
    }

    public int getCameraType() {
        return getVideoCaptureParams().cameraType;
    }

    public int getCaptureAdaptedHeight() {
        return getPushBase().capAdaptedHeight;
    }

    public int getCaptureAdaptedWidth() {
        return getPushBase().capAdaptedWidth;
    }

    public int getChangeEncodeFpsThreshold() {
        return getPushBase().changeEncodeFpsThreshold;
    }

    public int getCheckEncodeFpsInterval() {
        return getPushBase().checkEncodeFpsInterval;
    }

    public int getCropBufferPoolSize() {
        return getPushBase().cropBufferPoolSize;
    }

    public boolean getEdgeRender() {
        return getPushBase().enalbeEdgeRender;
    }

    public int getEffectLogLevel() {
        return getPushBase().effectLogLevel;
    }

    public double getEnableMaxTimePeriodGopSec() {
        return getPushBase().enableMaxTimePeriodGopSec;
    }

    public boolean getEnableScreenCaptureRetry() {
        return getPushBase().enableScreenCaptureRetry;
    }

    public boolean getEncoderDowngradeOptimize() {
        return getPushBase().encoderDowngradeOptimize;
    }

    public int getFilterBufferPoolSize() {
        return getPushBase().filterBufferPoolSize;
    }

    public int getFilterProcessType() {
        return getPushBase().filterProcessType;
    }

    public int getFrameRateMode() {
        return getPushBase().frameRateMode;
    }

    public float getGameInnerVolume() {
        return getAudioCaptureParams().gameInnerVolume;
    }

    public int getGlVersion() {
        return GLThreadManager.getConfigGLVersion();
    }

    public boolean getIsForceCloseCamera() {
        return getVideoCaptureParams().isForceCloseCamera;
    }

    public int getMaxChangeEncodeFpsTimes() {
        return getPushBase().maxChangeEncodeFpsTimes;
    }

    public boolean getNeedOesTo2D() {
        return getVideoCaptureParams().needOesTo2D;
    }

    public double getNoiseSuppress() {
        return getPushBase().noiseSuppress;
    }

    public List<String> getNtpServers() {
        return getPushBase().ntpServers;
    }

    public int getPSNRPeriodSeconds() {
        if (getSdkSetting().psnrStatisics != null) {
            return getSdkSetting().psnrStatisics.getPsnrPeriodSeconds();
        }
        return 30;
    }

    public int getPSNRStatisticsFrames() {
        if (getSdkSetting().psnrStatisics != null) {
            return getSdkSetting().psnrStatisics.getPsnrCalcFrames();
        }
        return 20;
    }

    public boolean getPushStallStatistics() {
        return getPushBase().enablePushStallStatistics;
    }

    public String getQosId() {
        if (!TextUtils.isEmpty(getPushBase().qosId)) {
            try {
                getPushBase().qosIdV2.put(getPushBase().qosId, true);
                getPushBase().qosId = null;
            } catch (Exception unused) {
            }
        }
        return getPushBase().qosIdV2.toString();
    }

    public int getRequiredCameraLevel() {
        return getVideoCaptureParams().requiredCameraLevel;
    }

    public int getResolutionAdaptedQuirks() {
        return getPushBase().capAdaptedQuirks;
    }

    public int getRoiOn() {
        return getRoiOn(getPushBase().videoEncoder, getPushBase().useHardwareEncode);
    }

    public TEBundle getRoiSettings() {
        return getRoiSettings(getPushBase().videoEncoder, getPushBase().useHardwareEncode);
    }

    public int getRtmpReconnectCounts() {
        return getPushBase().retryConnectCount;
    }

    public int getSRBufferPoolSize() {
        return getPushBase().srBufferPoolSize;
    }

    public int getScreenAudioCaptureDelayMicPackage() {
        return getAudioCaptureParams().delayScreenMicPackage;
    }

    public String getSessionID() {
        return getSdkSetting().commonParams.getSessionId();
    }

    public int getSetInitBitrateToMax() {
        return getPushBase().setInitBitrateToMax;
    }

    public double getSoftwareEncoderBitRateRatioMaxtoDefault() {
        return getPushBase().softwareEncoderBitRateRatioMaxtoDefault;
    }

    public double getSoftwareEncoderBitRateRatioMintoDefault() {
        return getPushBase().softwareEncoderBitRateRatioMintoDefault;
    }

    public int getSoftwareEncoderMinMaxBitrateAdjust() {
        return getPushBase().softwareEncoderMinMaxBitrateAdjust;
    }

    public int getStatisticsType() {
        return getSdkSetting().switchParams.getStatisticsType();
    }

    public int getStreamPublishSuccessInterval() {
        return getPushBase().streamPublishSuccessInterval;
    }

    public long getUploadLogInterval() {
        return getPushBase().uploadLogInterval;
    }

    public int getVideoBitrate() {
        return getPushBase().defaultBitrate;
    }

    public int getVideoBitrateMode() {
        return getPushBase().videoBitrateMode;
    }

    public int getVideoCaptureDevice() {
        return getVideoCaptureParams().device;
    }

    public int getVideoCaptureFps() {
        return getVideoCaptureParams().fps;
    }

    public int getVideoCaptureHeight() {
        return getVideoCaptureParams().height;
    }

    public int getVideoCaptureMinFps() {
        return getVideoCaptureParams().minFps;
    }

    public int getVideoCaptureWidth() {
        return getVideoCaptureParams().width;
    }

    public int getVideoEncoder() {
        return getPushBase().videoEncoder;
    }

    public int getVideoFps() {
        return getPushBase().fps;
    }

    public float getVideoGopSec() {
        return getPushBase().gopSec;
    }

    public int getVideoMaxBitrate() {
        return getPushBase().maxBitrate;
    }

    public int getVideoMinBitrate() {
        return getPushBase().minBitrate;
    }

    public int getVideoProfile() {
        return getPushBase().videoProfile;
    }

    public boolean isAddCropSeiInfo() {
        return getPushBase().addCropSeiInfo;
    }

    public boolean isAlignTo16() {
        return getPushBase().forceAlignTo16;
    }

    public boolean isBgPushWithAdaptedResolution() {
        return getPushBase().bgPushWithAdaptedResolution;
    }

    public boolean isCameraEnableFallback() {
        return getVideoCaptureParams().enableFallback;
    }

    public boolean isCameraEnableWideAngle() {
        return getVideoCaptureParams().enableWideAngle;
    }

    public boolean isCameraEnableWideFov() {
        return getVideoCaptureParams().enableWideFov;
    }

    public boolean isEffectDisabled() {
        return getPushBase().disableEffect;
    }

    public boolean isEnableAecAutoSwitch() {
        return getPushBase().aecAutoSwitch;
    }

    public boolean isEnableAlgorithmSyncer() {
        return getPushBase().enableAlgorithmSyncer;
    }

    public boolean isEnableAudioHighQuality() {
        return getAudioCaptureParams().useHighQuality;
    }

    public boolean isEnableAutoVolume() {
        return getPushBase().enableAutoVolume;
    }

    public boolean isEnableByteAudioFilterOptimize() {
        return getPushBase().enableByteAudioFilterOptimized;
    }

    public boolean isEnableCalculateAudioLoudness() {
        return getPushBase().enableCalculateAudioLoudness;
    }

    public boolean isEnableCallbackStop() {
        return getVideoCaptureParams().enableCallBackStop;
    }

    public boolean isEnableCameraPreviewTemplate() {
        return getVideoCaptureParams().enableCameraPreviewTemplate;
    }

    public boolean isEnableConstantTimePeriodGop() {
        return getPushBase().enableConstantTimePeriodGop;
    }

    public boolean isEnableDropFrameWhenNoBuffer() {
        return getPushBase().enableDropFrameWhenNoBuffer;
    }

    public boolean isEnableFindContour() {
        return getPushBase().enableFindContour;
    }

    public boolean isEnableFixHardwareEncodeDts() {
        return getPushBase().fixHardwareEncodeDts;
    }

    public boolean isEnableForceGlFinish() {
        return GLThreadManager.isEnableForceGLFinish();
    }

    public boolean isEnableFrontCameraContinueFocus() {
        return getVideoCaptureParams().enableFrontCameraContinueFocus;
    }

    public boolean isEnableGammaCorrectionAtExternVideoCapture() {
        return getPushBase().gammaCorrectionOnExternVideoCapture;
    }

    public boolean isEnableGlobalGlContextMutex() {
        return GLThreadManager.isEnableForceGLFinish();
    }

    public boolean isEnableNewNetWorkQuality() {
        return getPushBase().enableNewNetWorkQuality;
    }

    public boolean isEnableOpenCamera1Opt() {
        return getVideoCaptureParams().enableOpenCamera1Opt;
    }

    public boolean isEnablePSNR() {
        if (getSdkSetting().psnrStatisics != null && getSdkSetting().psnrStatisics.getEnablePsnr()) {
            return true;
        }
        return false;
    }

    public boolean isEnablePitchShift() {
        return getPushBase().enablePitchShift;
    }

    public boolean isEnableResetFpsRange() {
        return getVideoCaptureParams().resetFpsRange;
    }

    public boolean isEnableSeiShift() {
        return getPushBase().enableSeiCurrentShiftDiffTime;
    }

    public boolean isEnableStabilization() {
        return getVideoCaptureParams().enableCameraStabilization;
    }

    public boolean isEnableThreeBuffer() {
        return getPushBase().enableThreeBuffer;
    }

    public boolean isEnableVelivePusher() {
        DebugLogUtils.isEnableDebugLog();
        return false;
    }

    public boolean isEnableVideoBFrame() {
        return getPushBase().enableBFrame;
    }

    public boolean isEnableVideoEncodeAccelera() {
        return getPushBase().useHardwareEncode;
    }

    public boolean isEnableVideoFrameStatistics() {
        return getPushBase().videoFrameEllipse;
    }

    public boolean isEnableVideoNtp() {
        if (getPushBase().enableNTP && getPushBase().ntpServers != null && !getPushBase().ntpServers.isEmpty()) {
            return true;
        }
        return false;
    }

    public boolean isEncodeLockOptimize() {
        DebugLogUtils.isEnableDebugLog();
        return this.encodeLockOptimize;
    }

    public boolean isFilterBufferPoolSyncMode() {
        return getPushBase().filterBufferPoolSyncMode;
    }

    public boolean isGameOptTest() {
        return getPushBase().gameOptTest;
    }

    public boolean isHWEncodeOesDirectly() {
        return getPushBase().hwEncodeOes;
    }

    public boolean isSeiNeedSource() {
        return getPushBase().seiNeedSource;
    }

    public boolean isSupportCameraSwitchInternal() {
        return getPushBase().cameraSwitchInternal;
    }

    public boolean isVECamera2API() {
        return getVideoCaptureParams().useCamera2Api;
    }

    public boolean isVideoLayerMixerSwitch() {
        DebugLogUtils.isEnableDebugLog();
        return this.videoLayerMixerSwitch;
    }

    public boolean isVideoMixerSwitch() {
        DebugLogUtils.isEnableDebugLog();
        return this.videoMixerSwitch;
    }

    public String liveioSettings() {
        return getPushBase().liveioSettings;
    }

    public int rtmNetBadInterval() {
        return getSdkSetting().switchParams.getRtmNetBadInterval();
    }

    public double rtmNetBadLos() {
        return getSdkSetting().switchParams.getRtmNetBadLos();
    }

    public int rtmNetBadRtt() {
        return getSdkSetting().switchParams.getRtmNetBadRtt();
    }

    public int rtmNetPoorInterval() {
        return getSdkSetting().switchParams.getRtmNetPoorInterval();
    }

    public double rtmNetPoorLos() {
        return getSdkSetting().switchParams.getRtmNetPoorLos();
    }

    public int rtmNetPoorRtt() {
        return getSdkSetting().switchParams.getRtmNetPoorRtt();
    }

    public boolean rtmNetReport() {
        return getSdkSetting().switchParams.getRtmNetReport();
    }

    public int rtmSendPacketProtect() {
        return getSdkSetting().switchParams.getRtmSendPacketProtect();
    }

    public String rtsConfig() {
        return getPushBase().rtsConfig;
    }

    public boolean rtsEnableDtls() {
        return getSdkSetting().switchParams.getRtsEnableDtls();
    }

    public int rtsEngineVersion() {
        return getPushBase().rtsEngineVersion;
    }

    public int rtsHttpPort() {
        return getSdkSetting().commonParams.getRtsHttpPort();
    }

    public AppInfo getAppInfo() {
        return this.mAppInfo;
    }

    public Object getAssetManager() {
        return this.assetManager;
    }

    public int getAudioBitwidth() {
        return this.audioBitwidth;
    }

    public int getAudioQuantizeGapPeriod() {
        return this.audioQuantizeGapPeriod;
    }

    public Context getContext() {
        return this.mContext;
    }

    public JSONObject getDumpFrameParams() {
        return this.dumpFrameParams;
    }

    public boolean getEffectAlgorithmAB() {
        return this.effectAlgorithmAB;
    }

    public String getEffectModePath() {
        return this.effectModePath;
    }

    public String getEffectPlatformConfig() {
        return this.effectPlatformConfig;
    }

    public Object getEffectResourceFinder() {
        return this.effectResourceFinder;
    }

    public int getFovOptCropAspectHeight() {
        return this.fovOptCropAspectHeight;
    }

    public int getFovOptCropAspectWidth() {
        return this.fovOptCropAspectWidth;
    }

    public int getFovOptMaxPiexelSize() {
        return this.fovOptMaxPiexelSize;
    }

    public LiveStreamGpuHintSettings getGpuHintSettings() {
        return this.gpuHintSettings;
    }

    public String getLiveAuthString() {
        return this.encryptedLiveAuth;
    }

    public ILogUploader getLogUploader() {
        return this.mLogUploader;
    }

    public int getPauseFps() {
        return this.pauseFps;
    }

    public LiveStreamThreadPrioritySettings getPrioritySettings() {
        return this.prioritySettings;
    }

    public String getPushUrlPrefix() {
        return this.mPushUrlPrefix;
    }

    public int getRtmpPort() {
        return this.mRtmpPort;
    }

    public int getRtmpReconnectIntervalSeconds() {
        return this.rtmpReconnectIntervalSeconds;
    }

    public Intent getScreenCaptureIntent() {
        return this.screenCaptureIntent;
    }

    public JSONObject getSdkParams() {
        return this.mSdkParams;
    }

    public LiveSdkSetting getSdkSetting() {
        return this.mSdkSetting;
    }

    public Map<String, Integer> getThreadConfigs() {
        return this.threadConfigs;
    }

    public IVeLivePusher getVeLivePusher() {
        return this.mVeLivePusher;
    }

    public int getVideoE2EDelaySampleInterval() {
        return this.mVideoE2EDelaySampleInterval;
    }

    public int getVideoGop() {
        return this.videoGop;
    }

    public int getVideoHeight() {
        return this.videoHeight;
    }

    public int getVideoLevel() {
        return this.videoLevel;
    }

    public int getVideoWidth() {
        return this.videoWidth;
    }

    public int getVsyncModuleMaxIntevalOnFrameMs() {
        return this.vsyncModuleMaxIntevalOnFrameMs;
    }

    public int getVsyncModuleMaxIntevalOnNowMs() {
        return this.vsyncModuleMaxIntevalOnNowMs;
    }

    public boolean isAllowMicCaptureOnBackground() {
        return this.mAllowMicCaptureOnBackground;
    }

    public boolean isCaptureReleaseLockOptimize() {
        return this.captureReleaseLockOptimize;
    }

    public boolean isEnableAudioEncodeAccelera() {
        return this.enableAudioEncodeAccelera;
    }

    public boolean isEnableFovSmallWindowOpt() {
        return this.enableFovSmallWindowOpt;
    }

    public boolean isEnableKTV() {
        return this.mEnableKTV;
    }

    public boolean isFilterLogSwitch() {
        return this.filterLogSwitch;
    }

    public boolean isGpuTurboDisabled() {
        return this.isGpuTurboDisabled;
    }

    public boolean isPauseDisableEffectSwitch() {
        return this.pauseDisableEffectSwitch;
    }

    public boolean isUseNewEffectEngine() {
        return this.useNewEffectEngine;
    }

    public boolean isUseShareRecorder() {
        return this.mUseShareRecorder;
    }

    public boolean isUseTTFaceDetect() {
        return this.useTTFaceDetect;
    }

    public boolean useCapturePtsInRtc() {
        return this.useCameraVideoPtsInRtc;
    }

    public boolean checkParamsForUpdate(TEBundle tEBundle) {
        PushBase pushBase = getPushBase();
        Boolean bool = Boolean.FALSE;
        Boolean[] boolArr = {bool};
        Boolean[] boolArr2 = {bool};
        this.videoWidth = checkParamsForUpdateInner(tEBundle, "width", this.videoWidth, boolArr);
        this.videoHeight = checkParamsForUpdateInner(tEBundle, "height", this.videoHeight, boolArr);
        getVideoCaptureParams().width = checkParamsForUpdateInner(tEBundle, "videoCaptureWidth", getVideoCaptureParams().width, boolArr);
        getVideoCaptureParams().height = checkParamsForUpdateInner(tEBundle, "videoCaptureHeight", getVideoCaptureParams().height, boolArr);
        getVideoCaptureParams().fps = checkParamsForUpdateInner(tEBundle, "videoCaptureFps", getVideoCaptureParams().fps, boolArr2);
        getVideoCaptureParams().radioModeFps = checkParamsForUpdateInner(tEBundle, "radioModeFps", getVideoCaptureParams().radioModeFps, boolArr2);
        if (this.mSdkSetting.captureBase.videoCapture.enableMinCapFpsChange) {
            getVideoCaptureParams().minFps = checkParamsForUpdateInner(tEBundle, "videoCaptureMinFps", getVideoCaptureParams().minFps, boolArr2);
        }
        if (tEBundle.contains("capWidthRate") && tEBundle.contains("capHeightRate")) {
            int i = (int) (tEBundle.getDouble("capWidthRate") * this.videoWidth);
            int i2 = (int) (tEBundle.getDouble("capHeightRate") * this.videoHeight);
            if (i > 0 && i2 > 0) {
                pushBase.capAdaptedWidth = align(i, 2);
                pushBase.capAdaptedHeight = align(i2, 2);
            }
        } else {
            pushBase.capAdaptedWidth = checkParamsForUpdateInner(tEBundle, "cap_adapted_width", pushBase.capAdaptedWidth, boolArr2);
            pushBase.capAdaptedHeight = checkParamsForUpdateInner(tEBundle, "cap_adapted_height", pushBase.capAdaptedHeight, boolArr2);
        }
        pushBase.capAdaptedQuirks = checkParamsForUpdateInner(tEBundle, "cap_adapted_quirks", pushBase.capAdaptedQuirks, boolArr2);
        pushBase.fps = checkParamsForUpdateInner(tEBundle, "fps", pushBase.fps, boolArr);
        pushBase.defaultBitrate = checkParamsForUpdateInner(tEBundle, "defaultBitrate", pushBase.defaultBitrate, boolArr);
        pushBase.minBitrate = checkParamsForUpdateInner(tEBundle, "minBitrate", pushBase.minBitrate, boolArr);
        pushBase.maxBitrate = checkParamsForUpdateInner(tEBundle, "maxBitrate", pushBase.maxBitrate, boolArr);
        pushBase.enableSiti = checkParamsForUpdateInner(tEBundle, "enable_siti", pushBase.enableSiti, boolArr);
        if (isNetFpsAdaptiveEnable()) {
            RtmpCacheConfig rtmpCacheCfgParams = getRtmpCacheCfgParams();
            rtmpCacheCfgParams.setInitVideoFps(checkParamsForUpdateInner(tEBundle, "initFps", rtmpCacheCfgParams.getInitVideoFps(), boolArr));
            rtmpCacheCfgParams.setMinVideoFps(checkParamsForUpdateInner(tEBundle, "minFps", rtmpCacheCfgParams.getMinVideoFps(), boolArr));
            rtmpCacheCfgParams.setMaxVideoFps(checkParamsForUpdateInner(tEBundle, "maxFps", rtmpCacheCfgParams.getMaxVideoFps(), boolArr));
        }
        return boolArr[0].booleanValue();
    }

    public void enableAecAutoSwitchMode(boolean z) {
        getPushBase().aecAutoSwitch = z;
    }

    public void enableAudioHighQualityMode(boolean z) {
        getAudioCaptureParams().useHighQuality = z;
    }

    public void enableByteAudioFilterOptimize(boolean z) {
        getPushBase().enableByteAudioFilterOptimized = z;
    }

    public void enableCalculateAudioLoudness(boolean z) {
        getPushBase().enableCalculateAudioLoudness = z;
    }

    public void enableGammaCorrectionAtExternVideoCapture(boolean z) {
        getPushBase().gammaCorrectionOnExternVideoCapture = z;
    }

    public LiveStreamBuilder enableVideoFrameStatistics(boolean z) {
        getPushBase().videoFrameEllipse = z;
        return this;
    }

    public int getRoiOn(boolean z) {
        return getRoiOn(1, z);
    }

    public void setAddCropSeiInfo(boolean z) {
        getPushBase().addCropSeiInfo = z;
    }

    public LiveStreamBuilder setAlignTo16(boolean z) {
        getPushBase().forceAlignTo16 = z;
        return this;
    }

    public LiveStreamBuilder setAllowMicCaptureOnBackground(boolean z) {
        this.mAllowMicCaptureOnBackground = z;
        return this;
    }

    public void setAppInfo(AppInfo appInfo) {
        this.mAppInfo = appInfo;
    }

    public LiveStreamBuilder setAssetManager(Object obj) {
        this.assetManager = obj;
        return this;
    }

    public LiveStreamBuilder setAudioBitrate(int i) {
        getPushBase().audioBitrate = i;
        return this;
    }

    public LiveStreamBuilder setAudioBitwidth(int i) {
        this.audioBitwidth = i;
        return this;
    }

    public LiveStreamBuilder setAudioCaptureBitwidth(int i) {
        getAudioCaptureParams().audioCaptureBitwidth = i;
        return this;
    }

    public LiveStreamBuilder setAudioCaptureChannel(int i) {
        getAudioCaptureParams().channel = i;
        return this;
    }

    public void setAudioCaptureChannelOnVoIP(int i) {
        getAudioCaptureParams().channelOnVoIP = i;
    }

    public LiveStreamBuilder setAudioCaptureDevice(int i) {
        getAudioCaptureParams().device = i;
        return this;
    }

    public LiveStreamBuilder setAudioCaptureSampleHZ(int i) {
        getAudioCaptureParams().sample = i;
        return this;
    }

    public void setAudioCaptureSampleHZOnVoIP(int i) {
        getAudioCaptureParams().sampleOnVoIP = i;
    }

    public LiveStreamBuilder setAudioChannel(int i) {
        getPushBase().audioChannel = i;
        return this;
    }

    public LiveStreamBuilder setAudioEncoder(int i) {
        getPushBase().audioEncoder = i;
        return this;
    }

    public LiveStreamBuilder setAudioProfile(int i) {
        getPushBase().audioProfile = i;
        return this;
    }

    public LiveStreamBuilder setAudioQuantizeGapPeriod(int i) {
        this.audioQuantizeGapPeriod = i;
        return this;
    }

    public LiveStreamBuilder setAudioSampleHZ(int i) {
        getPushBase().audioSample = i;
        return this;
    }

    public void setAutoGlRecycler(boolean z) {
        getPushBase().enableGlobalGLSharedContextRecycler = z;
    }

    public LiveStreamBuilder setBgMode(int i) {
        getPushBase().bgMode = i;
        return this;
    }

    public void setBgPushWithAdaptedResolution(boolean z) {
        getPushBase().bgPushWithAdaptedResolution = z;
    }

    public LiveStreamBuilder setBitrateAdaptStrategy(int i) {
        if (i == 0 || i == 1 || i == 2 || i == 3) {
            getPushBase().bitrateStrategy = i;
        }
        return this;
    }

    public void setByteVC1Preset(int i) {
        getPushBase().byteVC1Preset = i;
    }

    public void setCameraEnableFallback(boolean z) {
        getVideoCaptureParams().enableFallback = z;
    }

    public void setCameraEnableWideAngle(boolean z) {
        getVideoCaptureParams().enableWideAngle = z;
    }

    public void setCameraEnableWideFov(boolean z) {
        getVideoCaptureParams().enableWideFov = z;
    }

    public void setCameraFaceAEStratety(int i) {
        getVideoCaptureParams().cameraFaceAEStrategy = i;
    }

    public LiveStreamBuilder setCameraFrameRateStrategy(int i) {
        getVideoCaptureParams().cameraFrameRateStrategy = i;
        return this;
    }

    public void setCameraLogLevel(int i) {
        getVideoCaptureParams().cameraLogLevel = i;
    }

    public void setCameraOpenCloseSync(boolean z) {
        getVideoCaptureParams().isCameraOpenCloseSync = z;
    }

    public void setCameraOpenRetryCnt(int i) {
        getVideoCaptureParams().cameraOpenRetryCount = i;
    }

    public void setCameraRetryStartPreviewCnt(int i) {
        getVideoCaptureParams().cameraRetryStartPreviewCount = i;
    }

    public void setCameraTexMinFilter(String str) {
        getVideoCaptureParams().textureMinFilter = str;
    }

    public void setCaptureAdaptedHeight(int i) {
        getPushBase().capAdaptedHeight = i;
    }

    public void setCaptureAdaptedWidth(int i) {
        getPushBase().capAdaptedWidth = i;
    }

    public void setCaptureReleaseLockOptimize(boolean z) {
        this.captureReleaseLockOptimize = z;
    }

    public LiveStreamBuilder setContext(Context context) {
        Context context2;
        if (context != null) {
            context2 = C16880lQ.LLLLL(context);
        } else {
            context2 = null;
        }
        this.mContext = context2;
        ContextUtils.initJavaSideApplicationContext(C16880lQ.LLLLL(context));
        JNIUtils.setClassLoader(this.mContext.getClassLoader());
        return this;
    }

    public LiveStreamBuilder setEdgeRender(boolean z) {
        getPushBase().enalbeEdgeRender = z;
        return this;
    }

    public LiveStreamBuilder setEffectAlgorithmAB(boolean z) {
        this.effectAlgorithmAB = z;
        return this;
    }

    public void setEffectLogLevel(int i) {
        getPushBase().effectLogLevel = i;
    }

    public LiveStreamBuilder setEffectModePath(String str) {
        this.effectModePath = str;
        return this;
    }

    public LiveStreamBuilder setEffectPlatformConfig(String str) {
        this.effectPlatformConfig = str;
        return this;
    }

    public LiveStreamBuilder setEffectResourceFinder(Object obj) {
        this.effectResourceFinder = obj;
        return this;
    }

    public void setEnableAlgorithmSyncer(boolean z) {
        getPushBase().enableAlgorithmSyncer = z;
    }

    public LiveStreamBuilder setEnableAudioEncodeAccelera(boolean z) {
        this.enableAudioEncodeAccelera = z;
        return this;
    }

    public void setEnableAutoVolume(boolean z) {
        getPushBase().enableAutoVolume = z;
    }

    public void setEnableConstantTimePeriodGop(boolean z) {
        getPushBase().enableConstantTimePeriodGop = z;
    }

    public void setEnableFindContour(boolean z) {
        getPushBase().enableFindContour = z;
    }

    public void setEnableForceGlFinish(boolean z) {
        GLThreadManager.enableForceGLFinish(z);
    }

    public LiveStreamBuilder setEnableFovSmallWindowOpt(boolean z) {
        this.enableFovSmallWindowOpt = z;
        return this;
    }

    public void setEnableGlobalGlContextMutex(boolean z) {
        GLThreadManager.enableGlobalGlContextMutex(z);
    }

    public void setEnableKTV(boolean z) {
        this.mEnableKTV = z;
    }

    public void setEnableKaraokeRegulator(boolean z) {
        getSdkSetting().enableKaraokeRegulator = z;
    }

    public void setEnableMaxTimePeriodGopSec(double d) {
        getPushBase().enableMaxTimePeriodGopSec = d;
    }

    public void setEnableNewNetWorkQuality(boolean z) {
        getPushBase().enableNewNetWorkQuality = z;
    }

    public void setEnableOpenCamera1Opt(boolean z) {
        getVideoCaptureParams().enableOpenCamera1Opt = z;
    }

    public void setEnablePSNR(boolean z) {
        if (getSdkSetting().psnrStatisics == null) {
            getSdkSetting().psnrStatisics = new PsnrStatisics();
        }
        getSdkSetting().psnrStatisics.setEnablePsnr(z);
    }

    public void setEnablePitchShift(boolean z) {
        getPushBase().enablePitchShift = z;
    }

    public void setEnableScopeMonitor(boolean z) {
        ScopeMonitor.enabled = z;
    }

    public void setEnableSendContourInfoToRtc(boolean z) {
        getInteract().enableSendContourInfoToRtc = z;
    }

    public void setEnableStabilization(boolean z) {
        getVideoCaptureParams().enableCameraStabilization = z;
    }

    public void setEnableThreeBuffer(boolean z) {
        getPushBase().enableThreeBuffer = z;
    }

    public void setEnableVelivePusher(boolean z) {
        this.enableVelivePusher = z;
    }

    public LiveStreamBuilder setEnableVideoBFrame(boolean z) {
        getPushBase().enableBFrame = z;
        return this;
    }

    public LiveStreamBuilder setEnableVideoEncodeAccelera(boolean z) {
        getPushBase().useHardwareEncode = z;
        return this;
    }

    public void setEncodeLockOptimize(boolean z) {
        this.encodeLockOptimize = z;
    }

    public void setFilterBufferPoolSize(int i) {
        getPushBase().filterBufferPoolSize = i;
    }

    public void setFilterLogSwitch(boolean z) {
        this.filterLogSwitch = z;
    }

    public LiveStreamBuilder setFovOptCropAspectHeight(int i) {
        this.fovOptCropAspectHeight = i;
        return this;
    }

    public LiveStreamBuilder setFovOptCropAspectWidth(int i) {
        this.fovOptCropAspectWidth = i;
        return this;
    }

    public LiveStreamBuilder setFovOptMaxPiexelSize(int i) {
        this.fovOptMaxPiexelSize = i;
        return this;
    }

    public void setFrameRateMode(int i) {
        getPushBase().frameRateMode = i;
    }

    public void setGameOptTest(boolean z) {
        getPushBase().gameOptTest = z;
    }

    public void setGlVersion(int i) {
        GLThreadManager.setGLVersion(i);
    }

    public void setGpuHintSettings(LiveStreamGpuHintSettings liveStreamGpuHintSettings) {
        this.gpuHintSettings = liveStreamGpuHintSettings;
    }

    public void setGpuTurboDisabled(boolean z) {
        this.isGpuTurboDisabled = z;
    }

    public void setHWEncodeOesDirectly(boolean z) {
        getPushBase().hwEncodeOes = z;
    }

    public void setInitEncodeAndPublish(boolean z) {
        this.initEncodeAndPublish = z;
    }

    public void setIsForceCloseCamera(boolean z) {
        getVideoCaptureParams().isForceCloseCamera = z;
    }

    public LiveStreamBuilder setKcpParams(JSONObject jSONObject) {
        try {
            LiveSdkSetting liveSdkSetting = this.mSdkSetting;
            liveSdkSetting.kcpParams = (KcpParams) TinyJson.fromJson(jSONObject, KcpParams.class, liveSdkSetting.kcpParams);
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
            TTLSSladarBugReportUtils.getInstance().report(e, "LiveStreamBuilder.setKcpParams");
            if (!TTLSBuildConfig.canThrowException()) {
                AVLog.ioe("TinyJson", "parse kcp json failed");
            } else {
                throw new AndroidRuntimeException(e);
            }
        }
        return this;
    }

    public LiveStreamBuilder setLiveAuthString(String str) {
        String str2;
        if (str != null && str.length() > 32) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(str.substring(0, 32));
            LIZ.append("...");
            str2 = X1D.LIZIZ(LIZ);
        } else {
            str2 = str;
        }
        AVLog.logToIODevice(4, "LiveStreamBuilder", i0.LJFF("set metadata_encoder: ", str2), new Throwable());
        this.encryptedLiveAuth = str;
        return this;
    }

    public LiveStreamBuilder setLogUploader(ILogUploader iLogUploader) {
        this.mLogUploader = iLogUploader;
        return this;
    }

    public void setNeedOesTo2D(boolean z) {
        getVideoCaptureParams().needOesTo2D = z;
    }

    public void setNoiseSuppress(double d) {
        getPushBase().noiseSuppress = d;
    }

    public void setPauseDisableEffectSwitch(boolean z) {
        this.pauseDisableEffectSwitch = z;
    }

    public void setPauseFps(int i) {
        this.pauseFps = i;
    }

    public void setPrioritySettings(LiveStreamThreadPrioritySettings liveStreamThreadPrioritySettings) {
        this.prioritySettings = liveStreamThreadPrioritySettings;
    }

    public LiveStreamBuilder setProjectKey(String str) {
        this.mProjectKey = str;
        return this;
    }

    public LiveStreamBuilder setPushStallStatistics(boolean z) {
        getPushBase().enablePushStallStatistics = z;
        return this;
    }

    public LiveStreamBuilder setQuicParams(JSONObject jSONObject) {
        try {
            LiveSdkSetting liveSdkSetting = this.mSdkSetting;
            liveSdkSetting.quicParams = (QuicParams) TinyJson.fromJson(jSONObject, QuicParams.class, liveSdkSetting.quicParams);
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
            TTLSSladarBugReportUtils.getInstance().report(e, "LiveStreamBuilder.setQuicParams");
            if (!TTLSBuildConfig.canThrowException()) {
                AVLog.ioe("TinyJson", "parse quic json failed");
            } else {
                throw new AndroidRuntimeException(e);
            }
        }
        return this;
    }

    public void setResolutionAdaptedQuirks(int i) {
        getPushBase().capAdaptedQuirks = i;
    }

    public LiveStreamBuilder setRoiAssetDir(String str) {
        setRoiAssetDir(str, 1, false);
        return this;
    }

    public LiveStreamBuilder setRoiOn(int i) {
        setRoiOn(i, getPushBase().videoEncoder, getPushBase().useHardwareEncode);
        return this;
    }

    public LiveStreamBuilder setRtmpReconnectCounts(int i) {
        getPushBase().retryConnectCount = i;
        return this;
    }

    public LiveStreamBuilder setRtmpReconnectIntervalSeconds(int i) {
        this.rtmpReconnectIntervalSeconds = i;
        return this;
    }

    public LiveStreamBuilder setScreenCaptureIntent(Intent intent) {
        this.screenCaptureIntent = intent;
        return this;
    }

    public void setSeiNeedSource(boolean z) {
        getPushBase().seiNeedSource = z;
    }

    public void setSoftwareEncoderBitRateRatioMaxtoDefault(double d) {
        getPushBase().softwareEncoderBitRateRatioMaxtoDefault = d;
    }

    public void setSoftwareEncoderBitRateRatioMintoDefault(double d) {
        getPushBase().softwareEncoderBitRateRatioMintoDefault = d;
    }

    public void setSoftwareEncoderMinMaxBitrateAdjust(int i) {
        getPushBase().softwareEncoderMinMaxBitrateAdjust = i;
    }

    public void setStreamPublishSuccessInterval(int i) {
        getPushBase().streamPublishSuccessInterval = i;
    }

    public void setSupportCameraSwitchInternal(boolean z) {
        getPushBase().cameraSwitchInternal = z;
    }

    public void setThreadConfigs(Map<String, Integer> map) {
        this.threadConfigs = map;
    }

    public LiveStreamBuilder setUploadLogInterval(long j) {
        getPushBase().uploadLogInterval = (int) j;
        return this;
    }

    public void setUseCameraVideoPtsInRtc(boolean z) {
        this.useCameraVideoPtsInRtc = z;
    }

    public LiveStreamBuilder setUseNewEffectEngine(boolean z) {
        this.useNewEffectEngine = z;
        return this;
    }

    public void setUseShareRecorder(boolean z) {
        this.mUseShareRecorder = z;
    }

    public LiveStreamBuilder setUseTTFaceDetect(boolean z) {
        this.useTTFaceDetect = z;
        return this;
    }

    public void setUsingVECamera2API(boolean z) {
        getVideoCaptureParams().useCamera2Api = z;
    }

    public void setVeLivePusher(IVeLivePusher iVeLivePusher) {
        this.mVeLivePusher = iVeLivePusher;
    }

    public LiveStreamBuilder setVideoBitrate(int i) {
        getPushBase().defaultBitrate = i;
        return this;
    }

    public void setVideoBitrateMode(int i) {
        getPushBase().videoBitrateMode = i;
    }

    public LiveStreamBuilder setVideoCaptureDevice(int i) {
        getVideoCaptureParams().device = i;
        return this;
    }

    public LiveStreamBuilder setVideoCaptureFps(int i) {
        getVideoCaptureParams().fps = i;
        return this;
    }

    public LiveStreamBuilder setVideoCaptureHeight(int i) {
        getVideoCaptureParams().height = i;
        return this;
    }

    public LiveStreamBuilder setVideoCaptureMinFps(int i) {
        getVideoCaptureParams().minFps = i;
        return this;
    }

    public LiveStreamBuilder setVideoCaptureWidth(int i) {
        getVideoCaptureParams().width = i;
        return this;
    }

    public LiveStreamBuilder setVideoE2EDelaySampleInterval(int i) {
        this.mVideoE2EDelaySampleInterval = i;
        return this;
    }

    public LiveStreamBuilder setVideoEncoder(int i) {
        getPushBase().videoEncoder = i;
        return this;
    }

    public LiveStreamBuilder setVideoFps(int i) {
        getPushBase().fps = i;
        return this;
    }

    public LiveStreamBuilder setVideoGop(int i) {
        this.videoGop = i;
        return this;
    }

    public LiveStreamBuilder setVideoGopSec(float f) {
        getPushBase().gopSec = f;
        return this;
    }

    public LiveStreamBuilder setVideoHeight(int i) {
        this.videoHeight = i;
        IVeLivePusher iVeLivePusher = this.mVeLivePusher;
        if (iVeLivePusher != null) {
            iVeLivePusher.syncPushBaseHeight(i);
        }
        return this;
    }

    public void setVideoLayerMixerSwitch(boolean z) {
        this.videoLayerMixerSwitch = z;
    }

    public LiveStreamBuilder setVideoLevel(int i) {
        this.videoLevel = i;
        return this;
    }

    public LiveStreamBuilder setVideoMaxBitrate(int i) {
        getPushBase().maxBitrate = i;
        return this;
    }

    public LiveStreamBuilder setVideoMinBitrate(int i) {
        getPushBase().minBitrate = i;
        return this;
    }

    public LiveStreamBuilder setVideoMixerOutHeight(int i) {
        AndroidRuntimeException androidRuntimeException = new AndroidRuntimeException("BUG");
        if (!AnonymousClass028.LJI(androidRuntimeException, "LiveStreamBuilder.setVideoMixerOutHeight")) {
            return this;
        }
        throw androidRuntimeException;
    }

    public LiveStreamBuilder setVideoMixerOutWidth(int i) {
        AndroidRuntimeException androidRuntimeException = new AndroidRuntimeException("BUG");
        if (!AnonymousClass028.LJI(androidRuntimeException, "LiveStreamBuilder.setVideoMixerOutWidth")) {
            return this;
        }
        throw androidRuntimeException;
    }

    public void setVideoMixerSwitch(boolean z) {
        this.videoMixerSwitch = z;
    }

    public LiveStreamBuilder setVideoProfile(int i) {
        getPushBase().videoProfile = i;
        return this;
    }

    public LiveStreamBuilder setVideoWidth(int i) {
        this.videoWidth = i;
        IVeLivePusher iVeLivePusher = this.mVeLivePusher;
        if (iVeLivePusher != null) {
            iVeLivePusher.syncPushBaseWidth(i);
        }
        return this;
    }

    public LiveStreamBuilder setVsyncModuleMaxIntevalOnFrameMs(int i) {
        this.vsyncModuleMaxIntevalOnFrameMs = i;
        return this;
    }

    public LiveStreamBuilder setVsyncModuleMaxIntevalOnNowMs(int i) {
        this.vsyncModuleMaxIntevalOnNowMs = i;
        return this;
    }

    public LiveStreamBuilder setupSdkParams(String str) {
        int i;
        if (str == null || str.isEmpty()) {
            return this;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            TinyJson.fromJson(jSONObject, LiveSdkSetting.class, this.mSdkSetting);
            this.mSdkParams = jSONObject;
            parseUrlPrefixAndPort();
            PushBase pushBase = this.mSdkSetting.mPushBase;
            MediaCodecUtils.setDefinedOMX(pushBase.MediaCodecOMX);
            if (NumberInit.isDefined(Integer.valueOf(pushBase.width)) && NumberInit.isDefined(Integer.valueOf(pushBase.height))) {
                if (this.videoWidth > this.videoHeight) {
                    this.videoWidth = Math.max(pushBase.width, pushBase.height);
                    this.videoHeight = Math.min(pushBase.width, pushBase.height);
                } else {
                    this.videoWidth = Math.min(pushBase.width, pushBase.height);
                    this.videoHeight = Math.max(pushBase.width, pushBase.height);
                }
            }
            int i2 = pushBase.yuvConverterColorRange;
            if (i2 == 0 || i2 == 1) {
                YuvConverter.setConvertColorRange(i2);
            }
            if (!TextUtils.isEmpty(pushBase.vCodec)) {
                if (TextUtils.equals(pushBase.vCodec, "bytevc1")) {
                    i = 2;
                } else {
                    i = 1;
                }
                pushBase.videoEncoder = i;
            }
            if (TextUtils.equals(pushBase.hwBitrateMode, "CQ")) {
                pushBase.videoBitrateMode = 0;
            } else if (TextUtils.equals(pushBase.hwBitrateMode, "VBR")) {
                pushBase.videoBitrateMode = 1;
            } else if (TextUtils.equals(pushBase.hwBitrateMode, "CBR")) {
                pushBase.videoBitrateMode = 2;
            }
            if (TextUtils.equals(pushBase.videoProfileStr, "baseline")) {
                pushBase.videoProfile = 1;
            } else if (TextUtils.equals(pushBase.videoProfileStr, "high")) {
                pushBase.videoProfile = 3;
            } else if (TextUtils.equals(pushBase.videoProfileStr, "main")) {
                pushBase.videoProfile = 2;
            }
            if (StringUtils.equalsIgnoreCase(pushBase.aCodec, "MediaCodec")) {
                pushBase.audioEncoder = 2;
            } else if (StringUtils.equalsIgnoreCase(pushBase.aCodec, "ffmpeg")) {
                pushBase.audioEncoder = 3;
            } else if (StringUtils.equalsIgnoreCase(pushBase.aCodec, "fdk-aac")) {
                pushBase.audioEncoder = 1;
            }
            if (!TextUtils.isEmpty(pushBase.audioProfileStr)) {
                if (StringUtils.equalsIgnoreCase(pushBase.audioProfileStr, "AAC-HEv2")) {
                    pushBase.audioProfile = 3;
                } else if (StringUtils.equalsIgnoreCase(pushBase.audioProfileStr, "AAC-HE")) {
                    pushBase.audioProfile = 2;
                } else {
                    pushBase.audioProfile = 1;
                }
            }
            int i3 = pushBase.uploadLogInterval;
            if (i3 > 0 && i3 < 180) {
                pushBase.uploadLogInterval = i3 * 1000;
            }
            GLThreadManager.enableForceGLFinish(pushBase.forceGlFinish);
            GLThreadManager.enableForceGLFence(pushBase.enableGlFenceAfterEffect, pushBase.fenceUsingClientWait);
            GlobalControler.setYuvConverterBufferPoolCnt(pushBase.yuvConverterUseBufferCnt);
            SafeHandlerThreadPoolExecutor.setThreadPoolMode(pushBase.TPEnableThreadPoolMode, pushBase.TPUsingNativeThread, pushBase.TPThreadAliveTimeMs, pushBase.TPCrashLooperWhiteList, pushBase.TPCheckLeakWhenRef0);
            if (this.mSdkSetting.rtmpCacheConfig.getInitVideoFps() == Integer.MAX_VALUE) {
                this.mSdkSetting.rtmpCacheConfig.setInitVideoFps(getVideoFps());
            }
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
            TTLSSladarBugReportUtils.getInstance().report(e, "LiveStreamBuilder.setupSdkParams");
            if (!TTLSBuildConfig.canThrowException()) {
                AVLog.logKibana(6, "TinyJson", "parse sdkParams json failed", e);
            } else {
                throw new AndroidRuntimeException(e);
            }
        }
        return this;
    }

    private int align(int i, int i2) {
        return (((i + i2) - 1) / i2) * i2;
    }

    private TEBundle getRoiSettings(int i, boolean z) {
        TEBundle tEBundle = new TEBundle();
        tEBundle.setInt("roi_on", 0);
        synchronized (getPushBase().roi) {
            PushBase.Roi roi = getPushBase().roi.get(i, z);
            if (roi != null) {
                tEBundle.setInt("roi_on", roi.roiOn);
                tEBundle.setInt("roi_qp", roi.roiQp);
                String str = roi.roiAssetDir;
                if (str != null) {
                    tEBundle.setString("roi_asset_dir", str);
                }
                if (NumberInit.isDefined(Double.valueOf(roi.roiBitrateRatio))) {
                    tEBundle.setDouble("roi_bitrate_ratio", roi.roiBitrateRatio);
                }
                tEBundle.setBool("roi_stretch", getPushBase().roi.roiStretch);
            }
        }
        return tEBundle;
    }

    public ILiveStream create(Handler handler, Handler handler2) {
        return create(handler, handler2, null, null);
    }

    public int getRoiOn(int i, boolean z) {
        synchronized (getPushBase().roi) {
            PushBase.Roi roi = getPushBase().roi.get(i, z);
            if (roi != null) {
                return roi.roiOn;
            }
            return 0;
        }
    }

    public LiveStreamBuilder setEnableVideoNtp(boolean z, List<String> list) {
        if (z && list != null && !list.isEmpty()) {
            getPushBase().enableNTP = z;
            getPushBase().ntpServers = list;
        } else {
            getPushBase().enableNTP = false;
            getPushBase().ntpServers = null;
        }
        return this;
    }

    public LiveStreamBuilder setRoiOn(int i, boolean z) {
        if (z) {
            setRoiOn(i, 1, true);
            setRoiOn(i, 2, true);
        } else {
            setRoiOn(i, 1, false);
            setRoiOn(i, 2, false);
        }
        return this;
    }

    private LiveStreamBuilder setRoiAssetDir(String str, int i, boolean z) {
        synchronized (getPushBase().roi) {
            PushBase.Roi roi = getPushBase().roi.get(i, z);
            if (roi == null) {
                roi = new PushBase.Roi();
            }
            roi.roiAssetDir = str;
            getPushBase().roi.put(i, z, roi);
        }
        return this;
    }

    private LiveStreamBuilder setRoiOn(int i, int i2, boolean z) {
        synchronized (getPushBase().roi) {
            PushBase.Roi roi = getPushBase().roi.get(i2, z);
            if (roi == null) {
                roi = new PushBase.Roi();
            }
            roi.roiOn = i;
            getPushBase().roi.put(i2, z, roi);
        }
        return this;
    }

    public ILiveStream create(Handler handler, Handler handler2, AudioDeviceModule audioDeviceModule) {
        return create(handler, handler2, audioDeviceModule, null);
    }

    private int checkParamsForUpdateInner(TEBundle tEBundle, String str, int i, Boolean[] boolArr) {
        int i2;
        if (tEBundle.contains(str) && i != (i2 = tEBundle.getInt(str))) {
            boolArr[0] = Boolean.TRUE;
            return i2;
        }
        return i;
    }

    public ILiveStream create(Handler handler, Handler handler2, AudioDeviceModule audioDeviceModule, IVideoEffectProcessor iVideoEffectProcessor) {
        return new LiveStream(this, handler, handler2, audioDeviceModule, iVideoEffectProcessor);
    }

    private boolean checkParamsForUpdateInner(TEBundle tEBundle, String str, boolean z, Boolean[] boolArr) {
        boolean bool;
        if (tEBundle.contains(str) && z != (bool = tEBundle.getBool(str))) {
            boolArr[0] = Boolean.TRUE;
            return bool;
        }
        return z;
    }
}
