package com.ss.ttlivestreamer.livestreamv2.filter;

import X.X1D;
import com.ss.ttlivestreamer.core.utils.AVLog;
import com.ss.ttlivestreamer.core.utils.DebugLogUtils;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes12.dex */
public class KaraokeRegulator {
    public long mCaptureDelayMs;
    public List<Frame> mFrames = new ArrayList();
    public long mPlayerDelayMs;

    /* loaded from: classes12.dex */
    public class Frame {
        public ByteBuffer buffer;
        public long elapseMs;
        public long timeMs;

        public ByteBuffer extract() {
            this.buffer.position(0);
            ByteBuffer byteBuffer = this.buffer;
            this.buffer = null;
            return byteBuffer;
        }

        public boolean elapseProfileDone() {
            long currentTimeMillis = System.currentTimeMillis() - this.timeMs;
            KaraokeRegulator karaokeRegulator = KaraokeRegulator.this;
            if (currentTimeMillis >= (karaokeRegulator.mPlayerDelayMs + karaokeRegulator.mCaptureDelayMs) - 10) {
                return true;
            }
            return false;
        }

        public Frame(ByteBuffer byteBuffer) {
            this.buffer = ByteBuffer.allocateDirect(byteBuffer.capacity());
            byteBuffer.position(0);
            this.buffer.put(byteBuffer);
            this.timeMs = System.currentTimeMillis();
            this.elapseMs = KaraokeRegulator.this.mPlayerDelayMs + KaraokeRegulator.this.mCaptureDelayMs;
        }
    }

    public ByteBuffer popBackgroundMusicFrame() {
        synchronized (this.mFrames) {
            if (this.mFrames.size() > 0 && this.mFrames.get(0).elapseProfileDone()) {
                return this.mFrames.remove(0).extract();
            }
            return null;
        }
    }

    public int size() {
        int size;
        synchronized (this.mFrames) {
            size = this.mFrames.size();
        }
        return size;
    }

    public KaraokeRegulator() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Create regulator ");
        LIZ.append(this);
        AVLog.ioi("KaraokeRegulator", X1D.LIZIZ(LIZ));
    }

    public void pushBackgroundMusicFrame(ByteBuffer byteBuffer) {
        synchronized (this.mFrames) {
            if (this.mFrames.size() > 100) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("Regulator exception with drop ");
                LIZ.append(this.mFrames.size());
                LIZ.append(" frames and capture delay ");
                LIZ.append(this.mCaptureDelayMs);
                LIZ.append(" ms player delay ");
                LIZ.append(this.mPlayerDelayMs);
                AVLog.ioe("KaraokeRegulator", X1D.LIZIZ(LIZ));
                this.mFrames.clear();
            }
            if (byteBuffer == null) {
                return;
            }
            this.mFrames.add(new Frame(byteBuffer));
        }
    }

    public void updateCaptureDelayMs(long j) {
        this.mCaptureDelayMs = j;
        if (DebugLogUtils.isEnableDebugLog()) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Update capture delay ");
            LIZ.append(j);
            LIZ.append("(ms)");
            AVLog.ioi("KaraokeRegulator", X1D.LIZIZ(LIZ));
        }
    }

    public void updatePlayerDelayMs(long j) {
        this.mPlayerDelayMs = j;
        if (DebugLogUtils.isEnableDebugLog()) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Update player delay ");
            LIZ.append(j);
            LIZ.append("(ms)");
            AVLog.ioi("KaraokeRegulator", X1D.LIZIZ(LIZ));
        }
    }
}
