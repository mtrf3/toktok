package Y;

import X.InterfaceC90533gv;
import android.view.ViewGroup;
import java.util.Iterator;

/* loaded from: classes4.dex */
public class IDObjectS2S0101000_3 implements Iterator, InterfaceC90533gv {
    public final int $t;
    public int i1;
    public Object l0;

    public static final void remove$0(IDObjectS2S0101000_3 iDObjectS2S0101000_3) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public static final void remove$1(IDObjectS2S0101000_3 iDObjectS2S0101000_3) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.$t) {
            case 0:
                return hasNext$0(this);
            case 1:
                return hasNext$1(this);
            default:
                return false;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.$t) {
            case 0:
                return next$0(this);
            case 1:
                return next$1(this);
            default:
                return null;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.$t) {
            case 0:
                remove$0(this);
                return;
            case 1:
                remove$1(this);
                return;
            default:
                super.remove();
                return;
        }
    }

    public static final boolean hasNext$0(IDObjectS2S0101000_3 iDObjectS2S0101000_3) {
        if (iDObjectS2S0101000_3.i1 < ((ViewGroup) iDObjectS2S0101000_3.l0).getChildCount()) {
            return true;
        }
        return false;
    }

    public static final boolean hasNext$1(IDObjectS2S0101000_3 iDObjectS2S0101000_3) {
        if (iDObjectS2S0101000_3.i1 < ((ViewGroup) iDObjectS2S0101000_3.l0).getChildCount()) {
            return true;
        }
        return false;
    }

    public static final Object next$0(IDObjectS2S0101000_3 iDObjectS2S0101000_3) {
        ViewGroup viewGroup = (ViewGroup) iDObjectS2S0101000_3.l0;
        int i = iDObjectS2S0101000_3.i1;
        iDObjectS2S0101000_3.i1 = i + 1;
        return viewGroup.getChildAt(i);
    }

    public static final Object next$1(IDObjectS2S0101000_3 iDObjectS2S0101000_3) {
        ViewGroup viewGroup = (ViewGroup) iDObjectS2S0101000_3.l0;
        int i = iDObjectS2S0101000_3.i1;
        iDObjectS2S0101000_3.i1 = i + 1;
        return viewGroup.getChildAt(i);
    }

    public IDObjectS2S0101000_3(ViewGroup viewGroup, int i) {
        this.$t = i;
        this.l0 = viewGroup;
    }
}
