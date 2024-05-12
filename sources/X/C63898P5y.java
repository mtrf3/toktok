package X;

import android.graphics.SurfaceTexture;
import android.os.Build;

/* renamed from: X.P5y, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C63898P5y extends SurfaceTexture {
    public boolean LIZ;

    public C63898P5y() {
        super(false);
    }

    @Override // android.graphics.SurfaceTexture
    public final synchronized void detachFromGLContext() {
        if (isReleased()) {
            return;
        }
        super.detachFromGLContext();
    }

    @Override // android.graphics.SurfaceTexture
    public final synchronized long getTimestamp() {
        if (isReleased()) {
            return -1L;
        }
        return super.getTimestamp();
    }

    @Override // android.graphics.SurfaceTexture
    public final synchronized void release() {
        if (isReleased()) {
            return;
        }
        super.release();
        this.LIZ = true;
    }

    @Override // android.graphics.SurfaceTexture
    public final synchronized void releaseTexImage() {
        if (isReleased()) {
            return;
        }
        super.releaseTexImage();
    }

    @Override // android.graphics.SurfaceTexture
    public final synchronized void updateTexImage() {
        if (isReleased()) {
            return;
        }
        super.updateTexImage();
    }

    @Override // android.graphics.SurfaceTexture
    public final boolean isReleased() {
        if (Build.VERSION.SDK_INT >= 26) {
            return super.isReleased();
        }
        return this.LIZ;
    }

    public C63898P5y(int i) {
        super(i);
    }

    @Override // android.graphics.SurfaceTexture
    public final synchronized void attachToGLContext(int i) {
        if (isReleased()) {
            return;
        }
        super.attachToGLContext(i);
    }

    @Override // android.graphics.SurfaceTexture
    public final synchronized void getTransformMatrix(float[] fArr) {
        if (isReleased()) {
            return;
        }
        super.getTransformMatrix(fArr);
    }

    @Override // android.graphics.SurfaceTexture
    public final synchronized void setDefaultBufferSize(int i, int i2) {
        if (isReleased()) {
            return;
        }
        super.setDefaultBufferSize(i, i2);
    }
}
