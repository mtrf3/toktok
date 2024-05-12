package com.ss.avframework.livestreamv2.core.interact;

import com.ss.avframework.livestreamv2.core.interact.audio.AudioClient;
import com.ss.avframework.livestreamv2.core.interact.audio.AudioClientFactory;
import com.ss.avframework.livestreamv2.core.interact.media.MediaEngine;
import com.ss.ttlivestreamer.core.utils.AVLog;

/* loaded from: classes12.dex */
public class InteractAudioClientFactory implements AudioClientFactory {
    public int mChannelCount;
    public MediaEngine mEngine;
    public int mSampleRate;

    @Override // com.ss.avframework.livestreamv2.core.interact.audio.AudioClientFactory
    public int getBitWidth() {
        return 16;
    }

    @Override // com.ss.avframework.livestreamv2.core.interact.audio.AudioClientFactory
    public int getChannelCount() {
        int i;
        synchronized (this) {
            i = this.mChannelCount;
        }
        return i;
    }

    @Override // com.ss.avframework.livestreamv2.core.interact.audio.AudioClientFactory
    public int getSampleRate() {
        int i;
        synchronized (this) {
            i = this.mSampleRate;
        }
        return i;
    }

    @Override // com.ss.avframework.livestreamv2.core.interact.audio.AudioClientFactory
    public AudioClient create() {
        AVLog.d("InteractAudioClientFactory", "Create audio client ");
        InteractAudioClient interactAudioClient = new InteractAudioClient(this.mChannelCount, this.mSampleRate);
        this.mEngine.addAudioFrameAvailableListener(interactAudioClient);
        return interactAudioClient;
    }

    public InteractAudioClientFactory(MediaEngine mediaEngine) {
        this.mChannelCount = 44100;
        this.mSampleRate = 2;
        this.mEngine = mediaEngine;
        if (mediaEngine != null && mediaEngine.getBuilder() != null) {
            this.mChannelCount = this.mEngine.getBuilder().getAudioChannelCount();
            this.mSampleRate = this.mEngine.getBuilder().getAudioSampleHz();
        }
    }

    @Override // com.ss.avframework.livestreamv2.core.interact.audio.AudioClientFactory
    public void destroy(AudioClient audioClient) {
        AVLog.d("InteractAudioClientFactory", "Destroy audio client ");
        this.mEngine.removeAudioFrameAvailableListener((InteractAudioClient) audioClient);
    }
}
