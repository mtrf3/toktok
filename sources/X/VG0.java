package X;

import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLUtils;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes15.dex */
public abstract class VG0 implements Handler.Callback {
    public EGLConfig LJLIL;
    public EGLContext LJLILLLLZI;
    public EGLDisplay LJLJI;
    public EGLSurface LJLJJI;
    public final C48265Iwv LJLJJL;
    public final HandlerThread LJLJJLL;
    public volatile HandlerC79447VFz LJLJL;
    public volatile int LJLJLLL;
    public String LJLL;
    public final VG2 LJLLILLLL;
    public C79422VFa LJLLJ;
    public final List<C79445VFx> LJLLL;
    public final Object LJLLLL;
    public long LJLLLLLL;
    public final int LJLZ;
    public final C48262Iws LJZ;
    public final C48262Iws LJZI;
    public final Object LJLJLJ = new Object();
    public final float[] LJLLI = {-1.0f, -1.0f, 1.0f, -1.0f, 1.0f, 1.0f, -1.0f, 1.0f};

    public abstract void LIZJ();

    public abstract void LIZLLL();

    public final VGC LJFF() {
        try {
            Message obtainMessage = this.LJLJL.obtainMessage(9);
            Message message = new Message();
            obtainMessage.obj = message;
            try {
                synchronized (message) {
                    this.LJLJL.sendMessageAtFrontOfQueue(obtainMessage);
                    message.wait(1000L);
                }
                if (message.obj == null) {
                    if (this.LJLJL.hasMessages(9)) {
                        this.LJLL = "The handler is busy for other operation timeout";
                    } else {
                        this.LJLL = "Try modify the wait timeOut";
                    }
                }
                return (VGC) message.obj;
            } catch (Exception e) {
                int i = this.LJLZ;
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("texture render may exit, error:");
                LIZ.append(e.toString());
                C48284IxE.LIZ(6, i, "TextureRenderer", X1D.LIZIZ(LIZ));
                return null;
            }
        } catch (Exception unused) {
            C48284IxE.LIZ(2, this.LJLZ, "TextureRenderer", "texture render already exit");
            return null;
        }
    }

    public abstract void LJII(Message message);

    public abstract void LJIIIIZZ(Message message);

    public abstract void LJIIJ(Message message);

    public abstract void LJIIJJI();

