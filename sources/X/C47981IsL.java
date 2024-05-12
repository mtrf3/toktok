package X;

import java.util.concurrent.ConcurrentLinkedQueue;

/* renamed from: X.IsL, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C47981IsL<T> extends ConcurrentLinkedQueue<T> {
    public final int LJLIL;

    public /* bridge */ int getSize() {
        return super.size();
    }

    @Override // java.util.concurrent.ConcurrentLinkedQueue, java.util.AbstractCollection, java.util.Collection
    public final /* bridge */ int size() {
        return getSize();
    }

    public C47981IsL(int i) {
        this.LJLIL = i;
    }

    @Override // java.util.concurrent.ConcurrentLinkedQueue, java.util.Queue
    public synchronized boolean offer(T t) {
        if (size() + 1 > this.LJLIL) {
            poll();
        }
        return super.offer(t);
    }
}
