package X;

import android.opengl.EGL14;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;

/* loaded from: classes12.dex */
public final class P4I {
    public EGLContext LIZ = EGL14.EGL_NO_CONTEXT;
    public EGLSurface LIZIZ;
    public EGLSurface LIZJ;
    public EGLDisplay LIZLLL;
    public int LJ;

    public final void LIZ() {
        EGL14.eglMakeCurrent(this.LIZLLL, this.LIZIZ, this.LIZJ, this.LIZ);
    }

    public P4I() {
        EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
        this.LIZIZ = eGLSurface;
        this.LIZJ = eGLSurface;
        this.LIZLLL = EGL14.EGL_NO_DISPLAY;
        this.LJ = 2;
    }

    public final void LIZIZ() {
        EGLContext eglGetCurrentContext = EGL14.eglGetCurrentContext();
        this.LIZ = eglGetCurrentContext;
        if (eglGetCurrentContext.equals(EGL14.EGL_NO_CONTEXT)) {
            P4Q.LIZJ("TEEglStateSaver", "Saved EGL_NO_CONTEXT");
        }
        EGLSurface eglGetCurrentSurface = EGL14.eglGetCurrentSurface(12378);
        this.LIZIZ = eglGetCurrentSurface;
        if (eglGetCurrentSurface.equals(EGL14.EGL_NO_SURFACE)) {
            P4Q.LIZJ("TEEglStateSaver", "Saved EGL_NO_SURFACE");
        }
        EGLSurface eglGetCurrentSurface2 = EGL14.eglGetCurrentSurface(12377);
        this.LIZJ = eglGetCurrentSurface2;
        if (eglGetCurrentSurface2.equals(EGL14.EGL_NO_SURFACE)) {
            P4Q.LIZJ("TEEglStateSaver", "Saved EGL_NO_SURFACE");
        }
        EGLDisplay eglGetCurrentDisplay = EGL14.eglGetCurrentDisplay();
        this.LIZLLL = eglGetCurrentDisplay;
        int[] iArr = {2};
        EGL14.eglQueryContext(eglGetCurrentDisplay, this.LIZ, 12440, iArr, 0);
        this.LJ = iArr[0];
        if (this.LIZLLL.equals(EGL14.EGL_NO_DISPLAY)) {
            P4Q.LIZJ("TEEglStateSaver", "Saved EGL_NO_DISPLAY");
        }
    }
}
