package Y;

import X.InterfaceC90533gv;
import android.view.ViewGroup;
import java.util.Iterator;

/* loaded from: classes5.dex */
public class IDObjectS328S0100000_4 implements Iterable, InterfaceC90533gv {
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
            case 3:
                return iterator$3(this);
            case 4:
                return iterator$4(this);
            case 5:
                return iterator$5(this);
            case 6:
                return iterator$6(this);
            case 7:
                return iterator$7(this);
            case 8:
                return iterator$8(this);
            default:
                return null;
        }
    }

    public static final Iterator iterator$0(IDObjectS328S0100000_4 iDObjectS328S0100000_4) {
        return new IDObjectS3S0101000_4((ViewGroup) iDObjectS328S0100000_4.l0, 0);
    }

    public static final Iterator iterator$1(IDObjectS328S0100000_4 iDObjectS328S0100000_4) {
        return new IDObjectS1S0101000_1((ViewGroup) iDObjectS328S0100000_4.l0, 9);
    }

    public static final Iterator iterator$2(IDObjectS328S0100000_4 iDObjectS328S0100000_4) {
        return new IDObjectS3S0101000_4((ViewGroup) iDObjectS328S0100000_4.l0, 1);
    }

    public static final Iterator iterator$3(IDObjectS328S0100000_4 iDObjectS328S0100000_4) {
        return new IDObjectS3S0101000_4((ViewGroup) iDObjectS328S0100000_4.l0, 2);
    }

    public static final Iterator iterator$4(IDObjectS328S0100000_4 iDObjectS328S0100000_4) {
        return new IDObjectS3S0101000_4((ViewGroup) iDObjectS328S0100000_4.l0, 3);
    }

    public static final Iterator iterator$5(IDObjectS328S0100000_4 iDObjectS328S0100000_4) {
        return new IDObjectS1S0101000_1((ViewGroup) iDObjectS328S0100000_4.l0, 26);
    }

    public static final Iterator iterator$6(IDObjectS328S0100000_4 iDObjectS328S0100000_4) {
        return new IDObjectS3S0101000_4((ViewGroup) iDObjectS328S0100000_4.l0, 4);
    }

    public static final Iterator iterator$7(IDObjectS328S0100000_4 iDObjectS328S0100000_4) {
        return new IDObjectS3S0101000_4((ViewGroup) iDObjectS328S0100000_4.l0, 5);
    }

    public static final Iterator iterator$8(IDObjectS328S0100000_4 iDObjectS328S0100000_4) {
        return new IDObjectS3S0101000_4((ViewGroup) iDObjectS328S0100000_4.l0, 6);
    }

    public IDObjectS328S0100000_4(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }
}