    public final void LIZIZ() {
        if (this.LJLJL != null) {
            C48262Iws c48262Iws = this.LJZ;
            if ((c48262Iws.LIZ || c48262Iws.LIZIZ || c48262Iws.LIZ(14)) && (this.LJLZ & 4) == 0) {
                return;
            }
            int i = this.LJLZ;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("renderer =");
            LIZ.append(this);
            LIZ.append(", check expired");
            C48284IxE.LIZ(2, i, "TextureRenderer", X1D.LIZIZ(LIZ));
            synchronized (this.LJLLL) {
                if (this.LJLJL.hasMessages(8) || this.LJLJL.hasMessages(9)) {
                    C48284IxE.LIZ(2, this.LJLZ, "TextureRenderer", "renderer is excuting");
                    this.LJLJL.sendEmptyMessageDelayed(11, 120000L);
                    return;
                }
                if (((ArrayList) this.LJLLL).size() == 0) {
                    C48284IxE.LIZ(2, this.LJLZ, "TextureRenderer", "renderer is expired");
                    LJIILJJIL();
                    return;
                }
                Iterator it = ((ArrayList) this.LJLLL).iterator();
                while (it.hasNext()) {
                    C79445VFx c79445VFx = (C79445VFx) it.next();
                    if (!c79445VFx.isRelease() && (c79445VFx.isAlive() || !c79445VFx.couldForceRelease())) {
                        int i2 = this.LJLZ;
                        StringBuilder LIZ2 = X1D.LIZ();
                        LIZ2.append("a texture is still working ");
                        LIZ2.append(c79445VFx);
                        C48284IxE.LIZ(2, i2, "TextureRenderer", X1D.LIZIZ(LIZ2));
                        this.LJLJL.sendEmptyMessageDelayed(11, 120000L);
                        return;
                    }
                }
                C48284IxE.LIZ(2, this.LJLZ, "TextureRenderer", "non live texture , renderer is expired");
                LJIILJJIL();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0035, code lost:
    
        if (r5.canReuse(android.os.Looper.myLooper()) == false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0037, code lost:
    
        X.C48284IxE.LIZ(2, r10.LJLZ, "TextureRenderer", "same looper reuse texture");
        r5.pause(false, false);
        r5.getOffScreenSurface();
        r5.setFrameRenderChecker(r10.LJLJJL);
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00d2, code lost:
    
        return null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.ss.texturerender.VideoSurface LJ() {
        /*
            r10 = this;
            int r1 = r10.LJLJLLL
            r0 = 1
            r9 = 0
            if (r1 >= r0) goto L7
            return r9
        L7:
            java.util.List<X.VFx> r4 = r10.LJLLL
            monitor-enter(r4)
            java.util.List<X.VFx> r0 = r10.LJLLL     // Catch: java.lang.Throwable -> Ld3
            java.util.ArrayList r0 = (java.util.ArrayList) r0     // Catch: java.lang.Throwable -> Ld3
            java.util.Iterator r8 = r0.iterator()     // Catch: java.lang.Throwable -> Ld3
        L12:
            r5 = r9
        L13:
            boolean r0 = r8.hasNext()     // Catch: java.lang.Throwable -> Ld3
            if (r0 == 0) goto L8d
            java.lang.Object r5 = r8.next()     // Catch: java.lang.Throwable -> Ld3
            X.VFx r5 = (X.C79445VFx) r5     // Catch: java.lang.Throwable -> Ld3
            boolean r0 = r5.isRelease()     // Catch: java.lang.Throwable -> Ld3
            r6 = 2
            if (r0 != 0) goto L4e
            boolean r0 = r5.isAlive()     // Catch: java.lang.Throwable -> Ld3
            if (r0 != 0) goto L4e
            android.os.Looper r0 = android.os.Looper.myLooper()     // Catch: java.lang.Throwable -> Ld3
            boolean r0 = r5.canReuse(r0)     // Catch: java.lang.Throwable -> Ld3
            r7 = 0
            if (r0 == 0) goto L6f
            int r2 = r10.LJLZ     // Catch: java.lang.Throwable -> Ld3
            java.lang.String r1 = "TextureRenderer"
            java.lang.String r0 = "same looper reuse texture"
            X.C48284IxE.LIZ(r6, r2, r1, r0)     // Catch: java.lang.Throwable -> Ld3
            r5.pause(r7, r7)     // Catch: java.lang.Throwable -> Ld3
            r5.getOffScreenSurface()     // Catch: java.lang.Throwable -> Ld3
            X.Iwv r0 = r10.LJLJJL     // Catch: java.lang.Throwable -> Ld3
            r5.setFrameRenderChecker(r0)     // Catch: java.lang.Throwable -> Ld3
            monitor-exit(r4)     // Catch: java.lang.Throwable -> Ld3
            goto Lcd
        L4e:
            X.Iws r1 = r10.LJZ     // Catch: java.lang.Throwable -> Ld3
            boolean r0 = r1.LIZ     // Catch: java.lang.Throwable -> Ld3
            if (r0 != 0) goto L13
            boolean r0 = r1.LIZIZ     // Catch: java.lang.Throwable -> Ld3
            if (r0 != 0) goto L13
            r0 = 14
            boolean r0 = r1.LIZ(r0)     // Catch: java.lang.Throwable -> Ld3
            if (r0 != 0) goto L13
            int r2 = r10.LJLZ     // Catch: java.lang.Throwable -> Ld3
            r0 = r2 & 4
            if (r0 != 0) goto L13
            java.lang.String r1 = "TextureRenderer"
            java.lang.String r0 = "still living"
            X.C48284IxE.LIZ(r6, r2, r1, r0)     // Catch: java.lang.Throwable -> Ld3
            monitor-exit(r4)     // Catch: java.lang.Throwable -> Ld3
            goto Ld2
        L6f:
            int r3 = r10.LJLZ     // Catch: java.lang.Throwable -> Ld3
            java.lang.String r2 = "TextureRenderer"
            java.lang.StringBuilder r1 = X.X1D.LIZ()     // Catch: java.lang.Throwable -> Ld3
            java.lang.String r0 = "can't reuse, delete = "
            r1.append(r0)     // Catch: java.lang.Throwable -> Ld3
            r1.append(r5)     // Catch: java.lang.Throwable -> Ld3
            java.lang.String r0 = X.X1D.LIZIZ(r1)     // Catch: java.lang.Throwable -> Ld3
            X.C48284IxE.LIZ(r6, r3, r2, r0)     // Catch: java.lang.Throwable -> Ld3
            r5.release(r7)     // Catch: java.lang.Throwable -> Ld3
            r8.remove()     // Catch: java.lang.Throwable -> Ld3
            goto L12
        L8d:
            X.VGC r3 = r10.LJFF()     // Catch: java.lang.Throwable -> Ld3
            if (r3 == 0) goto Lbd
            X.VFx r5 = new X.VFx     // Catch: java.lang.Throwable -> Ld3
            X.VFz r0 = r10.LJLJL     // Catch: java.lang.Throwable -> Ld3
            r5.<init>(r3, r0, r10)     // Catch: java.lang.Throwable -> Ld3
            int r1 = r10.LJLZ     // Catch: java.lang.Throwable -> Ld3
            r0 = 5
            r5.setOption(r0, r1)     // Catch: java.lang.Throwable -> Ld3
            android.opengl.EGLContext r2 = r10.LJLILLLLZI     // Catch: java.lang.Throwable -> Ld3
            android.opengl.EGLDisplay r1 = r10.LJLJI     // Catch: java.lang.Throwable -> Ld3
            android.opengl.EGLConfig r0 = r10.LJLIL     // Catch: java.lang.Throwable -> Ld3
            r5.bindEGLEnv(r2, r1, r0)     // Catch: java.lang.Throwable -> Ld3
            r3.LIZJ()     // Catch: java.lang.Throwable -> Ld3
            r5.getOffScreenSurface()     // Catch: java.lang.Throwable -> Ld3
            X.Iwv r0 = r10.LJLJJL     // Catch: java.lang.Throwable -> Ld3
            r5.setFrameRenderChecker(r0)     // Catch: java.lang.Throwable -> Ld3
            java.util.List<X.VFx> r0 = r10.LJLLL     // Catch: java.lang.Throwable -> Ld3
            java.util.ArrayList r0 = (java.util.ArrayList) r0     // Catch: java.lang.Throwable -> Ld3
            r0.add(r5)     // Catch: java.lang.Throwable -> Ld3
        Lbb:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> Ld3
            goto Lcd
        Lbd:
            if (r5 == 0) goto Lcb
            boolean r0 = r5.isRelease()     // Catch: java.lang.Throwable -> Ld3
            if (r0 != 0) goto Lcb
            boolean r0 = r5.isAlive()     // Catch: java.lang.Throwable -> Ld3
            if (r0 == 0) goto Lbb
        Lcb:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> Ld3
            goto Ld2
        Lcd:
            com.ss.texturerender.VideoSurface r0 = r5.getOffScreenSurface()
            return r0
        Ld2:
            return r9
        Ld3:
            r0 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> Ld3
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.VG0.LJ():com.ss.texturerender.VideoSurface");
    }

    public final void LJI() {
        int i = this.LJLZ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(this);
        LIZ.append("deinit");
        C48284IxE.LIZ(2, i, "TextureRenderer", X1D.LIZIZ(LIZ));
        LIZ(0, true);
        LIZJ();
        synchronized (this.LJLLL) {
            if (((ArrayList) this.LJLLL).size() > 0) {
                Iterator it = ((ArrayList) this.LJLLL).iterator();
                while (it.hasNext()) {
                    ((C79445VFx) it.next()).release(true);
                    it.remove();
                }
            }
            int i2 = this.LJLZ;
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("delete textures : ");
            LIZ2.append(((ArrayList) this.LJLLL).size());
            C48284IxE.LIZ(2, i2, "TextureRenderer", X1D.LIZIZ(LIZ2));
            this.LJLLILLLL.LIZJ();
        }
        LIZLLL();
        EGLDisplay eGLDisplay = this.LJLJI;
        if (eGLDisplay != EGL14.EGL_NO_DISPLAY) {
            EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
            EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            EGLSurface eGLSurface2 = this.LJLJJI;
            if (eGLSurface2 != EGL14.EGL_NO_SURFACE) {
                EGL14.eglDestroySurface(this.LJLJI, eGLSurface2);
                this.LJLJJI = EGL14.EGL_NO_SURFACE;
            }
            EGLContext eGLContext = this.LJLILLLLZI;
            if (eGLContext != EGL14.EGL_NO_CONTEXT) {
                EGL14.eglDestroyContext(this.LJLJI, eGLContext);
                this.LJLILLLLZI = EGL14.EGL_NO_CONTEXT;
            }
            EGL14.eglTerminate(this.LJLJI);
            this.LJLJI = EGL14.EGL_NO_DISPLAY;
            int i3 = this.LJLZ;
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append(this);
            LIZ3.append("OpenGL deinit OK.");
            C48284IxE.LIZ(2, i3, "TextureRenderer", X1D.LIZIZ(LIZ3));
        }
        this.LJLJL = null;
        int i4 = this.LJLZ;
        StringBuilder LIZ4 = X1D.LIZ();
        LIZ4.append(this);
        LIZ4.append("deinit done");
        C48284IxE.LIZ(2, i4, "TextureRenderer", X1D.LIZIZ(LIZ4));
    }

    public void LJIILJJIL() {
        int i = this.LJLZ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(this);
        LIZ.append("call release");
        C48284IxE.LIZ(2, i, "TextureRenderer", X1D.LIZIZ(LIZ));
        synchronized (this) {
            if (this.LJLJLLL == 0 || this.LJLJL == null) {
                int i2 = this.LJLZ;
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append(this);
                LIZ2.append("release return");
                C48284IxE.LIZ(2, i2, "TextureRenderer", X1D.LIZIZ(LIZ2));
                return;
            }
            int i3 = this.LJLZ;
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append(this);
            LIZ3.append("send deinit");
            C48284IxE.LIZ(2, i3, "TextureRenderer", X1D.LIZIZ(LIZ3));
            this.LJLJL.sendEmptyMessage(3);
            try {
                this.LJLJJLL.quitSafely();
            } catch (Exception unused) {
            }
            C48284IxE.LIZ(2, this.LJLZ, "TextureRenderer", this + "call release end");
        }
    }

    public final void LJIIIZ(Message message) {
        message.obj = this.LJLLILLLL.LIZ(36197, this.LJLZ);
        synchronized (message) {
            message.notify();
        }
    }

    public final void LJIIL(Message message) {
        if (message != null) {
            synchronized (message) {
                message.arg1 = this.LJLJLLL;
                message.notify();
            }
        }
    }

    public final void LJIILIIL(String str) {
        synchronized (this.LJLJLJ) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(str);
            LIZ.append(", reason = ");
            LIZ.append(GLUtils.getEGLErrorString(EGL14.eglGetError()));
            this.LJLL = X1D.LIZIZ(LIZ);
            LIZ(-1, false);
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i = message.what;
        if (i == 6 || i == 7 || i != 8) {
            return true;
        }
        int i2 = message.arg1;
        C79445VFx c79445VFx = (C79445VFx) message.obj;
        if (c79445VFx == null) {
            return true;
        }
        c79445VFx.notifyRenderFrame(i2);
        return true;
    }

    public VG0(C48262Iws c48262Iws, int i) {
        Object obj = new Object();
        this.LJLLLL = obj;
        int i2 = this.LJLZ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("version :3.46.12 config:");
        LIZ.append(c48262Iws);
        LIZ.append(" type:");
        LIZ.append(i);
        C48284IxE.LIZ(2, i2, "TextureRenderer", X1D.LIZIZ(LIZ));
        this.LJLJLLL = 0;
        this.LJLL = null;
        this.LJLJJI = EGL14.EGL_NO_SURFACE;
        this.LJLILLLLZI = EGL14.EGL_NO_CONTEXT;
        this.LJLJI = EGL14.EGL_NO_DISPLAY;
        this.LJLLLLLL = 0L;
        this.LJZ = new C48262Iws(i);
        this.LJZI = c48262Iws;
        this.LJLZ = i;
        this.LJLLILLLL = new VG2(this);
        this.LJLLL = new ArrayList();
        HandlerThread handlerThread = new HandlerThread(KMP.LJ("TRThread_", i));
        this.LJLJJLL = handlerThread;
        handlerThread.start();
        this.LJLJL = new HandlerC79447VFz(this, handlerThread.getLooper());
        this.LJLJJL = new C48265Iwv(i, this.LJLJL);
        Message obtainMessage = this.LJLJL.obtainMessage(1);
        obtainMessage.obj = obj;
        synchronized (obj) {
            obtainMessage.sendToTarget();
            try {
                obj.wait(1000L);
            } catch (InterruptedException unused) {
                throw new RuntimeException("EGL initial timeout");
            }
        }
        this.LJLJL.sendMessageDelayed(this.LJLJL.obtainMessage(11), 120000L);
        C48284IxE.LIZ(2, i, "TextureRenderer", "construct done");
    }

    public final void LIZ(int i, boolean z) {
        if (this.LJLJLLL == i) {
            return;
        }
        if (this.LJLJLLL == -1 && i != 0) {
            return;
        }
        int i2 = this.LJLZ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("state change from ");
        LIZ.append(this.LJLJLLL);
        LIZ.append(" to ");
        LIZ.append(i);
        C48284IxE.LIZ(2, i2, "TextureRenderer", X1D.LIZIZ(LIZ));
        this.LJLJLLL = i;
        if (!z) {
            return;
        }
        synchronized (this.LJLJLJ) {
        }
    }
}
