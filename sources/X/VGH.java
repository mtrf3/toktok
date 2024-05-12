package X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES30;
import android.view.Surface;
import android.view.View;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class VGH implements Runnable {
    public final /* synthetic */ VGK LJLIL;
    public final /* synthetic */ int LJLILLLLZI;
    public final /* synthetic */ int LJLJI;
    public final /* synthetic */ InterfaceC88472Yns<Bitmap, C76800UCe> LJLJJI;
    public final /* synthetic */ int LJLJJL;
    public final /* synthetic */ int LJLJJLL;
    public final /* synthetic */ View LJLJL;

    /* JADX WARN: Multi-variable type inference failed */
    public VGH(VGK vgk, int i, int i2, InterfaceC88472Yns<? super Bitmap, C76800UCe> interfaceC88472Yns, int i3, int i4, View view) {
        this.LJLIL = vgk;
        this.LJLILLLLZI = i;
        this.LJLJI = i2;
        this.LJLJJI = interfaceC88472Yns;
        this.LJLJJL = i3;
        this.LJLJJLL = i4;
        this.LJLJL = view;
    }

    public final void LIZ() {
        Canvas canvas;
        this.LJLIL.LIZJ = new VGG();
        VGG vgg = this.LJLIL.LIZJ;
        if (vgg != null) {
            int i = this.LJLILLLLZI;
            int i2 = this.LJLJI;
            EGLContext EGL_NO_CONTEXT = EGL14.EGL_NO_CONTEXT;
            o.LJIIIIZZ(EGL_NO_CONTEXT, "EGL_NO_CONTEXT");
            EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
            if (!o.LJ(eglGetDisplay, EGL14.EGL_NO_DISPLAY)) {
                vgg.LIZ = eglGetDisplay;
                int[] iArr = new int[2];
                if (EGL14.eglInitialize(eglGetDisplay, iArr, 0, iArr, 1)) {
                    EGLConfig[] eGLConfigArr = new EGLConfig[1];
                    if (EGL14.eglChooseConfig(eglGetDisplay, new int[]{12352, 4, 12339, 1, 12344}, 0, eGLConfigArr, 0, 1, new int[1], 0)) {
                        EGLConfig eGLConfig = eGLConfigArr[0];
                        vgg.LIZLLL = eGLConfig;
                        EGLContext eglCreateContext = EGL14.eglCreateContext(eglGetDisplay, eGLConfig, EGL_NO_CONTEXT, new int[]{12440, 3, 12344}, 0);
                        if (EGL14.eglGetError() == 12288) {
                            vgg.LIZIZ = eglCreateContext;
                            EGLSurface eglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(vgg.LIZ, vgg.LIZLLL, new int[]{12375, i, 12374, i2, 12344}, 0);
                            if (eglCreatePbufferSurface == null) {
                                eglCreatePbufferSurface = EGL14.EGL_NO_SURFACE;
                            }
                            vgg.LIZJ = eglCreatePbufferSurface;
                            EGL14.eglMakeCurrent(eglGetDisplay, eglCreatePbufferSurface, eglCreatePbufferSurface, eglCreateContext);
                        }
                    }
                }
            }
        }
        this.LJLIL.LJ = VGM.LIZ(3553);
        GLES30.glTexImage2D(3553, 0, 6408, this.LJLILLLLZI, this.LJLJI, 0, 6408, 5121, null);
        this.LJLIL.LIZLLL = VGM.LIZ(36197);
        VGK vgk = this.LJLIL;
        vgk.LJII = new VGJ(this.LJLILLLLZI, this.LJLJI, vgk.LIZLLL, vgk.LJ);
        this.LJLIL.LJFF = new SurfaceTexture(this.LJLIL.LIZLLL);
        SurfaceTexture surfaceTexture = this.LJLIL.LJFF;
        if (surfaceTexture != null) {
            surfaceTexture.setDefaultBufferSize(this.LJLILLLLZI, this.LJLJI);
        }
        VGK vgk2 = this.LJLIL;
        SurfaceTexture surfaceTexture2 = vgk2.LJFF;
        if (surfaceTexture2 != null) {
            surfaceTexture2.setOnFrameAvailableListener(new VGI(vgk2, this.LJLILLLLZI, this.LJLJI));
        }
        this.LJLIL.LJI = new Surface(this.LJLIL.LJFF);
        VGK vgk3 = this.LJLIL;
        vgk3.LJIIIIZZ = this.LJLJJI;
        Surface surface = vgk3.LJI;
        if (surface != null) {
            canvas = surface.lockHardwareCanvas();
            if (canvas != null) {
                canvas.translate(-this.LJLJJL, -this.LJLJJLL);
            }
        } else {
            canvas = null;
        }
        this.LJLJL.draw(canvas);
        Surface surface2 = this.LJLIL.LJI;
        if (surface2 != null) {
            surface2.unlockCanvasAndPost(canvas);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            LIZ();
        } finally {
            if (LIZ) {
            }
        }
    }
}
