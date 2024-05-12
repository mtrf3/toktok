package X;

import java.lang.reflect.Method;
import java.util.HashMap;

/* loaded from: classes7.dex */
public final class EW3 {
    public static final java.util.Map<Class<?>, Class<?>> LIZ;

    public static Object LIZ(Object obj, Method method, Object[] objArr) {
        C39519Ff9 LIZJ = new C03880Dg(2).LIZJ(110000, "java/lang/reflect/Method", "invoke", method, new Object[]{obj, objArr}, "java.lang.Object", new C65300Pk0(true, "(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;", "7201824671671951855"));
        return LIZJ.LIZ ? LIZJ.LIZIZ : method.invoke(obj, objArr);
    }

    static {
        HashMap hashMap = new HashMap();
        LIZ = hashMap;
        Class cls = Boolean.TYPE;
        hashMap.put(Boolean.class, cls);
        hashMap.put(Byte.class, Byte.TYPE);
        hashMap.put(Character.class, Character.TYPE);
        hashMap.put(Short.class, Short.TYPE);
        Class cls2 = Integer.TYPE;
        hashMap.put(Integer.class, cls2);
        Class cls3 = Float.TYPE;
        hashMap.put(Float.class, cls3);
        Class cls4 = Long.TYPE;
        hashMap.put(Long.class, cls4);
        hashMap.put(Double.class, Double.TYPE);
        hashMap.put(cls, cls);
        Class cls5 = Byte.TYPE;
        hashMap.put(cls5, cls5);
        Class cls6 = Character.TYPE;
        hashMap.put(cls6, cls6);
        Class cls7 = Short.TYPE;
        hashMap.put(cls7, cls7);
        hashMap.put(cls2, cls2);
        hashMap.put(cls3, cls3);
        hashMap.put(cls4, cls4);
        Class cls8 = Double.TYPE;
        hashMap.put(cls8, cls8);
    }

    public static Class<?>[] LIZJ(Object... objArr) {
        Class<?> cls;
        if (objArr.length <= 0) {
            return null;
        }
        Class<?>[] clsArr = new Class[objArr.length];
        for (int i = 0; i < objArr.length; i++) {
            Object obj = objArr[i];
            if (obj != null) {
                if (obj instanceof EW4) {
                    clsArr[i] = ((EW4) obj).LIZ;
                } else {
                    cls = obj.getClass();
                }
            } else {
                cls = null;
            }
            clsArr[i] = cls;
        }
        return clsArr;
    }

    public static Object[] LIZLLL(Object... objArr) {
        if (objArr.length > 0) {
            Object[] objArr2 = new Object[objArr.length];
            for (int i = 0; i < objArr.length; i++) {
                Object obj = objArr[i];
                if (obj != null && (obj instanceof EW4)) {
                    objArr2[i] = ((EW4) obj).LIZIZ;
                } else {
                    objArr2[i] = obj;
                }
            }
            return objArr2;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.reflect.AccessibleObject, java.lang.reflect.Method] */
    public static Method LIZIZ(Class<?> cls, String str, Class<?>... clsArr) {
        try {
            cls = cls.getDeclaredMethod(str, clsArr);
            if (cls != 0) {
                cls.setAccessible(true);
                return cls;
            }
            throw new NoSuchMethodException();
        } catch (NoSuchMethodException unused) {
            if (cls.getSuperclass() != null) {
                return LIZIZ(cls.getSuperclass(), str, clsArr);
            }
            throw new NoSuchMethodException();
        }
    }
}
