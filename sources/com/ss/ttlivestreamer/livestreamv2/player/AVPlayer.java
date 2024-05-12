package com.ss.ttlivestreamer.livestreamv2.player;

import X.C48339Iy7;
import X.KMP;
import X.V10;
import X.X1D;
import android.content.Context;
import android.util.AndroidRuntimeException;
import com.ss.ttlivestreamer.core.engine.AudioDeviceModule;
import com.ss.ttlivestreamer.core.engine.Receiver;
import com.ss.ttlivestreamer.core.player.AVPlayerBase;
import com.ss.ttlivestreamer.core.player.IAVPlayer;
import com.ss.ttlivestreamer.core.receiver.NativeReceiver;
import com.ss.ttlivestreamer.core.utils.AVLog;
import com.ss.ttlivestreamer.core.utils.MiscUtils;
import com.ss.ttlivestreamer.core.utils.SafeHandlerThread;
import com.ss.ttlivestreamer.core.utils.SafeHandlerThreadPoolExecutor;
import com.ss.ttlivestreamer.core.utils.TEBundle;
import com.ss.ttlivestreamer.core.utils.TTLSBuildConfig;
import com.ss.ttlivestreamer.core.utils.TTLSSladarBugReportUtils;
import com.ss.ttlivestreamer.core.utils.ThreadUtils;
import com.ss.ttlivestreamer.core.utils.TimeUtils;
import com.ss.ttlivestreamer.livestreamv2.core.AudioDeviceControl;
import com.ss.ttlivestreamer.livestreamv2.core.IAudioDeviceControl;
import java.nio.ByteBuffer;

/* loaded from: classes12.dex */
public class AVPlayer extends AVPlayerBase {
    public final int STATUS_ERROR;
    public final int STATUS_INIT;
    public final int STATUS_PAUSE;
    public final int STATUS_PREPARED;
    public final int STATUS_RELEASE;
    public final int STATUS_STARTED;
    public final int STATUS_STOP;
    public int mAudioBufferSize;
    public IAudioDeviceControl.IAudioTrack mAudioTrack;
    public ByteBuffer mBuffer;
    public ByteBuffer mBufferMute;
    public int mChannels;
    public long mConnectTimeoutMs;
    public Runnable mConsumerAudioBufferRunnable;
    public IAudioDeviceControl mControl;
    public boolean mHaveControl;
    public long mPauseCostTimeMs;
    public SafeHandlerThread mPlayerThread;
    public long mProgressMs;
    public Receiver mReceiver;
    public int mReconnectCounts;
    public long mReconnectDelayMaxMs;
    public int mSampleHz;
    public long mStartPlayerTimeMs;
    public int mStatus;
    public ThreadUtils.ThreadChecker mThreadCheck;
    public long mTotalDurationMs;
    public String mUrl;

    @Override // com.ss.ttlivestreamer.core.player.AVPlayerBase, com.ss.ttlivestreamer.core.player.IAVPlayer
    public synchronized void release() {
        AudioDeviceControl audioDeviceControl;
        String str = AVPlayerBase.TAG;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("release this ");
        LIZ.append(this);
        AVLog.iod(str, X1D.LIZIZ(LIZ));
        if (this.mStatus == 6) {
            return;
        }
        stop();
        this.mPlayerThread.post(new Runnable() { // from class: com.ss.ttlivestreamer.livestreamv2.player.AVPlayer.11
            @Override // java.lang.Runnable
            public void run() {
                com_ss_ttlivestreamer_livestreamv2_player_AVPlayer$11_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public void com_ss_ttlivestreamer_livestreamv2_player_AVPlayer$11__run$___twin___() {
                IAudioDeviceControl.IAudioTrack iAudioTrack = AVPlayer.this.mAudioTrack;
                if (iAudioTrack != null) {
                    iAudioTrack.dispose();
                    AVPlayer.this.mAudioTrack = null;
                }
                AVPlayer.this.mStatus = 6;
            }

            public static void com_ss_ttlivestreamer_livestreamv2_player_AVPlayer$11_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass11 anonymousClass11) {
                boolean LIZ2;
                try {
                    anonymousClass11.com_ss_ttlivestreamer_livestreamv2_player_AVPlayer$11__run$___twin___();
                } finally {
                    if (LIZ2) {
                    }
                }
            }
        });
        if (this.mHaveControl && (audioDeviceControl = (AudioDeviceControl) this.mControl) != null) {
            audioDeviceControl.release();
        }
        this.mControl = null;
        SafeHandlerThreadPoolExecutor.unlockThread(this.mPlayerThread);
    }

