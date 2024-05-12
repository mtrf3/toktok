package X;

import java.util.Enumeration;
import java.util.Iterator;

/* renamed from: X.End, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37497End implements Iterator<Object>, InterfaceC90533gv {
    public final /* synthetic */ Enumeration<Object> LJLIL;

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.LJLIL.hasMoreElements();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return this.LJLIL.nextElement();
    }

    public C37497End(Enumeration<Object> enumeration) {
        this.LJLIL = enumeration;
    }
}
