package X;

import java.util.Iterator;

/* renamed from: X.Eev, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC36957Eev implements Iterator<Character>, InterfaceC90533gv {
    public abstract char LIZ();

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Character next() {
        return Character.valueOf(LIZ());
    }
}
