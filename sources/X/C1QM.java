package X;

import kotlin.jvm.internal.IDqS416S0100000;
import kotlin.jvm.internal.IDqS443S0100000;
import kotlin.jvm.internal.IDqS447S0100000;
import kotlin.jvm.internal.o;

/* renamed from: X.1QM, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1QM implements InterfaceC11360cW {
    public boolean LIZIZ;
    public final C1RJ<C1QK> LIZ = new C1RJ<>();
    public final C20R LIZJ = C20R.LJLIL;

    @Override // X.InterfaceC11360cW
    public final void LIZ(Object obj, InterfaceC88472Yns interfaceC88472Yns, Object obj2, C40431iJ c40431iJ) {
        IDqS416S0100000 iDqS416S0100000;
        InterfaceC88471Ynr interfaceC88471Ynr;
        C1RJ<C1QK> c1rj = this.LIZ;
        if (obj != null) {
            iDqS416S0100000 = new IDqS416S0100000(obj, (Object) 200);
        } else {
            iDqS416S0100000 = null;
        }
        if (interfaceC88472Yns != null) {
            interfaceC88471Ynr = new IDqS443S0100000(interfaceC88472Yns, (InterfaceC88472Yns<? super InterfaceC11470ch, C11280cO>) 21);
        } else {
            interfaceC88471Ynr = this.LIZJ;
        }
        c1rj.LIZ(1, new C1QK(iDqS416S0100000, interfaceC88471Ynr, new IDqS416S0100000(obj2, (Object) 201), C1DJ.LJFF(new IDqS447S0100000(c40431iJ, 2), -1504808184, true)));
        if (interfaceC88472Yns != null) {
            this.LIZIZ = true;
        }
    }

    @Override // X.InterfaceC11360cW
    public final void LIZIZ(int i, InterfaceC88472Yns interfaceC88472Yns, InterfaceC88471Ynr interfaceC88471Ynr, InterfaceC88472Yns contentType, C40431iJ c40431iJ) {
        InterfaceC88471Ynr interfaceC88471Ynr2;
        o.LJIIIZ(contentType, "contentType");
        C1RJ<C1QK> c1rj = this.LIZ;
        if (interfaceC88471Ynr == null) {
            interfaceC88471Ynr2 = this.LIZJ;
        } else {
            interfaceC88471Ynr2 = interfaceC88471Ynr;
        }
        c1rj.LIZ(i, new C1QK(interfaceC88472Yns, interfaceC88471Ynr2, contentType, c40431iJ));
        if (interfaceC88471Ynr != null) {
            this.LIZIZ = true;
        }
    }
}
