package com.ss.bytertc.engine.mediaio;

import X.C16880lQ;
import android.os.Handler;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import com.bytedance.realx.base.ThreadUtils;
import com.bytedance.realx.video.EglBase;
import com.bytedance.realx.video.RendererCommon;
import com.bytedance.realx.video.SurfaceEglRenderer;
import com.bytedance.realx.video.VideoFrame;
import com.ss.bytertc.engine.mediaio.SurfaceEglRender;
import com.ss.bytertc.engine.ui.VideoFrameRender;
import com.ss.bytertc.engine.utils.LogUtil;
import java.lang.ref.SoftReference;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes33.dex */
public class SurfaceEglRender extends SurfaceEglRenderer {
    public SurfaceHolder.Callback mCallback;
    public final AtomicBoolean mHasBindAtomic;
    public final AtomicBoolean mHasInitAtomic;
    public final Object mSurfaceCallbackLock;
    public VideoFrameRender.SurfaceLifecycleCallback mSurfaceLifecycleCallback;
    public final Object mSurfaceLifecycleCallbackLock;
    public SoftReference<SurfaceView> surfaceViewSoftReference;

    @Override // com.bytedance.realx.video.SurfaceEglRenderer, com.bytedance.realx.video.EglRenderer
    public void release() {
        SurfaceView surfaceView;
        if (this.mHasInitAtomic.compareAndSet(true, false)) {
            LogUtil.d("SurfaceEglRender", "release");
            super.release();
            this.mHasBindAtomic.compareAndSet(true, false);
            SoftReference<SurfaceView> softReference = this.surfaceViewSoftReference;
            if (softReference != null && (surfaceView = softReference.get()) != null) {
                surfaceView.getHolder().removeCallback(this);
                return;
            }
            return;
        }
        throw new IllegalStateException("TextureEglRenderer has not init or already released!!!!!");
    }

    public SurfaceEglRender(String str) {
        super(str);
        this.mHasInitAtomic = new AtomicBoolean(false);
        this.mHasBindAtomic = new AtomicBoolean(false);
        this.mSurfaceLifecycleCallbackLock = new Object();
        this.mSurfaceCallbackLock = new Object();
        this.surfaceViewSoftReference = new SoftReference<>(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$bind$0(SurfaceView surfaceView) {
        SurfaceHolder holder = surfaceView.getHolder();
        synchronized (this.mSurfaceCallbackLock) {
            SurfaceHolder.Callback callback = this.mCallback;
            if (callback != null) {
                holder.addCallback(callback);
            }
        }
        this.surfaceViewSoftReference = new SoftReference<>(surfaceView);
        if (holder.getSurface() != null && holder.getSurface().isValid()) {
            setLayoutAspectRatio(surfaceView.getMeasuredWidth() / surfaceView.getMeasuredHeight());
            surfaceCreated(holder);
        }
        holder.addCallback(this);
    }

    private void runOnUIThread(Runnable runnable) {
        if (C16880lQ.LLJJJJ().getThread() == C16880lQ.LLLLIIIILLL()) {
            runnable.run();
        } else {
            new Handler(C16880lQ.LLJJJJ()).post(runnable);
        }
    }

    public void bind(final SurfaceView surfaceView) {
        if (this.mHasInitAtomic.get()) {
            if (this.mHasBindAtomic.compareAndSet(false, true)) {
                LogUtil.d("SurfaceEglRender", "bind");
                runOnUIThread(new Runnable() { // from class: X.ZWD
                    @Override // java.lang.Runnable
                    public final void run() {
                        SurfaceEglRender.this.lambda$bind$0(surfaceView);
                    }
                });
                return;
            }
            throw new IllegalStateException("Called bind functions multiple times!!!!!!");
        }
        throw new IllegalStateException("TextureEglRenderer has not init!!!!!!");
    }

    @Override // com.bytedance.realx.video.SurfaceEglRenderer, com.bytedance.realx.video.EglRenderer, com.bytedance.realx.video.VideoSink
    public void onFrame(VideoFrame videoFrame) {
        if (!this.mHasInitAtomic.get() || !this.mHasBindAtomic.get()) {
            return;
        }
        super.onFrame(videoFrame);
    }

    public void setSurfaceHolderCallback(SurfaceHolder.Callback callback) {
        synchronized (this.mSurfaceCallbackLock) {
            this.mCallback = callback;
        }
    }

    public void setSurfaceLifecycleLisenter(VideoFrameRender.SurfaceLifecycleCallback surfaceLifecycleCallback) {
        synchronized (this.mSurfaceLifecycleCallbackLock) {
            this.mSurfaceLifecycleCallback = surfaceLifecycleCallback;
        }
    }

    @Override // com.bytedance.realx.video.SurfaceEglRenderer, android.view.SurfaceHolder.Callback
    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        super.surfaceCreated(surfaceHolder);
        LogUtil.d("SurfaceEglRender", "surfaceCreated");
        synchronized (this.mSurfaceLifecycleCallbackLock) {
            VideoFrameRender.SurfaceLifecycleCallback surfaceLifecycleCallback = this.mSurfaceLifecycleCallback;
            if (surfaceLifecycleCallback != null) {
                surfaceLifecycleCallback.onCreated();
            }
        }
    }

    @Override // com.bytedance.realx.video.SurfaceEglRenderer, android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        super.surfaceDestroyed(surfaceHolder);
        LogUtil.d("SurfaceEglRender", "surfaceDestroyed");
        synchronized (this.mSurfaceLifecycleCallbackLock) {
            VideoFrameRender.SurfaceLifecycleCallback surfaceLifecycleCallback = this.mSurfaceLifecycleCallback;
            if (surfaceLifecycleCallback != null) {
                surfaceLifecycleCallback.onDestroy();
            }
        }
    }

    @Override // com.bytedance.realx.video.SurfaceEglRenderer, com.bytedance.realx.video.EglRenderer
    public void init(EglBase.Context context, int[] iArr, RendererCommon.GlDrawer glDrawer) {
        ThreadUtils.checkIsOnMainThread();
        if (this.mHasInitAtomic.compareAndSet(false, true)) {
            LogUtil.d("SurfaceEglRender", "init");
            super.init(context, iArr, glDrawer);
            return;
        }
        throw new IllegalStateException("SurfaceEglRender has already init!!!!!!");
    }

    @Override // com.bytedance.realx.video.SurfaceEglRenderer, android.view.SurfaceHolder.Callback
    public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        super.surfaceChanged(surfaceHolder, i, i2, i3);
        LogUtil.d("SurfaceEglRender", "surfaceChanged");
    }
}
