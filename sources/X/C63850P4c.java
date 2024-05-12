package X;

import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;

/* renamed from: X.P4c, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C63850P4c {
    public static final int LJ;
    public static final int LJFF;
    public static final int LJI;
    public static final int LJII;
    public EGLContext LIZ;
    public EGLConfig LIZIZ;
    public EGLDisplay LIZJ;
    public EGLSurface LIZLLL;

    static {
        C16880lQ.LJLLJ(C63850P4c.class);
        LJ = 8;
        LJFF = 8;
        LJI = 8;
        LJII = 8;
    }

    public final void LIZ() {
        EGLDisplay eGLDisplay = this.LIZJ;
        if (eGLDisplay != EGL14.EGL_NO_DISPLAY) {
            EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
            EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            EGL14.eglDestroyContext(this.LIZJ, this.LIZ);
            EGL14.eglDestroySurface(this.LIZJ, this.LIZLLL);
            EGL14.eglTerminate(this.LIZJ);
        }
        this.LIZJ = EGL14.EGL_NO_DISPLAY;
        this.LIZLLL = EGL14.EGL_NO_SURFACE;
        this.LIZ = EGL14.EGL_NO_CONTEXT;
    }
}
