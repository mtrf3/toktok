package com.byted.cast.sdk.render.audio;

import X.C16880lQ;
import X.V0N;
import com.byted.cast.sdk.render.audio.AudioJitterBuffer;
import com.byted.cast.sdk.render.video.VideoJitterBuffer;
import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadThread;
import java.util.concurrent.ConcurrentSkipListMap;

/* loaded from: classes29.dex */
public class AudioJitterBuffer {
    public static volatile AudioJitterBuffer mInstance;
    public byte[] mEchoBuffer;
    public Thread mPlaybackThread;
    public Object mSyncLock = new Object();
    public ConcurrentSkipListMap<Long, byte[]> mJitterBuffer = new ConcurrentSkipListMap<>();
    public JITTER_MODE mJitterMode = JITTER_MODE.QUALITY_STATIC_MODE;
    public JITTER_STATE mJitterState = JITTER_STATE.PREFETCH;
    public int mJitterPrefetchSize = 5;
    public AudioJitterBufferCallback mCallback = null;
    public volatile long mOriginalStartPlaybackSystemTime = 0;
    public volatile long mTunedStartPlaybackSystemTime = 0;
    public long mFirstOutputPacketTime = 0;
    public volatile long mLatestOutputPacketPts = -1;
    public int mPacketPlayTime = 0;
    public int mPacketDeltaPts = 0;
    public int mSampleRate = 44100;
    public int mChannelSize = 0;
    public int mSampleSize = 0;
    public volatile boolean isRunning = true;
    public boolean mIsRtpTimeStamp = false;
    public long underRunStart = 0;
    public long underRunCount = 0;
    public int lateCount = 0;
    public int lostCount = 0;
    public int okCount = 0;
    public Runnable mPlaybackTask = new Runnable() { // from class: X.ZaW
        @Override // java.lang.Runnable
        public final void run() {
            AudioJitterBuffer.this.lambda$new$0();
        }
    };
    public long mFirstDirtyPts = 0;
    public long mPreRtpTs = 0;
    public long mPreSysTs = 0;
    public long mSR_StartPts = 0;
    public long mSR_StartSysTs = 0;
    public long mSR_CurMinDelta = Long.MAX_VALUE;
    public long mSR_Counter = 0;

    public void start() {
        this.isRunning = true;
        PthreadThread pthreadThread = new PthreadThread(this.mPlaybackTask, "AudioPlaybackThread");
        this.mPlaybackThread = pthreadThread;
        pthreadThread.start();
    }

