package X;

import com.google.gson.g;
import com.google.gson.j;
import java.util.ListIterator;

/* renamed from: X.1bc, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C36281bc implements ListIterator<Object>, InterfaceC90533gv {
    public int LJLIL;
    public final /* synthetic */ C36301be LJLILLLLZI;

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        if (this.LJLIL < this.LJLILLLLZI.LJLIL.size()) {
            return true;
        }
        return false;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        if (this.LJLIL > 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        g gVar = this.LJLILLLLZI.LJLIL;
        int i = this.LJLIL;
        this.LJLIL = i + 1;
        j LJJIIZ = gVar.LJJIIZ(i);
        if (LJJIIZ != null) {
            return C05600Jw.LIZIZ(LJJIIZ);
        }
        return null;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        g gVar = this.LJLILLLLZI.LJLIL;
        int i = this.LJLIL - 1;
        this.LJLIL = i;
        j LJJIIZ = gVar.LJJIIZ(i);
        if (LJJIIZ != null) {
            return C05600Jw.LIZIZ(LJJIIZ);
        }
        return null;
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.LJLIL - 1;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.LJLIL;
    }

    public C36281bc(C36301be c36301be, int i) {
        this.LJLILLLLZI = c36301be;
        this.LJLIL = i;
    }
}
