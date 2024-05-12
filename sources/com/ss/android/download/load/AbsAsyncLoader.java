package com.ss.android.download.load;

import X.AbstractC84370X9i;
import X.C16880lQ;
import X.OSQ;
import X.ThreadFactoryC38888FOa;
import android.os.Handler;
import android.os.Message;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes16.dex */
public abstract class AbsAsyncLoader<K, T, E, V, R, C, N extends AbstractC84370X9i<K, T, E, V, R, C, N>> implements WeakHandler.IHandler {
    public static final ExecutorService CACHED_EXECUTOR = C16880lQ.LLLLLZL(new ThreadFactoryC38888FOa("AsyncLoader-Worker", true));
    public static final AtomicInteger mInstCount = new AtomicInteger();
    public final int mCapacity;
    public final Handler mHandler;
    public N mHead;
    public volatile boolean mInited;
    public final Object mLock;
    public final HashMap<K, N> mMap;
    public final int mMaxWorker;
    public final AtomicBoolean mPaused;
    public ArrayList<N> mScrapNodes;
    public final LinkedList<AbsAsyncLoader<K, T, E, V, R, C, N>.a> mScrapTasks;
    public final AtomicBoolean mStoped;
    public N mTail;
    public volatile int mWorkTag;
    public final String mWorkerName;

    /* loaded from: classes16.dex */
    public class a implements Runnable {
        public N LJLIL;
        public int LJLILLLLZI;

        public final void LIZ() {
            R r;
            N n2 = this.LJLIL;
            if (n2 != null) {
                try {
                    r = (R) AbsAsyncLoader.this.doInBackground(n2.LIZJ, n2.LIZLLL, n2.LJ);
                } catch (Exception unused) {
                    r = null;
                }
                this.LJLIL.LJFF = r;
                Message obtainMessage = AbsAsyncLoader.this.mHandler.obtainMessage(1001);
                obtainMessage.obj = this;
                obtainMessage.arg1 = this.LJLILLLLZI;
                AbsAsyncLoader.this.mHandler.sendMessage(obtainMessage);
                return;
            }
            Message obtainMessage2 = AbsAsyncLoader.this.mHandler.obtainMessage(1002);
            obtainMessage2.obj = this;
            AbsAsyncLoader.this.mHandler.sendMessage(obtainMessage2);
        }

        @Override // java.lang.Runnable
        public final void run() {
            boolean LIZ;
            try {
                LIZ();
            } finally {
                if (LIZ) {
                }
            }
        }

        public a() {
        }
    }

    public abstract R doInBackground(K k, T t, E e);

    public abstract N makeNode();

    public abstract void onLoaded(K k, T t, E e, C c, R r);

    private boolean hasNodeInQueue() {
        if (this.mStoped.get() || this.mPaused.get() || this.mHead.LIZIZ == this.mTail) {
            return false;
        }
        return true;
    }

    private N poll() {
        N n2;
        if (this.mStoped.get() || this.mPaused.get() || (n2 = this.mHead.LIZIZ) == this.mTail) {
            return null;
        }
        detach(n2);
        n2.LIZIZ = null;
        n2.LIZ = null;
        return n2;
    }

    private void tryInit() {
        if (!this.mInited) {
            this.mHead = getNode();
            N node = getNode();
            this.mTail = node;
            N n2 = this.mHead;
            n2.LIZIZ = node;
            node.LIZ = n2;
            this.mInited = true;
        }
    }

    private void trySubmitTask() {
        AbsAsyncLoader<K, T, E, V, R, C, N>.a poll;
        synchronized (this.mLock) {
            while (hasNodeInQueue()) {
                try {
                    poll = this.mScrapTasks.poll();
                } catch (Throwable unused) {
                }
                if (poll != null) {
                    N poll2 = poll();
                    if (poll2 == null) {
                        this.mScrapTasks.add(poll);
                        return;
                    } else {
                        poll.LJLILLLLZI = this.mWorkTag;
                        poll.LJLIL = poll2;
                        CACHED_EXECUTOR.submit(poll);
                    }
                } else {
                    return;
                }
            }
        }
    }

