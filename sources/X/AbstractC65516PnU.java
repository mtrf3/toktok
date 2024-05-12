package X;

import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: X.PnU, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public abstract class AbstractC65516PnU<T> extends AbstractC65512PnQ<T> implements Serializable {
    public transient C65486Pn0 LJLIL;
    public final Type runtimeType;

    /* renamed from: X.PnU$j */
    /* loaded from: classes12.dex */
    public class j extends AbstractC65543Pnv<AbstractC65516PnU<? super T>> implements Serializable {
        public static final long serialVersionUID = 0;
        public transient AbstractC65583PoZ<AbstractC65516PnU<? super T>> LJLIL;

        @Override // X.AbstractC65543Pnv
        /* renamed from: LJIIIZ */
        public java.util.Set<AbstractC65516PnU<? super T>> LJII() {
            AbstractC65583PoZ<AbstractC65516PnU<? super T>> abstractC65583PoZ = this.LJLIL;
            if (abstractC65583PoZ == null) {
                AbstractC65540Pns LIZJ = AbstractC65540Pns.LJFF(AbstractC65539Pnr.LIZ.LIZIZ(AbstractC65590Pog.of(AbstractC65516PnU.this))).LIZJ(EnumC65527Pnf.LJLIL);
                AbstractC65583PoZ<AbstractC65516PnU<? super T>> copyOf = AbstractC65583PoZ.copyOf((Iterable) LIZJ.LJLIL.or((AbstractC65743Pr9<Iterable<E>>) LIZJ));
                this.LJLIL = copyOf;
                return copyOf;
            }
            return abstractC65583PoZ;
        }

        public AbstractC65516PnU<T>.j classes() {
            return new C65538Pnq(AbstractC65516PnU.this);
        }

        public AbstractC65516PnU<T>.j interfaces() {
            return new C65537Pnp(AbstractC65516PnU.this, this);
        }

        public java.util.Set<Class<? super T>> rawTypes() {
            return AbstractC65583PoZ.copyOf((Collection) AbstractC65539Pnr.LIZIZ.LIZIZ(AbstractC65516PnU.this.getRawTypes()));
        }

        @Override // X.AbstractC65543Pnv, X.AbstractC65559PoB, X.AbstractC65561PoD
        public /* bridge */ /* synthetic */ Object LJII() {
            return LJII();
        }

        @Override // X.AbstractC65543Pnv, X.AbstractC65559PoB
        /* renamed from: LJIIIIZZ */
        public /* bridge */ /* synthetic */ Collection LJII() {
            return LJII();
        }

        public j() {
        }
    }

    public final AbstractC65516PnU<?> getComponentType() {
        Type LIZIZ = C65484Pmy.LIZIZ(this.runtimeType);
        if (LIZIZ == null) {
            return null;
        }
        return of(LIZIZ);
    }

    public final AbstractC65516PnU<T>.j getTypes() {
        return new j();
    }

    public int hashCode() {
        return this.runtimeType.hashCode();
    }

    public final boolean isPrimitive() {
        Type type = this.runtimeType;
        if ((type instanceof Class) && ((Class) type).isPrimitive()) {
            return true;
        }
        return false;
    }

    public String toString() {
        Type type = this.runtimeType;
        if (type instanceof Class) {
            return ((Class) type).getName();
        }
        return type.toString();
    }

    public final AbstractC65516PnU<T> unwrap() {
        java.util.Map<Class<?>, Class<?>> map = EWG.LIZIZ;
        if (map.keySet().contains(this.runtimeType)) {
            Class<?> cls = (Class) this.runtimeType;
            cls.getClass();
            Class<?> cls2 = map.get(cls);
            if (cls2 != null) {
                cls = cls2;
            }
            return of((Class) cls);
        }
        return this;
    }

    public Object writeReplace() {
        return of(new C65486Pn0().LIZIZ(this.runtimeType));
    }

    public AbstractC65516PnU() {
        Type LIZ = LIZ();
        this.runtimeType = LIZ;
        C76917UGr.LJIILJJIL("Cannot construct a TypeToken for a type variable.\nYou probably meant to call new TypeToken<%s>(getClass()) that can resolve the type variable for you.\nIf you do need to create a TypeToken of a type variable, please use TypeToken.of() instead.", !(LIZ instanceof TypeVariable), LIZ);
    }

    public final Class<? super T> getRawType() {
        return getRawTypes().iterator().next();
    }

    public AbstractC65583PoZ<Class<? super T>> getRawTypes() {
        C65584Poa builder = AbstractC65583PoZ.builder();
        new C65518PnW(builder).LJIIIZ(this.runtimeType);
        return builder.LJFF();
    }

    public final boolean isArray() {
        if (getComponentType() != null) {
            return true;
        }
        return false;
    }

    public final AbstractC65516PnU<T> wrap() {
        if (isPrimitive()) {
            Class<?> cls = (Class) this.runtimeType;
            cls.getClass();
            Class<?> cls2 = EWG.LIZ.get(cls);
            if (cls2 != null) {
                cls = cls2;
            }
            return of((Class) cls);
        }
        return this;
    }

    public final Type getType() {
        return this.runtimeType;
    }

    public AbstractC65516PnU(Type type) {
        type.getClass();
        this.runtimeType = type;
    }

    public static AbstractC65590Pog LIZIZ(Type[] typeArr) {
        C65587Pod builder = AbstractC65590Pog.builder();
        for (Type type : typeArr) {
            AbstractC65516PnU<?> of = of(type);
            if (of.getRawType().isInterface()) {
                builder.LIZIZ(of);
            }
        }
        return builder.LJ();
    }

    public static <T> AbstractC65516PnU<? extends T> LJ(Class<T> cls) {
        Type type;
        if (cls.isArray()) {
            return (AbstractC65516PnU<? extends T>) of(C65484Pmy.LIZJ(LJ(cls.getComponentType()).runtimeType));
        }
        TypeVariable<Class<T>>[] typeParameters = cls.getTypeParameters();
        if (cls.isMemberClass() && !Modifier.isStatic(cls.getModifiers())) {
            type = LJ(cls.getEnclosingClass()).runtimeType;
        } else {
            type = null;
        }
        if (typeParameters.length > 0 || (type != null && type != cls.getEnclosingClass())) {
            return (AbstractC65516PnU<? extends T>) of(C65484Pmy.LJ(type, cls, typeParameters));
        }
        return of((Class) cls);
    }

    public static <T> AbstractC65516PnU<T> of(Class<T> cls) {
        return new C65525Pnd(cls);
    }

    public final boolean LIZLLL(Class<?> cls) {
        AbstractC65557Po9<Class<? super T>> it = getRawTypes().iterator();
        while (it.hasNext()) {
            if (cls.isAssignableFrom(it.next())) {
                return true;
            }
        }
        return false;
    }

    public final AbstractC65522Pna<T, T> constructor(Constructor<?> constructor) {
        boolean z;
        if (constructor.getDeclaringClass() == getRawType()) {
            z = true;
        } else {
            z = false;
        }
        C76917UGr.LIZIZ(constructor, getRawType(), "%s not declared by %s", z);
        return new C65517PnV(this, constructor);
    }

    public boolean equals(Object obj) {
        if (obj instanceof AbstractC65516PnU) {
            return this.runtimeType.equals(((AbstractC65516PnU) obj).runtimeType);
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0081, code lost:
    
        if (getRawType().getTypeParameters().length != 0) goto L20;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.reflect.Type] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.AbstractC65516PnU<? extends T> getSubtype(java.lang.Class<?> r6) {
        /*
            r5 = this;
            java.lang.reflect.Type r0 = r5.runtimeType
            boolean r0 = r0 instanceof java.lang.reflect.TypeVariable
            r1 = r0 ^ 1
            java.lang.String r0 = "Cannot get subtype of type variable <%s>"
            X.C76917UGr.LIZLLL(r0, r1, r5)
            java.lang.reflect.Type r1 = r5.runtimeType
            boolean r0 = r1 instanceof java.lang.reflect.WildcardType
            if (r0 == 0) goto L3f
            java.lang.reflect.WildcardType r1 = (java.lang.reflect.WildcardType) r1
            java.lang.reflect.Type[] r1 = r1.getLowerBounds()
            int r0 = r1.length
            if (r0 <= 0) goto L26
            r0 = 0
            r0 = r1[r0]
            X.PnU r0 = of(r0)
            X.PnU r0 = r0.getSubtype(r6)
            return r0
        L26:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            r1.append(r6)
            java.lang.String r0 = " isn't a subclass of "
            r1.append(r0)
            r1.append(r5)
            java.lang.String r0 = X.X1D.LIZIZ(r1)
            r2.<init>(r0)
            throw r2
        L3f:
            boolean r0 = r5.isArray()
            if (r0 == 0) goto L5e
            X.PnU r1 = r5.getComponentType()
            java.lang.Class r0 = r6.getComponentType()
            X.PnU r0 = r1.getSubtype(r0)
            java.lang.reflect.Type r1 = r0.runtimeType
            X.PnM r0 = X.EnumC65510PnO.LJLIL
            java.lang.reflect.Type r0 = r0.LIZJ(r1)
            X.PnU r0 = of(r0)
            return r0
        L5e:
            java.lang.Class r0 = r5.getRawType()
            boolean r1 = r0.isAssignableFrom(r6)
            java.lang.String r0 = "%s isn't a subclass of %s"
            X.C76917UGr.LIZIZ(r6, r5, r0, r1)
            java.lang.reflect.Type r0 = r5.runtimeType
            boolean r0 = r0 instanceof java.lang.Class
            if (r0 == 0) goto L88
            java.lang.reflect.TypeVariable[] r0 = r6.getTypeParameters()
            int r0 = r0.length
            if (r0 == 0) goto L83
            java.lang.Class r0 = r5.getRawType()
            java.lang.reflect.TypeVariable[] r0 = r0.getTypeParameters()
            int r0 = r0.length
            if (r0 == 0) goto L88
        L83:
            X.PnU r0 = of(r6)
            return r0
        L88:
            X.PnU r4 = LJ(r6)
            java.lang.Class r0 = r5.getRawType()
            X.PnU r0 = r4.getSupertype(r0)
            java.lang.reflect.Type r3 = r0.runtimeType
            X.Pn0 r2 = new X.Pn0
            r2.<init>()
            java.lang.reflect.Type r1 = r5.runtimeType
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r3.getClass()
            r1.getClass()
            X.C65486Pn0.LIZ(r3, r1, r0)
            X.Pn0 r1 = r2.LIZLLL(r0)
            java.lang.reflect.Type r0 = r4.runtimeType
            java.lang.reflect.Type r6 = r1.LIZIZ(r0)
            goto L83
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC65516PnU.getSubtype(java.lang.Class):X.PnU");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final AbstractC65516PnU<? super T> getSupertype(Class<? super T> cls) {
        C76917UGr.LIZIZ(cls, this, "%s is not a super class of %s", LIZLLL(cls));
        Type type = this.runtimeType;
        if (type instanceof TypeVariable) {
            return LIZJ(cls, ((TypeVariable) type).getBounds());
        }
        if (type instanceof WildcardType) {
            return LIZJ(cls, ((WildcardType) type).getUpperBounds());
        }
        if (cls.isArray()) {
            AbstractC65516PnU<?> componentType = getComponentType();
            if (componentType != 0) {
                return (AbstractC65516PnU<? super T>) of(EnumC65510PnO.LJLIL.LIZJ(componentType.getSupertype(cls.getComponentType()).runtimeType));
            }
            throw new NullPointerException(C76917UGr.LJIL("%s isn't a super type of %s", cls, this));
        }
        AbstractC65516PnU<? super T> abstractC65516PnU = (AbstractC65516PnU<? super T>) resolveType(LJ(cls).runtimeType);
        abstractC65516PnU.LJLIL = this.LJLIL;
        return abstractC65516PnU;
    }

    public final boolean isSubtypeOf(Type type) {
        Type ownerType;
        type.getClass();
        boolean z = true;
        if (type instanceof WildcardType) {
            return new C65524Pnc(((WildcardType) type).getLowerBounds(), true).LIZIZ(this.runtimeType);
        }
        Type type2 = this.runtimeType;
        if (type2 instanceof WildcardType) {
            return new C65524Pnc(((WildcardType) type2).getUpperBounds(), true).LIZ(type);
        }
        if (type2 instanceof TypeVariable) {
            if (type2.equals(type) || new C65524Pnc(((TypeVariable) this.runtimeType).getBounds(), true).LIZ(type)) {
                return true;
            }
            return false;
        }
        if (type2 instanceof GenericArrayType) {
            AbstractC65516PnU<?> of = of(type);
            GenericArrayType genericArrayType = (GenericArrayType) this.runtimeType;
            Type type3 = of.runtimeType;
            if (type3 instanceof Class) {
                Class cls = (Class) type3;
                if (!cls.isArray()) {
                    return cls.isAssignableFrom(Object[].class);
                }
                return of(genericArrayType.getGenericComponentType()).isSubtypeOf(cls.getComponentType());
            }
            if (!(type3 instanceof GenericArrayType)) {
                return false;
            }
            return of(genericArrayType.getGenericComponentType()).isSubtypeOf(((GenericArrayType) of.runtimeType).getGenericComponentType());
        }
        if (type instanceof Class) {
            return LIZLLL((Class) type);
        }
        if (type instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type;
            Class<? super Object> rawType = of(parameterizedType).getRawType();
            if (!LIZLLL(rawType)) {
                return false;
            }
            TypeVariable<Class<? super Object>>[] typeParameters = rawType.getTypeParameters();
            Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
            for (int i = 0; i < typeParameters.length; i++) {
                AbstractC65516PnU<?> resolveType = resolveType(typeParameters[i]);
                Type type4 = actualTypeArguments[i];
                if (!resolveType.runtimeType.equals(type4)) {
                    if (!(type4 instanceof WildcardType)) {
                        return false;
                    }
                    WildcardType wildcardType = (WildcardType) type4;
                    if (!new C65524Pnc(wildcardType.getUpperBounds(), false).LIZIZ(resolveType.runtimeType) || !new C65524Pnc(wildcardType.getLowerBounds(), false).LIZ(resolveType.runtimeType)) {
                        return false;
                    }
                }
            }
            if (!Modifier.isStatic(((Class) parameterizedType.getRawType()).getModifiers()) && parameterizedType.getOwnerType() != null) {
                Type ownerType2 = parameterizedType.getOwnerType();
                Iterator<AbstractC65516PnU<? super T>> it = getTypes().iterator();
                while (true) {
                    if (it.hasNext()) {
                        Type type5 = it.next().runtimeType;
                        if (type5 instanceof ParameterizedType) {
                            ownerType = ((ParameterizedType) type5).getOwnerType();
                        } else if (type5 instanceof Class) {
                            ownerType = ((Class) type5).getEnclosingClass();
                        } else {
                            continue;
                        }
                        if (ownerType != null && of(ownerType).isSubtypeOf(ownerType2)) {
                            break;
                        }
                    } else {
                        z = false;
                        break;
                    }
                }
            }
            return z;
        }
        if (!(type instanceof GenericArrayType)) {
            return false;
        }
        GenericArrayType genericArrayType2 = (GenericArrayType) type;
        if (!(type2 instanceof Class)) {
            return false;
        }
        Class cls2 = (Class) type2;
        if (!cls2.isArray()) {
            return false;
        }
        return of((Class) cls2.getComponentType()).isSubtypeOf(genericArrayType2.getGenericComponentType());
    }

    public final boolean isSupertypeOf(Type type) {
        return of(type).isSubtypeOf(getType());
    }

    public final AbstractC65522Pna<T, Object> method(Method method) {
        C76917UGr.LIZIZ(method, this, "%s not declared by %s", LIZLLL(method.getDeclaringClass()));
        return new C65521PnZ(this, method);
    }

    public Type[] resolveInPlace(Type[] typeArr) {
        for (int i = 0; i < typeArr.length; i++) {
            typeArr[i] = resolveType(typeArr[i]).getType();
        }
        return typeArr;
    }

    public final AbstractC65516PnU<?> resolveType(Type type) {
        type.getClass();
        C65486Pn0 c65486Pn0 = this.LJLIL;
        if (c65486Pn0 == null) {
            Type type2 = this.runtimeType;
            C65486Pn0 c65486Pn02 = new C65486Pn0();
            C65480Pmu c65480Pmu = new C65480Pmu();
            c65480Pmu.LJIIIZ(C65480Pmu.LIZJ.LIZ(type2));
            c65486Pn0 = c65486Pn02.LIZLLL(AbstractC65564PoG.copyOf((java.util.Map) c65480Pmu.LIZIZ));
            this.LJLIL = c65486Pn0;
        }
        return of(c65486Pn0.LIZIZ(type));
    }

    public static AbstractC65516PnU<?> of(Type type) {
        return new C65525Pnd(type);
    }

    public final boolean isSubtypeOf(AbstractC65516PnU<?> abstractC65516PnU) {
        return isSubtypeOf(abstractC65516PnU.getType());
    }

    public final boolean isSupertypeOf(AbstractC65516PnU<?> abstractC65516PnU) {
        return abstractC65516PnU.isSubtypeOf(getType());
    }

    public final AbstractC65516PnU<? super T> LIZJ(Class<? super T> cls, Type[] typeArr) {
        for (Type type : typeArr) {
            AbstractC65516PnU<?> of = of(type);
            if (of.isSubtypeOf(cls)) {
                return (AbstractC65516PnU<? super T>) of.getSupertype(cls);
            }
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(cls);
        LIZ.append(" isn't a super type of ");
        LIZ.append(this);
        throw new IllegalArgumentException(X1D.LIZIZ(LIZ));
    }

    public final <X> AbstractC65516PnU<T> where(AbstractC65515PnT<X> abstractC65515PnT, Class<X> cls) {
        return where(abstractC65515PnT, of((Class) cls));
    }

    public final <X> AbstractC65516PnU<T> where(AbstractC65515PnT<X> abstractC65515PnT, AbstractC65516PnU<X> abstractC65516PnU) {
        new C65486Pn0();
        throw null;
    }
}
