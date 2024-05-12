package X;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;

/* loaded from: classes7.dex */
public final class EV4 {
    public static final HashMap<String, Method> LIZ = new HashMap<>();
    public static boolean LIZIZ = false;

    public static Object LIZ(Method method, Object[] objArr) {
        C39519Ff9 LIZJ = new C03880Dg(2).LIZJ(110000, "java/lang/reflect/Method", "invoke", method, new Object[]{null, objArr}, "java.lang.Object", new C65300Pk0(true, "(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;", "-8310587090112160835"));
        return LIZJ.LIZ ? LIZJ.LIZIZ : method.invoke(null, objArr);
    }

    public static Method LIZIZ(String str) {
        Method method;
        HashMap<String, Method> hashMap = LIZ;
        if (hashMap.containsKey(str)) {
            return hashMap.get(str);
        }
        try {
            method = C1E4.LJIILIIL(Class.forName("com.ss.android.agilelogger.ALog"), str, new Class[]{String.class, String.class});
        } catch (ClassNotFoundException unused) {
            C70657RoD.LJIILL();
            method = null;
        }
        LIZ.put(str, method);
        return method;
    }

    public static boolean LIZJ(Method method, String str, String str2) {
        boolean z;
        if (LIZIZ) {
            z = true;
        } else {
            try {
                Method LJIILIIL = C1E4.LJIILIIL(Class.forName("com.ss.android.agilelogger.ALog"), "isInitSuccess", null);
                LJIILIIL.setAccessible(true);
                LIZIZ = ((Boolean) LIZ(LJIILIIL, null)).booleanValue();
            } catch (ClassNotFoundException unused) {
                C70657RoD.LJIILL();
            } catch (IllegalAccessException e) {
                C16880lQ.LLLLIIL(e);
            } catch (InvocationTargetException e2) {
                C16880lQ.LLLLIIL(e2);
            }
            z = LIZIZ;
        }
        if (z && method != null) {
            try {
                LIZ(method, new Object[]{str, str2});
                return true;
            } catch (Throwable unused2) {
                C70657RoD.LJIILL();
            }
        }
        return false;
    }
}
