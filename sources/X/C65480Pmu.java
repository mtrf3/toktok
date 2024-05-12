package X;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.HashMap;

/* renamed from: X.Pmu, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65480Pmu extends PMI {
    public static final C65476Pmq LIZJ = new C65476Pmq();
    public final java.util.Map<C65481Pmv, Type> LIZIZ;

    public C65480Pmu() {
        super(4);
        this.LIZIZ = new HashMap();
    }

    @Override // X.PMI
    public final void LJIIJ(Class<?> cls) {
        LJIIIZ(cls.getGenericSuperclass());
        LJIIIZ(cls.getGenericInterfaces());
    }

    @Override // X.PMI
    public final void LJIIL(ParameterizedType parameterizedType) {
        boolean z;
        boolean z2;
        C65481Pmv c65481Pmv;
        Class cls = (Class) parameterizedType.getRawType();
        TypeVariable[] typeParameters = cls.getTypeParameters();
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        if (typeParameters.length == actualTypeArguments.length) {
            z = true;
        } else {
            z = false;
        }
        C76917UGr.LJIILL(z);
        for (int i = 0; i < typeParameters.length; i++) {
            C65481Pmv c65481Pmv2 = new C65481Pmv(typeParameters[i]);
            Type type = actualTypeArguments[i];
            if (!((HashMap) this.LIZIZ).containsKey(c65481Pmv2)) {
                Type type2 = type;
                while (true) {
                    if (type2 != null) {
                        boolean z3 = type2 instanceof TypeVariable;
                        if (z3) {
                            z2 = c65481Pmv2.LIZ((TypeVariable) type2);
                        } else {
                            z2 = false;
                        }
                        C65481Pmv c65481Pmv3 = null;
                        if (z2) {
                            while (type != null) {
                                java.util.Map<C65481Pmv, Type> map = this.LIZIZ;
                                if (type instanceof TypeVariable) {
                                    c65481Pmv = new C65481Pmv((TypeVariable) type);
                                } else {
                                    c65481Pmv = null;
                                }
                                type = (Type) ((HashMap) map).remove(c65481Pmv);
                            }
                        } else {
                            java.util.Map<C65481Pmv, Type> map2 = this.LIZIZ;
                            if (z3) {
                                c65481Pmv3 = new C65481Pmv((TypeVariable) type2);
                            }
                            type2 = (Type) ((HashMap) map2).get(c65481Pmv3);
                        }
                    } else {
                        ((HashMap) this.LIZIZ).put(c65481Pmv2, type);
                        break;
                    }
                }
            }
        }
        LJIIIZ(cls);
        LJIIIZ(parameterizedType.getOwnerType());
    }

    @Override // X.PMI
    public final void LJIILIIL(TypeVariable<?> typeVariable) {
        LJIIIZ(typeVariable.getBounds());
    }

    @Override // X.PMI
    public final void LJIILJJIL(WildcardType wildcardType) {
        LJIIIZ(wildcardType.getUpperBounds());
    }
}
