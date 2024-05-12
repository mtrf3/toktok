package com.ss.ttlivestreamer.livestreamv2.capture;

import X.P6E;
import android.opengl.GLES20;
import android.os.Handler;
import com.ss.ttlivestreamer.core.buffer.GlTextureFrameBuffer;
import com.ss.ttlivestreamer.core.opengl.GlRenderDrawer;
import com.ss.ttlivestreamer.livestreamv2.utils.VideoDumpProxy;
import java.nio.ByteBuffer;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public class VideoFrameDumper {
    public static final /* synthetic */ boolean $assertionsDisabled = false;
    public final int mFps;
    public final Handler mHandler;
    public ByteBuffer mI420Buffer;
    public ByteBuffer mI420RotatedBuffer;
    public ByteBuffer mNV21Buffer;
    public GlTextureFrameBuffer mOesTo2DBuffer;
    public GlRenderDrawer mOesTo2DDrawer;
    public final IOnFrameCallback mOnFrameCallback;
    public final VideoDumpProxy.RawVideoDumperProxy[] mRawVideoDumpers = new VideoDumpProxy.RawVideoDumperProxy[2];
    public final Object mYuvBufferFence = new Object();
    public int[] mYuvTex = {0, 0, 0};

    /* loaded from: classes12.dex */
    public interface IOnFrameCallback {
        void onFrameCallback(ByteBuffer byteBuffer, int i, int i2, int i3, long j, long j2);
    }

    private void releaseRawVideoDumpers() {
    }

    public void checkOesTo2D(int i, int i2, int i3, int i4) {
    }

    public void checkYuvFrames(ByteBuffer byteBuffer, int i, int i2, int i3) {
    }

    public void onYuvFrame(P6E p6e, long j, boolean z, boolean z2, boolean z3) {
    }

    public void setDumpFrameParams(JSONObject jSONObject) {
    }

    public void release() {
        releaseRawVideoDumpers();
        GlTextureFrameBuffer glTextureFrameBuffer = this.mOesTo2DBuffer;
        if (glTextureFrameBuffer != null) {
            glTextureFrameBuffer.release();
            this.mOesTo2DBuffer = null;
        }
        GlRenderDrawer glRenderDrawer = this.mOesTo2DDrawer;
        if (glRenderDrawer != null) {
            glRenderDrawer.release();
            this.mOesTo2DDrawer = null;
        }
        int[] iArr = this.mYuvTex;
        if (iArr[0] > 0) {
            GLES20.glDeleteTextures(iArr.length, iArr, 0);
            this.mYuvTex = new int[]{0, 0, 0};
        }
    }

    public VideoFrameDumper(IOnFrameCallback iOnFrameCallback, Handler handler, int i) {
        this.mHandler = handler;
        this.mFps = i;
        this.mOnFrameCallback = iOnFrameCallback;
    }

    private /* synthetic */ void lambda$onYuvFrame$0(int i, int i2, long j) {
        synchronized (this.mYuvBufferFence) {
            this.mOnFrameCallback.onFrameCallback(this.mI420RotatedBuffer, i, i2, 0, 1000 * System.currentTimeMillis(), j);
        }
    }
}
