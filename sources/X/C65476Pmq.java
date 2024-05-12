package X;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.Pmq, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public class C65476Pmq {
    public final AtomicInteger LIZ;

    public C65476Pmq() {
        this(new AtomicInteger());
    }

    public C65476Pmq(AtomicInteger atomicInteger) {
        this.LIZ = atomicInteger;
    }

    public final Type LIZ(Type type) {
        Type LIZ;
        type.getClass();
        if (type instanceof Class) {
            return type;
        }
        if (type instanceof TypeVariable) {
            return type;
        }
        if (type instanceof GenericArrayType) {
            return C65484Pmy.LIZJ(new C65476Pmq(this.LIZ).LIZ(((GenericArrayType) type).getGenericComponentType()));
        }
        if (type instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type;
            Class cls = (Class) parameterizedType.getRawType();
            TypeVariable[] typeParameters = cls.getTypeParameters();
            Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
            for (int i = 0; i < actualTypeArguments.length; i++) {
                actualTypeArguments[i] = new C65475Pmp(this.LIZ, typeParameters[i]).LIZ(actualTypeArguments[i]);
            }
            C65476Pmq c65476Pmq = new C65476Pmq(this.LIZ);
            Type ownerType = parameterizedType.getOwnerType();
            if (ownerType == null) {
                LIZ = null;
            } else {
                LIZ = c65476Pmq.LIZ(ownerType);
            }
            return C65484Pmy.LJ(LIZ, cls, actualTypeArguments);
        }
        if (type instanceof WildcardType) {
            WildcardType wildcardType = (WildcardType) type;
            if (wildcardType.getLowerBounds().length == 0) {
                return LIZIZ(wildcardType.getUpperBounds());
            }
            return type;
        }
        throw new AssertionError("must have been one of the known types");
    }

    public TypeVariable<?> LIZIZ(Type[] typeArr) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("capture#");
        LIZ.append(this.LIZ.incrementAndGet());
        LIZ.append("-of ? extends ");
        LIZ.append(new C65477Pmr(String.valueOf('&')).LIZ(Arrays.asList(typeArr)));
        return C65484Pmy.LIZLLL(C65476Pmq.class, X1D.LIZIZ(LIZ), typeArr);
    }
}
