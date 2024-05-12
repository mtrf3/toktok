package X;

import X.InterfaceC45863HzH;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class FAG<T extends InterfaceC45863HzH> extends LinkedList<T> implements Queue<T> {
    public final HashSet<Class<T>> LJLIL = new HashSet<>();
    public final ReentrantLock LJLILLLLZI = new ReentrantLock();

    @Override // java.util.LinkedList, java.util.Deque, java.util.Queue
    /* renamed from: LJFF, reason: merged with bridge method [inline-methods] */
    public final T poll() {
        this.LJLILLLLZI.lock();
        try {
            T t = (T) super.poll();
            if (t != null) {
                this.LJLIL.remove(t.getClass());
            } else {
                t = null;
            }
            return t;
        } finally {
            this.LJLILLLLZI.unlock();
        }
    }

    @Override // java.util.LinkedList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        this.LJLILLLLZI.lock();
        try {
            this.LJLIL.clear();
            super.clear();
        } finally {
            this.LJLILLLLZI.unlock();
        }
    }

    @Override // java.util.LinkedList, java.util.AbstractCollection, java.util.Collection, java.util.List, java.util.Deque
    public final /* bridge */ int size() {
        return super.size();
    }

    @Override // java.util.LinkedList, java.util.Deque, java.util.Queue
    /* renamed from: LIZJ, reason: merged with bridge method [inline-methods] */
    public final boolean offer(T e) {
        o.LJIIIZ(e, "e");
        this.LJLILLLLZI.lock();
        try {
            if (this.LJLIL.add(e.getClass())) {
                add(e);
                this.LJLILLLLZI.unlock();
                return true;
            }
            this.LJLILLLLZI.unlock();
            return false;
        } catch (Throwable th) {
            this.LJLILLLLZI.unlock();
            throw th;
        }
    }

    @Override // java.util.LinkedList, java.util.AbstractCollection, java.util.Collection, java.util.List, java.util.Deque
    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof InterfaceC45863HzH)) {
            return false;
        }
        return super.contains(obj);
    }

    @Override // java.util.LinkedList, java.util.AbstractList, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (!(obj instanceof InterfaceC45863HzH)) {
            return -1;
        }
        return super.indexOf(obj);
    }

    @Override // java.util.LinkedList, java.util.AbstractList, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (!(obj instanceof InterfaceC45863HzH)) {
            return -1;
        }
        return super.lastIndexOf(obj);
    }

    @Override // java.util.LinkedList, java.util.AbstractCollection, java.util.Collection, java.util.List, java.util.Deque
    public final /* bridge */ boolean remove(Object obj) {
        if (!(obj instanceof InterfaceC45863HzH)) {
            return false;
        }
        return super.remove(obj);
    }
}
