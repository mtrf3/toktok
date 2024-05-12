package com.ss.ttlivestreamer.livestreamv2;

import android.os.Handler;
import com.ss.ttlivestreamer.core.capture.audio.AudioCapturer;
import com.ss.ttlivestreamer.core.engine.AudioTrack;
import com.ss.ttlivestreamer.core.engine.MediaEngineFactory;
import com.ss.ttlivestreamer.core.mixer.AudioMixer;
import com.ss.ttlivestreamer.livestreamv2.capture.AudioCapturerExternal;
import java.nio.ByteBuffer;

/* loaded from: classes12.dex */
public class InputAudioStream implements IInputAudioStream, AudioCapturer.AudioCaptureObserver {
    public AudioCapturerExternal mAudioCapturer;
    public AudioMixer.AudioMixerDescription mAudioMixerDescription;
    public AudioTrack mAudioTrack;
    public int mChannel;
    public Handler mHandler;
    public Observer mObserver;
    public int mSample;

    /* loaded from: classes12.dex */
    public interface Observer {
        void releaseInputStream(InputAudioStream inputAudioStream);

        void updateVolume(InputAudioStream inputAudioStream);
    }

    @Override // com.ss.ttlivestreamer.core.capture.audio.AudioCapturer.AudioCaptureObserver
    public void onAudioCaptureError(int i, Exception exc) {
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.IInputAudioStream
    public synchronized void release() {
        stop();
        Observer observer = this.mObserver;
        if (observer != null) {
            observer.releaseInputStream(this);
        }
        AudioCapturerExternal audioCapturerExternal = this.mAudioCapturer;
        if (audioCapturerExternal != null) {
            audioCapturerExternal.release();
            this.mAudioCapturer = null;
        }
        AudioTrack audioTrack = this.mAudioTrack;
        if (audioTrack != null) {
            audioTrack.release();
            this.mAudioTrack = null;
        }
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.IInputAudioStream
    public String name() {
        AudioTrack audioTrack = this.mAudioTrack;
        if (audioTrack != null) {
            return audioTrack.id();
        }
        return "";
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.IInputAudioStream
    public int start() {
        AudioCapturerExternal audioCapturerExternal = this.mAudioCapturer;
        if (audioCapturerExternal != null) {
            audioCapturerExternal.start();
            return 0;
        }
        return 0;
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.IInputAudioStream
    public int stop() {
        AudioCapturerExternal audioCapturerExternal = this.mAudioCapturer;
        if (audioCapturerExternal != null) {
            audioCapturerExternal.stop();
            return 0;
        }
        return 0;
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.IInputAudioStream
    public AudioTrack getAudioTrack() {
        return this.mAudioTrack;
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.IInputAudioStream
    public int getChannel() {
        return this.mChannel;
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.IInputAudioStream
    public AudioMixer.AudioMixerDescription getMixerDescription() {
        return this.mAudioMixerDescription;
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.IInputAudioStream
    public int getSample() {
        return this.mSample;
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.IInputAudioStream
    public void setMixerDescription(AudioMixer.AudioMixerDescription audioMixerDescription) {
        if (audioMixerDescription == null) {
            return;
        }
        this.mAudioMixerDescription = audioMixerDescription;
        Observer observer = this.mObserver;
        if (observer != null) {
            observer.updateVolume(this);
        }
    }

    public InputAudioStream(MediaEngineFactory mediaEngineFactory, Observer observer, int i, int i2, Handler handler, String str) {
        AudioCapturerExternal audioCapturerExternal = new AudioCapturerExternal(i, i2, 16, handler, this);
        this.mAudioCapturer = audioCapturerExternal;
        this.mAudioTrack = mediaEngineFactory.createAudioTrack(audioCapturerExternal, str);
        this.mAudioMixerDescription = new AudioMixer.AudioMixerDescription();
        this.mObserver = observer;
        this.mSample = i;
        this.mChannel = i2;
        this.mHandler = handler;
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.IInputAudioStream
    public int pushAudioFrame(ByteBuffer byteBuffer, int i, int i2, int i3, int i4, long j) {
        AudioCapturerExternal audioCapturerExternal = this.mAudioCapturer;
        if (audioCapturerExternal != null) {
            return audioCapturerExternal.pushAudioFrame(byteBuffer, i, i2, i3, i4, j);
        }
        return -1;
    }
}
