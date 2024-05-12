package com.ss.android.ugc.aweme.simkit;

import X.InterfaceC46991IcN;
import com.ss.android.ugc.aweme.simkit.api.ICommonConfig;
import com.ss.android.ugc.aweme.simkit.api.IDimensionBitrateCurveConfig;
import com.ss.android.ugc.aweme.simkit.api.IDimensionBitrateFilterConfig;
import com.ss.android.ugc.aweme.speedpredictor.api.ISpeedCalculatorConfig;
import com.ss.android.ugc.aweme.video.config.IPlayerExperiment;
import com.ss.android.ugc.aweme.video.config.ISimPlayerConfig;
import com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig;
import com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment;
import com.ss.android.ugc.playerkit.model.PlayerGlobalConfig;
import com.ss.android.ugc.playerkit.simapicommon.IAppConfig;
import com.ss.android.ugc.playerkit.simapicommon.reporter.IALog;
import com.ss.android.ugc.playerkit.simapicommon.reporter.IMonitor;

/* loaded from: classes9.dex */
public interface ISimKitConfig {
    IALog getALog();

    IAppConfig getAppConfig();

    ICommonConfig getCommonConfig();

    IDimensionBitrateCurveConfig getDimensionBitrateCurveConfig();

    IDimensionBitrateFilterConfig getDimensionBitrateFilterConfig();

    InterfaceC46991IcN getDimensionPickConfig();

    IMonitor getMonitor();

    PlayerGlobalConfig getPlayerGlobalConfig();

    IPreloaderExperiment getPreloaderExperiment();

    ISimPlayerConfig getSimPlayerConfig();

    IPlayerExperiment getSimPlayerExperiment();

    ISpeedCalculatorConfig getSpeedCalculatorConfig();

    IVideoPreloadConfig getVideoPreloaderManagerConfig();
}
