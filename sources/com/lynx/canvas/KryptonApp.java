package com.lynx.canvas;

import X.C16880lQ;
import X.J0Q;
import X.O5Y;
import X.PPT;
import X.VEZ;
import X.X1D;
import android.content.Context;
import android.hardware.SensorManager;
import com.lynx.canvas.hardware.HardwareManager;
import com.lynx.canvas.loader.CanvasResourceLoader;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* loaded from: classes12.dex */
public class KryptonApp {
    public final Context LIZ;
    public long LIZIZ;
    public boolean LIZJ;
    public final LinkedHashMap<Class, J0Q> LIZLLL = new LinkedHashMap<>();
    public final CanvasPermissionManager LJ;

    private native void nativeBootstrap(long j, long j2);

    private native long nativeCreateInstance(CanvasResourceLoader canvasResourceLoader, KryptonApp kryptonApp);

    private native long nativeCreateWeakPtr(long j);

    private native void nativeDestroyInstance(long j);

    private native void nativeOnHide(long j);

    private native void nativeOnShow(long j);

    private native void nativePause(long j);

    private native void nativeResume(long j);

    private native void nativeSetDevicePixelRatio(long j, float f);

    private native void nativeSetGPUTaskRunner(long j, long j2);

    private native void nativeSetRuntimeActor(long j, long j2);

    private native void nativeSetRuntimeId(long j, long j2);

    private native void nativeSetRuntimeTaskRunner(long j, long j2);

    public final long LIZJ() {
        long j;
        synchronized (this) {
            long j2 = this.LIZIZ;
            j = 0;
            if (j2 != 0) {
                j = nativeCreateWeakPtr(j2);
            }
        }
        return j;
    }

    public final void LIZIZ() {
        if (this.LIZJ) {
            return;
        }
        O5Y.LJJJ("KryptonApp", "destroy");
        this.LIZJ = true;
        long j = this.LIZIZ;
        if (j != 0) {
            synchronized (this) {
                this.LIZIZ = 0L;
            }
            nativeDestroyInstance(j);
        }
        Iterator<J0Q> it = this.LIZLLL.values().iterator();
        while (it.hasNext()) {
            it.next().getClass();
        }
        this.LIZLLL.clear();
    }

    public final void LIZLLL() {
        if (this.LIZJ) {
            return;
        }
        O5Y.LJJJ("KryptonApp", "onHide");
        long j = this.LIZIZ;
        if (j != 0) {
            nativeOnHide(j);
        }
        Iterator<J0Q> it = this.LIZLLL.values().iterator();
        while (it.hasNext()) {
            it.next().getClass();
        }
    }

    public final void LJ() {
        if (this.LIZJ) {
            return;
        }
        O5Y.LJJJ("KryptonApp", "onShow");
        long j = this.LIZIZ;
        if (j != 0) {
            nativeOnShow(j);
        }
        Iterator<J0Q> it = this.LIZLLL.values().iterator();
        while (it.hasNext()) {
            it.next().getClass();
        }
    }

    public final void finalize() {
        if (!this.LIZJ) {
            O5Y.LJIILIIL("KryptonApp", "Destroy function must be called to prevent native object leakage");
        }
    }

    public KryptonApp(Context context) {
        O5Y.LJJJ("KryptonApp", "construct");
        this.LIZ = context;
        HardwareManager LIZ = HardwareManager.LIZ();
        LIZ.getClass();
        LIZ.LIZJ = (PPT) VEZ.LIZIZ().LIZ(PPT.class);
        LIZ.LIZIZ = (SensorManager) C16880lQ.LLILL(context, "sensor");
        this.LJ = new CanvasPermissionManager();
        long nativeCreateInstance = nativeCreateInstance(new CanvasResourceLoader(this), this);
        this.LIZIZ = nativeCreateInstance;
        if (nativeCreateInstance != 0) {
            nativeSetDevicePixelRatio(nativeCreateInstance, context.getResources().getDisplayMetrics().density);
        } else {
            O5Y.LJIILIIL("KryptonApp", "construct error! nativeCreateInstance result null");
        }
    }

    public final void LIZ(long j) {
        if (this.LIZJ) {
            return;
        }
        O5Y.LJJJ("KryptonApp", "bootstrap.");
        long j2 = this.LIZIZ;
        if (j2 != 0) {
            nativeBootstrap(j2, j);
        }
        Iterator<J0Q> it = this.LIZLLL.values().iterator();
        while (it.hasNext()) {
            it.next().getClass();
        }
    }

    public final void LJI(long j) {
        long j2 = this.LIZIZ;
        if (j2 != 0) {
            nativeSetGPUTaskRunner(j2, j);
        } else {
            O5Y.LJIILIIL("KryptonApp", "setGPUTaskRunner should be called after init");
        }
    }

    public final void LJII(long j) {
        long j2 = this.LIZIZ;
        if (j2 != 0) {
            nativeSetRuntimeActor(j2, j);
        } else {
            O5Y.LJIILIIL("KryptonApp", "setRuntimeActor should be called after init");
        }
    }

    public final void LJIIIIZZ(long j) {
        long j2 = this.LIZIZ;
        if (j2 != 0) {
            nativeSetRuntimeId(j2, j);
        }
    }

    public final void LJIIIZ(long j) {
        long j2 = this.LIZIZ;
        if (j2 != 0) {
            nativeSetRuntimeTaskRunner(j2, j);
        } else {
            O5Y.LJIILIIL("KryptonApp", "setRuntimeTaskRunner should be called after init");
        }
    }

    public final <T extends J0Q> void LJFF(Class cls, T t) {
        if (this.LIZJ) {
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("register service: ");
        LIZ.append(cls.getName());
        O5Y.LJJJ("KryptonApp", X1D.LIZIZ(LIZ));
        this.LIZLLL.put(cls, t);
    }
}
