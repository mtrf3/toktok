package X;

import java.util.Iterator;

/* renamed from: X.Zco, reason: case insensitive filesystem */
/* loaded from: classes29.dex */
public abstract class AbstractC90334Zco implements Iterator {
    public abstract byte LIZ();

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        return Byte.valueOf(LIZ());
    }
}
