package com.byted.cast.sdk.render.audio;

import X.X1D;
import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioRouting;
import android.media.AudioTrack;
import android.os.Build;
import android.os.Handler;
import com.byted.cast.common.CastLogger;
import com.byted.cast.common.ContextManager;
import com.byted.cast.sdk.RTCAudioProfile;
import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadThread;

/* loaded from: classes29.dex */
public class AudioActivePlayer {
    public byte[] mAudioBuffer;
    public IAudioFrameReader mAudioFrameReader;
    public Runnable mAudioPlayRunnable = new Runnable() { // from class: com.byted.cast.sdk.render.audio.AudioActivePlayer.1
        @Override // java.lang.Runnable
        public void run() {
            com_byted_cast_sdk_render_audio_AudioActivePlayer$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
        }

        public void com_byted_cast_sdk_render_audio_AudioActivePlayer$1__run$___twin___() {
            while (!AudioActivePlayer.this.mIsLoopExit) {
                AudioActivePlayer audioActivePlayer = AudioActivePlayer.this;
                int readAudioFrame = audioActivePlayer.mAudioFrameReader.readAudioFrame(audioActivePlayer.mAudioBuffer);
                AudioActivePlayer audioActivePlayer2 = AudioActivePlayer.this;
                byte[] bArr = audioActivePlayer2.mAudioBuffer;
                if (readAudioFrame == bArr.length) {
                    audioActivePlayer2.playback(bArr);
                }
            }
        }

        public static void com_byted_cast_sdk_render_audio_AudioActivePlayer$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass1 anonymousClass1) {
            boolean LIZ;
            try {
                anonymousClass1.com_byted_cast_sdk_render_audio_AudioActivePlayer$1__run$___twin___();
            } finally {
                if (LIZ) {
                }
            }
        }
    };
    public AudioTrack mAudioTrack;
    public ContextManager.CastContext mCastContext;
    public volatile boolean mIsLoopExit;
    public volatile boolean mIsPlayStarted;
    public CastLogger mLogger;
    public Thread mPlayThread;

    /* loaded from: classes29.dex */
    public interface IAudioFrameReader {
        int readAudioFrame(byte[] bArr);
    }

    public int getCurrentSampleRate() {
        AudioTrack audioTrack = this.mAudioTrack;
        if (audioTrack != null) {
            return audioTrack.getSampleRate();
        }
        this.mLogger.w("AudioActivePlayer", "can not get sample rate, mAudioTrack is null!");
        return -1;
    }

    public void stop() {
        if (!this.mIsPlayStarted) {
            return;
        }
        this.mIsLoopExit = true;
        try {
            this.mPlayThread.interrupt();
            this.mPlayThread.join(1000L);
        } catch (InterruptedException e) {
            this.mLogger.e("AudioActivePlayer", e.getMessage());
        }
        if (this.mAudioTrack.getPlayState() == 3) {
            this.mAudioTrack.stop();
        }
        this.mAudioTrack.release();
        this.mIsPlayStarted = false;
        this.mLogger.d("AudioActivePlayer", "AudioPlayer stop success !");
    }

    public boolean isStarted() {
        return this.mIsPlayStarted;
    }

    public boolean playback(byte[] bArr) {
        return playback(bArr, 0, bArr.length);
    }

    public void setOnRoutingChangedListener(AudioRouting.OnRoutingChangedListener onRoutingChangedListener) {
        AudioTrack audioTrack = this.mAudioTrack;
        if (audioTrack != null && Build.VERSION.SDK_INT >= 24) {
            audioTrack.addOnRoutingChangedListener(onRoutingChangedListener, (Handler) null);
        }
    }

    public AudioActivePlayer(IAudioFrameReader iAudioFrameReader, ContextManager.CastContext castContext) {
        this.mAudioFrameReader = iAudioFrameReader;
        this.mCastContext = castContext;
        this.mLogger = ContextManager.getLogger(castContext);
    }

    private boolean playback(byte[] bArr, int i, int i2) {
        if (!this.mIsPlayStarted) {
            this.mLogger.e("AudioActivePlayer", "Player not started !");
            return false;
        }
        if (this.mAudioTrack.write(bArr, i, i2) != i2) {
            this.mLogger.e("AudioActivePlayer", "Could not write all the samples to the audio device !");
        }
        if (this.mIsPlayStarted) {
            this.mAudioTrack.play();
            return true;
        }
        return true;
    }

    public boolean start(int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        if (this.mIsPlayStarted) {
            return false;
        }
        if (i3 == 1) {
            i5 = 4;
        } else {
            i5 = 12;
        }
        if (i4 == 8) {
            i6 = 3;
        } else {
            i6 = 2;
        }
        int minBufferSize = AudioTrack.getMinBufferSize(i2, i5, i6);
        if (minBufferSize == -2) {
            this.mLogger.e("AudioActivePlayer", "Invalid parameter !");
            return false;
        }
        if (Build.VERSION.SDK_INT >= 26) {
            this.mAudioTrack = new AudioTrack.Builder().setAudioAttributes(new AudioAttributes.Builder().setUsage(1).setContentType(2).build()).setPerformanceMode(1).setAudioFormat(new AudioFormat.Builder().setSampleRate(i2).setEncoding(i6).setChannelMask(i5).build()).setTransferMode(1).setBufferSizeInBytes(minBufferSize).build();
        } else {
            this.mAudioTrack = new AudioTrack(i, i2, i5, i6, minBufferSize, 1);
        }
        if (this.mAudioTrack.getState() == 0) {
            this.mLogger.e("AudioActivePlayer", "AudioTrack initialize fail !");
            return false;
        }
        this.mAudioBuffer = new byte[RTCAudioProfile.getFrameSize(i2)];
        this.mIsLoopExit = false;
        PthreadThread pthreadThread = new PthreadThread(this.mAudioPlayRunnable, "AudioPlayerThread");
        this.mPlayThread = pthreadThread;
        pthreadThread.setPriority(10);
        this.mPlayThread.start();
        this.mIsPlayStarted = true;
        CastLogger castLogger = this.mLogger;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AudioPlayer start success: ");
        LIZ.append(i2);
        LIZ.append(", ");
        LIZ.append(i3);
        LIZ.append(", ");
        LIZ.append(i4);
        LIZ.append(", ");
        LIZ.append(minBufferSize);
        castLogger.d("AudioActivePlayer", X1D.LIZIZ(LIZ));
        return true;
    }
}
