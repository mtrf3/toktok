package Y;

import X.C5I9;
import X.C5U8;
import X.InterfaceC153045zY;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public class ACallableS34S0110000_2 implements Callable {
    public final int $t;
    public Object l0;
    public boolean z1;

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.$t) {
            case 0:
                return call$0(this);
            case 1:
                return call$1(this);
            default:
                return null;
        }
    }

    public static final Object call$0(ACallableS34S0110000_2 aCallableS34S0110000_2) {
        int LJIJI = ((C5I9) aCallableS34S0110000_2.l0).LIZ().getNleSession().Y8().LJIJI();
        if (aCallableS34S0110000_2.z1 && LJIJI >= 0) {
            LJIJI = ((C5I9) aCallableS34S0110000_2.l0).LIZ().getNleSession().Y8().LJIIIIZZ();
        }
        return Integer.valueOf(LJIJI);
    }

    public static final Object call$1(ACallableS34S0110000_2 aCallableS34S0110000_2) {
        int i;
        InterfaceC153045zY interfaceC153045zY = ((C5U8) aCallableS34S0110000_2.l0).LIZ;
        if (interfaceC153045zY != null) {
            i = interfaceC153045zY.updateAlgorithmFromNormal();
            if (aCallableS34S0110000_2.z1 && i >= 0) {
                InterfaceC153045zY interfaceC153045zY2 = ((C5U8) aCallableS34S0110000_2.l0).LIZ;
                o.LJI(interfaceC153045zY2);
                i = interfaceC153045zY2.genRandomSolve();
            }
        } else {
            i = -1;
        }
        return Integer.valueOf(i);
    }

    public ACallableS34S0110000_2(C5I9 c5i9, int i) {
        this.$t = i;
        this.l0 = c5i9;
        this.z1 = false;
    }

    public ACallableS34S0110000_2(C5U8 c5u8, boolean z, int i) {
        this.$t = i;
        this.l0 = c5u8;
        this.z1 = z;
    }
}
