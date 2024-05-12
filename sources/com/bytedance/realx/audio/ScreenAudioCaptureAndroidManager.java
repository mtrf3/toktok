package com.bytedance.realx.audio;

import X.C03880Dg;
import X.C04330Ez;
import X.C16880lQ;
import X.C65300Pk0;
import android.content.Context;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioPlaybackCaptureConfiguration;
import android.media.AudioRecord;
import android.media.projection.MediaProjection;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import com.bytedance.realx.audio.ScreenAudioCaptureAndroidManager;
import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadThread;
import java.lang.ref.WeakReference;

/* loaded from: classes33.dex */
public class ScreenAudioCaptureAndroidManager extends MediaProjection.Callback {
    public int mAudioMode;
    public AudioRecord mAudioRecord;
    public ScreenAudioCaptureObserver mCaptureObserver;
    public WeakReference<Context> mContextRef;
    public boolean mIsDisposed;
    public volatile boolean mIsRecording;
    public MediaProjection mMediaProjection;
    public Thread mRecordingThread;
    public Handler sHandler;
    public HandlerThread sHandlerThread;

    /* loaded from: classes33.dex */
    public static final class HOLDER {
        public static final ScreenAudioCaptureAndroidManager INSTANCE = new ScreenAudioCaptureAndroidManager();
    }

    public static void com_bytedance_realx_audio_ScreenAudioCaptureAndroidManager_android_media_AudioRecord_release(AudioRecord audioRecord) {
        C03880Dg c03880Dg = new C03880Dg(2);
        Object[] objArr = new Object[0];
        C65300Pk0 c65300Pk0 = new C65300Pk0(false, "()V", "-806686488013635846");
        if (c03880Dg.LIZJ(100403, "android/media/AudioRecord", "release", audioRecord, objArr, "void", c65300Pk0).LIZ) {
            c03880Dg.LIZIZ(100403, "android/media/AudioRecord", "release", null, objArr, audioRecord, c65300Pk0, false);
        } else {
            audioRecord.release();
            c03880Dg.LIZIZ(100403, "android/media/AudioRecord", "release", null, objArr, audioRecord, c65300Pk0, true);
        }
    }

    public static void com_bytedance_realx_audio_ScreenAudioCaptureAndroidManager_android_media_AudioRecord_startRecording(AudioRecord audioRecord) {
        C03880Dg c03880Dg = new C03880Dg(2);
        Object[] objArr = new Object[0];
        C65300Pk0 c65300Pk0 = new C65300Pk0(false, "()V", "-806686488013635846");
        if (c03880Dg.LIZJ(100400, "android/media/AudioRecord", "startRecording", audioRecord, objArr, "void", c65300Pk0).LIZ) {
            c03880Dg.LIZIZ(100400, "android/media/AudioRecord", "startRecording", null, objArr, audioRecord, c65300Pk0, false);
        } else {
            audioRecord.startRecording();
            c03880Dg.LIZIZ(100400, "android/media/AudioRecord", "startRecording", null, objArr, audioRecord, c65300Pk0, true);
        }
    }

    public static void com_bytedance_realx_audio_ScreenAudioCaptureAndroidManager_android_media_AudioRecord_stop(AudioRecord audioRecord) {
        C03880Dg c03880Dg = new C03880Dg(2);
        Object[] objArr = new Object[0];
        C65300Pk0 c65300Pk0 = new C65300Pk0(false, "()V", "-806686488013635846");
        if (c03880Dg.LIZJ(100401, "android/media/AudioRecord", "stop", audioRecord, objArr, "void", c65300Pk0).LIZ) {
            c03880Dg.LIZIZ(100401, "android/media/AudioRecord", "stop", null, objArr, audioRecord, c65300Pk0, false);
        } else {
            audioRecord.stop();
            c03880Dg.LIZIZ(100401, "android/media/AudioRecord", "stop", null, objArr, audioRecord, c65300Pk0, true);
        }
    }

    public void dispose() {
        this.mIsDisposed = true;
    }

