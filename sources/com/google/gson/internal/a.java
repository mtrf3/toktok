package com.google.gson.internal;

import X.C77119UOl;
import X.X1D;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.NoSuchElementException;

/* loaded from: classes12.dex */
public final class a {
    public static final Type[] LIZ = new Type[0];

    /* renamed from: com.google.gson.internal.a$a, reason: collision with other inner class name */
    /* loaded from: classes12.dex */
    public static final class C0020a implements GenericArrayType, Serializable {
        public static final long serialVersionUID = 0;
        public final Type LJLIL;

        public final int hashCode() {
            return this.LJLIL.hashCode();
        }

        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(a.LJIIIIZZ(this.LJLIL));
            LIZ.append("[]");
            return X1D.LIZIZ(LIZ);
        }

        @Override // java.lang.reflect.GenericArrayType
        public final Type getGenericComponentType() {
            return this.LJLIL;
        }

        public C0020a(Type type) {
            this.LJLIL = a.LIZ(type);
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof GenericArrayType) && a.LIZJ(this, (Type) obj)) {
                return true;
            }
            return false;
        }
    }

    /* loaded from: classes12.dex */
    public static final class b implements ParameterizedType, Serializable {
        public static final long serialVersionUID = 0;
        public final Type LJLIL;
        public final Type LJLILLLLZI;
        public final Type[] LJLJI;

        @Override // java.lang.reflect.ParameterizedType
        public final Type[] getActualTypeArguments() {
            return (Type[]) this.LJLJI.clone();
        }

        public final int hashCode() {
            int i;
            int hashCode = Arrays.hashCode(this.LJLJI) ^ this.LJLILLLLZI.hashCode();
            Type type = this.LJLIL;
            if (type != null) {
                i = type.hashCode();
            } else {
                i = 0;
            }
            return hashCode ^ i;
        }

        public final String toString() {
            int length = this.LJLJI.length;
            if (length == 0) {
                return a.LJIIIIZZ(this.LJLILLLLZI);
            }
            StringBuilder sb = new StringBuilder((length + 1) * 30);
            sb.append(a.LJIIIIZZ(this.LJLILLLLZI));
            sb.append("<");
            sb.append(a.LJIIIIZZ(this.LJLJI[0]));
            for (int i = 1; i < length; i++) {
                sb.append(", ");
                sb.append(a.LJIIIIZZ(this.LJLJI[i]));
            }
            sb.append(">");
            return sb.toString();
        }

        @Override // java.lang.reflect.ParameterizedType
        public final Type getOwnerType() {
            return this.LJLIL;
        }

        @Override // java.lang.reflect.ParameterizedType
        public final Type getRawType() {
            return this.LJLILLLLZI;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof ParameterizedType) && a.LIZJ(this, (Type) obj)) {
                return true;
            }
            return false;
        }

        public b(Type type, Type type2, Type... typeArr) {
            Type LIZ;
            boolean z;
            if (type2 instanceof Class) {
                Class cls = (Class) type2;
                boolean z2 = true;
                if (Modifier.isStatic(cls.getModifiers()) || cls.getEnclosingClass() == null) {
                    z = true;
                } else {
                    z = false;
                }
                if (type == null && !z) {
                    z2 = false;
                }
                C77119UOl.LIZJ(z2);
            }
            if (type == null) {
                LIZ = null;
            } else {
                LIZ = a.LIZ(type);
            }
            this.LJLIL = LIZ;
            this.LJLILLLLZI = a.LIZ(type2);
            Type[] typeArr2 = (Type[]) typeArr.clone();
            this.LJLJI = typeArr2;
            int length = typeArr2.length;
            for (int i = 0; i < length; i++) {
                Type type3 = this.LJLJI[i];
                type3.getClass();
                a.LIZIZ(type3);
                Type[] typeArr3 = this.LJLJI;
                typeArr3[i] = a.LIZ(typeArr3[i]);
            }
        }
    }

    /* loaded from: classes12.dex */
    public static final class c implements WildcardType, Serializable {
        public static final long serialVersionUID = 0;
        public final Type LJLIL;
        public final Type LJLILLLLZI;

        @Override // java.lang.reflect.WildcardType
        public final Type[] getUpperBounds() {
            return new Type[]{this.LJLIL};
        }

        @Override // java.lang.reflect.WildcardType
        public final Type[] getLowerBounds() {
            Type type = this.LJLILLLLZI;
            if (type != null) {
                return new Type[]{type};
            }
            return a.LIZ;
        }

        public final int hashCode() {
            int i;
            Type type = this.LJLILLLLZI;
            if (type != null) {
                i = type.hashCode() + 31;
            } else {
                i = 1;
            }
            return i ^ (this.LJLIL.hashCode() + 31);
        }

        public final String toString() {
            if (this.LJLILLLLZI != null) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("? super ");
                LIZ.append(a.LJIIIIZZ(this.LJLILLLLZI));
                return X1D.LIZIZ(LIZ);
            }
            if (this.LJLIL == Object.class) {
                return "?";
            }
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("? extends ");
            LIZ2.append(a.LJIIIIZZ(this.LJLIL));
            return X1D.LIZIZ(LIZ2);
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof WildcardType) && a.LIZJ(this, (Type) obj)) {
                return true;
            }
            return false;
        }

        public c(Type[] typeArr, Type[] typeArr2) {
            boolean z;
            boolean z2;
            if (typeArr2.length <= 1) {
                z = true;
            } else {
                z = false;
            }
            C77119UOl.LIZJ(z);
            if (typeArr.length == 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            C77119UOl.LIZJ(z2);
            if (typeArr2.length == 1) {
                Type type = typeArr2[0];
                type.getClass();
                a.LIZIZ(type);
                C77119UOl.LIZJ(typeArr[0] == Object.class);
                this.LJLILLLLZI = a.LIZ(typeArr2[0]);
                this.LJLIL = Object.class;
                return;
            }
            Type type2 = typeArr[0];
            type2.getClass();
            a.LIZIZ(type2);
            this.LJLILLLLZI = null;
            this.LJLIL = a.LIZ(typeArr[0]);
        }
    }

    public static Type LIZ(Type type) {
        if (type instanceof Class) {
            Class cls = (Class) type;
            if (cls.isArray()) {
                return new C0020a(LIZ(cls.getComponentType()));
            }
            return cls;
        }
        if (type instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type;
            return new b(parameterizedType.getOwnerType(), parameterizedType.getRawType(), parameterizedType.getActualTypeArguments());
        }
        if (type instanceof GenericArrayType) {
            return new C0020a(((GenericArrayType) type).getGenericComponentType());
        }
        if (type instanceof WildcardType) {
            WildcardType wildcardType = (WildcardType) type;
            return new c(wildcardType.getUpperBounds(), wildcardType.getLowerBounds());
        }
        return type;
    }

    public static void LIZIZ(Type type) {
        boolean z;
        if (!(type instanceof Class) || !((Class) type).isPrimitive()) {
            z = true;
        } else {
            z = false;
        }
        C77119UOl.LIZJ(z);
    }

    public static Class<?> LJFF(Type type) {
        String name;
        if (type instanceof Class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            Type rawType = ((ParameterizedType) type).getRawType();
            C77119UOl.LIZJ(rawType instanceof Class);
            return (Class) rawType;
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

    public static String LJIIIIZZ(Type type) {
        if (type instanceof Class) {
            return ((Class) type).getName();
        }
        return type.toString();
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

    public static Type LIZLLL(Type type, Class<?> cls) {
        Type LJI = LJI(type, cls, Collection.class);
        if (LJI instanceof WildcardType) {
            LJI = ((WildcardType) LJI).getUpperBounds()[0];
        }
        if (LJI instanceof ParameterizedType) {
            return ((ParameterizedType) LJI).getActualTypeArguments()[0];
        }
        return Object.class;
    }

    public static Type LJ(Type type, Class<?> cls, Class<?> cls2) {
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
                    return LJ(cls.getGenericInterfaces()[i], interfaces[i], cls2);
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
                    return LJ(cls.getGenericSuperclass(), superclass, cls2);
                }
                cls = superclass;
            }
        }
        return cls2;
    }

    public static Type LJI(Type type, Class<?> cls, Class<?> cls2) {
        if (type instanceof WildcardType) {
            type = ((WildcardType) type).getUpperBounds()[0];
        }
        C77119UOl.LIZJ(cls2.isAssignableFrom(cls));
        return LJII(type, cls, LJ(type, cls, cls2), new HashSet());
    }

    public static Type LJII(Type type, Class<?> cls, Type type2, Collection<TypeVariable> collection) {
        Type[] typeArr;
        Type[] typeArr2;
        boolean z;
        TypeVariable typeVariable;
        Class cls2;
        do {
            int i = 0;
            if (type2 instanceof TypeVariable) {
                typeVariable = (TypeVariable) type2;
                HashSet hashSet = (HashSet) collection;
                if (hashSet.contains(typeVariable)) {
                    return type2;
                }
                hashSet.add(typeVariable);
                GenericDeclaration genericDeclaration = typeVariable.getGenericDeclaration();
                if (genericDeclaration instanceof Class) {
                    cls2 = (Class) genericDeclaration;
                } else {
                    cls2 = null;
                }
                if (cls2 != null) {
                    Type LJ = LJ(type, cls, cls2);
                    if (LJ instanceof ParameterizedType) {
                        TypeVariable[] typeParameters = cls2.getTypeParameters();
                        int length = typeParameters.length;
                        while (i < length) {
                            if (typeVariable.equals(typeParameters[i])) {
                                type2 = ((ParameterizedType) LJ).getActualTypeArguments()[i];
                            } else {
                                i++;
                            }
                        }
                        throw new NoSuchElementException();
                    }
                }
                type2 = typeVariable;
            } else {
                if (type2 instanceof Class) {
                    Class cls3 = (Class) type2;
                    if (cls3.isArray()) {
                        Class<?> componentType = cls3.getComponentType();
                        Type LJII = LJII(type, cls, componentType, collection);
                        if (componentType == LJII) {
                            return cls3;
                        }
                        return new C0020a(LJII);
                    }
                }
                if (type2 instanceof GenericArrayType) {
                    GenericArrayType genericArrayType = (GenericArrayType) type2;
                    Type genericComponentType = genericArrayType.getGenericComponentType();
                    Type LJII2 = LJII(type, cls, genericComponentType, collection);
                    if (genericComponentType == LJII2) {
                        return genericArrayType;
                    }
                    return new C0020a(LJII2);
                }
                if (type2 instanceof ParameterizedType) {
                    ParameterizedType parameterizedType = (ParameterizedType) type2;
                    Type ownerType = parameterizedType.getOwnerType();
                    Type LJII3 = LJII(type, cls, ownerType, collection);
                    if (LJII3 != ownerType) {
                        z = true;
                    } else {
                        z = false;
                    }
                    Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
                    int length2 = actualTypeArguments.length;
                    while (i < length2) {
                        Type LJII4 = LJII(type, cls, actualTypeArguments[i], collection);
                        if (LJII4 != actualTypeArguments[i]) {
                            if (!z) {
                                actualTypeArguments = (Type[]) actualTypeArguments.clone();
                                z = true;
                            }
                            actualTypeArguments[i] = LJII4;
                        }
                        i++;
                    }
                    if (z) {
                        return new b(LJII3, parameterizedType.getRawType(), actualTypeArguments);
                    }
                    return parameterizedType;
                }
                boolean z2 = type2 instanceof WildcardType;
                Type type3 = type2;
                if (z2) {
                    WildcardType wildcardType = (WildcardType) type2;
                    Type[] lowerBounds = wildcardType.getLowerBounds();
                    Type[] upperBounds = wildcardType.getUpperBounds();
                    if (lowerBounds.length == 1) {
                        Type LJII5 = LJII(type, cls, lowerBounds[0], collection);
                        type3 = wildcardType;
                        if (LJII5 != lowerBounds[0]) {
                            if (LJII5 instanceof WildcardType) {
                                typeArr2 = ((WildcardType) LJII5).getLowerBounds();
                            } else {
                                typeArr2 = new Type[]{LJII5};
                            }
                            return new c(new Type[]{Object.class}, typeArr2);
                        }
                    } else {
                        type3 = wildcardType;
                        if (upperBounds.length == 1) {
                            Type LJII6 = LJII(type, cls, upperBounds[0], collection);
                            type3 = wildcardType;
                            if (LJII6 != upperBounds[0]) {
                                if (LJII6 instanceof WildcardType) {
                                    typeArr = ((WildcardType) LJII6).getUpperBounds();
                                } else {
                                    typeArr = new Type[]{LJII6};
                                }
                                return new c(typeArr, LIZ);
                            }
                        }
                    }
                }
                return type3;
            }
        } while (type2 != typeVariable);
        return type2;
    }
}
