package com.ss.avframework.livestreamv2.core.interact.audio;

import com.ss.avframework.livestreamv2.core.interact.statistic.Statistics;

/* loaded from: classes12.dex */
public interface AudioClient {
    Statistics getStatistics();

    void prepare(AudioCallback audioCallback);

    void release();

    void start();

    void stop();
}
