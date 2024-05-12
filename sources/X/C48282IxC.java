package X;

import java.util.concurrent.LinkedBlockingDeque;

/* renamed from: X.IxC, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48282IxC<E> extends LinkedBlockingDeque<E> {
    public final int LJLIL = 10;

    @Override // java.util.concurrent.LinkedBlockingDeque, java.util.Queue, java.util.concurrent.BlockingDeque, java.util.concurrent.BlockingQueue, java.util.Deque
    public final boolean offer(E e) {
        synchronized (this) {
            if (size() == this.LJLIL) {
                removeLast();
            }
        }
        return offerFirst(e);
    }
}
