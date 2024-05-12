package com.ss.ttlivestreamer.livestreamv2.capture;

import X.AnonymousClass028;
import X.C15890jp;
import X.C16880lQ;
import X.C61845OOz;
import X.C76965UIn;
import X.X1D;
import android.media.AudioManager;
import android.os.Handler;
import android.util.AndroidRuntimeException;
import com.ss.ttlivestreamer.core.buffer.WrapperNativeAudioBuffer;
import com.ss.ttlivestreamer.core.capture.audio.AudioCapturer;
import com.ss.ttlivestreamer.core.capture.audio.AudioCapturerAudioRecord;
import com.ss.ttlivestreamer.core.capture.audio.AudioCapturerFromADM;
import com.ss.ttlivestreamer.core.capture.audio.AudioCapturerOpensles;
import com.ss.ttlivestreamer.core.engine.AudioDeviceModule;
import com.ss.ttlivestreamer.core.engine.AudioSink;
import com.ss.ttlivestreamer.core.engine.AudioTrack;
import com.ss.ttlivestreamer.core.engine.MediaEngineFactory;
import com.ss.ttlivestreamer.core.utils.AVLog;
import com.ss.ttlivestreamer.core.utils.SafeHandlerThread;
import com.ss.ttlivestreamer.core.utils.SafeHandlerThreadPoolExecutor;
import com.ss.ttlivestreamer.core.utils.ThreadUtils;
import com.ss.ttlivestreamer.core.utils.TimeUtils;
import com.ss.ttlivestreamer.core.utils.TokenCertConfigUtils;
import com.ss.ttlivestreamer.livestreamv2.ILiveStream;
import java.lang.ref.WeakReference;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.util.concurrent.Executor;

/* loaded from: classes12.dex */
public class LiveStreamAudioCapture extends AudioCapturer implements AudioCapturer.AudioCaptureObserver {
    public AudioCapturer mAudioCapturer;
    public AudioSink mAudioSink;
    public AudioTrack mAudioTrack;
    public final int mBGMMode;
    public long mBGMTimestampDeltaUs;
    public boolean mBackgroundMode;
    public final int mBitwidth;
    public final int mChannle;
    public Handler mHandler;
    public WeakReference<ILiveStream.ILiveStreamInfoListener> mInfoListener;
    public int mLastOnPauseSource;
    public int mLastSourceOnMute;
    public long mLastTimestampUs;
    public MediaEngineFactory mMediaEngineFactory;
    public ByteBuffer mMute10MsAudioFrame;
    public AudioCapturer.AudioCaptureObserver mObserver;
    public Runnable mPeriodMuteAudioFrameRunable;
    public final int mSample;
    public int mSource;
    public int mStatus;
    public SafeHandlerThread mThread;
    public boolean mTryOpening;
    public int mscreenAudioCaptureDelayMicPackage;
    public Object releaseFence;

    /* loaded from: classes12.dex */
    public class AudioCaptureMuteSource extends AudioCapturer {
        public int mStat;

        @Override // com.ss.ttlivestreamer.core.capture.audio.AudioCapturer
        public void start() {
            if (this.mStat == 0) {
                LiveStreamAudioCapture.this.mHandler.post(new Runnable() { // from class: com.ss.ttlivestreamer.livestreamv2.capture.LiveStreamAudioCapture.AudioCaptureMuteSource.1
                    @Override // java.lang.Runnable
                    public void run() {
                        com_ss_ttlivestreamer_livestreamv2_capture_LiveStreamAudioCapture$AudioCaptureMuteSource$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                    }

                    public void com_ss_ttlivestreamer_livestreamv2_capture_LiveStreamAudioCapture$AudioCaptureMuteSource$1__run$___twin___() {
                        LiveStreamAudioCapture liveStreamAudioCapture = LiveStreamAudioCapture.this;
                        liveStreamAudioCapture.mSource = 6;
                        liveStreamAudioCapture.onTriggerPeriodFrame();
                    }

                    public static void com_ss_ttlivestreamer_livestreamv2_capture_LiveStreamAudioCapture$AudioCaptureMuteSource$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass1 anonymousClass1) {
                        boolean LIZ;
                        try {
                            anonymousClass1.com_ss_ttlivestreamer_livestreamv2_capture_LiveStreamAudioCapture$AudioCaptureMuteSource$1__run$___twin___();
                        } finally {
                            if (LIZ) {
                            }
                        }
                    }
                });
                this.mStat = 1;
            }
        }

        @Override // com.ss.ttlivestreamer.core.capture.audio.AudioCapturer
        public void stop() {
            if (this.mStat == 1) {
                LiveStreamAudioCapture liveStreamAudioCapture = LiveStreamAudioCapture.this;
                liveStreamAudioCapture.mHandler.removeCallbacks(liveStreamAudioCapture.mPeriodMuteAudioFrameRunable);
                this.mStat = 0;
            }
        }

