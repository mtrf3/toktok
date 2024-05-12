package com.byted.cast.sdk.render.video;

import X.C16880lQ;
import X.RunnableC90194ZaY;
import X.RunnableC90195ZaZ;
import X.V0N;
import android.media.MediaCodec;
import android.media.MediaFormat;
import com.byted.cast.sdk.render.audio.AudioJitterBuffer;
import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadThread;
import java.util.concurrent.ConcurrentSkipListMap;

/* loaded from: classes29.dex */
public class VideoJitterBuffer {
    public static volatile VideoJitterBuffer mInstance;
    public boolean isRenderClockRunning;
    public Thread mDecodeThread;
    public Thread mRenderThread;
    public Object mSyncLock = new Object();
    public ConcurrentSkipListMap<Long, byte[]> mJitterBuffer = new ConcurrentSkipListMap<>();
    public int mJitterPrefetchTime = 100;
    public JITTER_MODE mJitterMode = JITTER_MODE.QUALITY_STATIC_MODE;
    public JITTER_STATE mJitterState = JITTER_STATE.PREFETCH;
    public VideoJitterBufferCallback mCallback = null;
    public volatile long mStartPlaybackSystemTime = 0;
    public long mFirstRenderPacketPts = 0;
    public volatile long mLatestDecodePacketPts = 0;
    public long mFirstPacketArrivalTime = 0;
    public volatile boolean isRunning = true;
    public MediaCodec mMediaCodec = null;
    public MediaCodec.BufferInfo mBufferInfo = null;
    public long preVsyncSeq = 0;
    public long frameCount = 0;
    public int lostFrame = 0;
    public int lagFrame = 0;
    public int lagFrameVsync = 0;
    public int fastFrame = 0;
    public int normalFrame = 0;
    public Runnable mDecodeTask = new RunnableC90194ZaY(0, this);
    public Runnable mRenderTask = new RunnableC90195ZaZ(0, this);

    public void start() {
        this.isRunning = true;
        PthreadThread pthreadThread = new PthreadThread(this.mDecodeTask, "VideoDecodeThread");
        this.mDecodeThread = pthreadThread;
        pthreadThread.start();
        PthreadThread pthreadThread2 = new PthreadThread(this.mRenderTask, "VideoRenderThread");
        this.mRenderThread = pthreadThread2;
        pthreadThread2.start();
    }

