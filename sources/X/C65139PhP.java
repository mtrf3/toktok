package X;

import defpackage.b1;
import java.lang.annotation.Annotation;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;

/* renamed from: X.PhP, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65139PhP {
    public static final Type[] LIZ = new Type[0];

    public static void LIZIZ(Type type) {
        if (!(type instanceof Class) || !((Class) type).isPrimitive()) {
        } else {
            throw new IllegalArgumentException();
        }
    }

    public static Class<?> LJFF(Type type) {
        LIZ(type, "type == null");
        if (type instanceof Class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            Type rawType = ((ParameterizedType) type).getRawType();
            if (rawType instanceof Class) {
                return (Class) rawType;
            }
            throw new IllegalArgumentException();
        }
        if (type instanceof GenericArrayType) {
            return Array.newInstance(LJFF(((GenericArrayType) type).getGenericComponentType()), 0).getClass();
        }
        if (type instanceof TypeVariable) {
            return Object.class;
        }
        if (type instanceof WildcardType) {
            return LJFF(((WildcardType) type).getUpperBounds()[0]);
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("Expected a Class, ParameterizedType, or GenericArrayType, but <");
        LIZ2.append(type);
        LIZ2.append("> is of type ");
        LIZ2.append(type.getClass().getName());
        throw new IllegalArgumentException(X1D.LIZIZ(LIZ2));
    }

    public static boolean LJII(Type type) {
        String name;
        if (type instanceof Class) {
            return false;
        }
        if (type instanceof ParameterizedType) {
            for (Type type2 : ((ParameterizedType) type).getActualTypeArguments()) {
                if (LJII(type2)) {
                    return true;
                }
            }
            return false;
        }
        if (type instanceof GenericArrayType) {
            return LJII(((GenericArrayType) type).getGenericComponentType());
        }
        if ((type instanceof TypeVariable) || (type instanceof WildcardType)) {
            return true;
        }
        if (type == null) {
            name = "null";
        } else {
            name = type.getClass().getName();
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("Expected a Class, ParameterizedType, or GenericArrayType, but <");
        LIZ2.append(type);
        LIZ2.append("> is of type ");
        LIZ2.append(name);
        throw new IllegalArgumentException(X1D.LIZIZ(LIZ2));
    }

    public static boolean LJIIL(String str) {
        if (str.equals("POST") || str.equals("PUT") || str.equals("PATCH") || str.equals("PROPPATCH") || str.equals("REPORT")) {
            return true;
        }
        return false;
    }

    public static String LJIILJJIL(Type type) {
        if (type instanceof Class) {
            return ((Class) type).getName();
        }
        return type.toString();
    }

    public static void LIZ(Object obj, String str) {
        if (obj != null) {
        } else {
            throw new NullPointerException(str);
        }
    }

    public static boolean LIZJ(Type type, Type type2) {
        if (type == type2) {
            return true;
        }
        if (type instanceof Class) {
            return type.equals(type2);
        }
        if (type instanceof ParameterizedType) {
            if (!(type2 instanceof ParameterizedType)) {
                return false;
            }
            ParameterizedType parameterizedType = (ParameterizedType) type;
            ParameterizedType parameterizedType2 = (ParameterizedType) type2;
            Type ownerType = parameterizedType.getOwnerType();
            Type ownerType2 = parameterizedType2.getOwnerType();
            if ((ownerType == ownerType2 || (ownerType != null && ownerType.equals(ownerType2))) && parameterizedType.getRawType().equals(parameterizedType2.getRawType()) && Arrays.equals(parameterizedType.getActualTypeArguments(), parameterizedType2.getActualTypeArguments())) {
                return true;
            }
            return false;
        }
        if (type instanceof GenericArrayType) {
            if (!(type2 instanceof GenericArrayType)) {
                return false;
            }
            return LIZJ(((GenericArrayType) type).getGenericComponentType(), ((GenericArrayType) type2).getGenericComponentType());
        }
        if (type instanceof WildcardType) {
            if (!(type2 instanceof WildcardType)) {
                return false;
            }
            WildcardType wildcardType = (WildcardType) type;
            WildcardType wildcardType2 = (WildcardType) type2;
            if (Arrays.equals(wildcardType.getUpperBounds(), wildcardType2.getUpperBounds()) && Arrays.equals(wildcardType.getLowerBounds(), wildcardType2.getLowerBounds())) {
                return true;
            }
            return false;
        }
        if (!(type instanceof TypeVariable) || !(type2 instanceof TypeVariable)) {
            return false;
        }
        TypeVariable typeVariable = (TypeVariable) type;
        TypeVariable typeVariable2 = (TypeVariable) type2;
        if (typeVariable.getGenericDeclaration() == typeVariable2.getGenericDeclaration() && typeVariable.getName().equals(typeVariable2.getName())) {
            return true;
        }
        return false;
    }

    public static Type LJ(int i, ParameterizedType parameterizedType) {
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        if (i >= 0 && i < actualTypeArguments.length) {
            Type type = actualTypeArguments[i];
            if (type instanceof WildcardType) {
                return ((WildcardType) type).getUpperBounds()[0];
            }
            return type;
        }
        StringBuilder LJ = C7MY.LJ("Index ", i, " not in range [0,");
        LJ.append(actualTypeArguments.length);
        LJ.append(") for ");
        LJ.append(parameterizedType);
        throw new IllegalArgumentException(X1D.LIZIZ(LJ));
    }

    public static boolean LJIIIIZZ(Annotation[] annotationArr, Class<? extends Annotation> cls) {
        for (Annotation annotation : annotationArr) {
            if (cls.isInstance(annotation)) {
                return true;
            }
        }
        return false;
    }

    public static Type LIZLLL(Type type, Class<?> cls, Class<?> cls2) {
        if (cls2 == cls) {
            return type;
        }
        if (cls2.isInterface()) {
            Class<?>[] interfaces = cls.getInterfaces();
            int length = interfaces.length;
            for (int i = 0; i < length; i++) {
                Class<?> cls3 = interfaces[i];
                if (cls3 == cls2) {
                    return cls.getGenericInterfaces()[i];
                }
                if (cls2.isAssignableFrom(cls3)) {
                    return LIZLLL(cls.getGenericInterfaces()[i], interfaces[i], cls2);
                }
            }
        }
        if (!cls.isInterface()) {
            while (cls != Object.class) {
                Class<? super Object> superclass = cls.getSuperclass();
                if (superclass == cls2) {
                    return cls.getGenericSuperclass();
                }
                if (cls2.isAssignableFrom(superclass)) {
                    return LIZLLL(cls.getGenericSuperclass(), superclass, cls2);
                }
                cls = superclass;
            }
        }
        return cls2;
    }

    public static Type LJI(Type type, Class<?> cls, Class<?> cls2) {
        if (cls2.isAssignableFrom(cls)) {
            return LJIILIIL(type, cls, LIZLLL(type, cls, cls2));
        }
        throw new IllegalArgumentException();
    }

    /* JADX WARN: Code restructure failed: missing block: B:0:?, code lost:
    
        r9 = r9;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0016 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0017 A[LOOP:0: B:1:0x0000->B:9:0x0017, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.reflect.Type LJIILIIL(java.lang.reflect.Type r7, java.lang.Class<?> r8, java.lang.reflect.Type r9) {
        /*
            Method dump skipped, instructions count: 256
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C65139PhP.LJIILIIL(java.lang.reflect.Type, java.lang.Class, java.lang.reflect.Type):java.lang.reflect.Type");
    }

    public static RuntimeException LJIIIZ(Method method, Throwable th, String str, Object... objArr) {
        StringBuilder LIZJ = b1.LIZJ(C16880lQ.LLLZ(str, objArr), "\n    for method ");
        LIZJ.append(C16880lQ.LJLLJ(method.getDeclaringClass()));
        LIZJ.append(".");
        LIZJ.append(method.getName());
        return new IllegalArgumentException(X1D.LIZIZ(LIZJ), th);
    }

    public static RuntimeException LJIIJ(Method method, int i, String str, Object... objArr) {
        StringBuilder LIZJ = b1.LIZJ(str, " (parameter #");
        LIZJ.append(i + 1);
        LIZJ.append(")");
        return LJIIIZ(method, null, X1D.LIZIZ(LIZJ), objArr);
    }

    public static RuntimeException LJIIJJI(Method method, Throwable th, int i, String str, Object... objArr) {
        StringBuilder LIZJ = b1.LIZJ(str, " (parameter #");
        LIZJ.append(i + 1);
        LIZJ.append(")");
        return LJIIIZ(method, th, X1D.LIZIZ(LIZJ), objArr);
    }
}
