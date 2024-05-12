package Y;

import X.C146735pN;
import X.C164796dP;
import X.C164906da;
import X.C76800UCe;
import X.EnumC61598OFm;
import X.InterfaceC61107NyZ;
import X.InterfaceC88472Yns;
import X.OSZ;
import java.util.Arrays;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public class IDeS401S0100000_2 implements InterfaceC61107NyZ {
    public final int $t;
    public Object l0;

    public static final void LIZ$0(IDeS401S0100000_2 iDeS401S0100000_2) {
    }

    public static final void LIZ$1(IDeS401S0100000_2 iDeS401S0100000_2) {
    }

    @Override // X.InterfaceC61107NyZ
    public final void LIZ() {
        switch (this.$t) {
            case 0:
                LIZ$0(this);
                return;
            case 1:
                LIZ$1(this);
                return;
            default:
                return;
        }
    }

    @Override // X.InterfaceC61107NyZ
    public final void LIZIZ(C164906da... c164906daArr) {
        switch (this.$t) {
            case 0:
                LIZIZ$0(this, c164906daArr);
                return;
            case 1:
                LIZIZ$1(this, c164906daArr);
                return;
            default:
                return;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public IDeS401S0100000_2(Object obj, InterfaceC88472Yns<? super Boolean, C76800UCe> interfaceC88472Yns) {
        this.$t = interfaceC88472Yns;
        this.l0 = obj;
    }

    public static final void LIZIZ$0(IDeS401S0100000_2 iDeS401S0100000_2, C164906da... results) {
        o.LJIIIZ(results, "results");
        OSZ<String[], int[]> LIZ = C164796dP.LIZ((C164906da[]) Arrays.copyOf(results, results.length));
        String[] first = LIZ.getFirst();
        ((C146735pN) iDeS401S0100000_2.l0).LIZ(LIZ.getSecond(), first);
    }

    public static final void LIZIZ$1(IDeS401S0100000_2 iDeS401S0100000_2, C164906da... results) {
        o.LJIIIZ(results, "results");
        boolean z = true;
        if (results.length == 0) {
            ((InterfaceC88472Yns) iDeS401S0100000_2.l0).invoke(Boolean.FALSE);
            return;
        }
        InterfaceC88472Yns interfaceC88472Yns = (InterfaceC88472Yns) iDeS401S0100000_2.l0;
        int length = results.length;
        int i = 0;
        while (true) {
            if (i < length) {
                if (results[i].LIZIZ == EnumC61598OFm.GRANTED) {
                    i++;
                } else {
                    z = false;
                    break;
                }
            } else {
                break;
            }
        }
        interfaceC88472Yns.invoke(Boolean.valueOf(z));
    }
}
