package com.byted.cast.sdk.render.audio;

import X.C16880lQ;
import X.X1D;
import com.byted.cast.sdk.RTCAudioProfile;
import com.byted.cast.sdk.log.Logger;
import com.byted.cast.sdk.log.LoggerManager;
import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadThread;

/* loaded from: classes29.dex */
public class FastPlayer {
    public long enginehandle;
    public byte[] mAudioBuffer;
    public IAudioFrameReader mAudioFrameReader;
    public Runnable mAudioPlayRunnable = new Runnable() { // from class: com.byted.cast.sdk.render.audio.FastPlayer.1
        @Override // java.lang.Runnable
        public void run() {
            com_byted_cast_sdk_render_audio_FastPlayer$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
        }

        public void com_byted_cast_sdk_render_audio_FastPlayer$1__run$___twin___() {
            while (!FastPlayer.this.mIsLoopExit) {
                FastPlayer fastPlayer = FastPlayer.this;
                int readAudioFrame = fastPlayer.mAudioFrameReader.readAudioFrame(fastPlayer.mAudioBuffer);
                FastPlayer fastPlayer2 = FastPlayer.this;
                byte[] bArr = fastPlayer2.mAudioBuffer;
                if (readAudioFrame == bArr.length) {
                    fastPlayer2.playback(bArr);
                }
            }
        }

        public static void com_byted_cast_sdk_render_audio_FastPlayer$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass1 anonymousClass1) {
            boolean LIZ;
            try {
                anonymousClass1.com_byted_cast_sdk_render_audio_FastPlayer$1__run$___twin___();
            } finally {
                if (LIZ) {
                }
            }
        }
    };
    public volatile boolean mIsLoopExit;
    public volatile boolean mIsPlayStarted;
    public Logger mLogger;
    public String mMirrorId;
    public Thread mPlayThread;

    /* loaded from: classes29.dex */
    public interface IAudioFrameReader {
        int readAudioFrame(byte[] bArr);
    }

    private native long native_setup();

    private native int native_start(long j);

    private native void native_stop(long j);

    private native int native_write(long j, byte[] bArr, int i);

    static {
        C16880lQ.LLJJJIL("oboeplayer_jni");
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
            this.mLogger.e("FastPlayer", e.getMessage());
        }
        native_stop(this.enginehandle);
        this.mIsPlayStarted = false;
        this.mLogger.d("FastPlayer", "FastPlayer stop success !");
    }

    public boolean isStarted() {
        return this.mIsPlayStarted;
    }

    public boolean playback(byte[] bArr) {
        return playback(bArr, 0, bArr.length);
    }

    public FastPlayer(IAudioFrameReader iAudioFrameReader, String str) {
        this.mMirrorId = str;
        this.mLogger = LoggerManager.getLogger(str);
        this.mAudioFrameReader = iAudioFrameReader;
        if (this.enginehandle == 0) {
            this.enginehandle = native_setup();
        }
    }

    private boolean playback(byte[] bArr, int i, int i2) {
        if (!this.mIsPlayStarted) {
            this.mLogger.e("FastPlayer", "Player not started !");
            return false;
        }
        native_write(this.enginehandle, bArr, i2);
        return true;
    }

    public boolean start(int i, int i2, int i3, int i4) {
        if (this.mIsPlayStarted) {
            return false;
        }
        native_start(this.enginehandle);
        this.mAudioBuffer = new byte[RTCAudioProfile.getFrameSize(i2)];
        this.mIsLoopExit = false;
        PthreadThread pthreadThread = new PthreadThread(this.mAudioPlayRunnable, "FastPlayerThread");
        this.mPlayThread = pthreadThread;
        pthreadThread.setPriority(10);
        this.mPlayThread.start();
        this.mIsPlayStarted = true;
        Logger logger = this.mLogger;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("FastPlayer start success: ");
        LIZ.append(i2);
        LIZ.append(", ");
        LIZ.append(i3);
        LIZ.append(", ");
        LIZ.append(i4);
        logger.d("FastPlayer", X1D.LIZIZ(LIZ));
        return true;
    }
}
