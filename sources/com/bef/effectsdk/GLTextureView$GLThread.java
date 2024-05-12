package com.bef.effectsdk;

import X.C16880lQ;
import X.TextureViewSurfaceTextureListenerC05030Hr;
import X.X1D;
import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadThread;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class GLTextureView$GLThread extends PthreadThread {
    public GLTextureView$EglHelper mEglHelper;
    public ArrayList<Runnable> mEventQueue;
    public boolean mExited;
    public boolean mFinishedCreatingEglSurface;
    public WeakReference<TextureViewSurfaceTextureListenerC05030Hr> mGLTextureViewWeakRef;
    public boolean mHasSurface;
    public boolean mHaveEglContext;
    public boolean mHaveEglSurface;
    public int mHeight;
    public boolean mPaused;
    public boolean mRenderComplete;
    public int mRenderMode;
    public boolean mRequestPaused;
    public boolean mRequestRender;
    public boolean mShouldExit;
    public boolean mShouldReleaseEglContext;
    public boolean mSizeChanged;
    public boolean mSurfaceIsBad;
    public boolean mWaitingForSurface;
    public int mWidth;

    public void requestReleaseEglContextLocked() {
        this.mShouldReleaseEglContext = true;
        TextureViewSurfaceTextureListenerC05030Hr.sGLThreadManager.notifyAll();
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        com_bef_effectsdk_GLTextureView$GLThread_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:182:0x0202 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void guardedRun() {
        /*
            Method dump skipped, instructions count: 525
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bef.effectsdk.GLTextureView$GLThread.guardedRun():void");
    }

    private boolean readyToDraw() {
        if (!this.mPaused && this.mHasSurface && !this.mSurfaceIsBad && this.mWidth > 0 && this.mHeight > 0 && (this.mRequestRender || this.mRenderMode == 1)) {
            return true;
        }
        return false;
    }

    private void stopEglContextLocked() {
        if (this.mHaveEglContext) {
            this.mEglHelper.finish();
            this.mHaveEglContext = false;
            TextureViewSurfaceTextureListenerC05030Hr.sGLThreadManager.releaseEglContextLocked(this);
        }
    }

    private void stopEglSurfaceLocked() {
        if (this.mHaveEglSurface) {
            this.mHaveEglSurface = false;
            this.mEglHelper.destroySurface();
        }
    }

    public boolean ableToDraw() {
        if (this.mHaveEglContext && this.mHaveEglSurface && readyToDraw()) {
            return true;
        }
        return false;
    }

    public int getRenderMode() {
        int i;
        synchronized (TextureViewSurfaceTextureListenerC05030Hr.sGLThreadManager) {
            i = this.mRenderMode;
        }
        return i;
    }

    public void onPause() {
        GLTextureView$GLThreadManager gLTextureView$GLThreadManager = TextureViewSurfaceTextureListenerC05030Hr.sGLThreadManager;
        synchronized (gLTextureView$GLThreadManager) {
            this.mRequestPaused = true;
            gLTextureView$GLThreadManager.notifyAll();
            while (!this.mExited && !this.mPaused) {
                try {
                    TextureViewSurfaceTextureListenerC05030Hr.sGLThreadManager.wait();
                } catch (InterruptedException unused) {
                    C16880lQ.LLLLIIIILLL().interrupt();
                }
            }
        }
    }

    public void onResume() {
        GLTextureView$GLThreadManager gLTextureView$GLThreadManager = TextureViewSurfaceTextureListenerC05030Hr.sGLThreadManager;
        synchronized (gLTextureView$GLThreadManager) {
            this.mRequestPaused = false;
            this.mRequestRender = true;
            this.mRenderComplete = false;
            gLTextureView$GLThreadManager.notifyAll();
            while (!this.mExited && this.mPaused && !this.mRenderComplete) {
                try {
                    TextureViewSurfaceTextureListenerC05030Hr.sGLThreadManager.wait();
                } catch (InterruptedException unused) {
                    C16880lQ.LLLLIIIILLL().interrupt();
                }
            }
        }
    }

    public void requestExitAndWait() {
        GLTextureView$GLThreadManager gLTextureView$GLThreadManager = TextureViewSurfaceTextureListenerC05030Hr.sGLThreadManager;
        synchronized (gLTextureView$GLThreadManager) {
            this.mShouldExit = true;
            gLTextureView$GLThreadManager.notifyAll();
            while (!this.mExited) {
                try {
                    TextureViewSurfaceTextureListenerC05030Hr.sGLThreadManager.wait();
                } catch (InterruptedException unused) {
                    C16880lQ.LLLLIIIILLL().interrupt();
                }
            }
        }
    }

    public void requestRender() {
        GLTextureView$GLThreadManager gLTextureView$GLThreadManager = TextureViewSurfaceTextureListenerC05030Hr.sGLThreadManager;
        synchronized (gLTextureView$GLThreadManager) {
            this.mRequestRender = true;
            gLTextureView$GLThreadManager.notifyAll();
        }
    }

    public void surfaceCreated() {
        GLTextureView$GLThreadManager gLTextureView$GLThreadManager = TextureViewSurfaceTextureListenerC05030Hr.sGLThreadManager;
        synchronized (gLTextureView$GLThreadManager) {
            this.mHasSurface = true;
            this.mFinishedCreatingEglSurface = false;
            gLTextureView$GLThreadManager.notifyAll();
            while (this.mWaitingForSurface && !this.mFinishedCreatingEglSurface && !this.mExited) {
                try {
                    TextureViewSurfaceTextureListenerC05030Hr.sGLThreadManager.wait();
                } catch (InterruptedException unused) {
                    C16880lQ.LLLLIIIILLL().interrupt();
                }
            }
        }
    }

    public void surfaceDestroyed() {
        GLTextureView$GLThreadManager gLTextureView$GLThreadManager = TextureViewSurfaceTextureListenerC05030Hr.sGLThreadManager;
        synchronized (gLTextureView$GLThreadManager) {
            this.mHasSurface = false;
            gLTextureView$GLThreadManager.notifyAll();
            while (!this.mWaitingForSurface && !this.mExited) {
                try {
                    TextureViewSurfaceTextureListenerC05030Hr.sGLThreadManager.wait();
                } catch (InterruptedException unused) {
                    C16880lQ.LLLLIIIILLL().interrupt();
                }
            }
        }
    }

    public void com_bef_effectsdk_GLTextureView$GLThread__run$___twin___() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("GLThread ");
        LIZ.append(getId());
        setName(X1D.LIZIZ(LIZ));
        try {
            guardedRun();
        } catch (InterruptedException | RuntimeException unused) {
        } catch (Throwable th) {
            TextureViewSurfaceTextureListenerC05030Hr.sGLThreadManager.threadExiting(this);
            throw th;
        }
        TextureViewSurfaceTextureListenerC05030Hr.sGLThreadManager.threadExiting(this);
    }

    public GLTextureView$GLThread(WeakReference<TextureViewSurfaceTextureListenerC05030Hr> weakReference) {
        super("GLTextureView$GLThread");
        this.mEventQueue = new ArrayList<>();
        this.mSizeChanged = true;
        this.mWidth = 0;
        this.mHeight = 0;
        this.mRequestRender = true;
        this.mRenderMode = 1;
        this.mGLTextureViewWeakRef = weakReference;
    }

    public static void com_bef_effectsdk_GLTextureView$GLThread_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(GLTextureView$GLThread gLTextureView$GLThread) {
        boolean LIZ;
        try {
            gLTextureView$GLThread.com_bef_effectsdk_GLTextureView$GLThread__run$___twin___();
        } finally {
            if (LIZ) {
            }
        }
    }

    public void queueEvent(Runnable runnable) {
        if (runnable != null) {
            GLTextureView$GLThreadManager gLTextureView$GLThreadManager = TextureViewSurfaceTextureListenerC05030Hr.sGLThreadManager;
            synchronized (gLTextureView$GLThreadManager) {
                this.mEventQueue.add(runnable);
                gLTextureView$GLThreadManager.notifyAll();
            }
            return;
        }
        throw new IllegalArgumentException("r must not be null");
    }

    public void setRenderMode(int i) {
        if (i >= 0 && i <= 1) {
            GLTextureView$GLThreadManager gLTextureView$GLThreadManager = TextureViewSurfaceTextureListenerC05030Hr.sGLThreadManager;
            synchronized (gLTextureView$GLThreadManager) {
                this.mRenderMode = i;
                gLTextureView$GLThreadManager.notifyAll();
            }
            return;
        }
        throw new IllegalArgumentException("renderMode");
    }

    public void onWindowResize(int i, int i2) {
        GLTextureView$GLThreadManager gLTextureView$GLThreadManager = TextureViewSurfaceTextureListenerC05030Hr.sGLThreadManager;
        synchronized (gLTextureView$GLThreadManager) {
            this.mWidth = i;
            this.mHeight = i2;
            this.mSizeChanged = true;
            this.mRequestRender = true;
            this.mRenderComplete = false;
            gLTextureView$GLThreadManager.notifyAll();
            while (!this.mExited && !this.mPaused && !this.mRenderComplete && ableToDraw()) {
                try {
                    TextureViewSurfaceTextureListenerC05030Hr.sGLThreadManager.wait();
                } catch (InterruptedException unused) {
                    C16880lQ.LLLLIIIILLL().interrupt();
                }
            }
        }
    }
}
