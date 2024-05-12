package com.byted.cast.render.jitterbuffer;

import X.C16880lQ;
import X.V0N;
import X.X1D;
import com.byted.cast.common.Monitor;
import com.byted.cast.render.jitterbuffer.VideoJitterBuffer;
import com.byted.cast.render.utils.Logger;
import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadThread;
import java.util.concurrent.ConcurrentSkipListMap;
import org.json.JSONObject;

/* loaded from: classes29.dex */
public class VideoJitterBuffer {
    public AudioJitterBuffer audioJitterBuffer;
    public boolean isRenderClockRunning;
    public Thread mDecodeThread;
    public Object mSyncLock = new Object();
    public ConcurrentSkipListMap<Long, byte[]> mJitterBuffer = new ConcurrentSkipListMap<>();
    public int mJitterPrefetchTime = 100;
    public JITTER_MODE mJitterMode = JITTER_MODE.QUALITY_STATIC_MODE;
    public JITTER_STATE mJitterState = JITTER_STATE.PREFETCH;
    public JitterBufferListener mCallback = null;
    public volatile long mStartPlaybackSystemTime = 0;
    public long mFirstRenderPacketPts = 0;
    public volatile long mLatestDecodePacketPts = 0;
    public long mFirstPacketArrivalTime = 0;
    public volatile boolean isRunning = true;
    public int delayFrame = 0;
    public int normalFrame = 0;
    public boolean underRunStart = false;
    public int underRunTimes = 0;
    public long underRunCount = 0;
    public long underRunStartTs = 0;
    public long periodCount = 1;
    public Runnable mDecodeTask = new Runnable() { // from class: X.ZaK
        @Override // java.lang.Runnable
        public final void run() {
            VideoJitterBuffer.this.lambda$new$0();
        }
    };

