package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.opengl.GLUtils;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Display;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.Surface;
import android.view.WindowManager;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.texturerender.NativeWindow;
import com.ss.texturerender.VideoSurface;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: X.VFx, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C79445VFx extends SurfaceTexture implements Serializable, J2Q {
    public static final int ERROR_SR_EXE_FAIL = 2;
    public static final int ERROR_SR_INIT_FAIL = 1;
    public static final int[] LLJLLL = {480, 540, 544, 576, 576, 576};
    public static final int[] LLJZ = {864, 960, 960, 1024, 648, 1016};
    public final VGC LJLIL;
    public volatile boolean LJLILLLLZI;
    public boolean LJLJI;
    public boolean LJLJJI;
    public EGLSurface LJLJJL;
    public int LJLJJLL;
    public int LJLJL;
    public Surface LJLJLJ;
    public Surface LJLJLLL;
    public VideoSurface LJLL;
    public ReentrantLock LJLLI;
    public Handler LJLLILLLL;
    public int LJLLJ;
    public EGLContext LJLLL;
    public EGLDisplay LJLLLL;
    public EGLConfig LJLLLLLL;
    public long LJLZ;
    public long LJZ;
    public Looper LJZI;
    public Bundle LJZL;
    public long LL;
    public volatile int LLD;
    public CopyOnWriteArrayList<Bundle> LLF;
    public C87400YRw LLFF;
    public int LLFFF;
    public int LLFII;
    public boolean LLFZ;
    public boolean LLI;
    public final HashMap<Surface, EGLSurface> LLIFFJFJJ;
    public long LLII;
    public int LLIIII;
    public final Message LLIIIILZ;
    public int LLIIIJ;
    public int LLIIIL;
    public final VG0 LLIIIZ;
    public final LinkedList<VFZ> LLIIJI;
    public final HashMap<Integer, Integer> LLIIJLIL;
    public Bundle LLIIL;
    public int LLIILII;
    public VG4 LLIILZL;
    public VG5 LLIIZ;
    public int LLIL;
    public double LLILII;
    public double LLILIL;
    public float LLILL;
    public double LLILLIZIL;
    public int LLILLJJLI;
    public final HashMap<Integer, Integer> LLILLL;
    public final HashMap<Integer, Double> LLILZ;
    public final HashMap<Integer, Float> LLILZIL;
    public double LLILZLL;
    public double LLIZ;
    public int LLIZLLLIL;
    public float LLJ;
    public final HashMap<Integer, Integer> LLJI;
    public final HashMap<Integer, String> LLJIJIL;
    public volatile float LLJILJIL;
    public float LLJILJILJ;
    public List<Integer> LLJILLL;
    public int LLJJ;
    public int LLJJI;
    public Bundle LLJJIII;
    public int LLJJIJI;
    public int LLJJIJIIJIL;
    public int LLJJIJIL;
    public NativeWindow LLJJJ;
    public int LLJJJIL;
    public int LLJJJJ;
    public int LLJJJJJIL;
    public Bundle LLJJJJLIIL;
    public Bundle LLJJL;
    public int LLJJLIIIJLLLLLLLZ;
    public int LLJL;
    public int LLJLIL;
    public int LLJLILLLLZIIL;
    public Bundle LLJLL;
    public int LLJLLIL;
    public C48262Iws mConfig;
    public boolean mHasFrameCome;
    public int mHeadposeCallbackIntegral;
    public volatile int mIsMirrorHorizontal;
    public volatile int mIsMirrorVertical;
    public volatile int mLayoutMode;
    public volatile float mLayoutRatio;
    public volatile int mRotationType;
    public VGA mVsyncHelper;

    public synchronized VideoSurface getOffScreenSurface() {
        if (this.LJLILLLLZI) {
            return null;
        }
        if (this.LJLL == null) {
            this.LJLL = new VideoSurface(this);
        }
        this.LL = -9223372036854775807L;
        return this.LJLL;
    }

    public void onFocusLoss() {
        this.LJLJJI = false;
    }

    public void preRender() {
        this.LLFZ = true;
    }

    public synchronized void releaseAllExtraSurface_l() {
        Handler handler = this.LJLLILLLL;
        if (handler != null) {
            Message obtainMessage = handler.obtainMessage(25);
            obtainMessage.arg1 = 3;
            Bundle bundle = new Bundle();
            bundle.putSerializable("texture", this);
            obtainMessage.setData(bundle);
            this.LJLLILLLL.sendMessage(obtainMessage);
        }
    }

    public synchronized void releaseInternal() {
        if (!this.LJLILLLLZI) {
            try {
                lock();
                int i = this.LLIIIJ;
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append(this);
                LIZ.append(" release internal");
                C48284IxE.LIZ(2, i, "VideoSurfaceTexture", X1D.LIZIZ(LIZ));
                this.LJLILLLLZI = true;
                this.LJLIL.LIZJ();
                this.LJLLILLLL = null;
                this.LJZI = null;
                C79422VFa c79422VFa = this.LLIIIZ.LJLLJ;
                while (this.LLIIJI.size() > 0) {
                    VFZ poll = this.LLIIJI.poll();
                    if (c79422VFa != null) {
                        c79422VFa.LIZIZ(poll);
                    } else {
                        C78966Uyw.LJIJ(poll.LIZ);
                    }
                    int i2 = this.LLIIIJ;
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("return fbotex:");
                    LIZ2.append(poll.LIZ);
                    LIZ2.append(",st:");
                    LIZ2.append(this);
                    C48284IxE.LIZ(2, i2, "VideoSurfaceTexture", X1D.LIZIZ(LIZ2));
                }
                int i3 = this.LLIIIJ;
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append(this);
                LIZ3.append(" release internal done");
                C48284IxE.LIZ(2, i3, "VideoSurfaceTexture", X1D.LIZIZ(LIZ3));
                unlock();
            } catch (Throwable th) {
                unlock();
                throw th;
            }
        }
    }

    @Override // android.graphics.SurfaceTexture
    public final void finalize() {
        C48284IxE.LIZ(2, this.LLIIIJ, "VideoSurfaceTexture", "finalize");
        releaseInternal();
        super.finalize();
    }

    public int getViewportHeight() {
        int consumerHeight = getConsumerHeight(this.LJLJJL);
        if (this.LJLJL != consumerHeight) {
            this.LJLJL = consumerHeight;
        }
        return this.LJLJL;
    }

    public int getViewportWidth() {
        int consumerWidth = getConsumerWidth(this.LJLJJL);
        if (this.LJLJJLL != consumerWidth) {
            this.LJLJJLL = consumerWidth;
        }
        return this.LJLJJLL;
    }

    public boolean isAlive() {
        int i = this.LLIIIJ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("is alive = ");
        LIZ.append(this.LJLL);
        LIZ.append(", eglsur = ");
        LIZ.append(this.LJLJJL);
        C48284IxE.LIZ(2, i, "VideoSurfaceTexture", X1D.LIZIZ(LIZ));
        if (this.LJLL != null || this.LJLJJL != EGL14.EGL_NO_SURFACE) {
            return true;
        }
        return false;
    }

    public boolean isMakeCurrent() {
        if (this.LJLJJI && this.LJLJJL != EGL14.EGL_NO_SURFACE) {
            return true;
        }
        return false;
    }

    public void lock() {
        this.LJLLI.lock();
    }

    public boolean makeCurrent() {
        if (makeCurrent(this.LJLJJL)) {
            this.LJLJJI = true;
            return true;
        }
        return false;
    }

    public boolean needDrop() {
        int i;
        long j = this.LLII;
        if (j > 0 && j > getTimestamp() && (i = this.LLIIII) < 5) {
            this.LLIIII = i + 1;
            int i2 = this.LLIIIJ;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("texture");
            LIZ.append(this);
            LIZ.append(" previous play period,drop count:");
            C79062V1e.LJII(LIZ, this.LLIIII, LIZ, 2, i2, "VideoSurfaceTexture");
            return true;
        }
        if (this.LJLJI) {
            int i3 = this.LLIIIJ;
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("texture");
            LIZ2.append(this);
            LIZ2.append(" is paused");
            C48284IxE.LIZ(2, i3, "VideoSurfaceTexture", X1D.LIZIZ(LIZ2));
            return true;
        }
        return false;
    }

    @Override // X.J2Q
    public void notifyVsync() {
        boolean z;
        if (this.mHasFrameCome) {
            if (this.LLJJLIIIJLLLLLLLZ == 1 && C56509MFt.LJIIJJI()) {
                z = true;
            } else {
                z = false;
            }
            sendRenderMsg(1, z);
        }
    }

    @Override // android.graphics.SurfaceTexture
    public void release() {
        C48284IxE.LIZ(2, this.LLIIIJ, "VideoSurfaceTexture", "release");
        releaseInternal();
        super.release();
    }

    public void releaseAllExtraSurface() {
        Iterator<Map.Entry<Surface, EGLSurface>> it = this.LLIFFJFJJ.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<Surface, EGLSurface> next = it.next();
            if (next.getValue() != EGL14.EGL_NO_SURFACE && next.getValue() != null) {
                EGL14.eglDestroySurface(this.LJLLLL, next.getValue());
                int i = this.LLIIIJ;
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("releaseAllExtraSurface sf:");
                LIZ.append(this);
                LIZ.append(", eglSurface:");
                LIZ.append(next.getValue());
                C48284IxE.LIZ(2, i, "VideoSurfaceTexture", X1D.LIZIZ(LIZ));
            }
            it.remove();
        }
    }

    public void resetFlag() {
        this.LLIIJLIL.clear();
    }

    public void unlock() {
        this.LJLLI.unlock();
    }

    public boolean couldForceRelease() {
        if (SystemClock.elapsedRealtime() - this.LL > 120000) {
            return true;
        }
        return false;
    }

    public void effectChainBegin() {
        this.LLILZLL = SystemClock.elapsedRealtime();
        this.LLILLJJLI = 0;
    }

    public void effectChainEnd() {
        double elapsedRealtime = SystemClock.elapsedRealtime() - this.LLILZLL;
        if (this.LLILLIZIL == LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX) {
            return;
        }
        double d = this.LLIZ + elapsedRealtime;
        this.LLIZ = d;
        int i = this.LLIZLLLIL + 1;
        this.LLIZLLLIL = i;
        if (i > 0) {
            this.LLJ = (float) (d / i);
        }
    }

    public C48262Iws getEffectConfig() {
        return this.mConfig;
    }

    public int getEnableUseEglDummySurface() {
        return this.LLJJIJI;
    }

    public HashMap<Surface, EGLSurface> getExtraRealSurfaces() {
        return this.LLIFFJFJJ;
    }

    public Bundle getFrameCallbackBundle() {
        return this.LLJJIII;
    }

    public long getOjbectId() {
        return this.LJLZ;
    }

    public CopyOnWriteArrayList<Bundle> getParamList() {
        return this.LLF;
    }

    public Surface getRenderSurface() {
        return this.LJLJLJ;
    }

    public int getSerial() {
        return this.LJLLJ;
    }

    public long getSurfaceUpdateTime() {
        return this.LJZ;
    }

    public int getTexHeight() {
        return this.LLFII;
    }

    public VGC getTexId() {
        return this.LJLIL;
    }

    public int getTexWidth() {
        return this.LLFFF;
    }

    public Surface getUpdateSurface() {
        return this.LJLJLLL;
    }

    public int getUseSr() {
        return this.LLD;
    }

    public boolean isPreRender() {
        return this.LLFZ;
    }

    public boolean isRelease() {
        return this.LJLILLLLZI;
    }

    public int texType() {
        return this.LLIIIJ;
    }

    public static String LIZJ(Looper looper) {
        if (looper == null) {
            return null;
        }
        Thread thread = looper.getThread();
        if (thread != null) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Looper (");
            LIZ.append(thread.getName());
            LIZ.append(", tid ");
            LIZ.append(thread.getId());
            LIZ.append(") {");
            LIZ.append(Integer.toHexString(System.identityHashCode(looper)));
            LIZ.append("}");
            return X1D.LIZIZ(LIZ);
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("Looper {");
        LIZ2.append(Integer.toHexString(System.identityHashCode(looper)));
        LIZ2.append("}");
        return X1D.LIZIZ(LIZ2);
    }

    public final String LIZ(Bundle bundle) {
        try {
            return bundle.toString();
        } catch (Exception e) {
            int i = this.LLIIIJ;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("setEffect");
            LIZ.append(e.toString());
            C48284IxE.LIZ(6, i, "VideoSurfaceTexture", X1D.LIZIZ(LIZ));
            return "bundle modified";
        }
    }

    public final void LIZIZ(Handler handler) {
        this.LJLZ = new Random().nextLong();
        this.LJLLILLLL = handler;
        this.LJLLI = new ReentrantLock();
        this.LJZI = Looper.myLooper();
        this.LJZL = new Bundle();
        this.LJLJJL = EGL14.EGL_NO_SURFACE;
        this.LLD = 0;
        VG5 vg5 = new VG5();
        this.LLIIZ = vg5;
        if (this.LLJLLIL == 1) {
            setOnFrameAvailableListener(vg5, this.LJLLILLLL);
        } else {
            setOnFrameAvailableListener(vg5);
        }
        int i = this.LLIIIJ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(this);
        LIZ.append("gen a texture :");
        LIZ.append(this.LJLZ);
        LIZ.append(", thread id ");
        LIZ.append(C16880lQ.LLLLIIIILLL().getId());
        LIZ.append(", looper = ");
        LIZ.append(LIZJ(this.LJZI));
        C48284IxE.LIZ(2, i, "VideoSurfaceTexture", X1D.LIZIZ(LIZ));
    }

    public boolean canReuse(Looper looper) {
        boolean z;
        if (looper == this.LJZI) {
            if (this.LLJL <= 0) {
                z = true;
                int i = this.LLIIIJ;
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append(this);
                LIZ.append("ret = ");
                LIZ.append(z);
                LIZ.append(" looper =");
                LIZ.append(LIZJ(looper));
                LIZ.append(", mlooper = ");
                LIZ.append(LIZJ(this.LJZI));
                LIZ.append(", mForbidReuseVideoSurfaceTexture = ");
                C79062V1e.LJII(LIZ, this.LLJL, LIZ, 2, i, "VideoSurfaceTexture");
                return z;
            }
        }
        z = false;
        int i2 = this.LLIIIJ;
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(this);
        LIZ2.append("ret = ");
        LIZ2.append(z);
        LIZ2.append(" looper =");
        LIZ2.append(LIZJ(looper));
        LIZ2.append(", mlooper = ");
        LIZ2.append(LIZJ(this.LJZI));
        LIZ2.append(", mForbidReuseVideoSurfaceTexture = ");
        C79062V1e.LJII(LIZ2, this.LLJL, LIZ2, 2, i2, "VideoSurfaceTexture");
        return z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x007f, code lost:
    
        if (r5 != 43) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void checkGeometry(android.opengl.EGLSurface r13) {
        /*
            r12 = this;
            com.ss.texturerender.NativeWindow r6 = r12.LLJJJ
            int r0 = r12.LLJJJIL
            r9 = 1
            if (r0 != r9) goto L78
            if (r6 == 0) goto L78
            com.ss.texturerender.VideoSurface r0 = r12.LJLL
            r2 = 0
            if (r0 == 0) goto L84
            int r4 = r0.LJLIL
            int r3 = r0.LJLILLLLZI
            if (r3 <= 0) goto L23
            if (r4 <= 0) goto L23
            int r0 = r12.getViewportWidth()
            if (r0 != r4) goto L22
            int r0 = r12.getViewportHeight()
            if (r0 == r3) goto L23
        L22:
            r2 = 1
        L23:
            int r5 = r6.LIZ()
            if (r5 <= 0) goto L38
            int r1 = r12.LLJJJJ
            r0 = 24
            if (r1 > r0) goto L79
            if (r5 == r9) goto L82
            r0 = 2
            if (r5 == r0) goto L82
            r0 = 3
            if (r5 == r0) goto L82
            r2 = 1
        L38:
            r7 = 1
        L39:
            if (r2 == 0) goto L78
        L3b:
            if (r4 > 0) goto L41
            int r4 = r12.getViewportWidth()
        L41:
            if (r3 > 0) goto L47
            int r3 = r12.getViewportHeight()
        L47:
            r6.LIZJ(r4, r3, r7)
            int r10 = r12.LLIIIJ
            java.lang.StringBuilder r6 = X.X1D.LIZ()
            java.lang.String r0 = "setBuffersGeometry,oriW:"
            r6.append(r0)
            int r0 = r12.LJLJJLL
            r6.append(r0)
            java.lang.String r0 = ",oriH:"
            r6.append(r0)
            int r2 = r12.LJLJL
            java.lang.String r1 = ",oriFmt:"
            java.lang.String r0 = ",newW:"
            X.C15890jp.LIZIZ(r6, r2, r1, r5, r0)
            java.lang.String r1 = ",newH:"
            java.lang.String r0 = ",newFmt:"
            X.C15890jp.LIZIZ(r6, r4, r1, r3, r0)
            java.lang.String r11 = "VideoSurfaceTexture"
            r8 = r6
            X.C79062V1e.LJII(r6, r7, r8, r9, r10, r11)
            r12.createEGLWindowSurface(r9, r9, r13)
        L78:
            return
        L79:
            r0 = 22
            if (r5 == r0) goto L82
            r7 = 43
            if (r5 == r7) goto L82
            goto L3b
        L82:
            r7 = r5
            goto L39
        L84:
            r3 = 0
            r4 = 0
            goto L23
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C79445VFx.checkGeometry(android.opengl.EGLSurface):void");
    }

    public EGLSurface createEGLWindowSurface(Surface surface) {
        int[] iArr;
        boolean z;
        EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
        if (surface != null && surface.isValid()) {
            String eglQueryString = EGL14.eglQueryString(this.LJLLLL, 12373);
            if (!TextUtils.isEmpty(eglQueryString) && eglQueryString.contains("EGL_EXT_gl_colorspace_bt2020_pq") && this.LLJLIL != 0) {
                iArr = new int[]{12445, 13120, 12344};
                z = true;
            } else {
                iArr = new int[]{12344};
                z = false;
            }
            try {
                int i = this.LLIIIJ;
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append(this);
                LIZ.append(",create window surface from ");
                LIZ.append(surface);
                LIZ.append(",attr:");
                LIZ.append(Arrays.toString(iArr));
                C48284IxE.LIZ(2, i, "VideoSurfaceTexture", X1D.LIZIZ(LIZ));
                EGLSurface eglCreateWindowSurface = EGL14.eglCreateWindowSurface(this.LJLLLL, this.LJLLLLLL, surface, iArr, 0);
                if (eglCreateWindowSurface == EGL14.EGL_NO_SURFACE) {
                    int eglGetError = EGL14.eglGetError();
                    notifyError(eglGetError, 0, "");
                    int i2 = this.LLIIIJ;
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("create window surface failed");
                    LIZ2.append(GLUtils.getEGLErrorString(eglGetError));
                    C48284IxE.LIZ(6, i2, "VideoSurfaceTexture", X1D.LIZIZ(LIZ2));
                    return eglCreateWindowSurface;
                }
                List<Integer> list = this.LLJILLL;
                if (list != null && list.size() >= 10 && z && !TextUtils.isEmpty(eglQueryString) && eglQueryString.contains("EGL_EXT_surface_SMPTE2086_metadata")) {
                    EGL14.eglSurfaceAttrib(this.LJLLLL, eglCreateWindowSurface, 13121, ((Integer) ListProtector.get(this.LLJILLL, 0)).intValue());
                    EGL14.eglSurfaceAttrib(this.LJLLLL, eglCreateWindowSurface, 13122, ((Integer) ListProtector.get(this.LLJILLL, 1)).intValue());
                    EGL14.eglSurfaceAttrib(this.LJLLLL, eglCreateWindowSurface, 13123, ((Integer) ListProtector.get(this.LLJILLL, 2)).intValue());
                    EGL14.eglSurfaceAttrib(this.LJLLLL, eglCreateWindowSurface, 13124, ((Integer) ListProtector.get(this.LLJILLL, 3)).intValue());
                    EGL14.eglSurfaceAttrib(this.LJLLLL, eglCreateWindowSurface, 13125, ((Integer) ListProtector.get(this.LLJILLL, 4)).intValue());
                    EGL14.eglSurfaceAttrib(this.LJLLLL, eglCreateWindowSurface, 13126, ((Integer) ListProtector.get(this.LLJILLL, 5)).intValue());
                    EGL14.eglSurfaceAttrib(this.LJLLLL, eglCreateWindowSurface, 13127, ((Integer) ListProtector.get(this.LLJILLL, 6)).intValue());
                    EGL14.eglSurfaceAttrib(this.LJLLLL, eglCreateWindowSurface, 13128, ((Integer) ListProtector.get(this.LLJILLL, 7)).intValue());
                    EGL14.eglSurfaceAttrib(this.LJLLLL, eglCreateWindowSurface, 13129, ((Integer) ListProtector.get(this.LLJILLL, 8)).intValue());
                    EGL14.eglSurfaceAttrib(this.LJLLLL, eglCreateWindowSurface, 13130, ((Integer) ListProtector.get(this.LLJILLL, 9)).intValue());
                    return eglCreateWindowSurface;
                }
                return eglCreateWindowSurface;
            } catch (Exception unused) {
                notifyError(5, 0, "");
                C48284IxE.LIZ(6, this.LLIIIJ, "VideoSurfaceTexture", "createEGLWindowSurface exception failed");
                return EGL14.EGL_NO_SURFACE;
            }
        }
        return eGLSurface;
    }

    public void currentEffectProcessBegin(int i) {
        if (this.LLILLJJLI == 0) {
            this.LLILLIZIL = SystemClock.elapsedRealtime();
        }
        this.LLILLJJLI++;
    }

    public void currentEffectProcessEnd(int i) {
        int i2 = this.LLILLJJLI - 1;
        this.LLILLJJLI = i2;
        if (i2 != 0 || this.LLILLIZIL == LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX) {
            return;
        }
        double elapsedRealtime = SystemClock.elapsedRealtime() - this.LLILLIZIL;
        HashMap<Integer, Double> hashMap = this.LLILZ;
        if (hashMap == null || this.LLILLL == null || this.LLILZIL == null) {
            return;
        }
        if (!hashMap.containsKey(Integer.valueOf(i))) {
            this.LLILZ.put(Integer.valueOf(i), Double.valueOf(elapsedRealtime));
            this.LLILLL.put(Integer.valueOf(i), 1);
            this.LLILZIL.put(Integer.valueOf(i), Float.valueOf((float) elapsedRealtime));
            return;
        }
        Double d = this.LLILZ.get(Integer.valueOf(i));
        Integer num = this.LLILLL.get(Integer.valueOf(i));
        if (d == null || num == null) {
            return;
        }
        double doubleValue = d.doubleValue() + elapsedRealtime;
        int intValue = num.intValue() + 1;
        this.LLILZ.put(Integer.valueOf(i), Double.valueOf(doubleValue));
        this.LLILLL.put(Integer.valueOf(i), Integer.valueOf(intValue));
        if (intValue <= 0) {
            return;
        }
        this.LLILZIL.put(Integer.valueOf(i), Float.valueOf((float) (doubleValue / intValue)));
    }

    public int getConsumerHeight(EGLSurface eGLSurface) {
        if (eGLSurface == EGL14.EGL_NO_SURFACE) {
            return -1;
        }
        int[] iArr = new int[1];
        EGL14.eglQuerySurface(this.LJLLLL, eGLSurface, 12374, iArr, 0);
        return iArr[0];
    }

    public int getConsumerWidth(EGLSurface eGLSurface) {
        if (eGLSurface == EGL14.EGL_NO_SURFACE) {
            return -1;
        }
        int[] iArr = new int[1];
        EGL14.eglQuerySurface(this.LJLLLL, eGLSurface, 12375, iArr, 0);
        return iArr[0];
    }

    public Bundle getCropParamsBundle(boolean z) {
        if (z) {
            return this.LLJJJJLIIL;
        }
        return this.LLJJL;
    }

    public float getFloatOption(int i) {
        return getFloatOption(i, -1);
    }

    public int getIntOption(int i) {
        if (i != 121) {
            if (i != 130) {
                if (i != 137) {
                    if (i != 141) {
                        if (i != 144) {
                            if (i != 146) {
                                if (i != 147) {
                                    return getIntOption(i, -1);
                                }
                                return this.LLJJJJJIL;
                            }
                            return this.LLJJIJIL;
                        }
                        return this.LLJJIJIIJIL;
                    }
                    return this.LLJJI;
                }
                return this.LLJJ;
            }
            return this.LLJLILLLLZIIL;
        }
        return this.LLIL;
    }

    public Bundle getOption(int i) {
        if (i != 130) {
            return null;
        }
        return this.LLJLL;
    }

    public String getStringOption(int i) {
        return getStringOption(i, -1);
    }

    public void handleUpdateVideoState(int i) {
        this.LLIILII = i;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return;
                }
                this.LLIIII = 0;
                VGA vga = this.mVsyncHelper;
                if (vga != null) {
                    vga.LIZIZ(this);
                }
                this.LLJJ = 0;
                C48284IxE.LIZ(2, this.LLIIIJ, "VideoSurfaceTexture", "TEXTURE_STATE_STOP");
                return;
            }
            int i2 = this.LLIIIJ;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("TEXTURE_STATE_STOP mStartPlayTimeNanos:");
            LIZ.append(this.LLII);
            C48284IxE.LIZ(2, i2, "VideoSurfaceTexture", X1D.LIZIZ(LIZ));
            return;
        }
        this.LLILIL = (float) SystemClock.elapsedRealtime();
        if (this.LLII <= 0) {
            this.LLII = System.nanoTime();
            int i3 = this.LLIIIJ;
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("TEXTURE_STATE_PLAYING mStartPlayTimeNanos:");
            LIZ2.append(this.LLII);
            C48284IxE.LIZ(2, i3, "VideoSurfaceTexture", X1D.LIZIZ(LIZ2));
        }
        VGA vga2 = this.mVsyncHelper;
        if (vga2 == null) {
            return;
        }
        vga2.LIZJ(this);
    }

    public void ignoreSRResolutionCheck(boolean z) {
        this.LLI = z;
        int i = this.LLIIIJ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ignoreSRResolutionCheck:");
        LIZ.append(z);
        C48284IxE.LIZ(2, i, "VideoSurfaceTexture", X1D.LIZIZ(LIZ));
    }

    public void initExtraSurface(Surface surface) {
        int i = this.LLIIIJ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("initExtraSurface begin sf:");
        LIZ.append(this);
        LIZ.append(", surface:");
        LIZ.append(surface);
        LIZ.append(", mExtraSurfaceMap size:");
        LIZ.append(this.LLIFFJFJJ.size());
        C48284IxE.LIZ(2, i, "VideoSurfaceTexture", X1D.LIZIZ(LIZ));
        if (surface == null || this.LLIFFJFJJ.containsKey(surface)) {
            return;
        }
        EGLSurface createEGLWindowSurface = createEGLWindowSurface(surface);
        this.LLIFFJFJJ.put(surface, createEGLWindowSurface);
        int i2 = this.LLIIIJ;
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("initExtraSurface end sf:");
        LIZ2.append(this);
        LIZ2.append(", eglSurface:");
        LIZ2.append(createEGLWindowSurface);
        LIZ2.append(", mExtraSurfaceMap size:");
        LIZ2.append(this.LLIFFJFJJ.size());
        C48284IxE.LIZ(2, i2, "VideoSurfaceTexture", X1D.LIZIZ(LIZ2));
    }

    public boolean isCurrentObject(long j) {
        if (this.LJLZ == j) {
            return true;
        }
        return false;
    }

    public boolean makeCurrent(EGLSurface eGLSurface) {
        if (eGLSurface == EGL14.EGL_NO_SURFACE) {
            C48284IxE.LIZ(6, this.LLIIIJ, "VideoSurfaceTexture", "no surface for make current");
            return false;
        }
        int i = this.LLIIIJ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(this);
        LIZ.append(" make current again");
        C48284IxE.LIZ(2, i, "VideoSurfaceTexture", X1D.LIZIZ(LIZ));
        GLES20.glFinish();
        if (!EGL14.eglMakeCurrent(this.LJLLLL, eGLSurface, eGLSurface, this.LJLLL)) {
            int eglGetError = EGL14.eglGetError();
            notifyError(eglGetError, 0, "");
            int i2 = this.LLIIIJ;
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("make current failed:");
            LIZ2.append(eGLSurface);
            LIZ2.append(" error:");
            LIZ2.append(GLUtils.getEGLErrorString(eglGetError));
            C48284IxE.LIZ(6, i2, "VideoSurfaceTexture", X1D.LIZIZ(LIZ2));
            return false;
        }
        int i3 = this.LLIIIJ;
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append(this);
        LIZ3.append("make current done = ");
        LIZ3.append(this.LJLL);
        C48284IxE.LIZ(2, i3, "VideoSurfaceTexture", X1D.LIZIZ(LIZ3));
        return true;
    }

    public void notifyExtraSurfaceRender(Surface surface) {
        try {
            VideoSurface videoSurface = this.LJLL;
            if (videoSurface != null) {
                videoSurface.LJIILJJIL(this.LJLLJ, surface, getTimestamp());
            }
        } catch (Exception unused) {
        }
    }

    public void notifyRenderFrame(int i) {
        if (i != this.LJLLJ) {
            return;
        }
        try {
            VideoSurface videoSurface = this.LJLL;
            if (videoSurface != null) {
                videoSurface.LJIILIIL(i, getTimestamp());
                C87400YRw c87400YRw = this.LLFF;
                if (c87400YRw != null) {
                    this.LJLL.LJIIL((float) c87400YRw.LIZ, (float) c87400YRw.LIZIZ, (float) c87400YRw.LIZJ, (float) c87400YRw.LIZLLL, i);
                }
            }
        } catch (Exception unused) {
        }
    }

    public void onHeadposeChanged(C87400YRw c87400YRw) {
        VideoSurface offScreenSurface = getOffScreenSurface();
        if (offScreenSurface != null) {
            offScreenSurface.LJIIJ((float) c87400YRw.LIZ, (float) c87400YRw.LIZIZ, (float) c87400YRw.LIZJ, (float) c87400YRw.LIZLLL, this.LJLLJ);
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        VG4 vg4 = this.LLIILZL;
        if (vg4 != null) {
            if (vg4.LJLIL != null && motionEvent.getPointerCount() == 1) {
                vg4.LJLIL.onTouchEvent(motionEvent);
            }
            if (vg4.LJLILLLLZI != null && motionEvent.getPointerCount() == 2) {
                vg4.LJLILLLLZI.onTouchEvent(motionEvent);
            }
        }
        return false;
    }

    public void registerTouchListener(GestureDetector.SimpleOnGestureListener simpleOnGestureListener) {
        if (this.LLIILZL == null) {
            this.LLIILZL = new VG4(C47988IsS.LIZLLL().LIZLLL);
        }
        VG4 vg4 = this.LLIILZL;
        if (vg4.LJLJI == null) {
            vg4.LJLJI = new ArrayList<>();
        }
        if (!vg4.LJLJI.contains(simpleOnGestureListener)) {
            vg4.LJLJI.add(simpleOnGestureListener);
        }
    }

    public void release(boolean z) {
        int i = this.LLIIIJ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("release ");
        LIZ.append(this);
        LIZ.append(", glthread = ");
        LIZ.append(z);
        C48284IxE.LIZ(2, i, "VideoSurfaceTexture", X1D.LIZIZ(LIZ));
        releaseOffScreenSurface(z);
        release();
    }

    public void releaseExtraSurface(Surface surface) {
        int i = this.LLIIIJ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("releaseExtraSurface begin sf:");
        LIZ.append(this);
        LIZ.append(", surface:");
        LIZ.append(surface);
        LIZ.append(", mExtraSurfaceMap size:");
        LIZ.append(this.LLIFFJFJJ.size());
        C48284IxE.LIZ(2, i, "VideoSurfaceTexture", X1D.LIZIZ(LIZ));
        EGLSurface eGLSurface = this.LLIFFJFJJ.get(surface);
        if (eGLSurface != null) {
            if (eGLSurface != EGL14.EGL_NO_SURFACE) {
                EGL14.eglDestroySurface(this.LJLLLL, eGLSurface);
            }
            this.LLIFFJFJJ.remove(surface);
        }
        int i2 = this.LLIIIJ;
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("releaseExtraSurface end sf:");
        LIZ2.append(this);
        LIZ2.append(", eglSurface:");
        LIZ2.append(eGLSurface);
        LIZ2.append(", mExtraSurfaceMap size:");
        LIZ2.append(this.LLIFFJFJJ.size());
        C48284IxE.LIZ(2, i2, "VideoSurfaceTexture", X1D.LIZIZ(LIZ2));
    }

    public void releaseOffScreenSurface(boolean z) {
        this.LJLL = null;
        if (z) {
            this.LJLJLLL = null;
            EGLSurface eGLSurface = this.LJLJJL;
            if (eGLSurface != EGL14.EGL_NO_SURFACE) {
                EGL14.eglDestroySurface(this.LJLLLL, eGLSurface);
                this.LJLJJL = EGL14.EGL_NO_SURFACE;
                this.LJLJJI = false;
                NativeWindow nativeWindow = this.LLJJJ;
                if (nativeWindow != null) {
                    nativeWindow.LIZIZ();
                    this.LLJJJ = null;
                }
            }
            releaseAllExtraSurface();
        } else {
            updateSurface(null);
            releaseAllExtraSurface_l();
        }
        if ((this.LLIIIJ & 4) > 0) {
            synchronized (this.LLIIIILZ) {
                Message message = this.LLIIIILZ;
                message.arg1 = LiveLayoutPreloadThreadPriority.DEFAULT;
                message.notify();
                C48284IxE.LIZ(2, this.LLIIIJ, "VideoSurfaceTexture", "releaseOffScreenSurface mSyncMsg.notify");
            }
        }
        this.LL = SystemClock.elapsedRealtime();
        this.LLIILII = 3;
        VGA vga = this.mVsyncHelper;
        if (vga != null) {
            vga.setEnable(false);
        }
        CopyOnWriteArrayList<Bundle> copyOnWriteArrayList = this.LLF;
        if (copyOnWriteArrayList != null) {
            copyOnWriteArrayList.clear();
            this.LLF = null;
        }
        if (this.LLJJJJLIIL != null || this.LLJJL != null) {
            this.LLJJJJLIIL = null;
            this.LLJJL = null;
            Handler handler = this.LJLLILLLL;
            if (handler != null) {
                try {
                    Message obtainMessage = handler.obtainMessage(40);
                    obtainMessage.obj = this;
                    this.LJLLILLLL.sendMessageAtFrontOfQueue(obtainMessage);
                } catch (Exception unused) {
                }
            }
        }
        if (this.mHasFrameCome) {
            this.mHasFrameCome = false;
            sendRenderMsg(0, false);
        }
        this.LLIL = 0;
        this.LLILII = LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX;
        this.LLILIL = LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX;
        this.LLILL = 0.0f;
        this.LLILLIZIL = LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX;
        this.LLILLJJLI = 0;
        HashMap<Integer, Integer> hashMap = this.LLILLL;
        if (hashMap != null) {
            hashMap.clear();
        }
        HashMap<Integer, Double> hashMap2 = this.LLILZ;
        if (hashMap2 != null) {
            hashMap2.clear();
        }
        HashMap<Integer, Float> hashMap3 = this.LLILZIL;
        if (hashMap3 != null) {
            hashMap3.clear();
        }
        this.LLILZLL = LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX;
        this.LLIZ = LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX;
        this.LLIZLLLIL = 0;
        this.LLJ = 0.0f;
        HashMap<Integer, Integer> hashMap4 = this.LLJI;
        if (hashMap4 != null) {
            hashMap4.clear();
        }
        HashMap<Integer, String> hashMap5 = this.LLJIJIL;
        if (hashMap5 != null) {
            hashMap5.clear();
        }
        C48262Iws c48262Iws = this.mConfig;
        c48262Iws.LIZJ.clear();
        c48262Iws.LIZ = false;
        c48262Iws.LIZIZ = false;
        this.LLJLL = null;
        this.LLJILLL = null;
        this.LLJJ = 0;
        int i = this.LLIIIJ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(this);
        LIZ.append("release offscreen surface done = ");
        LIZ.append(this.LL);
        C48284IxE.LIZ(2, i, "VideoSurfaceTexture", X1D.LIZIZ(LIZ));
    }

    public boolean render(EGLSurface eGLSurface) {
        if (!eglSwapBuffer(this.LJLJJL, eGLSurface)) {
            return false;
        }
        notifyRenderFrame(this.LJLLJ);
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:86:0x00c6, code lost:
    
        if (r7 == 1) goto L45;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized void setEffect(android.os.Bundle r10) {
        /*
            Method dump skipped, instructions count: 384
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C79445VFx.setEffect(android.os.Bundle):void");
    }

    public void setFrameRenderChecker(C48265Iwv c48265Iwv) {
        VideoSurface videoSurface = this.LJLL;
        if (videoSurface != null) {
            videoSurface.LJIL(c48265Iwv);
        }
    }

    public int setHeadPose(C87400YRw c87400YRw) {
        this.LLFF = c87400YRw;
        return 1;
    }

    public synchronized void setSuperResolutionMode(int i) {
        int i2 = this.LLIIIJ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(this);
        LIZ.append(" set sr = ");
        LIZ.append(i);
        C48284IxE.LIZ(2, i2, "VideoSurfaceTexture", X1D.LIZIZ(LIZ));
        this.LLD = i;
        setEffectOpen(5, i, null);
    }

    public void unRegisterTouchListener(GestureDetector.SimpleOnGestureListener simpleOnGestureListener) {
        ArrayList<GestureDetector.SimpleOnGestureListener> arrayList;
        VG4 vg4 = this.LLIILZL;
        if (vg4 != null && (arrayList = vg4.LJLJI) != null) {
            arrayList.remove(simpleOnGestureListener);
        }
    }

    public synchronized void updateSurface(Surface surface) {
        int i = this.LLIIIJ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("update Surface = ");
        LIZ.append(this);
        LIZ.append(", ");
        LIZ.append(surface);
        LIZ.append(", ");
        LIZ.append(this.LJLJLLL);
        C48284IxE.LIZ(2, i, "VideoSurfaceTexture", X1D.LIZIZ(LIZ));
        if (surface == this.LJLJLLL && surface != null && surface.toString().contains("SurfaceTexture")) {
            C48284IxE.LIZ(2, this.LLIIIJ, "VideoSurfaceTexture", "prevent the same surface???");
            return;
        }
        this.LJLLI.lock();
        this.LJLJLLL = surface;
        this.LJLLI.unlock();
        Handler handler = this.LJLLILLLL;
        if (handler != null) {
            Message obtainMessage = handler.obtainMessage(4);
            this.LJZL.putSerializable("texture", this);
            obtainMessage.setData(this.LJZL);
            if (this.LLIIIL != 1) {
                this.LJLLILLLL.sendMessageAtFrontOfQueue(obtainMessage);
            } else {
                Object obj = new Object();
                obtainMessage.obj = obj;
                synchronized (obj) {
                    this.LJLLILLLL.sendMessageAtFrontOfQueue(obtainMessage);
                    try {
                        C48284IxE.LIZ(2, this.LLIIIJ, "VideoSurfaceTexture", "update surface wait");
                        obj.wait(100L);
                    } catch (Exception unused) {
                    }
                }
            }
        }
        C48284IxE.LIZ(2, this.LLIIIJ, "VideoSurfaceTexture", "update Surface end");
    }

    public synchronized void updateVideoState(int i) {
        Handler handler = this.LJLLILLLL;
        if (handler != null) {
            Message obtainMessage = handler.obtainMessage(26);
            obtainMessage.obj = this;
            obtainMessage.arg1 = i;
            this.LJLLILLLL.sendMessage(obtainMessage);
        }
    }

    public void registerTouchListener(ScaleGestureDetector.OnScaleGestureListener onScaleGestureListener) {
        if (this.LLIILZL == null) {
            this.LLIILZL = new VG4(C47988IsS.LIZLLL().LIZLLL);
        }
        VG4 vg4 = this.LLIILZL;
        if (vg4.LJLJJI == null) {
            vg4.LJLJJI = new ArrayList<>();
        }
        if (!vg4.LJLJJI.contains(onScaleGestureListener)) {
            vg4.LJLJJI.add(onScaleGestureListener);
        }
    }

    public void unRegisterTouchListener(ScaleGestureDetector.OnScaleGestureListener onScaleGestureListener) {
        ArrayList<ScaleGestureDetector.OnScaleGestureListener> arrayList;
        VG4 vg4 = this.LLIILZL;
        if (vg4 != null && (arrayList = vg4.LJLJJI) != null) {
            arrayList.remove(onScaleGestureListener);
        }
    }

    public final void LIZLLL(Message message, boolean z) {
        Handler handler = this.LJLLILLLL;
        if (handler != null) {
            try {
                if (!z) {
                    handler.sendMessage(message);
                    return;
                }
                synchronized (this) {
                    this.LJLLILLLL.sendMessage(message);
                    int i = this.LLIIIJ;
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("sendMsg, msg:");
                    LIZ.append(message.toString());
                    C48284IxE.LIZ(2, i, "VideoSurfaceTexture", X1D.LIZIZ(LIZ));
                    wait(100L);
                }
            } catch (Exception unused) {
            }
        }
    }

    public boolean eglSwapBuffer(EGLSurface eGLSurface, EGLSurface eGLSurface2) {
        if (EGL14.eglSwapBuffers(this.LJLLLL, eGLSurface)) {
            return true;
        }
        int eglGetError = EGL14.eglGetError();
        if (eglGetError == 12301 && eGLSurface2 != EGL14.EGL_NO_SURFACE) {
            createEGLWindowSurface(true, true, eGLSurface2);
        }
        notifyError(eglGetError, 0, "");
        int i = this.LLIIIJ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(this);
        LIZ.append("swap buffer failed:");
        LIZ.append(GLUtils.getEGLErrorString(eglGetError));
        C48284IxE.LIZ(6, i, "VideoSurfaceTexture", X1D.LIZIZ(LIZ));
        return false;
    }

    public float getFloatOption(int i, int i2) {
        double d;
        Float f;
        if (i != 120) {
            if (i != 131) {
                if (i != 132) {
                    switch (i) {
                        case 122:
                            d = this.LLILII;
                            break;
                        case 123:
                            d = this.LLILIL;
                            break;
                        case 124:
                            HashMap<Integer, Float> hashMap = this.LLILZIL;
                            if (hashMap == null || (f = hashMap.get(Integer.valueOf(i2))) == null) {
                                return 0.0f;
                            }
                            return f.floatValue();
                        case 125:
                            return this.LLJ;
                        default:
                            return 0.0f;
                    }
                    return (float) d;
                }
                return this.LLJILJILJ;
            }
            return this.LLJILJIL;
        }
        return this.LLILL;
    }

    public int getIntOption(int i, int i2) {
        Integer num;
        if (i != 6) {
            if (i != 8) {
                if (i != 10) {
                    if (i != 23) {
                        if (i != 126) {
                            if (i != 135) {
                                if (i != 137) {
                                    if (i != 15) {
                                        if (i == 16) {
                                            return this.mConfig.LIZ(1) ? 1 : 0;
                                        }
                                        if (i != 18) {
                                            if (i != 19) {
                                                return -1;
                                            }
                                        } else {
                                            VG0 vg0 = this.LLIIIZ;
                                            if (vg0 == null || !vg0.LJZ.LIZIZ) {
                                                return 0;
                                            }
                                            return 1;
                                        }
                                    } else {
                                        i2 = 1;
                                    }
                                } else {
                                    return this.LLJJ;
                                }
                            } else {
                                return this.mHeadposeCallbackIntegral;
                            }
                        } else {
                            HashMap<Integer, Integer> hashMap = this.LLJI;
                            if (hashMap == null || (num = hashMap.get(Integer.valueOf(i2))) == null) {
                                return -1;
                            }
                            return num.intValue();
                        }
                    } else {
                        VG0 vg02 = this.LLIIIZ;
                        if (vg02 == null || !vg02.LJZ.LIZ(i2)) {
                            return 0;
                        }
                        return 1;
                    }
                } else {
                    VG0 vg03 = this.LLIIIZ;
                    if (vg03 == null || !vg03.LJZ.LIZ) {
                        return 0;
                    }
                    return 1;
                }
            } else {
                return this.LLJLIL;
            }
        } else {
            i2 = 5;
        }
        Integer num2 = this.LLIIJLIL.get(Integer.valueOf(i2));
        if (num2 == null) {
            return 0;
        }
        return num2.intValue();
    }

    public String getStringOption(int i, int i2) {
        HashMap<Integer, String> hashMap;
        String str;
        if (i != 127 || (hashMap = this.LLJIJIL) == null || (str = hashMap.get(Integer.valueOf(i2))) == null) {
            return "";
        }
        return str;
    }

    public synchronized void pause(boolean z, boolean z2) {
        if (z2 && !z) {
            if (this.LJLLILLLL != null && (this.LJLJI || this.LLFZ)) {
                int i = this.LLIIIJ;
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append(this);
                LIZ.append("need active , post a resume msg");
                C48284IxE.LIZ(2, i, "VideoSurfaceTexture", X1D.LIZIZ(LIZ));
                Message obtainMessage = this.LJLLILLLL.obtainMessage(10);
                obtainMessage.obj = this;
                this.LLFZ = false;
                this.LJLLILLLL.sendMessageAtFrontOfQueue(obtainMessage);
            }
        }
        this.LJLJI = z;
        int i2 = this.LLIIIJ;
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(this);
        LIZ2.append("paused = ");
        LIZ2.append(this.LJLJI);
        C48284IxE.LIZ(2, i2, "VideoSurfaceTexture", X1D.LIZIZ(LIZ2));
    }

    public Bitmap saveFrame(Bundle bundle, InterfaceC46928IbM interfaceC46928IbM) {
        Handler handler = this.LJLLILLLL;
        if (handler == null) {
            return null;
        }
        if (interfaceC46928IbM != null) {
            synchronized (this.LLIIL) {
                if (!this.LLIIL.isEmpty()) {
                    this.LLIIL.clear();
                }
                this.LLIIL.putAll(bundle);
                this.LLIIL.putSerializable("callback", interfaceC46928IbM);
            }
            if (this.LLIILII != 1) {
                sendRenderMsg(1, false);
            }
            return null;
        }
        Message obtainMessage = handler.obtainMessage(14);
        this.LJZL.putSerializable("texture", this);
        obtainMessage.setData(this.LJZL);
        Message message = new Message();
        obtainMessage.obj = message;
        try {
            synchronized (message) {
                this.LJLLILLLL.sendMessageAtFrontOfQueue(obtainMessage);
                message.wait(500L);
            }
            if (message.obj == null && this.LJLLILLLL.hasMessages(14)) {
                C48284IxE.LIZ(2, this.LLIIIJ, "VideoSurfaceTexture", "render thread is busy");
            }
            int i = this.LLIIIJ;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("save frame done = ");
            LIZ.append(message.obj);
            C48284IxE.LIZ(2, i, "VideoSurfaceTexture", X1D.LIZIZ(LIZ));
            return (Bitmap) message.obj;
        } catch (InterruptedException unused) {
            return null;
        }
    }

    public void sendRenderMsg(int i, boolean z) {
        int i2;
        Handler handler = this.LJLLILLLL;
        if (handler != null) {
            try {
                Message obtainMessage = handler.obtainMessage(2);
                obtainMessage.obj = this;
                obtainMessage.arg1 = i;
                if (z) {
                    i2 = 1;
                } else {
                    i2 = 0;
                }
                obtainMessage.arg2 = i2;
                if (!this.LLIIL.isEmpty()) {
                    synchronized (this.LLIIL) {
                        obtainMessage.setData(this.LLIIL);
                        this.LLIIL = new Bundle();
                    }
                }
                LIZLLL(obtainMessage, z);
            } catch (Exception unused) {
            }
        }
    }

    public synchronized void setExtraSurface(Surface surface, int i) {
        int i2 = this.LLIIIJ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("setExtraSurface = ");
        LIZ.append(this);
        LIZ.append(", ");
        LIZ.append(surface);
        LIZ.append(", opera:");
        LIZ.append(i);
        C48284IxE.LIZ(2, i2, "VideoSurfaceTexture", X1D.LIZIZ(LIZ));
        Handler handler = this.LJLLILLLL;
        if (handler != null) {
            Message obtainMessage = handler.obtainMessage(25);
            obtainMessage.arg1 = i;
            Bundle bundle = new Bundle();
            bundle.putSerializable("texture", this);
            bundle.putParcelable("surface", surface);
            obtainMessage.setData(bundle);
            this.LJLLILLLL.sendMessage(obtainMessage);
        }
        C48284IxE.LIZ(2, this.LLIIIJ, "VideoSurfaceTexture", "setExtraSurface end");
    }

    /* JADX WARN: Code restructure failed: missing block: B:136:0x01eb, code lost:
    
        if (0 != 0) goto L121;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized void setOption(int r9, int r10) {
        /*
            Method dump skipped, instructions count: 532
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C79445VFx.setOption(int, int):void");
    }

    public boolean supportProcessResolution(int i, int i2) {
        if (this.LLI) {
            return true;
        }
        int i3 = 0;
        do {
            if (LLJLLL[i3] == i && LLJZ[i3] == i2) {
                return true;
            }
            i3++;
        } while (i3 < 6);
        C48284IxE.LIZ(6, this.LLIIIJ, "VideoSurfaceTexture", C48263Iwt.LIZLLL("sr not support resolution width:", i, ",height：", i2));
        return false;
    }

    public void updateTexDimension(int i, int i2) {
        C48284IxE.LIZ(2, this.LLIIIJ, "VideoSurfaceTexture", C48263Iwt.LIZLLL("update tex dimension : ", i, ", ", i2));
        setDefaultBufferSize(i, i2);
        this.LLFFF = i;
        this.LLFII = i2;
    }

    public synchronized void setOption(int i, float f) {
        try {
            if (i != 4) {
                if (i != 27) {
                    if (i != 120) {
                        if (i != 122) {
                            if (i != 123) {
                                if (i != 131) {
                                    if (i != 132) {
                                        Handler handler = this.LJLLILLLL;
                                        if (handler == null) {
                                            return;
                                        }
                                        Message obtainMessage = handler.obtainMessage(35);
                                        obtainMessage.obj = this;
                                        obtainMessage.arg1 = i;
                                        Bundle bundle = new Bundle();
                                        bundle.putFloat("float_value", f);
                                        obtainMessage.setData(bundle);
                                        obtainMessage.sendToTarget();
                                    } else {
                                        this.LLJILJILJ = f;
                                    }
                                } else {
                                    this.LLJILJIL = f;
                                }
                            } else {
                                this.LLILIL = f;
                            }
                        } else {
                            this.LLILII = f;
                        }
                    } else {
                        this.LLILL = f;
                    }
                } else {
                    this.mLayoutRatio = f;
                }
            } else {
                int i2 = this.LLIIIJ;
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("set TEXTURE_OPTION_SET_OVERLAY_RATIO ratio:");
                LIZ.append(f);
                C48284IxE.LIZ(2, i2, "VideoSurfaceTexture", X1D.LIZIZ(LIZ));
                Message obtainMessage2 = this.LJLLILLLL.obtainMessage(27);
                obtainMessage2.obj = this;
                Bundle bundle2 = new Bundle();
                bundle2.putFloat("overlay_ratio", f);
                obtainMessage2.setData(bundle2);
                obtainMessage2.sendToTarget();
            }
        } catch (Exception unused) {
        }
    }

    public void setOption(int i, Object obj) {
        if (i != 118) {
            if (i != 136) {
                return;
            }
            this.LLJILLL = (List) obj;
            return;
        }
        if (this.LJLLILLLL == null) {
            return;
        }
        try {
            Object obj2 = new Object();
            ArrayList arrayList = new ArrayList();
            arrayList.add(obj2);
            arrayList.add(obj);
            Message obtainMessage = this.LJLLILLLL.obtainMessage(41);
            obtainMessage.obj = arrayList;
            obtainMessage.arg1 = 118;
            synchronized (obj2) {
                this.LJLLILLLL.sendMessageAtFrontOfQueue(obtainMessage);
                try {
                    obj2.wait(1000L);
                    C48284IxE.LIZ(2, this.LLIIIJ, "VideoSurfaceTexture", "update background texture OK");
                } catch (InterruptedException unused) {
                    throw new RuntimeException("update background texture timeout");
                }
            }
        } catch (Exception unused2) {
        }
    }

    public C79445VFx(VGC vgc, Handler handler, VG0 vg0) {
        super(vgc.lock());
        this.LJLILLLLZI = false;
        this.LJLJI = false;
        this.LJLJJI = false;
        this.LJLJJL = EGL14.EGL_NO_SURFACE;
        this.LJLJJLL = 0;
        this.LJLJL = 0;
        this.LJLJLJ = null;
        this.LJLJLLL = null;
        this.LJLL = null;
        this.LJLLJ = 0;
        this.LLFZ = false;
        this.LLI = false;
        this.LLII = -1L;
        this.LLIIII = 0;
        this.LLIIIILZ = new Message();
        this.LLIIIJ = -1;
        this.LLIIIL = 0;
        this.mConfig = new C48262Iws(-1);
        this.LLIIJI = new LinkedList<>();
        this.LLIIJLIL = new HashMap<>();
        this.LLIIL = new Bundle();
        this.LLIILII = 3;
        this.LLIL = 0;
        this.LLILII = LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX;
        this.LLILIL = LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX;
        this.LLILL = 0.0f;
        this.LLILLIZIL = LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX;
        this.LLILLJJLI = 0;
        this.LLILLL = new HashMap<>();
        this.LLILZ = new HashMap<>();
        this.LLILZIL = new HashMap<>();
        this.LLILZLL = LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX;
        this.LLIZ = LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX;
        this.LLIZLLLIL = 0;
        this.LLJ = 0.0f;
        this.LLJI = new HashMap<>();
        this.LLJIJIL = new HashMap<>();
        this.LLJILJIL = Float.MIN_VALUE;
        this.LLJILJILJ = Float.MIN_VALUE;
        this.LLJILLL = null;
        this.LLJJ = 0;
        this.LLJJI = 0;
        this.LLJJIII = null;
        this.LLJJIJI = 0;
        this.LLJJIJIIJIL = 0;
        this.LLJJIJIL = 0;
        this.LLJJJ = null;
        this.LLJJJIL = 0;
        this.LLJJJJJIL = -1;
        this.mLayoutMode = 1;
        this.mLayoutRatio = 0.5f;
        this.mRotationType = 0;
        this.mIsMirrorHorizontal = 0;
        this.mIsMirrorVertical = 0;
        this.LLJJJJLIIL = null;
        this.LLJJL = null;
        this.LLJJLIIIJLLLLLLLZ = 1;
        this.mHasFrameCome = false;
        this.LLJL = 0;
        this.LLJLIL = 0;
        this.LLJLILLLLZIIL = 8;
        this.LLJLL = null;
        this.mHeadposeCallbackIntegral = 1;
        this.LLJLLIL = 0;
        vgc.LIZIZ();
        this.LJLIL = vgc;
        vgc.unlock();
        LIZIZ(handler);
        this.LLIFFJFJJ = new HashMap<>();
        this.LLIIIZ = vg0;
    }

    public void bindEGLEnv(EGLContext eGLContext, EGLDisplay eGLDisplay, EGLConfig eGLConfig) {
        if (eGLContext != null && eGLDisplay != null && eGLConfig != null) {
            this.LJLLL = eGLContext;
            this.LJLLLL = eGLDisplay;
            this.LJLLLLLL = eGLConfig;
            int[] iArr = new int[1];
            int[] iArr2 = new int[1];
            int[] iArr3 = new int[1];
            EGL14.eglGetConfigAttrib(eGLDisplay, eGLConfig, 12324, iArr, 0);
            EGL14.eglGetConfigAttrib(this.LJLLLL, this.LJLLLLLL, 12323, iArr2, 0);
            EGL14.eglGetConfigAttrib(this.LJLLLL, this.LJLLLLLL, 12322, iArr3, 0);
            this.LLJJJJ = iArr[0] + iArr2[0] + iArr3[0];
            int i = this.LLIIIJ;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("bindEGLEnv rgbbits:");
            C79062V1e.LJII(LIZ, this.LLJJJJ, LIZ, 1, i, "VideoSurfaceTexture");
            return;
        }
        throw new RuntimeException("no egl env for texture bind");
    }

    public boolean createEGLWindowSurface(boolean z, boolean z2, EGLSurface eGLSurface) {
        if (this.LJLJJL != EGL14.EGL_NO_SURFACE) {
            int i = this.LLIIIJ;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("destory previous surface = ");
            LIZ.append(this.LJLJJL);
            C48284IxE.LIZ(2, i, "VideoSurfaceTexture", X1D.LIZIZ(LIZ));
            if ((this.LJLJLJ == null && z) || z2) {
                int i2 = this.LLIIIJ;
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("make current to dummy surface due to non render surface, force:");
                LIZ2.append(z2);
                C48284IxE.LIZ(2, i2, "VideoSurfaceTexture", X1D.LIZIZ(LIZ2));
                EGL14.eglMakeCurrent(this.LJLLLL, eGLSurface, eGLSurface, this.LJLLL);
            }
            EGL14.eglDestroySurface(this.LJLLLL, this.LJLJJL);
            this.LJLJJL = EGL14.EGL_NO_SURFACE;
            this.LJLJJI = false;
            NativeWindow nativeWindow = this.LLJJJ;
            if (nativeWindow != null) {
                nativeWindow.LIZIZ();
                this.LLJJJ = null;
            }
            int i3 = this.LLIIIJ;
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("destory previous surface done = ");
            LIZ3.append(this.LJLJJL);
            C48284IxE.LIZ(2, i3, "VideoSurfaceTexture", X1D.LIZIZ(LIZ3));
        }
        if (this.LLJJIJI == 1 && z2 && eGLSurface != EGL14.EGL_NO_SURFACE && this.LJLJLJ == null) {
            this.LJLJJL = eGLSurface;
        } else {
            this.LJLJJL = createEGLWindowSurface(this.LJLJLJ);
        }
        int i4 = this.LLIIIJ;
        StringBuilder LIZ4 = X1D.LIZ();
        LIZ4.append("createEGLWindowSurface eglSurface:");
        LIZ4.append(this.LJLJJL);
        C48284IxE.LIZ(2, i4, "VideoSurfaceTexture", X1D.LIZIZ(LIZ4));
        if (this.LJLJJL == EGL14.EGL_NO_SURFACE) {
            return false;
        }
        try {
            makeCurrent();
            if (this.LLJJJIL > 0 && this.LJLJLJ != null) {
                NativeWindow nativeWindow2 = this.LLJJJ;
                if (nativeWindow2 != null) {
                    nativeWindow2.LIZIZ();
                }
                this.LLJJJ = new NativeWindow(this.LLIIIJ, this.LJLJLJ);
            }
            this.LJZ = System.nanoTime();
            return true;
        } catch (Exception unused) {
            C48284IxE.LIZ(6, this.LLIIIJ, "VideoSurfaceTexture", "makeCurrent exception failed");
            return false;
        }
    }

    public void frameMetaCallback(long j, long j2, java.util.Map<Integer, String> map) {
        String str;
        int i = this.LLIIIJ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("frameMetaCallback this:");
        LIZ.append(this);
        LIZ.append(" pts:");
        LIZ.append(j);
        LIZ.append(" mRenderHandler:");
        LIZ.append(this.LJLLILLLL);
        C48284IxE.LIZ(2, i, "VideoSurfaceTexture", X1D.LIZIZ(LIZ));
        Handler handler = this.LJLLILLLL;
        if (handler == null) {
            return;
        }
        int i2 = this.LLIIIJ;
        if ((i2 & 4) == 0) {
            return;
        }
        if (this.LJLL == null) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("mOffScreenSurface null,return this:");
            LIZ2.append(this);
            C48284IxE.LIZ(2, i2, "VideoSurfaceTexture", X1D.LIZIZ(LIZ2));
            return;
        }
        try {
            Message obtainMessage = handler.obtainMessage(32);
            Bundle bundle = new Bundle();
            bundle.putSerializable("update_frame_time", new VGB(j, j2));
            if (map != null) {
                str = map.get(46);
            } else {
                str = null;
            }
            bundle.putString("master_clock", str);
            bundle.putLong("master_clock_diff", SystemClock.elapsedRealtime());
            bundle.putSerializable("texture", this);
            obtainMessage.setData(bundle);
            Message message = this.LLIIIILZ;
            obtainMessage.obj = message;
            synchronized (message) {
                obtainMessage.sendToTarget();
                try {
                    this.LLIIIILZ.wait();
                    Message message2 = this.LLIIIILZ;
                    int i3 = message2.arg1;
                    if (i3 != Integer.MIN_VALUE && i3 != j) {
                        message2.wait();
                    }
                } catch (InterruptedException e) {
                    C16880lQ.LLLLIIL(e);
                }
            }
        } catch (Exception e2) {
            C16880lQ.LLLLIIL(e2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0050, code lost:
    
        if (r9.LLJLIL != 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00a2, code lost:
    
        if (r1.contains("EGL_EXT_gl_colorspace_bt2020_pq") != false) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean handleSurfaceChange(boolean r10, android.opengl.EGLSurface r11, int r12) {
        /*
            Method dump skipped, instructions count: 263
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C79445VFx.handleSurfaceChange(boolean, android.opengl.EGLSurface, int):boolean");
    }

    public void notifyError(int i, int i2, String str) {
        Integer num;
        try {
            HashMap<Integer, Integer> hashMap = this.LLJI;
            if (hashMap != null && this.LLJIJIL != null && ((num = hashMap.get(Integer.valueOf(i2))) == null || num.intValue() == 0)) {
                this.LLJI.put(Integer.valueOf(i2), Integer.valueOf(i));
                this.LLJIJIL.put(Integer.valueOf(i2), str);
            }
            this.LJLL.LJIIJJI(i, i2, str);
        } catch (Exception unused) {
        }
    }

    public void setEffectOpen(int i, int i2, Bundle bundle) {
        float f;
        VGA j2n;
        Display defaultDisplay;
        this.mConfig.LIZJ(i, i2);
        if (i == 8) {
            if (i2 == 1) {
                if (this.mVsyncHelper == null) {
                    Context context = C47988IsS.LIZLLL().LIZLLL;
                    int i3 = this.LLIIIJ;
                    if (C56509MFt.LJIIJJI()) {
                        j2n = new J2O();
                    } else {
                        float f2 = 60.0f;
                        if (bundle != null) {
                            f = bundle.getFloat("vsync_fps");
                        } else {
                            f = 60.0f;
                        }
                        if (context != null) {
                            context = C16880lQ.LLLLL(context);
                            WindowManager windowManager = (WindowManager) C16880lQ.LLILL(context, "window");
                            if (windowManager != null && (defaultDisplay = windowManager.getDefaultDisplay()) != null) {
                                f2 = defaultDisplay.getRefreshRate();
                            }
                        }
                        StringBuilder LIZ = X1D.LIZ();
                        LIZ.append("fpsWanted:");
                        LIZ.append(f);
                        LIZ.append(",defaultDisplayRefreshRate:");
                        LIZ.append(f2);
                        C48284IxE.LIZ(1, i3, "VsyncHelperFactory", X1D.LIZIZ(LIZ));
                        if (f >= f2 || f <= 0.0f) {
                            j2n = new J2N(context, i3);
                        } else {
                            j2n = new J2R(i3, f);
                        }
                    }
                    this.mVsyncHelper = j2n;
                }
                this.mVsyncHelper.setEnable(true);
                this.mVsyncHelper.LIZJ(this);
                return;
            }
            VGA vga = this.mVsyncHelper;
            if (vga == null) {
                return;
            }
            vga.LIZIZ(this);
        }
    }

    public void setOption(int i, int i2, int i3) {
        HashMap<Integer, Integer> hashMap;
        if (i != 19) {
            if (i != 126 || (hashMap = this.LLJI) == null) {
                return;
            }
            hashMap.put(Integer.valueOf(i2), Integer.valueOf(i3));
            return;
        }
        if (i2 < 0) {
            return;
        }
        this.LLIIJLIL.put(Integer.valueOf(i2), Integer.valueOf(i3));
    }

    public void setOption(int i, int i2, String str) {
        HashMap<Integer, String> hashMap;
        if (i != 127 || (hashMap = this.LLJIJIL) == null) {
            return;
        }
        hashMap.put(Integer.valueOf(i2), str);
    }

    public C79445VFx(VGC vgc, boolean z, Handler handler, VG0 vg0) {
        super(vgc.lock(), z);
        this.LJLILLLLZI = false;
        this.LJLJI = false;
        this.LJLJJI = false;
        this.LJLJJL = EGL14.EGL_NO_SURFACE;
        this.LJLJJLL = 0;
        this.LJLJL = 0;
        this.LJLJLJ = null;
        this.LJLJLLL = null;
        this.LJLL = null;
        this.LJLLJ = 0;
        this.LLFZ = false;
        this.LLI = false;
        this.LLII = -1L;
        this.LLIIII = 0;
        this.LLIIIILZ = new Message();
        this.LLIIIJ = -1;
        this.LLIIIL = 0;
        this.mConfig = new C48262Iws(-1);
        this.LLIIJI = new LinkedList<>();
        this.LLIIJLIL = new HashMap<>();
        this.LLIIL = new Bundle();
        this.LLIILII = 3;
        this.LLIL = 0;
        this.LLILII = LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX;
        this.LLILIL = LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX;
        this.LLILL = 0.0f;
        this.LLILLIZIL = LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX;
        this.LLILLJJLI = 0;
        this.LLILLL = new HashMap<>();
        this.LLILZ = new HashMap<>();
        this.LLILZIL = new HashMap<>();
        this.LLILZLL = LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX;
        this.LLIZ = LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX;
        this.LLIZLLLIL = 0;
        this.LLJ = 0.0f;
        this.LLJI = new HashMap<>();
        this.LLJIJIL = new HashMap<>();
        this.LLJILJIL = Float.MIN_VALUE;
        this.LLJILJILJ = Float.MIN_VALUE;
        this.LLJILLL = null;
        this.LLJJ = 0;
        this.LLJJI = 0;
        this.LLJJIII = null;
        this.LLJJIJI = 0;
        this.LLJJIJIIJIL = 0;
        this.LLJJIJIL = 0;
        this.LLJJJ = null;
        this.LLJJJIL = 0;
        this.LLJJJJJIL = -1;
        this.mLayoutMode = 1;
        this.mLayoutRatio = 0.5f;
        this.mRotationType = 0;
        this.mIsMirrorHorizontal = 0;
        this.mIsMirrorVertical = 0;
        this.LLJJJJLIIL = null;
        this.LLJJL = null;
        this.LLJJLIIIJLLLLLLLZ = 1;
        this.mHasFrameCome = false;
        this.LLJL = 0;
        this.LLJLIL = 0;
        this.LLJLILLLLZIIL = 8;
        this.LLJLL = null;
        this.mHeadposeCallbackIntegral = 1;
        this.LLJLLIL = 0;
        vgc.LIZIZ();
        this.LJLIL = vgc;
        vgc.unlock();
        LIZIZ(handler);
        this.LLIFFJFJJ = new HashMap<>();
        this.LLIIIZ = vg0;
    }

    public synchronized void setSuperResolutionConfig(int i, String str, String str2, String str3, int i2, int i3, String str4) {
        Handler handler = this.LJLLILLLL;
        if (handler != null) {
            Message obtainMessage = handler.obtainMessage(12);
            obtainMessage.obj = this;
            Bundle bundle = new Bundle();
            bundle.putInt("effect_type", 5);
            bundle.putInt("action", 21);
            bundle.putInt("srAlgType", i);
            bundle.putInt("srMaxSizeWidth", i2);
            bundle.putInt("srMaxSizeHeight", i3);
            bundle.putString("kernelBinPath", str);
            bundle.putString("oclModleName", str2);
            bundle.putString("dspModleName", str3);
            bundle.putString("moduleName", str4);
            obtainMessage.setData(bundle);
            this.LJLLILLLL.sendMessageAtFrontOfQueue(obtainMessage);
        }
    }
}
