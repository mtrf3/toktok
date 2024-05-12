package X;

import kotlin.jvm.internal.IDqS172S0200000;
import kotlin.jvm.internal.o;

/* renamed from: X.1IG, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1IG extends C0OA {
    public final C0OA LJFF;
    public final InterfaceC88472Yns<Object, C76800UCe> LJI;

    @Override // X.C0OA
    public final boolean LJI() {
        return true;
    }

    @Override // X.C0OA
    public final InterfaceC88472Yns<Object, C76800UCe> LJII() {
        return null;
    }

    @Override // X.C0OA
    public final void LJIIJJI() {
    }

    @Override // X.C0OA
    public final void LIZJ() {
        if (!this.LIZJ) {
            if (this.LIZIZ != this.LJFF.LIZLLL()) {
                LIZ();
            }
            this.LJFF.LJIIJ(this);
            super.LIZJ();
        }
    }

    @Override // X.C0OA
    public final InterfaceC88472Yns<Object, C76800UCe> LJFF() {
        return this.LJI;
    }

    @Override // X.C0OA
    public final void LJIIIZ(C0OA snapshot) {
        o.LJIIIZ(snapshot, "snapshot");
        C0OH.LIZ();
        throw null;
    }

    @Override // X.C0OA
    public final void LJIIJ(C0OA snapshot) {
        o.LJIIIZ(snapshot, "snapshot");
        C0OH.LIZ();
        throw null;
    }

    @Override // X.C0OA
    public final void LJIIL(C0O9 state) {
        o.LJIIIZ(state, "state");
        "Cannot modify a state object in a read-only snapshot".toString();
        throw new IllegalStateException("Cannot modify a state object in a read-only snapshot");
    }

    @Override // X.C0OA
    public final C0OA LJIIZILJ(InterfaceC88472Yns interfaceC88472Yns) {
        return new C1IG(this.LIZIZ, this.LIZ, interfaceC88472Yns, this.LJFF);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1IG(int i, C1IQ invalid, InterfaceC88472Yns<Object, C76800UCe> interfaceC88472Yns, C0OA parent) {
        super(i, invalid);
        o.LJIIIZ(invalid, "invalid");
        o.LJIIIZ(parent, "parent");
        this.LJFF = parent;
        parent.LJIIIZ(this);
        if (interfaceC88472Yns != null) {
            InterfaceC88472Yns<Object, C76800UCe> LJFF = parent.LJFF();
            if (LJFF != null) {
                interfaceC88472Yns = new IDqS172S0200000(interfaceC88472Yns, LJFF, (InterfaceC88472Yns<Object, C76800UCe>) 24);
            }
        } else {
            interfaceC88472Yns = parent.LJFF();
        }
        this.LJI = interfaceC88472Yns;
    }
}
