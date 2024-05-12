package X;

import com.bytedance.android.livesdk.livesetting.broadcast.LiveMaxRetainAlogMessageSizeSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveTryModeCountDownThresholdSetting;
import com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment;
import com.ss.android.ugc.aweme.video.preload.model.EnginePreloaderConfig;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.IeN, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C47115IeN implements IPreloaderExperiment {
    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public final int DisableVideocacheLocalServerExperiment() {
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public final boolean EnableDetailNotification() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public final int EnableDownloaderLogExpErrorExperiment() {
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public final boolean EnableGetCDNLogExperiment() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public final boolean EnableTTnetClientInject() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public final /* synthetic */ int EngineEnableMaxFileMemCacheNumExp() {
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public final /* synthetic */ int EngineEnableMaxFileMemCacheSizeExp() {
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public final int EnginePreloaderConcurrentNumExperiment() {
        return 1;
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public final /* bridge */ /* synthetic */ EnginePreloaderConfig EnginePreloaderConfigExperiment() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public final int EnginePreloaderEnableNetworkChangedListenExperiment() {
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public final int EnginePreloaderNetSchedulerBlockAllNetErrorExperiment() {
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public final int EnginePreloaderNetSchedulerBlockDurationExperiment() {
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public final int EnginePreloaderNetSchedulerBlockErrorCountExperiment() {
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public final int EnginePreloaderNetSchedulerEnableExperiment() {
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public final int EnginePreloaderOpenTimeoutExperiment() {
        return 10;
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public final int EnginePreloaderPreloadStrategyExperiment() {
        return 1;
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public final int EnginePreloaderRWTimeoutExperiment() {
        return 10;
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public final int EnginePreloaderStackOrQueueExperiment() {
        return 1;
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public final int EnginePreloaderTlsSessionTimeoutExperiment() {
        return 3600;
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public final int P2pStragetyEnableSyndnsExperiment() {
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public final int P2pStragetyExpiredTimeExperiment() {
        return LiveTryModeCountDownThresholdSetting.DEFAULT;
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public final int P2pStragetyMaxBufferingTimeExperiment() {
        return 300;
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public final int P2pStragetyMaxLeaveWaitTimeExperiment() {
        return 600;
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public final int P2pStragetyMinNetSpeedExperiment() {
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public final int P2pStragetyMinPlayNumberExperiment() {
        return 5;
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public final int P2pStragetyXyLibValueExperiment() {
        return 1;
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public final int PlayUse2UrlExperiment() {
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public final int PlayeAbUserHttp2Exp() {
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public final int PlayerAbABRAlgoExp() {
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public final int PlayerAbABRSpeedPredictAlgoExp() {
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public final int PlayerAbABRSpeedPredictTimeIntervalExp() {
        return LiveMaxRetainAlogMessageSizeSetting.DEFAULT;
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public final int PlayerAbBackupDnsTypeExp() {
        return 2;
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public final int PlayerAbChecksumLevelExp() {
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public final int PlayerAbDashPreloadAudioFirstExp() {
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public final int PlayerAbEnableDebugLogExp() {
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public final int PlayerAbMainDnsDelayTimeExp() {
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public final int PlayerAbMainDnsTypeExp() {
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public final int PlayerAbMediaLoaderCheckPreloadLevelExp() {
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public final int PlayerAbMedialoaderAccessCheckLevelExp() {
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public final int PlayerAbMedialoaderEnableBackupDnsIPExp() {
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public final int PlayerAbMedialoaderEnableBenchmarkExp() {
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public final int PlayerAbMedialoaderEnableDnsLogExp() {
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public final int PlayerAbMedialoaderEnableDnsParallelExp() {
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public final int PlayerAbMedialoaderEnableDnsRefreshExp() {
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public final int PlayerAbMedialoaderEnableFileExtendBuffer() {
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public final int PlayerAbMedialoaderEnableFileRingBuffer() {
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public final int PlayerAbMedialoaderEnablePreconneExp() {
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public final int PlayerAbMedialoaderEnableSpeedCoefficientExp() {
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public final int PlayerAbMedialoaderEnableTLSSessionReuseExp() {
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public final int PlayerAbMedialoaderEnableTaskReuseExp() {
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public final String PlayerAbMedialoaderGoogleDnsHostExp() {
        return "dns.google.com";
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public final int PlayerAbMedialoaderHeaderDataMemCache() {
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public final int PlayerAbMedialoaderIpv4Num() {
        return Integer.MAX_VALUE;
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public final int PlayerAbMedialoaderIpv6Num() {
        return Integer.MAX_VALUE;
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public final int PlayerAbMedialoaderLazyBufferPoolEnableExp() {
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public final String PlayerAbMedialoaderOwnDnsHostExp() {
        return "";
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public final int PlayerAbMedialoaderPreconnectNumExp() {
        return 3;
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public final int PlayerAbMedialoaderTLSVersionExp() {
        return 2;
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public final int PlayerAbMedialoaderTaskReuseParallelNextThresholdExp() {
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public final int PlayerAbPreloadSizeOffsetThresholdExp() {
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public final int PlayerAbTestSpeedVersionExp() {
        return 2;
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public final int PlayerDataEncryptExperiment() {
        return 1;
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public final int PlayerMdlLogEnableExperiment() {
        return 1;
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public final int RingBufferSizeMdlExperiment() {
        return -1;
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public final int UseTTNetExperiment() {
        return 1;
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public final int VideoCacheLoaderTypeExperiment() {
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public final int VideoCacheMaxCacheSizeExperiment() {
        return -1;
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public final int VideoCacheReadBuffersizeExperiment() {
        return FileUtils.BUFFER_SIZE;
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public final int VideoCacheTTnetPreloadTimeoutExperiment() {
        return 30000;
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public final int VideoCacheTTnetProxyTimeoutExperiment() {
        return 10000;
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public final int VideoDownloadSpeedCostTimeExperiment() {
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public final int VideoNetworkSpeedAlgorithmExperiment() {
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public final int VideoSpeedQueueSizeExperiment() {
        return 10;
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public final /* synthetic */ boolean enableMDLInitAsync() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public final /* synthetic */ boolean enableRealTimeSpeedMonitor() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public final /* synthetic */ boolean enableSuperResolution() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public final /* synthetic */ boolean enableUseNewGetCacheMethod() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public final int enginePreloaderEnableTTnetLoader() {
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public final List<C46898Ias> engineStaticOptionList() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public final /* synthetic */ String getBandWidthJsonString() {
        return "";
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public final /* synthetic */ double getBitrateSwitchThreshold() {
        return 0.75d;
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public final /* synthetic */ String getDataLoaderMdlExtensionOpts() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public final /* synthetic */ String getGearStrategyJsonString() {
        return "";
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public final /* synthetic */ String getMDLUA1() {
        return "";
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public final /* synthetic */ String getModuleConfigJsonString() {
        return "";
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public final String getPlayerTraceHost() {
        return "";
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public final /* synthetic */ boolean getUSE_CALLBACK_CACHE_SIZE() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public final int isEnginePreloaderForceUseOKHttp() {
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public final java.util.Map getExCacheDirSizeConfig() {
        return new HashMap();
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public final C34542Dh4 getPreloaderExpModel() {
        return new C34542Dh4();
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public final Boolean CheckVideoCacheRequestHeaderExperiment() {
        return Boolean.TRUE;
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public final Boolean EnablePreloaderPreConnect() {
        return Boolean.FALSE;
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public final Boolean PlayerAbUseLastIf403Exp() {
        return Boolean.TRUE;
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public final Boolean PlayerPreloadLazyGetUrlsExperiment() {
        return Boolean.TRUE;
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public final Boolean PreloadLocalCachePathVideoPlayExperiment() {
        return Boolean.FALSE;
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public final EnumC47317Ihd PreloadTypeExperiment() {
        return EnumC47317Ihd.MediaLoader;
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public final Boolean UseVideoCacheHttpDnsExperiment() {
        return Boolean.FALSE;
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public final Boolean VideoCacheAutoAdjustPreloadMaxExperiment() {
        return Boolean.TRUE;
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public final Boolean VideoCacheMonitorNetStatus() {
        return Boolean.TRUE;
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment
    public final Boolean VideoCacheWriteAsynchronousExperiment() {
        return Boolean.FALSE;
    }
}
