package X;

import android.os.StatFs;
import android.os.SystemClock;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: X.WDy, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C81942WDy implements InterfaceC81714W5e, W60 {
    public static final Class<?> LJIILL = C81942WDy.class;
    public static final long LJIILLIIL = TimeUnit.HOURS.toMillis(2);
    public static final long LJIIZILJ = TimeUnit.MINUTES.toMillis(30);
    public final long LIZ;
    public final long LIZIZ;
    public long LIZJ;
    public final WE3 LIZLLL;
    public final java.util.Set<String> LJ;
    public long LJFF;
    public final long LJI;
    public final WE0 LJII;
    public final WE2 LJIIIIZZ;
    public final AnonymousClass639 LJIIIZ;
    public final InterfaceC79254V8o LJIIJ;
    public final boolean LJIIJJI;
    public final WE5 LJIIL;
    public final WEM LJIILIIL;
    public final Object LJIILJJIL = new Object();

    @Override // X.W60
    public final void LIZ() {
        synchronized (this.LJIILJJIL) {
            try {
                this.LJIIIIZZ.clearAll();
                ((HashSet) this.LJ).clear();
                this.LIZLLL.onCleared();
            } catch (IOException | NullPointerException e) {
                InterfaceC79254V8o interfaceC79254V8o = this.LJIIJ;
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("clearAll: ");
                LIZ.append(e.getMessage());
                X1D.LIZIZ(LIZ);
                interfaceC79254V8o.getClass();
            }
            this.LJIIL.LIZLLL();
        }
    }

    @Override // X.W60
    public final void LIZIZ() {
        synchronized (this.LJIILJJIL) {
            LJIIJJI();
            long LIZIZ = this.LJIIL.LIZIZ();
            long j = this.LJI;
            if (j > 0 && LIZIZ > 0 && LIZIZ >= j) {
                double d = 1.0d - (j / LIZIZ);
                if (d > 0.02d) {
                    LJIILL(d);
                }
            }
        }
    }

    public final boolean LJIIJJI() {
        boolean z;
        this.LJIILIIL.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        WE5 we5 = this.LJIIL;
        synchronized (we5) {
            z = we5.LIZ;
        }
        if (z) {
            long j = this.LJFF;
            if (j != -1 && currentTimeMillis - j <= LJIIZILJ) {
                return false;
            }
        }
        return LJIIL();
    }

    public final boolean LJIIL() {
        java.util.Set<String> set;
        boolean z;
        java.util.Set<String> set2;
        this.LJIILIIL.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        long j = LJIILLIIL + currentTimeMillis;
        if (this.LJIIJJI && ((HashSet) this.LJ).isEmpty()) {
            set = this.LJ;
        } else if (this.LJIIJJI) {
            set = new HashSet<>();
        } else {
            set = null;
        }
        try {
            long j2 = 0;
            long j3 = -1;
            boolean z2 = false;
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            for (WE9 we9 : this.LJIIIIZZ.LJIIIIZZ()) {
                i++;
                j2 += we9.getSize();
                if (we9.getTimestamp() > j) {
                    i2++;
                    i3 = (int) (i3 + we9.getSize());
                    j3 = Math.max(we9.getTimestamp() - currentTimeMillis, j3);
                    z2 = true;
                } else if (this.LJIIJJI) {
                    set.add(we9.getId());
                }
            }
            if (z2) {
                InterfaceC79254V8o interfaceC79254V8o = this.LJIIJ;
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("Future timestamp found in ");
                LIZ.append(i2);
                LIZ.append(" files , with a total size of ");
                LIZ.append(i3);
                LIZ.append(" bytes, and a maximum time delta of ");
                LIZ.append(j3);
                LIZ.append("ms");
                X1D.LIZIZ(LIZ);
                interfaceC79254V8o.getClass();
            }
            long j4 = i;
            if (this.LJIIL.LIZ() != j4 || this.LJIIL.LIZIZ() != j2) {
                if (this.LJIIJJI && (set2 = this.LJ) != set) {
                    ((HashSet) set2).clear();
                    this.LJ.addAll(set);
                }
                WE5 we5 = this.LJIIL;
                synchronized (we5) {
                    we5.LIZJ = j4;
                    we5.LIZIZ = j2;
                    z = true;
                    we5.LIZ = true;
                }
            } else {
                z = true;
            }
            LJIILLIIL();
            this.LJFF = currentTimeMillis;
            return z;
        } catch (IOException e) {
            InterfaceC79254V8o interfaceC79254V8o2 = this.LJIIJ;
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("calcFileCacheSize: ");
            LIZ2.append(e.getMessage());
            X1D.LIZIZ(LIZ2);
            interfaceC79254V8o2.getClass();
            return false;
        }
    }

    public final void LJIILLIIL() {
        synchronized (this.LJIILJJIL) {
            try {
                Collection<WE9> LJFF = this.LJIIIIZZ.LJFF();
                List<WE9> LJI = this.LJIIIIZZ.LJI();
                if (LJFF.size() > LJI.size()) {
                    Iterator<WE9> it = LJFF.iterator();
                    while (it.hasNext()) {
                        LJIILIIL(it.next().getId(), LJI);
                    }
                }
            } catch (IOException unused) {
                W58.LIZLLL(LJIILL, "remove config file failed");
            }
        }
    }

    public final void LJIIZILJ() {
        EnumC79575VKx enumC79575VKx;
        StatFs statFs;
        if (this.LJIIIIZZ.isExternal()) {
            enumC79575VKx = EnumC79575VKx.EXTERNAL;
        } else {
            enumC79575VKx = EnumC79575VKx.INTERNAL;
        }
        WE0 we0 = this.LJII;
        long LIZIZ = this.LIZIZ - this.LJIIL.LIZIZ();
        we0.LIZ();
        we0.LIZ();
        if (((ReentrantLock) we0.LJFF).tryLock()) {
            try {
                if (SystemClock.uptimeMillis() - we0.LJ > WE0.LJIIIIZZ) {
                    we0.LIZ = WE0.LIZIZ(we0.LIZ, we0.LIZIZ);
                    we0.LIZJ = WE0.LIZIZ(we0.LIZJ, we0.LIZLLL);
                    we0.LJ = SystemClock.uptimeMillis();
                }
            } finally {
                ((ReentrantLock) we0.LJFF).unlock();
            }
        }
        if (enumC79575VKx == EnumC79575VKx.INTERNAL) {
            statFs = we0.LIZ;
        } else {
            statFs = we0.LIZJ;
        }
        if (statFs != null) {
            long availableBlocksLong = statFs.getAvailableBlocksLong() * statFs.getBlockSizeLong();
            if (availableBlocksLong > 0 && availableBlocksLong >= LIZIZ) {
                this.LIZJ = this.LIZIZ;
                return;
            }
        }
        this.LIZJ = this.LIZ;
    }

    @Override // X.InterfaceC81714W5e
    public final long getCount() {
        return this.LJIIL.LIZ();
    }

    @Override // X.InterfaceC81714W5e
    public final long getSize() {
        return this.LJIIL.LIZIZ();
    }

    @Override // X.InterfaceC81714W5e
    public final java.util.Map<String, String> LIZJ(W6U w6u) {
        List<String> LIZ = C81749W6n.LIZ(w6u);
        java.util.Map map = null;
        for (int i = 0; i < LIZ.size(); i++) {
            map = this.LJIIIIZZ.LJIIIZ(w6u, LIZ.get(i));
            if (map != null) {
                break;
            }
        }
        return map;
    }

    @Override // X.InterfaceC81714W5e
    public final boolean LIZLLL(W6U w6u) {
        synchronized (this.LJIILJJIL) {
            List<String> LIZ = C81749W6n.LIZ(w6u);
            for (int i = 0; i < LIZ.size(); i++) {
                if (((HashSet) this.LJ).contains(LIZ.get(i))) {
                    return true;
                }
            }
            return false;
        }
    }

    @Override // X.InterfaceC81714W5e
    public final WEK LJ(W6U w6u) {
        WEK wek;
        W6W LIZ = W6W.LIZ();
        LIZ.LIZ = w6u;
        try {
            synchronized (this.LJIILJJIL) {
                List<String> LIZ2 = C81749W6n.LIZ(w6u);
                int i = 0;
                String str = null;
                wek = null;
                while (true) {
                    if (i < LIZ2.size()) {
                        str = LIZ2.get(i);
                        wek = this.LJIIIIZZ.LIZ(w6u, str);
                        if (wek != null) {
                            this.LIZLLL.LJ(LIZ);
                            ((HashSet) this.LJ).add(str);
                            break;
                        }
                        i++;
                    } else {
                        this.LIZLLL.LIZ(LIZ);
                        ((HashSet) this.LJ).remove(str);
                        break;
                    }
                }
            }
            return wek;
        } catch (IOException unused) {
            this.LJIIJ.getClass();
            this.LIZLLL.LIZLLL(LIZ);
            return null;
        } finally {
            LIZ.LIZIZ();
        }
    }

    @Override // X.InterfaceC81714W5e
    public final void LJFF(W6U w6u) {
        synchronized (this.LJIILJJIL) {
            try {
                List<String> LIZ = C81749W6n.LIZ(w6u);
                for (int i = 0; i < LIZ.size(); i++) {
                    String str = LIZ.get(i);
                    this.LJIIIIZZ.remove(str);
                    ((HashSet) this.LJ).remove(str);
                    this.LJIIIIZZ.LJ(str);
                }
            } catch (IOException e) {
                InterfaceC79254V8o interfaceC79254V8o = this.LJIIJ;
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("delete: ");
                LIZ2.append(e.getMessage());
                X1D.LIZIZ(LIZ2);
                interfaceC79254V8o.getClass();
            }
        }
    }

    @Override // X.InterfaceC81714W5e
    public final boolean LJII(W6U w6u) {
        synchronized (this.LJIILJJIL) {
            if (LIZLLL(w6u)) {
                return true;
            }
            try {
                List<String> LIZ = C81749W6n.LIZ(w6u);
                for (int i = 0; i < LIZ.size(); i++) {
                    String str = LIZ.get(i);
                    if (this.LJIIIIZZ.LIZLLL(w6u, str)) {
                        ((HashSet) this.LJ).add(str);
                        return true;
                    }
                }
                return false;
            } catch (IOException unused) {
                return false;
            }
        }
    }

    public final void LJIIIZ(long j) {
        try {
            Collection<WE9> LJIIJ = LJIIJ(this.LJIIIIZZ.LJIIIIZZ());
            long LIZIZ = this.LJIIL.LIZIZ() - j;
            Iterator it = ((ArrayList) LJIIJ).iterator();
            int i = 0;
            long j2 = 0;
            while (it.hasNext()) {
                WE9 we9 = (WE9) it.next();
                if (j2 > LIZIZ) {
                    break;
                }
                long LIZJ = this.LJIIIIZZ.LIZJ(we9);
                ((HashSet) this.LJ).remove(we9.getId());
                this.LJIIIIZZ.LJ(we9.getId());
                if (LIZJ > 0) {
                    i++;
                    j2 += LIZJ;
                    W6W LIZ = W6W.LIZ();
                    we9.getId();
                    this.LIZLLL.LIZIZ(LIZ);
                    LIZ.LIZIZ();
                }
            }
            this.LJIIL.LIZJ(-j2, -i);
            this.LJIIIIZZ.LIZIZ();
        } catch (IOException e) {
            InterfaceC79254V8o interfaceC79254V8o = this.LJIIJ;
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("evictAboveSize: ");
            LIZ2.append(e.getMessage());
            X1D.LIZIZ(LIZ2);
            interfaceC79254V8o.getClass();
            throw e;
        }
    }

    public final Collection<WE9> LJIIJ(Collection<WE9> collection) {
        this.LJIILIIL.getClass();
        long currentTimeMillis = System.currentTimeMillis() + LJIILLIIL;
        ArrayList arrayList = new ArrayList(collection.size());
        ArrayList arrayList2 = new ArrayList(collection.size());
        for (WE9 we9 : collection) {
            if (we9.getTimestamp() > currentTimeMillis) {
                arrayList.add(we9);
            } else {
                arrayList2.add(we9);
            }
        }
        Collections.sort(arrayList2, this.LJIIIZ.get());
        arrayList.addAll(arrayList2);
        return arrayList;
    }

    public final void LJIILL(double d) {
        synchronized (this.LJIILJJIL) {
            try {
                this.LJIIL.LIZLLL();
                LJIIJJI();
                long LIZIZ = this.LJIIL.LIZIZ();
                LJIIIZ(LIZIZ - ((long) (d * LIZIZ)));
            } catch (IOException e) {
                InterfaceC79254V8o interfaceC79254V8o = this.LJIIJ;
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("trimBy: ");
                LIZ.append(e.getMessage());
                X1D.LIZIZ(LIZ);
                interfaceC79254V8o.getClass();
            }
        }
    }

    @Override // X.InterfaceC81714W5e
    public final WEK LJI(W6U w6u, InterfaceC78787Uw3 interfaceC78787Uw3) {
        String LIZIZ;
        W6W LIZ = W6W.LIZ();
        LIZ.LIZ = w6u;
        this.LIZLLL.LJFF(LIZ);
        synchronized (this.LJIILJJIL) {
            try {
                if (w6u instanceof C81748W6m) {
                    LIZIZ = C81749W6n.LIZIZ(((C81748W6m) w6u).LIZ.get(0));
                } else {
                    LIZIZ = C81749W6n.LIZIZ(w6u);
                }
            } catch (UnsupportedEncodingException e) {
                throw new RuntimeException(e);
            }
        }
        try {
            try {
                WEL LJIILJJIL = LJIILJJIL(w6u, LIZIZ);
                try {
                    WE1 we1 = (WE1) LJIILJJIL;
                    we1.LIZIZ(interfaceC78787Uw3);
                    WEK LJIIIIZZ = LJIIIIZZ(we1, w6u, LIZIZ);
                    LJIIIIZZ.LIZ.length();
                    this.LJIIL.LIZIZ();
                    this.LIZLLL.LJI(LIZ);
                    if (we1.LIZIZ.exists() && !C16880lQ.LLLZZIL(we1.LIZIZ)) {
                        W58.LIZLLL(LJIILL, "Failed to delete temp file");
                    }
                    return LJIIIIZZ;
                } catch (Throwable th) {
                    WE1 we12 = (WE1) LJIILJJIL;
                    if (we12.LIZIZ.exists() && !C16880lQ.LLLZZIL(we12.LIZIZ)) {
                        W58.LIZLLL(LJIILL, "Failed to delete temp file");
                    }
                    throw th;
                }
            } catch (IOException e2) {
                this.LIZLLL.LIZJ(LIZ);
                W58.LJ(LJIILL, "Failed inserting a file into the cache", e2);
                throw e2;
            }
        } finally {
            LIZ.LIZIZ();
        }
    }

    public final void LJIILIIL(String str, Collection<WE9> collection) {
        Iterator<WE9> it = collection.iterator();
        while (it.hasNext()) {
            if (str.equals(it.next().getId())) {
                return;
            }
        }
        try {
            this.LJIIIIZZ.LJ(str);
        } catch (IOException e) {
            throw e;
        }
    }

    public final WEL LJIILJJIL(W6U w6u, String str) {
        synchronized (this.LJIILJJIL) {
            boolean LJIIJJI = LJIIJJI();
            LJIIZILJ();
            long LIZIZ = this.LJIIL.LIZIZ();
            if (LIZIZ > this.LIZJ && !LJIIJJI) {
                this.LJIIL.LIZLLL();
                LJIIJJI();
            }
            long j = this.LIZJ;
            if (LIZIZ > j) {
                LJIIIZ((j * 9) / 10);
            }
        }
        return this.LJIIIIZZ.LJII(w6u, str);
    }

    public final WEK LJIIIIZZ(WE1 we1, W6U w6u, String str) {
        WEK LIZ;
        synchronized (this.LJIILJJIL) {
            LIZ = we1.LIZ();
            ((HashSet) this.LJ).add(str);
            this.LJIIL.LIZJ(LIZ.LIZ.length(), 1L);
        }
        return LIZ;
    }

    public C81942WDy(C81943WDz c81943WDz, AnonymousClass636 anonymousClass636, WB0 wb0, WE4 we4, WBD wbd, Executor executor) {
        WE0 we0;
        this.LIZ = wb0.LIZIZ;
        long j = wb0.LIZJ;
        this.LIZIZ = j;
        this.LIZJ = j;
        synchronized (WE0.class) {
            if (WE0.LJII == null) {
                WE0.LJII = new WE0();
            }
            we0 = WE0.LJII;
        }
        this.LJII = we0;
        this.LJIIIIZZ = c81943WDz;
        this.LJIIIZ = anonymousClass636;
        this.LJFF = -1L;
        WE3 we3 = new WE3();
        this.LIZLLL = we3;
        ((CopyOnWriteArrayList) we3.LIZ).add(we4);
        this.LJI = wb0.LIZ;
        this.LJIIJ = wbd;
        this.LJIIL = new WE5();
        this.LJIILIIL = WEM.LIZ;
        this.LJIIJJI = false;
        this.LJ = new HashSet();
        new CountDownLatch(0);
    }
}
