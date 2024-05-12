package X;

import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class V2P implements C0SW {
    public final InterfaceC24760y8<Boolean> LJLIL;
    public final InterfaceC24760y8<C11850dJ> LJLILLLLZI;
    public final float LJLJI;

    public V2P() {
        throw null;
    }

    @Override // X.C0SW
    public final void LIZ(InterfaceC43021mU interfaceC43021mU) {
        o.LJIIIZ(interfaceC43021mU, "<this>");
        interfaceC43021mU.LJJLIIIIJ();
        if (this.LJLIL.getValue().booleanValue()) {
            if (C23390vv.LIZJ(this.LJLJI, Float.POSITIVE_INFINITY)) {
                C14720hw.LIZJ(interfaceC43021mU, this.LJLILLLLZI.getValue().LIZ, Math.max(C10430b1.LIZLLL(interfaceC43021mU.LIZIZ()), C10430b1.LIZIZ(interfaceC43021mU.LIZIZ())) / 2.0f, 0L, 0.0f, null, 124);
            } else {
                C14720hw.LJIIJ(interfaceC43021mU, this.LJLILLLLZI.getValue().LIZ, 0L, 0L, C78897Uxp.LJI(interfaceC43021mU.LJJJJIZL(this.LJLJI), interfaceC43021mU.LJJJJIZL(this.LJLJI)), null, 246);
            }
        }
    }

    public V2P(InterfaceC35811ar interfaceC35811ar, InterfaceC24760y8 interfaceC24760y8, float f) {
        this.LJLIL = interfaceC35811ar;
        this.LJLILLLLZI = interfaceC24760y8;
        this.LJLJI = f;
    }
}
