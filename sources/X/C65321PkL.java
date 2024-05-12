package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.PkL, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65321PkL {
    public static Type LIZ(WildcardType wildcardType) {
        Type[] lowerBounds = wildcardType.getLowerBounds();
        if (lowerBounds.length != 0) {
            return lowerBounds[0];
        }
        return wildcardType.getUpperBounds()[0];
    }

    public static <T> Iterable<T> LJ(Object obj) {
        if (obj instanceof Iterable) {
            return (Iterable) obj;
        }
        Class<?> cls = obj.getClass();
        C77357UXp.LJ("not an array or Iterable: %s", cls.isArray(), cls);
        if (!cls.getComponentType().isPrimitive()) {
            return Arrays.asList((Object[]) obj);
        }
        return new C65322PkM(obj);
    }

    public static <T> T LJFF(Class<T> cls) {
        try {
            return cls.newInstance();
        } catch (IllegalAccessException e) {
            throw LIZLLL(e, cls);
        } catch (InstantiationException e2) {
            throw LIZLLL(e2, cls);
        }
    }

    public static Class<?> LIZIZ(List<Type> list, Type type) {
        boolean z;
        if (type instanceof TypeVariable) {
            type = LJI(list, (TypeVariable) type);
        }
        if (type instanceof GenericArrayType) {
            return Array.newInstance(LIZIZ(list, ((GenericArrayType) type).getGenericComponentType()), 0).getClass();
        }
        if (type instanceof Class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            return (Class) ((ParameterizedType) type).getRawType();
        }
        if (type == null) {
            z = true;
        } else {
            z = false;
        }
        C77357UXp.LJ("wildcard type is not supported: %s", z, type);
        return Object.class;
    }

    public static ParameterizedType LIZJ(Type type, Class<?> cls) {
        Class<?> cls2;
        Class<?> cls3;
        if ((type instanceof Class) || (type instanceof ParameterizedType)) {
            while (type != null && type != Object.class) {
                if (type instanceof Class) {
                    cls2 = (Class) type;
                } else {
                    ParameterizedType parameterizedType = (ParameterizedType) type;
                    Class<?> cls4 = (Class) parameterizedType.getRawType();
                    if (cls4 == cls) {
                        return parameterizedType;
                    }
                    if (cls.isInterface()) {
                        Type[] genericInterfaces = cls4.getGenericInterfaces();
                        int length = genericInterfaces.length;
                        for (int i = 0; i < length; i++) {
                            type = genericInterfaces[i];
                            if (type instanceof Class) {
                                cls3 = (Class) type;
                            } else {
                                cls3 = (Class) ((ParameterizedType) type).getRawType();
                            }
                            if (cls.isAssignableFrom(cls3)) {
                                break;
                            }
                        }
                    }
                    cls2 = cls4;
                }
                type = cls2.getGenericSuperclass();
            }
            return null;
        }
        return null;
    }

    public static IllegalArgumentException LIZLLL(Exception exc, Class<?> cls) {
        StringBuilder sb = new StringBuilder("unable to create new instance of class ");
        sb.append(cls.getName());
        ArrayList arrayList = new ArrayList();
        boolean z = false;
        if (cls.isArray()) {
            arrayList.add("because it is an array");
        } else if (cls.isPrimitive()) {
            arrayList.add("because it is primitive");
        } else if (cls == Void.class) {
            arrayList.add("because it is void");
        } else {
            if (Modifier.isInterface(cls.getModifiers())) {
                arrayList.add("because it is an interface");
            } else if (Modifier.isAbstract(cls.getModifiers())) {
                arrayList.add("because it is abstract");
            }
            if (cls.getEnclosingClass() != null && !Modifier.isStatic(cls.getModifiers())) {
                arrayList.add("because it is not static");
            }
            if (!Modifier.isPublic(cls.getModifiers())) {
                arrayList.add("possibly because it is not public");
            } else {
                try {
                    cls.getConstructor(new Class[0]);
                } catch (NoSuchMethodException unused) {
                    arrayList.add("because it has no accessible default constructor");
                }
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (z) {
                sb.append(" and");
            } else {
                z = true;
            }
            sb.append(" ");
            sb.append(str);
        }
        return new IllegalArgumentException(sb.toString(), exc);
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.reflect.GenericDeclaration] */
    public static Type LJI(List<Type> list, TypeVariable<?> typeVariable) {
        ParameterizedType LIZJ;
        Type LJI;
        ?? genericDeclaration = typeVariable.getGenericDeclaration();
        if (genericDeclaration instanceof Class) {
            Class cls = (Class) genericDeclaration;
            int size = list.size();
            do {
                size--;
                if (size >= 0) {
                    LIZJ = LIZJ((Type) ListProtector.get(list, size), cls);
                }
            } while (LIZJ == null);
            TypeVariable<?>[] typeParameters = genericDeclaration.getTypeParameters();
            int i = 0;
            while (i < typeParameters.length && !typeParameters[i].equals(typeVariable)) {
                i++;
            }
            Type type = LIZJ.getActualTypeArguments()[i];
            if ((type instanceof TypeVariable) && (LJI = LJI(list, (TypeVariable) type)) != null) {
                return LJI;
            }
            return type;
        }
        return null;
    }
}
