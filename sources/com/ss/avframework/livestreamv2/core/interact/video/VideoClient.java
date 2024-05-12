package com.ss.avframework.livestreamv2.core.interact.video;

import com.ss.avframework.livestreamv2.core.interact.statistic.Statistics;

/* loaded from: classes12.dex */
public interface VideoClient {
    Statistics getStatistics();

    void prepare(VideoCallback videoCallback);

    void release();

    void start();

    void stop();
}
