package Y;

import X.C64797Pbt;
import X.C65732Pqy;
import X.C65733Pqz;
import X.InterfaceC36621EYv;
import X.InterfaceC37276Ek4;

/* loaded from: classes12.dex */
public class IDdS380S0100000_11 implements InterfaceC36621EYv {
    public final int $t;
    public Object l0;

    @Override // X.InterfaceC36621EYv
    public final void LIZJ(InterfaceC37276Ek4<Object> interfaceC37276Ek4, Throwable th) {
        switch (this.$t) {
            case 0:
                LIZJ$0(this, interfaceC37276Ek4, th);
                return;
            case 1:
                LIZJ$1(this, interfaceC37276Ek4, th);
                return;
            default:
                return;
        }
    }

    @Override // X.InterfaceC36621EYv
    public final void LJII(InterfaceC37276Ek4<Object> interfaceC37276Ek4, C64797Pbt<Object> c64797Pbt) {
        switch (this.$t) {
            case 0:
                LJII$0(this, interfaceC37276Ek4, c64797Pbt);
                return;
            case 1:
                LJII$1(this, interfaceC37276Ek4, c64797Pbt);
                return;
            default:
                return;
        }
    }

    public IDdS380S0100000_11(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void LIZJ$0(IDdS380S0100000_11 iDdS380S0100000_11, InterfaceC37276Ek4 interfaceC37276Ek4, Throwable th) {
        ((C65732Pqy) iDdS380S0100000_11.l0).LJIIJJI(th);
    }

    public static final void LIZJ$1(IDdS380S0100000_11 iDdS380S0100000_11, InterfaceC37276Ek4 interfaceC37276Ek4, Throwable th) {
        ((C65733Pqz) iDdS380S0100000_11.l0).LJIIJJI(th);
    }

    public static final void LJII$0(IDdS380S0100000_11 iDdS380S0100000_11, InterfaceC37276Ek4 interfaceC37276Ek4, C64797Pbt c64797Pbt) {
        if (c64797Pbt.LIZIZ()) {
            ((C65732Pqy) iDdS380S0100000_11.l0).LJIIJ(c64797Pbt.LIZIZ);
        } else {
            ((C65732Pqy) iDdS380S0100000_11.l0).LJIIJJI(new RuntimeException("HttpException"));
        }
    }

    public static final void LJII$1(IDdS380S0100000_11 iDdS380S0100000_11, InterfaceC37276Ek4 interfaceC37276Ek4, C64797Pbt c64797Pbt) {
        ((C65733Pqz) iDdS380S0100000_11.l0).LJIIJ(c64797Pbt);
    }
}
