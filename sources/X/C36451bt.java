package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;
import java.util.ListIterator;
import kotlin.jvm.internal.o;

/* renamed from: X.1bt, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C36451bt<T> implements ListIterator<T>, InterfaceC90533gv {
    public final List<T> LJLIL;
    public int LJLILLLLZI;

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        if (this.LJLILLLLZI < this.LJLIL.size()) {
            return true;
        }
        return false;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        if (this.LJLILLLLZI > 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final T next() {
        List<T> list = this.LJLIL;
        int i = this.LJLILLLLZI;
        this.LJLILLLLZI = i + 1;
        return (T) ListProtector.get(list, i);
    }

    @Override // java.util.ListIterator
    public final T previous() {
        int i = this.LJLILLLLZI - 1;
        this.LJLILLLLZI = i;
        return (T) ListProtector.get(this.LJLIL, i);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.LJLILLLLZI - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        int i = this.LJLILLLLZI - 1;
        this.LJLILLLLZI = i;
        ListProtector.remove(this.LJLIL, i);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.LJLILLLLZI;
    }

    @Override // java.util.ListIterator
    public final void add(T t) {
        ListProtector.add(this.LJLIL, this.LJLILLLLZI, t);
        this.LJLILLLLZI++;
    }

    @Override // java.util.ListIterator
    public final void set(T t) {
        ListProtector.set(this.LJLIL, this.LJLILLLLZI, t);
    }

    public C36451bt(List<T> list, int i) {
        o.LJIIIZ(list, "list");
        this.LJLIL = list;
        this.LJLILLLLZI = i;
    }
}
