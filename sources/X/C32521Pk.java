package X;

import kotlin.jvm.internal.o;

/* renamed from: X.1Pk, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C32521Pk implements InterfaceC13030fD {
    public final InterfaceC88472Yns<Integer, Object> LIZ;
    public final InterfaceC88472Yns<Integer, Object> LIZIZ;
    public final InterfaceC88474Ynu<InterfaceC10180ac, Integer, InterfaceC24520xk, Integer, C76800UCe> LIZJ;

    @Override // X.InterfaceC13030fD
    public final InterfaceC88472Yns<Integer, Object> getKey() {
        return this.LIZ;
    }

    @Override // X.InterfaceC13030fD
    public final InterfaceC88472Yns<Integer, Object> getType() {
        return this.LIZIZ;
    }

    public C32521Pk(InterfaceC88472Yns interfaceC88472Yns, InterfaceC88472Yns type, C40431iJ item) {
        o.LJIIIZ(type, "type");
        o.LJIIIZ(item, "item");
        this.LIZ = interfaceC88472Yns;
        this.LIZIZ = type;
        this.LIZJ = item;
    }
}
