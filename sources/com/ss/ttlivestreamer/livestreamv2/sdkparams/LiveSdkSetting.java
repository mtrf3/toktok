package com.ss.ttlivestreamer.livestreamv2.sdkparams;

import com.livecore.base.tinyjson.annotations.Serialized;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes12.dex */
public class LiveSdkSetting {

    @Serialized("Common")
    public CommonParams commonParams = new CommonParams();

    @Serialized("Switch")
    public SwitchParams switchParams = new SwitchParams();

    @Serialized("rtmpk")
    public KcpParams kcpParams = new KcpParams();

    @Serialized("rtmpq")
    public QuicParams quicParams = new QuicParams();

    @Serialized("bwestBaseBwStrategy_params")
    public BwEstBaseBWConfig bwEstBaseBWConfig = new BwEstBaseBWConfig();

    @Serialized("node_opt")
    public NodeOptParams nodeOpt = new NodeOptParams();

    @Serialized("sandbox")
    public SandboxParams sandboxParams = new SandboxParams();

    @Serialized("reconnect")
    public ReconnectConfig reconnectConfig = new ReconnectConfig();

    @Serialized("rtmp_cache_cfg")
    public RtmpCacheConfig rtmpCacheConfig = new RtmpCacheConfig();

    @Serialized("SuggestProtocol")
    public String suggestProtocol = "";

    @Serialized("RtmpPorts")
    public Map<String, Integer> rtmpPorts = new HashMap();

    @Serialized("PushStall")
    public PushStallConfig pushStallConfig = new PushStallConfig();

    @Serialized("CaptureBase")
    public CaptureBase captureBase = new CaptureBase();

    @Serialized("PushBase")
    public PushBase mPushBase = new PushBase();

    @Serialized("Interact")
    public VPassInteractCfg mVPassInteractCfg = new VPassInteractCfg();

    @Serialized("UploadBWProbe")
    public UploadBWProbeParams mUploadBWProbeParams = new UploadBWProbeParams();

    @Serialized("enable_global_gl_shared_context_mutex")
    public boolean enableGlobalGlSharedContextMutex = false;

    @Serialized("enable_gl_tracer")
    public boolean enableGLTracer = false;

    @Serialized("psnr_statistics")
    public PsnrStatisics psnrStatisics = new PsnrStatisics();

    @Serialized("logLevel")
    public int logLevel = Integer.MAX_VALUE;

    @Serialized("live_enable_karaoke_regulator")
    public boolean enableKaraokeRegulator = true;

    @Serialized("enable_rtc_push_frame_statics")
    public boolean enableRtcPushStreamStatics = true;

    @Serialized("enable_aec_v2")
    public boolean enableAecV2Algorithm = true;

    @Serialized("adm_enable_ns")
    public int nsModeOnAecV2 = 0;

    @Serialized("adm_enable_agc")
    public boolean agcEnableOnAecV2Mode = false;

    @Serialized("adm_recording_type")
    public String admRecordingType = "opensles";

    @Serialized("adm_player_type")
    public String admPlayerType = "opensles";

    @Serialized("adm_render_mix_enable_read_mode")
    public boolean admRenderMode = true;

    @Serialized("adaptLiveV2Device")
    public boolean adaptLiveV2Device = false;

    @Serialized("camera_size_opt")
    public boolean cameraSizeOpt = true;

    @Serialized("camera_size_opt_log")
    public boolean cameraSizeOptLog = true;

    @Serialized("camera_size_opt_update_wh_on_thread")
    public boolean cameraSizeOptUpdateWhOnThread = true;

    @Serialized("enable_copy_oes_process")
    public boolean enableCopyOesProcess = false;

    @Serialized("enable_copy_oes_process_check_device_support")
    public boolean enableCopyOesProcessCheckSupport = false;

    @Serialized("enable_pts_adjust")
    public boolean enablePtsAdjust = false;

    @Serialized("enable_release_micphone_anyway")
    public boolean enableReleaseMicphoneAnyway = true;

    @Serialized("light_check_strategy")
    public int lightCheckStrategy = 0;

    @Serialized("dark_sync_min_enable")
    public int darkSyncMinEnable = 0;

    @Serialized("linkmic_normal_live_min_fps")
    public int linkmicNormalLiveMinFps = 15;
}
