package com.ss.android.ugc.aweme.video.simplayer;

import X.ILB;
import X.ILH;
import com.ss.android.ugc.aweme.simreporter.api.ISimReporterConfig;

/* loaded from: classes9.dex */
public class SimReporterConfigImpl implements ISimReporterConfig {
    @Override // com.ss.android.ugc.aweme.simreporter.api.ISimReporterConfig
    public /* bridge */ /* synthetic */ int getCodecBufferingThreshold() {
        return 200;
    }

    @Override // com.ss.android.ugc.aweme.simreporter.api.ISimReporterConfig
    public int getNetBufferingThreshold() {
        return 80;
    }

    @Override // com.ss.android.ugc.aweme.simreporter.api.ISimReporterConfig
    public /* bridge */ /* synthetic */ int getReportVideoResponseCount() {
        return 10;
    }

    @Override // com.ss.android.ugc.aweme.simreporter.api.ISimReporterConfig
    public ILH getBlockReportStrategy() {
        return ILH.STRATEGY_1;
    }

    @Override // com.ss.android.ugc.aweme.simreporter.api.ISimReporterConfig
    public ILB getReporterType() {
        return ILB.DT;
    }

    @Override // com.ss.android.ugc.aweme.simreporter.api.ISimReporterConfig
    public Boolean isReportBlockV2() {
        return Boolean.TRUE;
    }

    @Override // com.ss.android.ugc.aweme.simreporter.api.ISimReporterConfig
    public Boolean isReportTotalBlock() {
        return Boolean.FALSE;
    }
}
