package com.ss.ttlivestreamer.core.engine;

import com.ss.ttlivestreamer.core.statics.StaticsReport;

/* loaded from: classes12.dex */
public class VideoFrameStatistics implements StaticsReport.StaticReportInterface {
    public static native boolean nativeGetStaticsReport(StaticsReport staticsReport);

    public static native boolean nativeReset();

    public static void reset() {
        nativeReset();
    }

    @Override // com.ss.ttlivestreamer.core.statics.StaticsReport.StaticReportInterface
    public boolean getStaticsReport(StaticsReport staticsReport) {
        return nativeGetStaticsReport(staticsReport);
    }
}
