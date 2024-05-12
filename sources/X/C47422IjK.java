package X;

import com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig;
import com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment;
import com.ss.android.ugc.playerkit.simapicommon.model.SimVideoUrlModel;
import kotlin.jvm.internal.o;

/* renamed from: X.IjK, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C47422IjK implements IVideoPreloadConfig {
    public final IVideoPreloadConfig LIZ;

    @Override // com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public final boolean canPreload() {
        return this.LIZ.canPreload();
    }

    @Override // com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public final InterfaceC47078Idm getAppLog() {
        return this.LIZ.getAppLog();
    }

    @Override // com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public final InterfaceC47471Ik7 getCacheHelper() {
        return this.LIZ.getCacheHelper();
    }

    @Override // com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public final IPreloaderExperiment getExperiment() {
        return this.LIZ.getExperiment();
    }

    @Override // com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public final InterfaceC47110IeI getMLServiceSpeedModel() {
        return this.LIZ.getMLServiceSpeedModel();
    }

    @Override // com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public final InterfaceC47444Ijg getMusicService() {
        return this.LIZ.getMusicService();
    }

    @Override // com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public final InterfaceC47412IjA getNetClient() {
        return this.LIZ.getNetClient();
    }

    @Override // com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public final InterfaceC47446Iji getPlayerCommonParamManager() {
        return this.LIZ.getPlayerCommonParamManager();
    }

    @Override // com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public final InterfaceC47109IeH getPlayerEventReportService() {
        return this.LIZ.getPlayerEventReportService();
    }

    @Override // com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public final IXW getProperBitrateForDash(SimVideoUrlModel simVideoUrlModel, InterfaceC46867IaN interfaceC46867IaN, boolean z) {
        return this.LIZ.getProperBitrateForDash(simVideoUrlModel, interfaceC46867IaN, z);
    }

    @Override // com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public final EnumC47177IfN getProperResolution(String str, InterfaceC46867IaN interfaceC46867IaN) {
        return this.LIZ.getProperResolution(str, interfaceC46867IaN);
    }

    @Override // com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public final InterfaceC47077Idl getSpeedManager() {
        return this.LIZ.getSpeedManager();
    }

    @Override // com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public final InterfaceC47432IjU getStorageManager() {
        return this.LIZ.getStorageManager();
    }

    @Override // com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public final InterfaceC47094Ie2 getVideoCachePlugin() {
        return this.LIZ.getVideoCachePlugin();
    }

    @Override // com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public final boolean isDashABREnabled() {
        return this.LIZ.isDashABREnabled();
    }

    @Override // com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public final boolean isPreloadV3Enabled() {
        return this.LIZ.isPreloadV3Enabled();
    }

    @Override // com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public final IY2 createVideoUrlProcessor() {
        IY2 createVideoUrlProcessor = this.LIZ.createVideoUrlProcessor();
        if (createVideoUrlProcessor != null) {
            return createVideoUrlProcessor;
        }
        return C46733IVt.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public final boolean enableLoadMorePreload() {
        return this.LIZ.enableLoadMorePreload();
    }

    @Override // com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public final boolean forbidBypassCookie() {
        return this.LIZ.forbidBypassCookie();
    }

    @Override // com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public final InterfaceC47095Ie3 getKVStorageProvider() {
        this.LIZ.getKVStorageProvider();
        return null;
    }

    @Override // com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public final int getNetworkRttMs() {
        return this.LIZ.getNetworkRttMs();
    }

    @Override // com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public final int getNetworkType() {
        return this.LIZ.getNetworkType();
    }

    @Override // com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public final InterfaceC47225Ig9 getPreloadStrategy() {
        InterfaceC47225Ig9 preloadStrategy = this.LIZ.getPreloadStrategy();
        o.LJIIIIZZ(preloadStrategy, "iSimPreloaderConfig.preloadStrategy");
        return preloadStrategy;
    }

    @Override // com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public final InterfaceC47112IeK getQOSSpeedUpService() {
        InterfaceC47112IeK qOSSpeedUpService = this.LIZ.getQOSSpeedUpService();
        o.LJIIIIZZ(qOSSpeedUpService, "iSimPreloaderConfig.qosSpeedUpService");
        return qOSSpeedUpService;
    }

    @Override // com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public final InterfaceC46841IZx getSensitiveSceneTransmitter() {
        return this.LIZ.getSensitiveSceneTransmitter();
    }

    @Override // com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public final boolean isPlayerPreferchCaption() {
        return this.LIZ.isPlayerPreferchCaption();
    }

    @Override // com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public final boolean isPlayerPreferchTtsAudio() {
        return this.LIZ.isPlayerPreferchTtsAudio();
    }

    @Override // com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public final float playerPreferchCaptionSize() {
        return this.LIZ.playerPreferchCaptionSize();
    }

    @Override // com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public final float playerPreferchTtsAudioSize() {
        return this.LIZ.playerPreferchTtsAudioSize();
    }

    @Override // com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public final boolean useSyncPreloadStyle() {
        return this.LIZ.useSyncPreloadStyle();
    }

    public C47422IjK(IVideoPreloadConfig iSimPreloaderConfig) {
        o.LJIIIZ(iSimPreloaderConfig, "iSimPreloaderConfig");
        this.LIZ = iSimPreloaderConfig;
    }

    @Override // com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public final java.util.Map<String, String> getRequestHeader(String str) {
        return this.LIZ.getRequestHeader(str);
    }

    @Override // com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public final IXY getSelectedBitrateForColdBoot(SimVideoUrlModel model) {
        o.LJIIIZ(model, "model");
        return C46789IXx.LIZ(model, null);
    }
}
