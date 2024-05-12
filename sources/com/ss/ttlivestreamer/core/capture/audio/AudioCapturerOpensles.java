package com.ss.ttlivestreamer.core.capture.audio;

import X.C0NY;
import android.os.Handler;
import android.os.Looper;
import com.ss.ttlivestreamer.core.capture.audio.AudioCapturer;

/* loaded from: classes12.dex */
public class AudioCapturerOpensles extends AudioCapturer {
    public AudioCapturer.AudioCaptureObserver mAudioCaptureObserver;
    public int mChannel;
    public Runnable mCheckRecordingRunnable;
    public Handler mHandler;
    public int mStat;

    private native void nativeCreate(int i, int i2, int i3, int i4);

    private native void nativePause();

    private native void nativeResume();

    private native int nativeStart();

    private native void nativeStop();

    public native boolean nativeRecording();

    @Override // com.ss.ttlivestreamer.core.capture.audio.AudioCapturer, com.ss.ttlivestreamer.core.engine.AudioSource, com.ss.ttlivestreamer.core.engine.NativeObject
    public synchronized void release() {
        stop();
        Handler handler = this.mHandler;
        if (handler != null) {
            handler.removeCallbacks(this.mCheckRecordingRunnable);
        }
        super.release();
    }

    @Override // com.ss.ttlivestreamer.core.capture.audio.AudioCapturer
    public synchronized void stop() {
        if (this.mStat != 2) {
            pause();
            nativeStop();
            this.mStat = 2;
        }
    }

    @Override // com.ss.ttlivestreamer.core.capture.audio.AudioCapturer
    public void start() {
        int nativeStart = nativeStart();
        if (nativeStart == 0) {
            this.mStat = 1;
            if (this.mHandler == null) {
                this.mHandler = new Handler(Looper.myLooper());
                this.mCheckRecordingRunnable = new Runnable() { // from class: com.ss.ttlivestreamer.core.capture.audio.AudioCapturerOpensles.1
                    @Override // java.lang.Runnable
                    public void run() {
                        com_ss_ttlivestreamer_core_capture_audio_AudioCapturerOpensles$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                    }

                    public void com_ss_ttlivestreamer_core_capture_audio_AudioCapturerOpensles$1__run$___twin___() {
                        AudioCapturer.AudioCaptureObserver audioCaptureObserver;
                        if (!AudioCapturerOpensles.this.nativeRecording() && (audioCaptureObserver = AudioCapturerOpensles.this.mAudioCaptureObserver) != null) {
                            audioCaptureObserver.onAudioCaptureError(-303, new Exception("OpenSL ES is not recording."));
                        }
                    }

                    public static void com_ss_ttlivestreamer_core_capture_audio_AudioCapturerOpensles$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass1 anonymousClass1) {
                        boolean LIZ;
                        try {
                            anonymousClass1.com_ss_ttlivestreamer_core_capture_audio_AudioCapturerOpensles$1__run$___twin___();
                        } finally {
                            if (LIZ) {
                            }
                        }
                    }
                };
            }
            Handler handler = this.mHandler;
            if (handler != null) {
                handler.postDelayed(this.mCheckRecordingRunnable, 3000L);
                return;
            }
            return;
        }
        throw new IllegalStateException(C0NY.LIZIZ("Start failure (", nativeStart, ")"));
    }

    @Override // com.ss.ttlivestreamer.core.capture.audio.AudioCapturer
    public void pause() {
        nativePause();
    }

    @Override // com.ss.ttlivestreamer.core.capture.audio.AudioCapturer
    public void resume() {
        nativeResume();
    }

    @Override // com.ss.ttlivestreamer.core.engine.MediaSource
    public int status() {
        return this.mStat;
    }

    @Override // com.ss.ttlivestreamer.core.capture.audio.AudioCapturer
    public int updateChannel() {
        return this.mChannel;
    }

    private void channelChange(int i) {
        this.mChannel = i;
    }

    public AudioCapturerOpensles(int i, int i2, int i3, AudioCapturer.AudioCaptureObserver audioCaptureObserver) {
        this(1, i, i2, i3, audioCaptureObserver);
    }

    public AudioCapturerOpensles(int i, int i2, int i3, int i4, AudioCapturer.AudioCaptureObserver audioCaptureObserver) {
        this.mChannel = i3;
        this.mAudioCaptureObserver = audioCaptureObserver;
        nativeCreate(i, i2, i3, i4);
        setMode(i);
    }
}
