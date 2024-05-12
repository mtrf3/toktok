package X;

import Y.ARunnableS42S0100000_6;
import android.os.Build;
import com.ss.android.ugc.bytex.pthread.base.proxy.PThreadScheduledThreadPoolExecutor;
import com.ss.android.ugc.bytex.thread_rename.base.DefaultThreadFactory;
import java.lang.reflect.Method;
import java.util.concurrent.TimeUnit;

/* loaded from: classes7.dex */
public final class FNB implements InterfaceC38856FMu {
    public Object LIZ;
    public Method LIZIZ;
    public PThreadScheduledThreadPoolExecutor LIZJ;
    public int[] LIZLLL;
    public final ARunnableS42S0100000_6 LJ = new ARunnableS42S0100000_6(this, 113);

    public static Object LJ(Object obj, Method method, Object[] objArr) {
        C39519Ff9 LIZJ = new C03880Dg(2).LIZJ(110000, "java/lang/reflect/Method", "invoke", method, new Object[]{obj, objArr}, "java.lang.Object", new C65300Pk0(true, "(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;", "-7476094520242459836"));
        return LIZJ.LIZ ? LIZJ.LIZIZ : method.invoke(obj, objArr);
    }

    @Override // X.InterfaceC38856FMu
    public final boolean LIZJ() {
        try {
            Method method = this.LIZIZ;
            if (method != null) {
                int i = Build.VERSION.SDK_INT;
                if (i >= 29) {
                    LJ(null, method, new Object[]{"UniperfClient", 4099});
                } else if (i >= 26) {
                    if (this.LIZLLL == null) {
                        this.LIZLLL = new int[]{5000};
                    }
                    LJ(this.LIZ, method, new Object[]{4099, "", this.LIZLLL});
                }
            }
            int i2 = 1;
            do {
                PThreadScheduledThreadPoolExecutor pThreadScheduledThreadPoolExecutor = this.LIZJ;
                if (pThreadScheduledThreadPoolExecutor != null) {
                    pThreadScheduledThreadPoolExecutor.schedule(this.LJ, i2 * 1000, TimeUnit.MILLISECONDS);
                }
                i2++;
            } while (i2 < 5);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    @Override // X.InterfaceC38856FMu
    public final boolean LIZLLL() {
        try {
            int i = Build.VERSION.SDK_INT;
            if (i >= 29) {
                Class<?> cls = Class.forName("android.rms.iaware.IAwareSdk");
                this.LIZ = cls;
                Method LIZ = C36500EUe.LIZ(cls, "asyncSendData", String.class, Integer.TYPE);
                this.LIZIZ = LIZ;
                if (LIZ != null) {
                    this.LIZJ = new PThreadScheduledThreadPoolExecutor(1, new DefaultThreadFactory("KirinHardWare"));
                    return true;
                }
            } else if (i >= 26) {
                Class<?> cls2 = Class.forName("android.iawareperf.UniPerf");
                Method LIZ2 = C36500EUe.LIZ(cls2, "getInstance", new Class[0]);
                if (LIZ2 != null) {
                    this.LIZ = LJ(null, LIZ2, new Object[0]);
                }
                if (this.LIZ != null) {
                    Method LIZ3 = C36500EUe.LIZ(cls2, "uniPerfEvent", Integer.TYPE, String.class, int[].class);
                    this.LIZIZ = LIZ3;
                    if (LIZ3 != null) {
                        this.LIZJ = new PThreadScheduledThreadPoolExecutor(1, new DefaultThreadFactory("KirinHardWare"));
                        return true;
                    }
                }
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    @Override // X.InterfaceC38856FMu
    public final int getType() {
        return 3;
    }

    @Override // X.InterfaceC38856FMu
    public final void LIZIZ(boolean z) {
        if (!z) {
            this.LIZJ.shutdownNow();
            this.LIZJ = null;
            this.LIZLLL = null;
        }
    }

    @Override // X.InterfaceC38856FMu
    public final void LIZ(int i, int i2, int[] iArr) {
        int i3 = (int) (i / 1000.0f);
        for (int i4 = 0; i4 < i3; i4++) {
            PThreadScheduledThreadPoolExecutor pThreadScheduledThreadPoolExecutor = this.LIZJ;
            if (pThreadScheduledThreadPoolExecutor != null) {
                pThreadScheduledThreadPoolExecutor.schedule(this.LJ, i4 * 1000, TimeUnit.MILLISECONDS);
            }
        }
    }
}
