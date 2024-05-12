package X;

import Y.ARunnableS42S0100000_6;
import com.ss.android.ugc.bytex.pthread.base.proxy.PThreadScheduledThreadPoolExecutor;
import com.ss.android.ugc.bytex.thread_rename.base.DefaultThreadFactory;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.concurrent.TimeUnit;

/* loaded from: classes7.dex */
public final class FNA implements InterfaceC38856FMu {
    public static final int[] LJI = {1086324736, 1, 1082130432, 4095, 1082130688, 4095, 1086455808, 40, 1086439424, 60, 1082130944, 4095};
    public Object LIZ;
    public Method LIZIZ;
    public PThreadScheduledThreadPoolExecutor LIZJ;
    public int[] LIZLLL;
    public int LJ;
    public final ARunnableS42S0100000_6 LJFF = new ARunnableS42S0100000_6(this, 115);

    public static void LJ(Object obj, Method method, Object[] objArr) {
        if (new C03880Dg(2).LIZJ(110000, "java/lang/reflect/Method", "invoke", method, new Object[]{obj, objArr}, "java.lang.Object", new C65300Pk0(true, "(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;", "-1283820698711290347")).LIZ) {
            return;
        }
        method.invoke(obj, objArr);
    }

    @Override // X.InterfaceC38856FMu
    public final void LIZIZ(boolean z) {
    }

    @Override // X.InterfaceC38856FMu
    public final boolean LIZJ() {
        try {
            Method method = this.LIZIZ;
            if (method != null) {
                LJ(this.LIZ, method, new Object[]{5000, LJI});
            }
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    @Override // X.InterfaceC38856FMu
    public final boolean LIZLLL() {
        Constructor[] constructorArr;
        try {
            Class<?> cls = Class.forName("com.qualcomm.qti.Performance");
            try {
                constructorArr = (Constructor[]) Class.class.getDeclaredMethod("getDeclaredConstructors", new Class[0]).invoke(cls, new Object[0]);
            } catch (Throwable unused) {
                constructorArr = null;
            }
            if (constructorArr != null) {
                if (constructorArr.length > 1) {
                    this.LIZ = constructorArr[1].newInstance(C92J.LIZ.LJFF);
                } else if (constructorArr.length == 1) {
                    this.LIZ = constructorArr[0].newInstance(new Object[0]);
                }
            }
            if (this.LIZ != null) {
                Method LIZ = C36500EUe.LIZ(cls, "perfLockAcquire", Integer.TYPE, int[].class);
                this.LIZIZ = LIZ;
                if (LIZ != null) {
                    this.LIZJ = new PThreadScheduledThreadPoolExecutor(1, new DefaultThreadFactory("/QcomHardWare"));
                    return true;
                }
            }
        } catch (Throwable unused2) {
        }
        return false;
    }

    @Override // X.InterfaceC38856FMu
    public final int getType() {
        return 1;
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
                    Object[] objArr = new Object[2];
                    objArr[0] = Integer.valueOf(i);
                    if (iArr == null) {
                        iArr = iArr2;
                    }
                    objArr[1] = iArr;
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
