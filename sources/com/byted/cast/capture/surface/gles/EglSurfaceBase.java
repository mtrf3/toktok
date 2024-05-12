package com.byted.cast.capture.surface.gles;

import X.X1D;
import android.graphics.Bitmap;
import android.opengl.EGL14;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import com.byted.cast.mediacommon.MediaSetting;
import com.byted.cast.mediacommon.utils.Logger;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes29.dex */
public class EglSurfaceBase {
    public int mDrawX;
    public int mDrawY;
    public EglCore mEglCore;
    public EGLSurface mEGLSurface = EGL14.EGL_NO_SURFACE;
    public MediaSetting.FILL_TYPE mType = MediaSetting.FILL_TYPE.SCALE;
    public int mSurfaceWidth = -1;
    public int mSurfaceHeight = -1;
    public int mDrawWidth = -1;
    public int mDrawHeight = -1;

    /* renamed from: com.byted.cast.capture.surface.gles.EglSurfaceBase$1, reason: invalid class name */
    /* loaded from: classes29.dex */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$com$byted$cast$mediacommon$MediaSetting$FILL_TYPE;

        static {
            int[] iArr = new int[MediaSetting.FILL_TYPE.values().length];
            $SwitchMap$com$byted$cast$mediacommon$MediaSetting$FILL_TYPE = iArr;
            try {
                iArr[MediaSetting.FILL_TYPE.PADDING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$byted$cast$mediacommon$MediaSetting$FILL_TYPE[MediaSetting.FILL_TYPE.SCALE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public int getDrawHeight() {
        int i = this.mDrawHeight;
        if (i < 0) {
            return this.mEglCore.querySurface(this.mEGLSurface, 12374);
        }
        return i;
    }

    public int getDrawWidth() {
        int i = this.mDrawWidth;
        if (i < 0) {
            return this.mEglCore.querySurface(this.mEGLSurface, 12375);
        }
        return i;
    }

    public int getSurfaceHeight() {
        int i = this.mSurfaceHeight;
        if (i < 0) {
            return this.mEglCore.querySurface(this.mEGLSurface, 12374);
        }
        return i;
    }

    public int getSurfaceWidth() {
        int i = this.mSurfaceWidth;
        if (i < 0) {
            return this.mEglCore.querySurface(this.mEGLSurface, 12375);
        }
        return i;
    }

    public void makeCurrent() {
        this.mEglCore.makeCurrent(this.mEGLSurface);
        GLES20.glClear(16384);
        GLES20.glViewport(this.mDrawX, this.mDrawY, getDrawWidth(), getDrawHeight());
    }

    public void makeUnCurrent() {
        this.mEglCore.makeNothingCurrent();
    }

    public void releaseEglSurface() {
        this.mEglCore.releaseSurface(this.mEGLSurface);
        this.mEGLSurface = EGL14.EGL_NO_SURFACE;
        int i = this.mSurfaceHeight - 1;
        this.mSurfaceWidth = i;
        this.mDrawHeight = i;
        this.mDrawWidth = i;
    }

    public boolean swapBuffers() {
        boolean swapBuffers = this.mEglCore.swapBuffers(this.mEGLSurface);
        if (!swapBuffers) {
            Logger.d("Grafika", "WARNING: swapBuffers() failed");
        }
        return swapBuffers;
    }

    public EglSurfaceBase(EglCore eglCore) {
        this.mEglCore = eglCore;
    }

    private int Align8(int i) {
        if (i % 8 > 0) {
            return ((i / 8) + 1) * 8;
        }
        return i;
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

    public boolean saveFrame(File file) {
        if (!this.mEglCore.isCurrent(this.mEGLSurface)) {
            Logger.e("Grafika", "Expected EGL context/surface is not current");
            return false;
        }
        String file2 = file.toString();
        int drawWidth = getDrawWidth();
        int drawHeight = getDrawHeight();
        if (drawWidth <= 0 || drawHeight <= 0) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Error width ");
            LIZ.append(drawWidth);
            LIZ.append(" height ");
            LIZ.append(drawHeight);
            Logger.e("Grafika", X1D.LIZIZ(LIZ));
            return false;
        }
        int i = drawWidth * drawHeight;
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(i * 4);
        allocateDirect.order(ByteOrder.LITTLE_ENDIAN);
        try {
            GLES20.glReadPixels(this.mDrawX, this.mDrawY, drawWidth, drawHeight, 6408, 5121, allocateDirect);
            GlUtil.checkGlError("glReadPixels");
            allocateDirect.rewind();
            int[] iArr = new int[i];
            allocateDirect.asIntBuffer().get(iArr);
            for (int i2 = 0; i2 < i; i2++) {
                int i3 = iArr[i2];
                byte b = (byte) (i3 >> 16);
                int i4 = i3 & (-16711681);
                iArr[i2] = i4;
                int i5 = i4 | ((i4 << 16) & 16711680);
                iArr[i2] = i5;
                int i6 = i5 & (-256);
                iArr[i2] = i6;
                iArr[i2] = i6 | (b & 255);
            }
            for (int i7 = 0; i7 < drawHeight / 2; i7++) {
                int i8 = 0;
                do {
                    int i9 = (((drawHeight - i7) - 1) * drawWidth) + i8;
                    int i10 = iArr[i9];
                    int i11 = (i7 * drawWidth) + i8;
                    iArr[i9] = iArr[i11];
                    iArr[i11] = i10;
                    i8++;
                } while (i8 < drawWidth);
            }
            try {
                BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file2));
                try {
                    Bitmap createBitmap = Bitmap.createBitmap(iArr, drawWidth, drawHeight, Bitmap.Config.ARGB_8888);
                    if (file2.endsWith(".png")) {
                        createBitmap.compress(Bitmap.CompressFormat.PNG, 90, bufferedOutputStream);
                    } else if (file2.endsWith(".jpeg")) {
                        createBitmap.compress(Bitmap.CompressFormat.JPEG, 90, bufferedOutputStream);
                    } else {
                        Logger.e("Grafika", "Unkonw filename !!!");
                    }
                    createBitmap.recycle();
                    bufferedOutputStream.close();
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("Saved ");
                    LIZ2.append(drawWidth);
                    LIZ2.append("x");
                    LIZ2.append(drawHeight);
                    LIZ2.append(" frame as '");
                    LIZ2.append(file2);
                    LIZ2.append("'");
                    Logger.i("Grafika", X1D.LIZIZ(LIZ2));
                    return true;
                } catch (Throwable th) {
                    bufferedOutputStream.close();
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        } catch (Exception e) {
            e.printStackTrace();
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("glReadPixels Error ");
            LIZ3.append(e);
            Logger.e("Grafika", X1D.LIZIZ(LIZ3));
            return false;
        }
    }

    public void setPresentationTime(long j) {
        this.mEglCore.setPresentationTime(this.mEGLSurface, j);
    }

    public void setType(MediaSetting.FILL_TYPE fill_type) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("setType ");
        LIZ.append(fill_type);
        Logger.i("Grafika", X1D.LIZIZ(LIZ));
        this.mType = fill_type;
    }

    private void BlackEdge(int i, int i2) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("BlackEdge ");
        LIZ.append(this.mType);
        Logger.i("Grafika", X1D.LIZIZ(LIZ));
        int surfaceWidth = getSurfaceWidth();
        int surfaceHeight = getSurfaceHeight();
        float f = i / i2;
        float f2 = surfaceWidth;
        float f3 = surfaceHeight;
        if (f > f2 / f3) {
            this.mDrawWidth = Align8(surfaceWidth);
            int Align8 = Align8((int) (f2 / f));
            this.mDrawHeight = Align8;
            this.mDrawX = 0;
            this.mDrawY = (surfaceHeight - Align8) / 2;
        } else {
            this.mDrawHeight = Align8(surfaceHeight);
            int Align82 = Align8((int) (f3 * f));
            this.mDrawWidth = Align82;
            this.mDrawX = (surfaceWidth - Align82) / 2;
            this.mDrawY = 0;
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("reSize w:");
        LIZ2.append(i);
        LIZ2.append(" h:");
        LIZ2.append(i2);
        LIZ2.append(" surfaceWidth:");
        LIZ2.append(surfaceWidth);
        LIZ2.append(" surfaceHeight:");
        LIZ2.append(surfaceHeight);
        LIZ2.append(" to mWidth:");
        LIZ2.append(this.mDrawWidth);
        LIZ2.append(" mHeight:");
        LIZ2.append(this.mDrawHeight);
        LIZ2.append(" mDrawX:");
        LIZ2.append(this.mDrawX);
        LIZ2.append(" mDrawY:");
        LIZ2.append(this.mDrawY);
        Logger.i("Grafika", X1D.LIZIZ(LIZ2));
    }

    private void NoBlackEdge(int i, int i2) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("NoBlackEdge ");
        LIZ.append(this.mType);
        Logger.i("Grafika", X1D.LIZIZ(LIZ));
        int surfaceWidth = getSurfaceWidth();
        int surfaceHeight = getSurfaceHeight();
        float f = i / i2;
        float f2 = surfaceWidth;
        float f3 = surfaceHeight;
        if (f > f2 / f3) {
            this.mDrawHeight = Align8(surfaceHeight);
            int Align8 = Align8((int) (f3 * f));
            this.mDrawWidth = Align8;
            this.mDrawX = (surfaceWidth - Align8) / 2;
            this.mDrawY = 0;
        } else {
            this.mDrawWidth = Align8(surfaceWidth);
            int Align82 = Align8((int) (f2 / f));
            this.mDrawHeight = Align82;
            this.mDrawX = 0;
            this.mDrawY = (surfaceHeight - Align82) / 2;
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("reSize w:");
        LIZ2.append(i);
        LIZ2.append(" h:");
        LIZ2.append(i2);
        LIZ2.append(" surfaceWidth:");
        LIZ2.append(surfaceWidth);
        LIZ2.append(" surfaceHeight:");
        LIZ2.append(surfaceHeight);
        LIZ2.append(" to mWidth:");
        LIZ2.append(this.mDrawWidth);
        LIZ2.append(" mHeight:");
        LIZ2.append(this.mDrawHeight);
        LIZ2.append(" mDrawX:");
        LIZ2.append(this.mDrawX);
        LIZ2.append(" mDrawY:");
        LIZ2.append(this.mDrawY);
        Logger.i("Grafika", X1D.LIZIZ(LIZ2));
    }

    public void createOffscreenSurface(int i, int i2) {
        if (this.mEGLSurface == EGL14.EGL_NO_SURFACE) {
            this.mEGLSurface = this.mEglCore.createOffscreenSurface(i, i2);
            this.mDrawWidth = i;
            this.mDrawHeight = i2;
            return;
        }
        throw new IllegalStateException("surface already created");
    }

    public void reSize(int i, int i2) {
        if (AnonymousClass1.$SwitchMap$com$byted$cast$mediacommon$MediaSetting$FILL_TYPE[this.mType.ordinal()] != 1) {
            BlackEdge(i, i2);
        } else {
            NoBlackEdge(i, i2);
        }
    }
}
