package com.ss.ttlivestreamer.livestreamv2.capture;

import X.C06460Ne;
import X.C16880lQ;
import X.X1D;
import android.media.AudioManager;
import android.os.Handler;
import android.util.AndroidRuntimeException;
import com.ss.ttlivestreamer.core.buffer.WrapperNativeAudioBuffer;
import com.ss.ttlivestreamer.core.capture.audio.AudioCapturer;
import com.ss.ttlivestreamer.core.engine.AudioDeviceModule;
import com.ss.ttlivestreamer.core.engine.AudioSink;
import com.ss.ttlivestreamer.core.engine.MediaEngineFactory;
import com.ss.ttlivestreamer.core.utils.AVLog;
import com.ss.ttlivestreamer.core.utils.SafeHandlerThreadPoolExecutor;
import com.ss.ttlivestreamer.core.utils.TEBundle;
import com.ss.ttlivestreamer.core.utils.TTLSSladarBugReportUtils;
import com.ss.ttlivestreamer.core.utils.ThreadUtils;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.util.concurrent.Executor;

/* loaded from: classes12.dex */
public class LiveStreamAudioCaptureFromADM extends LiveStreamAudioCapture {
    public static final String TAG = C16880lQ.LJLLJ(LiveStreamAudioCaptureFromADM.class);
    public boolean mRecording;
    public boolean mReleased;
    public boolean mStoped;

    @Override // com.ss.ttlivestreamer.livestreamv2.capture.LiveStreamAudioCapture
    public int getCurrentCaptureDevice() {
        return 5;
    }

