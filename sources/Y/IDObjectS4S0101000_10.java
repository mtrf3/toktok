package Y;

import X.InterfaceC90533gv;
import X.OJC;
import android.view.ViewGroup;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes11.dex */
public class IDObjectS4S0101000_10 implements Iterator, InterfaceC90533gv {
    public final int $t;
    public int i1;
    public Object l0;

    public static final void remove$0(IDObjectS4S0101000_10 iDObjectS4S0101000_10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public static final void remove$1(IDObjectS4S0101000_10 iDObjectS4S0101000_10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public static final void remove$2(IDObjectS4S0101000_10 iDObjectS4S0101000_10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public static final void remove$3(IDObjectS4S0101000_10 iDObjectS4S0101000_10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public static final void remove$4(IDObjectS4S0101000_10 iDObjectS4S0101000_10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public static final void remove$5(IDObjectS4S0101000_10 iDObjectS4S0101000_10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.$t) {
            case 0:
                return hasNext$0(this);
            case 1:
                return hasNext$1(this);
            case 2:
                return hasNext$2(this);
            case 3:
                return hasNext$3(this);
            case 4:
                return hasNext$4(this);
            case 5:
                return hasNext$5(this);
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
            case 2:
                return next$2(this);
            case 3:
                return next$3(this);
            case 4:
                return next$4(this);
            case 5:
                return next$5(this);
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
            case 2:
                remove$2(this);
                return;
            case 3:
                remove$3(this);
                return;
            case 4:
                remove$4(this);
                return;
            case 5:
                remove$5(this);
                return;
            default:
                super.remove();
                return;
        }
    }

    public static final boolean hasNext$0(IDObjectS4S0101000_10 iDObjectS4S0101000_10) {
        if (iDObjectS4S0101000_10.i1 < ((ViewGroup) iDObjectS4S0101000_10.l0).getChildCount()) {
            return true;
        }
        return false;
    }

    public static final boolean hasNext$1(IDObjectS4S0101000_10 iDObjectS4S0101000_10) {
        if (iDObjectS4S0101000_10.i1 < ((ViewGroup) iDObjectS4S0101000_10.l0).getChildCount()) {
            return true;
        }
        return false;
    }

    public static final boolean hasNext$2(IDObjectS4S0101000_10 iDObjectS4S0101000_10) {
        if (iDObjectS4S0101000_10.i1 < ((ViewGroup) iDObjectS4S0101000_10.l0).getChildCount()) {
            return true;
        }
        return false;
    }

    public static final boolean hasNext$3(IDObjectS4S0101000_10 iDObjectS4S0101000_10) {
        if (iDObjectS4S0101000_10.i1 > 0 && ((Iterator) iDObjectS4S0101000_10.l0).hasNext()) {
            return true;
        }
        return false;
    }

    public static final boolean hasNext$4(IDObjectS4S0101000_10 iDObjectS4S0101000_10) {
        if (iDObjectS4S0101000_10.i1 < ((ViewGroup) iDObjectS4S0101000_10.l0).getChildCount()) {
            return true;
        }
        return false;
    }

    public static final boolean hasNext$5(IDObjectS4S0101000_10 iDObjectS4S0101000_10) {
        if (iDObjectS4S0101000_10.i1 < ((ViewGroup) iDObjectS4S0101000_10.l0).getChildCount()) {
            return true;
        }
        return false;
    }

    public static final Object next$0(IDObjectS4S0101000_10 iDObjectS4S0101000_10) {
        ViewGroup viewGroup = (ViewGroup) iDObjectS4S0101000_10.l0;
        int i = iDObjectS4S0101000_10.i1;
        iDObjectS4S0101000_10.i1 = i + 1;
        return viewGroup.getChildAt(i);
    }

    public static final Object next$1(IDObjectS4S0101000_10 iDObjectS4S0101000_10) {
        ViewGroup viewGroup = (ViewGroup) iDObjectS4S0101000_10.l0;
        int i = iDObjectS4S0101000_10.i1;
        iDObjectS4S0101000_10.i1 = i + 1;
        return viewGroup.getChildAt(i);
    }

    public static final Object next$2(IDObjectS4S0101000_10 iDObjectS4S0101000_10) {
        ViewGroup viewGroup = (ViewGroup) iDObjectS4S0101000_10.l0;
        int i = iDObjectS4S0101000_10.i1;
        iDObjectS4S0101000_10.i1 = i + 1;
        return viewGroup.getChildAt(i);
    }

    public static final Object next$3(IDObjectS4S0101000_10 iDObjectS4S0101000_10) {
        int i = iDObjectS4S0101000_10.i1;
        if (i != 0) {
            iDObjectS4S0101000_10.i1 = i - 1;
            return ((Iterator) iDObjectS4S0101000_10.l0).next();
        }
        throw new NoSuchElementException();
    }

    public static final Object next$4(IDObjectS4S0101000_10 iDObjectS4S0101000_10) {
        ViewGroup viewGroup = (ViewGroup) iDObjectS4S0101000_10.l0;
        int i = iDObjectS4S0101000_10.i1;
        iDObjectS4S0101000_10.i1 = i + 1;
        return viewGroup.getChildAt(i);
    }

    public static final Object next$5(IDObjectS4S0101000_10 iDObjectS4S0101000_10) {
        ViewGroup viewGroup = (ViewGroup) iDObjectS4S0101000_10.l0;
        int i = iDObjectS4S0101000_10.i1;
        iDObjectS4S0101000_10.i1 = i + 1;
        return viewGroup.getChildAt(i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public IDObjectS4S0101000_10(OJC ojc, OJC<T> ojc2) {
        this.$t = ojc2;
        this.i1 = ojc.LIZIZ;
        this.l0 = ojc.LIZ.iterator();
    }

    public IDObjectS4S0101000_10(ViewGroup viewGroup, int i) {
        this.$t = i;
        this.l0 = viewGroup;
    }
}
