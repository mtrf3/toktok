package Y;

import X.C67094QUw;
import X.C68494QuQ;
import X.C68495QuR;
import X.C68496QuS;
import X.C68501QuX;
import X.InterfaceC37591dj;
import X.InterfaceC68509Quf;
import X.InterfaceC68510Qug;
import X.InterfaceC68511Quh;
import X.QV9;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public class ACallableS60S0300000_11 implements Callable {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

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

    public static final Object call$0(ACallableS60S0300000_11 aCallableS60S0300000_11) {
        boolean z;
        InterfaceC68510Qug LJIJI = ((C68494QuQ) aCallableS60S0300000_11.l0).LIZLLL().LJIJI();
        C67094QUw c67094QUw = (C67094QUw) aCallableS60S0300000_11.l1;
        C68495QuR c68495QuR = (C68495QuR) LJIJI;
        c68495QuR.LIZ.LIZJ();
        try {
            long LJI = c68495QuR.LIZJ.LJI(c67094QUw);
            c68495QuR.LIZ.LJIILLIIL();
            c68495QuR.LIZ.LJIIJJI();
            if (LJI > 0 && ((C68494QuQ) aCallableS60S0300000_11.l0).LJJIFFI((List) aCallableS60S0300000_11.l2)) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        } catch (Throwable th) {
            c68495QuR.LIZ.LJIIJJI();
            throw th;
        }
    }

    public static final Object call$1(ACallableS60S0300000_11 aCallableS60S0300000_11) {
        InterfaceC68511Quh LJIJJ = ((C68494QuQ) aCallableS60S0300000_11.l0).LIZLLL().LJIJJ();
        List list = (List) aCallableS60S0300000_11.l1;
        C68501QuX c68501QuX = (C68501QuX) LJIJJ;
        c68501QuX.LIZ.LIZJ();
        try {
            int LJFF = c68501QuX.LIZJ.LJFF(list);
            boolean z = false;
            c68501QuX.LIZ.LJIILLIIL();
            if (LJFF > 0) {
                InterfaceC68509Quf LJIJ = ((C68494QuQ) aCallableS60S0300000_11.l0).LIZLLL().LJIJ();
                String str = ((QV9) aCallableS60S0300000_11.l2).LIZ;
                o.LJFF(str, "syncCursor.syncId");
                long j = ((QV9) aCallableS60S0300000_11.l2).LJI;
                C68496QuS c68496QuS = (C68496QuS) LJIJ;
                InterfaceC37591dj LIZ = c68496QuS.LIZLLL.LIZ();
                c68496QuS.LIZ.LIZJ();
                try {
                    LIZ.LJIIIZ(1, j);
                    LIZ.LJJII(2, str);
                    int LJIJJLI = LIZ.LJIJJLI();
                    c68496QuS.LIZ.LJIILLIIL();
                    if (LJIJJLI > 0) {
                        z = true;
                    }
                } finally {
                    c68496QuS.LIZ.LJIIJJI();
                    c68496QuS.LIZLLL.LIZJ(LIZ);
                }
            }
            return Boolean.valueOf(z);
        } finally {
            c68501QuX.LIZ.LJIIJJI();
        }
    }

    public ACallableS60S0300000_11(Object obj, Object obj2, Object obj3, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
    }
}