    public void consumerAudioBuffer() {
        try {
            this.mThreadCheck.checkIsOnValidThread();
        } catch (IllegalStateException e) {
            TTLSSladarBugReportUtils tTLSSladarBugReportUtils = TTLSSladarBugReportUtils.getInstance();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(AVPlayerBase.TAG);
            LIZ.append(".consumerAudioBuffer@1");
            tTLSSladarBugReportUtils.report(e, X1D.LIZIZ(LIZ));
        }
        if (this.mStatus != 3) {
            AndroidRuntimeException androidRuntimeException = new AndroidRuntimeException("Status " + this.mStatus + " exception, url = " + this.mUrl);
            TTLSSladarBugReportUtils tTLSSladarBugReportUtils2 = TTLSSladarBugReportUtils.getInstance();
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append(AVPlayerBase.TAG);
            LIZ2.append(".consumerAudioBuffer@2");
            tTLSSladarBugReportUtils2.report(androidRuntimeException, X1D.LIZIZ(LIZ2));
            if (TTLSBuildConfig.canThrowException()) {
                throw androidRuntimeException;
            }
        }
        if (this.mBuffer == null) {
            this.mBuffer = ByteBuffer.allocateDirect(this.mAudioBufferSize);
        }
        if (this.mProgressMs == 0) {
            this.mStartPlayerTimeMs = System.currentTimeMillis();
        }
        if (this.mReceiver.readAudioBuffer(this.mBuffer, false) != 0) {
            onCompletion(null);
            pause();
            return;
        }
        IAudioDeviceControl.IAudioTrack iAudioTrack = this.mAudioTrack;
        ByteBuffer byteBuffer = this.mBuffer;
        int i = this.mSampleHz;
        iAudioTrack.onData(byteBuffer, i, this.mChannels, i / 100, TimeUtils.nativeNanoTime());
        this.mProgressMs += 10;
        onProgress(null, this.mReceiver.getCurrentPos(true));
        long currentTimeMillis = (System.currentTimeMillis() - this.mStartPlayerTimeMs) - this.mProgressMs;
        if (currentTimeMillis > 0) {
            this.mPlayerThread.post(this.mConsumerAudioBufferRunnable);
            return;
        }
        long abs = Math.abs(currentTimeMillis);
        String str = AVPlayerBase.TAG;
        StringBuilder LIZJ = V10.LIZJ("Sleep ", abs, " vs ");
        C48339Iy7.LIZLLL(System.currentTimeMillis(), this.mStartPlayerTimeMs, LIZJ, " progressMs ");
        LIZJ.append(this.mProgressMs);
        AVLog.e(str, X1D.LIZIZ(LIZJ));
        this.mPlayerThread.postDelayed(this.mConsumerAudioBufferRunnable, abs);
    }

    @Override // com.ss.ttlivestreamer.core.player.AVPlayerBase, com.ss.ttlivestreamer.core.player.IAVPlayer
    public IAVPlayer.MetaData getMetaData() {
        Receiver receiver = this.mReceiver;
        if (receiver != null) {
            IAVPlayer.MetaData metaData = new IAVPlayer.MetaData();
            if (receiver.getStreamInfo(metaData) == 0) {
                return metaData;
            }
            return null;
        }
        return null;
    }

    @Override // com.ss.ttlivestreamer.core.player.AVPlayerBase, com.ss.ttlivestreamer.core.player.IAVPlayer
    public float getVolume() {
        IAudioDeviceControl.IAudioTrack iAudioTrack = this.mAudioTrack;
        if (iAudioTrack != null) {
            return iAudioTrack.getVolume();
        }
        return 0.0f;
    }

    @Override // com.ss.ttlivestreamer.core.player.AVPlayerBase, com.ss.ttlivestreamer.core.player.IAVPlayer
    public boolean isPlaying() {
        if (this.mStatus == 3) {
            return true;
        }
        return false;
    }

