package com.ss.ttlivestreamer.livestreamv2;

import com.ss.ttlivestreamer.core.engine.AudioTrack;
import com.ss.ttlivestreamer.core.mixer.AudioMixer;
import java.nio.ByteBuffer;

/* loaded from: classes12.dex */
public interface IInputAudioStream {
    AudioTrack getAudioTrack();

    int getChannel();

    AudioMixer.AudioMixerDescription getMixerDescription();

    int getSample();

    String name();

    int pushAudioFrame(ByteBuffer byteBuffer, int i, int i2, int i3, int i4, long j);

    void release();

    void setMixerDescription(AudioMixer.AudioMixerDescription audioMixerDescription);

    int start();

    int stop();
}
