package com.ss.android.ugc.aweme.video.simkit;

import X.C221108m2;
import X.C48362IyU;
import X.C48363IyV;
import X.C48364IyW;
import X.C48365IyX;
import X.C48366IyY;
import X.C48367IyZ;
import X.C48368Iya;
import X.C48369Iyb;
import X.C48370Iyc;
import X.C48371Iyd;
import X.C48372Iye;
import X.C48373Iyf;
import X.C48374Iyg;
import X.C48375Iyh;
import X.C48376Iyi;
import X.C5H3;
import X.EnumC221088m0;
import X.ILG;
import X.InterfaceC46991IcN;
import com.ss.android.ugc.aweme.simkit.ISimKitConfig;
import com.ss.android.ugc.aweme.simkit.api.ICommonConfig;
import com.ss.android.ugc.aweme.simkit.api.IDimensionBitrateCurveConfig;
import com.ss.android.ugc.aweme.simkit.api.IDimensionBitrateFilterConfig;
import com.ss.android.ugc.aweme.simreporter.api.ISimReporterConfig;
import com.ss.android.ugc.aweme.speedpredictor.api.ISpeedCalculatorConfig;
import com.ss.android.ugc.aweme.video.config.IPlayerExperiment;
import com.ss.android.ugc.aweme.video.config.ISimPlayerConfig;
import com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig;
import com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment;
import com.ss.android.ugc.playerkit.exp.PlayerSettingService;
import com.ss.android.ugc.playerkit.model.PlayerGlobalConfig;
import com.ss.android.ugc.playerkit.radar.IRadarTransmitter;
import com.ss.android.ugc.playerkit.simapicommon.IAppConfig;
import com.ss.android.ugc.playerkit.simapicommon.reporter.IALog;
import com.ss.android.ugc.playerkit.simapicommon.reporter.IEvent;
import com.ss.android.ugc.playerkit.simapicommon.reporter.IMonitor;
import kotlin.jvm.internal.AqS158S0100000_8;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class SimKitConfigImpl implements ISimKitConfig {
    public final C5H3 iDimensionPickConfig$delegate;
    public final C5H3 innerRadarTransmitter$delegate;
    public final C5H3 mALog$delegate;
    public final C5H3 mAppConfig$delegate;
    public final C5H3 mCommonConfig$delegate;
    public final C5H3 mDimensionBitrateCurveConfig$delegate;
    public final C5H3 mDimensionBitrateFilterConfig$delegate;
    public final C5H3 mEvent$delegate;
    public final C5H3 mMonitor$delegate;
    public final C5H3 mPlayerExperiment$delegate;
    public final C5H3 mPlayerGlobalConfig$delegate;
    public final C5H3 mPlayerSettingService$delegate;
    public final C5H3 mPreloaderExperiment$delegate;
    public final C5H3 mSimPlayerConfig$delegate;
    public final C5H3 mSpeedCalculatorConfig$delegate;
    public final C5H3 mVideoPreloaderManagerConfig$delegate;

    private final InterfaceC46991IcN getIDimensionPickConfig() {
        return (InterfaceC46991IcN) this.iDimensionPickConfig$delegate.getValue();
    }

    private final IRadarTransmitter getInnerRadarTransmitter() {
        return (IRadarTransmitter) this.innerRadarTransmitter$delegate.getValue();
    }

    private final IALog getMALog() {
        return (IALog) this.mALog$delegate.getValue();
    }

    private final IAppConfig getMAppConfig() {
        return (IAppConfig) this.mAppConfig$delegate.getValue();
    }

    private final ICommonConfig getMCommonConfig() {
        return (ICommonConfig) this.mCommonConfig$delegate.getValue();
    }

    private final IDimensionBitrateCurveConfig getMDimensionBitrateCurveConfig() {
        return (IDimensionBitrateCurveConfig) this.mDimensionBitrateCurveConfig$delegate.getValue();
    }

    private final IDimensionBitrateFilterConfig getMDimensionBitrateFilterConfig() {
        return (IDimensionBitrateFilterConfig) this.mDimensionBitrateFilterConfig$delegate.getValue();
    }

    private final IEvent getMEvent() {
        return (IEvent) this.mEvent$delegate.getValue();
    }

    private final IMonitor getMMonitor() {
        return (IMonitor) this.mMonitor$delegate.getValue();
    }

    private final IPlayerExperiment getMPlayerExperiment() {
        return (IPlayerExperiment) this.mPlayerExperiment$delegate.getValue();
    }

    private final PlayerGlobalConfig getMPlayerGlobalConfig() {
        return (PlayerGlobalConfig) this.mPlayerGlobalConfig$delegate.getValue();
    }

    private final PlayerSettingService getMPlayerSettingService() {
        return (PlayerSettingService) this.mPlayerSettingService$delegate.getValue();
    }

    private final IPreloaderExperiment getMPreloaderExperiment() {
        Object value = this.mPreloaderExperiment$delegate.getValue();
        o.LJIIIIZZ(value, "<get-mPreloaderExperiment>(...)");
        return (IPreloaderExperiment) value;
    }

    private final ISimPlayerConfig getMSimPlayerConfig() {
        return (ISimPlayerConfig) this.mSimPlayerConfig$delegate.getValue();
    }

    private final ISpeedCalculatorConfig getMSpeedCalculatorConfig() {
        return (ISpeedCalculatorConfig) this.mSpeedCalculatorConfig$delegate.getValue();
    }

    public final IVideoPreloadConfig getMVideoPreloaderManagerConfig() {
        return (IVideoPreloadConfig) this.mVideoPreloaderManagerConfig$delegate.getValue();
    }

    public ISimReporterConfig getSimReporterConfig() {
        return new ILG();
    }

    public SimKitConfigImpl() {
        EnumC221088m0 enumC221088m0 = EnumC221088m0.SYNCHRONIZED;
        this.mCommonConfig$delegate = C221108m2.LIZ(enumC221088m0, C48363IyV.LJLIL);
        this.mALog$delegate = C221108m2.LIZ(enumC221088m0, C48362IyU.LJLIL);
        this.mAppConfig$delegate = C221108m2.LIZ(enumC221088m0, C48372Iye.LJLIL);
        this.mEvent$delegate = C221108m2.LIZ(enumC221088m0, C48364IyW.LJLIL);
        this.mMonitor$delegate = C221108m2.LIZ(enumC221088m0, C48375Iyh.LJLIL);
        this.mSimPlayerConfig$delegate = C221108m2.LIZ(enumC221088m0, C48367IyZ.LJLIL);
        this.mPlayerExperiment$delegate = C221108m2.LIZ(enumC221088m0, C48365IyX.LJLIL);
        this.mVideoPreloaderManagerConfig$delegate = C221108m2.LIZ(enumC221088m0, C48369Iyb.LJLIL);
        this.mPreloaderExperiment$delegate = C221108m2.LIZ(enumC221088m0, new AqS158S0100000_8(this, 364));
        this.mPlayerGlobalConfig$delegate = C221108m2.LIZ(enumC221088m0, C48366IyY.LJLIL);
        this.mSpeedCalculatorConfig$delegate = C221108m2.LIZ(enumC221088m0, C48368Iya.LJLIL);
        this.mDimensionBitrateCurveConfig$delegate = C221108m2.LIZ(enumC221088m0, C48373Iyf.LJLIL);
        this.iDimensionPickConfig$delegate = C221108m2.LIZ(enumC221088m0, C48370Iyc.LJLIL);
        this.mDimensionBitrateFilterConfig$delegate = C221108m2.LIZ(enumC221088m0, C48374Iyg.LJLIL);
        this.mPlayerSettingService$delegate = C221108m2.LIZ(enumC221088m0, C48376Iyi.LJLIL);
        this.innerRadarTransmitter$delegate = C221108m2.LIZ(enumC221088m0, C48371Iyd.LJLIL);
    }

    public PlayerSettingService PlayerSettingService() {
        return getMPlayerSettingService();
    }

    @Override // com.ss.android.ugc.aweme.simkit.ISimKitConfig
    public IALog getALog() {
        return getMALog();
    }

    @Override // com.ss.android.ugc.aweme.simkit.ISimKitConfig
    public IAppConfig getAppConfig() {
        return getMAppConfig();
    }

    @Override // com.ss.android.ugc.aweme.simkit.ISimKitConfig
    public ICommonConfig getCommonConfig() {
        return getMCommonConfig();
    }

    @Override // com.ss.android.ugc.aweme.simkit.ISimKitConfig
    public IDimensionBitrateCurveConfig getDimensionBitrateCurveConfig() {
        return getMDimensionBitrateCurveConfig();
    }

    @Override // com.ss.android.ugc.aweme.simkit.ISimKitConfig
    public IDimensionBitrateFilterConfig getDimensionBitrateFilterConfig() {
        return getMDimensionBitrateFilterConfig();
    }

    @Override // com.ss.android.ugc.aweme.simkit.ISimKitConfig
    public InterfaceC46991IcN getDimensionPickConfig() {
        return getIDimensionPickConfig();
    }

    public IEvent getEvent() {
        return getMEvent();
    }

    @Override // com.ss.android.ugc.aweme.simkit.ISimKitConfig
    public IMonitor getMonitor() {
        return getMMonitor();
    }

    @Override // com.ss.android.ugc.aweme.simkit.ISimKitConfig
    public PlayerGlobalConfig getPlayerGlobalConfig() {
        return getMPlayerGlobalConfig();
    }

    @Override // com.ss.android.ugc.aweme.simkit.ISimKitConfig
    public IPreloaderExperiment getPreloaderExperiment() {
        return getMPreloaderExperiment();
    }

    public IRadarTransmitter getRadarTransmitter() {
        return getInnerRadarTransmitter();
    }

    @Override // com.ss.android.ugc.aweme.simkit.ISimKitConfig
    public ISimPlayerConfig getSimPlayerConfig() {
        return getMSimPlayerConfig();
    }

    @Override // com.ss.android.ugc.aweme.simkit.ISimKitConfig
    public IPlayerExperiment getSimPlayerExperiment() {
        return getMPlayerExperiment();
    }

    @Override // com.ss.android.ugc.aweme.simkit.ISimKitConfig
    public ISpeedCalculatorConfig getSpeedCalculatorConfig() {
        return getMSpeedCalculatorConfig();
    }

    @Override // com.ss.android.ugc.aweme.simkit.ISimKitConfig
    public IVideoPreloadConfig getVideoPreloaderManagerConfig() {
        return getMVideoPreloaderManagerConfig();
    }
}
