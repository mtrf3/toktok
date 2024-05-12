package com.ss.android.ugc.aweme.video.simkit;

import X.C00F;
import X.C012403c;
import X.C44432HcC;
import X.C46301IFd;
import X.C46633IRx;
import X.C46719IVf;
import X.C46720IVg;
import X.C46721IVh;
import X.C47497IkX;
import X.C55511LqV;
import X.FFL;
import X.IPC;
import X.IS1;
import X.IVF;
import X.IVT;
import X.IW2;
import X.IY4;
import X.IY6;
import X.IY9;
import X.IYB;
import X.IYC;
import X.IYD;
import X.IYE;
import X.IYF;
import X.InterfaceC34939DnT;
import X.InterfaceC46631IRv;
import X.InterfaceC46723IVj;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.simkit.api.ICommonConfig;
import com.ss.android.ugc.aweme.simkit.model.bitrateselect.RateSettingsResponse;
import com.ss.android.ugc.aweme.simkit.model.superresolution.SuperResolutionStrategyConfig;
import com.ss.android.ugc.aweme.simkit.model.superresolution.SuperResolutionStrategyConfigV2;
import com.ss.android.ugc.aweme.video.VideoBitRateABManager;
import com.ss.android.ugc.playerkit.simapicommon.model.SimVideoUrlModel;
import defpackage.e1;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes9.dex */
public class SimKitCommonConfig implements ICommonConfig {
    public IVF mSrListener = new C46301IFd();
    public static final long COLD_BOOT_TIME_POINT = System.currentTimeMillis();
    public static boolean superResolutionStrategyExperimentValueInited = false;
    public static SuperResolutionStrategyConfig superResolutionStrategyExperimentValue = null;

    @Override // com.ss.android.ugc.aweme.simkit.api.ICommonConfig
    public /* bridge */ /* synthetic */ List getColdBootVideoUrlHooks() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.simkit.api.ICommonConfig
    public /* bridge */ /* synthetic */ float getSrTimeParam() {
        return 1.0f;
    }

    @Override // com.ss.android.ugc.aweme.simkit.api.ICommonConfig
    public /* bridge */ /* synthetic */ boolean simKitStrategyEnabled() {
        return false;
    }

    public static SuperResolutionStrategyConfig getSuperResolutionStrategyExperimentValue() {
        if (C44432HcC.LJLJI) {
            if (!superResolutionStrategyExperimentValueInited) {
                try {
                    FFL.LJIIIZ().getClass();
                    superResolutionStrategyExperimentValue = (SuperResolutionStrategyConfig) FFL.LJIJ(true, "super_resolution_strategy", 31744, SuperResolutionStrategyConfig.class, null);
                } catch (Throwable unused) {
                    superResolutionStrategyExperimentValue = null;
                }
                superResolutionStrategyExperimentValueInited = true;
            }
            return superResolutionStrategyExperimentValue;
        }
        try {
            FFL.LJIIIZ().getClass();
            return (SuperResolutionStrategyConfig) FFL.LJIJ(true, "super_resolution_strategy", 31744, SuperResolutionStrategyConfig.class, null);
        } catch (Throwable unused2) {
            return null;
        }
    }

    public int getBitrateBusinessType() {
        return C00F.LIZ(31744, 0, "bitrate_modularization_experiment", true);
    }

    @Override // com.ss.android.ugc.aweme.simkit.api.ICommonConfig
    public IPC getCommonParamsProcessor() {
        return new C46720IVg();
    }

    @Override // com.ss.android.ugc.aweme.simkit.api.ICommonConfig
    public int getDefaultCDNTimeoutTime() {
        return (int) C012403c.LIZIZ(31744, 2400000L, "cdn_url_timeout_time");
    }

    @Override // com.ss.android.ugc.aweme.simkit.api.ICommonConfig
    public RateSettingsResponse getDefaultRateSettingsResponse() {
        VideoBitRateABManager videoBitRateABManager = VideoBitRateABManager.LJFF;
        if (videoBitRateABManager.LJ == null) {
            videoBitRateABManager.LJFF();
        }
        return videoBitRateABManager.LJ;
    }

