package X;

import kotlin.jvm.internal.o;

/* renamed from: X.1QK, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1QK implements InterfaceC13030fD {
    public final InterfaceC88472Yns<Integer, Object> LIZ;
    public final InterfaceC88471Ynr<InterfaceC11470ch, Integer, C11280cO> LIZIZ;
    public final InterfaceC88472Yns<Integer, Object> LIZJ;
    public final InterfaceC88474Ynu<InterfaceC11440ce, Integer, InterfaceC24520xk, Integer, C76800UCe> LIZLLL;

    @Override // X.InterfaceC13030fD
    public final InterfaceC88472Yns<Integer, Object> getKey() {
        return this.LIZ;
    }

    @Override // X.InterfaceC13030fD
    public final InterfaceC88472Yns<Integer, Object> getType() {
        return this.LIZJ;
    }

    public C1QK(InterfaceC88472Yns interfaceC88472Yns, InterfaceC88471Ynr span, InterfaceC88472Yns type, C40431iJ c40431iJ) {
        o.LJIIIZ(span, "span");
        o.LJIIIZ(type, "type");
        this.LIZ = interfaceC88472Yns;
        this.LIZIZ = span;
        this.LIZJ = type;
        this.LIZLLL = c40431iJ;
    }
}
