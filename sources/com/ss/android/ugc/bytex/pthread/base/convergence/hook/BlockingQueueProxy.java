package com.ss.android.ugc.bytex.pthread.base.convergence.hook;

import X.ORX;
import com.ss.android.ugc.bytex.pthread.base.convergence.SuperThreadPool;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class BlockingQueueProxy<E> implements BlockingQueue<E> {
    public static final Companion Companion = new Companion();
    public final BlockingQueue<E> mDelegate;

    /* loaded from: classes12.dex */
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final <E> BlockingQueue<E> proxy(BlockingQueue<E> blockingQueue) {
            return (blockingQueue == null || (blockingQueue instanceof BlockingQueueProxy)) ? blockingQueue : new BlockingQueueProxy(blockingQueue);
        }
    }

    public BlockingQueueProxy(BlockingQueue<E> mDelegate) {
        o.LJIIJ(mDelegate, "mDelegate");
        this.mDelegate = mDelegate;
    }

    @Override // java.util.concurrent.BlockingQueue, java.util.Queue, java.util.Collection
    public boolean add(E e) {
        return this.mDelegate.add(e);
    }

    @Override // java.util.Collection
    public boolean addAll(Collection<? extends E> elements) {
        o.LJIIJ(elements, "elements");
        return this.mDelegate.addAll(elements);
    }

    @Override // java.util.Collection
    public void clear() {
        this.mDelegate.clear();
    }

    @Override // java.util.concurrent.BlockingQueue, java.util.Collection
    public boolean contains(Object obj) {
        return this.mDelegate.contains(obj);
    }

    @Override // java.util.Collection
    public boolean containsAll(Collection<? extends Object> elements) {
        o.LJIIJ(elements, "elements");
        return this.mDelegate.containsAll(elements);
    }

    @Override // java.util.concurrent.BlockingQueue
    public int drainTo(Collection<? super E> collection) {
        return this.mDelegate.drainTo(collection);
    }

    @Override // java.util.concurrent.BlockingQueue
    public int drainTo(Collection<? super E> collection, int i) {
        return this.mDelegate.drainTo(collection, i);
    }

    @Override // java.util.Queue
    public E element() {
        return this.mDelegate.element();
    }

    public final BlockingQueue<E> getDelegate$threadpool_plugin_base_release() {
        BlockingQueue<E> blockingQueue = this.mDelegate;
        return blockingQueue instanceof BlockingQueueProxy ? ((BlockingQueueProxy) blockingQueue).getDelegate$threadpool_plugin_base_release() : blockingQueue;
    }

    public int getSize() {
        return this.mDelegate.size();
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return this.mDelegate.isEmpty();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public Iterator<E> iterator() {
        return this.mDelegate.iterator();
    }

    @Override // java.util.concurrent.BlockingQueue, java.util.Queue
    public boolean offer(E e) {
        return this.mDelegate.offer(e);
    }

    @Override // java.util.concurrent.BlockingQueue
    public boolean offer(E e, long j, TimeUnit timeUnit) {
        return this.mDelegate.offer(e, j, timeUnit);
    }

    @Override // java.util.Queue
    public E peek() {
        return this.mDelegate.peek();
    }

    @Override // java.util.Queue
    public E poll() {
        return this.mDelegate.poll();
    }

    @Override // java.util.concurrent.BlockingQueue
    public E poll(long j, TimeUnit timeUnit) {
        return !SuperThreadPool.INSTANCE.getEnableBlockFetchTask() ? poll() : this.mDelegate.poll(j, timeUnit);
    }

    @Override // java.util.concurrent.BlockingQueue
    public void put(E e) {
        this.mDelegate.put(e);
    }

    @Override // java.util.concurrent.BlockingQueue
    public int remainingCapacity() {
        return this.mDelegate.remainingCapacity();
    }

    @Override // java.util.Queue
    public E remove() {
        return this.mDelegate.remove();
    }

    @Override // java.util.concurrent.BlockingQueue, java.util.Collection
    public boolean remove(Object obj) {
        return this.mDelegate.remove(obj);
    }

    @Override // java.util.Collection
    public boolean removeAll(Collection<? extends Object> elements) {
        o.LJIIJ(elements, "elements");
        return this.mDelegate.removeAll(elements);
    }

    @Override // java.util.Collection
    public boolean retainAll(Collection<? extends Object> elements) {
        o.LJIIJ(elements, "elements");
        return this.mDelegate.retainAll(elements);
    }

    @Override // java.util.Collection
    public final int size() {
        return getSize();
    }

    @Override // java.util.concurrent.BlockingQueue
    public E take() {
        return !SuperThreadPool.INSTANCE.getEnableBlockFetchTask() ? poll() : this.mDelegate.take();
    }

    @Override // java.util.Collection
    public Object[] toArray() {
        return ORX.LIZIZ(this);
    }

    @Override // java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        return (T[]) ORX.LIZJ(this, tArr);
    }
}
