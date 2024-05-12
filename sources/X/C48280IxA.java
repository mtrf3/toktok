package X;

import java.util.LinkedList;

/* renamed from: X.IxA, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48280IxA<E> extends LinkedList<E> {
    public final int LJLIL = 100;

    @Override // java.util.LinkedList, java.util.AbstractCollection, java.util.Collection, java.util.List, java.util.Deque
    public final /* bridge */ int size() {
        return super.size();
    }

    @Override // java.util.LinkedList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List, java.util.Deque, java.util.Queue
    public final boolean add(E e) {
        if (super.size() >= this.LJLIL) {
            removeFirst();
        }
        return super.add(e);
    }

    @Override // java.util.LinkedList, java.util.AbstractSequentialList, java.util.AbstractList, java.util.List
    public final /* bridge */ E remove(int i) {
        return (E) super.remove(i);
    }
}
