package X;

import java.io.Closeable;
import java.lang.reflect.Method;

/* renamed from: X.Pql, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65719Pql implements InterfaceC65721Pqn {
    public static final C65719Pql LIZ = new C65719Pql();
    public static final Method LIZIZ;

    public static void LIZIZ(Object obj, Method method, Object[] objArr) {
        if (new C03880Dg(2).LIZJ(110000, "java/lang/reflect/Method", "invoke", method, new Object[]{obj, objArr}, "java.lang.Object", new C65300Pk0(true, "(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;", "-3481345237380663801")).LIZ) {
            return;
        }
        method.invoke(obj, objArr);
    }

    static {
        Method method;
        try {
            method = Throwable.class.getMethod("addSuppressed", Throwable.class);
        } catch (Throwable unused) {
            method = null;
        }
        LIZIZ = method;
    }

    @Override // X.InterfaceC65721Pqn
    public final void LIZ(Closeable closeable, Throwable th, Throwable th2) {
        if (th == th2) {
            return;
        }
        try {
            LIZIZ(th, LIZIZ, new Object[]{th2});
        } catch (Throwable unused) {
            C65720Pqm.LIZ.LIZ(closeable, th, th2);
        }
    }
}
