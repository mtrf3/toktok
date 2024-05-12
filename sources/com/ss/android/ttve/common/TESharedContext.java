package com.ss.android.ttve.common;

import X.C01R;
import X.C16880lQ;
import X.P4Q;
import X.X1D;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import defpackage.b1;

/* loaded from: classes12.dex */
public class TESharedContext {
    public static boolean LJ;
    public EGLContext LIZ;
    public EGLConfig LIZIZ;
    public EGLDisplay LIZJ;
    public EGLSurface LIZLLL;

    public static native void refEGLDisplay();

    public static native boolean unrefEGLDisplay();

    public final boolean LIZLLL() {
        EGLDisplay eGLDisplay = this.LIZJ;
        EGLSurface eGLSurface = this.LIZLLL;
        if (!EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, this.LIZ)) {
            LIZ("eglMakeCurrent");
            return false;
        }
        return true;
    }

    public final void LJ() {
        P4Q.LJFF("TESharedContext", "#### CGESharedGLContext Destroying context... ####");
        EGLDisplay eGLDisplay = this.LIZJ;
        if (eGLDisplay != EGL14.EGL_NO_DISPLAY) {
            EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
            EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            EGL14.eglDestroyContext(this.LIZJ, this.LIZ);
            EGL14.eglDestroySurface(this.LIZJ, this.LIZLLL);
            if (unrefEGLDisplay()) {
                EGL14.eglTerminate(this.LIZJ);
            }
        }
        this.LIZJ = EGL14.EGL_NO_DISPLAY;
        this.LIZLLL = EGL14.EGL_NO_SURFACE;
        this.LIZ = EGL14.EGL_NO_CONTEXT;
    }

    public static void LIZ(String str) {
        int eglGetError = EGL14.eglGetError();
        if (eglGetError != 12288) {
            StringBuilder LIZJ = b1.LIZJ(str, ": EGL error: 0x");
            LIZJ.append(Integer.toHexString(eglGetError));
            P4Q.LIZJ("TESharedContext", X1D.LIZIZ(LIZJ));
            if (eglGetError == 12294) {
                P4Q.LIZJ("TESharedContext", "gl error EGL_BAD_CONTEXT");
            }
        }
    }

    public final boolean LJFF(int i, Object obj) {
        EGLSurface eGLSurface;
        EGLDisplay eGLDisplay = this.LIZJ;
        if (eGLDisplay != null && (eGLSurface = this.LIZLLL) != null) {
            EGL14.eglDestroySurface(eGLDisplay, eGLSurface);
        }
        int[] iArr = {12375, 0, 12374, 0, 12344};
        if (i != 2) {
            if (i != 4) {
                if (i != 12610) {
                    this.LIZLLL = EGL14.eglCreatePbufferSurface(this.LIZJ, this.LIZIZ, iArr, 0);
                } else {
                    iArr[0] = 12344;
                    iArr[2] = 12344;
                }
            }
            int[] iArr2 = {12344};
            EGLDisplay eGLDisplay2 = this.LIZJ;
            EGLConfig eGLConfig = this.LIZIZ;
            if (LJ) {
                iArr = iArr2;
            }
            this.LIZLLL = EGL14.eglCreateWindowSurface(eGLDisplay2, eGLConfig, obj, iArr, 0);
        } else {
            this.LIZLLL = EGL14.eglCreatePixmapSurface(this.LIZJ, this.LIZIZ, 0, iArr, 0);
        }
        if (this.LIZLLL == EGL14.EGL_NO_SURFACE) {
            LIZ("eglCreateSurface");
            return false;
        }
        return LIZLLL();
    }

    public static TESharedContext LIZJ(EGLContext eGLContext, EGLDisplay eGLDisplay, int i) {
        int i2;
        int i3;
        TESharedContext tESharedContext = new TESharedContext();
        tESharedContext.LIZ = eGLContext;
        tESharedContext.LIZJ = eGLDisplay;
        tESharedContext.LIZLLL = null;
        boolean z = LJ;
        if (z) {
            i2 = 10;
        } else {
            i2 = 8;
        }
        if (z) {
            i3 = 2;
        } else {
            i3 = 8;
        }
        int[] iArr = {12324, i2, 12323, i2, 12322, i2, 12321, i3, 12352, 4, 12610, !z ? 1 : 0, 12344};
        if (i == 12610) {
            iArr[10] = 12610;
            iArr[11] = 1;
        }
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        EGL14.eglChooseConfig(eGLDisplay, iArr, 0, eGLConfigArr, 0, 1, new int[1], 0);
        tESharedContext.LIZIZ = eGLConfigArr[0];
        return tESharedContext;
    }

    public static TESharedContext LIZIZ(EGLContext eGLContext, int i, Object obj, boolean z) {
        int i2;
        int i3;
        String str;
        int i4;
        EGLContext eGLContext2 = eGLContext;
        TESharedContext tESharedContext = new TESharedContext();
        LJ = z;
        if (eGLContext2 == null) {
            eGLContext2 = EGL14.EGL_NO_CONTEXT;
        }
        int[] iArr = {12440, 2, 12344};
        boolean z2 = LJ;
        if (z2) {
            i2 = 10;
        } else {
            i2 = 8;
        }
        if (z2) {
            i3 = 2;
        } else {
            i3 = 8;
        }
        int[] iArr2 = {12324, i2, 12323, i2, 12322, i2, 12321, i3, 12352, 4, 12610, !z2 ? 1 : 0, 12344};
        if (i == 12610) {
            iArr2[10] = 12610;
            iArr2[11] = 1;
        }
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        int[] iArr3 = new int[1];
        int[] iArr4 = {0, 1};
        int[] iArr5 = {12375, 64, 12374, 64, 12344};
        EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
        tESharedContext.LIZJ = eglGetDisplay;
        if (eglGetDisplay == EGL14.EGL_NO_DISPLAY) {
            LIZ("eglGetDisplay");
        } else {
            int[] iArr6 = new int[2];
            if (!eGLContext2.equals(EGL14.EGL_NO_CONTEXT) && EGL14.eglQueryContext(tESharedContext.LIZJ, eGLContext2, 12440, iArr6, 0)) {
                iArr[1] = iArr6[0];
            }
            if (!EGL14.eglInitialize(tESharedContext.LIZJ, iArr4, 0, iArr4, 1)) {
                LIZ("eglInitialize");
            } else {
                refEGLDisplay();
                P4Q.LJFF("TESharedContext", C16880lQ.LLLZ("eglInitialize - major: %d, minor: %d", new Object[]{Integer.valueOf(iArr4[0]), Integer.valueOf(iArr4[1])}));
                if (!EGL14.eglChooseConfig(tESharedContext.LIZJ, iArr2, 0, eGLConfigArr, 0, 1, iArr3, 0)) {
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
                    P4Q.LJFF("TESharedContext", C16880lQ.LLLZ("Config num: %d, has sharedContext: %s", objArr));
                    EGLConfig eGLConfig = eGLConfigArr[0];
                    tESharedContext.LIZIZ = eGLConfig;
                    EGLContext eglCreateContext = EGL14.eglCreateContext(tESharedContext.LIZJ, eGLConfig, eGLContext2, iArr, 0);
                    tESharedContext.LIZ = eglCreateContext;
                    if (eglCreateContext == EGL14.EGL_NO_CONTEXT) {
                        LIZ("eglCreateContext");
                    } else {
                        if (i != 2) {
                            if (i != 4) {
                                if (i != 12610) {
                                    tESharedContext.LIZLLL = EGL14.eglCreatePbufferSurface(tESharedContext.LIZJ, tESharedContext.LIZIZ, iArr5, 0);
                                } else {
                                    i4 = 12344;
                                    iArr5[0] = 12344;
                                    iArr5[2] = 12344;
                                }
                            } else {
                                i4 = 12344;
                            }
                            int[] iArr7 = {i4};
                            EGLDisplay eGLDisplay = tESharedContext.LIZJ;
                            EGLConfig eGLConfig2 = tESharedContext.LIZIZ;
                            if (LJ) {
                                iArr5 = iArr7;
                            }
                            tESharedContext.LIZLLL = EGL14.eglCreateWindowSurface(eGLDisplay, eGLConfig2, obj, iArr5, 0);
                        } else {
                            tESharedContext.LIZLLL = EGL14.eglCreatePixmapSurface(tESharedContext.LIZJ, tESharedContext.LIZIZ, 0, iArr5, 0);
                        }
                        if (tESharedContext.LIZLLL == EGL14.EGL_NO_SURFACE) {
                            LIZ("eglCreateSurface");
                        } else if (tESharedContext.LIZLLL()) {
                            int[] iArr8 = new int[1];
                            EGL14.eglQueryContext(tESharedContext.LIZJ, tESharedContext.LIZ, 12440, iArr8, 0);
                            StringBuilder LIZ = X1D.LIZ();
                            LIZ.append("EGLContext created, client version ");
                            C01R.LIZJ(LIZ, iArr8[0], LIZ, "TESharedContext");
                            return tESharedContext;
                        }
                    }
                }
            }
        }
        tESharedContext.LJ();
        return null;
    }
}
