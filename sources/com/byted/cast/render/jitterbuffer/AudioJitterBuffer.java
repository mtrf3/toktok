package com.byted.cast.render.jitterbuffer;

import X.C16880lQ;
import X.V0N;
import X.X1D;
import com.byted.cast.common.Monitor;
import com.byted.cast.render.jitterbuffer.AudioJitterBuffer;
import com.byted.cast.render.utils.Logger;
import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadThread;
import java.util.concurrent.ConcurrentSkipListMap;
import org.json.JSONObject;

/* loaded from: classes29.dex */
public class AudioJitterBuffer {
    public Thread mPlaybackThread;
    public VideoJitterBuffer videoJitterBuffer;
    public final Object mSyncLock = new Object();
    public ConcurrentSkipListMap<Long, byte[]> mJitterBuffer = new ConcurrentSkipListMap<>();
    public JITTER_MODE mJitterMode = JITTER_MODE.QUALITY_STATIC_MODE;
    public JITTER_STATE mJitterState = JITTER_STATE.PREFETCH;
    public int mJitterPrefetchSize = 5;
    public JitterBufferListener mCallback = null;
    public volatile long mOriginalStartPlaybackSystemTimeMs = 0;
    public volatile long mTunedStartPlaybackSystemTimeMs = 0;
    public long mFirstOutputPacketTimeRtp = 0;
    public volatile long mLatestOutputPacketPtsRtp = -1;
    public int mPacketPlayTimeMs = 0;
    public int mPerPacketRtpLen = 0;
    public int mSampleRate = 44100;
    public int mChannelSize = 0;
    public int mSampleSize = 0;
    public int denominator = -1;
    public long firstPacketPts = 0;
    public volatile boolean isRunning = true;
    public boolean mIsRtpTimeStamp = false;
    public long underRunStart = 0;
    public long underRunCount = 0;
    public long underRunTimes = 0;
    public int lateCount = 0;
    public int lostCount = 0;
    public int okCount = 0;
    public int periodCount = 1;
    public Runnable mPlaybackTask = new Runnable() { // from class: X.ZaJ
        @Override // java.lang.Runnable
        public final void run() {
            AudioJitterBuffer.this.lambda$new$0();
        }
    };
    public long mFirstDirtyPtsMs = 0;
    public long mPreRtpTs = 0;
    public long mPreSysTs = 0;
    public long mSR_StartPts = 0;
    public long mSR_StartSysTs = 0;
    public long mSR_CurMinDelta = Long.MAX_VALUE;
    public long mSR_Counter = 0;

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
        this.mOriginalStartPlaybackSystemTimeMs = System.currentTimeMillis();
        this.mTunedStartPlaybackSystemTimeMs = this.mOriginalStartPlaybackSystemTimeMs;
        long longValue = this.mJitterBuffer.firstKey().longValue();
        this.mFirstOutputPacketTimeRtp = longValue;
        this.mLatestOutputPacketPtsRtp = longValue;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Prefetch Finished. QueueSize=");
        LIZ.append(this.mJitterBuffer.size());
        LIZ.append(" mOriginalStartPlaybackSystemTime=");
        LIZ.append(this.mOriginalStartPlaybackSystemTimeMs);
        LIZ.append(" mTunedStartPlaybackSystemTime=");
        LIZ.append(this.mTunedStartPlaybackSystemTimeMs);
        LIZ.append(" mFirstOutputPacketTime=");
        LIZ.append(this.mFirstOutputPacketTimeRtp);
        Logger.i("AudioJitterBuffer", X1D.LIZIZ(LIZ));
        VideoJitterBuffer videoJitterBuffer = this.videoJitterBuffer;
        if (videoJitterBuffer != null) {
            videoJitterBuffer.notifyAudioDelayChanged();
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("Output first packet pts=");
        LIZ2.append(this.mLatestOutputPacketPtsRtp);
        Logger.i("AudioJitterBuffer", X1D.LIZIZ(LIZ2));
        this.mCallback.onAVSmoothOutput(this.mJitterBuffer.pollFirstEntry().getValue(), this.mLatestOutputPacketPtsRtp);
    }

