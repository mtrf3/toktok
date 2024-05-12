package Y;

import X.InterfaceC90533gv;
import X.KKX;
import android.view.ViewGroup;
import java.util.Iterator;

/* loaded from: classes9.dex */
public class IDObjectS329S0100000_8 implements Iterable, InterfaceC90533gv {
    public final int $t;
    public Object l0;

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        switch (this.$t) {
            case 0:
                return iterator$0(this);
            case 1:
                return iterator$1(this);
            case 2:
                return iterator$2(this);
            default:
                return null;
        }
    }

    public static final Iterator iterator$0(IDObjectS329S0100000_8 iDObjectS329S0100000_8) {
        return new IDObjectS1S0101000_1((ViewGroup) iDObjectS329S0100000_8.l0, 17);
    }

    public static final Iterator iterator$1(IDObjectS329S0100000_8 iDObjectS329S0100000_8) {
        return new IDObjectS1S0101000_1((ViewGroup) iDObjectS329S0100000_8.l0, 20);
    }

    public static final Iterator iterator$2(IDObjectS329S0100000_8 iDObjectS329S0100000_8) {
        return new KKX((ViewGroup) iDObjectS329S0100000_8.l0);
    }

    public IDObjectS329S0100000_8(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }
}