    public void clearQueue() {
        N n2;
        N n3;
        synchronized (this.mLock) {
            while (true) {
                n2 = this.mHead;
                N n4 = n2.LIZIZ;
                n3 = this.mTail;
                if (n4 == n3 || n4 == null) {
                    break;
                }
                n4.LIZIZ();
                this.mMap.remove(this.mHead.LIZIZ.LIZJ);
                N n5 = this.mHead;
                n5.LIZIZ = n5.LIZIZ.LIZIZ;
            }
            n2.LIZIZ = n3;
            n3.LIZ = n2;
        }
    }

    public N getNode() {
        int size = this.mScrapNodes.size();
        if (size <= 0) {
            return makeNode();
        }
        return (N) ListProtector.remove(this.mScrapNodes, size - 1);
    }

    public int getTaskCount() {
        int size;
        synchronized (this.mLock) {
            size = this.mMap.size();
        }
        return size;
    }

    public void invalidate() {
        synchronized (this.mLock) {
            if (!this.mStoped.get()) {
                this.mWorkTag++;
                Iterator<N> it = this.mMap.values().iterator();
                while (it.hasNext()) {
                    it.next().LIZIZ();
                }
                this.mMap.clear();
                N n2 = this.mHead;
                N n3 = this.mTail;
                n2.LIZIZ = n3;
                n3.LIZ = n2;
            }
        }
    }

    public boolean isStopped() {
        return this.mStoped.get();
    }

    public void pause() {
        synchronized (this.mLock) {
            this.mPaused.set(true);
        }
    }

    public void resume() {
        synchronized (this.mLock) {
            if (this.mStoped.get()) {
                return;
            }
            if (this.mPaused.get()) {
                this.mPaused.set(false);
                trySubmitTask();
            }
        }
    }

    public void stop() {
        synchronized (this.mLock) {
            if (!this.mStoped.get()) {
                mInstCount.decrementAndGet();
                this.mStoped.set(true);
                Iterator<N> it = this.mMap.values().iterator();
                while (it.hasNext()) {
                    it.next().LIZIZ();
                }
                this.mMap.clear();
                N n2 = this.mHead;
                N n3 = this.mTail;
                n2.LIZIZ = n3;
                n3.LIZ = n2;
            }
        }
        this.mHandler.removeMessages(1001);
    }

