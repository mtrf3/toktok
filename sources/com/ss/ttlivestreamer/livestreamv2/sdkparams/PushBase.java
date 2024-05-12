package com.ss.ttlivestreamer.livestreamv2.sdkparams;

import X.C48339Iy7;
import X.Q89;
import X.X1D;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveMaxRetainAlogMessageSizeSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import com.livecore.base.tinyjson.TinyJson;
import com.livecore.base.tinyjson.annotations.Serialized;
import com.ss.ttlivestreamer.livestreamv2.utils.NumberInit;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public class PushBase {

    @Serialized("aCodec")
    public String aCodec;

    @Serialized("audioProfile")
    public String audioProfileStr;

    @Serialized("bitrate_strategy")
    public int bitrateStrategy;

    @Serialized("byteVC1MosaicIssueOptimizeLevel")
    public int byteVC1MosaicIssueOptimizeLevel;

    @Serialized("byteVC1Preset")
    public int byteVC1Preset;

    @Serialized("cap_adapted_height")
    public int capAdaptedHeight;

    @Serialized("cap_adapted_width")
    public int capAdaptedWidth;

    @Serialized("changeEncodeFpsThreshold")
    public int changeEncodeFpsThreshold;

    @Serialized("checkEncodeFpsInterval")
    public int checkEncodeFpsInterval;

    @Serialized("disAbleBitrateAdjust")
    public int disAbleBitrateAdjust;

    @Serialized("dumpEffectInOut")
    public JSONObject dumpEffectInOut;

    @Serialized("dumpEncodeFrames")
    public JSONObject dumpEncodeFrames;

    @Serialized("dumpOesTo2D")
    public JSONObject dumpOesTo2D;

    @Serialized("dumpRtcIn")
    public JSONObject dumpRtcIn;

    @Serialized("dumpRtcOut")
    public JSONObject dumpRtcOut;

    @Serialized("dumpScreen")
    public JSONObject dumpScreen;

    @Serialized("enableHardEncBFrame")
    public int enableHardEncBFrame;

    @Serialized("enableNTP")
    public boolean enableNTP;

    @Serialized("enable_push_stall_statistics")
    public boolean enablePushStallStatistics;

    @Serialized("enable_siti")
    public boolean enableSiti;

    @Serialized("enable_tcp_cork")
    public boolean enableTcpCork;

    @Serialized("enalbe_edge_render")
    public boolean enalbeEdgeRender;

    @Serialized("encoderDowngradeOptimize")
    public boolean encoderDowngradeOptimize;

    @Serialized("fixHardwareEncodeDts")
    public boolean fixHardwareEncodeDts;

    @Serialized("frameRateMode")
    public int frameRateMode;

    @Serialized("glFilter")
    public String glFilter;

    @Serialized("gopSec")
    public float gopSec;

    @Serialized("hwBitrateMode")
    public String hwBitrateMode;

    @Serialized("hw_encode_oes")
    public boolean hwEncodeOes;

    @Serialized("logFieldMask")
    public int logFieldMask;

    @Serialized("maxBitrate")
    public int maxBitrate;

    @Serialized("maxChangeEncodeFpsTimes")
    public int maxChangeEncodeFpsTimes;

    @Serialized("minBitrate")
    public int minBitrate;

    @Serialized("ntpServers")
    public List<String> ntpServers;

    @Serialized("setInitBitrateToMax")
    public int setInitBitrateToMax;

    @Serialized("showRoiRegion")
    public boolean showRoiRegion;

    @Serialized("siti_strategy_ver")
    public int siti_strategy_ver;

    @Serialized("vCodec")
    public String vCodec;

    @Serialized("video_adapter_enable_drop_adapter")
    public boolean videoAdapterEnableDropAdapter;

    @Serialized("video_adapter_enable_smooth")
    public boolean videoAdapterEnableSmooth;

    @Serialized("video_adapter_enable_ext_fps")
    public int videoAdapterExtFps;

    @Serialized("videoEncodePerfPrior")
    public boolean videoEncodePerfPrior;

    @Serialized("videoEncoderStrategy")
    public JSONObject videoEncoderStrategy;

    @Serialized("videoProfile")
    public String videoProfileStr;

    @Serialized("width")
    public int width = Integer.MAX_VALUE;

    @Serialized("height")
    public int height = Integer.MAX_VALUE;

    @Serialized("cap_adapted_quirks")
    public int capAdaptedQuirks = 1;

    @Serialized("video_adapter_disable_drop_frame")
    public boolean videoAdapterDisableDropFrame = true;

    @Serialized("video_adapter_drop_check_interval")
    public long videoAdapterDropCheckIntervalNs = 1000000000;

    @Serialized("video_adapter_max_flu_fps")
    public long videoAdapterMaxFluFps = 1000;

    @Serialized("forceAlignTo16")
    public boolean forceAlignTo16 = true;

    @Serialized("retryConnectCount")
    public int retryConnectCount = 10;

    @Serialized("defaultBitrate")
    public int defaultBitrate = 800000;

    @Serialized("fps")
    public int fps = 25;

    @Serialized("enableBFrame")
    public boolean enableBFrame = true;

    @Serialized("yuvConverterColorRange")
    public int yuvConverterColorRange = -1;

    @Serialized("enc_strategy_config")
    public EncStrategyConfig encStrategyConfig = new EncStrategyConfig();

    @Serialized("siti_config")
    public SitiConfig sitiConfig = new SitiConfig();

    @Serialized("enableConstantTimePeriodGop")
    public boolean enableConstantTimePeriodGop = false;

    @Serialized("enableMaxTimePeriodGopSec")
    public double enableMaxTimePeriodGopSec = LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX;

    @Serialized("softwareEncoderMinMaxBitrateAdjust")
    public int softwareEncoderMinMaxBitrateAdjust = 0;

    @Serialized("softwareEncoderBitRateRatioMaxtoDefault")
    public double softwareEncoderBitRateRatioMaxtoDefault = 1.0d;

    @Serialized("softwareEncoderBitRateRatioMintoDefault")
    public double softwareEncoderBitRateRatioMintoDefault = 1.0d;

    @Serialized("enableSeiCurrentShiftDiffTime")
    public boolean enableSeiCurrentShiftDiffTime = true;
    public int videoEncoder = 1;

    @Serialized("useHardware")
    public boolean useHardwareEncode = true;

    @Serialized("video_frame_elpse")
    public boolean videoFrameEllipse = true;

    @Serialized("addCropSeiInfo")
    public boolean addCropSeiInfo = true;

    @Serialized("cameraSwitchInternal")
    public boolean cameraSwitchInternal = true;

    @Serialized("seiNeedSource")
    public boolean seiNeedSource = false;

    @Serialized("noise_suppress")
    public double noiseSuppress = -15.0d;

    @Serialized("enable_auto_volume")
    public boolean enableAutoVolume = false;

    @Serialized("aecAutoSwitch")
    public boolean aecAutoSwitch = false;

    @Serialized("enableNew3ARmsStatistics")
    public boolean enableNew3ARmsStatistics = true;

    @Serialized("gameOptTest")
    public boolean gameOptTest = true;
    public int videoBitrateMode = 1;
    public int videoProfile = 1;
    public int audioEncoder = 1;
    public int audioProfile = 1;

    @Serialized("audioSample")
    public int audioSample = 44100;

    @Serialized("audioChannel")
    public int audioChannel = 2;

    @Serialized("audioBitrate")
    public int audioBitrate = 32000;

    @Serialized("audioCalDBSwitch")
    public int audioCalDBSwitch = 0;

    @Serialized("screenCaptureRetry")
    public boolean enableScreenCaptureRetry = false;

    @Serialized("bitrateAdaptStrategy")
    public int bitrateAdaptStrategy = 0;

    @Serialized("qId")
    public String qosId = "";

    @Serialized("qIdV2")
    public JSONObject qosIdV2 = new JSONObject();

    @Serialized("transportVideoStallThres")
    public int transportVideoStallThres = LiveMaxRetainAlogMessageSizeSetting.DEFAULT;

    @Serialized("transportAudioStallThres")
    public int transportAudioStallThres = 200;

    @Serialized("pitchShift")
    public boolean enablePitchShift = true;

    @Serialized("uploadLogInterval")
    public int uploadLogInterval = 5000;

    @Serialized("enable_global_gl_shared_context_recycler")
    public boolean enableGlobalGLSharedContextRecycler = false;

    @Serialized("newSendCacheConfig")
    public boolean newSendCacheConfig = true;

    @Serialized("enableRenderStallStats")
    public boolean enableRenderStallStats = true;

    @Serialized("NeedUpdateByteAudioConfig")
    public boolean needUpdateByteAudioConfig = true;

    @Serialized("audioFilterAsyncReportError")
    public boolean audioFilterAsyncReportError = false;

    @Serialized("byteaudio_internal_mix_bgm")
    public boolean byteAudioInternalMixBgm = true;

    @Serialized("byteaudio_internal_auto_volume")
    public boolean byteAudioInternalAutoVolume = true;

    @Serialized("NeedChangeModeWhenTriggetEncoder")
    public boolean needChangeModeWhenTriggetEncoder = true;

    @Serialized("IsScreenRecordDisableMixer")
    public boolean isScreenRecordDisableMixer = true;

    @Serialized("enableClearRect")
    public boolean enableClearRect = true;

    @Serialized("previewFps")
    public int previewFps = -1;

    @Serialized("publishPlanarRender")
    public boolean publishPlanarRender = true;

    @Serialized("BgPushWithAdaptedResolution")
    public boolean bgPushWithAdaptedResolution = true;

    @Serialized("SettinsByteAudioConfigLevel")
    public boolean settinsByteAudioConfigLevel = true;

    @Serialized("ForceGlFinish")
    public boolean forceGlFinish = true;

    @Serialized("YuvConverterUseBufferCnt")
    public int yuvConverterUseBufferCnt = 0;

    @Serialized("EnableFindContour")
    public boolean enableFindContour = true;

    @Serialized("enableNewNetWorkQuality")
    public boolean enableNewNetWorkQuality = false;

    @Serialized("EnableThreeBuffer")
    public boolean enableThreeBuffer = false;

    @Serialized("EnableAlgorithmSyncer")
    public boolean enableAlgorithmSyncer = false;

    @Serialized("EnableDropFrameWhenNoBuffer")
    public boolean enableDropFrameWhenNoBuffer = true;

    @Serialized("EffectLogLevel")
    public int effectLogLevel = 3;

    @Serialized("TPThreadAliveTimeMs")
    public int TPThreadAliveTimeMs = 0;

    @Serialized("TPCrashLooperWhiteList")
    public JSONObject TPCrashLooperWhiteList = null;

    @Serialized("MediaCodecOMX")
    public JSONArray MediaCodecOMX = new JSONArray();

    @Serialized("TPEnableThreadPoolMode")
    public boolean TPEnableThreadPoolMode = false;

    @Serialized("TPUsingNativeThread")
    public boolean TPUsingNativeThread = false;

    @Serialized("TPCheckLeakWhenRef0")
    public boolean TPCheckLeakWhenRef0 = true;

    @Serialized("disableDropFrames")
    public boolean disableDropFrames = false;

    @Serialized("disableCropScale")
    public boolean disableCropScale = false;

    @Serialized("disableEffect")
    public boolean disableEffect = false;

    @Serialized("disable2DTrans")
    public boolean disable2DTrans = false;

    @Serialized("bgMode")
    public int bgMode = 1;

    @Serialized("disableUpdateVideoCapture")
    public boolean disableUpdateVideoCapture = true;

    @Serialized("enableChooseBestCaptureResolution")
    public boolean enableChooseBestCaptureResolution = false;

    @Serialized("restartCameraWhenChangeResolution")
    public boolean restartCameraWhenChangeResolution = true;

    @Serialized("getLiveStreamInfoSyncGetMicDB")
    public boolean getLiveStreamInfoSyncGetMicDB = true;

    @Serialized("adm_type")
    public int admType = 1;

    @Serialized("adm_server_cfg")
    public JSONObject admServerConfig = TinyJson.toJson(new DefaultAdmServerCfg(), DefaultAdmServerCfg.class);

    @Serialized("adm_support_hardware_ear_monitor")
    public int supportHardWareEarMonitor = 0;

    @Serialized("adm_hardware_audio_effect_table")
    public JSONObject admHardwareAudioEffectTable = null;

    @Serialized("adm_enable_aec_on_headset_mode")
    public boolean enableAecOnHeadsetMode = true;

    @Serialized("rtmpLockOpt")
    public boolean rtmpLockOpt = false;

    @Serialized("rtsEngineVersion")
    public int rtsEngineVersion = 2;

    @Serialized("rtsConfig")
    public String rtsConfig = "";

    @Serialized("liveioSettings")
    public String liveioSettings = "";

    @Serialized("live_gl_version")
    public int liveGlVersion = Integer.MAX_VALUE;

    @Serialized("FilterBufferPoolSize")
    public int filterBufferPoolSize = 4;

    @Serialized("crop_buffer_pool_size")
    public int cropBufferPoolSize = 3;

    @Serialized("sr_buffer_pool_size")
    public int srBufferPoolSize = 3;

    @Serialized("FilterBufferPoolSyncMode")
    public boolean filterBufferPoolSyncMode = true;

    @Serialized("FilterProcessType")
    public int filterProcessType = 1;

    @Serialized("need_report_video_mixer")
    public boolean needReportVideoMixerInfo = false;

    @Serialized("push_stream_result_report_second")
    public int pushStreamResultReportSecond = 10;

    @Serialized("enableByteAudioFilterOptimized")
    public boolean enableByteAudioFilterOptimized = false;

    @Serialized("enableCalculateAudioLoudness")
    public boolean enableCalculateAudioLoudness = false;

    @Serialized("streamPublishSuccessInterval")
    public int streamPublishSuccessInterval = 3;

    @Serialized("live_fallback_fps")
    public boolean liveFallbackFps = false;

    @Serialized("interact_fallback_fps")
    public boolean interactFallbackFps = false;

    @Serialized("fallback_fps_map")
    public JSONObject fallbackFpsMap = null;

    @Serialized("bmf_auto_bright")
    public JSONObject autoBrightParams = null;

    @Serialized("noise_evaluate")
    public JSONObject noiseEvaluateParams = null;

    @Serialized("vqscore")
    public JSONObject vqScoreParams = null;

    @Serialized("bmf_color_hist")
    public JSONObject colorHistParams = null;

    @Serialized("videoDenoise")
    public JSONObject videoDenoiseParams = null;

    @Serialized("gamma_correction")
    public boolean gammaCorrectionOnExternVideoCapture = false;

    @Serialized("guardTransportSetupUri")
    public boolean guardTransportSetupUri = true;

    @Serialized("enableAbortRequest")
    public boolean enableAbortRequest = false;

    @Serialized("enable_render_fixed_size")
    public boolean enable_render_fixed_size = false;

    @Serialized("timestampSynMode")
    public int timestampSynMode = 0;

    @Serialized("clear_stencil_when_resize")
    public boolean clearStencilWhenResize = true;

    @Serialized("rtmp_sync_start_publish")
    public boolean RtmpSyncStartPublish = false;

    @Serialized("enableGlFenceAfterEffect")
    public boolean enableGlFenceAfterEffect = false;

    @Serialized("fenceUsingClientWait")
    public boolean fenceUsingClientWait = false;

    @Serialized("SamiDiagnosisInVpaas")
    public JSONObject samiDiagnosisInVpaas = null;

    @Serialized("enable_ns_work_thread")
    public boolean enableNsInWorkThread = true;

    @Serialized("enableStereoProcess")
    public boolean enableStereoProcess = false;

    @Serialized("enable_sami_snr")
    public boolean enableSamiSnr = false;

    @Serialized("sami_utility")
    public String samiUtility = "";

    @Serialized("UnReleaseInInputStream")
    public boolean UnReleaseInInputStream = true;

    @Serialized("enableEarMonitorRoute")
    public boolean enableEarMonitorRoute = false;

    @Serialized("hardwareEncodeQPCfg")
    public JSONObject hardwareEncodeQPCfg = null;

    @Serialized("enableSingleChorusTwoVoicesFix")
    public boolean enableSingleChorusTwoVoicesFix = true;

    @Serialized("enableHardwareQPSetting")
    public boolean enableHardwareQPSetting = false;

    @Serialized("roi")
    public final RoiMap roi = new RoiMap();

    @Serialized("videoAlgorithm")
    public int videoAlgorithm = Integer.MAX_VALUE;

    @Serialized("oneKeyProcess")
    public OnekeyProcessParams oneKeyProcess = new OnekeyProcessParams();

    @Serialized("enableScreenAudioStereoCapture")
    public boolean enableScreenAudioStereoCapture = false;

    @Serialized("stopBaePushStreamWhenServerMix")
    public boolean stopBaePushStreamWhenServerMix = false;

    @Serialized("enableSamiEffectOpt")
    public boolean enableSamiEffectOpt = false;

    @Serialized("enableAudioPipelineOpt")
    public boolean enableAudioPipelineOpt = false;

    @Serialized("gameLiveDupInterval")
    public int gameLiveDupInterval = 0;

    @Serialized("enableMicMuteStatusCheck")
    public boolean enableMicMuteStatusCheck = false;

    /* loaded from: classes12.dex */
    public static class Roi {

        @Serialized("roi_asset_dir")
        public String roiAssetDir;

        @Serialized("roi_on")
        public int roiOn;

        @Serialized("roi_qp")
        public int roiQp = -100;

        @Serialized("roi_bitrate_ratio")
        public double roiBitrateRatio = NumberInit.UNDEFINED_DOUBLE_VALUE;
    }

    /* loaded from: classes12.dex */
    public static class OnekeyProcessParams {

        @Serialized("switch")
        public boolean algSwitch;

        @Serialized("enableAfs")
        public boolean enableAfs;

        @Serialized("enableDenoise")
        public boolean enableDenoise;

        @Serialized("isFirstFrame")
        public boolean isFirstFrame;

        @Serialized("enableHDR")
        public boolean enableHDR = true;

        @Serialized("enableHdrV2")
        public boolean enableHdrV2 = true;

        @Serialized("enableAsyncProcess")
        public boolean enableAsyncProcess = true;

        @Serialized("enableDayScene")
        public boolean enableDayScene = true;

        @Serialized("enableNightScene")
        public boolean enableNightScene = true;

        @Serialized("cvdetectFrames")
        public int cvdetectFrames = 3;

        @Serialized("algParams")
        public String algParams = "luminance_target_string=175,155\n    & contrast_factor_float=0.3f\n    & saturation_factor_float=0.3f\n    & amount_float=2.f\n    & ratio_float=0.02f\n    & noise_factor_float=1.f\n    & current_pixel_weight_float=0.5f\n    & hdr_version_int=2\n    & luma_trigger_float=37.8\n    & over_trigger_float=-1\n    & under_trigger_float=-1\n    & asf_scene_mode_int=5\"";

        @Serialized("enableAlgoConfig")
        public boolean enableAlgoConfig = true;

        public String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("OnekeyProcessParams{algSwitch=");
            LIZ.append(this.algSwitch);
            LIZ.append(", enableHDR=");
            LIZ.append(this.enableHDR);
            LIZ.append(", enableDenoise=");
            LIZ.append(this.enableDenoise);
            LIZ.append(", enableAfs=");
            LIZ.append(this.enableAfs);
            LIZ.append(", enableHdrV2=");
            LIZ.append(this.enableHdrV2);
            LIZ.append(", enableAsyncProcess=");
            LIZ.append(this.enableAsyncProcess);
            LIZ.append(", enableDayScene=");
            LIZ.append(this.enableDayScene);
            LIZ.append(", enableNightScene=");
            LIZ.append(this.enableNightScene);
            LIZ.append(", cvdetectFrames=");
            LIZ.append(this.cvdetectFrames);
            LIZ.append(", algParams='");
            Q89.LIZIZ(LIZ, this.algParams, '\'', ", isFirstFrame=");
            LIZ.append(this.isFirstFrame);
            LIZ.append(", enableAlgoConfig=");
            return C48339Iy7.LIZJ(LIZ, this.enableAlgoConfig, '}', LIZ);
        }
    }

    /* loaded from: classes12.dex */
    public static class RoiMap {

        @Serialized("bytevc0")
        public Roi bytevc0Roi;

        @Serialized("bytevc1")
        public Roi bytevc1Roi;

        @Serialized("hardBytevc1")
        public Roi hardBytevc1Roi;

        @Serialized("hardH264")
        public Roi hardH264Roi;

        @Serialized("roi_stretch")
        public boolean roiStretch;

        @Serialized("x264")
        public Roi x264Roi;

        private String getVideoEncoderName(int i, boolean z) {
            return i != 2 ? z ? "hardH264" : "bytevc0" : z ? "hardBytevc1" : "bytevc1";
        }

        public Roi get(String str) {
            if (str.equals("hardH264")) {
                return this.hardH264Roi;
            }
            if (str.equals("x264")) {
                return this.x264Roi;
            }
            if (str.equals("bytevc0")) {
                return this.bytevc0Roi;
            }
            if (str.equals("hardBytevc1")) {
                return this.hardBytevc1Roi;
            }
            if (str.equals("bytevc1")) {
                return this.bytevc1Roi;
            }
            return null;
        }

        public Roi get(int i, boolean z) {
            return get(getVideoEncoderName(i, z));
        }

        public void put(String str, Roi roi) {
            if (str.equals("hardH264")) {
                this.hardH264Roi = roi;
            }
            if (str.equals("x264")) {
                this.x264Roi = roi;
            }
            if (str.equals("bytevc0")) {
                this.bytevc0Roi = roi;
            }
            if (str.equals("hardBytevc1")) {
                this.hardBytevc1Roi = roi;
            }
            if (str.equals("bytevc1")) {
                this.bytevc1Roi = roi;
            }
        }

        public void put(int i, boolean z, Roi roi) {
            put(getVideoEncoderName(i, z), roi);
        }
    }
}
