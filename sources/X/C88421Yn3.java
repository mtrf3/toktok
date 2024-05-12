package X;

import android.os.Build;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;
import javax.microedition.khronos.opengles.GL;
import javax.microedition.khronos.opengles.GL10;
import kotlin.jvm.internal.o;

/* renamed from: X.Yn3, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public final class C88421Yn3 {
    public EGL10 LIZ;
    public EGLDisplay LIZIZ;
    public EGLConfig LIZJ;
    public EGLSurface LIZLLL;
    public EGLContext LJ;
    public GL10 LJFF;
    public final EGLContext LJI = EGL10.EGL_NO_CONTEXT;
    public final boolean LJII;

    public final void LIZIZ() {
        EGLSurface eGLSurface;
        EGL10 egl10 = this.LIZ;
        if (egl10 != null) {
            if (!this.LJII) {
                EGLDisplay eGLDisplay = this.LIZIZ;
                EGLSurface eGLSurface2 = EGL10.EGL_NO_SURFACE;
                egl10.eglMakeCurrent(eGLDisplay, eGLSurface2, eGLSurface2, EGL10.EGL_NO_CONTEXT);
                egl10.eglDestroySurface(this.LIZIZ, this.LIZLLL);
                egl10.eglDestroyContext(this.LIZIZ, this.LJ);
                egl10.eglTerminate(this.LIZIZ);
                return;
            }
            EGLDisplay eGLDisplay2 = this.LIZIZ;
            if (eGLDisplay2 != EGL10.EGL_NO_DISPLAY) {
                EGLSurface eGLSurface3 = this.LIZLLL;
                if (eGLSurface3 != null && eGLSurface3 != (eGLSurface = EGL10.EGL_NO_SURFACE)) {
                    egl10.eglMakeCurrent(eGLDisplay2, eGLSurface, eGLSurface, EGL10.EGL_NO_CONTEXT);
                    egl10.eglDestroySurface(this.LIZIZ, this.LIZLLL);
                    this.LIZLLL = null;
                }
                EGLContext eGLContext = this.LJ;
                if (eGLContext != null) {
                    egl10.eglDestroyContext(this.LIZIZ, eGLContext);
                    this.LJ = null;
                }
                EGLDisplay eGLDisplay3 = this.LIZIZ;
                if (eGLDisplay3 != null) {
                    egl10.eglTerminate(eGLDisplay3);
                    this.LIZIZ = null;
                }
            }
        }
    }

    public final void LIZJ() {
        GL gl;
        int[] iArr = {12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12326, 0, 12344};
        javax.microedition.khronos.egl.EGL egl = EGLContext.getEGL();
        GL gl2 = null;
        if (!(egl instanceof EGL10)) {
            egl = null;
        }
        EGL10 egl10 = (EGL10) egl;
        if (egl10 != null) {
            EGLDisplay eglGetDisplay = egl10.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
            this.LIZIZ = eglGetDisplay;
            if (eglGetDisplay == EGL10.EGL_NO_DISPLAY) {
                LIZLLL("unable to get EGL10 display");
            }
            LIZ(egl10);
            if (!egl10.eglInitialize(this.LIZIZ, new int[2])) {
                LIZLLL("unable to initialize EGL10");
            }
            LIZ(egl10);
            int[] iArr2 = new int[1];
            if (!egl10.eglChooseConfig(this.LIZIZ, iArr, null, 0, iArr2)) {
                LIZLLL("eglChooseConfig failed");
            }
            LIZ(egl10);
            int i = iArr2[0];
            EGLConfig[] eGLConfigArr = new EGLConfig[i];
            if (!egl10.eglChooseConfig(this.LIZIZ, iArr, eGLConfigArr, i, iArr2)) {
                LIZLLL("eglChooseConfig#2 failed");
            }
            LIZ(egl10);
            EGLConfig eGLConfig = eGLConfigArr[0];
            this.LIZJ = eGLConfig;
            if (eGLConfig == null) {
                LIZLLL("Unable to find a suitable EGLConfig");
            }
            EGLSurface eglCreatePbufferSurface = egl10.eglCreatePbufferSurface(this.LIZIZ, this.LIZJ, new int[]{12375, 16, 12374, 16, 12344});
            this.LIZLLL = eglCreatePbufferSurface;
            if (eglCreatePbufferSurface == EGL10.EGL_NO_SURFACE || eglCreatePbufferSurface == null) {
                LIZLLL("surface was null");
            }
            LIZ(egl10);
            EGLContext eglCreateContext = egl10.eglCreateContext(this.LIZIZ, this.LIZJ, this.LJI, new int[]{12440, 2, 12344});
            this.LJ = eglCreateContext;
            if (eglCreateContext == EGL10.EGL_NO_CONTEXT || eglCreateContext == null) {
                LIZLLL("context was null");
            }
            LIZ(egl10);
            EGLDisplay eGLDisplay = this.LIZIZ;
            EGLSurface eGLSurface = this.LIZLLL;
            if (!egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, this.LJ)) {
                LIZLLL("eglMakeCurrent failed");
            }
            LIZ(egl10);
            EGLContext eGLContext = this.LJ;
            if (eGLContext != null) {
                gl = eGLContext.getGL();
            } else {
                gl = null;
            }
            if (gl instanceof GL10) {
                gl2 = gl;
            }
            this.LJFF = (GL10) gl2;
            this.LIZ = egl10;
        }
    }

    public C88421Yn3() {
        String str;
        String str2 = Build.MODEL;
        if (str2 != null) {
            str = str2.toLowerCase();
            o.LJFF(str, "(this as java.lang.String).toLowerCase()");
        } else {
            str = null;
        }
        this.LJII = o.LJ("mi play", str);
    }

    public final void LIZ(EGL10 egl10) {
        int eglGetError = egl10.eglGetError();
        if (eglGetError != 12288) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("EGL error: 0x");
            LIZ.append(Integer.toHexString(eglGetError));
            LIZLLL(X1D.LIZIZ(LIZ));
        }
    }

    public final void LIZLLL(String str) {
        if (!this.LJII) {
            C12310e3 c12310e3 = C12310e3.LIZIZ;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("get gpu info error:");
            LIZ.append(str);
            String LIZIZ = X1D.LIZIZ(LIZ);
            c12310e3.getClass();
            C12310e3.LIZIZ("EGLUtils", LIZIZ, null);
            return;
        }
        throw new RuntimeException(str);
    }
}
