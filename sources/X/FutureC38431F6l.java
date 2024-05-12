package X;

import android.os.SystemClock;
import java.util.concurrent.Future;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.F6l, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class FutureC38431F6l implements Future<Integer> {
    public final Semaphore LJLIL = new Semaphore(1);
    public final AtomicInteger LJLILLLLZI = new AtomicInteger(1);

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final Integer get() {
        boolean z;
        synchronized (C38433F6n.LJ) {
            if (C38433F6n.LIZJ == 0) {
                C38433F6n.LIZJ = SystemClock.elapsedRealtime();
                C38433F6n.LIZLLL = 3;
            }
        }
        this.LJLIL.acquire();
        this.LJLIL.release();
        int i = 0;
        if (this.LJLILLLLZI.get() == 4) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            i = -2022;
        }
        return Integer.valueOf(i);
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        if (this.LJLILLLLZI.get() == 3) {
            return true;
        }
        return false;
    }

    @Override // java.util.concurrent.Future
    public final Integer get(long j, TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }
}
