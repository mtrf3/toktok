package X;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashMap;

/* renamed from: X.EVu, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36542EVu {
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

    public static Object LIZLLL(Object obj) {
        Class<?> cls = obj.getClass();
        Field field = null;
        while (field == null) {
            try {
                field = cls.getDeclaredField("mPendingActions");
                field.setAccessible(true);
            } catch (NoSuchFieldException unused) {
                cls = cls.getSuperclass();
            }
            if (cls == null) {
                throw new NoSuchFieldException();
            }
        }
        field.setAccessible(true);
        return field.get(obj);
    }

    public static Object LIZ(Object obj, Object... objArr) {
        try {
            return LIZIZ(obj, objArr);
        } catch (Exception e) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("Meet exception when call Method '");
            LIZ2.append("getSubReason");
            LIZ2.append("' in ");
            LIZ2.append(obj);
            C0NB.LIZ.LIZ(X1D.LIZIZ(LIZ2), e);
            return null;
        }
    }

    public static Object LIZIZ(Object obj, Object... objArr) {
        Class[] clsArr;
        Class<?> cls;
        Class<?> cls2 = obj.getClass();
        Object[] objArr2 = null;
        if (objArr.length > 0) {
            clsArr = new Class[objArr.length];
            for (int i = 0; i < objArr.length; i++) {
                Object obj2 = objArr[i];
                if (obj2 != null) {
                    if (obj2 instanceof C30174Bso) {
                        clsArr[i] = null;
                    } else {
                        cls = obj2.getClass();
                    }
                } else {
                    cls = null;
                }
                clsArr[i] = cls;
            }
        } else {
            clsArr = null;
        }
        Method LIZJ = LIZJ(cls2, clsArr);
        if (objArr.length > 0) {
            Object[] objArr3 = new Object[objArr.length];
            for (int i2 = 0; i2 < objArr.length; i2++) {
                Object obj3 = objArr[i2];
                if (obj3 != null && (obj3 instanceof C30174Bso)) {
                    objArr3[i2] = null;
                } else {
                    objArr3[i2] = obj3;
                }
            }
            objArr2 = objArr3;
        }
        C39519Ff9 LIZJ2 = new C03880Dg(2).LIZJ(110000, "java/lang/reflect/Method", "invoke", LIZJ, new Object[]{obj, objArr2}, "java.lang.Object", new C65300Pk0(true, "(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;", "7635358947069716279"));
        if (LIZJ2.LIZ) {
            return LIZJ2.LIZIZ;
        }
        return LIZJ.invoke(obj, objArr2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Method LIZJ(Class cls, Class... clsArr) {
        for (Method method : cls.getDeclaredMethods()) {
            if (method.getName().equals("getSubReason")) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes == 0) {
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
            return LIZJ(cls.getSuperclass(), clsArr);
        }
        throw new NoSuchMethodException();
    }
}
