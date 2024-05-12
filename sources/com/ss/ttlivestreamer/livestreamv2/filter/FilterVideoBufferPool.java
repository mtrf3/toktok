package com.ss.ttlivestreamer.livestreamv2.filter;

import X.AnonymousClass028;
import X.X1D;
import android.util.AndroidRuntimeException;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.ttlivestreamer.core.buffer.GlTextureFrameBuffer;
import com.ss.ttlivestreamer.core.buffer.VideoFrame;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes12.dex */
public class FilterVideoBufferPool {
    public AtomicInteger blockCnt;
    public final int mMaxSize;
    public final List<Recycle> mPools;
    public final Map<Integer, Recycle> mRecycles;
    public final boolean mSyncMode;
    public boolean recordCnt;

    /* loaded from: classes12.dex */
    public class Recycle implements Runnable {
        public final AtomicInteger mAtomicInteger = new AtomicInteger(0);
        public VideoFrame.IExtraData mExtraData;
        public GlTextureFrameBuffer mTextureBuffer;

        public void release() {
            this.mTextureBuffer = null;
        }

        @Override // java.lang.Runnable
        public void run() {
            com_ss_ttlivestreamer_livestreamv2_filter_FilterVideoBufferPool$Recycle_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
        }

        public void addRef() {
            if (this.mAtomicInteger.get() < 0) {
                AndroidRuntimeException androidRuntimeException = new AndroidRuntimeException("BUG ");
                if (AnonymousClass028.LJI(androidRuntimeException, "FilterVideoBufferPool#Recycle.addRef")) {
                    throw androidRuntimeException;
                }
            }
            this.mAtomicInteger.incrementAndGet();
        }

        public void decRef() {
            if (this.mAtomicInteger.decrementAndGet() < 0) {
                AndroidRuntimeException androidRuntimeException = new AndroidRuntimeException("BUG ");
                if (!AnonymousClass028.LJI(androidRuntimeException, "FilterVideoBufferPool#Recycle.decRef")) {
                } else {
                    throw androidRuntimeException;
                }
            }
        }

        public int getRefCounts() {
            return this.mAtomicInteger.get();
        }

        public String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("tex:");
            LIZ.append(this.mTextureBuffer.getTextureId());
            LIZ.append(",fb:");
            LIZ.append(this.mTextureBuffer.getFrameBufferId());
            LIZ.append(",w:");
            LIZ.append(this.mTextureBuffer.getWidth());
            LIZ.append(",h:");
            LIZ.append(this.mTextureBuffer.getHeight());
            return X1D.LIZIZ(LIZ);
        }

        public void com_ss_ttlivestreamer_livestreamv2_filter_FilterVideoBufferPool$Recycle__run$___twin___() {
            decRef();
        }

        public GlTextureFrameBuffer getBuffer() {
            return this.mTextureBuffer;
        }

        public VideoFrame.IExtraData getExtraData() {
            return this.mExtraData;
        }

        public static void com_ss_ttlivestreamer_livestreamv2_filter_FilterVideoBufferPool$Recycle_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(Recycle recycle) {
            boolean LIZ;
            try {
                recycle.com_ss_ttlivestreamer_livestreamv2_filter_FilterVideoBufferPool$Recycle__run$___twin___();
            } finally {
                if (LIZ) {
                }
            }
        }

        public void setExtrData(VideoFrame.IExtraData iExtraData) {
            this.mExtraData = iExtraData;
        }

        public Recycle(GlTextureFrameBuffer glTextureFrameBuffer) {
            this.mTextureBuffer = glTextureFrameBuffer;
        }

        public void setSize(int i, int i2) {
            int textureId;
            GlTextureFrameBuffer glTextureFrameBuffer = this.mTextureBuffer;
            if (glTextureFrameBuffer != null) {
                int textureId2 = glTextureFrameBuffer.getTextureId();
                if (this.mTextureBuffer.setSize(i, i2) && (textureId = this.mTextureBuffer.getTextureId()) != textureId2) {
                    FilterVideoBufferPool.this.mRecycles.put(Integer.valueOf(textureId), this);
                    FilterVideoBufferPool.this.mRecycles.remove(Integer.valueOf(textureId2));
                }
            }
        }
    }

    private Recycle getRecycle() {
        for (Recycle recycle : this.mPools) {
            if (recycle.getRefCounts() == 0) {
                return recycle;
            }
        }
        return null;
    }

    public int getBlockCnt() {
        if (!this.recordCnt) {
            return 0;
        }
        return this.blockCnt.getAndSet(0);
    }

    public Recycle pop() {
        if (this.mPools.size() > 0) {
            return (Recycle) ListProtector.remove(this.mPools, 0);
        }
        return null;
    }

    public void release() {
        this.mRecycles.clear();
    }

    public int size() {
        return this.mPools.size();
    }

    public FilterVideoBufferPool(int i) {
        this(i, false);
    }

    private void add(Recycle recycle) {
        this.mPools.add(recycle);
    }

    public Recycle getRecycleWithTexId(int i) {
        return this.mRecycles.get(Integer.valueOf(i));
    }

    public FilterVideoBufferPool(int i, boolean z) {
        this(i, z, false);
    }

    public synchronized Recycle getBuffer(int i, int i2) {
        Recycle recycle = getRecycle();
        if (recycle == null) {
            if (this.mPools.size() < this.mMaxSize) {
                GlTextureFrameBuffer glTextureFrameBuffer = new GlTextureFrameBuffer(6408);
                recycle = new Recycle(glTextureFrameBuffer);
                add(recycle);
                glTextureFrameBuffer.setSize(i, i2);
                this.mRecycles.put(Integer.valueOf(glTextureFrameBuffer.getTextureId()), recycle);
            } else {
                if (this.mSyncMode) {
                    try {
                        if (this.recordCnt) {
                            this.blockCnt.incrementAndGet();
                        }
                        Thread.sleep(5L);
                    } catch (Exception unused) {
                    }
                    return getBuffer(i, i2);
                }
                return recycle;
            }
        }
        recycle.addRef();
        return recycle;
    }

    public FilterVideoBufferPool(int i, boolean z, boolean z2) {
        this.blockCnt = new AtomicInteger(0);
        this.recordCnt = false;
        this.mPools = new ArrayList();
        this.mMaxSize = i;
        this.mSyncMode = z;
        this.mRecycles = new ConcurrentHashMap();
        this.recordCnt = z2;
    }
}
