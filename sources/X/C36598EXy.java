package X;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;

/* renamed from: X.EXy, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36598EXy {
    public final Object LIZ;

    public static Object LIZLLL(Object obj, Method method, Object[] objArr) {
        C39519Ff9 LIZJ = new C03880Dg(2).LIZJ(110000, "java/lang/reflect/Method", "invoke", method, new Object[]{obj, objArr}, "java.lang.Object", new C65300Pk0(true, "(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;", "-158571791211337907"));
        return LIZJ.LIZ ? LIZJ.LIZIZ : method.invoke(obj, objArr);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        return this.LIZ.toString();
    }

    public C36598EXy(Object obj) {
        this.LIZ = obj;
    }

    public static <T extends AccessibleObject> T LIZ(T t) {
        if (t == null) {
            return null;
        }
        if (t instanceof Member) {
            Member member = (Member) t;
            if (Modifier.isPublic(member.getModifiers()) && Modifier.isPublic(member.getDeclaringClass().getModifiers())) {
                return t;
            }
        }
        if (!t.isAccessible()) {
            t.setAccessible(true);
        }
        return t;
    }

    public static Class<?> LJIIIZ(Class<?> cls) {
        if (cls == null) {
            return null;
        }
        if (cls.isPrimitive()) {
            if (Boolean.TYPE == cls) {
                return Boolean.class;
            }
            if (Integer.TYPE == cls) {
                return Integer.class;
            }
            if (Long.TYPE == cls) {
                return Long.class;
            }
            if (Short.TYPE == cls) {
                return Short.class;
            }
            if (Byte.TYPE == cls) {
                return Byte.class;
            }
            if (Double.TYPE == cls) {
                return Double.class;
            }
            if (Float.TYPE == cls) {
                return Float.class;
            }
            if (Character.TYPE == cls) {
                return Character.class;
            }
            if (Void.TYPE == cls) {
                return Void.class;
            }
            return cls;
        }
        return cls;
    }

    public final C36598EXy LIZIZ(String str) {
        return LIZJ(str, null, new Object[0]);
    }

    public final Field LJFF(Class... clsArr) {
        Class<?> cls = this.LIZ.getClass();
        if (clsArr.length <= 0) {
            try {
                return cls.getField("detailMessage");
            } catch (NoSuchFieldException e) {
                do {
                    try {
                        return (Field) LIZ(cls.getDeclaredField("detailMessage"));
                    } catch (NoSuchFieldException unused) {
                        cls = cls.getSuperclass();
                        if (cls == null) {
                            throw new C36599EXz(e);
                        }
                    }
                } while (cls == null);
                throw new C36599EXz(e);
            }
        }
        do {
            try {
                for (Field field : cls.getDeclaredFields()) {
                    Class<?> type = field.getType();
                    if (type != null && type.getName().equals(clsArr[0].getName()) && field.getName().equals("detailMessage")) {
                        return (Field) LIZ(field);
                    }
                }
            } catch (Exception unused2) {
            }
            cls = cls.getSuperclass();
        } while (cls != null);
        throw new C36599EXz("NoSuchFieldException");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C36598EXy) {
            return this.LIZ.equals(((C36598EXy) obj).LIZ);
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Class] */
    /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.reflect.Method] */
    /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.reflect.Method] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Class] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Class] */
    public final Method LJ(String str, Class... clsArr) {
        Class cls = this.LIZ.getClass();
        try {
            cls = cls.getMethod(str, clsArr);
            return cls;
        } catch (NoSuchMethodException unused) {
            do {
                try {
                    cls = cls.getDeclaredMethod(str, clsArr);
                    return cls;
                } catch (NoSuchMethodException unused2) {
                    cls = cls.getSuperclass();
                }
            } while (cls != 0);
            Class<?> cls2 = this.LIZ.getClass();
            for (Method method : cls2.getMethods()) {
                if (str.equals(method.getName())) {
                    Class<?>[] parameterTypes = method.getParameterTypes();
                    int i = 1;
                    for (Class<?> cls3 : parameterTypes) {
                        StringBuilder LIZ = X1D.LIZ();
                        LIZ.append("Reflect type = ");
                        LIZ.append(cls2);
                        LIZ.append(" method = ");
                        LIZ.append(str);
                        LIZ.append(" paramTypes ");
                        LIZ.append(i);
                        LIZ.append(" = ");
                        LIZ.append(cls3.getName());
                        X1D.LIZIZ(LIZ);
                        i++;
                    }
                    if (parameterTypes.length == clsArr.length) {
                        return method;
                    }
                }
            }
            throw new NoSuchMethodException();
        }
    }

    public final Method LJIIIIZZ(String str, Class<?>[] clsArr) {
        Class<?> cls = this.LIZ.getClass();
        for (Method method : cls.getMethods()) {
            if (LJI(method, str, clsArr)) {
                return method;
            }
        }
        do {
            for (Method method2 : cls.getDeclaredMethods()) {
                if (LJI(method2, str, clsArr)) {
                    return method2;
                }
            }
            cls = cls.getSuperclass();
        } while (cls != null);
        StringBuilder LIZIZ = C25620zW.LIZIZ("No similar method ", str, " with params ");
        LIZIZ.append(Arrays.toString(clsArr));
        LIZIZ.append(" could be found on type ");
        LIZIZ.append(this.LIZ.getClass());
        LIZIZ.append(".");
        throw new NoSuchMethodException(X1D.LIZIZ(LIZIZ));
    }

    public static boolean LJI(Method method, String str, Class[] clsArr) {
        if (!method.getName().equals(str)) {
            return false;
        }
        Class<?>[] parameterTypes = method.getParameterTypes();
        if (parameterTypes.length != clsArr.length) {
            return false;
        }
        for (int i = 0; i < clsArr.length; i++) {
            if (clsArr[i] != EY0.class && !LJIIIZ(parameterTypes[i]).isAssignableFrom(LJIIIZ(clsArr[i]))) {
                return false;
            }
        }
        return true;
    }

    public static C36598EXy LJII(Object obj, Method method, Object... objArr) {
        try {
            LIZ(method);
            if (method.getReturnType() == Void.TYPE) {
                LIZLLL(obj, method, objArr);
                return new C36598EXy(obj);
            }
            return new C36598EXy(LIZLLL(obj, method, objArr));
        } catch (Exception e) {
            throw new C36599EXz(e);
        }
    }

    public final C36598EXy LIZJ(String str, Class<?>[] clsArr, Object... objArr) {
        try {
            try {
                return LJII(this.LIZ, LJ(str, clsArr), objArr);
            } catch (NoSuchMethodException unused) {
                return LJII(this.LIZ, LJIIIIZZ(str, clsArr), objArr);
            }
        } catch (NoSuchMethodException e) {
            throw new C36599EXz(e);
        }
    }
}
