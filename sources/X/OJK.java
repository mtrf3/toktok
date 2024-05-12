package X;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.o;

/* JADX INFO: Add missing generic type declarations: [T] */
/* loaded from: classes11.dex */
public final class OJK<T> implements Iterator<T>, InterfaceC90533gv {
    public T LJLIL;
    public int LJLILLLLZI = -2;
    public final /* synthetic */ OJL<T> LJLJI;

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void LIZ() {
        T invoke;
        int i;
        if (this.LJLILLLLZI == -2) {
            invoke = this.LJLJI.LIZ.invoke();
        } else {
            InterfaceC88472Yns<T, T> interfaceC88472Yns = this.LJLJI.LIZIZ;
            T t = this.LJLIL;
            o.LJI(t);
            invoke = interfaceC88472Yns.invoke(t);
        }
        this.LJLIL = invoke;
        if (invoke == null) {
            i = 0;
        } else {
            i = 1;
        }
        this.LJLILLLLZI = i;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.LJLILLLLZI < 0) {
            LIZ();
        }
        if (this.LJLILLLLZI == 1) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final T next() {
        if (this.LJLILLLLZI < 0) {
            LIZ();
        }
        if (this.LJLILLLLZI != 0) {
            T t = this.LJLIL;
            o.LJII(t, "null cannot be cast to non-null type T of kotlin.sequences.GeneratorSequence");
            this.LJLILLLLZI = -1;
            return t;
        }
        throw new NoSuchElementException();
    }

    public OJK(OJL<T> ojl) {
        this.LJLJI = ojl;
    }
}
