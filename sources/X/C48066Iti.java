package X;

import Y.ARunnableS2S1110000_8;
import Y.ARunnableS44S0100000_8;
import android.text.TextUtils;
import android.util.SparseArray;
import com.ss.android.ugc.bytex.pthread.base.proxy.PThreadPoolExecutor;
import java.net.ServerSocket;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.Iti, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48066Iti {
    public static volatile C48066Iti LJIILIIL;
    public volatile ServerSocket LIZ;
    public volatile int LIZIZ;
    public final AtomicInteger LIZJ = new AtomicInteger(0);
    public final PThreadPoolExecutor LIZLLL = new PThreadPoolExecutor(0, Integer.MAX_VALUE, 60, TimeUnit.SECONDS, new SynchronousQueue(), new ThreadFactoryC37299EkR());
    public volatile C47961Is1 LJ;
    public volatile C47935Irb LJFF;
    public final SparseArray<java.util.Set<C48072Ito>> LJI;
    public final C48067Itj LJII;
    public volatile long LJIIIIZZ;
    public volatile long LJIIIZ;
    public volatile long LJIIJ;
    public final ARunnableS44S0100000_8 LJIIJJI;
    public final AtomicBoolean LJIIL;

    public static C48066Iti LIZJ() {
        if (LJIILIIL == null) {
            synchronized (C48066Iti.class) {
                if (LJIILIIL == null) {
                    LJIILIIL = new C48066Iti();
                }
            }
        }
        return LJIILIIL;
    }

    public final void LIZIZ() {
        if (this.LIZJ.compareAndSet(1, 2) || this.LIZJ.compareAndSet(0, 2)) {
            ServerSocket serverSocket = this.LIZ;
            if (serverSocket != null) {
                try {
                    serverSocket.close();
                } catch (Throwable unused) {
                }
            }
            this.LIZLLL.shutdownNow();
            ArrayList arrayList = new ArrayList();
            synchronized (this.LJI) {
                int size = this.LJI.size();
                for (int i = 0; i < size; i++) {
                    SparseArray<java.util.Set<C48072Ito>> sparseArray = this.LJI;
                    java.util.Set<C48072Ito> set = sparseArray.get(sparseArray.keyAt(i));
                    if (set != null) {
                        arrayList.addAll(set);
                        set.clear();
                    }
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((C48072Ito) it.next()).LJIIIIZZ();
            }
        }
    }

    public C48066Iti() {
        SparseArray<java.util.Set<C48072Ito>> sparseArray = new SparseArray<>(2);
        this.LJI = sparseArray;
        this.LJII = new C48067Itj(this);
        this.LJIIIIZZ = 10000L;
        this.LJIIIZ = 10000L;
        this.LJIIJ = 10000L;
        this.LJIIJJI = new ARunnableS44S0100000_8(this, 128);
        this.LJIIL = new AtomicBoolean();
        sparseArray.put(0, new HashSet());
        sparseArray.put(1, new HashSet());
    }

    public final void LIZ(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("cancelProxyTask() called, rawKey = [");
        LIZ.append(str);
        LIZ.append("]");
        C48841JEv.LJIIIIZZ("TAG_PROXY_ProxyServer", X1D.LIZIZ(LIZ), null);
        C48100IuG.LJII(new ARunnableS2S1110000_8(this, str, 1));
    }

    public final boolean LIZLLL(int i, String str) {
        if (str == null) {
            return false;
        }
        synchronized (this.LJI) {
            java.util.Set<C48072Ito> set = this.LJI.get(i);
            if (set != null) {
                for (C48072Ito c48072Ito : set) {
                    if (c48072Ito != null && str.equals(c48072Ito.LJLJLJ)) {
                        return true;
                    }
                }
            }
            return false;
        }
    }
}
