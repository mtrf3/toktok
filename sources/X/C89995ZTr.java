package X;

import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;

/* renamed from: X.ZTr, reason: case insensitive filesystem */
/* loaded from: classes19.dex */
public final class C89995ZTr {
    public EGLContext LIZ;
    public EGLConfig LIZIZ;
    public EGLDisplay LIZJ;
    public EGLSurface LIZLLL;

    public final void LIZJ() {
        C47261Igj.LJJIIJ("BXSharedContext");
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

    public static void LIZ(String str) {
        int eglGetError = EGL14.eglGetError();
        if (eglGetError != 12288) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(str);
            LIZ.append(": EGL error: 0x");
            LIZ.append(Integer.toHexString(eglGetError));
            X1D.LIZIZ(LIZ);
            C47261Igj.LJIILL("BXSharedContext");
            if (eglGetError == 12294) {
                C47261Igj.LJIILL("BXSharedContext");
            }
        }
    }

    public static C89995ZTr LIZIZ(EGLContext eGLContext, int i, int i2, Object obj) {
        String str;
        EGLContext eGLContext2 = eGLContext;
        C89995ZTr c89995ZTr = new C89995ZTr();
        if (eGLContext2 == null) {
            eGLContext2 = EGL14.EGL_NO_CONTEXT;
        }
        int[] iArr = {12440, 2, 12344};
        int[] iArr2 = {12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12339, 12610, 12344};
        iArr2[10] = 12610;
        iArr2[11] = 1;
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        int[] iArr3 = new int[1];
        int[] iArr4 = {0, 1};
        int[] iArr5 = {12375, i, 12374, i2, 12344};
        EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
        c89995ZTr.LIZJ = eglGetDisplay;
        if (eglGetDisplay == EGL14.EGL_NO_DISPLAY) {
            LIZ("eglGetDisplay");
        } else {
            int[] iArr6 = new int[2];
            if (!eGLContext2.equals(EGL14.EGL_NO_CONTEXT) && EGL14.eglQueryContext(c89995ZTr.LIZJ, eGLContext2, 12440, iArr6, 0)) {
                iArr[1] = iArr6[0];
            }
            if (!EGL14.eglInitialize(c89995ZTr.LIZJ, iArr4, 0, iArr4, 1)) {
                LIZ("eglInitialize");
            } else {
                C16880lQ.LLLZ("eglInitialize - major: %d, minor: %d", new Object[]{Integer.valueOf(iArr4[0]), Integer.valueOf(iArr4[1])});
                C47261Igj.LJJIIJ("BXSharedContext");
                if (!EGL14.eglChooseConfig(c89995ZTr.LIZJ, iArr2, 0, eGLConfigArr, 0, 1, iArr3, 0)) {
                    LIZ("eglChooseConfig");
                } else {
                    Object[] objArr = new Object[2];
                    objArr[0] = Integer.valueOf(iArr3[0]);
                    if (eGLContext2 == EGL14.EGL_NO_CONTEXT) {
                        str = "NO";
                    } else {
                        str = "YES";
                    }
                    objArr[1] = str;
                    C16880lQ.LLLZ("Config num: %d, has sharedContext: %s", objArr);
                    C47261Igj.LJJIIJ("BXSharedContext");
                    EGLConfig eGLConfig = eGLConfigArr[0];
                    c89995ZTr.LIZIZ = eGLConfig;
                    EGLContext eglCreateContext = EGL14.eglCreateContext(c89995ZTr.LIZJ, eGLConfig, eGLContext2, iArr, 0);
                    c89995ZTr.LIZ = eglCreateContext;
                    if (eglCreateContext == EGL14.EGL_NO_CONTEXT) {
                        LIZ("eglCreateContext");
                    } else {
                        iArr5[0] = 12344;
                        iArr5[2] = 12344;
                        EGLSurface eglCreateWindowSurface = EGL14.eglCreateWindowSurface(c89995ZTr.LIZJ, c89995ZTr.LIZIZ, obj, iArr5, 0);
                        c89995ZTr.LIZLLL = eglCreateWindowSurface;
                        if (eglCreateWindowSurface == EGL14.EGL_NO_SURFACE) {
                            LIZ("eglCreateSurface");
                        } else if (!EGL14.eglMakeCurrent(c89995ZTr.LIZJ, eglCreateWindowSurface, eglCreateWindowSurface, c89995ZTr.LIZ)) {
                            LIZ("eglMakeCurrent");
                        } else {
                            int[] iArr7 = new int[1];
                            EGL14.eglQueryContext(c89995ZTr.LIZJ, c89995ZTr.LIZ, 12440, iArr7, 0);
                            StringBuilder LIZ = X1D.LIZ();
                            LIZ.append("EGLContext created, client version ");
                            LIZ.append(iArr7[0]);
                            X1D.LIZIZ(LIZ);
                            C47261Igj.LJJIIJ("BXSharedContext");
                            return c89995ZTr;
                        }
                    }
                }
            }
        }
        c89995ZTr.LIZJ();
        return null;
    }
}
