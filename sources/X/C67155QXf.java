package X;

import java.util.Collection;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.QXf, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C67155QXf<T> implements Cloneable {
    public static final Collection<C39061g6> LJLJJI = new HashSet();
    public final AtomicInteger LJLIL;
    public volatile QXX LJLILLLLZI;
    public volatile C39061g6 LJLJI;

    public final Object clone() {
        C67155QXf c67155QXf;
        synchronized (this) {
            this.LJLIL.incrementAndGet();
            c67155QXf = new C67155QXf(this.LJLIL, this.LJLILLLLZI, this.LJLJI);
        }
        return c67155QXf;
    }

    public final void finalize() {
        if (this.LJLIL.decrementAndGet() == 0) {
            Object obj = this.LJLJI.LIZJ;
            Collection<C39061g6> collection = LJLJJI;
            synchronized (collection) {
                ((HashSet) collection).remove(this.LJLJI);
            }
            if (this.LJLILLLLZI != null) {
                this.LJLILLLLZI.LLLLIILLL(obj);
            }
        }
        super.finalize();
    }

    public C67155QXf(T t, QXX qxx) {
        this.LJLIL = new AtomicInteger(1);
        this.LJLILLLLZI = qxx;
        this.LJLJI = new C39061g6(2, t);
        Collection<C39061g6> collection = LJLJJI;
        synchronized (collection) {
            ((HashSet) collection).add(this.LJLJI);
        }
    }

    public C67155QXf(AtomicInteger atomicInteger, QXX qxx, C39061g6 c39061g6) {
        this.LJLIL = atomicInteger;
        this.LJLILLLLZI = qxx;
        this.LJLJI = c39061g6;
    }
}
