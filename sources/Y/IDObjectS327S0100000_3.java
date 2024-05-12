package Y;

import X.InterfaceC90533gv;
import android.view.ViewGroup;
import java.util.Iterator;

/* loaded from: classes4.dex */
public class IDObjectS327S0100000_3 implements Iterable, InterfaceC90533gv {
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

    public static final Iterator iterator$0(IDObjectS327S0100000_3 iDObjectS327S0100000_3) {
        return new IDObjectS2S0101000_3((ViewGroup) iDObjectS327S0100000_3.l0, 0);
    }

    public static final Iterator iterator$1(IDObjectS327S0100000_3 iDObjectS327S0100000_3) {
        return new IDObjectS2S0101000_3((ViewGroup) iDObjectS327S0100000_3.l0, 1);
    }

    public IDObjectS327S0100000_3(ViewGroup viewGroup, int i) {
        this.$t = i;
        this.l0 = viewGroup;
    }
}
