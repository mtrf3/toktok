package X;

import com.facebook.common.references.SharedReference;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Vwy, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C81392Vwy<T> implements Cloneable, Closeable {
    public static final Class<C81392Vwy> LJLJI = C81392Vwy.class;
    public static final C81393Vwz LJLJJI = new C81393Vwz();
    public boolean LJLIL;
    public final SharedReference<T> LJLILLLLZI;

    /* renamed from: LIZ, reason: merged with bridge method [inline-methods] */
    public final synchronized C81392Vwy<T> clone() {
        C32151Nz.LJIIIZ(LJIIJ());
        return new C81392Vwy<>(this.LJLILLLLZI);
    }

    public final synchronized C81392Vwy<T> LIZIZ() {
        if (LJIIJ()) {
            return clone();
        }
        return null;
    }

    public final synchronized T LJI() {
        return this.LJLILLLLZI.get();
    }

    public final synchronized boolean LJIIJ() {
        return !this.LJLIL;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        synchronized (this) {
            if (this.LJLIL) {
                return;
            }
            this.LJLIL = true;
            this.LJLILLLLZI.deleteReference();
        }
    }

    public final void finalize() {
        try {
            synchronized (this) {
                if (this.LJLIL) {
                    return;
                }
                Class<C81392Vwy> cls = LJLJI;
                Integer valueOf = Integer.valueOf(System.identityHashCode(this));
                Integer valueOf2 = Integer.valueOf(System.identityHashCode(this.LJLILLLLZI));
                String name = this.LJLILLLLZI.get().getClass().getName();
                if (W58.LIZ.LJIIIIZZ(3)) {
                    W58.LIZ.d(C16880lQ.LJLLJ(cls), C16880lQ.LLLZI(null, "Finalized without closing: %x %x (type = %s)", new Object[]{valueOf, valueOf2, name}));
                }
                close();
            }
        } finally {
            super.finalize();
        }
    }

    public C81392Vwy(SharedReference<T> sharedReference) {
        sharedReference.getClass();
        this.LJLILLLLZI = sharedReference;
        sharedReference.addReference();
    }

    public static <T> C81392Vwy<T> LIZJ(C81392Vwy<T> c81392Vwy) {
        if (c81392Vwy != null) {
            return c81392Vwy.LIZIZ();
        }
        return null;
    }

    public static <T> List<C81392Vwy<T>> LIZLLL(Collection<C81392Vwy<T>> collection) {
        if (collection == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(collection.size());
        Iterator<C81392Vwy<T>> it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(LIZJ(it.next()));
        }
        return arrayList;
    }

    public static void LJ(C81392Vwy<?> c81392Vwy) {
        if (c81392Vwy != null) {
            c81392Vwy.close();
        }
    }

    public static void LJFF(Iterable<? extends C81392Vwy<?>> iterable) {
        if (iterable != null) {
            Iterator<? extends C81392Vwy<?>> it = iterable.iterator();
            while (it.hasNext()) {
                LJ(it.next());
            }
        }
    }

    public static boolean LJIIJJI(C81392Vwy<?> c81392Vwy) {
        if (c81392Vwy != null && c81392Vwy.LJIIJ()) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Incorrect types in method signature: <T::Ljava/io/Closeable;>(TT;)LX/Vwy<TT;>; */
    public static C81392Vwy LJIIL(Closeable closeable) {
        if (closeable == null) {
            return null;
        }
        return new C81392Vwy(closeable, LJLJJI);
    }

    public C81392Vwy(T t, VWQ<T> vwq) {
        this.LJLILLLLZI = new SharedReference<>(t, vwq);
    }

    public static <T> C81392Vwy<T> LJIILIIL(T t, VWQ<T> vwq) {
        if (t == null) {
            return null;
        }
        return new C81392Vwy<>(t, vwq);
    }
}