    public int getPreloaderType() {
        if (C00F.LIZ(31744, 2, "preloader_type", true) != 0) {
            return 1;
        }
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.simkit.api.ICommonConfig
    public RateSettingsResponse getRateSettingsResponse() {
        return VideoBitRateABManager.LJFF.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.simkit.api.ICommonConfig
    public SuperResolutionStrategyConfigV2 getSuperResolutionStrategyConfigV2() {
        return (SuperResolutionStrategyConfigV2) IS1.LIZ.getValue();
    }

    @Override // com.ss.android.ugc.aweme.simkit.api.ICommonConfig
    public IW2 getVideoUrlHookHook() {
        return new C46719IVf();
    }

    @Override // com.ss.android.ugc.aweme.simkit.api.ICommonConfig
    public List<IY4> getVideoUrlHooks() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(IYD.LIZIZ);
        arrayList.add(new IY6());
        arrayList.add(new IY9());
        arrayList.add(IYB.LIZIZ);
        arrayList.add(IYE.LIZIZ);
        arrayList.add(IYC.LIZIZ);
        arrayList.add(IYF.LIZIZ);
        return arrayList;
    }

    @Override // com.ss.android.ugc.aweme.simkit.api.ICommonConfig
    public boolean isUseLastNetworkSpeed() {
        return e1.LIZ(31744, "is_record_last_network_speed_enabled", true, true);
    }

    @Override // com.ss.android.ugc.aweme.simkit.api.ICommonConfig
    public double getBitrateSwitchThreshold() {
        FFL.LJIIIZ().getClass();
        return FFL.LJII(31744, "bitrate_switch_threshold", 0.75d);
    }

    @Override // com.ss.android.ugc.aweme.simkit.api.ICommonConfig
    public int getLastNetworkSpeed() {
        return SharePrefCache.inst().getLastUsableNetworkSpeed().LIZ().intValue();
    }

    public double getSpeedInBitPerSec() {
        return C47497IkX.LJ().getSpeed();
    }

    @Override // com.ss.android.ugc.aweme.simkit.api.ICommonConfig
    public SuperResolutionStrategyConfig getSuperResolutionStrategyConfig() {
        return getSuperResolutionStrategyExperimentValue();
    }

    public InterfaceC46723IVj getAutoBitrateSetStrategy() {
        return C46721IVh.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.simkit.api.ICommonConfig
    public IVF getForceSuperResolutionListener() {
        return this.mSrListener;
    }

    @Override // com.ss.android.ugc.aweme.simkit.api.ICommonConfig
    public InterfaceC46631IRv getSuperResolutionStrategy() {
        return C46633IRx.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.simkit.api.ICommonConfig
    public boolean checkIsBytevc1InCache(SimVideoUrlModel simVideoUrlModel) {
        if (simVideoUrlModel != null) {
            return simVideoUrlModel.isBytevc1();
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.simkit.api.ICommonConfig
    public String getLocalVideoPath(SimVideoUrlModel simVideoUrlModel) {
        if (InterfaceC34939DnT.LIZ && simVideoUrlModel != null) {
            String LIZ = IVT.LIZ(simVideoUrlModel.getSourceId());
            if (IVT.LIZIZ(LIZ)) {
                return LIZ;
            }
            return null;
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.simkit.api.ICommonConfig
    public boolean isSkipSelectBitrate(SimVideoUrlModel simVideoUrlModel) {
        if (InterfaceC34939DnT.LIZ && simVideoUrlModel != null && IVT.LIZIZ(IVT.LIZ(simVideoUrlModel.getSourceId()))) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.simkit.api.ICommonConfig
    public boolean onPreGetProperBitrate(SimVideoUrlModel simVideoUrlModel) {
        if (!TextUtils.isEmpty(C55511LqV.LJI(simVideoUrlModel.getSourceId(), !TextUtils.isEmpty(simVideoUrlModel.getaK())))) {
            return true;
        }
        return false;
    }

    public void setInitialSpeed(double d) {
        C47497IkX.LJ().LIZIZ(d);
    }
}
