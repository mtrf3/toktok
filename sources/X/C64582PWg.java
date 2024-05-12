package X;

import Y.ARunnableS47S0100000_11;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.bytex.pthread.base.proxy.PThreadPoolExecutor;
import java.lang.ref.Reference;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.TimeUnit;

/* renamed from: X.PWg, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64582PWg {
    public static final PThreadPoolExecutor LJI = new PThreadPoolExecutor(0, Integer.MAX_VALUE, 60, TimeUnit.SECONDS, new SynchronousQueue(), new P8T("OkHttp ConnectionPool", true));
    public final int LIZ;
    public final long LIZIZ;
    public final Runnable LIZJ;
    public final Deque<C64561PVl> LIZLLL;
    public final C48292IxM LJ;
    public boolean LJFF;

    public C64582PWg() {
        this(5, 5L, TimeUnit.MINUTES);
    }

    public final long LIZ(long j) {
        synchronized (this) {
            Iterator it = ((ArrayDeque) this.LIZLLL).iterator();
            C64561PVl c64561PVl = null;
            long j2 = Long.MIN_VALUE;
            int i = 0;
            int i2 = 0;
            while (it.hasNext()) {
                C64561PVl c64561PVl2 = (C64561PVl) it.next();
                if (LIZIZ(c64561PVl2, j) > 0) {
                    i2++;
                } else {
                    i++;
                    long j3 = j - c64561PVl2.LJIILJJIL;
                    if (j3 > j2) {
                        c64561PVl = c64561PVl2;
                        j2 = j3;
                    }
                }
            }
            long j4 = this.LIZIZ;
            if (j2 >= j4 || i > this.LIZ) {
                ((ArrayDeque) this.LIZLLL).remove(c64561PVl);
                PVA.LJFF(c64561PVl.LJ);
                return 0L;
            }
            if (i > 0) {
                return j4 - j2;
            }
            if (i2 > 0) {
                return j4;
            }
            this.LJFF = false;
            return -1L;
        }
    }

    public final int LIZIZ(C64561PVl c64561PVl, long j) {
        List<Reference<C64583PWh>> list = c64561PVl.LJIILIIL;
        int i = 0;
        while (true) {
            ArrayList arrayList = (ArrayList) list;
            if (i < arrayList.size()) {
                Reference reference = (Reference) ListProtector.get(arrayList, i);
                if (reference.get() != null) {
                    i++;
                } else {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("A connection to ");
                    LIZ.append(c64561PVl.LIZJ.LIZ.LIZ);
                    LIZ.append(" was leaked. Did you forget to close a response body?");
                    P9A.LIZ.LJIIL(((PX5) reference).LIZ, X1D.LIZIZ(LIZ));
                    ListProtector.remove(arrayList, i);
                    c64561PVl.LJIIJ = true;
                    if (arrayList.isEmpty()) {
                        c64561PVl.LJIILJJIL = j - this.LIZIZ;
                        return 0;
                    }
                }
            } else {
                return arrayList.size();
            }
        }
    }

    public C64582PWg(int i, long j, TimeUnit timeUnit) {
        this.LIZJ = new ARunnableS47S0100000_11(this, 129);
        this.LIZLLL = new ArrayDeque();
        this.LJ = new C48292IxM(6);
        this.LIZ = i;
        this.LIZIZ = timeUnit.toNanos(j);
        if (j > 0) {
        } else {
            throw new IllegalArgumentException(C61845OOz.LIZ("keepAliveDuration <= 0: ", j));
        }
    }
}
