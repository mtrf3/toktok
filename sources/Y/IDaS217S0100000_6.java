package Y;

import X.C32787Ctr;
import X.C48841JEv;
import X.InterfaceC29937Boz;
import X.InterfaceC70422pa;

/* loaded from: classes7.dex */
public class IDaS217S0100000_6 implements InterfaceC29937Boz {
    public final int $t;
    public Object l0;

    @Override // X.InterfaceC29937Boz
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                return;
            case 1:
                run$1(this);
                return;
            case 2:
                run$2(this);
                return;
            default:
                return;
        }
    }

    public static final void run$0(IDaS217S0100000_6 iDaS217S0100000_6) {
        ((C32787Ctr) iDaS217S0100000_6.l0).LIZIZ = false;
    }

    public static final void run$1(IDaS217S0100000_6 iDaS217S0100000_6) {
        C48841JEv.LIZJ((InterfaceC70422pa) iDaS217S0100000_6.l0, null);
    }

    public static final void run$2(IDaS217S0100000_6 iDaS217S0100000_6) {
        ((Runnable) iDaS217S0100000_6.l0).run();
    }

    public IDaS217S0100000_6(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }
}