    private void doProcess() {
        if (this.mJitterBuffer.isEmpty()) {
            underRunCheck();
            synchronized (this.mSyncLock) {
                try {
                    this.mSyncLock.wait(this.mPacketPlayTimeMs);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            return;
        }
        long longValue = this.mJitterBuffer.firstKey().longValue();
        long calculatePacketDelayRtp = calculatePacketDelayRtp(longValue);
        if (calculatePacketDelayRtp >= 0) {
            long j = longValue - this.mLatestOutputPacketPtsRtp;
            int i = this.mPerPacketRtpLen;
            if (j == i) {
                countRenderStatus(COUNT_ELEMENT.PACKET_OK, longValue);
                this.mLatestOutputPacketPtsRtp = longValue;
                this.mCallback.onAVSmoothOutput(this.mJitterBuffer.pollFirstEntry().getValue(), this.mLatestOutputPacketPtsRtp);
                return;
            }
            if (calculatePacketDelayRtp > i) {
                long underRunCheck = underRunCheck();
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("Missing and wait pts=");
                LIZ.append(this.mLatestOutputPacketPtsRtp + this.mPerPacketRtpLen);
                LIZ.append(" to pts=");
                LIZ.append(longValue - this.mPerPacketRtpLen);
                LIZ.append(" availableBufferTime=");
                LIZ.append(underRunCheck);
                Logger.d("AudioJitterBuffer", X1D.LIZIZ(LIZ));
                synchronized (this.mSyncLock) {
                    try {
                        this.mSyncLock.wait(this.mPacketPlayTimeMs);
                    } catch (InterruptedException e2) {
                        e2.printStackTrace();
                    }
                }
                return;
            }
            countRenderStatus(COUNT_ELEMENT.PACKET_LOST, longValue);
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("Missing and drop Rtp time from pts=");
            LIZ2.append(this.mLatestOutputPacketPtsRtp + this.mPerPacketRtpLen);
            LIZ2.append(" to pts=");
            LIZ2.append(longValue - this.mPerPacketRtpLen);
            Logger.i("AudioJitterBuffer", X1D.LIZIZ(LIZ2));
            this.mLatestOutputPacketPtsRtp = longValue;
            this.mCallback.onAVSmoothOutput(this.mJitterBuffer.pollFirstEntry().getValue(), this.mLatestOutputPacketPtsRtp);
            return;
        }
        countRenderStatus(COUNT_ELEMENT.PACKET_LATE, longValue);
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append("Late packet pts=");
        LIZ3.append(longValue);
        LIZ3.append(" delayTimeRtp=");
        LIZ3.append(calculatePacketDelayRtp);
        Logger.w("AudioJitterBuffer", X1D.LIZIZ(LIZ3));
        if (longValue > this.mLatestOutputPacketPtsRtp) {
            this.mLatestOutputPacketPtsRtp = longValue;
        }
        this.mJitterBuffer.pollFirstEntry();
    }

    private void reset() {
        Logger.i("AudioJitterBuffer", "reset");
        this.mJitterMode = JITTER_MODE.QUALITY_STATIC_MODE;
        this.mJitterPrefetchSize = 5;
        this.mCallback = null;
        this.mJitterState = JITTER_STATE.PREFETCH;
        this.mJitterBuffer.clear();
        this.mOriginalStartPlaybackSystemTimeMs = 0L;
        this.mTunedStartPlaybackSystemTimeMs = 0L;
        this.mFirstOutputPacketTimeRtp = 0L;
        this.mLatestOutputPacketPtsRtp = -1L;
        this.mPacketPlayTimeMs = 0;
        this.mPerPacketRtpLen = 0;
        this.mSampleRate = 44100;
        this.mChannelSize = 0;
        this.mSampleSize = 0;
        this.mFirstDirtyPtsMs = 0L;
        this.videoJitterBuffer = null;
        this.mSR_StartPts = 0L;
        this.mSR_StartSysTs = 0L;
        this.mSR_CurMinDelta = Long.MAX_VALUE;
        this.mSR_Counter = 0L;
        this.firstPacketPts = 0L;
        this.mIsRtpTimeStamp = false;
        this.periodCount = 1;
        this.underRunStart = 0L;
        this.underRunCount = 0L;
        this.underRunTimes = 0L;
        this.lateCount = 0;
        this.lostCount = 0;
        this.okCount = 0;
    }

    private long underRunCheck() {
        long calculatePacketDelayRtp = calculatePacketDelayRtp(this.mLatestOutputPacketPtsRtp) + this.mPerPacketRtpLen;
        if (calculatePacketDelayRtp < 0) {
            countRenderStatus(COUNT_ELEMENT.UNDER_RUN, this.mLatestOutputPacketPtsRtp);
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("underRunCheck[");
            LIZ.append(this.mJitterMode.name());
            LIZ.append("]: underRunTime=");
            LIZ.append(calculatePacketDelayRtp);
            Logger.d("AudioJitterBuffer", X1D.LIZIZ(LIZ));
            if (this.mJitterMode == JITTER_MODE.QUALITY_DYNAMIC_MODE) {
                int i = this.mJitterPrefetchSize;
                if ((this.mPerPacketRtpLen * i) + calculatePacketDelayRtp < 0 && i < 100) {
                    this.mJitterPrefetchSize = i + 10;
                    this.mOriginalStartPlaybackSystemTimeMs += ((this.mPerPacketRtpLen * 10) * 1000) / this.mSampleRate;
                    this.mTunedStartPlaybackSystemTimeMs += ((this.mPerPacketRtpLen * 10) * 1000) / this.mSampleRate;
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("underRunCheck[");
                    LIZ2.append(this.mJitterMode.name());
                    LIZ2.append("]: reset mOriginalStartPlaybackSystemTime=");
                    LIZ2.append(this.mOriginalStartPlaybackSystemTimeMs);
                    LIZ2.append(" mTunedStartPlaybackSystemTime=");
                    LIZ2.append(this.mTunedStartPlaybackSystemTimeMs);
                    Logger.d("AudioJitterBuffer", X1D.LIZIZ(LIZ2));
                    VideoJitterBuffer videoJitterBuffer = this.videoJitterBuffer;
                    if (videoJitterBuffer != null) {
                        videoJitterBuffer.notifyAudioDelayChanged();
                    }
                }
            }
        }
        return calculatePacketDelayRtp;
    }

    public long getCurrentAudioDelayMs() {
        if (this.mOriginalStartPlaybackSystemTimeMs != 0) {
            long j = (((this.mJitterPrefetchSize * this.mPerPacketRtpLen) * 1000) / this.mSampleRate) + (this.mTunedStartPlaybackSystemTimeMs - this.mOriginalStartPlaybackSystemTimeMs);
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("getCurrentAudioDelay delay=");
            LIZ.append(j);
            LIZ.append(" mJitterPrefetchSize=");
            LIZ.append(this.mJitterPrefetchSize);
            LIZ.append(" clockDelta=");
            LIZ.append((this.mTunedStartPlaybackSystemTimeMs - this.mOriginalStartPlaybackSystemTimeMs) * 1000000);
            Logger.i("AudioJitterBuffer", X1D.LIZIZ(LIZ));
            return j;
        }
        Logger.i("AudioJitterBuffer", "getCurrentAudioDelay delay=Long.MAX_VALUE");
        return Long.MAX_VALUE;
    }

    public void start() {
        Logger.i("AudioJitterBuffer", "start");
        this.isRunning = true;
        PthreadThread pthreadThread = new PthreadThread(this.mPlaybackTask, "AudioPlaybackThread");
        this.mPlaybackThread = pthreadThread;
        pthreadThread.setPriority(10);
        this.mPlaybackThread.start();
    }

    public void stop() {
        Logger.i("AudioJitterBuffer", "stop");
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
        Logger.i("AudioJitterBuffer", "Playback Thread Exit");
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

    private long calculatePacketDelayRtp(long j) {
        return j - (this.mFirstOutputPacketTimeRtp + (((System.currentTimeMillis() - this.mTunedStartPlaybackSystemTimeMs) * this.mSampleRate) / 1000));
    }

    public long convertToRtpTimestamp(long j) {
        long j2 = this.mFirstDirtyPtsMs;
        int i = this.mSampleRate;
        long j3 = ((((j - j2) * i) / 1000) / 1024) * 1024;
        long j4 = (((((j - j2) + 10) * i) / 1000) / 1024) * 1024;
        if (j3 <= j4) {
            j3 = j4;
        }
        long j5 = this.mPreRtpTs;
        int i2 = this.mPerPacketRtpLen;
        if (j3 != i2 + j5 && j - this.mPreSysTs < (this.mPacketPlayTimeMs * 2) - 10) {
            j3 = i2 + j5;
        }
        this.mPreRtpTs = j3;
        this.mPreSysTs = j;
        return j3;
    }

    public AudioJitterBuffer setJitterCallback(JitterBufferListener jitterBufferListener) {
        Logger.i("AudioJitterBuffer", "setJitterCallback");
        this.mCallback = jitterBufferListener;
        return this;
    }

    public AudioJitterBuffer setJitterMode(JITTER_MODE jitter_mode) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("setJitterMode mode=");
        LIZ.append(jitter_mode.name());
        Logger.i("AudioJitterBuffer", X1D.LIZIZ(LIZ));
        this.mJitterMode = jitter_mode;
        if (jitter_mode == JITTER_MODE.LOW_LATENCY_MODE) {
            this.mJitterPrefetchSize = 1;
        }
        return this;
    }

    public AudioJitterBuffer setJitterPrefetchSize(int i) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("setJitterPrefetchSize size=");
        LIZ.append(i);
        Logger.i("AudioJitterBuffer", X1D.LIZIZ(LIZ));
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

    public void setVideoJitterBuffer(VideoJitterBuffer videoJitterBuffer) {
        this.videoJitterBuffer = videoJitterBuffer;
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
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("set_audio_ntp_base: receiveDelta=");
            LIZ.append(currentTimeMillis);
            LIZ.append(" sendDelta=");
            LIZ.append(j2);
            LIZ.append(" curDeviation=");
            LIZ.append(j4);
            LIZ.append(" mSR_CurMinDelta=");
            LIZ.append(this.mSR_CurMinDelta);
            LIZ.append(" mSR_Counter=");
            LIZ.append(this.mSR_Counter);
            Logger.i("AudioJitterBuffer", X1D.LIZIZ(LIZ));
            if (this.mSR_Counter % 10000 != 0) {
                return;
            }
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("set_audio_ntp_base adjust before original=");
            LIZ2.append(this.mOriginalStartPlaybackSystemTimeMs);
            LIZ2.append(" tuned=");
            LIZ2.append(this.mTunedStartPlaybackSystemTimeMs);
            Logger.i("AudioJitterBuffer", X1D.LIZIZ(LIZ2));
            this.mTunedStartPlaybackSystemTimeMs = this.mOriginalStartPlaybackSystemTimeMs + this.mSR_CurMinDelta;
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("set_audio_ntp_base adjust after original=");
            LIZ3.append(this.mOriginalStartPlaybackSystemTimeMs);
            LIZ3.append(" tuned=");
            LIZ3.append(this.mTunedStartPlaybackSystemTimeMs);
            LIZ3.append(" delta=");
            LIZ3.append(this.mSR_CurMinDelta);
            Logger.i("AudioJitterBuffer", X1D.LIZIZ(LIZ3));
            this.mSR_CurMinDelta = Long.MAX_VALUE;
            VideoJitterBuffer videoJitterBuffer = this.videoJitterBuffer;
            if (videoJitterBuffer == null) {
                return;
            }
            videoJitterBuffer.notifyAudioDelayChanged();
        }
    }

    private void countRenderStatus(COUNT_ELEMENT count_element, long j) {
        if (this.periodCount * 60 * this.mSampleRate > this.mLatestOutputPacketPtsRtp - this.mFirstOutputPacketTimeRtp) {
            if (count_element == COUNT_ELEMENT.UNDER_RUN) {
                if (this.underRunStart == 0) {
                    this.underRunStart = this.mLatestOutputPacketPtsRtp;
                }
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("countRenderStatus UNDER_RUN...val=");
                LIZ.append(j);
                LIZ.append(" underRunStart=");
                LIZ.append(this.underRunStart);
                Logger.d("AudioJitterBuffer", X1D.LIZIZ(LIZ));
                return;
            }
            if (count_element == COUNT_ELEMENT.PACKET_LOST) {
                this.okCount++;
                if (this.underRunStart == 0) {
                    this.underRunStart = this.mLatestOutputPacketPtsRtp;
                }
                this.underRunTimes++;
                this.underRunCount += (j - this.underRunStart) - this.mPerPacketRtpLen;
                this.underRunStart = 0L;
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("countRenderStatus PACKET_LOST...val=");
                LIZ2.append(j);
                LIZ2.append(" underRunCount=");
                LIZ2.append(this.underRunCount);
                LIZ2.append(" underRunTimes=");
                LIZ2.append(this.underRunTimes);
                Logger.d("AudioJitterBuffer", X1D.LIZIZ(LIZ2));
                return;
            }
            if (count_element == COUNT_ELEMENT.PACKET_OK) {
                this.okCount++;
                long j2 = this.underRunStart;
                if (j2 != 0) {
                    this.underRunTimes++;
                    this.underRunCount += (j - j2) - this.mPerPacketRtpLen;
                    this.underRunStart = 0L;
                }
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append("countRenderStatus PACKET_OK...val=");
                LIZ3.append(j);
                LIZ3.append(" underRunCount=");
                LIZ3.append(this.underRunCount);
                LIZ3.append(" underRunTimes=");
                LIZ3.append(this.underRunTimes);
                LIZ3.append(" okCount=");
                LIZ3.append(this.okCount);
                LIZ3.append(" lateCount=");
                LIZ3.append(this.lateCount);
                Logger.d("AudioJitterBuffer", X1D.LIZIZ(LIZ3));
                return;
            }
            if (count_element != COUNT_ELEMENT.PACKET_LATE) {
                return;
            }
            this.lateCount++;
            if (this.underRunStart == 0) {
                this.underRunStart = this.mLatestOutputPacketPtsRtp;
            }
            StringBuilder LIZ4 = X1D.LIZ();
            LIZ4.append("countRenderStatus PACKET_LATE...val=");
            LIZ4.append(j);
            LIZ4.append(" underRunStart=");
            LIZ4.append(this.underRunStart);
            LIZ4.append(" lateCount=");
            LIZ4.append(this.lateCount);
            Logger.d("AudioJitterBuffer", X1D.LIZIZ(LIZ4));
            return;
        }
        long j3 = this.underRunStart;
        if (j3 != 0) {
            long j4 = (((this.periodCount * 60) * this.mSampleRate) - j3) - this.mPerPacketRtpLen;
            this.underRunCount += j4;
            StringBuilder LIZ5 = X1D.LIZ();
            LIZ5.append("countRenderStatus extra...extraUnderRun=");
            LIZ5.append(j4);
            LIZ5.append(" underRunCount=");
            LIZ5.append(this.underRunCount);
            Logger.d("AudioJitterBuffer", X1D.LIZIZ(LIZ5));
        }
        this.lostCount = ((int) (this.underRunCount / this.mPerPacketRtpLen)) - this.lateCount;
        StringBuilder LIZ6 = X1D.LIZ();
        LIZ6.append("countRenderStatus: underRunTimes=");
        LIZ6.append(this.underRunTimes);
        LIZ6.append(" underRunCount=");
        LIZ6.append(this.underRunCount);
        LIZ6.append(" lateCount=");
        LIZ6.append(this.lateCount);
        LIZ6.append(" lostCount=");
        LIZ6.append(this.lostCount);
        LIZ6.append(" okCount=");
        LIZ6.append(this.okCount);
        LIZ6.append(" periodCount=");
        LIZ6.append(this.periodCount);
        LIZ6.append(" curTime=");
        LIZ6.append(System.currentTimeMillis());
        Logger.i("AudioJitterBuffer", X1D.LIZIZ(LIZ6));
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("underRunTimes", this.underRunTimes);
            jSONObject.put("underRunCount", this.underRunCount);
            jSONObject.put("lateCount", this.lateCount);
            jSONObject.put("lostCount", this.lostCount);
            jSONObject.put("okCount", this.okCount);
            jSONObject.put("periodCount", this.periodCount);
            Monitor.sendCustomEvent("ByteLink", "AudioPlayBackStatus", jSONObject.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
        this.periodCount++;
        this.okCount = 0;
        this.lostCount = 0;
        this.lateCount = 0;
        long j5 = 0;
        this.underRunTimes = j5;
        this.underRunCount = j5;
        this.underRunStart = j5;
    }

    public void append(byte[] bArr, long j) {
        long convertToRtpTimestamp;
        int i;
        long j2 = this.firstPacketPts;
        if (j2 == 0) {
            this.firstPacketPts = j;
            return;
        }
        if (this.denominator == -1) {
            if (j - j2 > 5000) {
                i = 1000;
            } else {
                i = 1;
            }
            this.denominator = i;
        }
        long j3 = j / this.denominator;
        if (this.mPerPacketRtpLen == 0) {
            int length = bArr.length / (this.mChannelSize * this.mSampleSize);
            this.mPerPacketRtpLen = length;
            this.mPacketPlayTimeMs = (length * 1000) / this.mSampleRate;
            this.mFirstDirtyPtsMs = j3;
            VideoJitterBuffer videoJitterBuffer = this.videoJitterBuffer;
            if (videoJitterBuffer != null) {
                videoJitterBuffer.notifyAudioDelayChanged();
            }
            if (j3 % this.mPerPacketRtpLen == 0 && j3 < r3 * 5) {
                this.mIsRtpTimeStamp = true;
            }
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Append first mPacketDurationLen=");
            LIZ.append(this.mPerPacketRtpLen);
            LIZ.append(" mPacketPlayTimeMs=");
            LIZ.append(this.mPacketPlayTimeMs);
            LIZ.append(" mFirstDirtyPtsMs=");
            LIZ.append(this.mFirstDirtyPtsMs);
            LIZ.append(" mIsRtpTimeStamp=");
            LIZ.append(this.mIsRtpTimeStamp);
            Logger.i("AudioJitterBuffer", X1D.LIZIZ(LIZ));
        }
        set_audio_ntp_base(j3);
        if (this.mIsRtpTimeStamp) {
            convertToRtpTimestamp = j3;
        } else {
            convertToRtpTimestamp = convertToRtpTimestamp(j3);
        }
        if (convertToRtpTimestamp > this.mLatestOutputPacketPtsRtp && !this.mJitterBuffer.containsKey(Long.valueOf(convertToRtpTimestamp))) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("Append packet timestamp=");
            LIZ2.append(j3);
            LIZ2.append(" rtp=");
            LIZ2.append(convertToRtpTimestamp);
            LIZ2.append(" queueSize=");
            LIZ2.append(this.mJitterBuffer.size());
            LIZ2.append(" mLatestOutputPacketPts=");
            LIZ2.append(this.mLatestOutputPacketPtsRtp);
            LIZ2.append(" length=");
            LIZ2.append(bArr.length);
            Logger.i("AudioJitterBuffer", X1D.LIZIZ(LIZ2));
            this.mJitterBuffer.put(Long.valueOf(convertToRtpTimestamp), bArr);
            synchronized (this.mSyncLock) {
                this.mSyncLock.notify();
            }
        } else {
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("Drop packet timestamp=");
            LIZ3.append(j3);
            LIZ3.append(" rtp=");
            LIZ3.append(convertToRtpTimestamp);
            LIZ3.append(" queueSize=");
            LIZ3.append(this.mJitterBuffer.size());
            Logger.i("AudioJitterBuffer", X1D.LIZIZ(LIZ3));
        }
        Thread.yield();
    }

    public AudioJitterBuffer setAudioFormat(int i, int i2, int i3) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("setJitterPrefetchSize sampleRate=");
        LIZ.append(i);
        LIZ.append(" channelSize=");
        LIZ.append(i2);
        LIZ.append(" sampleSize=");
        LIZ.append(i3);
        Logger.i("AudioJitterBuffer", X1D.LIZIZ(LIZ));
        this.mSampleRate = i;
        this.mChannelSize = i2;
        this.mSampleSize = i3;
        return this;
    }
}
