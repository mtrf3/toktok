package com.ss.avframework.livestreamv2.core.interact;

import X.C16880lQ;
import X.X1D;
import X.YE1;
import android.opengl.GLES20;
import android.text.TextUtils;
import com.ss.avframework.livestreamv2.core.interact.statistic.Statistics;
import com.ss.avframework.livestreamv2.core.interact.video.VideoCallback;
import com.ss.avframework.livestreamv2.core.interact.video.VideoClient;
import com.ss.ttlivestreamer.core.utils.AVLog;
import com.ss.ttlivestreamer.core.utils.DebugLogUtils;
import com.ss.ttlivestreamer.livestreamv2.core.LiveCore;
import com.ss.ttlivestreamer.livestreamv2.utils.VideoDumpProxy;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public class InteractVideoClient implements VideoClient, LiveCore.ILiveCoreVideoFrameAvailableListener {
    public static int total_1282_number;
    public static int total_1285_number;
    public static int total_frame_number;
    public long mLastLogTime;
    public VideoDumpProxy.RawVideoDumperProxy mRawVideoDumper;
    public boolean mStart;
    public VideoCallback mVideoCallback;
    public int occur_1282_number;
    public int occur_1285_number;
    public int push_frame_number;
    public boolean reported1282;
    public boolean reportedGLError;
    public String TAG = "InteractVideoClient";
    public Statistics mStatics = new Statistics(1000);

    private void dump2DTextureFrame(int i, int i2, int i3, int i4, float[] fArr, String str) {
    }

    private void releaseRawVideoDumper() {
    }

    @Override // com.ss.avframework.livestreamv2.core.interact.video.VideoClient
    public void release() {
        this.mVideoCallback = null;
        releaseRawVideoDumper();
    }

    public void setDumpFrameParams(JSONObject jSONObject) {
    }

    @Override // com.ss.avframework.livestreamv2.core.interact.video.VideoClient
    public void stop() {
        this.mStart = false;
    }

    private void checkRtcEglError() {
        this.push_frame_number++;
        total_frame_number++;
        int glGetError = GLES20.glGetError();
        String str = "";
        int i = 0;
        boolean z = false;
        while (glGetError != 0) {
            str = YE1.LIZIZ(str, ", error code:", glGetError);
            if (glGetError == 1282) {
                this.occur_1282_number++;
                total_1282_number++;
                z = true;
            } else if (glGetError == 1285) {
                this.occur_1285_number++;
                total_1285_number++;
            }
            glGetError = GLES20.glGetError();
            i++;
            if (i >= 10) {
                break;
            }
        }
        if (!TextUtils.isEmpty(str)) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("rtc opengl error:");
            LIZ.append(str);
            AVLog.ioe("GLUtil", X1D.LIZIZ(LIZ));
            if (!this.reportedGLError) {
                this.reportedGLError = true;
                String str2 = this.TAG;
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("rtc opengl error:");
                LIZ2.append(str);
                AVLog.logKibana(6, str2, X1D.LIZIZ(LIZ2), null);
            } else if (z && !this.reported1282) {
                this.reported1282 = true;
                String str3 = this.TAG;
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append("rtc opengl error:");
                LIZ3.append(str);
                AVLog.logKibana(6, str3, X1D.LIZIZ(LIZ3), null);
            }
        }
        if (this.push_frame_number % 75 == 0) {
            if (this.occur_1282_number > 0 || this.occur_1285_number > 0) {
                AVLog.logKibana(6, this.TAG, C16880lQ.LLLZ("RTC OPENGL errors:[current 5s(1285_occurs:%d, 1282_occurs:%d) ,total(1285_occurs:%d, 1282_occurs:%d), total_frames_number:%d]", new Object[]{Integer.valueOf(this.occur_1285_number), Integer.valueOf(this.occur_1282_number), Integer.valueOf(total_1285_number), Integer.valueOf(total_1282_number), Integer.valueOf(total_frame_number)}), null);
                this.occur_1282_number = 0;
                this.occur_1285_number = 0;
            }
        }
    }

    @Override // com.ss.avframework.livestreamv2.core.interact.video.VideoClient
    public void start() {
        VideoCallback videoCallback = this.mVideoCallback;
        if (videoCallback != null) {
            videoCallback.onVideoWarning("");
        }
        this.mStart = true;
    }

    @Override // com.ss.avframework.livestreamv2.core.interact.video.VideoClient
    public Statistics getStatistics() {
        return this.mStatics;
    }

    @Override // com.ss.avframework.livestreamv2.core.interact.video.VideoClient
    public void prepare(VideoCallback videoCallback) {
        this.mVideoCallback = videoCallback;
        this.mStart = false;
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.core.LiveCore.ILiveCoreVideoFrameAvailableListener
    public void onI420FrameAvailable(ByteBuffer byteBuffer, int i, int i2, long j, Object... objArr) {
        long j2;
        Buffer buffer;
        Object valueOf;
        Statistics statistics = this.mStatics;
        if (statistics != null) {
            j2 = System.currentTimeMillis();
        } else {
            j2 = 0;
        }
        if (objArr.length >= 1) {
            buffer = (Buffer) objArr[0];
        } else {
            buffer = null;
        }
        if (DebugLogUtils.isEnableDebugLog()) {
            String str = this.TAG;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Send rtc extra data ");
            if (buffer == null) {
                valueOf = "null";
            } else {
                valueOf = Integer.valueOf(buffer.capacity());
            }
            LIZ.append(valueOf);
            AVLog.i(str, X1D.LIZIZ(LIZ));
        }
        VideoCallback videoCallback = this.mVideoCallback;
        if (videoCallback != null && this.mStart) {
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - this.mLastLogTime > 10000) {
                this.mLastLogTime = currentTimeMillis;
            }
            videoCallback.updateVideoFrame(byteBuffer, i, i2, j / 1000000, objArr);
        }
        if (statistics != null) {
            statistics.add(System.currentTimeMillis() - j2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:40:? A[RETURN, SYNTHETIC] */
    @Override // com.ss.ttlivestreamer.livestreamv2.ILiveStream.ITextureFrameAvailableListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onTextureFrameAvailable(javax.microedition.khronos.egl.EGLContext r30, int r31, boolean r32, int r33, int r34, long r35, float[] r37, java.lang.Object... r38) {
        /*
            Method dump skipped, instructions count: 256
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.avframework.livestreamv2.core.interact.InteractVideoClient.onTextureFrameAvailable(javax.microedition.khronos.egl.EGLContext, int, boolean, int, int, long, float[], java.lang.Object[]):void");
    }
}
