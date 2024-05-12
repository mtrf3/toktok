package com.ss.bytertc.engine.mediaio;

import X.C16880lQ;
import X.ZVO;
import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.view.TextureView;
import com.bytedance.realx.base.ThreadUtils;
import com.bytedance.realx.video.EglBase;
import com.bytedance.realx.video.EglRenderer;
import com.bytedance.realx.video.RendererCommon;
import com.bytedance.realx.video.VideoFrame;
import com.ss.bytertc.engine.mediaio.TextureEglRenderer;
import com.ss.bytertc.engine.ui.VideoFrameRender;
import com.ss.bytertc.engine.utils.LogUtil;
import java.lang.ref.WeakReference;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes33.dex */
public class TextureEglRenderer extends EglRenderer implements TextureView.SurfaceTextureListener {
    public final AtomicBoolean mHasBindAtomic;
    public final AtomicBoolean mHasInitAtomic;
    public VideoFrameRender.SurfaceLifecycleCallback mSurfaceLifecycleCallback;
    public TextureView.SurfaceTextureListener mSurfaceTextureListener;
    public final Object mSurfaceTextureListenerLock;
    public volatile WeakReference<TextureView> mTextureViewRef;
    public final Handler mainHandler;

    @Override // com.bytedance.realx.video.EglRenderer
    public void release() {
        TextureView textureView;
        if (this.mHasInitAtomic.compareAndSet(true, false)) {
            LogUtil.d("TextureEglRenderer", "release");
            super.release();
            this.mHasBindAtomic.compareAndSet(true, false);
            if (this.mTextureViewRef != null && (textureView = this.mTextureViewRef.get()) != null) {
                textureView.setSurfaceTextureListener(null);
                return;
            }
            return;
        }
        throw new IllegalStateException("TextureEglRenderer has not init or already released!!!!!");
    }

    public TextureEglRenderer(String str) {
        super(str);
        this.mSurfaceTextureListenerLock = new Object();
        this.mainHandler = new Handler(C16880lQ.LLJJJJ());
        this.mHasInitAtomic = new AtomicBoolean(false);
        this.mHasBindAtomic = new AtomicBoolean(false);
        this.mTextureViewRef = new WeakReference<>(null);
    }

    public /* synthetic */ void lambda$bind$0(TextureView textureView) {
        if (textureView.getSurfaceTexture() != null) {
            createEglSurface(textureView.getSurfaceTexture());
            VideoFrameRender.SurfaceLifecycleCallback surfaceLifecycleCallback = this.mSurfaceLifecycleCallback;
            if (surfaceLifecycleCallback != null) {
                surfaceLifecycleCallback.onCreated();
            }
        }
        textureView.setSurfaceTextureListener(this);
    }

    private void runOnUIThread(Runnable runnable) {
        if (C16880lQ.LLJJJJ().getThread() == C16880lQ.LLLLIIIILLL()) {
            runnable.run();
        } else {
            new Handler(C16880lQ.LLJJJJ()).post(runnable);
        }
    }

    @Override // com.bytedance.realx.video.EglRenderer, com.bytedance.realx.video.VideoSink
    public void onFrame(final VideoFrame videoFrame) {
        if (!this.mHasInitAtomic.get() || !this.mHasBindAtomic.get() || this.mTextureViewRef == null) {
            return;
        }
        TextureView textureView = this.mTextureViewRef.get();
        if (videoFrame == null || textureView == null || !textureView.isShown()) {
            return;
        }
        if ((videoFrame.getBuffer() instanceof CountDownLatchI420Buffer) && (textureView instanceof IVideoSink)) {
            final CountDownLatchI420Buffer countDownLatchI420Buffer = (CountDownLatchI420Buffer) videoFrame.getBuffer();
            countDownLatchI420Buffer.retain();
            if (postOnMainThreadAndLock(new Runnable() { // from class: X.ZWF
                @Override // java.lang.Runnable
                public final void run() {
                    TextureEglRenderer.this.lambda$onFrame$1(videoFrame, countDownLatchI420Buffer);
                }
            }, countDownLatchI420Buffer.getLatch())) {
                return;
            }
            countDownLatchI420Buffer.release();
            return;
        }
        super.onFrame(videoFrame);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        ThreadUtils.checkIsOnMainThread();
        LogUtil.d("TextureEglRenderer", "onSurfaceTextureDestroyed");
        CountDownLatch countDownLatch = new CountDownLatch(1);
        releaseEglSurface(new ZVO(1, countDownLatch));
        ThreadUtils.awaitUninterruptibly(countDownLatch);
        VideoFrameRender.SurfaceLifecycleCallback surfaceLifecycleCallback = this.mSurfaceLifecycleCallback;
        if (surfaceLifecycleCallback != null) {
            surfaceLifecycleCallback.onDestroy();
        }
        synchronized (this.mSurfaceTextureListenerLock) {
            TextureView.SurfaceTextureListener surfaceTextureListener = this.mSurfaceTextureListener;
            if (surfaceTextureListener != null) {
                surfaceTextureListener.onSurfaceTextureDestroyed(surfaceTexture);
            }
        }
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        synchronized (this.mSurfaceTextureListenerLock) {
            TextureView.SurfaceTextureListener surfaceTextureListener = this.mSurfaceTextureListener;
            if (surfaceTextureListener != null) {
                surfaceTextureListener.onSurfaceTextureUpdated(surfaceTexture);
            }
        }
    }

