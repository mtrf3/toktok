package Y;

import X.C40871j1;
import X.C46156I9o;
import X.I9X;
import X.InterfaceC29911Fj;
import X.InterfaceC88472Yns;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public class AObjectS70S0300000_7 implements InterfaceC29911Fj {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        switch (this.$t) {
            case 0:
                onChanged$0(this, obj);
                return;
            case 1:
                onChanged$1(this, obj);
                return;
            default:
                return;
        }
    }

    public static final void onChanged$0(AObjectS70S0300000_7 aObjectS70S0300000_7, Object obj) {
        if (!o.LJ(obj, Boolean.TRUE)) {
            return;
        }
        ((I9X) aObjectS70S0300000_7.l0).LLIIJI.remove((C40871j1) aObjectS70S0300000_7.l1);
        ((I9X) aObjectS70S0300000_7.l0).LLJJI((C46156I9o) aObjectS70S0300000_7.l2);
        ((C40871j1) aObjectS70S0300000_7.l1).LJFF(aObjectS70S0300000_7);
    }

    public static final void onChanged$1(AObjectS70S0300000_7 aObjectS70S0300000_7, Object obj) {
        if (!o.LJ(obj, Boolean.TRUE)) {
            return;
        }
        ((I9X) aObjectS70S0300000_7.l0).LLIIJI.remove((C40871j1) aObjectS70S0300000_7.l1);
        ((I9X) aObjectS70S0300000_7.l0).LLJJIII((InterfaceC88472Yns) aObjectS70S0300000_7.l2);
        ((C40871j1) aObjectS70S0300000_7.l1).LJFF(aObjectS70S0300000_7);
    }

    public AObjectS70S0300000_7(Object obj, Object obj2, Object obj3, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
    }
}
