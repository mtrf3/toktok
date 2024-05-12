package com.ss.android.ugc.aweme.simkit.api;

import X.IPC;
import X.IVF;
import X.IW2;
import X.IY4;
import X.InterfaceC46631IRv;
import com.ss.android.ugc.aweme.simkit.model.bitrateselect.RateSettingsResponse;
import com.ss.android.ugc.aweme.simkit.model.superresolution.SuperResolutionStrategyConfig;
import com.ss.android.ugc.aweme.simkit.model.superresolution.SuperResolutionStrategyConfigV2;
import com.ss.android.ugc.playerkit.simapicommon.model.SimVideoUrlModel;
import java.util.List;

/* loaded from: classes9.dex */
public interface ICommonConfig {
    boolean checkIsBytevc1InCache(SimVideoUrlModel simVideoUrlModel);

    double getBitrateSwitchThreshold();

    List<IY4> getColdBootVideoUrlHooks();

    IPC getCommonParamsProcessor();

    int getDefaultCDNTimeoutTime();

    RateSettingsResponse getDefaultRateSettingsResponse();

    IVF getForceSuperResolutionListener();

    int getLastNetworkSpeed();

    String getLocalVideoPath(SimVideoUrlModel simVideoUrlModel);

    RateSettingsResponse getRateSettingsResponse();

    float getSrTimeParam();

    InterfaceC46631IRv getSuperResolutionStrategy();

    SuperResolutionStrategyConfig getSuperResolutionStrategyConfig();

    SuperResolutionStrategyConfigV2 getSuperResolutionStrategyConfigV2();

    IW2 getVideoUrlHookHook();

    List<IY4> getVideoUrlHooks();

    boolean isSkipSelectBitrate(SimVideoUrlModel simVideoUrlModel);

    boolean isUseLastNetworkSpeed();

    boolean onPreGetProperBitrate(SimVideoUrlModel simVideoUrlModel);

    boolean simKitStrategyEnabled();
}