    @Override // com.ss.ttlivestreamer.core.capture.audio.AudioCapturer
    public boolean isMute() {
        final boolean[] zArr = {false};
        ThreadUtils.invokeAtFrontUninterruptibly(this.mHandler, new Runnable() { // from class: com.ss.ttlivestreamer.livestreamv2.capture.LiveStreamAudioCaptureFromADM.5
            @Override // java.lang.Runnable
            public void run() {
                com_ss_ttlivestreamer_livestreamv2_capture_LiveStreamAudioCaptureFromADM$5_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public void com_ss_ttlivestreamer_livestreamv2_capture_LiveStreamAudioCaptureFromADM$5__run$___twin___() {
                AudioDeviceModule audioDeviceModule = LiveStreamAudioCaptureFromADM.this.mADM;
                if (audioDeviceModule != null) {
                    zArr[0] = audioDeviceModule.isMute();
                }
            }

            public static void com_ss_ttlivestreamer_livestreamv2_capture_LiveStreamAudioCaptureFromADM$5_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass5 anonymousClass5) {
                boolean LIZ;
                try {
                    anonymousClass5.com_ss_ttlivestreamer_livestreamv2_capture_LiveStreamAudioCaptureFromADM$5__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }
        });
        return zArr[0];
    }

    @Override // com.ss.ttlivestreamer.core.capture.audio.AudioCapturer
    public void pause() {
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.capture.LiveStreamAudioCapture, com.ss.ttlivestreamer.core.capture.audio.AudioCapturer, com.ss.ttlivestreamer.core.engine.AudioSource, com.ss.ttlivestreamer.core.engine.NativeObject
    public synchronized void release() {
        String str = TAG;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("release this ");
        LIZ.append(this);
        AVLog.iod(str, X1D.LIZIZ(LIZ));
        if (this.mReleased) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("LiveStreamAudioCapture already released.");
            LIZ2.append(this);
            AVLog.e(str, X1D.LIZIZ(LIZ2));
            return;
        }
        this.mReleased = true;
        stop();
        ((LiveStreamAudioCapture) this).mObserver = null;
        long[] jArr = {-1};
        jArr[0] = ThreadUtils.invokeAtFrontUninterruptibly(this.mHandler, new Runnable() { // from class: com.ss.ttlivestreamer.livestreamv2.capture.LiveStreamAudioCaptureFromADM.10
            public void com_ss_ttlivestreamer_livestreamv2_capture_LiveStreamAudioCaptureFromADM$10__run$___twin___() {
            }

            @Override // java.lang.Runnable
            public void run() {
                com_ss_ttlivestreamer_livestreamv2_capture_LiveStreamAudioCaptureFromADM$10_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public static void com_ss_ttlivestreamer_livestreamv2_capture_LiveStreamAudioCaptureFromADM$10_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass10 anonymousClass10) {
                boolean LIZ3;
                try {
                    anonymousClass10.com_ss_ttlivestreamer_livestreamv2_capture_LiveStreamAudioCaptureFromADM$10__run$___twin___();
                } finally {
                    if (LIZ3) {
                    }
                }
            }
        }, 3000L);
        SafeHandlerThreadPoolExecutor.unlockThread(this.mThread);
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append("release this ");
        LIZ3.append(this);
        LIZ3.append(" done, ret ");
        LIZ3.append(jArr[0]);
        AVLog.iod(str, X1D.LIZIZ(LIZ3));
        super.superRelease();
    }

    @Override // com.ss.ttlivestreamer.core.capture.audio.AudioCapturer
    public void resume() {
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.capture.LiveStreamAudioCapture, com.ss.ttlivestreamer.core.capture.audio.AudioCapturer
    public synchronized void start() {
        this.mHandler.post(new Runnable() { // from class: com.ss.ttlivestreamer.livestreamv2.capture.LiveStreamAudioCaptureFromADM.6
            @Override // java.lang.Runnable
            public void run() {
                com_ss_ttlivestreamer_livestreamv2_capture_LiveStreamAudioCaptureFromADM$6_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public void com_ss_ttlivestreamer_livestreamv2_capture_LiveStreamAudioCaptureFromADM$6__run$___twin___() {
                LiveStreamAudioCaptureFromADM liveStreamAudioCaptureFromADM = LiveStreamAudioCaptureFromADM.this;
                if (liveStreamAudioCaptureFromADM.mRecording) {
                    return;
                }
                liveStreamAudioCaptureFromADM.mADM.startRecording();
                AVLog.iod(LiveStreamAudioCaptureFromADM.TAG, "start recording.");
                LiveStreamAudioCaptureFromADM.this.mRecording = true;
            }

            public static void com_ss_ttlivestreamer_livestreamv2_capture_LiveStreamAudioCaptureFromADM$6_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass6 anonymousClass6) {
                boolean LIZ;
                try {
                    anonymousClass6.com_ss_ttlivestreamer_livestreamv2_capture_LiveStreamAudioCaptureFromADM$6__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }
        });
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.capture.LiveStreamAudioCapture, com.ss.ttlivestreamer.core.engine.MediaSource
    public int status() {
        return 1;
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.capture.LiveStreamAudioCapture, com.ss.ttlivestreamer.core.capture.audio.AudioCapturer
    public synchronized void stop() {
        this.mHandler.post(new Runnable() { // from class: com.ss.ttlivestreamer.livestreamv2.capture.LiveStreamAudioCaptureFromADM.9
            @Override // java.lang.Runnable
            public void run() {
                com_ss_ttlivestreamer_livestreamv2_capture_LiveStreamAudioCaptureFromADM$9_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public void com_ss_ttlivestreamer_livestreamv2_capture_LiveStreamAudioCaptureFromADM$9__run$___twin___() {
                LiveStreamAudioCaptureFromADM liveStreamAudioCaptureFromADM = LiveStreamAudioCaptureFromADM.this;
                if (liveStreamAudioCaptureFromADM.mStoped || !liveStreamAudioCaptureFromADM.mRecording) {
                    return;
                }
                liveStreamAudioCaptureFromADM.mStoped = true;
                AudioDeviceModule audioDeviceModule = liveStreamAudioCaptureFromADM.mADM;
                if (audioDeviceModule != null) {
                    audioDeviceModule.stopRecording();
                }
                LiveStreamAudioCaptureFromADM.this.mRecording = false;
                AVLog.iod(LiveStreamAudioCaptureFromADM.TAG, "stop recording.");
            }

            public static void com_ss_ttlivestreamer_livestreamv2_capture_LiveStreamAudioCaptureFromADM$9_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass9 anonymousClass9) {
                boolean LIZ;
                try {
                    anonymousClass9.com_ss_ttlivestreamer_livestreamv2_capture_LiveStreamAudioCaptureFromADM$9__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }
        });
    }

    @Override // com.ss.ttlivestreamer.core.capture.audio.AudioCapturer
    public int getMode() {
        if (this.mADM.isVoIPMode()) {
            return 7;
        }
        return 1;
    }

    public void stopOnCurrentThread() {
        this.mHandler.post(new Runnable() { // from class: com.ss.ttlivestreamer.livestreamv2.capture.LiveStreamAudioCaptureFromADM.8
            @Override // java.lang.Runnable
            public void run() {
                com_ss_ttlivestreamer_livestreamv2_capture_LiveStreamAudioCaptureFromADM$8_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public void com_ss_ttlivestreamer_livestreamv2_capture_LiveStreamAudioCaptureFromADM$8__run$___twin___() {
                LiveStreamAudioCaptureFromADM liveStreamAudioCaptureFromADM = LiveStreamAudioCaptureFromADM.this;
                if (!liveStreamAudioCaptureFromADM.mRecording) {
                    return;
                }
                liveStreamAudioCaptureFromADM.mStoped = true;
                AudioDeviceModule audioDeviceModule = liveStreamAudioCaptureFromADM.mADM;
                if (audioDeviceModule != null) {
                    audioDeviceModule.stopRecordingOnCurrentThread();
                }
                LiveStreamAudioCaptureFromADM.this.mRecording = false;
                AVLog.iow(LiveStreamAudioCaptureFromADM.TAG, "stopRecordingOnCurrentThread");
            }

            public static void com_ss_ttlivestreamer_livestreamv2_capture_LiveStreamAudioCaptureFromADM$8_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass8 anonymousClass8) {
                boolean LIZ;
                try {
                    anonymousClass8.com_ss_ttlivestreamer_livestreamv2_capture_LiveStreamAudioCaptureFromADM$8__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }
        });
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.capture.LiveStreamAudioCapture
    public void toBackground() {
        this.mHandler.post(new Runnable() { // from class: com.ss.ttlivestreamer.livestreamv2.capture.LiveStreamAudioCaptureFromADM.2
            @Override // java.lang.Runnable
            public void run() {
                com_ss_ttlivestreamer_livestreamv2_capture_LiveStreamAudioCaptureFromADM$2_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public void com_ss_ttlivestreamer_livestreamv2_capture_LiveStreamAudioCaptureFromADM$2__run$___twin___() {
                boolean z;
                LiveStreamAudioCaptureFromADM liveStreamAudioCaptureFromADM = LiveStreamAudioCaptureFromADM.this;
                if (liveStreamAudioCaptureFromADM.mStoped) {
                    return;
                }
                AudioDeviceModule audioDeviceModule = liveStreamAudioCaptureFromADM.mADM;
                if (liveStreamAudioCaptureFromADM.mBGMMode == 4) {
                    z = true;
                } else {
                    z = false;
                }
                audioDeviceModule.disableLocalAudioStream(z);
                LiveStreamAudioCaptureFromADM.this.mADM.pause();
                String str = LiveStreamAudioCaptureFromADM.TAG;
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("toBackground with stop recording (");
                LIZ.append(LiveStreamAudioCaptureFromADM.this.mRecording);
                LIZ.append(") and disable stream (");
                LIZ.append(LiveStreamAudioCaptureFromADM.this.mADM.isDisableLocalAudioStream());
                LIZ.append(")");
                AVLog.iod(str, X1D.LIZIZ(LIZ));
            }

            public static void com_ss_ttlivestreamer_livestreamv2_capture_LiveStreamAudioCaptureFromADM$2_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass2 anonymousClass2) {
                boolean LIZ;
                try {
                    anonymousClass2.com_ss_ttlivestreamer_livestreamv2_capture_LiveStreamAudioCaptureFromADM$2__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }
        });
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.capture.LiveStreamAudioCapture
    public void toFront() {
        this.mHandler.post(new Runnable() { // from class: com.ss.ttlivestreamer.livestreamv2.capture.LiveStreamAudioCaptureFromADM.3
            @Override // java.lang.Runnable
            public void run() {
                com_ss_ttlivestreamer_livestreamv2_capture_LiveStreamAudioCaptureFromADM$3_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public void com_ss_ttlivestreamer_livestreamv2_capture_LiveStreamAudioCaptureFromADM$3__run$___twin___() {
                String str;
                LiveStreamAudioCaptureFromADM liveStreamAudioCaptureFromADM = LiveStreamAudioCaptureFromADM.this;
                if (liveStreamAudioCaptureFromADM.mStoped) {
                    return;
                }
                liveStreamAudioCaptureFromADM.mADM.disableLocalAudioStream(false);
                LiveStreamAudioCaptureFromADM.this.mADM.resume();
                String str2 = LiveStreamAudioCaptureFromADM.TAG;
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("toFront with ");
                if (LiveStreamAudioCaptureFromADM.this.mRecording) {
                    str = "start recording ";
                } else {
                    str = "stop recording";
                }
                LIZ.append(str);
                AVLog.iod(str2, X1D.LIZIZ(LIZ));
            }

            public static void com_ss_ttlivestreamer_livestreamv2_capture_LiveStreamAudioCaptureFromADM$3_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass3 anonymousClass3) {
                boolean LIZ;
                try {
                    anonymousClass3.com_ss_ttlivestreamer_livestreamv2_capture_LiveStreamAudioCaptureFromADM$3__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }
        });
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.capture.LiveStreamAudioCapture, com.ss.ttlivestreamer.core.capture.audio.AudioCapturer
    public int updateChannel() {
        return this.mADM.getParameter().getInt("audio_channels");
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.capture.LiveStreamAudioCapture
    public void addOriginAudioSink(AudioSink audioSink) {
        if (audioSink == null) {
            return;
        }
        AudioDeviceModule audioDeviceModule = this.mADM;
        if (audioDeviceModule != null && audioDeviceModule.isSeperateRecordingCallback()) {
            this.mADM.addAudioSink(3, audioSink);
        } else {
            super.addOriginAudioSink(audioSink);
        }
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.capture.LiveStreamAudioCapture, com.ss.ttlivestreamer.core.capture.audio.AudioCapturer
    public void mute(final boolean z) {
        this.mHandler.post(new Runnable() { // from class: com.ss.ttlivestreamer.livestreamv2.capture.LiveStreamAudioCaptureFromADM.4
            @Override // java.lang.Runnable
            public void run() {
                com_ss_ttlivestreamer_livestreamv2_capture_LiveStreamAudioCaptureFromADM$4_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public void com_ss_ttlivestreamer_livestreamv2_capture_LiveStreamAudioCaptureFromADM$4__run$___twin___() {
                LiveStreamAudioCaptureFromADM.this.mADM.setMicMute(z);
                String str = LiveStreamAudioCaptureFromADM.TAG;
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("set microphone mute ");
                LIZ.append(z);
                AVLog.iod(str, X1D.LIZIZ(LIZ));
            }

            public static void com_ss_ttlivestreamer_livestreamv2_capture_LiveStreamAudioCaptureFromADM$4_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass4 anonymousClass4) {
                boolean LIZ;
                try {
                    anonymousClass4.com_ss_ttlivestreamer_livestreamv2_capture_LiveStreamAudioCaptureFromADM$4__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }
        });
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.capture.LiveStreamAudioCapture
    public void removeAudioSink(AudioSink audioSink) {
        if (audioSink == null) {
            return;
        }
        AudioDeviceModule audioDeviceModule = this.mADM;
        if (audioDeviceModule != null && audioDeviceModule.isSeperateRecordingCallback()) {
            this.mADM.removeAudioSink(3, audioSink);
        } else {
            super.removeAudioSink(audioSink);
        }
    }

    @Override // com.ss.ttlivestreamer.core.capture.audio.AudioCapturer
    public void setAudioQuantizeGapPeriod(long j) {
        AudioDeviceModule audioDeviceModule = this.mADM;
        if (audioDeviceModule != null) {
            TEBundle parameter = audioDeviceModule.getParameter();
            parameter.setInt("adm_audio_record_power_gap_ms", (int) j);
            audioDeviceModule.setParameter(parameter);
        }
    }

    @Override // com.ss.ttlivestreamer.core.capture.audio.AudioCapturer
    public void setMode(int i) {
        String str = TAG;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Ignore switch mode(");
        LIZ.append(i);
        LIZ.append(") on ADM mode.");
        AVLog.iow(str, X1D.LIZIZ(LIZ));
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.capture.LiveStreamAudioCapture, com.ss.ttlivestreamer.core.capture.audio.AudioCapturer
    public void setVolume(double d) {
        AudioDeviceModule audioDeviceModule = this.mADM;
        if (audioDeviceModule != null) {
            audioDeviceModule.setMicVolume((float) d);
        }
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.capture.LiveStreamAudioCapture
    public void switchAudioMode(final int i) {
        this.mHandler.post(new Runnable() { // from class: com.ss.ttlivestreamer.livestreamv2.capture.LiveStreamAudioCaptureFromADM.1
            @Override // java.lang.Runnable
            public void run() {
                com_ss_ttlivestreamer_livestreamv2_capture_LiveStreamAudioCaptureFromADM$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public void com_ss_ttlivestreamer_livestreamv2_capture_LiveStreamAudioCaptureFromADM$1__run$___twin___() {
                boolean z;
                LiveStreamAudioCaptureFromADM liveStreamAudioCaptureFromADM = LiveStreamAudioCaptureFromADM.this;
                if (!liveStreamAudioCaptureFromADM.mStoped) {
                    if (7 == i) {
                        z = true;
                    } else {
                        z = false;
                    }
                    AudioDeviceModule audioDeviceModule = liveStreamAudioCaptureFromADM.mADM;
                    if (audioDeviceModule != null) {
                        audioDeviceModule.switchToVoIP(z);
                    }
                    String str = LiveStreamAudioCaptureFromADM.TAG;
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("switch to VoIP ");
                    LIZ.append(z);
                    AVLog.iod(str, X1D.LIZIZ(LIZ));
                }
            }

            public static void com_ss_ttlivestreamer_livestreamv2_capture_LiveStreamAudioCaptureFromADM$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass1 anonymousClass1) {
                boolean LIZ;
                try {
                    anonymousClass1.com_ss_ttlivestreamer_livestreamv2_capture_LiveStreamAudioCaptureFromADM$1__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }
        });
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.capture.LiveStreamAudioCapture
    public void switchSource(int i) {
        String str = TAG;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Ignore switch capture(");
        LIZ.append(i);
        LIZ.append(") on ADM mode.");
        AVLog.iow(str, X1D.LIZIZ(LIZ));
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.capture.LiveStreamAudioCapture
    public void unRegisterAudioRecordingCallback(AudioManager.AudioRecordingCallback audioRecordingCallback) {
        AndroidRuntimeException androidRuntimeException = new AndroidRuntimeException("NO Implement.");
        TTLSSladarBugReportUtils tTLSSladarBugReportUtils = TTLSSladarBugReportUtils.getInstance();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(TAG);
        LIZ.append(".unRegisterAudioRecordingCallback");
        tTLSSladarBugReportUtils.report(androidRuntimeException, X1D.LIZIZ(LIZ));
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.capture.LiveStreamAudioCapture, com.ss.ttlivestreamer.core.capture.audio.AudioCapturer.AudioCaptureObserver
    public void onAudioCaptureError(int i, Exception exc) {
        AudioCapturer.AudioCaptureObserver audioCaptureObserver = ((LiveStreamAudioCapture) this).mObserver;
        if (audioCaptureObserver != null) {
            audioCaptureObserver.onAudioCaptureError(i, exc);
        }
        String str = TAG;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onAudioCaptureError,code:");
        LIZ.append(i);
        LIZ.append(",");
        LIZ.append(this);
        AVLog.logKibana(5, str, X1D.LIZIZ(LIZ), exc);
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.capture.LiveStreamAudioCapture
    public void registerAudioRecordingCallback(Executor executor, AudioManager.AudioRecordingCallback audioRecordingCallback) {
        AndroidRuntimeException androidRuntimeException = new AndroidRuntimeException("NO Implement.");
        TTLSSladarBugReportUtils tTLSSladarBugReportUtils = TTLSSladarBugReportUtils.getInstance();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(TAG);
        LIZ.append(".registerAudioRecordingCallback");
        tTLSSladarBugReportUtils.report(androidRuntimeException, X1D.LIZIZ(LIZ));
    }

    public synchronized void startOnBackgroundOrMute(final boolean z, final boolean z2) {
        this.mHandler.post(new Runnable() { // from class: com.ss.ttlivestreamer.livestreamv2.capture.LiveStreamAudioCaptureFromADM.7
            @Override // java.lang.Runnable
            public void run() {
                com_ss_ttlivestreamer_livestreamv2_capture_LiveStreamAudioCaptureFromADM$7_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            /* JADX WARN: Code restructure failed: missing block: B:4:0x0007, code lost:
            
                if (r3 != false) goto L6;
             */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public void com_ss_ttlivestreamer_livestreamv2_capture_LiveStreamAudioCaptureFromADM$7__run$___twin___() {
                /*
                    r4 = this;
                    boolean r0 = r2
                    r3 = 1
                    if (r0 != 0) goto L57
                    boolean r0 = r3
                    if (r0 == 0) goto L42
                L9:
                    boolean r0 = r3
                    if (r0 == 0) goto L21
                    com.ss.ttlivestreamer.livestreamv2.capture.LiveStreamAudioCaptureFromADM r0 = com.ss.ttlivestreamer.livestreamv2.capture.LiveStreamAudioCaptureFromADM.this
                    com.ss.ttlivestreamer.core.engine.AudioDeviceModule r2 = r0.mADM
                    int r1 = r0.mBGMMode
                    r0 = 4
                    if (r1 != r0) goto L55
                    r0 = 1
                L17:
                    r2.disableLocalAudioStream(r0)
                    com.ss.ttlivestreamer.livestreamv2.capture.LiveStreamAudioCaptureFromADM r0 = com.ss.ttlivestreamer.livestreamv2.capture.LiveStreamAudioCaptureFromADM.this
                    com.ss.ttlivestreamer.core.engine.AudioDeviceModule r0 = r0.mADM
                    r0.pause()
                L21:
                    java.lang.String r2 = com.ss.ttlivestreamer.livestreamv2.capture.LiveStreamAudioCaptureFromADM.TAG
                    java.lang.StringBuilder r1 = X.X1D.LIZ()
                    java.lang.String r0 = "startOnBackgroundOrMute: paused "
                    r1.append(r0)
                    boolean r0 = r3
                    r1.append(r0)
                    java.lang.String r0 = ", muted "
                    r1.append(r0)
                    boolean r0 = r2
                    r1.append(r0)
                    java.lang.String r0 = X.X1D.LIZIZ(r1)
                    com.ss.ttlivestreamer.core.utils.AVLog.iod(r2, r0)
                L42:
                    com.ss.ttlivestreamer.livestreamv2.capture.LiveStreamAudioCaptureFromADM r0 = com.ss.ttlivestreamer.livestreamv2.capture.LiveStreamAudioCaptureFromADM.this
                    com.ss.ttlivestreamer.core.engine.AudioDeviceModule r0 = r0.mADM
                    r0.startRecording()
                    java.lang.String r1 = com.ss.ttlivestreamer.livestreamv2.capture.LiveStreamAudioCaptureFromADM.TAG
                    java.lang.String r0 = "start recording."
                    com.ss.ttlivestreamer.core.utils.AVLog.iod(r1, r0)
                    com.ss.ttlivestreamer.livestreamv2.capture.LiveStreamAudioCaptureFromADM r0 = com.ss.ttlivestreamer.livestreamv2.capture.LiveStreamAudioCaptureFromADM.this
                    r0.mRecording = r3
                    return
                L55:
                    r0 = 0
                    goto L17
                L57:
                    com.ss.ttlivestreamer.livestreamv2.capture.LiveStreamAudioCaptureFromADM r0 = com.ss.ttlivestreamer.livestreamv2.capture.LiveStreamAudioCaptureFromADM.this
                    com.ss.ttlivestreamer.core.engine.AudioDeviceModule r0 = r0.mADM
                    r0.setMicMute(r3)
                    goto L9
                */
                throw new UnsupportedOperationException("Method not decompiled: com.ss.ttlivestreamer.livestreamv2.capture.LiveStreamAudioCaptureFromADM.AnonymousClass7.com_ss_ttlivestreamer_livestreamv2_capture_LiveStreamAudioCaptureFromADM$7__run$___twin___():void");
            }

            public static void com_ss_ttlivestreamer_livestreamv2_capture_LiveStreamAudioCaptureFromADM$7_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass7 anonymousClass7) {
                boolean LIZ;
                try {
                    anonymousClass7.com_ss_ttlivestreamer_livestreamv2_capture_LiveStreamAudioCaptureFromADM$7__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }
        });
    }

    @Override // com.ss.ttlivestreamer.core.capture.audio.AudioCapturer
    public void setOutputFormat(int i, int i2, int i3) {
        nativeAdaptedOutputFormat(i, i2, i3);
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.capture.LiveStreamAudioCapture
    public void onData(WrapperNativeAudioBuffer wrapperNativeAudioBuffer, int i, int i2, int i3, long j) {
        throw new AndroidRuntimeException("Not should be here.");
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.capture.LiveStreamAudioCapture
    public void onData(Buffer buffer, int i, int i2, int i3, long j) {
        throw new AndroidRuntimeException("Not should be here.");
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.capture.LiveStreamAudioCapture
    public int pushAudioFrame(ByteBuffer byteBuffer, int i, int i2, int i3, int i4, long j) {
        throw new AndroidRuntimeException("No Implement");
    }

    public LiveStreamAudioCaptureFromADM(int i, int i2, int i3, int i4, int i5, int i6, Handler handler, AudioCapturer.AudioCaptureObserver audioCaptureObserver, MediaEngineFactory mediaEngineFactory, int i7, AudioDeviceModule audioDeviceModule) {
        super(i, i2, i3, i4, i5, i6, handler, audioCaptureObserver, null, i7);
        this.mADM = audioDeviceModule;
        String str = TAG;
        StringBuilder LIZJ = C06460Ne.LIZJ("Create LiveStreamAudioCaptureFromADM with bgmMode ", i7, " source ", i2, " this ");
        LIZJ.append(this);
        AVLog.iod(str, X1D.LIZIZ(LIZJ));
    }
}
