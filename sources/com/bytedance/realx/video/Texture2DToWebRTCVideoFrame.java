package com.bytedance.realx.video;

import X.ZVP;
import android.graphics.Matrix;
import android.os.Handler;
import android.os.HandlerThread;
import com.bytedance.realx.base.ThreadUtils;
import com.bytedance.realx.video.Texture2DToWebRTCVideoFrame;
import com.bytedance.realx.video.VideoFrame;

/* loaded from: classes33.dex */
public class Texture2DToWebRTCVideoFrame {
    public Handler mHandler;
    public Matrix mMat;
    public boolean needPendingRelease;
    public YuvConverter yuvConverter = new YuvConverter();
    public boolean isReleased = false;
    public boolean isFrameInUse = false;

    public void releaseFrame() {
        this.isFrameInUse = false;
        if (this.needPendingRelease && !this.isReleased) {
            this.isReleased = true;
            ThreadUtils.invokeAtFrontUninterruptibly(this.mHandler, new ZVP(0, this));
        }
    }

    public /* synthetic */ void lambda$release$1() {
        this.yuvConverter.release();
        this.mHandler.getLooper().quit();
    }

    public /* synthetic */ void lambda$releaseFrame$0() {
        this.yuvConverter.release();
        this.mHandler.getLooper().quit();
    }

    public void release() {
        if (this.isFrameInUse) {
            this.needPendingRelease = true;
        } else {
            this.isReleased = true;
            ThreadUtils.invokeAtFrontUninterruptibly(this.mHandler, new Runnable() { // from class: X.ZVK
                @Override // java.lang.Runnable
                public final void run() {
                    Texture2DToWebRTCVideoFrame.this.lambda$release$1();
                }
            });
        }
    }

    public Texture2DToWebRTCVideoFrame() {
        this.mHandler = null;
        this.needPendingRelease = false;
        HandlerThread handlerThread = new HandlerThread("Texture2DToVideoFrame");
        handlerThread.start();
        this.mHandler = new Handler(handlerThread.getLooper());
        this.needPendingRelease = false;
        Matrix matrix = new Matrix();
        this.mMat = matrix;
        matrix.setValues(new float[]{1.0f, 0.0f, 0.0f, 0.0f, -1.0f, 1.0f, 0.0f, 0.0f, 1.0f});
    }

    public boolean isFameInUse() {
        return this.isFrameInUse;
    }

    public VideoFrame convertTexture2DToWebRTCVideoFrame(int i, int i2, int i3) {
        if (this.needPendingRelease || this.isReleased) {
            return null;
        }
        this.isFrameInUse = true;
        return new VideoFrame(new TextureBufferImpl(i2, i3, VideoFrame.TextureBuffer.Type.RGB, i, this.mMat, this.mHandler, this.yuvConverter, new Runnable() { // from class: X.ZVM
            @Override // java.lang.Runnable
            public final void run() {
                Texture2DToWebRTCVideoFrame.this.releaseFrame();
            }
        }), 0, 0L);
    }
}
