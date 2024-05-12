package Y;

import X.AbstractC86724Y1w;
import X.DialogC86015XpL;
import X.InterfaceC29937Boz;
import X.InterfaceC86772Y3s;

/* loaded from: classes16.dex */
public class IDaS9S1100000_15 implements InterfaceC29937Boz {
    public final int $t;
    public Object l1;
    public String s0;

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

    public static final void run$0(IDaS9S1100000_15 iDaS9S1100000_15) {
        ((AbstractC86724Y1w) iDaS9S1100000_15.l1).LIZ.remove(iDaS9S1100000_15.s0);
    }

    public static final void run$1(IDaS9S1100000_15 iDaS9S1100000_15) {
        ((AbstractC86724Y1w) iDaS9S1100000_15.l1).LIZ.remove(iDaS9S1100000_15.s0);
    }

    public static final void run$2(IDaS9S1100000_15 iDaS9S1100000_15) {
        ((DialogC86015XpL) iDaS9S1100000_15.l1).LIZLLL(iDaS9S1100000_15.s0);
        ((DialogC86015XpL) iDaS9S1100000_15.l1).dismiss();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public IDaS9S1100000_15(Object obj, AbstractC86724Y1w<InterfaceC86772Y3s> abstractC86724Y1w, String str) {
        this.$t = str;
        this.l1 = obj;
        this.s0 = abstractC86724Y1w;
    }
}
