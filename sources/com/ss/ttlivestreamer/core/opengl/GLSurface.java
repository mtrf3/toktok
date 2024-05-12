package com.ss.ttlivestreamer.core.opengl;

import android.view.Surface;
import com.ss.ttlivestreamer.core.engine.NativeObject;

/* loaded from: classes12.dex */
public class GLSurface extends NativeObject {
    public native boolean nativeDoneCurrent();

    public native boolean nativeMakeCurrent();

    public native boolean nativeMakeDefaultCurrent();

    public native int nativeQuerySurfaceHeight();

    public native int nativeQuerySurfaceWidth();

    public native boolean nativeSurfaceChanged(int i, int i2, int i3);

    public native boolean nativeSurfaceCreate(int i, int i2, Surface surface);

    public native boolean nativeSurfaceDestroy();

    public native void nativeSwapBuffers();

    public boolean surfaceDestroy() {
        if (this.mNativeObj != 0) {
            return nativeSurfaceDestroy();
        }
        return false;
    }
}