        @Override // com.ss.ttlivestreamer.core.capture.audio.AudioCapturer
        public int updateChannel() {
            return LiveStreamAudioCapture.this.mChannle;
        }

        @Override // com.ss.ttlivestreamer.core.capture.audio.AudioCapturer, com.ss.ttlivestreamer.core.engine.AudioSource, com.ss.ttlivestreamer.core.engine.NativeObject
        public void release() {
            stop();
            this.mStat = 2;
        }

        @Override // com.ss.ttlivestreamer.core.engine.MediaSource
        public int status() {
            return this.mStat;
        }

        public AudioCaptureMuteSource(int i, int i2) {
        }

        public void onData(Buffer buffer, int i, int i2, int i3, long j) {
            nativeOnData(buffer, i, i2, i3, j);
        }
    }

    @Override // com.ss.ttlivestreamer.core.capture.audio.AudioCapturer, com.ss.ttlivestreamer.core.engine.AudioSource, com.ss.ttlivestreamer.core.engine.NativeObject
    public synchronized void release() {
        AVLog.iow("LiveStreamAudioCapture", "Release at LiveStreamAudioCapture ...");
        stop();
        ThreadUtils.invokeAtFrontUninterruptibly(this.mHandler, new Runnable() { // from class: com.ss.ttlivestreamer.livestreamv2.capture.LiveStreamAudioCapture.11
            @Override // java.lang.Runnable
            public void run() {
                com_ss_ttlivestreamer_livestreamv2_capture_LiveStreamAudioCapture$11_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public void com_ss_ttlivestreamer_livestreamv2_capture_LiveStreamAudioCapture$11__run$___twin___() {
                AudioSink audioSink = LiveStreamAudioCapture.this.mAudioSink;
                if (audioSink != null) {
                    audioSink.release();
                    LiveStreamAudioCapture.this.mAudioSink = null;
                }
                LiveStreamAudioCapture liveStreamAudioCapture = LiveStreamAudioCapture.this;
                Handler handler = liveStreamAudioCapture.mHandler;
                if (handler != null) {
                    handler.removeCallbacks(liveStreamAudioCapture.mPeriodMuteAudioFrameRunable);
                }
                SafeHandlerThread safeHandlerThread = LiveStreamAudioCapture.this.mThread;
                if (safeHandlerThread != null) {
                    SafeHandlerThreadPoolExecutor.unlockThread(safeHandlerThread);
                    LiveStreamAudioCapture.this.mThread = null;
                }
            }

            public static void com_ss_ttlivestreamer_livestreamv2_capture_LiveStreamAudioCapture$11_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass11 anonymousClass11) {
                boolean LIZ;
                try {
                    anonymousClass11.com_ss_ttlivestreamer_livestreamv2_capture_LiveStreamAudioCapture$11__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }
        });
        synchronized (this.releaseFence) {
            super.release();
        }
        AVLog.ioi("LiveStreamAudioCapture", "Release at LiveStreamAudioCapture done");
    }

    @Override // com.ss.ttlivestreamer.core.capture.audio.AudioCapturer
    public void start() {
        final Exception[] excArr = new Exception[1];
        ThreadUtils.invokeAtFrontUninterruptibly(this.mHandler, new Runnable() { // from class: com.ss.ttlivestreamer.livestreamv2.capture.LiveStreamAudioCapture.9
            @Override // java.lang.Runnable
            public void run() {
                com_ss_ttlivestreamer_livestreamv2_capture_LiveStreamAudioCapture$9_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public void com_ss_ttlivestreamer_livestreamv2_capture_LiveStreamAudioCapture$9__run$___twin___() {
                if (LiveStreamAudioCapture.this.status() == 1) {
                    return;
                }
                LiveStreamAudioCapture liveStreamAudioCapture = LiveStreamAudioCapture.this;
                if (liveStreamAudioCapture.mAudioCapturer != null) {
                    liveStreamAudioCapture.mObserver.onAudioCaptureError(-307, new Exception("on live audio capture status exception call."));
                    return;
                }
                try {
                    liveStreamAudioCapture.onCreateAndStart(liveStreamAudioCapture.mSource);
                } catch (Exception e) {
                    excArr[0] = e;
                    C16880lQ.LLLLIIL(e);
                }
            }

            public static void com_ss_ttlivestreamer_livestreamv2_capture_LiveStreamAudioCapture$9_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass9 anonymousClass9) {
                boolean LIZ;
                try {
                    anonymousClass9.com_ss_ttlivestreamer_livestreamv2_capture_LiveStreamAudioCapture$9__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }
        });
        if (excArr[0] == null) {
        } else {
            throw new IllegalStateException(excArr[0].getCause());
        }
    }

    @Override // com.ss.ttlivestreamer.core.capture.audio.AudioCapturer
    public synchronized void stop() {
        ThreadUtils.invokeAtFrontUninterruptibly(this.mHandler, new Runnable() { // from class: com.ss.ttlivestreamer.livestreamv2.capture.LiveStreamAudioCapture.10
            @Override // java.lang.Runnable
            public void run() {
                com_ss_ttlivestreamer_livestreamv2_capture_LiveStreamAudioCapture$10_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public void com_ss_ttlivestreamer_livestreamv2_capture_LiveStreamAudioCapture$10__run$___twin___() {
                LiveStreamAudioCapture.this.onReleaseCapture();
                LiveStreamAudioCapture.this.onSetStatus(2);
            }

            public static void com_ss_ttlivestreamer_livestreamv2_capture_LiveStreamAudioCapture$10_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass10 anonymousClass10) {
                boolean LIZ;
                try {
                    anonymousClass10.com_ss_ttlivestreamer_livestreamv2_capture_LiveStreamAudioCapture$10__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }
        });
    }

    /* loaded from: classes12.dex */
    public class WrapperAudioCaptureExtern extends AudioCapturerExternal {
        public int mStatus;

        @Override // com.ss.ttlivestreamer.livestreamv2.capture.AudioCapturerExternal, com.ss.ttlivestreamer.core.capture.audio.AudioCapturer
        public synchronized void stop() {
            super.stop();
            this.mStatus = 2;
        }

        @Override // com.ss.ttlivestreamer.livestreamv2.capture.AudioCapturerExternal, com.ss.ttlivestreamer.core.capture.audio.AudioCapturer
        public void start() {
            super.start();
            this.mStatus = 1;
        }

        @Override // com.ss.ttlivestreamer.livestreamv2.capture.AudioCapturerExternal, com.ss.ttlivestreamer.core.engine.MediaSource
        public int status() {
            return this.mStatus;
        }

        @Override // com.ss.ttlivestreamer.livestreamv2.capture.AudioCapturerExternal
        public void onData(Buffer buffer, int i, int i2, int i3, long j) {
            LiveStreamAudioCapture.this.onData(buffer, i, i2, i3, j);
        }

        public WrapperAudioCaptureExtern(int i, int i2, int i3, Handler handler, AudioCapturer.AudioCaptureObserver audioCaptureObserver) {
            super(i, i2, i3, handler, audioCaptureObserver);
        }
    }

    public boolean needTriggerOnceMore() {
        boolean z = this.mBackgroundMode;
        if (z && this.mBGMMode == 4) {
            return false;
        }
        if (!this.mMute && this.mSource != 6 && !z) {
            return false;
        }
        return true;
    }

    public void onPause() {
        AudioCapturer audioCapturer = this.mAudioCapturer;
        if (audioCapturer == null || (audioCapturer instanceof AudioCapturerExternal)) {
            return;
        }
        this.mBackgroundMode = true;
        this.mADM.pause();
        AudioCapturer audioCapturer2 = this.mAudioCapturer;
        if (audioCapturer2 != null && (audioCapturer2 instanceof AudioCapturerFromADM)) {
            this.mADM.stopRecording();
            return;
        }
        int i = this.mSource;
        this.mLastOnPauseSource = i;
        if (i == 6 && (audioCapturer2 instanceof AudioCaptureMuteSource)) {
            AVLog.iod("LiveStreamAudioCapture", "ignore switch audio capture from mute status to extern with pause on mute mode.");
        } else {
            onSwitchSource(4);
            onTriggerPeriodFrame();
        }
    }

    public void onReleaseCapture() {
        WeakReference<ILiveStream.ILiveStreamInfoListener> weakReference;
        AudioCapturer audioCapturer = this.mAudioCapturer;
        if (audioCapturer != null) {
            audioCapturer.setCalculatePcmPowerEventObserver(null);
            this.mAudioCapturer.pause();
            this.mAudioCapturer.stop();
            this.mAudioCapturer.release();
            if ((this.mAudioCapturer instanceof AudioCapturerAudioRecord) && (weakReference = this.mInfoListener) != null && weakReference.get() != null) {
                this.mInfoListener.get().onInfo(32, 0, 0);
            }
            this.mAudioCapturer = null;
        }
        AudioTrack audioTrack = this.mAudioTrack;
        if (audioTrack != null) {
            audioTrack.removeAudioSink(this.mAudioSink);
            this.mAudioTrack.release();
            this.mAudioTrack = null;
        }
    }

    public void onResume() {
        if (!this.mBackgroundMode) {
            C16880lQ.LLLLIIL(new Exception("non background mode, ignore!"));
            return;
        }
        this.mADM.resume();
        this.mBackgroundMode = false;
        AudioCapturer audioCapturer = this.mAudioCapturer;
        if (audioCapturer instanceof AudioCapturerFromADM) {
            this.mADM.startRecording();
        } else if (this.mSource == 6 && (audioCapturer instanceof AudioCaptureMuteSource)) {
            AVLog.iod("LiveStreamAudioCapture", "ignore switch audio capture with resume on mute mode.");
        } else {
            this.mHandler.removeCallbacks(this.mPeriodMuteAudioFrameRunable);
            onSwitchSource(this.mLastOnPauseSource);
        }
    }

    public void onTriggerPeriodFrame() {
        if (this.mLastOnPauseSource == 5) {
            this.mLastTimestampUs = TimeUtils.nativeNanoTime() / 1000;
        }
        this.mBGMTimestampDeltaUs = (System.nanoTime() / 1000) - this.mLastTimestampUs;
        if (this.mMute10MsAudioFrame == null) {
            int i = (this.mBitwidth / 8) * (this.mSample / 100) * this.mChannle;
            this.mMute10MsAudioFrame = ByteBuffer.allocateDirect(i);
            for (int i2 = 0; i2 < i; i2++) {
                this.mMute10MsAudioFrame.put(i2, (byte) 0);
            }
        }
        if (this.mPeriodMuteAudioFrameRunable == null) {
            this.mPeriodMuteAudioFrameRunable = new Runnable() { // from class: com.ss.ttlivestreamer.livestreamv2.capture.LiveStreamAudioCapture.3
                @Override // java.lang.Runnable
                public void run() {
                    com_ss_ttlivestreamer_livestreamv2_capture_LiveStreamAudioCapture$3_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                }

                public void com_ss_ttlivestreamer_livestreamv2_capture_LiveStreamAudioCapture$3__run$___twin___() {
                    long nanoTime = System.nanoTime() / 1000;
                    LiveStreamAudioCapture liveStreamAudioCapture = LiveStreamAudioCapture.this;
                    long j = nanoTime - liveStreamAudioCapture.mBGMTimestampDeltaUs;
                    long j2 = liveStreamAudioCapture.mLastTimestampUs;
                    long j3 = j - j2;
                    if (j3 >= 10000) {
                        AudioCapturer audioCapturer = liveStreamAudioCapture.mAudioCapturer;
                        if (audioCapturer instanceof AudioCaptureMuteSource) {
                            ByteBuffer byteBuffer = liveStreamAudioCapture.mMute10MsAudioFrame;
                            int i3 = liveStreamAudioCapture.mSample;
                            ((AudioCaptureMuteSource) audioCapturer).onData(byteBuffer, i3 / 100, i3, liveStreamAudioCapture.mChannle, j2 + 10000);
                        } else {
                            ByteBuffer byteBuffer2 = liveStreamAudioCapture.mMute10MsAudioFrame;
                            int i4 = liveStreamAudioCapture.mSample;
                            liveStreamAudioCapture.onData(byteBuffer2, i4 / 100, i4, liveStreamAudioCapture.mChannle, j2 + 10000);
                        }
                        if (j3 > 500000) {
                            StringBuilder LIZ = X1D.LIZ();
                            LIZ.append("Audio bgm timestamp exception delta(us) ");
                            LIZ.append(j3);
                            AVLog.ioe("LiveStreamAudioCapture", X1D.LIZIZ(LIZ));
                        }
                        if (LiveStreamAudioCapture.this.needTriggerOnceMore()) {
                            LiveStreamAudioCapture liveStreamAudioCapture2 = LiveStreamAudioCapture.this;
                            liveStreamAudioCapture2.mHandler.post(liveStreamAudioCapture2.mPeriodMuteAudioFrameRunable);
                            return;
                        }
                        return;
                    }
                    if (j3 < 0) {
                        AndroidRuntimeException androidRuntimeException = new AndroidRuntimeException(C61845OOz.LIZ("BUG!", j3));
                        if (AnonymousClass028.LJI(androidRuntimeException, "LiveStreamAudioCapture.onTriggerPerioadFrame")) {
                            throw androidRuntimeException;
                        }
                    }
                    long j4 = 10 - (j3 / 1000);
                    if (!LiveStreamAudioCapture.this.needTriggerOnceMore()) {
                        return;
                    }
                    LiveStreamAudioCapture liveStreamAudioCapture3 = LiveStreamAudioCapture.this;
                    liveStreamAudioCapture3.mHandler.postDelayed(liveStreamAudioCapture3.mPeriodMuteAudioFrameRunable, j4);
                }

                public static void com_ss_ttlivestreamer_livestreamv2_capture_LiveStreamAudioCapture$3_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass3 anonymousClass3) {
                    boolean LIZ;
                    try {
                        anonymousClass3.com_ss_ttlivestreamer_livestreamv2_capture_LiveStreamAudioCapture$3__run$___twin___();
                    } finally {
                        if (LIZ) {
                        }
                    }
                }
            };
        }
        this.mHandler.removeCallbacks(this.mPeriodMuteAudioFrameRunable);
        this.mHandler.postDelayed(this.mPeriodMuteAudioFrameRunable, 10L);
    }

    public void toBackground() {
        AVLog.iod("LiveStreamAudioCapture", "toBack");
        this.mHandler.post(new Runnable() { // from class: com.ss.ttlivestreamer.livestreamv2.capture.LiveStreamAudioCapture.2
            @Override // java.lang.Runnable
            public void run() {
                com_ss_ttlivestreamer_livestreamv2_capture_LiveStreamAudioCapture$2_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public void com_ss_ttlivestreamer_livestreamv2_capture_LiveStreamAudioCapture$2__run$___twin___() {
                LiveStreamAudioCapture.this.onPause();
            }

            public static void com_ss_ttlivestreamer_livestreamv2_capture_LiveStreamAudioCapture$2_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass2 anonymousClass2) {
                boolean LIZ;
                try {
                    anonymousClass2.com_ss_ttlivestreamer_livestreamv2_capture_LiveStreamAudioCapture$2__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }
        });
    }

    public void toFront() {
        AVLog.iod("LiveStreamAudioCapture", "toFront");
        this.mHandler.post(new Runnable() { // from class: com.ss.ttlivestreamer.livestreamv2.capture.LiveStreamAudioCapture.4
            @Override // java.lang.Runnable
            public void run() {
                com_ss_ttlivestreamer_livestreamv2_capture_LiveStreamAudioCapture$4_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public void com_ss_ttlivestreamer_livestreamv2_capture_LiveStreamAudioCapture$4__run$___twin___() {
                LiveStreamAudioCapture.this.onResume();
            }

            public static void com_ss_ttlivestreamer_livestreamv2_capture_LiveStreamAudioCapture$4_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass4 anonymousClass4) {
                boolean LIZ;
                try {
                    anonymousClass4.com_ss_ttlivestreamer_livestreamv2_capture_LiveStreamAudioCapture$4__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }
        });
    }

    @Override // com.ss.ttlivestreamer.core.capture.audio.AudioCapturer
    public int updateChannel() {
        AudioCapturer audioCapturer = this.mAudioCapturer;
        if (audioCapturer != null) {
            return audioCapturer.updateChannel();
        }
        return this.mChannle;
    }

    public int getCurrentCaptureDevice() {
        return this.mSource;
    }

    @Override // com.ss.ttlivestreamer.core.engine.MediaSource
    public int status() {
        return this.mStatus;
    }

    public void superRelease() {
        super.release();
    }

    private void onCreateCapture(int i) {
        if (this.mBackgroundMode && i != 4) {
            AndroidRuntimeException androidRuntimeException = new AndroidRuntimeException("Call exception");
            if (AnonymousClass028.LJI(androidRuntimeException, "LiveStreamAudioCapture.onCreateCapture")) {
                throw androidRuntimeException;
            }
        }
        TokenCertConfigUtils.getInstance().saveAudioScene(TokenCertConfigUtils.SceneType.SWITCH);
        onReleaseCapture();
        TokenCertConfigUtils.getInstance().saveAudioScene(TokenCertConfigUtils.SceneType.NONE);
        if (i == 2) {
            this.mAudioCapturer = new AudioCapturerOpensles(getMode(), this.mSample, this.mChannle, this.mBitwidth, this);
            return;
        }
        if (i == 1) {
            this.mAudioCapturer = new AudioCapturerAudioRecord(getMode(), this.mSample, this.mChannle, this.mBitwidth, this, this.mscreenAudioCaptureDelayMicPackage);
            return;
        }
        if (i == 4) {
            WrapperAudioCaptureExtern wrapperAudioCaptureExtern = new WrapperAudioCaptureExtern(this.mSample, this.mChannle, this.mBitwidth, this.mHandler, this);
            this.mAudioCapturer = wrapperAudioCaptureExtern;
            wrapperAudioCaptureExtern.setMode(getMode());
        } else if (i == 5) {
            this.mAudioCapturer = new AudioCapturerFromADM(getMode(), this.mADM, this.mSample, this.mChannle, this);
        } else {
            if (i != 6) {
                return;
            }
            this.mAudioCapturer = new AudioCaptureMuteSource(this.mSample, this.mChannle);
        }
    }

    private void onTryOpenLater(final int i) {
        this.mTryOpening = true;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Try open AudioCapture and source ");
        C15890jp.LIZIZ(LIZ, this.mSource, " VS ", i, " mode ");
        LIZ.append(getMode());
        AVLog.iod("LiveStreamAudioCapture", X1D.LIZIZ(LIZ));
        this.mHandler.postDelayed(new Runnable() { // from class: com.ss.ttlivestreamer.livestreamv2.capture.LiveStreamAudioCapture.8
            @Override // java.lang.Runnable
            public void run() {
                com_ss_ttlivestreamer_livestreamv2_capture_LiveStreamAudioCapture$8_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public void com_ss_ttlivestreamer_livestreamv2_capture_LiveStreamAudioCapture$8__run$___twin___() {
                if (!LiveStreamAudioCapture.this.mTryOpening) {
                    AndroidRuntimeException androidRuntimeException = new AndroidRuntimeException("Try open status exception");
                    if (AnonymousClass028.LJI(androidRuntimeException, "LiveStreamAudioCapture.onTryOpenLater")) {
                        throw androidRuntimeException;
                    }
                }
                LiveStreamAudioCapture.this.onSwitchSource(i);
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("Try open AudioCapture done and source ");
                LIZ2.append(LiveStreamAudioCapture.this.mSource);
                LIZ2.append(" VS ");
                LIZ2.append(i);
                LIZ2.append(" mode ");
                LIZ2.append(LiveStreamAudioCapture.this.getMode());
                AVLog.iod("LiveStreamAudioCapture", X1D.LIZIZ(LIZ2));
                LiveStreamAudioCapture.this.mTryOpening = false;
            }

            public static void com_ss_ttlivestreamer_livestreamv2_capture_LiveStreamAudioCapture$8_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass8 anonymousClass8) {
                boolean LIZ2;
                try {
                    anonymousClass8.com_ss_ttlivestreamer_livestreamv2_capture_LiveStreamAudioCapture$8__run$___twin___();
                } finally {
                    if (LIZ2) {
                    }
                }
            }
        }, 200L);
    }

    public void addOriginAudioSink(AudioSink audioSink) {
        AudioTrack audioTrack = this.mAudioTrack;
        if (audioTrack != null) {
            audioTrack.addAudioSink(audioSink);
        }
    }

    @Override // com.ss.ttlivestreamer.core.capture.audio.AudioCapturer
    public void mute(final boolean z) {
        this.mHandler.post(new Runnable() { // from class: com.ss.ttlivestreamer.livestreamv2.capture.LiveStreamAudioCapture.6
            @Override // java.lang.Runnable
            public void run() {
                com_ss_ttlivestreamer_livestreamv2_capture_LiveStreamAudioCapture$6_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public void com_ss_ttlivestreamer_livestreamv2_capture_LiveStreamAudioCapture$6__run$___twin___() {
                LiveStreamAudioCapture liveStreamAudioCapture = LiveStreamAudioCapture.this;
                if (!liveStreamAudioCapture.mBackgroundMode) {
                    liveStreamAudioCapture.onMute(z);
                } else {
                    AVLog.iow("LiveStreamAudioCapture", "Could not mute when in background.");
                }
            }

            public static void com_ss_ttlivestreamer_livestreamv2_capture_LiveStreamAudioCapture$6_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass6 anonymousClass6) {
                boolean LIZ;
                try {
                    anonymousClass6.com_ss_ttlivestreamer_livestreamv2_capture_LiveStreamAudioCapture$6__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }
        });
    }

    public void onCreateAndStart(int i) {
        WeakReference<ILiveStream.ILiveStreamInfoListener> weakReference;
        onCreateCapture(i);
        AudioCapturer audioCapturer = this.mAudioCapturer;
        if (audioCapturer == null) {
            if (i == 0) {
                return;
            } else {
                throw new Exception("Audio capture create failed");
            }
        }
        if (this.mAudioTrack == null && !(audioCapturer instanceof AudioCapturerFromADM)) {
            this.mAudioTrack = this.mMediaEngineFactory.createAudioTrack(audioCapturer);
        }
        if (this.mAudioSink == null) {
            this.mAudioSink = new AudioSink() { // from class: com.ss.ttlivestreamer.livestreamv2.capture.LiveStreamAudioCapture.5
                @Override // com.ss.ttlivestreamer.core.engine.AudioSink
                public void onNoData() {
                }

                @Override // com.ss.ttlivestreamer.core.engine.AudioSink
                public void onData(WrapperNativeAudioBuffer wrapperNativeAudioBuffer) {
                    LiveStreamAudioCapture.this.onData(wrapperNativeAudioBuffer, wrapperNativeAudioBuffer.mSamplesPerChannel, wrapperNativeAudioBuffer.mSampleRateHz, wrapperNativeAudioBuffer.mChannel, wrapperNativeAudioBuffer.timestampUs);
                }

                @Override // com.ss.ttlivestreamer.core.engine.AudioSink
                public void onData(Buffer buffer, int i2, int i3, int i4, long j) {
                    LiveStreamAudioCapture.this.onData(buffer, i2, i3, i4, j * 1000);
                }
            };
        }
        AudioTrack audioTrack = this.mAudioTrack;
        if (audioTrack != null) {
            audioTrack.addAudioSink(this.mAudioSink);
        }
        this.mAudioCapturer.start();
        if ((this.mAudioCapturer instanceof AudioCapturerAudioRecord) && (weakReference = this.mInfoListener) != null && weakReference.get() != null) {
            this.mInfoListener.get().onInfo(32, 1, 0);
        }
        this.mAudioCapturer.resume();
        if (this.mAudioCapturer.status() == 1) {
            onSetStatus(this.mAudioCapturer.status());
            this.mSource = i;
            return;
        }
        throw new Exception("Audio capture status exception");
    }

    public void onMute(boolean z) {
        if (this.mMute == z) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Ignore to repeat mute operations (");
            LIZ.append(z);
            LIZ.append(")");
            AVLog.iow("LiveStreamAudioCapture", X1D.LIZIZ(LIZ));
            return;
        }
        AudioCapturer audioCapturer = this.mAudioCapturer;
        if (audioCapturer == null || (audioCapturer instanceof AudioCapturerExternal)) {
            return;
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("Mute operation (");
        C76965UIn.LIZJ(LIZ2, this.mMute, " -> ", z, ") last source ");
        LIZ2.append(this.mLastSourceOnMute);
        LIZ2.append(" current source ");
        LIZ2.append(this.mSource);
        String LIZIZ = X1D.LIZIZ(LIZ2);
        AVLog.iod("LiveStreamAudioCapture", LIZIZ);
        AVLog.logKibana(4, "LiveStreamAudioCapture", LIZIZ, null);
        this.mMute = z;
        if (audioCapturer instanceof AudioCapturerFromADM) {
            audioCapturer.mute(z);
        } else if (z) {
            this.mLastSourceOnMute = this.mSource;
            onSwitchSource(6);
        } else {
            onSwitchSource(this.mLastSourceOnMute);
        }
    }

    public void onSetStatus(int i) {
        this.mStatus = i;
    }

    public void onSwitchSource(int i) {
        String str;
        AudioCapturer audioCapturer;
        AudioCapturer audioCapturer2;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("switch audio source current source ");
        C15890jp.LIZIZ(LIZ, this.mSource, " target source ", i, " audioSourceMode ");
        LIZ.append(getMode());
        LIZ.append(" is bgm ");
        LIZ.append(this.mBackgroundMode);
        LIZ.append(" status ");
        LIZ.append(status());
        LIZ.append(" mAudioCapture ");
        if (this.mAudioCapturer != null) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append(this.mAudioCapturer);
            LIZ2.append(" mode ");
            LIZ2.append(this.mAudioCapturer.getMode());
            str = X1D.LIZIZ(LIZ2);
        } else {
            str = "null";
        }
        LIZ.append(str);
        AVLog.iod("LiveStreamAudioCapture", X1D.LIZIZ(LIZ));
        boolean z = true;
        if (status() != 1 && !this.mTryOpening) {
            this.mObserver.onAudioCaptureError(-304, new Exception("on live audio capture status exception call."));
            return;
        }
        if (!this.mTryOpening && this.mSource == i && ((audioCapturer2 = this.mAudioCapturer) == null || audioCapturer2.getMode() == getMode())) {
            return;
        }
        if (this.mSource == i && (audioCapturer = this.mAudioCapturer) != null && (audioCapturer instanceof AudioCapturerFromADM) && this.mADM != null && audioCapturer.getMode() != getMode()) {
            AudioDeviceModule audioDeviceModule = this.mADM;
            if (getMode() != 7) {
                z = false;
            }
            audioDeviceModule.switchToVoIP(z);
            this.mAudioCapturer.setMode(getMode());
            return;
        }
        TokenCertConfigUtils.getInstance().saveAudioScene(TokenCertConfigUtils.SceneType.SWITCH);
        onReleaseCapture();
        TokenCertConfigUtils.getInstance().saveAudioScene(TokenCertConfigUtils.SceneType.NONE);
        try {
            onCreateAndStart(i);
        } catch (Exception e) {
            if (!this.mTryOpening) {
                onTryOpenLater(i);
            } else {
                this.mObserver.onAudioCaptureError(-305, e);
                onSetStatus(2);
                return;
            }
        }
        onSetStatus(1);
    }

    public void removeAudioSink(AudioSink audioSink) {
        AudioTrack audioTrack = this.mAudioTrack;
        if (audioTrack != null) {
            audioTrack.removeAudioSink(audioSink);
        }
    }

    @Override // com.ss.ttlivestreamer.core.capture.audio.AudioCapturer
    public void setVolume(double d) {
        AudioCapturer audioCapturer = this.mAudioCapturer;
        if (audioCapturer != null) {
            audioCapturer.setVolume(d);
        }
    }

    public void switchAudioMode(final int i) {
        this.mHandler.post(new Runnable() { // from class: com.ss.ttlivestreamer.livestreamv2.capture.LiveStreamAudioCapture.1
            @Override // java.lang.Runnable
            public void run() {
                com_ss_ttlivestreamer_livestreamv2_capture_LiveStreamAudioCapture$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public void com_ss_ttlivestreamer_livestreamv2_capture_LiveStreamAudioCapture$1__run$___twin___() {
                LiveStreamAudioCapture.this.setMode(i);
                LiveStreamAudioCapture liveStreamAudioCapture = LiveStreamAudioCapture.this;
                liveStreamAudioCapture.onSwitchSource(liveStreamAudioCapture.getCurrentCaptureDevice());
            }

            public static void com_ss_ttlivestreamer_livestreamv2_capture_LiveStreamAudioCapture$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass1 anonymousClass1) {
                boolean LIZ;
                try {
                    anonymousClass1.com_ss_ttlivestreamer_livestreamv2_capture_LiveStreamAudioCapture$1__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }
        });
    }

    public void switchSource(final int i) {
        this.mHandler.post(new Runnable() { // from class: com.ss.ttlivestreamer.livestreamv2.capture.LiveStreamAudioCapture.7
            @Override // java.lang.Runnable
            public void run() {
                com_ss_ttlivestreamer_livestreamv2_capture_LiveStreamAudioCapture$7_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public void com_ss_ttlivestreamer_livestreamv2_capture_LiveStreamAudioCapture$7__run$___twin___() {
                LiveStreamAudioCapture.this.onSwitchSource(i);
            }

            public static void com_ss_ttlivestreamer_livestreamv2_capture_LiveStreamAudioCapture$7_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass7 anonymousClass7) {
                boolean LIZ;
                try {
                    anonymousClass7.com_ss_ttlivestreamer_livestreamv2_capture_LiveStreamAudioCapture$7__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }
        });
    }

    public void unRegisterAudioRecordingCallback(AudioManager.AudioRecordingCallback audioRecordingCallback) {
        AudioCapturer audioCapturer = this.mAudioCapturer;
        if (audioCapturer != null && (audioCapturer instanceof AudioCapturerAudioRecord)) {
            ((AudioCapturerAudioRecord) audioCapturer).unRegisterAudioRecordingCallback(audioRecordingCallback);
        }
    }

    @Override // com.ss.ttlivestreamer.core.capture.audio.AudioCapturer.AudioCaptureObserver
    public void onAudioCaptureError(int i, Exception exc) {
        onSetStatus(2);
        AudioCapturer.AudioCaptureObserver audioCaptureObserver = this.mObserver;
        if (audioCaptureObserver != null) {
            audioCaptureObserver.onAudioCaptureError(i, exc);
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onAudioCaptureError,code:");
        LIZ.append(i);
        LIZ.append(",");
        LIZ.append(this);
        AVLog.logKibana(5, "LiveStreamAudioCapture", X1D.LIZIZ(LIZ), exc);
    }

    public void registerAudioRecordingCallback(Executor executor, AudioManager.AudioRecordingCallback audioRecordingCallback) {
        AudioCapturer audioCapturer = this.mAudioCapturer;
        if (audioCapturer != null && (audioCapturer instanceof AudioCapturerAudioRecord)) {
            ((AudioCapturerAudioRecord) audioCapturer).registerAudioRecordingCallback(executor, audioRecordingCallback);
        }
    }

    public void onData(Buffer buffer, int i, int i2, int i3, long j) {
        synchronized (this.releaseFence) {
            if (buffer.isDirect()) {
                nativeOnData(buffer, i, i2, i3, j);
                this.mLastTimestampUs = j;
            } else {
                throw new AndroidRuntimeException("A direct ByteBuffer is needed.");
            }
        }
    }

    public void onData(WrapperNativeAudioBuffer wrapperNativeAudioBuffer, int i, int i2, int i3, long j) {
        synchronized (this.releaseFence) {
            nativeOnData(wrapperNativeAudioBuffer, i, i2, i3, j);
            this.mLastTimestampUs = j;
        }
    }

    public int pushAudioFrame(ByteBuffer byteBuffer, int i, int i2, int i3, int i4, long j) {
        AudioCapturer audioCapturer = this.mAudioCapturer;
        if (audioCapturer != null && (audioCapturer instanceof WrapperAudioCaptureExtern)) {
            ((AudioCapturerExternal) audioCapturer).onData(byteBuffer, i4, i, i2, j);
            return 0;
        }
        return 0;
    }

    public LiveStreamAudioCapture(int i, int i2, int i3, int i4, int i5, int i6, Handler handler, AudioCapturer.AudioCaptureObserver audioCaptureObserver, MediaEngineFactory mediaEngineFactory, int i7) {
        this.releaseFence = new Object();
        this.mTryOpening = false;
        this.mSample = i4;
        this.mChannle = i5;
        this.mBitwidth = i6;
        this.mHandler = handler;
        this.mSource = i2;
        this.mscreenAudioCaptureDelayMicPackage = i3;
        this.mLastOnPauseSource = i2;
        this.mLastSourceOnMute = i2;
        this.mObserver = audioCaptureObserver;
        this.mMediaEngineFactory = mediaEngineFactory;
        setMode(i);
        this.mBGMMode = i7;
        if (this.mHandler == null) {
            SafeHandlerThread lockThread = SafeHandlerThreadPoolExecutor.lockThread("LiveStreamAudioCapture");
            this.mThread = lockThread;
            lockThread.start();
            this.mHandler = this.mThread.getHandler();
        }
    }

    public LiveStreamAudioCapture(int i, int i2, int i3, int i4, int i5, int i6, Handler handler, AudioCapturer.AudioCaptureObserver audioCaptureObserver, MediaEngineFactory mediaEngineFactory, int i7, ILiveStream.ILiveStreamInfoListener iLiveStreamInfoListener) {
        this(i, i2, i3, i4, i5, i6, handler, audioCaptureObserver, mediaEngineFactory, i7);
        this.mInfoListener = new WeakReference<>(iLiveStreamInfoListener);
    }
}