    private void doPrefetch() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("doPrefetch start...mJitterMode=");
        LIZ.append(this.mJitterMode.name());
        Logger.i("VideoJitterBuffer", X1D.LIZIZ(LIZ));
        synchronized (this.mSyncLock) {
            try {
                this.mSyncLock.wait();
                if (this.mJitterMode != JITTER_MODE.LOW_LATENCY_MODE) {
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("doPrefetch mJitterPrefetchTime=");
                    LIZ2.append(this.mJitterPrefetchTime);
                    Logger.i("VideoJitterBuffer", X1D.LIZIZ(LIZ2));
                    Thread.sleep(this.mJitterPrefetchTime);
                }
                Logger.i("VideoJitterBuffer", "doPrefetch finished...");
                this.mJitterState = JITTER_STATE.PROCESS;
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private void doProcess() {
        if (this.mJitterBuffer.isEmpty()) {
            synchronized (this.mSyncLock) {
                try {
                    this.mSyncLock.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            return;
        }
        this.mLatestDecodePacketPts = this.mJitterBuffer.firstKey().longValue();
        byte[] value = this.mJitterBuffer.pollFirstEntry().getValue();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Dequeue Packet Pts=");
        LIZ.append(this.mLatestDecodePacketPts);
        LIZ.append(" queueSize=");
        LIZ.append(this.mJitterBuffer.size());
        Logger.d("VideoJitterBuffer", X1D.LIZIZ(LIZ));
        this.mCallback.onAVSmoothOutput(value, this.mLatestDecodePacketPts);
    }

    private void reset() {
        Logger.i("VideoJitterBuffer", "reset");
        this.mJitterMode = JITTER_MODE.QUALITY_STATIC_MODE;
        this.mJitterPrefetchTime = 100;
        this.mCallback = null;
        this.mJitterState = JITTER_STATE.PREFETCH;
        this.mJitterBuffer.clear();
        this.isRenderClockRunning = false;
        this.mStartPlaybackSystemTime = 0L;
        this.mFirstRenderPacketPts = 0L;
        this.mLatestDecodePacketPts = 0L;
        this.mFirstPacketArrivalTime = 0L;
        this.audioJitterBuffer = null;
        this.periodCount = 1L;
        this.underRunStart = false;
        this.normalFrame = 0;
        this.delayFrame = 0;
        this.underRunTimes = 0;
        this.underRunCount = 0;
    }

    public void notifyAudioDelayChanged() {
        long j;
        AudioJitterBuffer audioJitterBuffer = this.audioJitterBuffer;
        if (audioJitterBuffer != null) {
            j = audioJitterBuffer.getCurrentAudioDelayMs();
            if (j != Long.MAX_VALUE) {
                j *= 1000000;
            }
        } else {
            j = Long.MAX_VALUE;
        }
        if (this.mStartPlaybackSystemTime != 0 && j != Long.MAX_VALUE) {
            long j2 = this.mStartPlaybackSystemTime - this.mFirstPacketArrivalTime;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("notifyAudioDelayChanged before mStartPlaybackSystemTime=");
            LIZ.append(this.mStartPlaybackSystemTime);
            LIZ.append(" audioDelay=");
            LIZ.append(j2);
            Logger.i("VideoJitterBuffer", X1D.LIZIZ(LIZ));
            this.mStartPlaybackSystemTime = this.mFirstPacketArrivalTime + j;
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("notifyAudioDelayChanged after mStartPlaybackSystemTime=");
            LIZ2.append(this.mStartPlaybackSystemTime);
            LIZ2.append(" audioDelay=");
            LIZ2.append(j);
            Logger.i("VideoJitterBuffer", X1D.LIZIZ(LIZ2));
            return;
        }
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append("notifyAudioDelayChanged skip mStartPlaybackSystemTime=");
        LIZ3.append(this.mStartPlaybackSystemTime);
        LIZ3.append(" audioDelay=");
        LIZ3.append(j);
        Logger.i("VideoJitterBuffer", X1D.LIZIZ(LIZ3));
    }

    public void start() {
        Logger.i("VideoJitterBuffer", "start");
        this.isRunning = true;
        PthreadThread pthreadThread = new PthreadThread(this.mDecodeTask, "VideoDecodeThread");
        this.mDecodeThread = pthreadThread;
        pthreadThread.start();
    }

    public void stop() {
        Logger.i("VideoJitterBuffer", "stop");
        this.isRunning = false;
        synchronized (this.mSyncLock) {
            this.mSyncLock.notify();
        }
        try {
            this.mDecodeThread.join();
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
        Logger.i("VideoJitterBuffer", "Decode Thread Exit");
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

    private void countRenderStatus(long j) {
        if (this.periodCount * 60 * 1000000000 > System.nanoTime() - this.mStartPlaybackSystemTime) {
            if (j >= 0) {
                this.normalFrame++;
                if (this.underRunStart) {
                    this.underRunStart = false;
                    this.underRunTimes++;
                    this.underRunCount += System.currentTimeMillis() - this.underRunStartTs;
                }
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("countRenderStatus EARLY...delay=");
                LIZ.append(j);
                LIZ.append(" underRunStart=");
                LIZ.append(this.underRunStart);
                LIZ.append(" underRunTimes=");
                LIZ.append(this.underRunTimes);
                LIZ.append(" underRunCount=");
                LIZ.append(this.underRunCount);
                LIZ.append(" normalFrame=");
                LIZ.append(this.normalFrame);
                Logger.d("VideoJitterBuffer", X1D.LIZIZ(LIZ));
                return;
            }
            this.delayFrame++;
            if (!this.underRunStart) {
                this.underRunStart = true;
                this.underRunStartTs = System.currentTimeMillis();
            }
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("countRenderStatus DELAY...delay=");
            LIZ2.append(j);
            LIZ2.append(" underRunStart=");
            LIZ2.append(this.underRunStart);
            LIZ2.append(" underRunTimes=");
            LIZ2.append(this.underRunTimes);
            LIZ2.append(" underRunCount=");
            LIZ2.append(this.underRunCount);
            LIZ2.append(" delayFrame=");
            LIZ2.append(this.delayFrame);
            Logger.d("VideoJitterBuffer", X1D.LIZIZ(LIZ2));
            return;
        }
        if (this.underRunStart) {
            this.underRunStart = false;
            this.underRunTimes++;
            this.underRunCount += System.currentTimeMillis() - this.underRunStartTs;
        }
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append("countRenderStatus: underRunTimes=");
        LIZ3.append(this.underRunTimes);
        LIZ3.append(" underRunCount=");
        LIZ3.append(this.underRunCount);
        LIZ3.append(" delayFrame=");
        LIZ3.append(this.delayFrame);
        LIZ3.append(" normalFrame=");
        LIZ3.append(this.normalFrame);
        LIZ3.append(" curTime=");
        LIZ3.append(System.currentTimeMillis());
        Logger.i("VideoJitterBuffer", X1D.LIZIZ(LIZ3));
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("underRunTimes", this.underRunTimes);
            jSONObject.put("underRunCount", this.underRunCount);
            jSONObject.put("delayFrame", this.delayFrame);
            jSONObject.put("normalFrame", this.normalFrame);
            jSONObject.put("periodCount", this.periodCount);
            Monitor.sendCustomEvent("ByteLink", "VideoPlayBackStatus", jSONObject.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
        this.periodCount++;
        this.normalFrame = 0;
        this.delayFrame = 0;
        this.underRunTimes = 0;
        this.underRunCount = 0;
    }

    public long doRender(long j) {
        long currentAudioDelayMs;
        if (this.mFirstPacketArrivalTime == 0 || j == 1) {
            Logger.i("VideoJitterBuffer", "doRender mFirstPacketArrivalTime == 0 || decodedPts == 1");
            this.mStartPlaybackSystemTime = 0L;
            this.mFirstRenderPacketPts = j;
        } else if (!this.isRenderClockRunning) {
            this.isRenderClockRunning = true;
            AudioJitterBuffer audioJitterBuffer = this.audioJitterBuffer;
            if (audioJitterBuffer == null) {
                currentAudioDelayMs = 0;
            } else {
                currentAudioDelayMs = audioJitterBuffer.getCurrentAudioDelayMs();
                if (currentAudioDelayMs == Long.MAX_VALUE) {
                    this.mStartPlaybackSystemTime = System.nanoTime() + 33333332;
                    this.mFirstRenderPacketPts = 100000000 + j;
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("doRender audioDelay=");
                    LIZ.append(currentAudioDelayMs);
                    LIZ.append(" mFirstPacketArrivalTime=");
                    LIZ.append(this.mFirstPacketArrivalTime);
                    LIZ.append(" mStartPlaybackSystemTime=");
                    LIZ.append(this.mStartPlaybackSystemTime);
                    LIZ.append(" mFirstRenderPacketPts=");
                    LIZ.append(this.mFirstRenderPacketPts);
                    Logger.i("VideoJitterBuffer", X1D.LIZIZ(LIZ));
                }
            }
            this.mStartPlaybackSystemTime = this.mFirstPacketArrivalTime + (currentAudioDelayMs * 1000000);
            this.mFirstRenderPacketPts = 100000000 + j;
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("doRender audioDelay=");
            LIZ2.append(currentAudioDelayMs);
            LIZ2.append(" mFirstPacketArrivalTime=");
            LIZ2.append(this.mFirstPacketArrivalTime);
            LIZ2.append(" mStartPlaybackSystemTime=");
            LIZ2.append(this.mStartPlaybackSystemTime);
            LIZ2.append(" mFirstRenderPacketPts=");
            LIZ2.append(this.mFirstRenderPacketPts);
            Logger.i("VideoJitterBuffer", X1D.LIZIZ(LIZ2));
        }
        if (this.mJitterMode != JITTER_MODE.LOW_LATENCY_MODE) {
            long j2 = this.mStartPlaybackSystemTime + (j - this.mFirstRenderPacketPts);
            long nanoTime = j2 - System.nanoTime();
            if (nanoTime < 0) {
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append("Render Late Packet Pts=");
                LIZ3.append(j);
                LIZ3.append(" renderTimestampNs=");
                LIZ3.append(j2);
                LIZ3.append(" delta=");
                LIZ3.append(nanoTime);
                Logger.d("VideoJitterBuffer", X1D.LIZIZ(LIZ3));
            } else if (nanoTime > 900000000) {
                long j3 = (nanoTime / 1000000) - 300;
                StringBuilder LIZ4 = X1D.LIZ();
                LIZ4.append("Render Early Packet Pts=");
                LIZ4.append(j);
                LIZ4.append(" renderTimestampNs=");
                LIZ4.append(j2);
                LIZ4.append(" delta=");
                LIZ4.append(nanoTime);
                LIZ4.append(" sleep=");
                LIZ4.append(j3);
                Logger.d("VideoJitterBuffer", X1D.LIZIZ(LIZ4));
                try {
                    Thread.sleep(j3);
                } catch (InterruptedException e) {
                    Logger.e("VideoJitterBuffer", e.toString());
                }
            } else {
                StringBuilder LIZ5 = X1D.LIZ();
                LIZ5.append("Render Normal Packet Pts=");
                LIZ5.append(j);
                LIZ5.append(" renderTimestampNs=");
                LIZ5.append(j2);
                LIZ5.append(" delta=");
                LIZ5.append(nanoTime);
                Logger.d("VideoJitterBuffer", X1D.LIZIZ(LIZ5));
            }
            countRenderStatus(nanoTime);
            return j2;
        }
        StringBuilder LIZ6 = X1D.LIZ();
        LIZ6.append("Render Packet Pts = ");
        LIZ6.append(0L);
        Logger.d("VideoJitterBuffer", X1D.LIZIZ(LIZ6));
        return 0L;
    }

    public void setAudioJitterBuffer(AudioJitterBuffer audioJitterBuffer) {
        this.audioJitterBuffer = audioJitterBuffer;
    }

    public VideoJitterBuffer setJitterCallback(JitterBufferListener jitterBufferListener) {
        Logger.i("VideoJitterBuffer", "setJitterCallback");
        this.mCallback = jitterBufferListener;
        return this;
    }

    public VideoJitterBuffer setJitterDelay(int i) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("setJitterDelay delay=");
        LIZ.append(i);
        Logger.i("VideoJitterBuffer", X1D.LIZIZ(LIZ));
        if (i >= 0 && i <= 1000) {
            this.mJitterPrefetchTime = i;
        }
        return this;
    }

    public VideoJitterBuffer setJitterMode(JITTER_MODE jitter_mode) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("setJitterMode mode=");
        LIZ.append(jitter_mode.name());
        Logger.i("VideoJitterBuffer", X1D.LIZIZ(LIZ));
        this.mJitterMode = jitter_mode;
        return this;
    }

    public void append(byte[] bArr, long j) {
        if (j == 0) {
            Logger.i("VideoJitterBuffer", "append set codec info packet pts");
            j = this.mLatestDecodePacketPts + 1;
        } else if (this.mFirstPacketArrivalTime == 0) {
            this.mFirstPacketArrivalTime = System.nanoTime();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("append mFirstPacketArrivalTime=");
            LIZ.append(this.mFirstPacketArrivalTime);
            Logger.i("VideoJitterBuffer", X1D.LIZIZ(LIZ));
        }
        if (j > this.mLatestDecodePacketPts || this.mJitterMode == JITTER_MODE.LOW_LATENCY_MODE) {
            if (this.mJitterBuffer.containsKey(Long.valueOf(j))) {
                j++;
            }
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("Append Packet Pts=");
            LIZ2.append(j);
            LIZ2.append(" queueSize=");
            LIZ2.append(this.mJitterBuffer.size());
            Logger.d("VideoJitterBuffer", X1D.LIZIZ(LIZ2));
            this.mJitterBuffer.put(Long.valueOf(j), bArr);
            synchronized (this.mSyncLock) {
                this.mSyncLock.notify();
            }
        } else {
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("Drop packet pts=");
            LIZ3.append(j);
            LIZ3.append(" queueSize=");
            LIZ3.append(this.mJitterBuffer.size());
            Logger.i("VideoJitterBuffer", X1D.LIZIZ(LIZ3));
        }
        Thread.yield();
    }
}
