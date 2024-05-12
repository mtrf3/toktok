package X;

import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES30;
import android.os.HandlerThread;
import android.view.Surface;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.IntBuffer;

/* loaded from: classes15.dex */
public final class VGI implements SurfaceTexture.OnFrameAvailableListener {
    public final /* synthetic */ VGK LJLIL;
    public final /* synthetic */ int LJLILLLLZI;
    public final /* synthetic */ int LJLJI;

    public VGI(VGK vgk, int i, int i2) {
        this.LJLIL = vgk;
        this.LJLILLLLZI = i;
        this.LJLJI = i2;
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        SurfaceTexture surfaceTexture2 = this.LJLIL.LJFF;
        if (surfaceTexture2 != null) {
            surfaceTexture2.updateTexImage();
        }
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(this.LJLILLLLZI * this.LJLJI * 4);
        allocateDirect.order(ByteOrder.LITTLE_ENDIAN);
        VGJ vgj = this.LJLIL.LJII;
        if (vgj != null) {
            VGL vgl = new VGL(this.LJLILLLLZI, this.LJLJI, allocateDirect);
            int[] iArr = new int[4];
            GLES30.glGetIntegerv(2978, iArr, 0);
            GLES30.glViewport(0, 0, vgj.LIZ, vgj.LIZIZ);
            GLES30.glBindFramebuffer(36160, vgj.LJFF);
            GLES30.glFramebufferTexture2D(36160, 36064, 3553, vgj.LIZLLL, 0);
            GLES30.glClearColor(1.0f, 1.0f, 1.0f, 0.0f);
            GLES30.glClear(16384);
            GLES30.glUseProgram(vgj.LJ);
            GLES30.glBindBuffer(34962, vgj.LJI);
            GLES30.glBufferData(34962, 32, vgj.LJIIJJI, 35044);
            GLES30.glEnableVertexAttribArray(vgj.LJIIIIZZ);
            GLES30.glVertexAttribPointer(vgj.LJIIIIZZ, 2, 5126, false, 8, 0);
            GLES30.glBindBuffer(34962, vgj.LJII);
            GLES30.glBufferData(34962, 32, vgj.LJIIL, 35044);
            GLES30.glEnableVertexAttribArray(vgj.LJIIIZ);
            GLES30.glVertexAttribPointer(vgj.LJIIIZ, 2, 5126, false, 8, 0);
            GLES30.glActiveTexture(33984);
            GLES30.glBindTexture(36197, vgj.LIZJ);
            GLES30.glUniform1i(vgj.LJIIJ, 0);
            GLES30.glDrawArrays(5, 0, 4);
            vgl.invoke();
            GLES30.glBindTexture(36197, 0);
            GLES30.glBindFramebuffer(36160, 0);
            GLES30.glViewport(iArr[0], iArr[1], iArr[2], iArr[3]);
        }
        allocateDirect.rewind();
        Bitmap createBitmap = Bitmap.createBitmap(this.LJLILLLLZI, this.LJLJI, Bitmap.Config.ARGB_8888);
        createBitmap.copyPixelsFromBuffer(allocateDirect);
        InterfaceC88472Yns<? super Bitmap, C76800UCe> interfaceC88472Yns = this.LJLIL.LJIIIIZZ;
        if (interfaceC88472Yns != null) {
            interfaceC88472Yns.invoke(createBitmap);
        }
        VGK vgk = this.LJLIL;
        vgk.LJIIIIZZ = null;
        Surface surface = vgk.LJI;
        if (surface != null) {
            surface.release();
        }
        SurfaceTexture surfaceTexture3 = this.LJLIL.LJFF;
        if (surfaceTexture3 != null) {
            surfaceTexture3.release();
        }
        VGJ vgj2 = this.LJLIL.LJII;
        if (vgj2 != null) {
            GLES30.glBindFramebuffer(36160, 0);
            GLES30.glFramebufferTexture2D(36160, 36064, 3553, 0, 0);
            GLES30.glBindFramebuffer(36160, 0);
            GLES30.glDeleteFramebuffers(0, new int[]{vgj2.LJFF}, 0);
            GLES30.glDeleteProgram(vgj2.LJ);
            GLES30.glDeleteBuffers(2, new int[]{vgj2.LJI, vgj2.LJII}, 0);
        }
        GLES30.glDeleteTextures(1, IntBuffer.wrap(new int[]{this.LJLIL.LIZLLL}));
        GLES30.glDeleteTextures(1, IntBuffer.wrap(new int[]{this.LJLIL.LJ}));
        VGG vgg = this.LJLIL.LIZJ;
        if (vgg != null) {
            EGLDisplay eGLDisplay = vgg.LIZ;
            if (eGLDisplay != EGL14.EGL_NO_DISPLAY) {
                EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
                EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
                EGL14.eglDestroySurface(vgg.LIZ, vgg.LIZJ);
                EGL14.eglDestroyContext(vgg.LIZ, vgg.LIZIZ);
                EGL14.eglReleaseThread();
                EGL14.eglTerminate(vgg.LIZ);
            }
            vgg.LIZJ = EGL14.EGL_NO_SURFACE;
            vgg.LIZ = EGL14.EGL_NO_DISPLAY;
            vgg.LIZIZ = EGL14.EGL_NO_CONTEXT;
            vgg.LIZLLL = null;
        }
        HandlerThread handlerThread = this.LJLIL.LJIIJ;
        if (handlerThread != null) {
            handlerThread.quit();
        }
    }
}
