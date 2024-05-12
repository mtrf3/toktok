package Y;

import X.InterfaceC90533gv;
import android.view.ViewGroup;
import java.util.Iterator;

/* loaded from: classes5.dex */
public class IDObjectS3S0101000_4 implements Iterator, InterfaceC90533gv {
    public final int $t;
    public int i1;
    public Object l0;

    public static final void remove$0(IDObjectS3S0101000_4 iDObjectS3S0101000_4) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public static final void remove$1(IDObjectS3S0101000_4 iDObjectS3S0101000_4) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public static final void remove$2(IDObjectS3S0101000_4 iDObjectS3S0101000_4) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public static final void remove$3(IDObjectS3S0101000_4 iDObjectS3S0101000_4) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public static final void remove$4(IDObjectS3S0101000_4 iDObjectS3S0101000_4) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public static final void remove$5(IDObjectS3S0101000_4 iDObjectS3S0101000_4) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public static final void remove$6(IDObjectS3S0101000_4 iDObjectS3S0101000_4) {
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
            case 6:
                return hasNext$6(this);
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
            case 6:
                return next$6(this);
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
            case 6:
                remove$6(this);
                return;
            default:
                super.remove();
                return;
        }
    }

    public static final boolean hasNext$0(IDObjectS3S0101000_4 iDObjectS3S0101000_4) {
        if (iDObjectS3S0101000_4.i1 < ((ViewGroup) iDObjectS3S0101000_4.l0).getChildCount()) {
            return true;
        }
        return false;
    }

    public static final boolean hasNext$1(IDObjectS3S0101000_4 iDObjectS3S0101000_4) {
        if (iDObjectS3S0101000_4.i1 < ((ViewGroup) iDObjectS3S0101000_4.l0).getChildCount()) {
            return true;
        }
        return false;
    }

    public static final boolean hasNext$2(IDObjectS3S0101000_4 iDObjectS3S0101000_4) {
        if (iDObjectS3S0101000_4.i1 < ((ViewGroup) iDObjectS3S0101000_4.l0).getChildCount()) {
            return true;
        }
        return false;
    }

    public static final boolean hasNext$3(IDObjectS3S0101000_4 iDObjectS3S0101000_4) {
        if (iDObjectS3S0101000_4.i1 < ((ViewGroup) iDObjectS3S0101000_4.l0).getChildCount()) {
            return true;
        }
        return false;
    }

    public static final boolean hasNext$4(IDObjectS3S0101000_4 iDObjectS3S0101000_4) {
        if (iDObjectS3S0101000_4.i1 < ((ViewGroup) iDObjectS3S0101000_4.l0).getChildCount()) {
            return true;
        }
        return false;
    }

    public static final boolean hasNext$5(IDObjectS3S0101000_4 iDObjectS3S0101000_4) {
        if (iDObjectS3S0101000_4.i1 < ((ViewGroup) iDObjectS3S0101000_4.l0).getChildCount()) {
            return true;
        }
        return false;
    }

    public static final boolean hasNext$6(IDObjectS3S0101000_4 iDObjectS3S0101000_4) {
        if (iDObjectS3S0101000_4.i1 < ((ViewGroup) iDObjectS3S0101000_4.l0).getChildCount()) {
            return true;
        }
        return false;
    }

    public static final Object next$0(IDObjectS3S0101000_4 iDObjectS3S0101000_4) {
        ViewGroup viewGroup = (ViewGroup) iDObjectS3S0101000_4.l0;
        int i = iDObjectS3S0101000_4.i1;
        iDObjectS3S0101000_4.i1 = i + 1;
        return viewGroup.getChildAt(i);
    }

    public static final Object next$1(IDObjectS3S0101000_4 iDObjectS3S0101000_4) {
        ViewGroup viewGroup = (ViewGroup) iDObjectS3S0101000_4.l0;
        int i = iDObjectS3S0101000_4.i1;
        iDObjectS3S0101000_4.i1 = i + 1;
        return viewGroup.getChildAt(i);
    }

    public static final Object next$2(IDObjectS3S0101000_4 iDObjectS3S0101000_4) {
        ViewGroup viewGroup = (ViewGroup) iDObjectS3S0101000_4.l0;
        int i = iDObjectS3S0101000_4.i1;
        iDObjectS3S0101000_4.i1 = i + 1;
        return viewGroup.getChildAt(i);
    }

    public static final Object next$3(IDObjectS3S0101000_4 iDObjectS3S0101000_4) {
        ViewGroup viewGroup = (ViewGroup) iDObjectS3S0101000_4.l0;
        int i = iDObjectS3S0101000_4.i1;
        iDObjectS3S0101000_4.i1 = i + 1;
        return viewGroup.getChildAt(i);
    }

    public static final Object next$4(IDObjectS3S0101000_4 iDObjectS3S0101000_4) {
        ViewGroup viewGroup = (ViewGroup) iDObjectS3S0101000_4.l0;
        int i = iDObjectS3S0101000_4.i1;
        iDObjectS3S0101000_4.i1 = i + 1;
        return viewGroup.getChildAt(i);
    }

    public static final Object next$5(IDObjectS3S0101000_4 iDObjectS3S0101000_4) {
        ViewGroup viewGroup = (ViewGroup) iDObjectS3S0101000_4.l0;
        int i = iDObjectS3S0101000_4.i1;
        iDObjectS3S0101000_4.i1 = i + 1;
        return viewGroup.getChildAt(i);
    }

    public static final Object next$6(IDObjectS3S0101000_4 iDObjectS3S0101000_4) {
        ViewGroup viewGroup = (ViewGroup) iDObjectS3S0101000_4.l0;
        int i = iDObjectS3S0101000_4.i1;
        iDObjectS3S0101000_4.i1 = i + 1;
        return viewGroup.getChildAt(i);
    }

    public IDObjectS3S0101000_4(ViewGroup viewGroup, int i) {
        this.$t = i;
        this.l0 = viewGroup;
    }
}
