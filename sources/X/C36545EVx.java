package X;

import Y.ARunnableS13S0000000_6;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashMap;

/* renamed from: X.EVx, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36545EVx {
    public static final java.util.Map<Class<?>, Class<?>> LIZ;

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

    public static Class<?>[] LIZLLL(Object... objArr) {
        Class<?> cls;
        if (objArr.length <= 0) {
            return null;
        }
        Class<?>[] clsArr = new Class[objArr.length];
        for (int i = 0; i < objArr.length; i++) {
            Object obj = objArr[i];
            if (obj != null) {
                if (obj instanceof EW2) {
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

    public static Object[] LJ(Object... objArr) {
        if (objArr.length <= 0) {
            return null;
        }
        Object[] objArr2 = new Object[objArr.length];
        for (int i = 0; i < objArr.length; i++) {
            Object obj = objArr[i];
            if (obj != null && (obj instanceof EW2)) {
                objArr2[i] = null;
            } else {
                objArr2[i] = obj;
            }
        }
        return objArr2;
    }

    public static void LJFF(Object obj) {
        ARunnableS13S0000000_6 aRunnableS13S0000000_6 = C36546EVy.LJIIIIZZ;
        Class<?> cls = obj.getClass();
        Field field = null;
        do {
            try {
                field = cls.getDeclaredField("mAnimate");
            } catch (NoSuchFieldException e) {
                C16880lQ.LLLLIIL(e);
                cls = cls.getSuperclass();
                if (cls == null) {
                    throw new NoSuchFieldException();
                }
            }
        } while (field == null);
        field.setAccessible(true);
        Field declaredField = Field.class.getDeclaredField("accessFlags");
        declaredField.setAccessible(true);
        declaredField.setInt(field, field.getModifiers() & (-17));
        field.set(obj, aRunnableS13S0000000_6);
    }

    public static <T> T LIZJ(Object obj, String str) {
        Class<?> cls = obj.getClass();
        Field field = null;
        while (field == null) {
            try {
                field = cls.getDeclaredField(str);
            } catch (NoSuchFieldException e) {
                C16880lQ.LLLLIIL(e);
                try {
                    Field[] fieldArr = (Field[]) Class.class.getDeclaredMethod("getDeclaredFields", new Class[0]).invoke(cls, new Object[0]);
                    for (int i = 0; i < fieldArr.length; i++) {
                        fieldArr[i].setAccessible(true);
                        if (fieldArr[i].getType().getName().equals(str)) {
                            field = fieldArr[i];
                            break;
                        }
                    }
                } catch (Exception e2) {
                    C16880lQ.LLLLIIL(e2);
                }
                field = null;
                cls = cls.getSuperclass();
            }
            if (cls == null) {
                throw new NoSuchFieldException();
            }
        }
        field.setAccessible(true);
        return (T) field.get(obj);
    }

    public static Method LIZ(Method[] methodArr, String str, Class<?>[] clsArr) {
        for (Method method : methodArr) {
            if (method.getName().equals(str)) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes == null) {
                    if (clsArr != null && clsArr.length != 0) {
                    }
                    return method;
                }
                if (clsArr == null) {
                    if (parameterTypes.length == 0) {
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
                        return method;
                    }
                    continue;
                }
            }
        }
        return null;
    }

    public static Method LIZIZ(Class<?> cls, String str, Class<?>... clsArr) {
        Method LIZ2 = LIZ(cls.getDeclaredMethods(), str, clsArr);
        if (LIZ2 == null) {
            try {
                LIZ2 = LIZ((Method[]) Class.class.getDeclaredMethod("getDeclaredMethods", new Class[0]).invoke(cls, new Object[0]), str, clsArr);
                LIZ2.setAccessible(true);
            } catch (Exception e) {
                C16880lQ.LLLLIIL(e);
                LIZ2 = null;
            }
        }
        if (LIZ2 == null) {
            if (cls.getSuperclass() != null) {
                return LIZIZ(cls.getSuperclass(), str, clsArr);
            }
            throw new NoSuchMethodException();
        }
        LIZ2.setAccessible(true);
        return LIZ2;
    }
}
