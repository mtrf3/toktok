package Y;

import X.C0NB;
import X.C113554cx;
import X.C28467BFf;
import X.C28733BPl;
import X.C74824TYe;
import X.C74947TbD;
import X.C74995Tbz;
import X.C74996Tc0;
import X.C74997Tc1;
import X.C75013TcH;
import X.InterfaceC64592gB;
import X.InterfaceC75014TcI;
import X.OSZ;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public class AfS4S1210000_13 implements InterfaceC64592gB {
    public final int $t;
    public Object l1;
    public Object l2;
    public String s0;
    public boolean z3;

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                return;
            case 1:
                accept$1(this, obj);
                return;
            default:
                return;
        }
    }

    public static final void accept$0(AfS4S1210000_13 afS4S1210000_13, Object obj) {
        C28467BFf it = (C28467BFf) obj;
        o.LJIIIIZZ(it, "it");
        if (C74947TbD.LJIJI(it)) {
            C74824TYe.LIZ.LJJI(afS4S1210000_13.z3 ? 1 : 0, "enlarge");
            InterfaceC75014TcI interfaceC75014TcI = (InterfaceC75014TcI) afS4S1210000_13.l1;
            if (interfaceC75014TcI != null) {
                interfaceC75014TcI.LIZIZ(afS4S1210000_13.s0);
                return;
            }
            return;
        }
        ((C74996Tc0) afS4S1210000_13.l2).LJIIIIZZ(null, (InterfaceC75014TcI) afS4S1210000_13.l1, afS4S1210000_13.s0, it.statusCode, it.LJ.message);
    }

    public static final void accept$1(AfS4S1210000_13 afS4S1210000_13, Object obj) {
        C28467BFf it = (C28467BFf) obj;
        o.LJIIIIZZ(it, "it");
        if (C74947TbD.LJIJI(it)) {
            C0NB.LJIIIIZZ("zoom to min success");
            InterfaceC75014TcI interfaceC75014TcI = (InterfaceC75014TcI) afS4S1210000_13.l1;
            if (interfaceC75014TcI != null) {
                interfaceC75014TcI.LIZIZ(afS4S1210000_13.s0);
            }
            C74995Tbz c74995Tbz = ((C74997Tc1) afS4S1210000_13.l2).LIZ;
            String linkMicId = afS4S1210000_13.s0;
            boolean z = afS4S1210000_13.z3;
            c74995Tbz.getClass();
            o.LJIIIZ(linkMicId, "linkMicId");
            c74995Tbz.LIZLLL.put(linkMicId, Boolean.valueOf(z));
            return;
        }
        C28733BPl.LJIILIIL().LJIIIIZZ(((C74997Tc1) afS4S1210000_13.l2).LIZJ, C113554cx.LJJLIIIIJ(new OSZ("action", "tryZoomToMin"), new OSZ("linkMicId", afS4S1210000_13.s0), new OSZ("httpresult", "failed")));
        InterfaceC75014TcI interfaceC75014TcI2 = (InterfaceC75014TcI) afS4S1210000_13.l1;
        if (interfaceC75014TcI2 == null) {
            return;
        }
        String str = afS4S1210000_13.s0;
        int i = it.statusCode;
        String str2 = it.LJ.message;
        o.LJIIIIZZ(str2, "it.error.message");
        C75013TcH.LIZ(interfaceC75014TcI2, str, i, str2, 8);
    }

    public AfS4S1210000_13(Object obj, String str, Object obj2, boolean z, int i) {
        this.$t = i;
        this.l1 = obj;
        this.s0 = str;
        this.l2 = obj2;
        this.z3 = z;
    }
}
