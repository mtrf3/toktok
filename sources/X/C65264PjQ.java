package X;

import com.twitter.sdk.android.core.Session;
import defpackage.b0;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.PjQ, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65264PjQ<T extends Session> implements InterfaceC65283Pjj<T> {
    public final InterfaceC65285Pjl LIZ;
    public final InterfaceC65274Pja<T> LIZIZ;
    public final ConcurrentHashMap<Long, T> LIZJ;
    public final ConcurrentHashMap<Long, C65267PjT<T>> LIZLLL;
    public final C65267PjT<T> LJ;
    public final AtomicReference<T> LJFF;
    public final String LJI;
    public volatile boolean LJII;

    public final void LIZLLL() {
        if (this.LJII) {
            synchronized (this) {
                if (this.LJII) {
                    C65267PjT<T> c65267PjT = this.LJ;
                    T LIZIZ = c65267PjT.LIZIZ.LIZIZ(((C65270PjW) c65267PjT.LIZ).LIZ.getString(c65267PjT.LIZJ, null));
                    if (LIZIZ != null) {
                        LIZJ(LIZIZ.id, LIZIZ, false);
                    }
                    LJ();
                    this.LJII = false;
                }
            }
        }
    }

    public final void LJ() {
        T LIZIZ;
        for (Map.Entry<String, ?> entry : ((C65270PjW) this.LIZ).LIZ.getAll().entrySet()) {
            if (entry.getKey().startsWith(this.LJI) && (LIZIZ = this.LIZIZ.LIZIZ((String) entry.getValue())) != null) {
                LIZJ(LIZIZ.id, LIZIZ, false);
            }
        }
    }

    public final void LIZ() {
        LIZLLL();
        if (this.LJFF.get() != null && this.LJFF.get().id == 0) {
            synchronized (this) {
                this.LJFF.set(null);
                C65267PjT<T> c65267PjT = this.LJ;
                ((C65270PjW) c65267PjT.LIZ).LIZ.edit().remove(c65267PjT.LIZJ).commit();
            }
        }
        this.LIZJ.remove(0L);
        C65267PjT<T> remove = this.LIZLLL.remove(0L);
        if (remove != null) {
            ((C65270PjW) remove.LIZ).LIZ.edit().remove(remove.LIZJ).commit();
        }
    }

    public final T LIZIZ() {
        LIZLLL();
        return this.LJFF.get();
    }

    public final void LIZJ(long j, T t, boolean z) {
        this.LIZJ.put(Long.valueOf(j), t);
        C65267PjT<T> c65267PjT = this.LIZLLL.get(Long.valueOf(j));
        if (c65267PjT == null) {
            InterfaceC65285Pjl interfaceC65285Pjl = this.LIZ;
            InterfaceC65274Pja<T> interfaceC65274Pja = this.LIZIZ;
            StringBuilder LIZ = X1D.LIZ();
            b0.LJ(LIZ, this.LJI, "_", j);
            c65267PjT = new C65267PjT<>(interfaceC65285Pjl, interfaceC65274Pja, X1D.LIZIZ(LIZ));
            this.LIZLLL.putIfAbsent(Long.valueOf(j), c65267PjT);
        }
        c65267PjT.LIZ(t);
        T t2 = this.LJFF.get();
        if (t2 == null || t2.id == j || z) {
            synchronized (this) {
                AtomicReference<T> atomicReference = this.LJFF;
                while (!atomicReference.compareAndSet(t2, t) && atomicReference.get() == t2) {
                }
                this.LJ.LIZ(t);
            }
        }
    }

    public C65264PjQ(C65270PjW c65270PjW, InterfaceC65274Pja interfaceC65274Pja, String str, String str2) {
        ConcurrentHashMap<Long, T> concurrentHashMap = new ConcurrentHashMap<>(1);
        ConcurrentHashMap<Long, C65267PjT<T>> concurrentHashMap2 = new ConcurrentHashMap<>(1);
        C65267PjT<T> c65267PjT = new C65267PjT<>(c65270PjW, interfaceC65274Pja, str);
        this.LJII = true;
        this.LIZ = c65270PjW;
        this.LIZIZ = interfaceC65274Pja;
        this.LIZJ = concurrentHashMap;
        this.LIZLLL = concurrentHashMap2;
        this.LJ = c65267PjT;
        this.LJFF = new AtomicReference<>();
        this.LJI = str2;
    }
}
