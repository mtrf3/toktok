package com.ss.ttlivestreamer.livestreamv2.core;

import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import com.ss.ttlivestreamer.core.engine.AudioDeviceModule;
import com.ss.ttlivestreamer.core.engine.AudioTrack;
import com.ss.ttlivestreamer.core.utils.AVLog;
import com.ss.ttlivestreamer.livestreamv2.core.IAudioDeviceControl;
import defpackage.a1;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes12.dex */
public class AudioDeviceControl implements IAudioDeviceControl {
    public AudioDeviceModule mAudioDeviceModule;
    public List<AudioLayer> mLayers = new ArrayList();

    /* loaded from: classes12.dex */
    public class AudioLayer implements IAudioDeviceControl.IAudioTrack {
        public AudioDeviceModule.AudioRenderSink mAudioRenderSink;
        public int mChannel;
        public final String mName;
        public int mSampleHz;
        public int mTrackId;
        public float mVolumeCoeff = 1.0f;

        @Override // com.ss.ttlivestreamer.livestreamv2.core.IAudioDeviceControl.IAudioTrack
        public void dispose() {
            AudioDeviceControl.this.removeTrack(name());
            AudioDeviceModule.AudioRenderSink audioRenderSink = this.mAudioRenderSink;
            if (audioRenderSink != null) {
                audioRenderSink.release();
                this.mAudioRenderSink = null;
            }
        }

        @Override // com.ss.ttlivestreamer.livestreamv2.core.IAudioDeviceControl.IAudioTrack
        public long getQuirks() {
            AudioDeviceModule.AudioRenderSink audioRenderSink = this.mAudioRenderSink;
            if (audioRenderSink != null) {
                return audioRenderSink.getQuirks();
            }
            return 0L;
        }

        @Override // com.ss.ttlivestreamer.livestreamv2.core.IAudioDeviceControl.IAudioTrack
        public boolean isEnableAGC() {
            AudioDeviceModule.AudioRenderSink audioRenderSink = this.mAudioRenderSink;
            if (audioRenderSink != null) {
                return audioRenderSink.isEnableAGC();
            }
            return false;
        }

        @Override // com.ss.ttlivestreamer.livestreamv2.core.IAudioDeviceControl.IAudioTrack
        public boolean isMute() {
            AudioDeviceModule.AudioRenderSink audioRenderSink = this.mAudioRenderSink;
            if (audioRenderSink != null) {
                return audioRenderSink.isMute();
            }
            return true;
        }

        @Override // com.ss.ttlivestreamer.livestreamv2.core.IAudioDeviceControl.IAudioTrack
        public int getChannel() {
            return this.mChannel;
        }

        @Override // com.ss.ttlivestreamer.livestreamv2.core.IAudioDeviceControl.IAudioTrack
        public int getSampleHz() {
            return this.mSampleHz;
        }

        @Override // com.ss.ttlivestreamer.livestreamv2.core.IAudioDeviceControl.IAudioTrack
        public float getVolume() {
            return this.mVolumeCoeff;
        }

        @Override // com.ss.ttlivestreamer.livestreamv2.core.IAudioDeviceControl.IAudioTrack
        public String name() {
            return this.mName;
        }

        @Override // com.ss.ttlivestreamer.livestreamv2.core.IAudioDeviceControl.IAudioTrack
        public double getOption(int i) {
            AudioDeviceModule.AudioRenderSink audioRenderSink = this.mAudioRenderSink;
            if (audioRenderSink != null) {
                return audioRenderSink.getOption(i);
            }
            return LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX;
        }

        @Override // com.ss.ttlivestreamer.livestreamv2.core.IAudioDeviceControl.IAudioTrack
        public void setAudioTrack(AudioTrack audioTrack) {
            AudioDeviceModule.AudioRenderSink audioRenderSink = this.mAudioRenderSink;
            if (audioRenderSink != null) {
                audioRenderSink.setAudioTrack(audioTrack);
            }
        }

        @Override // com.ss.ttlivestreamer.livestreamv2.core.IAudioDeviceControl.IAudioTrack
        public boolean setMute(boolean z) {
            AudioDeviceModule.AudioRenderSink audioRenderSink = this.mAudioRenderSink;
            if (audioRenderSink != null) {
                audioRenderSink.setMute(z);
                return true;
            }
            return true;
        }

        @Override // com.ss.ttlivestreamer.livestreamv2.core.IAudioDeviceControl.IAudioTrack
        public void setQuirks(long j) {
            AudioDeviceModule.AudioRenderSink audioRenderSink = this.mAudioRenderSink;
            if (audioRenderSink != null) {
                audioRenderSink.setQuirks(j);
            }
        }

