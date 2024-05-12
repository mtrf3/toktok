package X;

import kotlin.jvm.internal.AqS159S0200000_12;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class SZ0 {
    public final InterfaceC65784Pro<String> LIZ;

    public SZ0(InterfaceC65784Pro<String> interfaceC65784Pro) {
        this.LIZ = interfaceC65784Pro;
    }

    public final void LIZ(C65776Prg c65776Prg) {
        if (!C72283SYl.LIZJ) {
            return;
        }
        SZE.LIZ(this.LIZ.invoke(), c65776Prg);
    }

    public final void LIZIZ(C65776Prg c65776Prg, InterfaceC65784Pro paramsProvider) {
        o.LJIIIZ(paramsProvider, "paramsProvider");
        if (!C72283SYl.LIZJ) {
            return;
        }
        SZE.LIZIZ(c65776Prg, this.LIZ.invoke(), new AqS159S0200000_12(paramsProvider, (InterfaceC65784Pro<Object>) this, (SZ0) 101));
    }

    public final void LIZJ(C65776Prg c65776Prg, InterfaceC65784Pro interfaceC65784Pro) {
        if (!C72283SYl.LIZJ) {
            return;
        }
        AqS159S0200000_12 aqS159S0200000_12 = new AqS159S0200000_12(interfaceC65784Pro, (InterfaceC65784Pro<Object>) this, (SZ0) 102);
        if (!SZI.LIZJ || !C37306EkY.LIZ(c65776Prg)) {
            return;
        }
        C37306EkY.LIZIZ(c65776Prg, (InterfaceC37307EkZ) aqS159S0200000_12.invoke());
    }
}
