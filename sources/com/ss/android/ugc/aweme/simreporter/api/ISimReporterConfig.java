package com.ss.android.ugc.aweme.simreporter.api;

import X.ILB;
import X.ILH;

/* loaded from: classes9.dex */
public interface ISimReporterConfig {
    ILH getBlockReportStrategy();

    int getCodecBufferingThreshold();

    int getNetBufferingThreshold();

    int getReportVideoResponseCount();

    ILB getReporterType();

    Boolean isReportBlockV2();

    Boolean isReportTotalBlock();
}
