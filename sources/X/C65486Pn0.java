package X;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Map;

/* renamed from: X.Pn0, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65486Pn0 {
    public final C65488Pn2 LIZ;

    public C65486Pn0() {
        this.LIZ = new C65488Pn2();
    }

    public C65486Pn0(C65488Pn2 c65488Pn2) {
        this.LIZ = c65488Pn2;
    }

    public final Type LIZIZ(Type type) {
        Type LIZIZ;
        type.getClass();
        if (type instanceof TypeVariable) {
            C65488Pn2 c65488Pn2 = this.LIZ;
            TypeVariable typeVariable = (TypeVariable) type;
            c65488Pn2.getClass();
            return c65488Pn2.LIZ(typeVariable, new C65489Pn3(typeVariable, c65488Pn2));
        }
        if (type instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type;
            Type ownerType = parameterizedType.getOwnerType();
            if (ownerType == null) {
                LIZIZ = null;
            } else {
                LIZIZ = LIZIZ(ownerType);
            }
            return C65484Pmy.LJ(LIZIZ, (Class) LIZIZ(parameterizedType.getRawType()), LIZJ(parameterizedType.getActualTypeArguments()));
        }
        if (type instanceof GenericArrayType) {
            return C65484Pmy.LIZJ(LIZIZ(((GenericArrayType) type).getGenericComponentType()));
        }
        if (type instanceof WildcardType) {
            WildcardType wildcardType = (WildcardType) type;
            return new C65499PnD(LIZJ(wildcardType.getLowerBounds()), LIZJ(wildcardType.getUpperBounds()));
        }
        return type;
    }

    public final Type[] LIZJ(Type[] typeArr) {
        Type[] typeArr2 = new Type[typeArr.length];
        for (int i = 0; i < typeArr.length; i++) {
            typeArr2[i] = LIZIZ(typeArr[i]);
        }
        return typeArr2;
    }

    public final C65486Pn0 LIZLLL(java.util.Map<C65481Pmv, ? extends Type> map) {
        boolean z;
        C65488Pn2 c65488Pn2 = this.LIZ;
        c65488Pn2.getClass();
        C65534Pnm builder = AbstractC65564PoG.builder();
        AbstractC65564PoG<C65481Pmv, Type> abstractC65564PoG = c65488Pn2.LIZ;
        builder.getClass();
        builder.LIZJ(abstractC65564PoG.entrySet());
        for (Map.Entry<C65481Pmv, ? extends Type> entry : map.entrySet()) {
            C65481Pmv key = entry.getKey();
            Type value = entry.getValue();
            key.getClass();
            if (value instanceof TypeVariable) {
                z = key.LIZ((TypeVariable) value);
            } else {
                z = false;
            }
            C76917UGr.LIZLLL("Type variable %s bound to itself", !z, key);
            builder.LIZIZ(key, value);
        }
        return new C65486Pn0(new C65488Pn2(builder.LIZ()));
    }

    public static void LIZ(Type type, Type type2, java.util.Map map) {
        if (type.equals(type2)) {
            return;
        }
        new C65482Pmw(map, type2).LJIIIZ(type);
    }
}
