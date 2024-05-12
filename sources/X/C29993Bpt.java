package X;

import java.util.LinkedList;

/* renamed from: X.Bpt, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29993Bpt<T> extends LinkedList<T> {
    public final int LJLIL;

    public /* bridge */ int getSize() {
        return super.size();
    }

    @Override // java.util.LinkedList, java.util.AbstractCollection, java.util.Collection, java.util.List, java.util.Deque
    public final /* bridge */ int size() {
        return getSize();
    }

    public C29993Bpt(int i) {
        this.LJLIL = i;
    }

    @Override // java.util.LinkedList, java.util.Deque, java.util.Queue
    public boolean offer(T t) {
        if (size() < this.LJLIL) {
            return super.offer(t);
        }
        return false;
    }

    @Override // java.util.LinkedList, java.util.AbstractSequentialList, java.util.AbstractList, java.util.List
    public final /* bridge */ T remove(int i) {
        return (T) removeAt(i);
    }

    public /* bridge */ Object removeAt(int i) {
        return super.remove(i);
    }
}
