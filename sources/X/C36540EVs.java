package X;

import java.lang.reflect.Method;
import java.util.HashMap;

/* renamed from: X.EVs, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36540EVs {
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

    public static Object LIZ(Class cls, Object... objArr) {
        Class[] clsArr;
        Object[] objArr2;
        Class<?> cls2;
        if (objArr.length > 0) {
            clsArr = new Class[objArr.length];
            for (int i = 0; i < objArr.length; i++) {
                Object obj = objArr[i];
                if (obj != null) {
                    if (obj instanceof C36541EVt) {
                        clsArr[i] = null;
                    } else {
                        cls2 = obj.getClass();
                    }
                } else {
                    cls2 = null;
                }
                clsArr[i] = cls2;
            }
        } else {
            clsArr = null;
        }
        Method LIZIZ = LIZIZ(cls, clsArr);
        if (objArr.length > 0) {
            objArr2 = new Object[objArr.length];
            for (int i2 = 0; i2 < objArr.length; i2++) {
                Object obj2 = objArr[i2];
                if (obj2 != null && (obj2 instanceof C36541EVt)) {
                    objArr2[i2] = null;
                } else {
                    objArr2[i2] = obj2;
                }
            }
        } else {
            objArr2 = null;
        }
        C39519Ff9 LIZJ = new C03880Dg(2).LIZJ(110000, "java/lang/reflect/Method", "invoke", LIZIZ, new Object[]{null, objArr2}, "java.lang.Object", new C65300Pk0(true, "(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;", "-9049095424003966205"));
        if (LIZJ.LIZ) {
            return LIZJ.LIZIZ;
        }
        return LIZIZ.invoke(null, objArr2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Method LIZIZ(Class cls, Class... clsArr) {
        for (Method method : cls.getDeclaredMethods()) {
            if (method.getName().equals("setPermissions")) {
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
            return LIZIZ(cls.getSuperclass(), clsArr);
        }
        throw new NoSuchMethodException();
    }
}
