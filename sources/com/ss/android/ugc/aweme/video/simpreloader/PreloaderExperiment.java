package com.ss.android.ugc.aweme.video.simpreloader;

import X.C00F;
import X.C012403c;
import X.C221108m2;
import X.C34221Dbt;
import X.C34541Dh3;
import X.C34542Dh4;
import X.C34557DhJ;
import X.C34559DhL;
import X.C44432HcC;
import X.C46898Ias;
import X.C47300IhM;
import X.C51790KUg;
import X.C51929KZp;
import X.C5H3;
import X.C75792yF;
import X.C88408Ymq;
import X.EnumC221088m0;
import X.EnumC47317Ihd;
import X.FFL;
import X.InterfaceC51787KUd;
import X.LFH;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveMaxRetainAlogMessageSizeSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveTryModeCountDownThresholdSetting;
import com.ss.android.ugc.aweme.simkit.model.bitrateselect.RateSettingsResponse;
import com.ss.android.ugc.aweme.video.VideoBitRateABManager;
import com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment;
import com.ss.android.ugc.aweme.video.preload.model.BufferPreloadStrategyConfig;
import com.ss.android.ugc.aweme.video.preload.model.EnginePreloaderConfig;
import com.ss.android.ugc.aweme.video.preload.model.PreloadPromptConfig;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import defpackage.e1;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class PreloaderExperiment implements IPreloaderExperiment {
    public static final C51790KUg Companion = new C51790KUg();
    public static int videoNetworkSpeedAlgorithmExperimentValue = -1;
    public final C5H3 mPreloadExpModel$delegate = C221108m2.LIZ(EnumC221088m0.SYNCHRONIZED, C34541Dh3.LJLIL);

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public /* bridge */ /* synthetic */ boolean EnableDetailNotification() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public /* bridge */ /* synthetic */ int EngineEnableMaxFileMemCacheNumExp() {
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public /* bridge */ /* synthetic */ int EngineEnableMaxFileMemCacheSizeExp() {
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public /* bridge */ /* synthetic */ boolean enableMDLInitAsync() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public /* bridge */ /* synthetic */ boolean enableRealTimeSpeedMonitor() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public /* bridge */ /* synthetic */ boolean enableSuperResolution() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public /* bridge */ /* synthetic */ boolean enableUseNewGetCacheMethod() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public /* bridge */ /* synthetic */ double getBitrateSwitchThreshold() {
        return 0.75d;
    }

    public /* bridge */ /* synthetic */ BufferPreloadStrategyConfig getBufferPreloadStrategyConfig() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public /* bridge */ /* synthetic */ String getDataLoaderMdlExtensionOpts() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public /* bridge */ /* synthetic */ String getMDLUA1() {
        return "";
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public /* bridge */ /* synthetic */ boolean getUSE_CALLBACK_CACHE_SIZE() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public /* bridge */ /* synthetic */ int isEnginePreloaderForceUseOKHttp() {
        return 0;
    }

    public /* bridge */ /* synthetic */ boolean isPreloadStrategyUseSameThread() {
        return false;
    }

    private final C34542Dh4 getMPreloadExpModel() {
        return (C34542Dh4) this.mPreloadExpModel$delegate.getValue();
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public int DisableVideocacheLocalServerExperiment() {
        return ((Number) C34221Dbt.LIZ.getValue()).intValue();
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public int EnginePreloaderPreloadStrategyExperiment() {
        return C00F.LIZ(31744, 1, "engine_preloader_preload_strategy", true);
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public int EnginePreloaderStackOrQueueExperiment() {
        return C00F.LIZ(31744, 1, "engine_preloader_queue_or_stack", true);
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public int PlayerAbChecksumLevelExp() {
        return C00F.LIZ(31744, 0, "checksum_level", true);
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public int PlayerAbMedialoaderEnableFileExtendBuffer() {
        return ((Number) C34221Dbt.LIZLLL.getValue()).intValue();
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public int PlayerAbMedialoaderEnablePreconneExp() {
        return ((Number) C51929KZp.LIZ.getValue()).intValue();
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public int PlayerAbMedialoaderPreconnectNumExp() {
        return C00F.LIZ(31744, 3, "player_medialoader_preconnect_num", true);
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public EnumC47317Ihd PreloadTypeExperiment() {
        if (C00F.LIZ(31744, 2, "preloader_type", true) == 2) {
            return EnumC47317Ihd.MediaLoader;
        }
        return EnumC47317Ihd.VideoCache;
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public int RingBufferSizeMdlExperiment() {
        return ((Number) C34221Dbt.LIZIZ.getValue()).intValue();
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public int UseTTNetExperiment() {
        return C00F.LIZ(31744, 1, "use_ttnet", true);
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public int VideoCacheMaxCacheSizeExperiment() {
        return LFH.LIZIZ.LIZLLL().LJIIJ().LIZLLL(C00F.LIZ(31744, -1, "player_cache_max_size", true));
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public int VideoNetworkSpeedAlgorithmExperiment() {
        if (C44432HcC.LJLJI) {
            if (videoNetworkSpeedAlgorithmExperimentValue == -1) {
                videoNetworkSpeedAlgorithmExperimentValue = C00F.LIZ(31744, 0, "video_network_speed_algorithm", true);
            }
            return videoNetworkSpeedAlgorithmExperimentValue;
        }
        return C00F.LIZ(31744, 0, "video_network_speed_algorithm", true);
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public int VideoSpeedQueueSizeExperiment() {
        return C00F.LIZ(31744, 10, "video_speed_queue_size", true);
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public List<C46898Ias> engineStaticOptionList() {
        C47300IhM.LIZ.getClass();
        return (List) C47300IhM.LIZJ.getValue();
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public String getBandWidthJsonString() {
        C34557DhJ.LIZ.getClass();
        return (String) C34557DhJ.LIZIZ.getValue();
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public Map getExCacheDirSizeConfig() {
        return new HashMap();
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public String getGearStrategyJsonString() {
        VideoBitRateABManager videoBitRateABManager = VideoBitRateABManager.LJFF;
        RateSettingsResponse rateSettingsResponse = videoBitRateABManager.LIZ;
        if (rateSettingsResponse == null) {
            if (videoBitRateABManager.LJ == null) {
                videoBitRateABManager.LJFF();
            }
            rateSettingsResponse = videoBitRateABManager.LJ;
            if (rateSettingsResponse == null) {
                return "";
            }
        }
        String LIZJ = C75792yF.LIZJ(rateSettingsResponse);
        o.LJIIIIZZ(LIZJ, "toJson(rateSetting)");
        return LIZJ;
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public String getModuleConfigJsonString() {
        C34559DhL.LIZ.getClass();
        return (String) C34559DhL.LIZIZ.getValue();
    }

    public PreloadPromptConfig getPreloadPromptConfig() {
        return new PreloadPromptConfig();
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public Boolean CheckVideoCacheRequestHeaderExperiment() {
        boolean z = true;
        if (!C88408Ymq.LJII()) {
            z = e1.LIZ(31744, "check_video_cache_request_header", true, true);
        }
        return Boolean.valueOf(z);
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public int EnableDownloaderLogExpErrorExperiment() {
        if (C88408Ymq.LJII()) {
            return 0;
        }
        return C00F.LIZ(31744, 0, "enable_engine_downloader_log_exp", true);
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public boolean EnableGetCDNLogExperiment() {
        if (C88408Ymq.LJFF()) {
            return false;
        }
        return InterfaceC51787KUd.LIZ;
    }

    public int EnableP2pStragetyControlExperiment() {
        if (C88408Ymq.LJFF()) {
            return 0;
        }
        return C00F.LIZ(31744, 0, "enable_p2p_stragety_control", true);
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public Boolean EnablePreloaderPreConnect() {
        boolean z = false;
        if (!C88408Ymq.LJII() && C00F.LIZ(31744, 0, "engine_preloader_pre_connect", true) == 1) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public boolean EnableTTnetClientInject() {
        if (C88408Ymq.LJ() || C00F.LIZ(31744, 1, "player_enable_ttnet_inject", false) == 1) {
            return true;
        }
        return false;
    }

    public long EngineDataloaderDownloadMonitorMinLoadSizeExperiment() {
        if (C88408Ymq.LJII()) {
            return 0L;
        }
        return C012403c.LIZIZ(31744, 0L, "dataloader_download_monitor_min_loadsize");
    }

    public long EngineDataloaderDownloadMonitorTimeInternalExperiment() {
        if (C88408Ymq.LJII()) {
            return 0L;
        }
        return C012403c.LIZIZ(31744, 0L, "dataloader_download_monitor_time_internal");
    }

    public int EnginePreloaderBlockHostErrIPCountExperiment() {
        if (C88408Ymq.LJII()) {
            return 0;
        }
        return C00F.LIZ(31744, 0, "block_host_err_ip_count", true);
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public int EnginePreloaderConcurrentNumExperiment() {
        if (C88408Ymq.LJFF()) {
            return 1;
        }
        return C00F.LIZ(31744, 1, "engine_preloader_concurrent_num", true);
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public EnginePreloaderConfig EnginePreloaderConfigExperiment() {
        FFL.LJIIIZ().getClass();
        Object LJIJ = FFL.LJIJ(true, "engine_preload_config", 31744, EnginePreloaderConfig.class, null);
        o.LJI(LJIJ);
        return (EnginePreloaderConfig) LJIJ;
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public int EnginePreloaderEnableNetworkChangedListenExperiment() {
        if (C88408Ymq.LJFF()) {
            return 0;
        }
        return C00F.LIZ(31744, 0, "engine_preloader_enable_network_changed_listen", true);
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public int EnginePreloaderNetSchedulerBlockAllNetErrorExperiment() {
        if (C88408Ymq.LJII()) {
            return 0;
        }
        return C00F.LIZ(31744, 0, "enable_net_scheduler_block_all_net_error", true);
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public int EnginePreloaderNetSchedulerBlockDurationExperiment() {
        if (C88408Ymq.LJII()) {
            return 0;
        }
        return C00F.LIZ(31744, 0, "net_scheduler_block_duration", true);
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public int EnginePreloaderNetSchedulerBlockErrorCountExperiment() {
        if (C88408Ymq.LJII()) {
            return 0;
        }
        return C00F.LIZ(31744, 0, "net_scheduler_block_error_count", true);
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public int EnginePreloaderNetSchedulerEnableExperiment() {
        if (C88408Ymq.LJII()) {
            return 0;
        }
        return C00F.LIZ(31744, 0, "enable_net_scheduler", true);
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public int EnginePreloaderOpenTimeoutExperiment() {
        if (C88408Ymq.LJFF()) {
            return 10;
        }
        return C00F.LIZ(31744, 10, "engine_preloader_open_timeout", true);
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public int EnginePreloaderRWTimeoutExperiment() {
        if (C88408Ymq.LJFF()) {
            return 10;
        }
        return C00F.LIZ(31744, 10, "engine_preloader_rw_timeout", true);
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public int EnginePreloaderTlsSessionTimeoutExperiment() {
        if (C88408Ymq.LJI()) {
            return 3600;
        }
        return C00F.LIZ(31744, 3600, "engine_preloader_tls_session_timeout", true);
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public int P2pStragetyEnableSyndnsExperiment() {
        if (C88408Ymq.LJFF()) {
            return 0;
        }
        return C00F.LIZ(31744, 0, "enable_p2p_stragety_enable_syndns", true);
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public int P2pStragetyExpiredTimeExperiment() {
        if (C88408Ymq.LJFF()) {
            return LiveTryModeCountDownThresholdSetting.DEFAULT;
        }
        return C00F.LIZ(31744, LiveTryModeCountDownThresholdSetting.DEFAULT, "p2p_stragety_expired_time", true);
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public int P2pStragetyMaxBufferingTimeExperiment() {
        if (C88408Ymq.LJFF()) {
            return 300;
        }
        return C00F.LIZ(31744, 300, "p2p_stragety_max_buffering_time", true);
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public int P2pStragetyMaxLeaveWaitTimeExperiment() {
        if (C88408Ymq.LJFF()) {
            return 600;
        }
        return C00F.LIZ(31744, 600, "p2p_stragety_max_leave_wait_time", true);
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public int P2pStragetyMinNetSpeedExperiment() {
        if (C88408Ymq.LJFF()) {
            return 0;
        }
        return C00F.LIZ(31744, 0, "p2p_stragety_min_net_speed", true);
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public int P2pStragetyMinPlayNumberExperiment() {
        if (C88408Ymq.LJFF()) {
            return 5;
        }
        return C00F.LIZ(31744, 5, "p2p_stragety_min_play_num", true);
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public int P2pStragetyXyLibValueExperiment() {
        if (C88408Ymq.LJFF()) {
            return 1;
        }
        return C00F.LIZ(31744, 1, "enable_p2p_stragety_xy_lib_value", true);
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public int PlayUse2UrlExperiment() {
        if (C88408Ymq.LJII()) {
            return 0;
        }
        return C00F.LIZ(31744, 0, "player_play_use_2_cdn_url", true);
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public int PlayeAbUserHttp2Exp() {
        if (C88408Ymq.LJII()) {
            return 0;
        }
        return C00F.LIZ(31744, 0, "player_use_http2", true);
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public int PlayerAbABRAlgoExp() {
        if (C88408Ymq.LJFF()) {
            return 0;
        }
        return C00F.LIZ(31744, 0, "player_abr_algo", true);
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public int PlayerAbABRSpeedPredictAlgoExp() {
        if (C88408Ymq.LJFF()) {
            return 0;
        }
        return C00F.LIZ(31744, 0, "player_abr_speed_predict_algo", true);
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public int PlayerAbABRSpeedPredictTimeIntervalExp() {
        if (C88408Ymq.LJFF()) {
            return LiveMaxRetainAlogMessageSizeSetting.DEFAULT;
        }
        return C00F.LIZ(31744, LiveMaxRetainAlogMessageSizeSetting.DEFAULT, "player_abr_speed_predict_time_interval", true);
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public int PlayerAbBackupDnsTypeExp() {
        if (C88408Ymq.LJFF()) {
            return 3;
        }
        return C00F.LIZ(31744, 3, "player_ab_backup_dns_type", true);
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public int PlayerAbDashPreloadAudioFirstExp() {
        if (C88408Ymq.LJFF()) {
            return 0;
        }
        return C00F.LIZ(31744, 0, "player_dash_preload_audio_first", true);
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public int PlayerAbEnableDebugLogExp() {
        if (C88408Ymq.LJI()) {
            return 0;
        }
        return C00F.LIZ(31744, 0, "player_enable_debug_log", true);
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public int PlayerAbMainDnsDelayTimeExp() {
        if (C88408Ymq.LJFF()) {
            return 0;
        }
        return C00F.LIZ(31744, 0, "player_ab_main_dns_timeout", true);
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public int PlayerAbMainDnsTypeExp() {
        if (C88408Ymq.LJFF()) {
            return 0;
        }
        return C00F.LIZ(31744, 0, "player_ab_main_dns_type", true);
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public int PlayerAbMediaLoaderCheckPreloadLevelExp() {
        if (C88408Ymq.LJI()) {
            return 0;
        }
        return C00F.LIZ(31744, 0, "player_medialoader_check_preload_level", true);
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public int PlayerAbMedialoaderAccessCheckLevelExp() {
        if (C88408Ymq.LJI()) {
            return 0;
        }
        return C00F.LIZ(31744, 0, "player_medialoader_access_check_level", true);
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public int PlayerAbMedialoaderEnableBackupDnsIPExp() {
        if (C88408Ymq.LJI()) {
            return 0;
        }
        return C00F.LIZ(31744, 0, "player_medialoader_enable_dns_backup_ip", true);
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public int PlayerAbMedialoaderEnableBenchmarkExp() {
        if (C88408Ymq.LJI()) {
            return 0;
        }
        return C00F.LIZ(31744, 0, "player_medialoader_enable_benchmark_io", true);
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public int PlayerAbMedialoaderEnableDnsLogExp() {
        if (C88408Ymq.LJI()) {
            return 0;
        }
        return C00F.LIZ(31744, 0, "player_medialoader_enable_dns_log", true);
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public int PlayerAbMedialoaderEnableDnsParallelExp() {
        if (C88408Ymq.LJI()) {
            return 0;
        }
        return C00F.LIZ(31744, 0, "player_medialoader_enable_dns_parallel", true);
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public int PlayerAbMedialoaderEnableDnsRefreshExp() {
        if (C88408Ymq.LJI()) {
            return 0;
        }
        return C00F.LIZ(31744, 0, "player_medialoader_enable_dns_refresh", true);
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public int PlayerAbMedialoaderEnableFileRingBuffer() {
        if (C88408Ymq.LJI()) {
            return 0;
        }
        return C00F.LIZ(31744, 0, "player_medialoader_enable_file_ring_buffer", true);
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public int PlayerAbMedialoaderEnableSpeedCoefficientExp() {
        if (C88408Ymq.LJI()) {
            return 0;
        }
        return C00F.LIZ(31744, 0, "player_medialoader_enable_speed_coefficient", true);
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public int PlayerAbMedialoaderEnableTLSSessionReuseExp() {
        if (C88408Ymq.LJI()) {
            return 1;
        }
        return C00F.LIZ(31744, 0, "player_medialoader_enable_tls_session_reuse", true);
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public int PlayerAbMedialoaderEnableTaskReuseExp() {
        if (C88408Ymq.LJI()) {
            return 0;
        }
        return C00F.LIZ(31744, 0, "player_medialoader_enable_task_reuse", true);
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public String PlayerAbMedialoaderGoogleDnsHostExp() {
        if (C88408Ymq.LJI()) {
            return "dns.google.com";
        }
        FFL.LJIIIZ().getClass();
        String LJIILJJIL = FFL.LJIILJJIL(31744, "player_medialoader_google_dns_host", "dns.google.com", true);
        o.LJIIIIZZ(LJIILJJIL, "{\n            ABManager.…xp::class.java)\n        }");
        return LJIILJJIL;
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public int PlayerAbMedialoaderHeaderDataMemCache() {
        if (C88408Ymq.LJI()) {
            return 0;
        }
        return C00F.LIZ(31744, 0, "player_medialoader_header_data_mem_cache", true);
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public int PlayerAbMedialoaderIpv4Num() {
        if (C88408Ymq.LJI()) {
            return Integer.MAX_VALUE;
        }
        return C00F.LIZ(31744, Integer.MAX_VALUE, "player_medialoader_ipv4_num", true);
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public int PlayerAbMedialoaderIpv6Num() {
        if (C88408Ymq.LJI()) {
            return Integer.MAX_VALUE;
        }
        return C00F.LIZ(31744, Integer.MAX_VALUE, "player_medialoader_ipv6_num", true);
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public int PlayerAbMedialoaderLazyBufferPoolEnableExp() {
        if (C88408Ymq.LJI()) {
            return 0;
        }
        return C00F.LIZ(31744, 0, "player_mdl_enable_lazy_buffer_pool", true);
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public String PlayerAbMedialoaderOwnDnsHostExp() {
        if (C88408Ymq.LJI()) {
            return "34.102.215.99";
        }
        FFL.LJIIIZ().getClass();
        String LJIILJJIL = FFL.LJIILJJIL(31744, "player_medialoader_own_dns_host", "34.102.215.99", true);
        o.LJIIIIZZ(LJIILJJIL, "{\n            ABManager.…xp::class.java)\n        }");
        return LJIILJJIL;
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public int PlayerAbMedialoaderTLSVersionExp() {
        if (C88408Ymq.LJII()) {
            return 3;
        }
        return C00F.LIZ(31744, 2, "player_medialoader_tls_version", true);
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public int PlayerAbMedialoaderTaskReuseParallelNextThresholdExp() {
        if (C88408Ymq.LJI()) {
            return 0;
        }
        return C00F.LIZ(31744, 0, "player_medialoader_task_reuse_parallel_next_threshold", true);
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public int PlayerAbPreloadSizeOffsetThresholdExp() {
        if (C88408Ymq.LJII()) {
            return 0;
        }
        return C00F.LIZ(31744, 0, "player_preload_size_offset_threshold", true);
    }

    public int PlayerAbSpeedSinkExp() {
        if (C88408Ymq.LJII()) {
            return 0;
        }
        return C00F.LIZ(31744, 0, "speed_monitor_sink", true);
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public int PlayerAbTestSpeedVersionExp() {
        if (C88408Ymq.LJII()) {
            return 2;
        }
        return C00F.LIZ(31744, 2, "player_test_speed_version", true);
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public Boolean PlayerAbUseLastIf403Exp() {
        boolean z = true;
        if (!C88408Ymq.LJII()) {
            z = e1.LIZ(31744, "player_use_last_url_if_403", true, true);
        }
        return Boolean.valueOf(z);
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public int PlayerDataEncryptExperiment() {
        if (C88408Ymq.LJII()) {
            return 1;
        }
        return C00F.LIZ(31744, 1, "player_data_encrpt", true);
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public int PlayerMdlLogEnableExperiment() {
        if (C88408Ymq.LJII()) {
            return 1;
        }
        return C00F.LIZ(31744, 1, "enable_player_mdl_log", true);
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public Boolean PlayerPreloadLazyGetUrlsExperiment() {
        boolean z = true;
        if (!C88408Ymq.LJII()) {
            z = e1.LIZ(31744, "player_preload_lazy_get_urls", true, true);
        }
        return Boolean.valueOf(z);
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public Boolean PreloadLocalCachePathVideoPlayExperiment() {
        boolean z = false;
        if (!C88408Ymq.LJII()) {
            z = e1.LIZ(31744, "is_preload_local_cache_path_video_play_enable", true, false);
        }
        return Boolean.valueOf(z);
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public Boolean UseVideoCacheHttpDnsExperiment() {
        boolean z = true;
        if (!C88408Ymq.LJII()) {
            z = e1.LIZ(31744, "use_video_cache_http_dns", true, false);
        }
        return Boolean.valueOf(z);
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public Boolean VideoCacheAutoAdjustPreloadMaxExperiment() {
        boolean z = true;
        if (!C88408Ymq.LJII()) {
            z = e1.LIZ(31744, "is_video_cache_auto_adust_preload_max", true, true);
        }
        return Boolean.valueOf(z);
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public int VideoCacheLoaderTypeExperiment() {
        if (C88408Ymq.LJII()) {
            return 0;
        }
        return C00F.LIZ(31744, 0, "videocache_loader_type", true);
    }

    public int VideoCacheP2pLevelExperiment() {
        if (C88408Ymq.LJII()) {
            return 0;
        }
        return C00F.LIZ(31744, 0, "videocache_p2p_level", true);
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public int VideoCacheReadBuffersizeExperiment() {
        if (C88408Ymq.LJII()) {
            return FileUtils.BUFFER_SIZE;
        }
        return C00F.LIZ(31744, FileUtils.BUFFER_SIZE, "video_cache_read_buffersize", true);
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public int VideoCacheTTnetPreloadTimeoutExperiment() {
        if (C88408Ymq.LJII()) {
            return 30000;
        }
        return C00F.LIZ(31744, 30000, "videocache_ttnet_preload_timeout", true);
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public int VideoCacheTTnetProxyTimeoutExperiment() {
        if (C88408Ymq.LJII()) {
            return 10000;
        }
        return C00F.LIZ(31744, 10000, "videocache_ttnet_proxy_timeout", true);
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public Boolean VideoCacheWriteAsynchronousExperiment() {
        boolean z = false;
        if (!C88408Ymq.LJII()) {
            z = e1.LIZ(31744, "video_cache_write_asynchronous", true, false);
        }
        return Boolean.valueOf(z);
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public int VideoDownloadSpeedCostTimeExperiment() {
        if (C88408Ymq.LJII()) {
            return 0;
        }
        return C00F.LIZ(31744, 0, "video_download_speed_cost_time", true);
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public int enginePreloaderEnableTTnetLoader() {
        if (C88408Ymq.LJ()) {
            return 0;
        }
        return C00F.LIZ(31744, 0, "enable_ttnet_loader", true);
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public String getPlayerTraceHost() {
        FFL.LJIIIZ().getClass();
        String LJIILJJIL = FFL.LJIILJJIL(31744, "player_medialoader_trace_host", "", true);
        o.LJIIIIZZ(LJIILJJIL, "getInstance().getStringV…TraceHostExp::class.java)");
        return LJIILJJIL;
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public C34542Dh4 getPreloaderExpModel() {
        return getMPreloadExpModel();
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public Boolean VideoCacheMonitorNetStatus() {
        return Boolean.TRUE;
    }
}