    public void stop() {
        this.isRunning = false;
        synchronized (this.mSyncLock) {
            this.mSyncLock.notify();
        }
        try {
            this.mPlaybackThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        reset();
    }

    private void doPrefetch() {
        if (this.mJitterBuffer.size() <= this.mJitterPrefetchSize) {
            synchronized (this.mSyncLock) {
                try {
                    this.mSyncLock.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                if (this.mJitterBuffer.size() == this.mJitterPrefetchSize) {
                    this.mCallback.onAudioReadyToPlay();
                }
            }
            return;
        }
        this.mJitterState = JITTER_STATE.PROCESS;
        this.mOriginalStartPlaybackSystemTime = System.currentTimeMillis();
        this.mTunedStartPlaybackSystemTime = this.mOriginalStartPlaybackSystemTime;
        long longValue = this.mJitterBuffer.firstKey().longValue();
        this.mFirstOutputPacketTime = longValue;
        this.mLatestOutputPacketPts = longValue;
        VideoJitterBuffer.getInstance().notifyAudioDelayChanged();
        this.mCallback.onAudioSmoothOutput(this.mJitterBuffer.pollFirstEntry().getValue());
    }

    private void doProcess() {
        if (this.mJitterBuffer.isEmpty()) {
            underRunCheck();
            int i = this.mPacketPlayTime;
            synchronized (this.mSyncLock) {
                try {
                    this.mSyncLock.wait(i);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                    return;
                }
            }
            return;
        }
        long longValue = this.mJitterBuffer.firstKey().longValue();
        long calculatePacketDelay = calculatePacketDelay(longValue);
        if (calculatePacketDelay >= 0) {
            long j = longValue - this.mLatestOutputPacketPts;
            int i2 = this.mPacketDeltaPts;
            if (j == i2) {
                this.mLatestOutputPacketPts = longValue;
                this.mCallback.onAudioSmoothOutput(this.mJitterBuffer.pollFirstEntry().getValue());
                return;
            } else {
                if (calculatePacketDelay > i2) {
                    underRunCheck();
                    int i3 = this.mPacketPlayTime;
                    synchronized (this.mSyncLock) {
                        try {
                            this.mSyncLock.wait(i3);
                        } catch (InterruptedException e2) {
                            e2.printStackTrace();
                            return;
                        }
                    }
                    return;
                }
                this.mLatestOutputPacketPts = longValue;
                this.mCallback.onAudioSmoothOutput(this.mJitterBuffer.pollFirstEntry().getValue());
                return;
            }
        }
        if (longValue > this.mLatestOutputPacketPts) {
            this.mLatestOutputPacketPts = longValue;
        }
        this.mJitterBuffer.pollFirstEntry();
    }

    public static AudioJitterBuffer getInstance() {
        if (mInstance == null) {
            synchronized (AudioJitterBuffer.class) {
                if (mInstance == null) {
                    mInstance = new AudioJitterBuffer();
                }
            }
        }
        return mInstance;
    }

    private void reset() {
        this.mJitterMode = JITTER_MODE.QUALITY_STATIC_MODE;
        this.mJitterPrefetchSize = 5;
        this.mCallback = null;
        this.mJitterState = JITTER_STATE.PREFETCH;
        this.mJitterBuffer.clear();
        this.mOriginalStartPlaybackSystemTime = 0L;
        this.mTunedStartPlaybackSystemTime = 0L;
        this.mFirstOutputPacketTime = 0L;
        this.mLatestOutputPacketPts = -1L;
        this.mPacketPlayTime = 0;
        this.mPacketDeltaPts = 0;
        this.mSampleRate = 44100;
        this.mChannelSize = 0;
        this.mSampleSize = 0;
        this.mFirstDirtyPts = 0L;
        this.mSR_StartPts = 0L;
        this.mSR_StartSysTs = 0L;
        this.mSR_CurMinDelta = Long.MAX_VALUE;
        this.mSR_Counter = 0L;
        this.mIsRtpTimeStamp = false;
    }

    private long underRunCheck() {
        long calculatePacketDelay = calculatePacketDelay(this.mLatestOutputPacketPts) + this.mPacketDeltaPts;
        if (calculatePacketDelay < 0 && this.mJitterMode == JITTER_MODE.QUALITY_DYNAMIC_MODE) {
            int i = this.mJitterPrefetchSize;
            if ((r2 * i) + calculatePacketDelay < 0 && i < 100) {
                this.mJitterPrefetchSize = i + 10;
                this.mOriginalStartPlaybackSystemTime += ((this.mPacketDeltaPts * 10) * 1000) / this.mSampleRate;
                this.mTunedStartPlaybackSystemTime += ((this.mPacketDeltaPts * 10) * 1000) / this.mSampleRate;
                VideoJitterBuffer.getInstance().notifyAudioDelayChanged();
            }
        }
        return calculatePacketDelay;
    }

    public long getCurrentAudioDelay() {
        if (this.mOriginalStartPlaybackSystemTime != 0) {
            return (((this.mJitterPrefetchSize * this.mPacketDeltaPts) * 1000000000) / this.mSampleRate) + ((this.mTunedStartPlaybackSystemTime - this.mOriginalStartPlaybackSystemTime) * 1000000);
        }
        return Long.MAX_VALUE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$0() {
        C16880lQ.LLLLIIIILLL().setPriority(10);
        while (this.isRunning) {
            if (this.mJitterState == JITTER_STATE.PREFETCH) {
                doPrefetch();
            } else {
                doProcess();
            }
        }
    }

    /* loaded from: classes29.dex */
    public enum COUNT_ELEMENT {
        UNDER_RUN,
        PACKET_LOST,
        PACKET_LATE,
        PACKET_OK;

        public static COUNT_ELEMENT valueOf(String str) {
            return (COUNT_ELEMENT) V0N.LJJJ(COUNT_ELEMENT.class, str);
        }
    }

    /* loaded from: classes29.dex */
    public enum JITTER_MODE {
        LOW_LATENCY_MODE,
        QUALITY_DYNAMIC_MODE,
        QUALITY_STATIC_MODE;

        public static JITTER_MODE valueOf(String str) {
            return (JITTER_MODE) V0N.LJJJ(JITTER_MODE.class, str);
        }
    }

    /* loaded from: classes29.dex */
    public enum JITTER_STATE {
        PREFETCH,
        PROCESS;

        public static JITTER_STATE valueOf(String str) {
            return (JITTER_STATE) V0N.LJJJ(JITTER_STATE.class, str);
        }
    }

    private final long calculatePacketDelay(long j) {
        return j - (this.mFirstOutputPacketTime + (((System.currentTimeMillis() - this.mTunedStartPlaybackSystemTime) * this.mSampleRate) / 1000));
    }

    private void generateEchoBuffer(byte[] bArr) {
        this.mEchoBuffer = bArr;
    }

    public long convertToRtpTimestamp(long j) {
        long j2 = this.mFirstDirtyPts;
        int i = this.mSampleRate;
        int i2 = this.mPacketDeltaPts;
        long j3 = ((((j - j2) * i) / 1000) / i2) * i2;
        long j4 = (((((j - j2) + 10) * i) / 1000) / i2) * i2;
        if (j3 <= j4) {
            j3 = j4;
        }
        long j5 = this.mPreRtpTs;
        if (j3 != i2 + j5 && j - this.mPreSysTs < (this.mPacketPlayTime * 2) - 10) {
            j3 = i2 + j5;
        }
        this.mPreRtpTs = j3;
        this.mPreSysTs = j;
        return j3;
    }

    public AudioJitterBuffer setJitterCallback(AudioJitterBufferCallback audioJitterBufferCallback) {
        this.mCallback = audioJitterBufferCallback;
        return this;
    }

    public AudioJitterBuffer setJitterMode(JITTER_MODE jitter_mode) {
        this.mJitterMode = jitter_mode;
        if (jitter_mode == JITTER_MODE.LOW_LATENCY_MODE) {
            this.mJitterPrefetchSize = 1;
        }
        return this;
    }

    public AudioJitterBuffer setJitterPrefetchSize(int i) {
        if (i >= 1 && i <= 100) {
            this.mJitterPrefetchSize = i;
        } else {
            this.mJitterPrefetchSize = 5;
        }
        if (this.mJitterMode == JITTER_MODE.LOW_LATENCY_MODE) {
            this.mJitterPrefetchSize = 1;
        }
        return this;
    }

    public void set_audio_ntp_base(long j) {
        long j2;
        long j3 = this.mSR_Counter + 1;
        this.mSR_Counter = j3;
        if (j3 % 100 == 0) {
            if (this.mSR_StartPts == 0) {
                this.mSR_StartPts = j;
                this.mSR_StartSysTs = System.currentTimeMillis();
                return;
            }
            long currentTimeMillis = System.currentTimeMillis() - this.mSR_StartSysTs;
            if (this.mIsRtpTimeStamp) {
                j2 = ((j - this.mSR_StartPts) * 1000) / this.mSampleRate;
            } else {
                j2 = j - this.mSR_StartPts;
            }
            long j4 = currentTimeMillis - j2;
            if (this.mSR_CurMinDelta > j4) {
                this.mSR_CurMinDelta = j4;
            }
            if (this.mSR_Counter % 10000 != 0) {
                return;
            }
            this.mTunedStartPlaybackSystemTime = this.mOriginalStartPlaybackSystemTime + this.mSR_CurMinDelta;
            this.mSR_CurMinDelta = Long.MAX_VALUE;
            VideoJitterBuffer.getInstance().notifyAudioDelayChanged();
        }
    }

    private void countRenderStatus(COUNT_ELEMENT count_element, long j) {
        long j2 = this.mLatestOutputPacketPts;
        long j3 = this.mFirstOutputPacketTime;
        int i = this.mPacketDeltaPts;
        if ((j2 - j3) / i < 30000) {
            if (count_element == COUNT_ELEMENT.UNDER_RUN) {
                if (this.underRunStart == 0) {
                    this.underRunStart = j;
                    return;
                }
                return;
            }
            if (count_element == COUNT_ELEMENT.PACKET_LOST) {
                long j4 = this.lostCount;
                long j5 = j - this.mLatestOutputPacketPts;
                int i2 = this.mPacketDeltaPts;
                this.lostCount = (int) (j4 + ((j5 / i2) - 1));
                this.okCount++;
                long j6 = this.underRunStart;
                if (j6 != 0) {
                    this.underRunCount += (j - j6) - i2;
                    this.underRunStart = 0L;
                    return;
                } else {
                    this.underRunCount += (j - this.mLatestOutputPacketPts) - this.mPacketDeltaPts;
                    return;
                }
            }
            if (count_element == COUNT_ELEMENT.PACKET_OK) {
                this.okCount++;
                long j7 = this.underRunStart;
                if (j7 == 0) {
                    return;
                }
                this.underRunCount += (j - j7) - i;
                this.underRunStart = 0L;
                return;
            }
            if (count_element != COUNT_ELEMENT.PACKET_LATE) {
                return;
            }
            this.lateCount = (int) (this.lateCount + ((j - this.mLatestOutputPacketPts) / this.mPacketDeltaPts));
            if (calculatePacketDelay(this.mLatestOutputPacketPts) + this.mPacketDeltaPts >= 0 || this.underRunStart != 0) {
                return;
            }
            this.underRunStart = this.mLatestOutputPacketPts;
            return;
        }
        long j8 = this.underRunStart;
        if (j8 == 0) {
            return;
        }
        this.underRunCount += (((i * 30000) + j3) - j8) - i;
        this.underRunStart = 0L;
    }

    public void append(byte[] bArr, long j) {
        if (this.mPacketDeltaPts == 0) {
            int length = bArr.length / (this.mChannelSize * this.mSampleSize);
            this.mPacketDeltaPts = length;
            this.mPacketPlayTime = (length * 1000) / this.mSampleRate;
            this.mFirstDirtyPts = j;
            VideoJitterBuffer.getInstance().notifyAudioDelayChanged();
            if (j % this.mPacketDeltaPts == 0 && j < r5 * 5) {
                this.mIsRtpTimeStamp = true;
            }
        }
        set_audio_ntp_base(j);
        if (!this.mIsRtpTimeStamp) {
            j = convertToRtpTimestamp(j);
        }
        if (j > this.mLatestOutputPacketPts && !this.mJitterBuffer.containsKey(Long.valueOf(j))) {
            this.mJitterBuffer.put(Long.valueOf(j), bArr);
            synchronized (this.mSyncLock) {
                this.mSyncLock.notify();
            }
        }
        Thread.yield();
    }

    public AudioJitterBuffer setAudioFormat(int i, int i2, int i3) {
        this.mSampleRate = i;
        this.mChannelSize = i2;
        this.mSampleSize = i3;
        return this;
    }
}
