package X;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.QYz, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C67201QYz<T> implements C6Y7<java.util.Set<T>> {
    public volatile java.util.Set<C6Y7<T>> LIZ = Collections.newSetFromMap(new ConcurrentHashMap());
    public volatile java.util.Set<T> LIZIZ;

    public final synchronized void LIZ() {
        Iterator<C6Y7<T>> it = this.LIZ.iterator();
        while (it.hasNext()) {
            this.LIZIZ.add(it.next().get());
        }
        this.LIZ = null;
    }

    @Override // X.C6Y7
    public final Object get() {
        if (this.LIZIZ == null) {
            synchronized (this) {
                if (this.LIZIZ == null) {
                    this.LIZIZ = Collections.newSetFromMap(new ConcurrentHashMap());
                    LIZ();
                }
            }
        }
        return Collections.unmodifiableSet(this.LIZIZ);
    }

    public C67201QYz(Collection<C6Y7<T>> collection) {
        this.LIZ.addAll(collection);
    }
}
