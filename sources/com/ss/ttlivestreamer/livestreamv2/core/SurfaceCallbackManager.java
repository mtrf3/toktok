package com.ss.ttlivestreamer.livestreamv2.core;

import com.ss.ttlivestreamer.core.buffer.SurfaceWithExtData;
import com.ss.ttlivestreamer.core.opengl.GLSurface;
import com.ss.ttlivestreamer.core.opengl.GLThread;
import com.ss.ttlivestreamer.core.opengl.GlRenderDrawer;
import com.ss.ttlivestreamer.core.utils.AVLog2;
import com.ss.ttlivestreamer.core.utils.SafeHandlerThreadPoolExecutor;
import com.ss.ttlivestreamer.core.utils.ThreadUtils;
import com.ss.ttlivestreamer.livestreamv2.core.SurfaceCallbackManager;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes12.dex */
public class SurfaceCallbackManager {
    public final GLThread mGLThread;
    public final String TAG = "SurfaceCallbackManager";
    public final GlRenderDrawer mDrawer = new GlRenderDrawer();
    public final Map<SurfaceWithExtData, GLSurfaceListener> mListenerList = new ConcurrentHashMap();

    public synchronized void release() {
        synchronized (this.mListenerList) {
            Iterator<GLSurfaceListener> it = this.mListenerList.values().iterator();
            while (it.hasNext()) {
                it.next().release();
            }
            this.mListenerList.clear();
        }
        this.mDrawer.release();
        SafeHandlerThreadPoolExecutor.unlockThread(this.mGLThread);
    }

    public SurfaceCallbackManager() {
        GLThread lockGLThread = SafeHandlerThreadPoolExecutor.lockGLThread("SurfaceCallbackManager");
        this.mGLThread = lockGLThread;
        lockGLThread.start();
    }

    public void addSurface(SurfaceWithExtData surfaceWithExtData) {
        removeSurface(surfaceWithExtData);
        synchronized (this.mListenerList) {
            this.mListenerList.put(surfaceWithExtData, new GLSurfaceListener(surfaceWithExtData));
        }
    }

    public void removeSurface(SurfaceWithExtData surfaceWithExtData) {
        synchronized (this.mListenerList) {
            if (this.mListenerList.containsKey(surfaceWithExtData)) {
                GLSurfaceListener gLSurfaceListener = this.mListenerList.get(surfaceWithExtData);
                if (gLSurfaceListener != null) {
                    gLSurfaceListener.release();
                }
                this.mListenerList.remove(surfaceWithExtData);
            }
        }
    }

    /* loaded from: classes12.dex */
    public class GLSurfaceListener {
        public final GLSurface mGLSurface = new GLSurface();
        public boolean mInit;
        public final SurfaceWithExtData mSurface;

        public void release() {
            this.mInit = false;
            this.mGLSurface.nativeSurfaceDestroy();
            this.mGLSurface.release();
        }

        public GLSurfaceListener(SurfaceWithExtData surfaceWithExtData) {
            this.mSurface = surfaceWithExtData;
        }

        public void callbackFrame(int i, boolean z, float[] fArr, int i2, int i3, long j, ByteBuffer... byteBufferArr) {
            if (!this.mInit) {
                this.mGLSurface.nativeSurfaceCreate(0, 0, this.mSurface);
                this.mInit = true;
            }
            this.mGLSurface.nativeMakeCurrent();
            int nativeQuerySurfaceHeight = this.mGLSurface.nativeQuerySurfaceHeight();
            int nativeQuerySurfaceWidth = this.mGLSurface.nativeQuerySurfaceWidth();
            if (z) {
                SurfaceCallbackManager.this.mDrawer.drawOes(i, null, fArr, 0, 0, nativeQuerySurfaceWidth, nativeQuerySurfaceHeight);
            } else {
                SurfaceCallbackManager.this.mDrawer.drawRgb(i, null, fArr, 0, 0, nativeQuerySurfaceWidth, nativeQuerySurfaceHeight);
            }
            this.mSurface.setWidth(i2);
            this.mSurface.setHeight(i3);
            this.mSurface.setExtData(byteBufferArr);
            this.mGLSurface.nativeSwapBuffers();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$callbackFrame$0(int i, boolean z, float[] fArr, int i2, int i3, long j, ByteBuffer[] byteBufferArr) {
        Iterator<GLSurfaceListener> it = this.mListenerList.values().iterator();
        while (it.hasNext()) {
            it.next().callbackFrame(i, z, fArr, i2, i3, j, byteBufferArr);
        }
    }

    public void callbackFrame(final int i, final boolean z, final float[] fArr, final int i2, final int i3, final long j, Object... objArr) {
        final ByteBuffer[] byteBufferArr;
        synchronized (this.mListenerList) {
            if (this.mListenerList.size() > 0) {
                AVLog2.logToIODevice2(4, "SurfaceCallbackManager", "callback videoframe redundancy", null, 60, 30000);
                if (objArr.length > 0) {
                    byteBufferArr = new ByteBuffer[objArr.length];
                } else {
                    byteBufferArr = null;
                }
                if (byteBufferArr != null) {
                    for (int i4 = 0; i4 < byteBufferArr.length; i4++) {
                        Object obj = objArr[i4];
                        if (obj instanceof ByteBuffer) {
                            byteBufferArr[i4] = (ByteBuffer) obj;
                        }
                    }
                }
                ThreadUtils.invokeAtFrontUninterruptibly(this.mGLThread.getHandler(), new Runnable() { // from class: X.P2x
                    @Override // java.lang.Runnable
                    public final void run() {
                        SurfaceCallbackManager.this.lambda$callbackFrame$0(i, z, fArr, i2, i3, j, byteBufferArr);
                    }
                });
            }
        }
    }
}
