package X;

import kotlin.jvm.internal.IDqS2S0201000;
import kotlin.jvm.internal.o;

/* renamed from: X.0xZ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C24410xZ {
    public static C44021o6 LIZJ(InterfaceC65784Pro interfaceC65784Pro) {
        return LIZIZ(C36041bE.LIZ, interfaceC65784Pro);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [X.1o7] */
    public static final C44031o7 LIZLLL(InterfaceC65784Pro defaultFactory) {
        o.LJIIIZ(defaultFactory, "defaultFactory");
        return new AbstractC35971b7<T>(defaultFactory) { // from class: X.1o7
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(defaultFactory);
                o.LJIIIZ(defaultFactory, "defaultFactory");
            }

            @Override // X.AbstractC24370xV
            public final InterfaceC24760y8 LIZ(final Object obj, InterfaceC24520xk interfaceC24520xk) {
                interfaceC24520xk.LJJIIJ(-1121811719);
                InterfaceC24760y8<T> interfaceC24760y8 = new InterfaceC24760y8<T>(obj) { // from class: X.1bC
                    public final T LJLIL;

                    public final int hashCode() {
                        T t = this.LJLIL;
                        if (t == null) {
                            return 0;
                        }
                        return t.hashCode();
                    }

                    public final String toString() {
                        StringBuilder LIZ = X1D.LIZ();
                        LIZ.append("StaticValueHolder(value=");
                        return U26.LIZJ(LIZ, this.LJLIL, ')', LIZ);
                    }

                    @Override // X.InterfaceC24760y8
                    public final T getValue() {
                        return this.LJLIL;
                    }

                    {
                        this.LJLIL = obj;
                    }

                    public final boolean equals(Object obj2) {
                        if (this == obj2) {
                            return true;
                        }
                        if ((obj2 instanceof C36021bC) && o.LJ(this.LJLIL, ((C36021bC) obj2).LJLIL)) {
                            return true;
                        }
                        return false;
                    }
                };
                interfaceC24520xk.LJJIJIIJIL();
                return interfaceC24760y8;
            }
        };
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.1o6] */
    public static final C44021o6 LIZIZ(final InterfaceC24600xs policy, final InterfaceC65784Pro defaultFactory) {
        o.LJIIIZ(policy, "policy");
        o.LJIIIZ(defaultFactory, "defaultFactory");
        return new AbstractC35971b7<T>(policy, defaultFactory) { // from class: X.1o6
            public final InterfaceC24600xs<T> LIZIZ;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(defaultFactory);
                o.LJIIIZ(policy, "policy");
                o.LJIIIZ(defaultFactory, "defaultFactory");
                this.LIZIZ = policy;
            }

            @Override // X.AbstractC24370xV
            public final InterfaceC24760y8 LIZ(Object obj, InterfaceC24520xk interfaceC24520xk) {
                interfaceC24520xk.LJJIIJ(-84026900);
                interfaceC24520xk.LJJIIJ(-492369756);
                Object LJIILL = interfaceC24520xk.LJIILL();
                InterfaceC24520xk.LIZ.getClass();
                if (LJIILL == C24500xi.LIZIZ) {
                    LJIILL = C78966Uyw.LJJJI(obj, this.LIZIZ);
                    interfaceC24520xk.LJJIII(LJIILL);
                }
                interfaceC24520xk.LJJIJIIJIL();
                InterfaceC35811ar interfaceC35811ar = (InterfaceC35811ar) LJIILL;
                interfaceC35811ar.setValue(obj);
                interfaceC24520xk.LJJIJIIJIL();
                return interfaceC35811ar;
            }
        };
    }

    public static final void LIZ(C24620xu<?>[] values, InterfaceC88471Ynr<? super InterfaceC24520xk, ? super Integer, C76800UCe> content, InterfaceC24520xk interfaceC24520xk, int i) {
        o.LJIIIZ(values, "values");
        o.LJIIIZ(content, "content");
        C35931b3 LJIL = interfaceC24520xk.LJIL(-1390796515);
        LJIL.LJLIIIL(values);
        content.invoke(LJIL, Integer.valueOf((i >> 3) & 14));
        LJIL.LJJJJL();
        C35991b9 LJJJJLI = LJIL.LJJJJLI();
        if (LJJJJLI == null) {
            return;
        }
        LJJJJLI.LIZLLL = new IDqS2S0201000((C24620xu[]) values, (C24620xu<?>[]) content, (InterfaceC88471Ynr<? super InterfaceC24520xk, ? super Integer, C76800UCe>) i, 18);
    }
}
