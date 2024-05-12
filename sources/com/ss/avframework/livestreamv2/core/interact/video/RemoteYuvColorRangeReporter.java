package com.ss.avframework.livestreamv2.core.interact.video;

import X.X1D;
import com.ss.ttlivestreamer.core.opengl.VideoColorRange;
import com.ss.ttlivestreamer.core.utils.AVLog;
import java.nio.ByteBuffer;

/* loaded from: classes12.dex */
public class RemoteYuvColorRangeReporter {
    public int mCheckedFrameCount;
    public long mCostTimeSum;
    public long mLastFrameTimestamp;
    public int mRemoteVideoColorRange = -1;
    public int mColorRange = -1;

    private String colorRangeToString(int i) {
        return i != 0 ? i != 1 ? "Unknown" : "VideoRange" : "FullRange";
    }

    public long getAverageCheckCost() {
        int i = this.mCheckedFrameCount;
        if (i > 0) {
            return this.mCostTimeSum / i;
        }
        return 0L;
    }

    public String getRemoteYuvFrameColorRange() {
        return colorRangeToString(this.mRemoteVideoColorRange);
    }

    public String getYuv2RgbFrameColorRange() {
        return colorRangeToString(VideoColorRange.checkYuv2RgbFormulaColorRange(this.mColorRange));
    }

    public int getColorRange() {
        return this.mColorRange;
    }

    public void setColorRange(int i) {
        this.mColorRange = i;
    }

    public synchronized void onRemoteYuvFrame(ByteBuffer byteBuffer, int i, int i2) {
        int i3 = this.mRemoteVideoColorRange;
        if (i3 == 0 || this.mCheckedFrameCount >= 10) {
            if (this.mColorRange != i3) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("remote yuv color range ");
                LIZ.append(this.mColorRange);
                LIZ.append(" maybe error, change to ");
                LIZ.append(this.mRemoteVideoColorRange);
                AVLog.logKibana(5, "RemoteYuvColorRangeReporter", X1D.LIZIZ(LIZ), null);
                this.mColorRange = this.mRemoteVideoColorRange;
            }
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - this.mLastFrameTimestamp < 10000) {
            return;
        }
        this.mLastFrameTimestamp = currentTimeMillis;
        int checkYuvFrameColorRange = VideoColorRange.checkYuvFrameColorRange(byteBuffer, i, i2);
        if (checkYuvFrameColorRange == 0 || checkYuvFrameColorRange == 1) {
            this.mRemoteVideoColorRange = checkYuvFrameColorRange;
        }
        this.mCheckedFrameCount++;
        this.mCostTimeSum = (System.currentTimeMillis() - currentTimeMillis) + this.mCostTimeSum;
    }
}
