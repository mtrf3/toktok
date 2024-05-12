package X;

import com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig;
import com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment;
import com.ss.android.ugc.playerkit.simapicommon.model.SimVideoUrlModel;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.IjJ, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C47421IjJ implements IVideoPreloadConfig {
    public final IVideoPreloadConfig LIZ;

    @Override // com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public final /* synthetic */ boolean enableLoadMorePreload() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public final boolean canPreload() {
        Boolean valueOf;
        IVideoPreloadConfig iVideoPreloadConfig = this.LIZ;
        if (iVideoPreloadConfig == null || (valueOf = Boolean.valueOf(iVideoPreloadConfig.canPreload())) == null) {
            return true;
        }
        return valueOf.booleanValue();
    }

    @Override // com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public final IY2 createVideoUrlProcessor() {
        IY2 createVideoUrlProcessor;
        IVideoPreloadConfig iVideoPreloadConfig = this.LIZ;
        if (iVideoPreloadConfig == null || (createVideoUrlProcessor = iVideoPreloadConfig.createVideoUrlProcessor()) == null) {
            return IYS.LIZ;
        }
        return createVideoUrlProcessor;
    }

    @Override // com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public final boolean forbidBypassCookie() {
        IVideoPreloadConfig iVideoPreloadConfig = this.LIZ;
        if (iVideoPreloadConfig == null) {
            return true;
        }
        return iVideoPreloadConfig.forbidBypassCookie();
    }

    @Override // com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public final InterfaceC47078Idm getAppLog() {
        InterfaceC47078Idm appLog;
        IVideoPreloadConfig iVideoPreloadConfig = this.LIZ;
        if (iVideoPreloadConfig == null || (appLog = iVideoPreloadConfig.getAppLog()) == null) {
            return C47431IjT.LJLIL;
        }
        return appLog;
    }

    @Override // com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public final InterfaceC47471Ik7 getCacheHelper() {
        InterfaceC47471Ik7 cacheHelper;
        IVideoPreloadConfig iVideoPreloadConfig = this.LIZ;
        if (iVideoPreloadConfig == null || (cacheHelper = iVideoPreloadConfig.getCacheHelper()) == null) {
            return C47439Ijb.LJLIL;
        }
        return cacheHelper;
    }

    @Override // com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public final IPreloaderExperiment getExperiment() {
        IPreloaderExperiment experiment;
        IVideoPreloadConfig iVideoPreloadConfig = this.LIZ;
        if (iVideoPreloadConfig == null || (experiment = iVideoPreloadConfig.getExperiment()) == null) {
            return new C47115IeN();
        }
        return experiment;
    }

    @Override // com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public final InterfaceC47095Ie3 getKVStorageProvider() {
        IVideoPreloadConfig iVideoPreloadConfig = this.LIZ;
        if (iVideoPreloadConfig == null) {
            return null;
        }
        iVideoPreloadConfig.getKVStorageProvider();
        return null;
    }

    @Override // com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public final InterfaceC47110IeI getMLServiceSpeedModel() {
        InterfaceC47110IeI mLServiceSpeedModel;
        IVideoPreloadConfig iVideoPreloadConfig = this.LIZ;
        if (iVideoPreloadConfig == null || (mLServiceSpeedModel = iVideoPreloadConfig.getMLServiceSpeedModel()) == null) {
            return C47435IjX.LIZ;
        }
        return mLServiceSpeedModel;
    }

    @Override // com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public final InterfaceC47444Ijg getMusicService() {
        InterfaceC47444Ijg musicService;
        IVideoPreloadConfig iVideoPreloadConfig = this.LIZ;
        if (iVideoPreloadConfig == null || (musicService = iVideoPreloadConfig.getMusicService()) == null) {
            return C47440Ijc.LIZ;
        }
        return musicService;
    }

    @Override // com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public final InterfaceC47412IjA getNetClient() {
        InterfaceC47412IjA netClient;
        IVideoPreloadConfig iVideoPreloadConfig = this.LIZ;
        if (iVideoPreloadConfig == null || (netClient = iVideoPreloadConfig.getNetClient()) == null) {
            return C47417IjF.LIZ;
        }
        return netClient;
    }

    @Override // com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public final int getNetworkRttMs() {
        IVideoPreloadConfig iVideoPreloadConfig = this.LIZ;
        if (iVideoPreloadConfig == null) {
            return -1;
        }
        return iVideoPreloadConfig.getNetworkRttMs();
    }

    @Override // com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public final int getNetworkType() {
        IVideoPreloadConfig iVideoPreloadConfig = this.LIZ;
        if (iVideoPreloadConfig == null) {
            return -1;
        }
        return iVideoPreloadConfig.getNetworkType();
    }

    @Override // com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public final InterfaceC47446Iji getPlayerCommonParamManager() {
        InterfaceC47446Iji playerCommonParamManager;
        IVideoPreloadConfig iVideoPreloadConfig = this.LIZ;
        if (iVideoPreloadConfig == null || (playerCommonParamManager = iVideoPreloadConfig.getPlayerCommonParamManager()) == null) {
            return C47438Ija.LIZ;
        }
        return playerCommonParamManager;
    }

    @Override // com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public final InterfaceC47109IeH getPlayerEventReportService() {
        InterfaceC47109IeH playerEventReportService;
        IVideoPreloadConfig iVideoPreloadConfig = this.LIZ;
        if (iVideoPreloadConfig == null || (playerEventReportService = iVideoPreloadConfig.getPlayerEventReportService()) == null) {
            return C47441Ijd.LJLIL;
        }
        return playerEventReportService;
    }

    @Override // com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public final InterfaceC47225Ig9 getPreloadStrategy() {
        return new C47235IgJ(this);
    }

    @Override // com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public final InterfaceC47112IeK getQOSSpeedUpService() {
        InterfaceC47112IeK qOSSpeedUpService;
        IVideoPreloadConfig iVideoPreloadConfig = this.LIZ;
        if (iVideoPreloadConfig == null || (qOSSpeedUpService = iVideoPreloadConfig.getQOSSpeedUpService()) == null) {
            return new C47437IjZ(C47423IjL.LIZ);
        }
        return qOSSpeedUpService;
    }

    @Override // com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public final InterfaceC46841IZx getSensitiveSceneTransmitter() {
        InterfaceC46841IZx sensitiveSceneTransmitter;
        IVideoPreloadConfig iVideoPreloadConfig = this.LIZ;
        if (iVideoPreloadConfig == null || (sensitiveSceneTransmitter = iVideoPreloadConfig.getSensitiveSceneTransmitter()) == null) {
            return C47443Ijf.LIZ;
        }
        return sensitiveSceneTransmitter;
    }

    @Override // com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public final InterfaceC47077Idl getSpeedManager() {
        InterfaceC47077Idl speedManager;
        IVideoPreloadConfig iVideoPreloadConfig = this.LIZ;
        if (iVideoPreloadConfig == null || (speedManager = iVideoPreloadConfig.getSpeedManager()) == null) {
            return null;
        }
        return speedManager;
    }

    @Override // com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public final InterfaceC47432IjU getStorageManager() {
        InterfaceC47432IjU storageManager;
        IVideoPreloadConfig iVideoPreloadConfig = this.LIZ;
        if (iVideoPreloadConfig == null || (storageManager = iVideoPreloadConfig.getStorageManager()) == null) {
            return C47425IjN.LIZ;
        }
        return storageManager;
    }

    @Override // com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public final InterfaceC47094Ie2 getVideoCachePlugin() {
        InterfaceC47094Ie2 videoCachePlugin;
        IVideoPreloadConfig iVideoPreloadConfig = this.LIZ;
        if (iVideoPreloadConfig == null || (videoCachePlugin = iVideoPreloadConfig.getVideoCachePlugin()) == null) {
            return C47442Ije.LJLIL;
        }
        return videoCachePlugin;
    }

    @Override // com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public final boolean isDashABREnabled() {
        Boolean valueOf;
        IVideoPreloadConfig iVideoPreloadConfig = this.LIZ;
        if (iVideoPreloadConfig == null || (valueOf = Boolean.valueOf(iVideoPreloadConfig.isDashABREnabled())) == null) {
            return false;
        }
        return valueOf.booleanValue();
    }

    @Override // com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public final boolean isPlayerPreferchCaption() {
        Boolean valueOf;
        IVideoPreloadConfig iVideoPreloadConfig = this.LIZ;
        if (iVideoPreloadConfig == null || (valueOf = Boolean.valueOf(iVideoPreloadConfig.isPlayerPreferchCaption())) == null) {
            return false;
        }
        return valueOf.booleanValue();
    }

    @Override // com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public final boolean isPlayerPreferchTtsAudio() {
        Boolean valueOf;
        IVideoPreloadConfig iVideoPreloadConfig = this.LIZ;
        if (iVideoPreloadConfig == null || (valueOf = Boolean.valueOf(iVideoPreloadConfig.isPlayerPreferchTtsAudio())) == null) {
            return false;
        }
        return valueOf.booleanValue();
    }

    @Override // com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public final boolean isPreloadV3Enabled() {
        Boolean valueOf;
        IVideoPreloadConfig iVideoPreloadConfig = this.LIZ;
        if (iVideoPreloadConfig == null || (valueOf = Boolean.valueOf(iVideoPreloadConfig.isPreloadV3Enabled())) == null) {
            return false;
        }
        return valueOf.booleanValue();
    }

    @Override // com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public final float playerPreferchCaptionSize() {
        Float valueOf;
        IVideoPreloadConfig iVideoPreloadConfig = this.LIZ;
        if (iVideoPreloadConfig == null || (valueOf = Float.valueOf(iVideoPreloadConfig.playerPreferchCaptionSize())) == null) {
            return 0.0f;
        }
        return valueOf.floatValue();
    }

    @Override // com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public final float playerPreferchTtsAudioSize() {
        Float valueOf;
        IVideoPreloadConfig iVideoPreloadConfig = this.LIZ;
        if (iVideoPreloadConfig == null || (valueOf = Float.valueOf(iVideoPreloadConfig.playerPreferchTtsAudioSize())) == null) {
            return 0.0f;
        }
        return valueOf.floatValue();
    }

    @Override // com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public final boolean useSyncPreloadStyle() {
        Boolean valueOf;
        IVideoPreloadConfig iVideoPreloadConfig = this.LIZ;
        if (iVideoPreloadConfig == null || (valueOf = Boolean.valueOf(iVideoPreloadConfig.useSyncPreloadStyle())) == null) {
            return false;
        }
        return valueOf.booleanValue();
    }

    public C47421IjJ(IVideoPreloadConfig iVideoPreloadConfig) {
        this.LIZ = iVideoPreloadConfig;
    }

    @Override // com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public final java.util.Map<String, String> getRequestHeader(String str) {
        java.util.Map<String, String> requestHeader;
        IVideoPreloadConfig iVideoPreloadConfig = this.LIZ;
        if (iVideoPreloadConfig == null || (requestHeader = iVideoPreloadConfig.getRequestHeader(str)) == null) {
            return new HashMap();
        }
        return requestHeader;
    }

    @Override // com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public final IXY getSelectedBitrateForColdBoot(SimVideoUrlModel model) {
        IXY selectedBitrateForColdBoot;
        o.LJIIIZ(model, "model");
        IVideoPreloadConfig iVideoPreloadConfig = this.LIZ;
        if (iVideoPreloadConfig == null || (selectedBitrateForColdBoot = iVideoPreloadConfig.getSelectedBitrateForColdBoot(model)) == null) {
            return C47423IjL.LIZ.getSelectedBitrateForColdBoot(model);
        }
        return selectedBitrateForColdBoot;
    }

    @Override // com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public final EnumC47177IfN getProperResolution(String str, InterfaceC46867IaN interfaceC46867IaN) {
        EnumC47177IfN properResolution;
        IVideoPreloadConfig iVideoPreloadConfig = this.LIZ;
        if (iVideoPreloadConfig == null || (properResolution = iVideoPreloadConfig.getProperResolution(str, interfaceC46867IaN)) == null) {
            return EnumC47177IfN.Undefine;
        }
        return properResolution;
    }

    @Override // com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public final IXW getProperBitrateForDash(SimVideoUrlModel simVideoUrlModel, InterfaceC46867IaN interfaceC46867IaN, boolean z) {
        IXW properBitrateForDash;
        IVideoPreloadConfig iVideoPreloadConfig = this.LIZ;
        if (iVideoPreloadConfig == null || (properBitrateForDash = iVideoPreloadConfig.getProperBitrateForDash(simVideoUrlModel, interfaceC46867IaN, z)) == null) {
            return null;
        }
        return properBitrateForDash;
    }
}
