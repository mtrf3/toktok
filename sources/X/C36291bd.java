package X;

import com.google.gson.j;
import java.util.Iterator;
import kotlin.jvm.internal.o;

/* renamed from: X.1bd, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C36291bd implements Iterator<Object>, InterfaceC90533gv {
    public final Iterator<j> LJLIL;

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.LJLIL.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        j next = this.LJLIL.next();
        if (next != null) {
            return C05600Jw.LIZIZ(next);
        }
        return null;
    }

    public C36291bd(C36301be c36301be) {
        Iterator<j> it = c36301be.LJLIL.iterator();
        o.LJIIIIZZ(it, "delegate.iterator()");
        this.LJLIL = it;
    }
}
