package Y;

import X.C0MB;
import X.C16880lQ;
import X.C36441bs;
import X.InterfaceC90533gv;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;
import kotlin.jvm.internal.o;

/* loaded from: classes.dex */
public class IDObjectS0S0101000 implements Iterator, InterfaceC90533gv {
    public final int $t;
    public int i1;
    public Object l0;

    public static final void remove$0(IDObjectS0S0101000 iDObjectS0S0101000) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public static final void remove$1(IDObjectS0S0101000 iDObjectS0S0101000) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public static final void remove$3(IDObjectS0S0101000 iDObjectS0S0101000) {
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
            default:
                super.remove();
                return;
        }
    }

    public static final boolean hasNext$0(IDObjectS0S0101000 iDObjectS0S0101000) {
        if (iDObjectS0S0101000.i1 < ((C0MB) iDObjectS0S0101000.l0).LJIIIIZZ()) {
            return true;
        }
        return false;
    }

    public static final boolean hasNext$1(IDObjectS0S0101000 iDObjectS0S0101000) {
        if (iDObjectS0S0101000.i1 < ((SparseArray) iDObjectS0S0101000.l0).size()) {
            return true;
        }
        return false;
    }

    public static final boolean hasNext$2(IDObjectS0S0101000 iDObjectS0S0101000) {
        if (iDObjectS0S0101000.i1 < ((ViewGroup) iDObjectS0S0101000.l0).getChildCount()) {
            return true;
        }
        return false;
    }

    public static final boolean hasNext$3(IDObjectS0S0101000 iDObjectS0S0101000) {
        if (iDObjectS0S0101000.i1 < ((C36441bs) iDObjectS0S0101000.l0).LJLIL) {
            return true;
        }
        return false;
    }

    public static final Object next$0(IDObjectS0S0101000 iDObjectS0S0101000) {
        C0MB c0mb = (C0MB) iDObjectS0S0101000.l0;
        int i = iDObjectS0S0101000.i1;
        iDObjectS0S0101000.i1 = i + 1;
        return c0mb.LJIIIZ(i);
    }

    public static final Object next$1(IDObjectS0S0101000 iDObjectS0S0101000) {
        SparseArray sparseArray = (SparseArray) iDObjectS0S0101000.l0;
        int i = iDObjectS0S0101000.i1;
        iDObjectS0S0101000.i1 = i + 1;
        return sparseArray.valueAt(i);
    }

    public static final Object next$2(IDObjectS0S0101000 iDObjectS0S0101000) {
        ViewGroup viewGroup = (ViewGroup) iDObjectS0S0101000.l0;
        int i = iDObjectS0S0101000.i1;
        iDObjectS0S0101000.i1 = i + 1;
        View childAt = viewGroup.getChildAt(i);
        if (childAt != null) {
            return childAt;
        }
        throw new IndexOutOfBoundsException();
    }

    public static final Object next$3(IDObjectS0S0101000 iDObjectS0S0101000) {
        Object[] objArr = ((C36441bs) iDObjectS0S0101000.l0).LJLILLLLZI;
        int i = iDObjectS0S0101000.i1;
        iDObjectS0S0101000.i1 = i + 1;
        Object obj = objArr[i];
        o.LJII(obj, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
        return obj;
    }

    public static final void remove$2(IDObjectS0S0101000 iDObjectS0S0101000) {
        ViewGroup viewGroup = (ViewGroup) iDObjectS0S0101000.l0;
        int i = iDObjectS0S0101000.i1 - 1;
        iDObjectS0S0101000.i1 = i;
        C16880lQ.LLIFFJFJJ(i, viewGroup);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public IDObjectS0S0101000(Object obj, SparseArray<Object> sparseArray) {
        this.$t = sparseArray;
        this.l0 = obj;
    }
}