        @Override // com.ss.ttlivestreamer.livestreamv2.core.IAudioDeviceControl.IAudioTrack
        public void setVolume(float f) {
            this.mVolumeCoeff = f;
            AudioDeviceModule.AudioRenderSink audioRenderSink = this.mAudioRenderSink;
            if (audioRenderSink != null) {
                audioRenderSink.setVolume(f);
            }
        }

        @Override // com.ss.ttlivestreamer.livestreamv2.core.IAudioDeviceControl.IAudioTrack
        public void enableAGC(boolean z, boolean z2) {
            AudioDeviceModule.AudioRenderSink audioRenderSink = this.mAudioRenderSink;
            if (audioRenderSink != null) {
                audioRenderSink.setEnableAGC(z, z2);
            }
        }

        @Override // com.ss.ttlivestreamer.livestreamv2.core.IAudioDeviceControl.IAudioTrack
        public void onData(ByteBuffer byteBuffer, int i, long j) {
            AudioDeviceModule.AudioRenderSink audioRenderSink = this.mAudioRenderSink;
            if (audioRenderSink != null) {
                audioRenderSink.onData(byteBuffer, i, this.mSampleHz, this.mChannel, j / 1000000);
            }
        }

        @Override // com.ss.ttlivestreamer.livestreamv2.core.IAudioDeviceControl.IAudioTrack
        public void onData(ByteBuffer byteBuffer, int i, int i2, int i3, long j) {
            AudioDeviceModule.AudioRenderSink audioRenderSink = this.mAudioRenderSink;
            if (audioRenderSink != null) {
                audioRenderSink.onData(byteBuffer, i3, i, i2, j / 1000000);
            }
        }

        public AudioLayer(String str, int i, int i2, int i3, AudioDeviceModule.AudioRenderSink audioRenderSink) {
            this.mAudioRenderSink = audioRenderSink;
            this.mName = str;
            this.mTrackId = audioRenderSink.getRenderTrackId();
            this.mSampleHz = i;
            this.mChannel = i2;
        }
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.core.IAudioDeviceControl
    public IAudioDeviceControl.IAudioTrack[] getTracks() {
        return null;
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.core.IAudioDeviceControl
    public float getVolume() {
        return 0.0f;
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.core.IAudioDeviceControl
    public void setVolume(float f) {
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.core.IAudioDeviceControl
    public boolean isEnableAEC() {
        return this.mAudioDeviceModule.isEnableBuiltInAEC();
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.core.IAudioDeviceControl
    public boolean isEnableEcho() {
        return this.mAudioDeviceModule.isEchoMode();
    }

    public void release() {
        synchronized (this.mLayers) {
            while (!this.mLayers.isEmpty()) {
                AudioLayer remove = this.mLayers.remove(0);
                if (remove != null) {
                    remove.dispose();
                }
            }
        }
    }

    public AudioDeviceControl(AudioDeviceModule audioDeviceModule) {
        this.mAudioDeviceModule = audioDeviceModule;
    }

    private void addTrack(AudioLayer audioLayer) {
        synchronized (this.mLayers) {
            this.mLayers.add(audioLayer);
        }
    }

    private AudioLayer findTrack(String str) {
        synchronized (this.mLayers) {
            for (AudioLayer audioLayer : this.mLayers) {
                if (audioLayer.name().equals(str)) {
                    return audioLayer;
                }
            }
            return null;
        }
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.core.IAudioDeviceControl
    public boolean enableAEC(boolean z) {
        this.mAudioDeviceModule.enableBuiltInAEC(z);
        return true;
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.core.IAudioDeviceControl
    public boolean enableEcho(boolean z) {
        this.mAudioDeviceModule.enableEchoMode(z);
        return true;
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.core.IAudioDeviceControl
    public IAudioDeviceControl.IAudioTrack getTrack(String str) {
        return findTrack(str);
    }

    public void removeTrack(String str) {
        synchronized (this.mLayers) {
            Iterator<AudioLayer> it = this.mLayers.iterator();
            while (it.hasNext()) {
                if (it.next().name().equals(str)) {
                    it.remove();
                }
            }
        }
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.core.IAudioDeviceControl
    public void setOriginTriggering(String str) {
        AudioLayer findTrack = findTrack(str);
        if (findTrack != null) {
            this.mAudioDeviceModule.getRenderMixer().setOriginTrackIndex(findTrack.mTrackId);
        }
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.core.IAudioDeviceControl
    public IAudioDeviceControl.IAudioTrack createTrack(String str, int i, int i2, int i3) {
        if (str == null) {
            return null;
        }
        AudioLayer findTrack = findTrack(str);
        if (findTrack != null) {
            AVLog.logKibana(6, "AudioDeviceControl", a1.LJ("Audio render with name ", str, " already exists"), null);
            return findTrack;
        }
        AudioLayer audioLayer = new AudioLayer(str, i, i2, i3, this.mAudioDeviceModule.createRenderSink());
        addTrack(audioLayer);
        return audioLayer;
    }
}
