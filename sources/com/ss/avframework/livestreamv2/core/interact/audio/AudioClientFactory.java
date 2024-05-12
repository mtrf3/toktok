package com.ss.avframework.livestreamv2.core.interact.audio;

/* loaded from: classes12.dex */
public interface AudioClientFactory {
    AudioClient create();

    void destroy(AudioClient audioClient);

    int getBitWidth();

    int getChannelCount();

    int getSampleRate();
}
