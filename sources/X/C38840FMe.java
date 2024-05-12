package X;

import Y.ARunnableS18S0101000_14;
import java.lang.reflect.Method;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.FMe, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38840FMe {
    public static volatile C38840FMe LJIIIZ;
    public long[] LIZ;
    public boolean LIZIZ;
    public Method LIZLLL;
    public Object[] LJ;
    public final java.util.Map<String, C38854FMs> LIZJ = new ConcurrentHashMap();
    public int LJFF = 0;
    public long LJI = -1;
    public ARunnableS18S0101000_14 LJII = null;
    public final java.util.Set<InterfaceC120964ou> LJIIIIZZ = Q4K.LIZLLL();

    public static long LIZIZ(long j) {
        if (j < 0 || j >= 60000) {
            return 0L;
        }
        return j;
    }

    public static void LIZJ(Object obj, Method method, Object[] objArr) {
        if (new C03880Dg(2).LIZJ(110000, "java/lang/reflect/Method", "invoke", method, new Object[]{obj, objArr}, "java.lang.Object", new C65300Pk0(true, "(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;", "2831797630660083464")).LIZ) {
            return;
        }
        method.invoke(obj, objArr);
    }

    public static C38840FMe LIZLLL() {
        if (LJIIIZ == null) {
            synchronized (C38840FMe.class) {
                if (LJIIIZ == null) {
                    LJIIIZ = new C38840FMe();
                }
            }
        }
        return LJIIIZ;
    }

    public final void LIZ() {
        Object[] objArr;
        if (this.LJII == null) {
            this.LJII = new ARunnableS18S0101000_14(3, this, 16);
        }
        ARunnableS18S0101000_14 aRunnableS18S0101000_14 = this.LJII;
        synchronized (this) {
            int i = this.LJFF;
            if (i >= 0) {
                try {
                    Method method = this.LIZLLL;
                    if (method != null && (objArr = this.LJ) != null) {
                        LIZJ(objArr[i], method, new Object[]{-1L, aRunnableS18S0101000_14, null});
                    }
                } catch (Exception unused) {
                }
            }
        }
    }
}
