package com.bytedance.realx.video;

import X.RunnableC90026ZUw;
import X.X1D;
import android.view.SurfaceHolder;
import com.bytedance.realx.base.RXLogging;
import com.bytedance.realx.base.ThreadUtils;
import com.bytedance.realx.video.EglBase;
import com.bytedance.realx.video.RendererCommon;
import java.util.concurrent.CountDownLatch;

/* loaded from: classes33.dex */
public class SurfaceEglRenderer extends EglRenderer implements SurfaceHolder.Callback {
    public int frameRotation;
    public boolean isFirstFrameRendered;
    public boolean isRenderingPaused;
    public final Object layoutLock;
    public RendererCommon.RendererEvents rendererEvents;
    public int rotatedFrameHeight;
    public int rotatedFrameWidth;

    @Override // com.bytedance.realx.video.EglRenderer
    public void disableFpsReduction() {
        synchronized (this.layoutLock) {
            this.isRenderingPaused = false;
        }
        super.disableFpsReduction();
    }

    @Override // com.bytedance.realx.video.EglRenderer
    public void pauseVideo() {
        synchronized (this.layoutLock) {
            this.isRenderingPaused = true;
        }
        super.pauseVideo();
    }

    @Override // com.bytedance.realx.video.EglRenderer
    public void release() {
        super.release();
        CountDownLatch countDownLatch = new CountDownLatch(1);
        releaseEglSurface(new RunnableC90026ZUw(countDownLatch));
        ThreadUtils.awaitUninterruptibly(countDownLatch);
    }

    public SurfaceEglRenderer(String str) {
        super(str);
        this.layoutLock = new Object();
    }

    private void logD(String str) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(this.name);
        LIZ.append(": ");
        LIZ.append(str);
        RXLogging.i("SurfaceEglRenderer", X1D.LIZIZ(LIZ));
    }

    private void updateFrameDimensionsAndReportEvents(VideoFrame videoFrame) {
        synchronized (this.layoutLock) {
            if (this.isRenderingPaused) {
                return;
            }
            if (!this.isFirstFrameRendered) {
                this.isFirstFrameRendered = true;
                logD("Reporting first rendered frame.");
                RendererCommon.RendererEvents rendererEvents = this.rendererEvents;
                if (rendererEvents != null) {
                    rendererEvents.onFirstFrameRendered();
                }
            }
            if (this.rotatedFrameWidth != videoFrame.getRotatedWidth() || this.rotatedFrameHeight != videoFrame.getRotatedHeight() || this.frameRotation != videoFrame.getRotation()) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("Reporting frame resolution changed to ");
                LIZ.append(videoFrame.getBuffer().getWidth());
                LIZ.append("x");
                LIZ.append(videoFrame.getBuffer().getHeight());
                LIZ.append(" with rotation ");
                LIZ.append(videoFrame.getRotation());
                logD(X1D.LIZIZ(LIZ));
                RendererCommon.RendererEvents rendererEvents2 = this.rendererEvents;
                if (rendererEvents2 != null) {
                    rendererEvents2.onFrameResolutionChanged(videoFrame.getBuffer().getWidth(), videoFrame.getBuffer().getHeight(), videoFrame.getRotation());
                }
                this.rotatedFrameWidth = videoFrame.getRotatedWidth();
                this.rotatedFrameHeight = videoFrame.getRotatedHeight();
                this.frameRotation = videoFrame.getRotation();
            }
        }
    }

    @Override // com.bytedance.realx.video.EglRenderer, com.bytedance.realx.video.VideoSink
    public void onFrame(VideoFrame videoFrame) {
        updateFrameDimensionsAndReportEvents(videoFrame);
        super.onFrame(videoFrame);
    }

    @Override // com.bytedance.realx.video.EglRenderer
    public void setFpsReduction(float f) {
        boolean z;
        synchronized (this.layoutLock) {
            if (f == 0.0f) {
                z = true;
            } else {
                z = false;
            }
            this.isRenderingPaused = z;
        }
        super.setFpsReduction(f);
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        ThreadUtils.checkIsOnMainThread();
        createEglSurface(surfaceHolder.getSurface());
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        ThreadUtils.checkIsOnMainThread();
        CountDownLatch countDownLatch = new CountDownLatch(1);
        releaseEglSurface(new RunnableC90026ZUw(countDownLatch));
        ThreadUtils.awaitUninterruptibly(countDownLatch);
    }

    @Override // com.bytedance.realx.video.EglRenderer
    public void init(EglBase.Context context, int[] iArr, RendererCommon.GlDrawer glDrawer) {
        init(context, (RendererCommon.RendererEvents) null, iArr, glDrawer);
    }

    public void init(EglBase.Context context, RendererCommon.RendererEvents rendererEvents, int[] iArr, RendererCommon.GlDrawer glDrawer) {
        ThreadUtils.checkIsOnMainThread();
        synchronized (this.layoutLock) {
            this.rendererEvents = rendererEvents;
            this.isFirstFrameRendered = false;
            this.rotatedFrameWidth = 0;
            this.rotatedFrameHeight = 0;
            this.frameRotation = 0;
        }
        super.init(context, iArr, glDrawer);
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        ThreadUtils.checkIsOnMainThread();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("surfaceChanged: format: ");
        LIZ.append(i);
        LIZ.append(" size: ");
        LIZ.append(i2);
        LIZ.append("x");
        LIZ.append(i3);
        logD(X1D.LIZIZ(LIZ));
    }
}
