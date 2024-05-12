package com.ss.avframework.livestreamv2.core.interact;

import X.AnonymousClass028;
import X.X1D;
import android.util.AndroidRuntimeException;
import com.ss.avframework.livestreamv2.core.interact.audio.AudioSink;
import com.ss.avframework.livestreamv2.core.interact.audio.AudioSinkFactory;
import com.ss.ttlivestreamer.core.utils.AVLog;

/* loaded from: classes12.dex */
public class InteractAudioSinkFactory implements AudioSinkFactory {
    public final InteractEngineBuilder mBuilder;
    public int mChannelCount;
    public int mCreateCount;
    public int mDestroyCount;
    public int mSampleRate;

    @Override // com.ss.avframework.livestreamv2.core.interact.audio.AudioSinkFactory
    public int getBitWidth() {
        return 16;
    }

    @Override // com.ss.avframework.livestreamv2.core.interact.audio.AudioSinkFactory
    public int getIntervalMs() {
        return 10;
    }

    public void release() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AudioSink create count ");
        LIZ.append(this.mCreateCount);
        LIZ.append(", destroy count ");
        LIZ.append(this.mDestroyCount);
        String LIZIZ = X1D.LIZIZ(LIZ);
        AVLog.iow("InteractAudioSinkFactory", LIZIZ);
        if (this.mCreateCount != this.mDestroyCount) {
            AndroidRuntimeException androidRuntimeException = new AndroidRuntimeException(LIZIZ);
            if (!AnonymousClass028.LJI(androidRuntimeException, "InteractAudioSinkFactory.release")) {
            } else {
                throw androidRuntimeException;
            }
        }
    }

    @Override // com.ss.avframework.livestreamv2.core.interact.audio.AudioSinkFactory
    public int getChannelCount() {
        return this.mChannelCount;
    }

    @Override // com.ss.avframework.livestreamv2.core.interact.audio.AudioSinkFactory
    public int getSampleRate() {
        return this.mSampleRate;
    }

    public InteractAudioSinkFactory(InteractEngineBuilder interactEngineBuilder) {
        this.mChannelCount = 2;
        this.mSampleRate = 44100;
        this.mBuilder = interactEngineBuilder;
        if (interactEngineBuilder != null) {
            this.mChannelCount = interactEngineBuilder.getAudioChannelCount();
            this.mSampleRate = interactEngineBuilder.getAudioSampleHz();
        }
    }

    @Override // com.ss.avframework.livestreamv2.core.interact.audio.AudioSinkFactory
    public AudioSink create(String str) {
        this.mCreateCount++;
        if (str == null) {
            str = InteractEngine.AUDIO_LAYER_NAME;
        }
        return new InteractAudioSink(this.mBuilder, str, this.mSampleRate, this.mChannelCount);
    }

    @Override // com.ss.avframework.livestreamv2.core.interact.audio.AudioSinkFactory
    public void destroy(AudioSink audioSink) {
        this.mDestroyCount++;
        if (audioSink instanceof InteractAudioSink) {
            ((InteractAudioSink) audioSink).release();
        }
    }
}
