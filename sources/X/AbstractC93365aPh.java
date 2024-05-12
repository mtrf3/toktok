package X;

import X.InterfaceC191727fk;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: X.aPh, reason: case insensitive filesystem */
/* loaded from: classes32.dex */
public abstract class AbstractC93365aPh<T extends InterfaceC191727fk> implements InterfaceC93348aPQ<T> {
    public final ReadWriteLock LIZ = new ReentrantReadWriteLock();

    @Override // X.InterfaceC93348aPQ
    public final void lock() {
        ((ReentrantReadWriteLock) this.LIZ).writeLock().lock();
    }

    @Override // X.InterfaceC93348aPQ
    public final void unlock() {
        ((ReentrantReadWriteLock) this.LIZ).writeLock().unlock();
    }
}
