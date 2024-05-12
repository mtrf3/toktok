package X;

import Y.ARunnableS42S0100000_6;
import com.ss.android.ugc.bytex.pthread.base.proxy.PThreadScheduledThreadPoolExecutor;
import com.ss.android.ugc.bytex.thread_rename.base.DefaultThreadFactory;
import java.lang.reflect.Method;
import java.util.concurrent.TimeUnit;

/* loaded from: classes7.dex */
public final class FNC implements InterfaceC38856FMu {
    public static final int[] LJI = {4194304, 16777215, 4194560, 16777215, 4194816, 16777215, 21005056, 100, 21037056, 1};
    public Object LIZ;
    public Method LIZIZ;
    public PThreadScheduledThreadPoolExecutor LIZJ;
    public int[] LIZLLL;
    public int LJ;
    public final ARunnableS42S0100000_6 LJFF = new ARunnableS42S0100000_6(this, 114);

    public static Object LJ(Object obj, Method method, Object[] objArr) {
        C39519Ff9 LIZJ = new C03880Dg(2).LIZJ(110000, "java/lang/reflect/Method", "invoke", method, new Object[]{obj, objArr}, "java.lang.Object", new C65300Pk0(true, "(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;", "4120273445306112431"));
        return LIZJ.LIZ ? LIZJ.LIZIZ : method.invoke(obj, objArr);
    }

    @Override // X.InterfaceC38856FMu
    public final void LIZIZ(boolean z) {
    }

    @Override // X.InterfaceC38856FMu
    public final boolean LIZJ() {
        try {
            Method method = this.LIZIZ;
            if (method != null) {
                LJ(this.LIZ, method, new Object[]{0, 5000, LJI});
            }
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    @Override // X.InterfaceC38856FMu
    public final boolean LIZLLL() {
        try {
            Class<?> cls = Class.forName("com.mediatek.powerhalmgr.PowerHalMgrImpl");
            Method LIZ = C36500EUe.LIZ(cls, "getInstance", new Class[0]);
            if (LIZ != null) {
                this.LIZ = LJ(null, LIZ, new Object[0]);
            }
            if (this.LIZ != null) {
                Class cls2 = Integer.TYPE;
                Method LIZ2 = C36500EUe.LIZ(cls, "perfLockAcquire", cls2, cls2, int[].class);
                this.LIZIZ = LIZ2;
                if (LIZ2 != null) {
                    this.LIZJ = new PThreadScheduledThreadPoolExecutor(1, new DefaultThreadFactory("e/MTKHardWare"));
                    return true;
                }
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    @Override // X.InterfaceC38856FMu
    public final int getType() {
        return 2;
    }

    @Override // X.InterfaceC38856FMu
    public final void LIZ(int i, int i2, int[] iArr) {
        int[] iArr2 = LJI;
        int i3 = 0;
        int i4 = 1;
        try {
            if (i2 == 0) {
                Method method = this.LIZIZ;
                if (method != null) {
                    Object obj = this.LIZ;
                    Object[] objArr = new Object[3];
                    objArr[0] = 0;
                    objArr[1] = Integer.valueOf(i);
                    if (iArr == null) {
                        iArr = iArr2;
                    }
                    objArr[2] = iArr;
                    LJ(obj, method, objArr);
                    return;
                }
                return;
            }
            int i5 = (int) ((i / (i2 * 1.0f)) + 0.5f);
            if (iArr == null) {
                iArr = iArr2;
            }
            this.LIZLLL = iArr;
            if (i5 >= 2) {
                this.LJ = i2;
                i4 = i5;
            } else {
                this.LJ = i;
            }
            do {
                PThreadScheduledThreadPoolExecutor pThreadScheduledThreadPoolExecutor = this.LIZJ;
                if (pThreadScheduledThreadPoolExecutor != null) {
                    pThreadScheduledThreadPoolExecutor.schedule(this.LJFF, i2 * i3, TimeUnit.MILLISECONDS);
                }
                i3++;
            } while (i3 < i4);
        } catch (Throwable unused) {
        }
    }
}