    public void setSurfaceTextureListener(TextureView.SurfaceTextureListener surfaceTextureListener) {
        synchronized (this.mSurfaceTextureListenerLock) {
            this.mSurfaceTextureListener = surfaceTextureListener;
        }
    }

    public /* synthetic */ void lambda$onFrame$1(VideoFrame videoFrame, CountDownLatchI420Buffer countDownLatchI420Buffer) {
        super.onFrame(videoFrame);
        countDownLatchI420Buffer.release();
    }

    public static /* synthetic */ void lambda$postOnMainThreadAndLock$2(Runnable runnable, CountDownLatch countDownLatch) {
        runnable.run();
        try {
            if (countDownLatch.getCount() != 0) {
                countDownLatch.await();
            }
        } catch (InterruptedException e) {
            C16880lQ.LLLLIIL(e);
        }
    }

    private boolean postOnMainThreadAndLock(final Runnable runnable, final CountDownLatch countDownLatch) {
        return this.mainHandler.post(new Runnable() { // from class: X.ZWE
            @Override // java.lang.Runnable
            public final void run() {
                TextureEglRenderer.lambda$postOnMainThreadAndLock$2(runnable, countDownLatch);
            }
        });
    }

    public void bind(final TextureView textureView, VideoFrameRender.SurfaceLifecycleCallback surfaceLifecycleCallback) {
        if (this.mHasInitAtomic.get()) {
            if (this.mHasBindAtomic.compareAndSet(false, true)) {
                LogUtil.d("TextureEglRenderer", "bind");
                this.mTextureViewRef = new WeakReference<>(textureView);
                this.mSurfaceLifecycleCallback = surfaceLifecycleCallback;
                runOnUIThread(new Runnable() { // from class: X.ZWG
                    @Override // java.lang.Runnable
                    public final void run() {
                        TextureEglRenderer.this.lambda$bind$0(textureView);
                    }
                });
                return;
            }
            throw new IllegalStateException("Called bind functions multiple times!!!!!!");
        }
        throw new IllegalStateException("TextureEglRenderer has not init!!!!!!");
    }

    @Override // com.bytedance.realx.video.EglRenderer
    public void init(EglBase.Context context, int[] iArr, RendererCommon.GlDrawer glDrawer) {
        if (this.mHasInitAtomic.compareAndSet(false, true)) {
            LogUtil.d("TextureEglRenderer", "init");
            super.init(context, iArr, glDrawer);
            return;
        }
        throw new IllegalStateException("TextureEglRenderer has already init!!!!!!");
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        ThreadUtils.checkIsOnMainThread();
        LogUtil.d("TextureEglRenderer", "onSurfaceTextureAvailable");
        createEglSurface(surfaceTexture);
        VideoFrameRender.SurfaceLifecycleCallback surfaceLifecycleCallback = this.mSurfaceLifecycleCallback;
        if (surfaceLifecycleCallback != null) {
            surfaceLifecycleCallback.onCreated();
        }
        synchronized (this.mSurfaceTextureListenerLock) {
            TextureView.SurfaceTextureListener surfaceTextureListener = this.mSurfaceTextureListener;
            if (surfaceTextureListener != null) {
                surfaceTextureListener.onSurfaceTextureAvailable(surfaceTexture, i, i2);
            }
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        LogUtil.d("TextureEglRenderer", "onSurfaceTextureSizeChanged");
        synchronized (this.mSurfaceTextureListenerLock) {
            TextureView.SurfaceTextureListener surfaceTextureListener = this.mSurfaceTextureListener;
            if (surfaceTextureListener != null) {
                surfaceTextureListener.onSurfaceTextureSizeChanged(surfaceTexture, i, i2);
            }
        }
    }
}
