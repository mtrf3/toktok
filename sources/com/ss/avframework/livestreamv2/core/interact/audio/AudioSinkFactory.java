package com.ss.avframework.livestreamv2.core.interact.audio;

/* loaded from: classes12.dex */
public interface AudioSinkFactory {
    AudioSink create(String str);

    void destroy(AudioSink audioSink);

    int getBitWidth();

    int getChannelCount();

    int getIntervalMs();

    int getSampleRate();
}
