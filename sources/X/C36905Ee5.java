package X;

import com.lynx.tasm.base.LLog;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.Ee5, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36905Ee5 {
    public static Method LIZ;
    public static Method LIZIZ;
    public static Object LIZJ;
    public static final AtomicBoolean LIZLLL = new AtomicBoolean(false);

    public static Object LIZ(Object obj, Method method, Object[] objArr) {
        C39519Ff9 LIZJ2 = new C03880Dg(2).LIZJ(110000, "java/lang/reflect/Method", "invoke", method, new Object[]{obj, objArr}, "java.lang.Object", new C65300Pk0(true, "(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;", "4279440211354695514"));
        return LIZJ2.LIZ ? LIZJ2.LIZIZ : method.invoke(obj, objArr);
    }

    public static void LIZIZ() {
        AtomicBoolean atomicBoolean = LIZLLL;
        if (!atomicBoolean.get()) {
            atomicBoolean.set(true);
            try {
                Class<?> cls = Class.forName("com.lynx.devtool.LynxDevtoolEnv");
                LIZJ = cls.getMethod("inst", new Class[0]).invoke(null, new Object[0]);
                LIZ = cls.getMethod("setDevtoolEnv", String.class, Boolean.class);
                cls.getMethod("setDevtoolEnv", String.class, java.util.Set.class);
                LIZIZ = cls.getMethod("getDevtoolEnv", String.class, Boolean.class);
                cls.getMethod("getDevtoolEnv", String.class);
            } catch (Exception e) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("LynxDevtoolUtils prepareMethod failed: ");
                LIZ2.append(e.toString());
                LLog.LIZLLL(4, "LynxDevtoolUtils", X1D.LIZIZ(LIZ2));
            }
        }
    }
}
