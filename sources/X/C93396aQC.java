package X;

import X.InterfaceC191727fk;
import com.ss.android.ugc.bytex.pthread.base.PThreadExecutorsUtils;
import com.ss.android.ugc.bytex.thread_rename.base.DefaultThreadFactory;
import java.util.Collection;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: X.aQC, reason: case insensitive filesystem */
/* loaded from: classes32.dex */
public final class C93396aQC<T extends InterfaceC191727fk> extends AbstractC93365aPh<T> {
    public final InterfaceC93348aPQ<T> LIZIZ;
    public final C0M6<Integer, java.util.Set<? extends InterfaceC199697sb<T>>> LIZJ = new C0M6<>(5);
    public final ReadWriteLock LIZLLL = new ReentrantReadWriteLock();
    public final Executor LJ = PThreadExecutorsUtils.newCachedThreadPool(new DefaultThreadFactory("PreCachingAlgorithmDecorator"));

    @Override // X.InterfaceC93348aPQ
    public final int LIZJ() {
        return this.LIZIZ.LIZJ();
    }

    @Override // X.InterfaceC93348aPQ
    public final void LIZLLL() {
        this.LIZIZ.LIZLLL();
        this.LIZJ.LJIIIIZZ(-1);
    }

    @Override // X.InterfaceC93348aPQ
    public final Collection<T> getItems() {
        return this.LIZIZ.getItems();
    }

    public C93396aQC(C93395aQB c93395aQB) {
        this.LIZIZ = c93395aQB;
    }

    @Override // X.InterfaceC93348aPQ
    public final boolean LIZIZ(Collection<T> collection) {
        boolean LIZIZ = this.LIZIZ.LIZIZ(collection);
        if (LIZIZ) {
            this.LIZJ.LJIIIIZZ(-1);
        }
        return LIZIZ;
    }

    @Override // X.InterfaceC93348aPQ
    public final java.util.Set<? extends InterfaceC199697sb<T>> LJFF(float f) {
        int i = (int) f;
        java.util.Set<? extends InterfaceC199697sb<T>> LJII = LJII(i);
        int i2 = i + 1;
        if (this.LIZJ.LIZIZ(Integer.valueOf(i2)) == null) {
            this.LJ.execute(new RunnableC93349aPR(this, i2));
        }
        int i3 = i - 1;
        if (this.LIZJ.LIZIZ(Integer.valueOf(i3)) == null) {
            this.LJ.execute(new RunnableC93349aPR(this, i3));
        }
        return LJII;
    }

    public final java.util.Set<? extends InterfaceC199697sb<T>> LJII(int i) {
        ((ReentrantReadWriteLock) this.LIZLLL).readLock().lock();
        java.util.Set<? extends InterfaceC199697sb<T>> LIZIZ = this.LIZJ.LIZIZ(Integer.valueOf(i));
        ((ReentrantReadWriteLock) this.LIZLLL).readLock().unlock();
        if (LIZIZ == null) {
            ((ReentrantReadWriteLock) this.LIZLLL).writeLock().lock();
            LIZIZ = this.LIZJ.LIZIZ(Integer.valueOf(i));
            if (LIZIZ == null) {
                LIZIZ = this.LIZIZ.LJFF(i);
                this.LIZJ.LIZJ(Integer.valueOf(i), LIZIZ);
            }
            ((ReentrantReadWriteLock) this.LIZLLL).writeLock().unlock();
        }
        return LIZIZ;
    }

    @Override // X.InterfaceC93348aPQ
    public final boolean LJI(C191707fi c191707fi, C191707fi c191707fi2) {
        boolean LJI = this.LIZIZ.LJI(c191707fi, c191707fi2);
        if (LJI) {
            this.LIZJ.LJIIIIZZ(-1);
        }
        return LJI;
    }
}
