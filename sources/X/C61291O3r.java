package X;

import java.util.LinkedList;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: X.O3r, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61291O3r {
    public static final ReentrantReadWriteLock LIZ = new ReentrantReadWriteLock();
    public static final LinkedList<C2WU> LIZIZ = new LinkedList<>();

    public static final void LIZIZ() {
        int i;
        ReentrantReadWriteLock reentrantReadWriteLock = LIZ;
        ReentrantReadWriteLock.ReadLock readLock = reentrantReadWriteLock.readLock();
        int i2 = 0;
        if (reentrantReadWriteLock.getWriteHoldCount() == 0) {
            i = reentrantReadWriteLock.getReadHoldCount();
            for (int i3 = 0; i3 < i; i3++) {
                readLock.unlock();
            }
        } else {
            i = 0;
        }
        ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
        writeLock.lock();
        try {
            LIZIZ.clear();
        } finally {
            while (i2 < i) {
                readLock.lock();
                i2++;
            }
            writeLock.unlock();
        }
    }

    public static final void LIZ(C2WU c2wu) {
        int i;
        ReentrantReadWriteLock reentrantReadWriteLock = LIZ;
        ReentrantReadWriteLock.ReadLock readLock = reentrantReadWriteLock.readLock();
        int i2 = 0;
        if (reentrantReadWriteLock.getWriteHoldCount() == 0) {
            i = reentrantReadWriteLock.getReadHoldCount();
            for (int i3 = 0; i3 < i; i3++) {
                readLock.unlock();
            }
        } else {
            i = 0;
        }
        ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
        writeLock.lock();
        try {
            LIZIZ.add(c2wu);
            while (true) {
                LinkedList<C2WU> linkedList = LIZIZ;
                if (linkedList.size() <= 10) {
                    break;
                } else {
                    linkedList.removeFirst();
                }
            }
        } finally {
            while (i2 < i) {
                readLock.lock();
                i2++;
            }
            writeLock.unlock();
        }
    }
}
