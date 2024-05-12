package X;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: X.ZbE, reason: case insensitive filesystem */
/* loaded from: classes29.dex */
public final class C90236ZbE implements Iterator<Object> {
    @Override // java.util.Iterator
    public final boolean hasNext() {
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