    private void checkNotDisposed() {
        if (!this.mIsDisposed) {
        } else {
            throw new RuntimeException("screen audio capturer is disposed.");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void doRun() {
        AudioRecord audioRecord;
        short[] sArr = new short[1024];
        while (this.mIsRecording && (audioRecord = this.mAudioRecord) != null) {
            if (audioRecord.read(sArr, 0, 1024) >= 0) {
                byte[] short2byte = short2byte(sArr);
                ScreenAudioCaptureObserver screenAudioCaptureObserver = this.mCaptureObserver;
                if (screenAudioCaptureObserver == null) {
                    return;
                } else {
                    screenAudioCaptureObserver.onAudioFrameCapture(short2byte, 1024, 48000, 1);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void stopAudioCapture_() {
        if (Build.VERSION.SDK_INT <= 28 || !this.mIsRecording) {
            return;
        }
        this.mIsRecording = false;
        AudioRecord audioRecord = this.mAudioRecord;
        if (audioRecord != null) {
            com_bytedance_realx_audio_ScreenAudioCaptureAndroidManager_android_media_AudioRecord_stop(audioRecord);
            com_bytedance_realx_audio_ScreenAudioCaptureAndroidManager_android_media_AudioRecord_release(this.mAudioRecord);
            this.mAudioRecord = null;
        }
        this.mCaptureObserver.onCapturerStopped();
        this.mMediaProjection = null;
    }

    public ScreenAudioCaptureAndroidManager() {
        HandlerThread handlerThread = new HandlerThread("sdk-audio-share");
        this.sHandlerThread = handlerThread;
        handlerThread.start();
        this.sHandler = new Handler(this.sHandlerThread.getLooper());
        this.mIsRecording = false;
        this.mCaptureObserver = null;
        this.mAudioRecord = null;
        this.mRecordingThread = null;
        this.mIsDisposed = false;
    }

    @Override // android.media.projection.MediaProjection.Callback
    public void onStop() {
        super.onStop();
        stopAudioCapture_();
    }

    public void stopAudioCapture() {
        checkNotDisposed();
        MediaProjection mediaProjection = this.mMediaProjection;
        if (mediaProjection != null) {
            mediaProjection.unregisterCallback(this);
        }
        this.sHandler.removeCallbacksAndMessages(null);
        this.sHandler.post(new Runnable() { // from class: X.ZUV
            @Override // java.lang.Runnable
            public final void run() {
                ScreenAudioCaptureAndroidManager.this.stopAudioCapture_();
            }
        });
    }

    public static ScreenAudioCaptureAndroidManager INSTANCE() {
        return HOLDER.INSTANCE;
    }

    private void setMusicMode(boolean z) {
        AudioManager audioManager = (AudioManager) C16880lQ.LLILL(this.mContextRef.get(), "audio");
        try {
            if (z) {
                this.mAudioMode = audioManager.getMode();
                audioManager.setMode(0);
            } else {
                audioManager.setMode(this.mAudioMode);
            }
        } catch (Exception unused) {
        }
    }

    private byte[] short2byte(short[] sArr) {
        int length = sArr.length;
        byte[] bArr = new byte[length * 2];
        for (int i = 0; i < length; i++) {
            int i2 = i * 2;
            short s = sArr[i];
            bArr[i2] = (byte) (s & 255);
            bArr[i2 + 1] = (byte) (s >> 8);
            sArr[i] = 0;
        }
        return bArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: startAudioCapture_, reason: merged with bridge method [inline-methods] */
    public void lambda$startAudioCapture$0(MediaProjection mediaProjection) {
        if (Build.VERSION.SDK_INT <= 28 || this.mIsRecording) {
            return;
        }
        this.mMediaProjection = mediaProjection;
        if (mediaProjection == null) {
            return;
        }
        try {
            AudioRecord build = new AudioRecord.Builder().setAudioFormat(new AudioFormat.Builder().setEncoding(2).setSampleRate(48000).setChannelMask(16).build()).setBufferSizeInBytes(2048).setAudioPlaybackCaptureConfig(new AudioPlaybackCaptureConfiguration.Builder(this.mMediaProjection).addMatchingUsage(1).addMatchingUsage(14).addMatchingUsage(0).build()).build();
            this.mAudioRecord = build;
            if (build.getState() == 0) {
                hasPermissions(this.mContextRef.get(), "android.permission.RECORD_AUDIO");
                this.mAudioRecord = null;
                return;
            }
            this.mMediaProjection.registerCallback(this, this.sHandler);
            this.mCaptureObserver.onCapturerStarted();
            setMusicMode(true);
            this.mIsRecording = true;
            com_bytedance_realx_audio_ScreenAudioCaptureAndroidManager_android_media_AudioRecord_startRecording(this.mAudioRecord);
            PthreadThread pthreadThread = new PthreadThread(new Runnable() { // from class: X.ZUX
                @Override // java.lang.Runnable
                public final void run() {
                    ScreenAudioCaptureAndroidManager.this.doRun();
                }
            }, "ScreenAudioCaptureAndroidManager");
            this.mRecordingThread = pthreadThread;
            pthreadThread.start();
            setMusicMode(false);
        } catch (UnsupportedOperationException unused) {
        }
    }

    public void startAudioCapture(final MediaProjection mediaProjection) {
        checkNotDisposed();
        this.sHandler.post(new Runnable() { // from class: X.ZUW
            @Override // java.lang.Runnable
            public final void run() {
                ScreenAudioCaptureAndroidManager.this.lambda$startAudioCapture$0(mediaProjection);
            }
        });
    }

    public static boolean hasPermissions(Context context, String... strArr) {
        if (Build.VERSION.SDK_INT < 23) {
            return true;
        }
        for (String str : strArr) {
            if (!selfPermissionGranted(context, str)) {
                return false;
            }
        }
        return true;
    }

    public static boolean selfPermissionGranted(Context context, String str) {
        if (Build.VERSION.SDK_INT < 23) {
            return true;
        }
        if (context.getApplicationInfo().targetSdkVersion >= 23) {
            if (context.checkSelfPermission(str) == 0) {
                return true;
            }
        } else if (C04330Ez.LIZ(context, str) == 0) {
            return true;
        }
        return false;
    }

    public void initialize(Context context, ScreenAudioCaptureObserver screenAudioCaptureObserver) {
        if (screenAudioCaptureObserver != null) {
            this.mCaptureObserver = screenAudioCaptureObserver;
            this.mContextRef = new WeakReference<>(context);
            this.mIsDisposed = false;
            return;
        }
        throw new RuntimeException("audio capture observer not set.");
    }
}
