package X;

import java.util.ListIterator;

/* renamed from: X.1eK, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC37961eK implements ListIterator, InterfaceC90533gv {
    public final /* synthetic */ int LJLIL;
    public int LJLILLLLZI;
    public int LJLJI;

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        switch (this.LJLIL) {
            case 0:
                if (this.LJLILLLLZI >= this.LJLJI) {
                    return false;
                }
                return true;
            default:
                if (this.LJLILLLLZI >= this.LJLJI) {
                    return false;
                }
                return true;
        }
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        switch (this.LJLIL) {
            case 0:
                if (this.LJLILLLLZI <= 0) {
                    return false;
                }
                return true;
            default:
                if (this.LJLILLLLZI <= 0) {
                    return false;
                }
                return true;
        }
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        switch (this.LJLIL) {
            case 0:
                return this.LJLILLLLZI;
            default:
                return this.LJLILLLLZI;
        }
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        int i;
        switch (this.LJLIL) {
            case 0:
                i = this.LJLILLLLZI;
                break;
            default:
                i = this.LJLILLLLZI;
                break;
        }
        return i - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public void remove() {
        switch (this.LJLIL) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.ListIterator
    public void add(Object obj) {
        switch (this.LJLIL) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.ListIterator
    public void set(Object obj) {
        switch (this.LJLIL) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public /* synthetic */ AbstractC37961eK(int i, int i2, int i3) {
        this.LJLIL = i3;
        this.LJLILLLLZI = i;
        this.LJLJI = i2;
    }
}
