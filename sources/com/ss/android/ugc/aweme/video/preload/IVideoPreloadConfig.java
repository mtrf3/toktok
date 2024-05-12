package com.ss.android.ugc.aweme.video.preload;

import X.EnumC47177IfN;
import X.IXW;
import X.IXY;
import X.IY2;
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
import X.InterfaceC47446Iji;
import X.InterfaceC47471Ik7;
import com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment;
import com.ss.android.ugc.playerkit.simapicommon.model.SimVideoUrlModel;
import java.util.Map;

/* loaded from: classes9.dex */
public interface IVideoPreloadConfig {
    boolean canPreload();

    IY2 createVideoUrlProcessor();

    boolean enableLoadMorePreload();

    boolean forbidBypassCookie();

    InterfaceC47078Idm getAppLog();

    InterfaceC47471Ik7 getCacheHelper();

    IPreloaderExperiment getExperiment();

    InterfaceC47095Ie3 getKVStorageProvider();

    InterfaceC47110IeI getMLServiceSpeedModel();

    InterfaceC47444Ijg getMusicService();

    InterfaceC47412IjA getNetClient();

    int getNetworkRttMs();

    int getNetworkType();

    InterfaceC47446Iji getPlayerCommonParamManager();

    InterfaceC47109IeH getPlayerEventReportService();

    InterfaceC47225Ig9 getPreloadStrategy();

    IXW getProperBitrateForDash(SimVideoUrlModel simVideoUrlModel, InterfaceC46867IaN interfaceC46867IaN, boolean z);

    EnumC47177IfN getProperResolution(String str, InterfaceC46867IaN interfaceC46867IaN);

    InterfaceC47112IeK getQOSSpeedUpService();

    Map<String, String> getRequestHeader(String str);

    IXY getSelectedBitrateForColdBoot(SimVideoUrlModel simVideoUrlModel);

    InterfaceC46841IZx getSensitiveSceneTransmitter();

    InterfaceC47077Idl getSpeedManager();

    InterfaceC47432IjU getStorageManager();

    InterfaceC47094Ie2 getVideoCachePlugin();

    boolean isDashABREnabled();

    boolean isPlayerPreferchCaption();

    boolean isPlayerPreferchTtsAudio();

    boolean isPreloadV3Enabled();

    float playerPreferchCaptionSize();

    float playerPreferchTtsAudioSize();

    boolean useSyncPreloadStyle();
}
