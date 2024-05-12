package X;

import java.util.AbstractQueue;
import java.util.Iterator;

/* renamed from: X.Pqh, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public class C65715Pqh extends AbstractQueue<Object> {
    @Override // java.util.Queue
    public final boolean offer(Object obj) {
        return true;
    }

    @Override // java.util.Queue
    public final Object peek() {
        return null;
    }

    @Override // java.util.Queue
    public final Object poll() {
        return null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator<Object> iterator() {
        return AbstractC65583PoZ.of().iterator();
    }
}