    private void detach(N n2) {
        N n3 = n2.LIZ;
        n3.LIZIZ = n2.LIZIZ;
        n2.LIZIZ.LIZ = n3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public void handleMsg(Message message) {
        AbsAsyncLoader<K, T, E, V, R, C, N>.a aVar;
        N n2;
        int i = message.what;
        if ((i != 1001 && i != 1002) || (aVar = (a) message.obj) == null) {
            return;
        }
        synchronized (this.mLock) {
            if (message.what == 1001) {
                n2 = aVar.LJLIL;
            } else {
                n2 = null;
            }
            aVar.LJLIL = null;
            aVar.LJLILLLLZI = 0;
            this.mScrapTasks.add(aVar);
            if (n2 != null) {
                if (!this.mStoped.get() && message.arg1 == this.mWorkTag) {
                    this.mMap.remove(n2.LIZJ);
                }
                onLoaded(n2.LIZJ, n2.LIZLLL, n2.LJ, n2.LIZJ(), n2.LJFF);
                recycleNode(n2);
            }
        }
        trySubmitTask();
    }

    public boolean isInQueue(String str) {
        synchronized (this.mLock) {
            boolean z = true;
            if (this.mStoped.get()) {
                return true;
            }
            if (this.mMap.get(str) == null) {
                z = false;
            }
            return z;
        }
    }

    public void loadData(List<OSQ<K, T, E, V>> list) {
        loadData(list, false);
    }

    public void recycleNode(N n2) {
        if (n2 != null) {
            n2.LIZJ = null;
            n2.LIZ = null;
            n2.LIZIZ = null;
            n2.LJ = null;
            n2.LIZLLL = null;
            n2.LJFF = null;
            n2.LIZIZ();
            if (this.mScrapNodes.size() < 50) {
                this.mScrapNodes.add(n2);
            }
        }
    }

    private void attach(N n2, N n3) {
        N n4 = n2.LIZIZ;
        n3.LIZIZ = n4;
        n3.LIZ = n2;
        n4.LIZ = n3;
        n2.LIZIZ = n3;
    }

    public void cancelTask(K k, V v) {
        if (k == null) {
            return;
        }
        synchronized (this.mLock) {
            if (this.mStoped.get()) {
                return;
            }
            N n2 = this.mMap.get(k);
            if (n2 == null) {
                return;
            }
            n2.LJ();
            if (!n2.LIZLLL()) {
                return;
            }
            if (n2.LIZIZ != null && n2.LIZ != null) {
                detach(n2);
                this.mMap.remove(k);
                recycleNode(n2);
            }
        }
    }

    public void loadData(List<OSQ<K, T, E, V>> list, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        synchronized (this.mLock) {
            if (this.mStoped.get()) {
                return;
            }
            if (z) {
                for (OSQ<K, T, E, V> osq : list) {
                }
            } else {
                ListIterator<OSQ<K, T, E, V>> listIterator = list.listIterator(list.size());
                while (listIterator.hasPrevious()) {
                    listIterator.previous();
                }
            }
            trySubmitTask();
        }
    }

    public AbsAsyncLoader(int i, int i2, String str) {
        this(i, i2, str, false);
    }

    public AbsAsyncLoader(int i, int i2, String str, boolean z) {
        this.mLock = new Object();
        int i3 = 0;
        this.mInited = false;
        this.mScrapTasks = new LinkedList<>();
        this.mScrapNodes = new ArrayList<>();
        if (i2 >= 1) {
            this.mCapacity = i <= i2 ? i2 + 1 : i;
            this.mMaxWorker = i2;
            this.mWorkerName = str;
            this.mWorkTag = 1;
            this.mStoped = new AtomicBoolean();
            this.mPaused = new AtomicBoolean();
            this.mMap = new HashMap<>();
            tryInit();
            if (z) {
                this.mHandler = new WeakHandler(C16880lQ.LLJJJJ(), this);
            } else {
                this.mHandler = new WeakHandler(this);
            }
            do {
                this.mScrapTasks.add(new a());
                i3++;
            } while (i3 < i2);
            return;
        }
        throw new IllegalArgumentException("maxWorker must be great than 1");
    }

    private void addTask(K k, T t, E e, V v) {
        addTask(k, t, e, v, false);
    }

    public void loadData(K k, T t, E e, V v) {
        if (k == null) {
            return;
        }
        synchronized (this.mLock) {
            if (this.mStoped.get()) {
                return;
            }
            addTask(k, t, e, v);
            trySubmitTask();
        }
    }

    private void addTask(K k, T t, E e, V v, boolean z) {
        N n2;
        N n3 = this.mMap.get(k);
        if (n3 != null) {
            if (v != null) {
                n3.LIZ();
            }
            if (n3.LIZIZ != null && (n2 = n3.LIZ) != null && !z && n2 != this.mHead) {
                detach(n3);
                attach(this.mHead, n3);
                return;
            }
            return;
        }
        if (z && this.mMap.size() > this.mCapacity) {
            return;
        }
        N node = getNode();
        node.LIZJ = k;
        node.LIZLLL = t;
        if (v != null) {
            node.LIZ();
        }
        node.LJ = e;
        if (z) {
            attach(this.mTail.LIZ, node);
        } else {
            attach(this.mHead, node);
        }
        this.mMap.put(k, node);
        if (this.mMap.size() <= this.mCapacity) {
            return;
        }
        this.mMap.remove(this.mTail.LIZ.LIZJ);
        N n4 = this.mTail.LIZ;
        detach(n4);
        recycleNode(n4);
    }
}
