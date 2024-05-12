package X;

import com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig;
import com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment;
import com.ss.android.ugc.playerkit.simapicommon.model.SimVideoUrlModel;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.IjL, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C47423IjL implements IVideoPreloadConfig {
    public static final C47423IjL LIZ = new C47423IjL();

    @Override // com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public final boolean canPreload() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public final /* synthetic */ boolean enableLoadMorePreload() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public final /* synthetic */ boolean forbidBypassCookie() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public final /* synthetic */ InterfaceC47095Ie3 getKVStorageProvider() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public final /* synthetic */ int getNetworkRttMs() {
        return -1;
    }

    @Override // com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public final /* synthetic */ int getNetworkType() {
        return -1;
    }

    @Override // com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public final IXW getProperBitrateForDash(SimVideoUrlModel simVideoUrlModel, InterfaceC46867IaN interfaceC46867IaN, boolean z) {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public final InterfaceC47077Idl getSpeedManager() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public final boolean isDashABREnabled() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public final boolean isPlayerPreferchCaption() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public final boolean isPlayerPreferchTtsAudio() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public final boolean isPreloadV3Enabled() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public final float playerPreferchCaptionSize() {
        return 0.0f;
    }

    @Override // com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public final float playerPreferchTtsAudioSize() {
        return 0.0f;
    }

    @Override // com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public final /* synthetic */ boolean useSyncPreloadStyle() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public final IPreloaderExperiment getExperiment() {
        return new C47115IeN();
    }

    @Override // com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public final InterfaceC47225Ig9 getPreloadStrategy() {
        return new C47236IgK();
    }

    @Override // com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public final InterfaceC47112IeK getQOSSpeedUpService() {
        return new C47437IjZ(this);
    }

    @Override // com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public final IY2 createVideoUrlProcessor() {
        return IYS.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public final InterfaceC47078Idm getAppLog() {
        return C47431IjT.LJLIL;
    }

    @Override // com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public final InterfaceC47471Ik7 getCacheHelper() {
        return C47439Ijb.LJLIL;
    }

    @Override // com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public final InterfaceC47110IeI getMLServiceSpeedModel() {
        return C47435IjX.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public final InterfaceC47444Ijg getMusicService() {
        return C47440Ijc.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public final InterfaceC47412IjA getNetClient() {
        return C47417IjF.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public final InterfaceC47446Iji getPlayerCommonParamManager() {
        return C47438Ija.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public final InterfaceC47109IeH getPlayerEventReportService() {
        return C47441Ijd.LJLIL;
    }

    @Override // com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public final InterfaceC46841IZx getSensitiveSceneTransmitter() {
        return C47443Ijf.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public final InterfaceC47432IjU getStorageManager() {
        return C47425IjN.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public final InterfaceC47094Ie2 getVideoCachePlugin() {
        return C47442Ije.LJLIL;
    }

    @Override // com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public final java.util.Map<String, String> getRequestHeader(String str) {
        return new HashMap();
    }

    @Override // com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public final IXY getSelectedBitrateForColdBoot(SimVideoUrlModel model) {
        o.LJIIIZ(model, "model");
        return new IXY();
    }

    @Override // com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public final EnumC47177IfN getProperResolution(String str, InterfaceC46867IaN interfaceC46867IaN) {
        return EnumC47177IfN.Undefine;
    }
}
