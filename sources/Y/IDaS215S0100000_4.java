package Y;

import X.C16880lQ;
import X.C28064Azs;
import X.DialogC25756A8y;
import X.InterfaceC29937Boz;
import X.InterfaceC73573Su9;

/* loaded from: classes5.dex */
public class IDaS215S0100000_4 implements InterfaceC29937Boz {
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
            default:
                return;
        }
    }

    public static final void run$0(IDaS215S0100000_4 iDaS215S0100000_4) {
        C28064Azs c28064Azs = (C28064Azs) iDaS215S0100000_4.l0;
        c28064Azs.getClass();
        try {
            ((DialogC25756A8y) c28064Azs.LJIIJJI.getValue()).dismiss();
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
    }

    public static final void run$1(IDaS215S0100000_4 iDaS215S0100000_4) {
        ((InterfaceC73573Su9) iDaS215S0100000_4.l0).onComplete();
    }

    public IDaS215S0100000_4(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }
}
