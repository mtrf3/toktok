package X;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: X.0Ei, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C04160Ei {
    public static final C04160Ei LIZLLL = new C04160Ei();
    public final Class<?> LIZ;
    public final Object LIZIZ;
    public Method LIZJ;

    public C04160Ei() {
        try {
            Class<?> cls = Class.forName("com.vivo.gamewatch.common.GameWatchManager");
            this.LIZ = cls;
            this.LIZIZ = cls.getMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
            C16880lQ.LLLLIIL(e);
        }
    }

    public static Object LIZIZ(Object obj, Method method, Object[] objArr) {
        C39519Ff9 LIZJ = new C03880Dg(2).LIZJ(110000, "java/lang/reflect/Method", "invoke", method, new Object[]{obj, objArr}, "java.lang.Object", new C65300Pk0(true, "(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;", "87525427161"));
        return LIZJ.LIZ ? LIZJ.LIZIZ : method.invoke(obj, objArr);
    }

    public final Object[] LIZ(String str, Object... objArr) {
        Class<?> cls;
        if (this.LIZIZ == null || (cls = this.LIZ) == null) {
            return null;
        }
        try {
            if (this.LIZJ == null) {
                this.LIZJ = cls.getMethod("execute", String.class, Object[].class);
            }
            return (Object[]) LIZIZ(this.LIZIZ, this.LIZJ, new Object[]{str, objArr});
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
            C16880lQ.LLLLIIL(e);
            return null;
        }
    }
}
