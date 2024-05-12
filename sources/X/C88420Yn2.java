package X;

import android.graphics.SurfaceTexture;
import com.ss.android.ugc.aweme.live.alphaplayer.listener.IMonitor;
import java.lang.ref.WeakReference;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;

/* renamed from: X.Yn2, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public class C88420Yn2 {
    public final WeakReference<TextureViewSurfaceTextureListenerC88419Yn1> LIZ;
    public EGL10 LIZIZ;
    public EGLDisplay LIZJ;
    public EGLSurface LIZLLL;
    public EGLConfig LJ;
    public EGLContext LJFF;

    public final boolean LIZ() {
        if (this.LIZIZ != null) {
            if (this.LIZJ != null) {
                if (this.LJ != null) {
                    LIZIZ();
                    TextureViewSurfaceTextureListenerC88419Yn1 textureViewSurfaceTextureListenerC88419Yn1 = this.LIZ.get();
                    EGLSurface eGLSurface = null;
                    if (textureViewSurfaceTextureListenerC88419Yn1 != null) {
                        InterfaceC88428YnA interfaceC88428YnA = textureViewSurfaceTextureListenerC88419Yn1.LJLJLJ;
                        EGL10 egl10 = this.LIZIZ;
                        EGLDisplay eGLDisplay = this.LIZJ;
                        EGLConfig eGLConfig = this.LJ;
                        SurfaceTexture surfaceTexture = textureViewSurfaceTextureListenerC88419Yn1.getSurfaceTexture();
                        interfaceC88428YnA.getClass();
                        try {
                            eGLSurface = egl10.eglCreateWindowSurface(eGLDisplay, eGLConfig, surfaceTexture, null);
                        } catch (IllegalArgumentException unused) {
                        }
                        this.LIZLLL = eGLSurface;
                    } else {
                        this.LIZLLL = null;
                    }
                    EGLSurface eGLSurface2 = this.LIZLLL;
                    if (eGLSurface2 == null || eGLSurface2 == EGL10.EGL_NO_SURFACE) {
                        this.LIZIZ.eglGetError();
                        return false;
                    }
                    if (!this.LIZIZ.eglMakeCurrent(this.LIZJ, eGLSurface2, eGLSurface2, this.LJFF)) {
                        this.LIZIZ.eglGetError();
                        return false;
                    }
                    return true;
                }
                throw new RuntimeException("mEglConfig not initialized");
            }
            throw new RuntimeException("eglDisplay not initialized");
        }
        throw new RuntimeException("egl not initialized");
    }

    public final void LIZIZ() {
        EGLSurface eGLSurface;
        EGLSurface eGLSurface2 = this.LIZLLL;
        if (eGLSurface2 != null && eGLSurface2 != (eGLSurface = EGL10.EGL_NO_SURFACE)) {
            this.LIZIZ.eglMakeCurrent(this.LIZJ, eGLSurface, eGLSurface, EGL10.EGL_NO_CONTEXT);
            TextureViewSurfaceTextureListenerC88419Yn1 textureViewSurfaceTextureListenerC88419Yn1 = this.LIZ.get();
            if (textureViewSurfaceTextureListenerC88419Yn1 != null) {
                InterfaceC88428YnA interfaceC88428YnA = textureViewSurfaceTextureListenerC88419Yn1.LJLJLJ;
                EGL10 egl10 = this.LIZIZ;
                EGLDisplay eGLDisplay = this.LIZJ;
                EGLSurface eGLSurface3 = this.LIZLLL;
                interfaceC88428YnA.getClass();
                egl10.eglDestroySurface(eGLDisplay, eGLSurface3);
            }
            this.LIZLLL = null;
        }
    }

    public final void LIZJ() {
        if (this.LJFF != null) {
            TextureViewSurfaceTextureListenerC88419Yn1 textureViewSurfaceTextureListenerC88419Yn1 = this.LIZ.get();
            if (textureViewSurfaceTextureListenerC88419Yn1 != null) {
                InterfaceC88427Yn9 interfaceC88427Yn9 = textureViewSurfaceTextureListenerC88419Yn1.LJLJL;
                EGL10 egl10 = this.LIZIZ;
                EGLDisplay eGLDisplay = this.LIZJ;
                EGLContext eGLContext = this.LJFF;
                interfaceC88427Yn9.getClass();
                if (!egl10.eglDestroyContext(eGLDisplay, eGLContext)) {
                    int eglGetError = egl10.eglGetError();
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("eglDestroyContex");
                    LIZ.append(" failed: ");
                    LIZ.append(eglGetError);
                    X1D.LIZIZ(LIZ);
                }
            }
            this.LJFF = null;
        }
        EGLDisplay eGLDisplay2 = this.LIZJ;
        if (eGLDisplay2 != null) {
            this.LIZIZ.eglTerminate(eGLDisplay2);
            this.LIZJ = null;
        }
    }

    public final void LIZLLL() {
        EGL10 egl10 = (EGL10) EGLContext.getEGL();
        this.LIZIZ = egl10;
        EGLDisplay eglGetDisplay = egl10.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
        this.LIZJ = eglGetDisplay;
        if (eglGetDisplay != EGL10.EGL_NO_DISPLAY) {
            if (this.LIZIZ.eglInitialize(eglGetDisplay, new int[2])) {
                TextureViewSurfaceTextureListenerC88419Yn1 textureViewSurfaceTextureListenerC88419Yn1 = this.LIZ.get();
                if (textureViewSurfaceTextureListenerC88419Yn1 == null) {
                    this.LJ = null;
                    this.LJFF = null;
                } else {
                    InterfaceC79900VXk interfaceC79900VXk = textureViewSurfaceTextureListenerC88419Yn1.LJLJJLL;
                    EGL10 egl102 = this.LIZIZ;
                    EGLDisplay eGLDisplay = this.LIZJ;
                    AbstractC88424Yn6 abstractC88424Yn6 = (AbstractC88424Yn6) interfaceC79900VXk;
                    int[] iArr = new int[1];
                    if (!egl102.eglChooseConfig(eGLDisplay, abstractC88424Yn6.LIZ, null, 0, iArr)) {
                        TextureViewSurfaceTextureListenerC88419Yn1 textureViewSurfaceTextureListenerC88419Yn12 = abstractC88424Yn6.LIZIZ;
                        String stackTraceString = android.util.Log.getStackTraceString(new IllegalArgumentException("eglChooseConfig failed"));
                        IMonitor iMonitor = textureViewSurfaceTextureListenerC88419Yn12.LJLIL;
                        if (iMonitor != null) {
                            iMonitor.monitor(false, "unknown", 0, 0, stackTraceString);
                        }
                        throw new IllegalArgumentException("eglChooseConfig failed");
                    }
                    int i = iArr[0];
                    if (i > 0) {
                        EGLConfig[] eGLConfigArr = new EGLConfig[i];
                        if (egl102.eglChooseConfig(eGLDisplay, abstractC88424Yn6.LIZ, eGLConfigArr, i, iArr)) {
                            C88423Yn5 c88423Yn5 = (C88423Yn5) abstractC88424Yn6;
                            int i2 = 0;
                            while (true) {
                                EGLConfig eGLConfig = eGLConfigArr[i2];
                                int LIZ = c88423Yn5.LIZ(egl102, eGLDisplay, eGLConfig, 12325);
                                int LIZ2 = c88423Yn5.LIZ(egl102, eGLDisplay, eGLConfig, 12326);
                                if (LIZ >= c88423Yn5.LJII && LIZ2 >= c88423Yn5.LJIIIIZZ) {
                                    int LIZ3 = c88423Yn5.LIZ(egl102, eGLDisplay, eGLConfig, 12324);
                                    int LIZ4 = c88423Yn5.LIZ(egl102, eGLDisplay, eGLConfig, 12323);
                                    int LIZ5 = c88423Yn5.LIZ(egl102, eGLDisplay, eGLConfig, 12322);
                                    int LIZ6 = c88423Yn5.LIZ(egl102, eGLDisplay, eGLConfig, 12321);
                                    if (LIZ3 == c88423Yn5.LIZLLL && LIZ4 == c88423Yn5.LJ && LIZ5 == c88423Yn5.LJFF && LIZ6 == c88423Yn5.LJI) {
                                        if (eGLConfig != null) {
                                            this.LJ = eGLConfig;
                                            InterfaceC88427Yn9 interfaceC88427Yn9 = textureViewSurfaceTextureListenerC88419Yn1.LJLJL;
                                            EGL10 egl103 = this.LIZIZ;
                                            EGLDisplay eGLDisplay2 = this.LIZJ;
                                            C88425Yn7 c88425Yn7 = (C88425Yn7) interfaceC88427Yn9;
                                            c88425Yn7.getClass();
                                            int i3 = c88425Yn7.LIZ.LJLL;
                                            int[] iArr2 = {12440, i3, 12344};
                                            EGLContext eGLContext = EGL10.EGL_NO_CONTEXT;
                                            if (i3 == 0) {
                                                iArr2 = null;
                                            }
                                            this.LJFF = egl103.eglCreateContext(eGLDisplay2, eGLConfig, eGLContext, iArr2);
                                        }
                                    }
                                }
                                i2++;
                                if (i2 >= i) {
                                    break;
                                }
                            }
                            throw new IllegalArgumentException("No config chosen");
                        }
                        throw new IllegalArgumentException("eglChooseConfig#2 failed");
                    }
                    throw new IllegalArgumentException("No configs match configSpec");
                }
                EGLContext eGLContext2 = this.LJFF;
                if (eGLContext2 == null || eGLContext2 == EGL10.EGL_NO_CONTEXT) {
                    this.LJFF = null;
                    int eglGetError = this.LIZIZ.eglGetError();
                    StringBuilder LIZ7 = X1D.LIZ();
                    LIZ7.append("createContext");
                    LIZ7.append(" failed: ");
                    LIZ7.append(eglGetError);
                    X1D.LIZIZ(LIZ7);
                }
                this.LIZLLL = null;
                return;
            }
            throw new RuntimeException("eglInitialize failed");
        }
        throw new RuntimeException("eglGetDisplay failed");
    }

    public C88420Yn2(WeakReference<TextureViewSurfaceTextureListenerC88419Yn1> weakReference) {
        this.LIZ = weakReference;
    }
}
