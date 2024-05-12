package com.byted.cast.sdk.gl.grafika;

import android.graphics.Bitmap;
import android.opengl.EGL14;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes29.dex */
public class EglSurfaceBase {
    public EglCore mEglCore;
    public EGLSurface mEGLSurface = EGL14.EGL_NO_SURFACE;
    public int mWidth = -1;
    public int mHeight = -1;

    public int getHeight() {
        int i = this.mHeight;
        if (i < 0) {
            return this.mEglCore.querySurface(this.mEGLSurface, 12374);
        }
        return i;
    }

    public int getWidth() {
        int i = this.mWidth;
        if (i < 0) {
            return this.mEglCore.querySurface(this.mEGLSurface, 12375);
        }
        return i;
    }

    public void makeCurrent() {
        this.mEglCore.makeCurrent(this.mEGLSurface);
    }

    public void releaseEglSurface() {
        this.mEglCore.releaseSurface(this.mEGLSurface);
        this.mEGLSurface = EGL14.EGL_NO_SURFACE;
        this.mHeight = -1;
        this.mWidth = -1;
    }

    public boolean swapBuffers() {
        return this.mEglCore.swapBuffers(this.mEGLSurface);
    }

    public EglSurfaceBase(EglCore eglCore) {
        this.mEglCore = eglCore;
    }

    public void createWindowSurface(Object obj) {
        if (this.mEGLSurface == EGL14.EGL_NO_SURFACE) {
            this.mEGLSurface = this.mEglCore.createWindowSurface(obj);
            return;
        }
        throw new IllegalStateException("surface already created");
    }

    public void makeCurrentReadFrom(EglSurfaceBase eglSurfaceBase) {
        this.mEglCore.makeCurrent(this.mEGLSurface, eglSurfaceBase.mEGLSurface);
    }

    public void saveFrame(File file) {
        if (this.mEglCore.isCurrent(this.mEGLSurface)) {
            String file2 = file.toString();
            int width = getWidth();
            int height = getHeight();
            ByteBuffer allocateDirect = ByteBuffer.allocateDirect(width * height * 4);
            allocateDirect.order(ByteOrder.LITTLE_ENDIAN);
            GLES20.glReadPixels(0, 0, width, height, 6408, 5121, allocateDirect);
            GlUtil.checkGlError("glReadPixels");
            allocateDirect.rewind();
            try {
                BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file2));
                try {
                    Bitmap createBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
                    createBitmap.copyPixelsFromBuffer(allocateDirect);
                    createBitmap.compress(Bitmap.CompressFormat.PNG, 90, bufferedOutputStream);
                    createBitmap.recycle();
                    bufferedOutputStream.close();
                    return;
                } catch (Throwable th) {
                    bufferedOutputStream.close();
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        throw new RuntimeException("Expected EGL context/surface is not current");
    }

    public void setPresentationTime(long j) {
        this.mEglCore.setPresentationTime(this.mEGLSurface, j);
    }

    public void createOffscreenSurface(int i, int i2) {
        if (this.mEGLSurface == EGL14.EGL_NO_SURFACE) {
            this.mEGLSurface = this.mEglCore.createOffscreenSurface(i, i2);
            this.mWidth = i;
            this.mHeight = i2;
            return;
        }
        throw new IllegalStateException("surface already created");
    }
}
