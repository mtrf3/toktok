package com.ss.ttlivestreamer.livestreamv2.core;

import com.ss.ttlivestreamer.core.engine.AudioDeviceModule;
import com.ss.ttlivestreamer.core.engine.AudioSink;
import com.ss.ttlivestreamer.core.engine.AudioTrack;
import com.ss.ttlivestreamer.core.mixer.AudioMixer;
import com.ss.ttlivestreamer.livestreamv2.IInputAudioStream;
import java.lang.ref.WeakReference;
import java.nio.Buffer;
import java.nio.ByteBuffer;

/* loaded from: classes12.dex */
public class AudioDeviceInputStream extends AudioSink implements IInputAudioStream {
    public final WeakReference<AudioDeviceModule> mAudioDeviceModule;
    public final IInputAudioStream mAudioStream;

    /* loaded from: classes12.dex */
    public class RenderStream implements IInputAudioStream {
        public AudioDeviceModule.AudioRenderSink mAudioRenderSink;
        public boolean mStart;
        public float mVolume = 1.0f;

        @Override // com.ss.ttlivestreamer.livestreamv2.IInputAudioStream
        public AudioTrack getAudioTrack() {
            return null;
        }

        @Override // com.ss.ttlivestreamer.livestreamv2.IInputAudioStream
        public int start() {
            this.mStart = true;
            return AudioDeviceInputStream.this.start();
        }

        @Override // com.ss.ttlivestreamer.livestreamv2.IInputAudioStream
        public int stop() {
            this.mStart = false;
            return AudioDeviceInputStream.this.stop();
        }

        @Override // com.ss.ttlivestreamer.livestreamv2.IInputAudioStream
        public int getChannel() {
            return AudioDeviceInputStream.this.getChannel();
        }

        @Override // com.ss.ttlivestreamer.livestreamv2.IInputAudioStream
        public AudioMixer.AudioMixerDescription getMixerDescription() {
            AudioMixer.AudioMixerDescription audioMixerDescription = new AudioMixer.AudioMixerDescription();
            audioMixerDescription.volumeCoeff = this.mVolume;
            return audioMixerDescription;
        }

        @Override // com.ss.ttlivestreamer.livestreamv2.IInputAudioStream
        public int getSample() {
            return AudioDeviceInputStream.this.getSample();
        }

        @Override // com.ss.ttlivestreamer.livestreamv2.IInputAudioStream
        public String name() {
            return AudioDeviceInputStream.this.name();
        }

        @Override // com.ss.ttlivestreamer.livestreamv2.IInputAudioStream
        public void release() {
            this.mAudioRenderSink.release();
            this.mAudioRenderSink = null;
        }

        public AudioDeviceModule.AudioRenderSink getAudioRenderSink() {
            return this.mAudioRenderSink;
        }

        @Override // com.ss.ttlivestreamer.livestreamv2.IInputAudioStream
        public void setMixerDescription(AudioMixer.AudioMixerDescription audioMixerDescription) {
            AudioDeviceModule.AudioRenderSink audioRenderSink;
            if (audioMixerDescription != null && (audioRenderSink = this.mAudioRenderSink) != null) {
                audioRenderSink.setVolume(audioMixerDescription.volumeCoeff);
                this.mVolume = audioMixerDescription.volumeCoeff;
            }
        }

        public RenderStream(AudioDeviceModule.AudioRenderSink audioRenderSink) {
            this.mAudioRenderSink = audioRenderSink;
        }

        @Override // com.ss.ttlivestreamer.livestreamv2.IInputAudioStream
        public int pushAudioFrame(ByteBuffer byteBuffer, int i, int i2, int i3, int i4, long j) {
            IInputAudioStream iInputAudioStream = AudioDeviceInputStream.this.mAudioStream;
            if (iInputAudioStream != null && this.mStart) {
                iInputAudioStream.pushAudioFrame(byteBuffer, i, i2, 16, i4, j);
                return 0;
            }
            return -1;
        }
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.IInputAudioStream
    public AudioTrack getAudioTrack() {
        return null;
    }

    @Override // com.ss.ttlivestreamer.core.engine.AudioSink
    public void onNoData() {
    }

    @Override // com.ss.ttlivestreamer.core.engine.NativeObject
    public synchronized void release() {
        IInputAudioStream iInputAudioStream = this.mAudioStream;
        if (iInputAudioStream != null) {
            iInputAudioStream.release();
            if (this.mAudioDeviceModule.get() != null) {
                this.mAudioDeviceModule.get().getRenderMixer().removeAudioSink(this);
            }
        }
    }

    public RenderStream createRenderSteream() {
        if (this.mAudioDeviceModule.get() != null) {
            return new RenderStream(this.mAudioDeviceModule.get().createRenderSink());
        }
        return null;
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.IInputAudioStream
    public int getChannel() {
        return this.mAudioStream.getChannel();
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.IInputAudioStream
    public AudioMixer.AudioMixerDescription getMixerDescription() {
        return this.mAudioStream.getMixerDescription();
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.IInputAudioStream
    public int getSample() {
        return this.mAudioStream.getSample();
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.IInputAudioStream
    public String name() {
        return this.mAudioStream.name();
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.IInputAudioStream
    public int start() {
        return this.mAudioStream.start();
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.IInputAudioStream
    public int stop() {
        return this.mAudioStream.stop();
    }

    public IInputAudioStream getAudioRenderSink() {
        return this.mAudioStream;
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.IInputAudioStream
    public void setMixerDescription(AudioMixer.AudioMixerDescription audioMixerDescription) {
        this.mAudioStream.setMixerDescription(audioMixerDescription);
    }

    public AudioDeviceInputStream(AudioDeviceModule audioDeviceModule, IInputAudioStream iInputAudioStream) {
        WeakReference<AudioDeviceModule> weakReference = new WeakReference<>(audioDeviceModule);
        this.mAudioDeviceModule = weakReference;
        this.mAudioStream = iInputAudioStream;
        weakReference.get().getRenderMixer().addAudioSink(this);
    }

    @Override // com.ss.ttlivestreamer.core.engine.AudioSink
    public void onData(Buffer buffer, int i, int i2, int i3, long j) {
        IInputAudioStream iInputAudioStream = this.mAudioStream;
        if (iInputAudioStream != null) {
            iInputAudioStream.pushAudioFrame((ByteBuffer) buffer, i2, i3, 16, i * i3, j * 1000);
        }
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.IInputAudioStream
    public int pushAudioFrame(ByteBuffer byteBuffer, int i, int i2, int i3, int i4, long j) {
        IInputAudioStream iInputAudioStream = this.mAudioStream;
        if (iInputAudioStream != null) {
            return iInputAudioStream.pushAudioFrame(byteBuffer, i, i2, i3, i4, j);
        }
        return -1;
    }
}
