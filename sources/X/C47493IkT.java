package X;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: X.IkT, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C47493IkT implements InterfaceC47499IkZ {
    public static final Lock LJIIIIZZ = new ReentrantLock();
    public C47152Iey LJ;
    public InterfaceC47498IkY LJI;
    public final C47494IkU LJII;
    public double LIZ = -1.0d;
    public double LIZIZ = -1.0d;
    public Queue<C47152Iey> LIZJ = new ArrayBlockingQueue(C47497IkX.LIZJ);
    public C47152Iey[] LIZLLL = new C47152Iey[C47497IkX.LIZJ];
    public final List<InterfaceC47504Ike> LJFF = new ArrayList();

    @Override // X.InterfaceC47499IkZ
    public final void LIZ() {
        this.LIZ = -1.0d;
        synchronized (this.LJFF) {
            Iterator it = ((ArrayList) this.LJFF).iterator();
            while (it.hasNext()) {
                ((InterfaceC47504Ike) it.next()).LIZ();
            }
        }
    }

    @Override // X.InterfaceC47499IkZ
    public final C47152Iey[] LIZLLL() {
        Lock lock = LJIIIIZZ;
        ((ReentrantLock) lock).lock();
        try {
            Queue<C47152Iey> queue = this.LIZJ;
            if (queue != null) {
                C47152Iey[] c47152IeyArr = new C47152Iey[((ArrayBlockingQueue) queue).size()];
                Iterator it = ((ArrayBlockingQueue) this.LIZJ).iterator();
                int i = 0;
                while (it.hasNext()) {
                    C47152Iey c47152Iey = (C47152Iey) it.next();
                    c47152IeyArr[i] = new C47152Iey(c47152Iey.LJLIL, c47152Iey.LJLILLLLZI, c47152Iey.LJLJI, c47152Iey.LJLJJI);
                    i++;
                }
                return c47152IeyArr;
            }
            ((ReentrantLock) lock).unlock();
            return null;
        } finally {
            ((ReentrantLock) LJIIIIZZ).unlock();
        }
    }

    @Override // X.InterfaceC47499IkZ
    public final double calculateSpeed() {
        double d;
        ((ReentrantLock) LJIIIIZZ).lock();
        try {
            d = this.LJI.LIZIZ(this.LIZJ, this.LIZLLL);
        } catch (Throwable unused) {
            d = -1.0d;
        }
        if (-1.0d == d) {
            try {
                C47494IkU c47494IkU = this.LJII;
                if (c47494IkU != this.LJI) {
                    d = c47494IkU.LIZIZ(this.LIZJ, this.LIZLLL);
                }
            } catch (Throwable unused2) {
            }
        }
        ((ReentrantLock) LJIIIIZZ).unlock();
        return d;
    }

    @Override // X.InterfaceC47505Ikf
    public final double getSpeed() {
        C47494IkU c47494IkU;
        double d = this.LIZ;
        if (d == -1.0d) {
            ReentrantLock reentrantLock = (ReentrantLock) LJIIIIZZ;
            reentrantLock.lock();
            try {
                d = this.LIZ;
                if (d == -1.0d) {
                    d = this.LJI.LIZ(this.LIZJ, this.LIZLLL);
                    if (d == -1.0d && (c47494IkU = this.LJII) != this.LJI) {
                        d = c47494IkU.LIZIZ(this.LIZJ, this.LIZLLL);
                    }
                    this.LIZ = d;
                }
                reentrantLock.unlock();
            } catch (Throwable th) {
                ((ReentrantLock) LJIIIIZZ).unlock();
                throw th;
            }
        }
        if (d <= 0.001d) {
            double d2 = this.LIZIZ;
            if (d2 > 0.001d) {
                return d2;
            }
            return d;
        }
        return d;
    }

    public C47493IkT() {
        C47494IkU c47494IkU = new C47494IkU();
        this.LJII = c47494IkU;
        this.LJI = c47494IkU;
    }

    @Override // X.InterfaceC47499IkZ
    public final void LIZIZ(double d) {
        this.LIZIZ = d;
    }

    @Override // X.InterfaceC47499IkZ
    public final void setSpeedQueueSize(int i) {
        if (i >= 1 && i != this.LIZJ.size()) {
            Lock lock = LJIIIIZZ;
            ((ReentrantLock) lock).lock();
            try {
                try {
                    ArrayBlockingQueue arrayBlockingQueue = new ArrayBlockingQueue(i);
                    arrayBlockingQueue.addAll(this.LIZJ);
                    this.LIZLLL = new C47152Iey[i];
                    this.LIZJ = arrayBlockingQueue;
                    ((ReentrantLock) lock).unlock();
                } catch (Exception e) {
                    C16880lQ.LLLLIIL(e);
                    ((ReentrantLock) LJIIIIZZ).unlock();
                }
            } catch (Throwable th) {
                ((ReentrantLock) LJIIIIZZ).unlock();
                throw th;
            }
        }
    }

    @Override // X.InterfaceC47499IkZ
    public final void monitorVideoSpeed(double d, double d2, long j) {
        ReentrantLock reentrantLock = (ReentrantLock) LJIIIIZZ;
        reentrantLock.lock();
        try {
            C47152Iey c47152Iey = this.LJ;
            if (c47152Iey != null) {
                c47152Iey.LJLIL = d;
                c47152Iey.LJLILLLLZI = d2;
                c47152Iey.LJLJI = j;
                c47152Iey.LJLJJI = SystemClock.elapsedRealtime();
            } else {
                c47152Iey = new C47152Iey(d, d2, j, SystemClock.elapsedRealtime());
            }
            if (!((ArrayBlockingQueue) this.LIZJ).offer(c47152Iey)) {
                this.LJ = (C47152Iey) ((ArrayBlockingQueue) this.LIZJ).poll();
                ((ArrayBlockingQueue) this.LIZJ).offer(c47152Iey);
            }
            LIZ();
            reentrantLock.unlock();
        } catch (Throwable th) {
            LIZ();
            ((ReentrantLock) LJIIIIZZ).unlock();
            throw th;
        }
    }
}
