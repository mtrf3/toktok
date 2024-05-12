package com.ss.android.ugc.aweme.dsp.experiment;

import X.InterfaceC65349Pkn;

/* loaded from: classes10.dex */
public final class DspFeedbackConfig {

    @InterfaceC65349Pkn("ring_buffer_size")
    public final int ringBufferSize = 100;

    @InterfaceC65349Pkn("interval")
    public final long interval = 3600000;

    public final long getInterval() {
        return this.interval;
    }

    public final int getRingBufferSize() {
        return this.ringBufferSize;
    }
}