    public void stop() {
        this.isRunning = false;
        synchronized (this.mSyncLock) {
            this.mSyncLock.notify();
        }
        try {
            this.mDecodeThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        try {
            this.mRenderThread.join();
        } catch (InterruptedException e2) {
            e2.printStackTrace();
        }
        reset();
    }

    private void doPrefetch() {
        synchronized (this.mSyncLock) {
            try {
                this.mSyncLock.wait();
                if (this.mJitterMode != JITTER_MODE.LOW_LATENCY_MODE) {
                    Thread.sleep(this.mJitterPrefetchTime);
                }
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
        try {
            int dequeueInputBuffer = this.mMediaCodec.dequeueInputBuffer(-1L);
            if (dequeueInputBuffer >= 0) {
                this.mLatestDecodePacketPts = this.mJitterBuffer.firstKey().longValue();
                byte[] value = this.mJitterBuffer.pollFirstEntry().getValue();
                this.mMediaCodec.getInputBuffer(dequeueInputBuffer).put(value);
                this.mMediaCodec.queueInputBuffer(dequeueInputBuffer, 0, value.length, this.mLatestDecodePacketPts, 0);
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    private void doRender() {
        try {
            int dequeueOutputBuffer = this.mMediaCodec.dequeueOutputBuffer(this.mBufferInfo, 1000000L);
            if (dequeueOutputBuffer >= 0) {
                if (this.mFirstPacketArrivalTime == 0) {
                    this.mStartPlaybackSystemTime = 0L;
                    this.mFirstRenderPacketPts = this.mBufferInfo.presentationTimeUs;
                } else if (!this.isRenderClockRunning) {
                    this.isRenderClockRunning = true;
                    long currentAudioDelay = AudioJitterBuffer.getInstance().getCurrentAudioDelay();
                    if (currentAudioDelay == Long.MAX_VALUE) {
                        this.mStartPlaybackSystemTime = System.nanoTime() + 33333332;
                    } else {
                        this.mStartPlaybackSystemTime = this.mFirstPacketArrivalTime + currentAudioDelay;
                    }
                    this.mFirstRenderPacketPts = this.mBufferInfo.presentationTimeUs;
                }
                if (this.mJitterMode == JITTER_MODE.LOW_LATENCY_MODE) {
                    this.mMediaCodec.releaseOutputBuffer(dequeueOutputBuffer, true);
                    return;
                }
                long j = this.mStartPlaybackSystemTime + (this.mBufferInfo.presentationTimeUs - this.mFirstRenderPacketPts);
                long nanoTime = j - System.nanoTime();
                if (nanoTime >= 0 && nanoTime > 900000000) {
                    Thread.sleep((nanoTime / 1000000) - 300);
                }
                this.mMediaCodec.releaseOutputBuffer(dequeueOutputBuffer, j);
                return;
            }
            if (dequeueOutputBuffer == -1 || dequeueOutputBuffer != -2) {
                return;
            }
            MediaFormat outputFormat = this.mMediaCodec.getOutputFormat();
            int integer = outputFormat.getInteger("width");
            int integer2 = outputFormat.getInteger("height");
            VideoJitterBufferCallback videoJitterBufferCallback = this.mCallback;
            if (videoJitterBufferCallback == null) {
                return;
            }
            videoJitterBufferCallback.onVideoSize(integer, integer2);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static VideoJitterBuffer getInstance() {
        if (mInstance == null) {
            synchronized (VideoJitterBuffer.class) {
                if (mInstance == null) {
                    mInstance = new VideoJitterBuffer();
                }
            }
        }
        return mInstance;
    }

    private void reset() {
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
        this.mMediaCodec = null;
        this.mBufferInfo = null;
    }

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

    public /* synthetic */ void lambda$new$1() {
        C16880lQ.LLLLIIIILLL().setPriority(10);
        while (this.isRunning) {
            doRender();
        }
    }

    public void notifyAudioDelayChanged() {
        long currentAudioDelay = AudioJitterBuffer.getInstance().getCurrentAudioDelay();
        if (this.mStartPlaybackSystemTime != 0 && currentAudioDelay != Long.MAX_VALUE) {
            this.mStartPlaybackSystemTime = this.mFirstPacketArrivalTime + currentAudioDelay;
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

    private void countRenderStatus(long j) {
        long j2 = this.frameCount + 1;
        this.frameCount = j2;
        if (j2 <= 1000 || j2 <= 1000 || j2 >= 19001) {
            return;
        }
        long j3 = j / 16666666;
        if (this.preVsyncSeq == 0) {
            this.preVsyncSeq = j3 - 2;
        }
        long j4 = this.preVsyncSeq;
        if (j3 == j4) {
            this.lostFrame++;
        } else if (j3 - j4 > 2) {
            this.lagFrameVsync = (int) (this.lagFrameVsync + ((j3 - j4) - 2));
            this.lagFrame++;
        } else if (j3 - j4 == 1) {
            this.fastFrame++;
        } else {
            this.normalFrame++;
        }
        this.preVsyncSeq = j3;
    }

    public VideoJitterBuffer setJitterCallback(VideoJitterBufferCallback videoJitterBufferCallback) {
        this.mCallback = videoJitterBufferCallback;
        return this;
    }

    public VideoJitterBuffer setJitterDelay(int i) {
        if (i >= 0 && i <= 1000) {
            this.mJitterPrefetchTime = i;
        }
        return this;
    }

    public VideoJitterBuffer setJitterMode(JITTER_MODE jitter_mode) {
        this.mJitterMode = jitter_mode;
        return this;
    }

    public VideoJitterBuffer setMediaCodec(MediaCodec mediaCodec, MediaCodec.BufferInfo bufferInfo) {
        this.mMediaCodec = mediaCodec;
        this.mBufferInfo = bufferInfo;
        return this;
    }

    public void append(byte[] bArr, long j, boolean z) {
        if (z) {
            try {
                j = this.mJitterBuffer.lastKey().longValue() + 1;
            } catch (Exception unused) {
                j -= 2;
            }
        } else if (this.mFirstPacketArrivalTime == 0) {
            this.mFirstPacketArrivalTime = System.nanoTime();
        }
        if (j > this.mLatestDecodePacketPts && !this.mJitterBuffer.containsKey(Long.valueOf(j))) {
            this.mJitterBuffer.put(Long.valueOf(j), bArr);
            synchronized (this.mSyncLock) {
                this.mSyncLock.notify();
            }
        }
        Thread.yield();
    }
}
