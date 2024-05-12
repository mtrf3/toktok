package X;

import android.os.Build;
import android.os.Looper;
import android.os.Message;
import java.io.PrintStream;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;

/* renamed from: X.0M1, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0M1 {
    public static volatile boolean LIZ;
    public static volatile boolean LIZIZ;
    public static Object LIZJ;
    public static Method LIZLLL;
    public static Method LJ;
    public static Method LJFF;
    public static final Thread LJI = C16880lQ.LLJJJJ().getThread();
    public static C0M0 LJII;

    public static void LIZ(Method method, Object[] objArr) {
        if (new C03880Dg(2).LIZJ(110000, "java/lang/reflect/Method", "invoke", method, new Object[]{null, objArr}, "java.lang.Object", new C65300Pk0(true, "(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;", "-1934817244841990898")).LIZ) {
            return;
        }
        method.invoke(null, objArr);
    }

    public static List<InterfaceC06150Lz> LIZIZ() {
        C0M0 c0m0 = LJII;
        if (c0m0 != null) {
            return c0m0.mObservers;
        }
        return null;
    }

    public static synchronized boolean LIZJ() {
        Object obj;
        synchronized (C0M1.class) {
            if (LIZ) {
                return true;
            }
            if (Build.VERSION.SDK_INT >= 29) {
                try {
                    try {
                        Field field = (Field) Class.class.getDeclaredMethod("getDeclaredField", String.class).invoke(Looper.class, "sObserver");
                        field.setAccessible(true);
                        obj = field.get(null);
                    } catch (Exception e) {
                        C16880lQ.LLLLIIL(e);
                        obj = null;
                    }
                    LIZJ = obj;
                    if (obj != null) {
                        LIZLLL = LIZLLL(obj.getClass(), "messageDispatchStarting", new Class[0]);
                        LJ = LIZLLL(LIZJ.getClass(), "messageDispatched", Object.class, Message.class);
                        LJFF = LIZLLL(LIZJ.getClass(), "dispatchingThrewException", Object.class, Message.class, Exception.class);
                    }
                    if (LIZLLL == null || LJ == null || LJFF == null) {
                        LIZJ = null;
                    }
                    LJII = (C0M0) Class.forName("com.bytedance.observer.ObserverWrapper").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                    if (LIZJ != null) {
                        PrintStream printStream = System.out;
                        StringBuilder LIZ2 = X1D.LIZ();
                        LIZ2.append("LooperObserverMonitor.init: ");
                        LIZ2.append(LIZJ);
                        printStream.println(X1D.LIZIZ(LIZ2));
                        LJII.setup(LIZJ);
                    }
                    LIZ(LIZLLL(Looper.class, "setObserver", Class.forName("android.os.Looper$Observer")), new Object[]{LJII});
                    LIZ = true;
                    return LIZ;
                } catch (Throwable unused) {
                    LIZJ = null;
                }
            }
            LJII = new C0M0();
            LIZJ = null;
            LIZIZ = true;
            LIZ = true;
            return LIZ;
        }
    }

    public static Method LIZLLL(Class cls, String str, Class<?>... clsArr) {
        try {
            Method method = (Method) Class.class.getDeclaredMethod("getDeclaredMethod", String.class, Class[].class).invoke(cls, str, clsArr);
            method.setAccessible(true);
            return method;
        } catch (Exception unused) {
            return null;
        }
    }
}
