package X;

import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import com.ss.ttm.player.DummySurface;
import java.util.Locale;

/* loaded from: classes12.dex */
public class P4X extends HandlerThread implements Handler.Callback {
    public P4Y LJLIL;
    public Handler LJLILLLLZI;
    public Error LJLJI;
    public RuntimeException LJLJJI;
    public DummySurface LJLJJL;

    public P4X() {
        super("dummySurface");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LIZIZ() {
        P4Y p4y = this.LJLIL;
        if (p4y != null) {
            p4y.LJLIL.removeCallbacks(p4y);
            try {
                SurfaceTexture surfaceTexture = p4y.LJLJJLL;
                if (surfaceTexture != null) {
                    surfaceTexture.release();
                    GLES20.glDeleteTextures(1, p4y.LJLILLLLZI, 0);
                }
                return;
            } finally {
                EGLDisplay eGLDisplay = p4y.LJLJI;
                if (eGLDisplay != null && !eGLDisplay.equals(EGL14.EGL_NO_DISPLAY)) {
                    EGLDisplay eGLDisplay2 = p4y.LJLJI;
                    EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
                    EGL14.eglMakeCurrent(eGLDisplay2, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
                }
                EGLSurface eGLSurface2 = p4y.LJLJJL;
                if (eGLSurface2 != null && !eGLSurface2.equals(EGL14.EGL_NO_SURFACE)) {
                    EGL14.eglDestroySurface(p4y.LJLJI, p4y.LJLJJL);
                }
                EGLContext eGLContext = p4y.LJLJJI;
                if (eGLContext != null) {
                    EGL14.eglDestroyContext(p4y.LJLJI, eGLContext);
                }
                EGL14.eglReleaseThread();
                p4y.LJLJI = null;
                p4y.LJLJJI = null;
                p4y.LJLJJL = null;
                p4y.LJLJJLL = null;
            }
        }
        throw null;
    }

    public final void LIZ(int i) {
        EGLConfig eGLConfig;
        int[] iArr;
        int[] iArr2;
        EGLSurface eglCreatePbufferSurface;
        P4Y p4y = this.LJLIL;
        p4y.getClass();
        boolean z = false;
        EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
        if (eglGetDisplay != null) {
            int[] iArr3 = new int[2];
            if (EGL14.eglInitialize(eglGetDisplay, iArr3, 0, iArr3, 1)) {
                p4y.LJLJI = eglGetDisplay;
                EGLConfig[] eGLConfigArr = new EGLConfig[1];
                int[] iArr4 = new int[1];
                boolean eglChooseConfig = EGL14.eglChooseConfig(eglGetDisplay, P4Y.LJLJL, 0, eGLConfigArr, 0, 1, iArr4, 0);
                if (eglChooseConfig && iArr4[0] > 0 && (eGLConfig = eGLConfigArr[0]) != null) {
                    EGLDisplay eGLDisplay = p4y.LJLJI;
                    if (i == 0) {
                        iArr = new int[]{12440, 2, 12344};
                    } else {
                        iArr = new int[]{12440, 2, 12992, 1, 12344};
                    }
                    EGLContext eglCreateContext = EGL14.eglCreateContext(eGLDisplay, eGLConfig, EGL14.EGL_NO_CONTEXT, iArr, 0);
                    if (eglCreateContext != null) {
                        p4y.LJLJJI = eglCreateContext;
                        EGLDisplay eGLDisplay2 = p4y.LJLJI;
                        if (i == 1) {
                            eglCreatePbufferSurface = EGL14.EGL_NO_SURFACE;
                        } else {
                            if (i == 2) {
                                iArr2 = new int[]{12375, 1, 12374, 1, 12992, 1, 12344};
                            } else {
                                iArr2 = new int[]{12375, 1, 12374, 1, 12344};
                            }
                            eglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eGLDisplay2, eGLConfig, iArr2, 0);
                            if (eglCreatePbufferSurface == null) {
                                throw new P4Z("eglCreatePbufferSurface failed");
                            }
                        }
                        if (EGL14.eglMakeCurrent(eGLDisplay2, eglCreatePbufferSurface, eglCreatePbufferSurface, eglCreateContext)) {
                            p4y.LJLJJL = eglCreatePbufferSurface;
                            GLES20.glGenTextures(1, p4y.LJLILLLLZI, 0);
                            int glGetError = GLES20.glGetError();
                            if (glGetError == 0) {
                                SurfaceTexture surfaceTexture = new SurfaceTexture(p4y.LJLILLLLZI[0]);
                                p4y.LJLJJLL = surfaceTexture;
                                surfaceTexture.setOnFrameAvailableListener(p4y);
                                SurfaceTexture surfaceTexture2 = this.LJLIL.LJLJJLL;
                                surfaceTexture2.getClass();
                                if (i != 0) {
                                    z = true;
                                }
                                this.LJLJJL = new DummySurface(this, surfaceTexture2, z);
                                return;
                            }
                            StringBuilder LIZ = X1D.LIZ();
                            LIZ.append("glGenTextures failed. Error: ");
                            LIZ.append(Integer.toHexString(glGetError));
                            throw new P4Z(X1D.LIZIZ(LIZ));
                        }
                        throw new P4Z("eglMakeCurrent failed");
                    }
                    throw new P4Z("eglCreateContext failed");
                }
                throw new P4Z(C16880lQ.LLLZI(Locale.US, "eglChooseConfig failed: success=%b, numConfigs[0]=%d, configs[0]=%s", new Object[]{Boolean.valueOf(eglChooseConfig), Integer.valueOf(iArr4[0]), eGLConfigArr[0]}));
            }
            throw new P4Z("eglInitialize failed");
        }
        throw new P4Z("eglGetDisplay failed");
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i = message.what;
        try {
            if (i != 1) {
                if (i != 2) {
                    return true;
                }
                try {
                    LIZIZ();
                } catch (Throwable unused) {
                }
                quit();
                return true;
            }
            try {
                LIZ(message.arg1);
                synchronized (this) {
                    notify();
                }
            } catch (Error e) {
                this.LJLJI = e;
                synchronized (this) {
                    notify();
                }
            } catch (RuntimeException e2) {
                this.LJLJJI = e2;
                synchronized (this) {
                    notify();
                }
            }
            return true;
        } catch (Throwable th) {
            synchronized (this) {
                notify();
                throw th;
            }
        }
    }
}
