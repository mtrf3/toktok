package X;

import Y.ARunnableS9S0000100_8;
import java.lang.reflect.Method;
import kotlin.jvm.internal.o;

/* renamed from: X.JEe, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48824JEe {
    public static Object LIZ;
    public static Object[] LIZIZ;
    public static Object LIZJ;
    public static Method LIZLLL;
    public static Method LJ;
    public static final ARunnableS9S0000100_8 LJFF = new ARunnableS9S0000100_8(1);

    public static void LIZIZ(Object obj, Method method, Object[] objArr) {
        if (new C03880Dg(2).LIZJ(110000, "java/lang/reflect/Method", "invoke", method, new Object[]{obj, objArr}, "java.lang.Object", new C65300Pk0(true, "(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;", "3135453042074217857")).LIZ) {
            return;
        }
        method.invoke(obj, objArr);
    }

    public static void LIZ() {
        if (LIZLLL != null && LIZJ != null) {
            Object obj = LIZ;
            if (obj != null) {
                synchronized (obj) {
                    Method method = LIZLLL;
                    if (method != null) {
                        LIZIZ(LIZJ, method, new Object[]{-1L, LJFF, null});
                    }
                }
                return;
            }
            o.LJIJI("callbackQueueLock");
            throw null;
        }
    }

    public static void LIZJ() {
        if (LIZLLL != null && LIZJ != null) {
            Object obj = LIZ;
            if (obj != null) {
                synchronized (obj) {
                    Method method = LJ;
                    if (method != null) {
                        LIZIZ(LIZJ, method, new Object[]{LJFF, null});
                    }
                }
                return;
            }
            o.LJIJI("callbackQueueLock");
            throw null;
        }
    }
}
