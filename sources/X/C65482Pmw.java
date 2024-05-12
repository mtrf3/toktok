package X;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;

/* renamed from: X.Pmw, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65482Pmw extends PMI {
    public final /* synthetic */ java.util.Map LIZIZ;
    public final /* synthetic */ Type LIZJ;

    @Override // X.PMI
    public final void LJIIJ(Class<?> cls) {
        if (this.LIZJ instanceof WildcardType) {
            return;
        }
        StringBuilder LIZIZ = C770830u.LIZIZ("No type mapping from ", cls, " to ");
        LIZIZ.append(this.LIZJ);
        throw new IllegalArgumentException(X1D.LIZIZ(LIZIZ));
    }

    @Override // X.PMI
    public final void LJIIJJI(GenericArrayType genericArrayType) {
        boolean z;
        Type type = this.LIZJ;
        if (type instanceof WildcardType) {
            return;
        }
        Type LIZIZ = C65484Pmy.LIZIZ(type);
        if (LIZIZ != null) {
            z = true;
        } else {
            z = false;
        }
        C76917UGr.LIZLLL("%s is not an array type.", z, this.LIZJ);
        C65486Pn0.LIZ(genericArrayType.getGenericComponentType(), LIZIZ, this.LIZIZ);
    }

    @Override // X.PMI
    public final void LJIIL(ParameterizedType parameterizedType) {
        boolean z;
        Type type = this.LIZJ;
        if (type instanceof WildcardType) {
            return;
        }
        try {
            ParameterizedType parameterizedType2 = (ParameterizedType) ParameterizedType.class.cast(type);
            if (parameterizedType.getOwnerType() != null && parameterizedType2.getOwnerType() != null) {
                C65486Pn0.LIZ(parameterizedType.getOwnerType(), parameterizedType2.getOwnerType(), this.LIZIZ);
            }
            C76917UGr.LIZIZ(parameterizedType, this.LIZJ, "Inconsistent raw type: %s vs. %s", parameterizedType.getRawType().equals(parameterizedType2.getRawType()));
            Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
            Type[] actualTypeArguments2 = parameterizedType2.getActualTypeArguments();
            if (actualTypeArguments.length == actualTypeArguments2.length) {
                z = true;
            } else {
                z = false;
            }
            C76917UGr.LIZIZ(parameterizedType, parameterizedType2, "%s not compatible with %s", z);
            for (int i = 0; i < actualTypeArguments.length; i++) {
                C65486Pn0.LIZ(actualTypeArguments[i], actualTypeArguments2[i], this.LIZIZ);
            }
        } catch (ClassCastException unused) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(type);
            LIZ.append(" is not a ");
            LIZ.append(C16880lQ.LJLLJ(ParameterizedType.class));
            throw new IllegalArgumentException(X1D.LIZIZ(LIZ));
        }
    }

    @Override // X.PMI
    public final void LJIILIIL(TypeVariable<?> typeVariable) {
        this.LIZIZ.put(new C65481Pmv(typeVariable), this.LIZJ);
    }

    @Override // X.PMI
    public final void LJIILJJIL(WildcardType wildcardType) {
        boolean z;
        Type type = this.LIZJ;
        if (!(type instanceof WildcardType)) {
            return;
        }
        WildcardType wildcardType2 = (WildcardType) type;
        Type[] upperBounds = wildcardType.getUpperBounds();
        Type[] upperBounds2 = wildcardType2.getUpperBounds();
        Type[] lowerBounds = wildcardType.getLowerBounds();
        Type[] lowerBounds2 = wildcardType2.getLowerBounds();
        if (upperBounds.length == upperBounds2.length && lowerBounds.length == lowerBounds2.length) {
            z = true;
        } else {
            z = false;
        }
        C76917UGr.LIZIZ(wildcardType, this.LIZJ, "Incompatible type: %s vs. %s", z);
        for (int i = 0; i < upperBounds.length; i++) {
            C65486Pn0.LIZ(upperBounds[i], upperBounds2[i], this.LIZIZ);
        }
        for (int i2 = 0; i2 < lowerBounds.length; i2++) {
            C65486Pn0.LIZ(lowerBounds[i2], lowerBounds2[i2], this.LIZIZ);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C65482Pmw(java.util.Map map, Type type) {
        super(4);
        this.LIZIZ = map;
        this.LIZJ = type;
    }
}
