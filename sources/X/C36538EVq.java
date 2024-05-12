package X;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashMap;

/* renamed from: X.EVq, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36538EVq {
    public static final java.util.Map<Class<?>, Class<?>> LIZ;

    public static Object LIZ(Object obj, Method method, Object[] objArr) {
        C39519Ff9 LIZJ = new C03880Dg(2).LIZJ(110000, "java/lang/reflect/Method", "invoke", method, new Object[]{obj, objArr}, "java.lang.Object", new C65300Pk0(true, "(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;", "-924846435240292852"));
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

    public static Class<?>[] LJ(Object... objArr) {
        Class<?> cls;
        if (objArr.length <= 0) {
            return null;
        }
        Class<?>[] clsArr = new Class[objArr.length];
        for (int i = 0; i < objArr.length; i++) {
            Object obj = objArr[i];
            if (obj != null) {
                if (obj instanceof C36536EVo) {
                    clsArr[i] = null;
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

    public static Object[] LJFF(Object... objArr) {
        if (objArr.length <= 0) {
            return null;
        }
        Object[] objArr2 = new Object[objArr.length];
        for (int i = 0; i < objArr.length; i++) {
            Object obj = objArr[i];
            if (obj != null && (obj instanceof C36536EVo)) {
                objArr2[i] = null;
            } else {
                objArr2[i] = obj;
            }
        }
        return objArr2;
    }

    public static <T> T LIZJ(Object obj, String str) {
        try {
            return (T) LIZLLL(obj, str);
        } catch (IllegalAccessException e) {
            C16880lQ.LLLLIIL(e);
            return null;
        } catch (NoSuchFieldException e2) {
            C16880lQ.LLLLIIL(e2);
            return null;
        }
    }

    public static <T> T LIZLLL(Object obj, String str) {
        Class<?> cls = obj.getClass();
        Field field = null;
        while (field == null) {
            try {
                field = cls.getDeclaredField(str);
                field.setAccessible(true);
            } catch (NoSuchFieldException unused) {
                cls = cls.getSuperclass();
            }
            if (cls == null) {
                throw new NoSuchFieldException();
            }
        }
        field.setAccessible(true);
        return (T) field.get(obj);
    }

    public static Method LIZIZ(Class<?> cls, String str, Class<?>... clsArr) {
        for (Method method : cls.getDeclaredMethods()) {
            if (method.getName().equals(str)) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes == null) {
                    if (clsArr != null && clsArr.length != 0) {
                    }
                    method.setAccessible(true);
                    return method;
                }
                if (clsArr == null) {
                    if (parameterTypes.length == 0) {
                        method.setAccessible(true);
                        return method;
                    }
                } else {
                    if (parameterTypes.length == clsArr.length) {
                        for (int i = 0; i < parameterTypes.length; i++) {
                            if (!parameterTypes[i].isAssignableFrom(clsArr[i])) {
                                HashMap hashMap = (HashMap) LIZ;
                                if (hashMap.containsKey(parameterTypes[i]) && hashMap.get(parameterTypes[i]).equals(hashMap.get(clsArr[i]))) {
                                }
                            }
                        }
                        method.setAccessible(true);
                        return method;
                    }
                    continue;
                }
            }
        }
        if (cls.getSuperclass() != null) {
            return LIZIZ(cls.getSuperclass(), str, clsArr);
        }
        throw new NoSuchMethodException();
    }

    public static void LJI(Object obj, Object obj2, String str) {
        try {
            LJII(obj, obj2, str);
        } catch (IllegalAccessException e) {
            C16880lQ.LLLLIIL(e);
        } catch (NoSuchFieldException e2) {
            C16880lQ.LLLLIIL(e2);
        }
    }

    public static void LJII(Object obj, Object obj2, String str) {
        Class<?> cls = obj.getClass();
        Field field = null;
        do {
            try {
                field = cls.getDeclaredField(str);
            } catch (NoSuchFieldException unused) {
                cls = cls.getSuperclass();
                if (cls == null) {
                    throw new NoSuchFieldException();
                }
            }
        } while (field == null);
        field.setAccessible(true);
        field.set(obj, obj2);
    }
}
