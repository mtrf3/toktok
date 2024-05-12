package Y;

import X.C56040Lz2;
import X.InterfaceC90533gv;
import android.view.ViewGroup;
import java.util.Iterator;

/* loaded from: classes10.dex */
public class IDObjectS330S0100000_9 implements Iterable, InterfaceC90533gv {
    public final int $t;
    public Object l0;

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        switch (this.$t) {
            case 0:
                return iterator$0(this);
            case 1:
                return iterator$1(this);
            default:
                return null;
        }
    }

    public static final Iterator iterator$0(IDObjectS330S0100000_9 iDObjectS330S0100000_9) {
        return new IDObjectS1S0101000_1((ViewGroup) iDObjectS330S0100000_9.l0, 13);
    }

    public static final Iterator iterator$1(IDObjectS330S0100000_9 iDObjectS330S0100000_9) {
        return new C56040Lz2((ViewGroup) iDObjectS330S0100000_9.l0);
    }

    public IDObjectS330S0100000_9(ViewGroup viewGroup, int i) {
        this.$t = i;
        this.l0 = viewGroup;
    }
}
