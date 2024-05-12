package X;

import java.lang.reflect.Method;
import java.util.HashMap;

/* renamed from: X.EVr, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36539EVr {
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

    public static Class<?>[] LIZJ(Object... objArr) {
        Class<?> cls;
        if (objArr == null || objArr.length <= 0) {
            return null;
        }
        Class<?>[] clsArr = new Class[objArr.length];
        for (int i = 0; i < objArr.length; i++) {
            Object obj = objArr[i];
            if (obj != null) {
                if (obj instanceof C152575yn) {
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

    public static Object[] LIZLLL(Object... objArr) {
        if (objArr == null || objArr.length <= 0) {
            return null;
        }
        Object[] objArr2 = new Object[objArr.length];
        for (int i = 0; i < objArr.length; i++) {
            Object obj = objArr[i];
            if (obj != null && (obj instanceof C152575yn)) {
                objArr2[i] = null;
            } else {
                objArr2[i] = obj;
            }
        }
        return objArr2;
    }

    public static Object LIZ(Class cls, Object... objArr) {
        Method LIZIZ = LIZIZ(cls, LIZJ(objArr));
        Object[] LIZLLL = LIZLLL(objArr);
        C39519Ff9 LIZJ = new C03880Dg(2).LIZJ(110000, "java/lang/reflect/Method", "invoke", LIZIZ, new Object[]{null, LIZLLL}, "java.lang.Object", new C65300Pk0(true, "(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;", "-8622896911124752065"));
        if (LIZJ.LIZ) {
            return LIZJ.LIZIZ;
        }
        return LIZIZ.invoke(null, LIZLLL);
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

    public static Object LJ(String str, Class[] clsArr, Object... objArr) {
        try {
            return Class.forName(str).getConstructor(clsArr).newInstance(LIZLLL(LIZLLL(objArr)));
        } catch (Exception unused) {
            return null;
        }
    }
}
