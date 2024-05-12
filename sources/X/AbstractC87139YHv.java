package X;

import java.util.Iterator;

/* renamed from: X.YHv, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public abstract class AbstractC87139YHv implements Iterator {
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
