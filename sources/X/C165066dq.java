package X;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashMap;

/* renamed from: X.6dq, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C165066dq {
    public static final Method LIZ;
    public static final HashMap<String, Field> LIZIZ = new HashMap<>();

    public static Object LIZ(Object obj, Method method, Object[] objArr) {
        C39519Ff9 LIZJ = new C03880Dg(2).LIZJ(110000, "java/lang/reflect/Method", "invoke", method, new Object[]{obj, objArr}, "java.lang.Object", new C65300Pk0(true, "(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;", "5031768878975767838"));
        return LIZJ.LIZ ? LIZJ.LIZIZ : method.invoke(obj, objArr);
    }

    static {
        try {
            Method declaredMethod = Class.class.getDeclaredMethod("getDeclaredField", String.class);
            LIZ = declaredMethod;
            declaredMethod.setAccessible(true);
        } catch (Throwable unused) {
        }
    }

    public static Field LIZIZ(Class cls, String str) {
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(cls.getName());
        LIZ2.append(".");
        LIZ2.append(str);
        String LIZIZ2 = X1D.LIZIZ(LIZ2);
        HashMap<String, Field> hashMap = LIZIZ;
        if (hashMap.containsKey(LIZIZ2)) {
            return hashMap.get(LIZIZ2);
        }
        Field field = null;
        while (cls != null && cls != Object.class) {
            try {
                Method method = LIZ;
                if (method != null) {
                    field = (Field) LIZ(cls, method, new Object[]{str});
                } else {
                    field = cls.getDeclaredField(str);
                }
                field.setAccessible(true);
            } catch (Throwable unused) {
            }
            if (field != null) {
                LIZIZ.put(LIZIZ2, field);
                return field;
            }
            cls = cls.getSuperclass();
        }
        LIZIZ.put(LIZIZ2, null);
        return null;
    }
}
