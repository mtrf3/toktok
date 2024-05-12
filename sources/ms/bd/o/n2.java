package ms.bd.o;

import X.C03880Dg;
import X.C39519Ff9;
import X.C65300Pk0;
import android.app.Activity;
import android.util.ArrayMap;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* loaded from: classes7.dex */
public class n2 {
    public static volatile int LIZ = -1;
    public static volatile String LIZIZ = "";

    public static int LIZ() {
        try {
            return LIZIZ() != null ? 1 : 0;
        } catch (Throwable unused) {
            return -1;
        }
    }

    public static Activity LIZIZ() {
        try {
            Class<?> cls = Class.forName((String) k.a(16777217, 0, 0L, "43fdce", new byte[]{36, 63, 17, 2, 83, 123, 51, 92, 54, 36, 53, Byte.MAX_VALUE, 52, 19, 72, 123, 33, 27, 35, 45, 17, 57, 7, 21, 93, 118}));
            Object LIZJ = LIZJ(cls.getMethod((String) k.a(16777217, 0, 0L, "373607", new byte[]{33, 32, 82, 80, 10, 46, 36, 55, 97, 114, 43, 35, 73, 86, 22, 20, 56, 4, 103, 103, 38}), new Class[0]), new Object[0]);
            Field declaredField = cls.getDeclaredField((String) k.a(16777217, 0, 0L, "9e5bee", new byte[]{37, 70, 69, 2, 83, 100, 51, 80, 109, 55, 59}));
            declaredField.setAccessible(true);
            ArrayMap arrayMap = (ArrayMap) declaredField.get(LIZJ);
            if (arrayMap.size() < 1) {
                return null;
            }
            for (Object obj : arrayMap.values()) {
                Class<?> cls2 = obj.getClass();
                Field declaredField2 = cls2.getDeclaredField((String) k.a(16777217, 0, 0L, "508dd6", new byte[]{52, 51, 94, 3, 94, 37}));
                declaredField2.setAccessible(true);
                if (!declaredField2.getBoolean(obj)) {
                    Field declaredField3 = cls2.getDeclaredField((String) k.a(16777217, 0, 0L, "c13c73", new byte[]{115, 48, 84, 30, 30, 45, 116, 9}));
                    declaredField3.setAccessible(true);
                    return (Activity) declaredField3.get(obj);
                }
            }
            return null;
        } catch (Exception unused) {
            k.a(16777217, 0, 0L, "bfed60", new byte[]{114, 109, 41, 23});
            return null;
        }
    }

    public static Object LIZJ(Method method, Object[] objArr) {
        C39519Ff9 LIZJ = new C03880Dg(2).LIZJ(110000, "java/lang/reflect/Method", "invoke", method, new Object[]{null, objArr}, "java.lang.Object", new C65300Pk0(true, "(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;", "2981384262718824"));
        return LIZJ.LIZ ? LIZJ.LIZIZ : method.invoke(null, objArr);
    }
}
