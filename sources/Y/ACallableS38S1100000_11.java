package Y;

import X.C67125QWb;
import X.C68494QuQ;
import X.C68495QuR;
import X.C68496QuS;
import X.InterfaceC37591dj;
import X.InterfaceC68509Quf;
import X.InterfaceC68510Qug;
import java.util.concurrent.Callable;

/* loaded from: classes12.dex */
public class ACallableS38S1100000_11 implements Callable {
    public final int $t;
    public Object l1;
    public String s0;

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

    public static final Object call$0(ACallableS38S1100000_11 aCallableS38S1100000_11) {
        InterfaceC68510Qug LJIJI = ((C68494QuQ) aCallableS38S1100000_11.l1).LIZLLL().LJIJI();
        String str = aCallableS38S1100000_11.s0;
        C68495QuR c68495QuR = (C68495QuR) LJIJI;
        InterfaceC37591dj LIZ = c68495QuR.LJ.LIZ();
        c68495QuR.LIZ.LIZJ();
        try {
            if (str == null) {
                LIZ.LLLLLLJ(1);
            } else {
                LIZ.LJJII(1, str);
            }
            LIZ.LJIJJLI();
            c68495QuR.LIZ.LJIILLIIL();
            c68495QuR.LIZ.LJIIJJI();
            c68495QuR.LJ.LIZJ(LIZ);
            InterfaceC68510Qug LJIJI2 = ((C68494QuQ) aCallableS38S1100000_11.l1).LIZLLL().LJIJI();
            String str2 = aCallableS38S1100000_11.s0;
            C68495QuR c68495QuR2 = (C68495QuR) LJIJI2;
            InterfaceC37591dj LIZ2 = c68495QuR2.LJFF.LIZ();
            c68495QuR2.LIZ.LIZJ();
            try {
                if (str2 == null) {
                    LIZ2.LLLLLLJ(1);
                } else {
                    LIZ2.LJJII(1, str2);
                }
                LIZ2.LJIJJLI();
                c68495QuR2.LIZ.LJIILLIIL();
                c68495QuR2.LIZ.LJIIJJI();
                c68495QuR2.LJFF.LIZJ(LIZ2);
                InterfaceC68509Quf LJIJ = ((C68494QuQ) aCallableS38S1100000_11.l1).LIZLLL().LJIJ();
                String str3 = aCallableS38S1100000_11.s0;
                C68496QuS c68496QuS = (C68496QuS) LJIJ;
                InterfaceC37591dj LIZ3 = c68496QuS.LJ.LIZ();
                c68496QuS.LIZ.LIZJ();
                try {
                    if (str3 == null) {
                        LIZ3.LLLLLLJ(1);
                    } else {
                        LIZ3.LJJII(1, str3);
                    }
                    LIZ3.LJIJJLI();
                    c68496QuS.LIZ.LJIILLIIL();
                    c68496QuS.LIZ.LJIIJJI();
                    c68496QuS.LJ.LIZJ(LIZ3);
                    return Boolean.TRUE;
                } catch (Throwable th) {
                    c68496QuS.LIZ.LJIIJJI();
                    c68496QuS.LJ.LIZJ(LIZ3);
                    throw th;
                }
            } catch (Throwable th2) {
                c68495QuR2.LIZ.LJIIJJI();
                c68495QuR2.LJFF.LIZJ(LIZ2);
                throw th2;
            }
        } catch (Throwable th3) {
            c68495QuR.LIZ.LJIIJJI();
            c68495QuR.LJ.LIZJ(LIZ);
            throw th3;
        }
    }

    public static final Object call$1(ACallableS38S1100000_11 aCallableS38S1100000_11) {
        ((C67125QWb) aCallableS38S1100000_11.l1).LIZIZ(aCallableS38S1100000_11.s0);
        return null;
    }

    public ACallableS38S1100000_11(Object obj, String str, int i) {
        this.$t = i;
        this.l1 = obj;
        this.s0 = str;
    }
}
