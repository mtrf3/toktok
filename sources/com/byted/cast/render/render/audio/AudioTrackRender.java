package com.byted.cast.render.render.audio;

import X.X1D;
import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioRouting;
import android.media.AudioTrack;
import android.os.Build;
import android.os.Handler;
import com.byted.cast.mediacommon.render.parameters.MediaParameter;
import com.byted.cast.mediacommon.render.parameters.MediaRenderErrorCode;
import com.byted.cast.render.utils.Logger;

/* loaded from: classes29.dex */
public class AudioTrackRender implements IAudioRender {
    public AudioTrack audioTrack;
    public AudioRouting.OnRoutingChangedListener routingChangedListener;
    public final String userId;
    public int channels = 2;
    public int sampleRate = 48000;
    public int bitWidth = 16;
    public float gain = 1.0f;
    public int streamType = 3;
    public final float max_vol = AudioTrack.getMaxVolume();
    public final float min_vol = AudioTrack.getMinVolume();

    @Override // com.byted.cast.render.render.IRender
    public boolean start() {
        int i;
        int i2;
        Logger.i("AudioTrackRender", "AudioTrackRender start");
        if (this.audioTrack != null) {
            Logger.w("AudioTrackRender", "Render started");
            return false;
        }
        if (this.channels == 1) {
            i = 4;
        } else {
            i = 12;
        }
        if (this.bitWidth == 8) {
            i2 = 3;
        } else {
            i2 = 2;
        }
        int minBufferSize = AudioTrack.getMinBufferSize(this.sampleRate, i, i2);
        if (minBufferSize == -2) {
            Logger.e("AudioTrackRender", "Invalid parameter !");
            MediaRenderErrorCode.onError(this.userId, MediaRenderErrorCode.MEDIARENDER_RENDER_ERROR, "Invalid parameter");
            return false;
        }
        try {
            int i3 = Build.VERSION.SDK_INT;
            if (i3 >= 26) {
                this.audioTrack = new AudioTrack.Builder().setAudioAttributes(new AudioAttributes.Builder().setUsage(1).setContentType(2).build()).setPerformanceMode(1).setAudioFormat(new AudioFormat.Builder().setSampleRate(this.sampleRate).setEncoding(i2).setChannelMask(i).build()).setTransferMode(1).setBufferSizeInBytes(minBufferSize).build();
            } else if (i3 >= 23) {
                this.audioTrack = new AudioTrack.Builder().setAudioAttributes(new AudioAttributes.Builder().setUsage(1).setContentType(2).build()).setAudioFormat(new AudioFormat.Builder().setSampleRate(this.sampleRate).setEncoding(i2).setChannelMask(i).build()).setTransferMode(1).setBufferSizeInBytes(minBufferSize).build();
            } else {
                this.audioTrack = new AudioTrack(this.streamType, this.sampleRate, i, i2, minBufferSize, 1);
            }
            if (this.audioTrack.getState() != 1) {
                Logger.e("AudioTrackRender", "audioTrack init failed");
                MediaRenderErrorCode.onError(this.userId, MediaRenderErrorCode.MEDIARENDER_RENDER_ERROR, "audioTrack init failed");
                return false;
            }
            AudioTrack audioTrack = this.audioTrack;
            if (audioTrack != null && i3 >= 24) {
                audioTrack.addOnRoutingChangedListener(this.routingChangedListener, (Handler) null);
            }
            try {
                AudioTrack audioTrack2 = this.audioTrack;
                if (audioTrack2 != null) {
                    audioTrack2.play();
                }
                return true;
            } catch (IllegalStateException e) {
                e.printStackTrace();
                Logger.e("AudioTrackRender", "audioTrack play failed");
                MediaRenderErrorCode.onError(this.userId, MediaRenderErrorCode.MEDIARENDER_RENDER_ERROR, "audioTrack play failed");
                return false;
            }
        } catch (Exception e2) {
            e2.printStackTrace();
            Logger.e("AudioTrackRender", "audioTrack build failed");
            MediaRenderErrorCode.onError(this.userId, MediaRenderErrorCode.MEDIARENDER_RENDER_ERROR, "audioTrack build failed");
            return false;
        }
    }

