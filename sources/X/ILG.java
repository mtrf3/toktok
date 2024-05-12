package X;

import com.ss.android.ugc.aweme.simreporter.api.ISimReporterConfig;

/* loaded from: classes9.dex */
public final class ILG implements ISimReporterConfig {
    @Override // com.ss.android.ugc.aweme.simreporter.api.ISimReporterConfig
    public final /* synthetic */ int getCodecBufferingThreshold() {
        return 200;
    }

    @Override // com.ss.android.ugc.aweme.simreporter.api.ISimReporterConfig
    public final /* synthetic */ int getNetBufferingThreshold() {
        return 200;
    }

    @Override // com.ss.android.ugc.aweme.simreporter.api.ISimReporterConfig
    public final /* synthetic */ int getReportVideoResponseCount() {
        return 10;
    }

    @Override // com.ss.android.ugc.aweme.simreporter.api.ISimReporterConfig
    public final ILH getBlockReportStrategy() {
        return ILH.STRATEGY_1;
    }

    @Override // com.ss.android.ugc.aweme.simreporter.api.ISimReporterConfig
    public final ILB getReporterType() {
        return ILB.DT;
    }

    @Override // com.ss.android.ugc.aweme.simreporter.api.ISimReporterConfig
    public final Boolean isReportBlockV2() {
        return Boolean.TRUE;
    }

    @Override // com.ss.android.ugc.aweme.simreporter.api.ISimReporterConfig
    public final Boolean isReportTotalBlock() {
        return Boolean.FALSE;
    }
}
