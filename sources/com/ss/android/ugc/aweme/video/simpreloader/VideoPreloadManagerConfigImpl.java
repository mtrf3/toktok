package com.ss.android.ugc.aweme.video.simpreloader;

import X.C00F;
import X.C16880lQ;
import X.C1DG;
import X.C1O1;
import X.C32151Nz;
import X.C33839DPv;
import X.C36152EGu;
import X.C46104I7o;
import X.C46790IXy;
import X.C47235IgJ;
import X.C47409Ij7;
import X.C47424IjM;
import X.C47426IjO;
import X.C47433IjV;
import X.C47434IjW;
import X.C47437IjZ;
import X.C54841Lfh;
import X.C62819Ol5;
import X.C77321UWf;
import X.DZI;
import X.EnumC47177IfN;
import X.FFL;
import X.IXW;
import X.IXY;
import X.IY2;
import X.IYK;
import X.InterfaceC46841IZx;
import X.InterfaceC46867IaN;
import X.InterfaceC47077Idl;
import X.InterfaceC47078Idm;
import X.InterfaceC47094Ie2;
import X.InterfaceC47095Ie3;
import X.InterfaceC47109IeH;
import X.InterfaceC47110IeI;
import X.InterfaceC47112IeK;
import X.InterfaceC47225Ig9;
import X.InterfaceC47412IjA;
import X.InterfaceC47432IjU;
import X.InterfaceC47444Ijg;
import X.InterfaceC47445Ijh;
import X.InterfaceC47446Iji;
import X.InterfaceC47471Ik7;
import X.J8V;
import com.ss.android.ugc.aweme.app.AwemeApplicationServiceImpl;
import com.ss.android.ugc.aweme.player.sdk.api.IPortraitService;
import com.ss.android.ugc.aweme.video.VideoBitRateABManager;
import com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig;
import com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment;
import com.ss.android.ugc.playerkit.simapicommon.model.SimVideoUrlModel;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes9.dex */
public class VideoPreloadManagerConfigImpl implements IVideoPreloadConfig {
    @Override // com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public /* bridge */ /* synthetic */ IY2 createVideoUrlProcessor() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public /* bridge */ /* synthetic */ boolean enableLoadMorePreload() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public boolean forbidBypassCookie() {
        return true;
    }

    public /* bridge */ /* synthetic */ int getBitrateQuality() {
        return 1;
    }

    @Override // com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public /* bridge */ /* synthetic */ InterfaceC47095Ie3 getKVStorageProvider() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public /* bridge */ /* synthetic */ int getNetworkRttMs() {
        return -1;
    }

    @Override // com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public /* bridge */ /* synthetic */ int getNetworkType() {
        return -1;
    }

    public /* bridge */ /* synthetic */ InterfaceC47445Ijh getPlayerPgoPlugin() {
        return null;
    }

    public /* bridge */ /* synthetic */ IPortraitService getPortraitService() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public /* bridge */ /* synthetic */ IXY getSelectedBitrateForColdBoot(SimVideoUrlModel simVideoUrlModel) {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public /* bridge */ /* synthetic */ InterfaceC46841IZx getSensitiveSceneTransmitter() {
        return null;
    }

    public /* bridge */ /* synthetic */ boolean isUseLastNetworkSpeed() {
        return true;
    }

    public /* bridge */ /* synthetic */ String preloadConfigJsonInScene() {
        return null;
    }

    public /* bridge */ /* synthetic */ boolean strategyCenterEnabled() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public InterfaceC47078Idm getAppLog() {
        return new C32151Nz();
    }

    @Override // com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public InterfaceC47471Ik7 getCacheHelper() {
        return new C77321UWf();
    }

    @Override // com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public IPreloaderExperiment getExperiment() {
        return new PreloaderExperiment();
    }

    @Override // com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public InterfaceC47110IeI getMLServiceSpeedModel() {
        return new C47426IjO();
    }

    @Override // com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public InterfaceC47444Ijg getMusicService() {
        return new C47433IjV();
    }

    @Override // com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public InterfaceC47412IjA getNetClient() {
        return new C47409Ij7(C46104I7o.LJIILL(C16880lQ.LLLZ("https://%s/", new Object[]{"tiktokv.com"})));
    }

    @Override // com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public InterfaceC47446Iji getPlayerCommonParamManager() {
        return new C47434IjW();
    }

    @Override // com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public InterfaceC47109IeH getPlayerEventReportService() {
        return new C62819Ol5();
    }

    @Override // com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public InterfaceC47225Ig9 getPreloadStrategy() {
        return new C47235IgJ(this);
    }

    @Override // com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public InterfaceC47112IeK getQOSSpeedUpService() {
        return new C47437IjZ(this);
    }

    @Override // com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public InterfaceC47077Idl getSpeedManager() {
        return new C1O1();
    }

    @Override // com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public InterfaceC47432IjU getStorageManager() {
        return new C47424IjM();
    }

    @Override // com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public InterfaceC47094Ie2 getVideoCachePlugin() {
        return new C54841Lfh();
    }

    @Override // com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public boolean isDashABREnabled() {
        if (J8V.LJLILLLLZI == null) {
            boolean z = false;
            if (C00F.LIZ(31744, 0, "player_abr_enable", true) == 1) {
                z = true;
            }
            J8V.LJLILLLLZI = Boolean.valueOf(z);
        }
        return J8V.LJLILLLLZI.booleanValue();
    }

    @Override // com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public boolean isPlayerPreferchCaption() {
        if (C00F.LIZ(31744, 0, "player_prefetch_cla_caption", true) != 1) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public boolean isPlayerPreferchTtsAudio() {
        if (C00F.LIZ(31744, 0, "player_preferch_tts_audio", true) != 1) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public boolean canPreload() {
        if (!AwemeApplicationServiceImpl.LIZ().isAppBackground() || C00F.LIZ(31744, 1, "enable_preload_background", true) == 1) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public boolean isPreloadV3Enabled() {
        return J8V.LJIILIIL();
    }

    @Override // com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public float playerPreferchCaptionSize() {
        FFL.LJIIIZ().getClass();
        return FFL.LJIIIIZZ(31744, "player_prefetch_cla_caption_size", 0.0f);
    }

    @Override // com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public float playerPreferchTtsAudioSize() {
        FFL.LJIIIZ().getClass();
        return FFL.LJIIIIZZ(31744, "player_preferch_tts_audio_size", 0.0f);
    }

    @Override // com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public boolean useSyncPreloadStyle() {
        if (C36152EGu.LJ()) {
            return ((Boolean) C33839DPv.LIZ.getValue()).booleanValue();
        }
        return DZI.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public Map getRequestHeader(String str) {
        return new HashMap();
    }

    @Override // com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public EnumC47177IfN getProperResolution(String str, InterfaceC46867IaN interfaceC46867IaN) {
        if (VideoBitRateABManager.LJFF.LJ()) {
            C1DG.LIZ().LJFF().getClass();
            return IYK.LIZ.LJ(str, interfaceC46867IaN).LIZJ;
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig
    public IXW getProperBitrateForDash(SimVideoUrlModel simVideoUrlModel, InterfaceC46867IaN interfaceC46867IaN, boolean z) {
        if (VideoBitRateABManager.LJFF.LJ()) {
            C1DG.LIZ().LJFF();
            return C46790IXy.LIZ(simVideoUrlModel, interfaceC46867IaN, z);
        }
        return null;
    }
}