    @Override // com.byted.cast.render.render.IRender
    public boolean stop() {
        Logger.i("AudioTrackRender", "AudioTrackRender stop");
        AudioTrack audioTrack = this.audioTrack;
        if (audioTrack == null) {
            return false;
        }
        if (audioTrack.getState() == 1) {
            Logger.w("AudioTrackRender", "render is stopped");
            return false;
        }
        this.audioTrack.flush();
        this.audioTrack.stop();
        this.audioTrack.release();
        this.audioTrack = null;
        return true;
    }

    @Override // com.byted.cast.render.render.audio.IAudioRender
    public float getMaxVol() {
        return this.max_vol;
    }

    public float getMaxVolume() {
        return this.max_vol;
    }

    @Override // com.byted.cast.render.render.audio.IAudioRender
    public float getMinVol() {
        return this.min_vol;
    }

    public float getMinVolume() {
        return this.min_vol;
    }

    public AudioTrackRender(String str) {
        this.userId = str;
    }

    @Override // com.byted.cast.render.render.IRender
    public Object getParameter(MediaParameter mediaParameter) {
        if (mediaParameter == MediaParameter.Audio_Render_SessionId) {
            AudioTrack audioTrack = this.audioTrack;
            if (audioTrack != null) {
                return Integer.valueOf(audioTrack.getAudioSessionId());
            }
            return null;
        }
        if (mediaParameter == MediaParameter.Audio_Render_volume) {
            return Float.valueOf(this.gain);
        }
        Logger.e("AudioTrackRender", "setParameter failed, key not found");
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002a, code lost:
    
        if (r3 < r1) goto L4;
     */
    @Override // com.byted.cast.render.render.audio.IAudioRender
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setVolume(float r3) {
        /*
            r2 = this;
            float r1 = r2.max_vol
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L26
        L6:
            r3 = r1
        L7:
            r2.gain = r3
            android.media.AudioTrack r0 = r2.audioTrack
            if (r0 == 0) goto L25
            r0.setVolume(r3)
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            java.lang.String r0 = "AudioTrack setVolume: "
            r1.append(r0)
            r1.append(r3)
            java.lang.String r1 = X.X1D.LIZIZ(r1)
            java.lang.String r0 = "AudioTrackRender"
            com.byted.cast.render.utils.Logger.i(r0, r1)
        L25:
            return
        L26:
            float r1 = r2.min_vol
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto L7
            goto L6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.byted.cast.render.render.audio.AudioTrackRender.setVolume(float):void");
    }

    @Override // com.byted.cast.render.render.IRender
    public void render(byte[] bArr, int i) {
        AudioTrack audioTrack;
        if (bArr != null && (audioTrack = this.audioTrack) != null) {
            audioTrack.write(bArr, 0, i);
        }
    }

    @Override // com.byted.cast.render.render.IRender
    public void setParameter(MediaParameter mediaParameter, Object obj) {
        if (mediaParameter == MediaParameter.Audio_Render_routingChangedListener) {
            if (Build.VERSION.SDK_INT >= 24) {
                this.routingChangedListener = (AudioRouting.OnRoutingChangedListener) obj;
            }
        } else {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("[AudioTrackRender]: setParameter key not found! key: ");
            LIZ.append(mediaParameter);
            Logger.e("AudioTrackRender", X1D.LIZIZ(LIZ));
        }
    }

    @Override // com.byted.cast.render.render.audio.IAudioRender
    public void config_audio_parameters(int i, int i2, int i3) {
        this.sampleRate = i;
        this.channels = i2;
        this.bitWidth = i3;
    }
}
