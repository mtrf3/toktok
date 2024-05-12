package X;

import Y.ARunnableS50S0100000_14;
import android.os.SystemClock;
import com.ss.android.ugc.bytex.pthread.base.PThreadExecutorsUtils;
import com.ss.android.ugc.bytex.thread_rename.base.DefaultThreadFactory;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* renamed from: X.W8h, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C81795W8h {
    public final Executor LIZ;
    public final InterfaceC81855WAp LIZIZ;
    public final Runnable LIZJ;
    public final int LJ;
    public final ARunnableS50S0100000_14 LIZLLL = new ARunnableS50S0100000_14(this, 240);
    public W8X LJFF = null;
    public int LJI = 0;
    public W93 LJII = W93.IDLE;
    public long LJIIIIZZ = 0;
    public long LJIIIZ = 0;

    public final void LIZ() {
        W8X w8x;
        synchronized (this) {
            w8x = this.LJFF;
            this.LJFF = null;
            this.LJI = 0;
        }
        W8X.LIZIZ(w8x);
    }

    public final synchronized long LIZLLL() {
        return this.LJIIIZ - this.LJIIIIZZ;
    }

    public final void LIZIZ() {
        W8X w8x;
        int i;
        long uptimeMillis = SystemClock.uptimeMillis();
        synchronized (this) {
            w8x = this.LJFF;
            i = this.LJI;
            this.LJFF = null;
            this.LJI = 0;
            this.LJII = W93.RUNNING;
            this.LJIIIZ = uptimeMillis;
        }
        try {
            if (LJI(w8x, i)) {
                this.LIZIZ.LIZ(w8x, i);
            }
        } finally {
            W8X.LIZIZ(w8x);
            LJ();
        }
    }

    public final void LJ() {
        long j;
        boolean z;
        long uptimeMillis = SystemClock.uptimeMillis();
        synchronized (this) {
            if (this.LJII == W93.RUNNING_AND_PENDING) {
                j = Math.max(this.LJIIIZ + this.LJ, uptimeMillis);
                this.LJIIIIZZ = uptimeMillis;
                this.LJII = W93.QUEUED;
                z = true;
            } else {
                this.LJII = W93.IDLE;
                j = 0;
                z = false;
            }
        }
        if (z) {
            LIZJ(j - uptimeMillis);
        }
    }

    public final void LJFF() {
        long max;
        boolean z;
        long uptimeMillis = SystemClock.uptimeMillis();
        synchronized (this) {
            if (!LJI(this.LJFF, this.LJI)) {
                return;
            }
            int ordinal = this.LJII.ordinal();
            if (ordinal != 0) {
                if (ordinal == 2) {
                    this.LJII = W93.RUNNING_AND_PENDING;
                }
                z = false;
                max = 0;
            } else {
                max = Math.max(this.LJIIIZ + this.LJ, uptimeMillis);
                this.LJIIIIZZ = uptimeMillis;
                this.LJII = W93.QUEUED;
                z = true;
            }
            if (z) {
                LIZJ(max - uptimeMillis);
            }
        }
    }

    public final void LIZJ(long j) {
        if (j > 0) {
            if (C81858WAs.LIZ == null) {
                C81858WAs.LIZ = PThreadExecutorsUtils.newSingleThreadScheduledExecutor(new DefaultThreadFactory("JobScheduler$JobStartExecutorSupplier"));
            }
            C81858WAs.LIZ.schedule(this.LIZLLL, j, TimeUnit.MILLISECONDS);
            return;
        }
        this.LIZLLL.run();
    }

    public static boolean LJI(W8X w8x, int i) {
        if (AbstractC81756W6u.LIZLLL(i) || AbstractC81756W6u.LJIIJ(i, 4) || W8X.LJIIJJI(w8x)) {
            return true;
        }
        return false;
    }

    public final boolean LJII(W8X w8x, int i) {
        W8X w8x2;
        if (!LJI(w8x, i)) {
            return false;
        }
        synchronized (this) {
            w8x2 = this.LJFF;
            this.LJFF = W8X.LIZ(w8x);
            this.LJI = i;
        }
        W8X.LIZIZ(w8x2);
        return true;
    }

    public C81795W8h(Executor executor, AbstractC81827W9n abstractC81827W9n, int i) {
        this.LIZ = executor;
        this.LIZIZ = abstractC81827W9n;
        this.LJ = i;
        this.LIZJ = new W8D(this, W92.getIntPriorityValue(abstractC81827W9n.LIZ));
    }
}