    @Override // com.ss.ttlivestreamer.core.player.AVPlayerBase, com.ss.ttlivestreamer.core.player.IAVPlayer
    public void pause() {
        this.mPlayerThread.post(new Runnable() { // from class: com.ss.ttlivestreamer.livestreamv2.player.AVPlayer.9
            @Override // java.lang.Runnable
            public void run() {
                com_ss_ttlivestreamer_livestreamv2_player_AVPlayer$9_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public void com_ss_ttlivestreamer_livestreamv2_player_AVPlayer$9__run$___twin___() {
                AVPlayer aVPlayer = AVPlayer.this;
                if (aVPlayer.mStatus == 3) {
                    aVPlayer.mStatus = 5;
                    aVPlayer.mPauseCostTimeMs = System.currentTimeMillis();
                    AVPlayer aVPlayer2 = AVPlayer.this;
                    aVPlayer2.mPlayerThread.removeCallbacks(aVPlayer2.mConsumerAudioBufferRunnable);
                    AVPlayer.this.onPause(null, 0);
                }
            }

            public static void com_ss_ttlivestreamer_livestreamv2_player_AVPlayer$9_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass9 anonymousClass9) {
                boolean LIZ;
                try {
                    anonymousClass9.com_ss_ttlivestreamer_livestreamv2_player_AVPlayer$9__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }
        });
    }

    @Override // com.ss.ttlivestreamer.core.player.AVPlayerBase, com.ss.ttlivestreamer.core.player.IAVPlayer
    public void prepare() {
        ThreadUtils.invokeAtFrontUninterruptibly(this.mPlayerThread.getHandler(), new Runnable() { // from class: com.ss.ttlivestreamer.livestreamv2.player.AVPlayer.6
            @Override // java.lang.Runnable
            public void run() {
                com_ss_ttlivestreamer_livestreamv2_player_AVPlayer$6_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public void com_ss_ttlivestreamer_livestreamv2_player_AVPlayer$6__run$___twin___() {
                AVPlayer.this.prepareOnThread();
            }

            public static void com_ss_ttlivestreamer_livestreamv2_player_AVPlayer$6_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass6 anonymousClass6) {
                boolean LIZ;
                try {
                    anonymousClass6.com_ss_ttlivestreamer_livestreamv2_player_AVPlayer$6__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }
        });
    }

    @Override // com.ss.ttlivestreamer.core.player.AVPlayerBase, com.ss.ttlivestreamer.core.player.IAVPlayer
    public void prepareAsync() {
        this.mPlayerThread.post(new Runnable() { // from class: com.ss.ttlivestreamer.livestreamv2.player.AVPlayer.4
            @Override // java.lang.Runnable
            public void run() {
                com_ss_ttlivestreamer_livestreamv2_player_AVPlayer$4_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public void com_ss_ttlivestreamer_livestreamv2_player_AVPlayer$4__run$___twin___() {
                AVPlayer.this.prepare();
            }

            public static void com_ss_ttlivestreamer_livestreamv2_player_AVPlayer$4_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass4 anonymousClass4) {
                boolean LIZ;
                try {
                    anonymousClass4.com_ss_ttlivestreamer_livestreamv2_player_AVPlayer$4__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }
        });
    }

    public void prepareOnThread() {
        int i = this.mStatus;
        if ((i == 1 || i == 4) && this.mUrl != null) {
            Receiver receiver = this.mReceiver;
            if (receiver != null) {
                receiver.closeStream();
            }
            if (this.mReceiver == null) {
                this.mReceiver = new NativeReceiver(null, null);
            }
            setupReceiverOpt(this.mReceiver);
            int openStream = this.mReceiver.openStream(this.mUrl);
            if (openStream != 0) {
                onError(this, openStream, new Exception(KMP.LJ("OpenStream error ret ", openStream)));
                this.mStatus = 7;
                return;
            }
            this.mReceiver.getStreamInfo(this.mMetaData);
            this.mTotalDurationMs = this.mMetaData.getLong("receiver_total_duration");
            this.mProgressMs = 0L;
            String str = AVPlayerBase.TAG;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("AVPlayer at ");
            LIZ.append(this.mUrl);
            AVLog.iod(str, X1D.LIZIZ(LIZ));
            AVLog.iod(str, this.mMetaData.toString());
            if (this.mAudioTrack == null) {
                IAudioDeviceControl iAudioDeviceControl = this.mControl;
                if (iAudioDeviceControl == null) {
                    onError(this, 0, new Exception("Create AudioTrack failed and not found AudioDeviceControl."));
                    this.mStatus = 7;
                } else {
                    IAudioDeviceControl.IAudioTrack createTrack = iAudioDeviceControl.createTrack(MiscUtils.getUUID("avplayer"), this.mSampleHz, this.mChannels, 16);
                    this.mAudioTrack = createTrack;
                    if (createTrack == null) {
                        onError(this, 0, new Exception("Create AudioTrack failed."));
                        this.mStatus = 7;
                    }
                }
            }
            this.mStatus = 2;
            onPrepared(this, 0);
        }
    }

    @Override // com.ss.ttlivestreamer.core.player.AVPlayerBase, com.ss.ttlivestreamer.core.player.IAVPlayer
    public void start() {
        this.mPlayerThread.post(new Runnable() { // from class: com.ss.ttlivestreamer.livestreamv2.player.AVPlayer.7
            @Override // java.lang.Runnable
            public void run() {
                com_ss_ttlivestreamer_livestreamv2_player_AVPlayer$7_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public void com_ss_ttlivestreamer_livestreamv2_player_AVPlayer$7__run$___twin___() {
                AVPlayer aVPlayer = AVPlayer.this;
                int i = aVPlayer.mStatus;
                if (i != 2) {
                    if (i == 5) {
                        if (aVPlayer.mPauseCostTimeMs != 0) {
                            long j = aVPlayer.mStartPlayerTimeMs;
                            long currentTimeMillis = System.currentTimeMillis();
                            AVPlayer aVPlayer2 = AVPlayer.this;
                            aVPlayer.mStartPlayerTimeMs = (currentTimeMillis - aVPlayer2.mPauseCostTimeMs) + j;
                            aVPlayer2.mPauseCostTimeMs = 0L;
                        }
                    } else {
                        return;
                    }
                }
                AVPlayer aVPlayer3 = AVPlayer.this;
                aVPlayer3.mStatus = 3;
                aVPlayer3.mPlayerThread.post(aVPlayer3.mConsumerAudioBufferRunnable);
                AVPlayer.this.onStarted(null, 0);
                String str = AVPlayerBase.TAG;
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("will Sleep  vs ");
                C48339Iy7.LIZLLL(System.currentTimeMillis(), AVPlayer.this.mStartPlayerTimeMs, LIZ, " progressMs ");
                LIZ.append(AVPlayer.this.mProgressMs);
                AVLog.e(str, X1D.LIZIZ(LIZ));
            }

            public static void com_ss_ttlivestreamer_livestreamv2_player_AVPlayer$7_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass7 anonymousClass7) {
                boolean LIZ;
                try {
                    anonymousClass7.com_ss_ttlivestreamer_livestreamv2_player_AVPlayer$7__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }
        });
    }

    @Override // com.ss.ttlivestreamer.core.player.AVPlayerBase, com.ss.ttlivestreamer.core.player.IAVPlayer
    public void stop() {
        this.mPlayerThread.post(new Runnable() { // from class: com.ss.ttlivestreamer.livestreamv2.player.AVPlayer.8
            @Override // java.lang.Runnable
            public void run() {
                com_ss_ttlivestreamer_livestreamv2_player_AVPlayer$8_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public void com_ss_ttlivestreamer_livestreamv2_player_AVPlayer$8__run$___twin___() {
                AVPlayer aVPlayer = AVPlayer.this;
                if (aVPlayer.mStatus != 6) {
                    aVPlayer.mStatus = 4;
                    aVPlayer.mPlayerThread.removeCallbacks(aVPlayer.mConsumerAudioBufferRunnable);
                    Receiver receiver = AVPlayer.this.mReceiver;
                    if (receiver != null) {
                        receiver.closeStream();
                        AVPlayer.this.onStop(null, 0);
                    }
                }
            }

            public static void com_ss_ttlivestreamer_livestreamv2_player_AVPlayer$8_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass8 anonymousClass8) {
                boolean LIZ;
                try {
                    anonymousClass8.com_ss_ttlivestreamer_livestreamv2_player_AVPlayer$8__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }
        });
    }

    private void setupReceiverOpt(Receiver receiver) {
        int i;
        TEBundle option = receiver.getOption();
        option.setInt("decode_stream_audio_channel", this.mChannels);
        option.setInt("decode_stream_audio_sample", this.mSampleHz);
        if (isLoop()) {
            i = -1;
        } else {
            i = 1;
        }
        option.setInt("decode_stream_loop", i);
        if (this.mConnectTimeoutMs > 0 || this.mReconnectCounts > -1) {
            TEBundle tEBundle = new TEBundle();
            long j = this.mConnectTimeoutMs;
            if (j > 0) {
                tEBundle.setLong("timeout", j * 1000);
            }
            int i2 = this.mReconnectCounts;
            if (i2 > -1) {
                tEBundle.setInt("reconnect_count", i2);
                long j2 = this.mReconnectDelayMaxMs;
                if (j2 > 0) {
                    tEBundle.setLong("reconnect_delay_max", j2 * 1000);
                }
            }
            option.setBundle("ff_open_params", tEBundle);
            tEBundle.release();
        }
        receiver.setOption(option);
    }

    @Override // com.ss.ttlivestreamer.core.player.AVPlayerBase, com.ss.ttlivestreamer.core.player.IAVPlayer
    public void seekTo(final long j) {
        this.mPlayerThread.post(new Runnable() { // from class: com.ss.ttlivestreamer.livestreamv2.player.AVPlayer.10
            @Override // java.lang.Runnable
            public void run() {
                com_ss_ttlivestreamer_livestreamv2_player_AVPlayer$10_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public void com_ss_ttlivestreamer_livestreamv2_player_AVPlayer$10__run$___twin___() {
                Receiver receiver = AVPlayer.this.mReceiver;
                if (receiver != null) {
                    boolean z = true;
                    int seek = receiver.seek(j, true);
                    AVPlayer aVPlayer = AVPlayer.this;
                    long j2 = j;
                    if (seek != 0) {
                        z = false;
                    }
                    aVPlayer.onSeeked(null, j2, z);
                }
            }

            public static void com_ss_ttlivestreamer_livestreamv2_player_AVPlayer$10_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass10 anonymousClass10) {
                boolean LIZ;
                try {
                    anonymousClass10.com_ss_ttlivestreamer_livestreamv2_player_AVPlayer$10__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }
        });
    }

    @Override // com.ss.ttlivestreamer.core.player.AVPlayerBase, com.ss.ttlivestreamer.core.player.IAVPlayer
    public void setConnectTimeoutMs(long j) {
        if (j <= 0) {
            j = 0;
        }
        this.mConnectTimeoutMs = j;
    }

    @Override // com.ss.ttlivestreamer.core.player.AVPlayerBase, com.ss.ttlivestreamer.core.player.IAVPlayer
    public void setLoop(boolean z) {
        super.setLoop(z);
        ThreadUtils.invokeAtFrontUninterruptibly(this.mPlayerThread.getHandler(), new Runnable() { // from class: com.ss.ttlivestreamer.livestreamv2.player.AVPlayer.5
            @Override // java.lang.Runnable
            public void run() {
                com_ss_ttlivestreamer_livestreamv2_player_AVPlayer$5_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public void com_ss_ttlivestreamer_livestreamv2_player_AVPlayer$5__run$___twin___() {
                int i;
                AVPlayer aVPlayer = AVPlayer.this;
                int i2 = aVPlayer.mStatus;
                if (i2 == 3 || i2 == 5) {
                    TEBundle option = aVPlayer.mReceiver.getOption();
                    if (AVPlayer.this.isLoop()) {
                        i = -1;
                    } else {
                        i = 1;
                    }
                    option.setInt("decode_stream_loop", i);
                    AVPlayer.this.mReceiver.setOption(option);
                }
            }

            public static void com_ss_ttlivestreamer_livestreamv2_player_AVPlayer$5_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass5 anonymousClass5) {
                boolean LIZ;
                try {
                    anonymousClass5.com_ss_ttlivestreamer_livestreamv2_player_AVPlayer$5__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }
        });
    }

    @Override // com.ss.ttlivestreamer.core.player.AVPlayerBase, com.ss.ttlivestreamer.core.player.IAVPlayer
    public void setMixerEnable(boolean z) {
        long j;
        super.setMixerEnable(z);
        IAudioDeviceControl.IAudioTrack iAudioTrack = this.mAudioTrack;
        if (iAudioTrack != null) {
            if (z) {
                j = 7;
            } else {
                j = 0;
            }
            iAudioTrack.setQuirks(j);
        }
    }

    @Override // com.ss.ttlivestreamer.core.player.AVPlayerBase, com.ss.ttlivestreamer.core.player.IAVPlayer
    public void setVolume(float f) {
        IAudioDeviceControl.IAudioTrack iAudioTrack = this.mAudioTrack;
        if (iAudioTrack != null) {
            iAudioTrack.setVolume(f);
        }
    }

    public AVPlayer(int i, int i2) {
        this.STATUS_INIT = 1;
        this.STATUS_PREPARED = 2;
        this.STATUS_STARTED = 3;
        this.STATUS_STOP = 4;
        this.STATUS_PAUSE = 5;
        this.STATUS_RELEASE = 6;
        this.STATUS_ERROR = 7;
        this.mStatus = 1;
        this.mConnectTimeoutMs = 4000L;
        this.mReconnectCounts = -1;
        this.mSampleHz = i;
        this.mChannels = i2;
        this.mAudioBufferSize = ((i2 * 2) * i) / 100;
        SafeHandlerThread lockThread = SafeHandlerThreadPoolExecutor.lockThread("AVAudioPLayerThread");
        this.mPlayerThread = lockThread;
        lockThread.start();
        this.mPlayerThread.post(new Runnable() { // from class: com.ss.ttlivestreamer.livestreamv2.player.AVPlayer.1
            @Override // java.lang.Runnable
            public void run() {
                com_ss_ttlivestreamer_livestreamv2_player_AVPlayer$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public void com_ss_ttlivestreamer_livestreamv2_player_AVPlayer$1__run$___twin___() {
                AVPlayer.this.mThreadCheck = new ThreadUtils.ThreadChecker();
                AVPlayer.this.mThreadCheck.checkIsOnValidThread();
            }

            public static void com_ss_ttlivestreamer_livestreamv2_player_AVPlayer$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass1 anonymousClass1) {
                boolean LIZ;
                try {
                    anonymousClass1.com_ss_ttlivestreamer_livestreamv2_player_AVPlayer$1__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }
        });
        this.mConsumerAudioBufferRunnable = new Runnable() { // from class: com.ss.ttlivestreamer.livestreamv2.player.AVPlayer.2
            @Override // java.lang.Runnable
            public void run() {
                com_ss_ttlivestreamer_livestreamv2_player_AVPlayer$2_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public void com_ss_ttlivestreamer_livestreamv2_player_AVPlayer$2__run$___twin___() {
                AVPlayer.this.mPlayerThread.removeCallbacks(this);
                AVPlayer aVPlayer = AVPlayer.this;
                int i3 = aVPlayer.mStatus;
                if (i3 == 3 || i3 == 5) {
                    aVPlayer.consumerAudioBuffer();
                }
            }

            public static void com_ss_ttlivestreamer_livestreamv2_player_AVPlayer$2_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass2 anonymousClass2) {
                boolean LIZ;
                try {
                    anonymousClass2.com_ss_ttlivestreamer_livestreamv2_player_AVPlayer$2__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }
        };
    }

    @Override // com.ss.ttlivestreamer.core.player.AVPlayerBase, com.ss.ttlivestreamer.core.player.IAVPlayer
    public void setDataSource(Context context, final String str) {
        this.mPlayerThread.post(new Runnable() { // from class: com.ss.ttlivestreamer.livestreamv2.player.AVPlayer.3
            @Override // java.lang.Runnable
            public void run() {
                com_ss_ttlivestreamer_livestreamv2_player_AVPlayer$3_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public void com_ss_ttlivestreamer_livestreamv2_player_AVPlayer$3__run$___twin___() {
                AVPlayer.this.mUrl = str;
            }

            public static void com_ss_ttlivestreamer_livestreamv2_player_AVPlayer$3_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass3 anonymousClass3) {
                boolean LIZ;
                try {
                    anonymousClass3.com_ss_ttlivestreamer_livestreamv2_player_AVPlayer$3__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }
        });
    }

    public AVPlayer(AudioDeviceModule audioDeviceModule, int i, int i2) {
        this(i, i2);
        this.mControl = new AudioDeviceControl(audioDeviceModule);
        this.mHaveControl = true;
    }

    public AVPlayer(IAudioDeviceControl.IAudioTrack iAudioTrack, int i, int i2) {
        this(i, i2);
        this.mAudioTrack = iAudioTrack;
    }

    public AVPlayer(IAudioDeviceControl iAudioDeviceControl, int i, int i2) {
        this(i, i2);
        this.mControl = iAudioDeviceControl;
    }
}
