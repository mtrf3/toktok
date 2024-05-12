package X;

import android.util.Pair;
import java.io.Closeable;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: X.W8j, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public abstract class AbstractC81797W8j<K, T extends Closeable> implements InterfaceC81759W6x<T> {
    public final java.util.Map<K, AbstractC81797W8j<K, T>.a> LIZ = new HashMap();
    public final InterfaceC81759W6x<T> LIZIZ;

    /* renamed from: X.W8j$a */
    /* loaded from: classes15.dex */
    public class a {
        public final K LIZ;
        public final CopyOnWriteArraySet<Pair<W7F<T>, InterfaceC81770W7i>> LIZIZ = new CopyOnWriteArraySet<>();
        public T LIZJ;
        public float LIZLLL;
        public int LJ;
        public C81798W8k LJFF;
        public AbstractC81797W8j<K, T>.a.C0001a LJI;

        public final synchronized boolean LIZJ() {
            Iterator<Pair<W7F<T>, InterfaceC81770W7i>> it = this.LIZIZ.iterator();
            while (it.hasNext()) {
                if (((InterfaceC81770W7i) it.next().second).LIZJ()) {
                    return true;
                }
            }
            return false;
        }

        public final synchronized boolean LIZLLL() {
            Iterator<Pair<W7F<T>, InterfaceC81770W7i>> it = this.LIZIZ.iterator();
            while (it.hasNext()) {
                if (!((InterfaceC81770W7i) it.next().second).LJFF()) {
                    return false;
                }
            }
            return true;
        }

        public final synchronized W92 LJ() {
            W92 w92;
            w92 = W92.LOW;
            Iterator<Pair<W7F<T>, InterfaceC81770W7i>> it = this.LIZIZ.iterator();
            while (it.hasNext()) {
                w92 = W92.getHigherPriority(w92, ((InterfaceC81770W7i) it.next().second).getPriority());
            }
            return w92;
        }

        public final void LJIIIIZZ() {
            boolean z;
            synchronized (this) {
                boolean z2 = false;
                if (this.LJFF == null) {
                    z = true;
                } else {
                    z = false;
                }
                C32151Nz.LJI(z);
                if (this.LJI == null) {
                    z2 = true;
                }
                C32151Nz.LJI(z2);
                if (this.LIZIZ.isEmpty()) {
                    AbstractC81797W8j.this.LJIIIIZZ(this.LIZ, this);
                    return;
                }
                InterfaceC81770W7i interfaceC81770W7i = (InterfaceC81770W7i) this.LIZIZ.iterator().next().second;
                C81798W8k c81798W8k = new C81798W8k(interfaceC81770W7i.LJ(), interfaceC81770W7i.getId(), interfaceC81770W7i.LIZ(), interfaceC81770W7i.LIZIZ(), interfaceC81770W7i.LJI(), LIZLLL(), LIZJ(), LJ());
                this.LJFF = c81798W8k;
                AbstractC81797W8j<K, T>.a.C0001a c0001a = new C0001a();
                this.LJI = c0001a;
                AbstractC81797W8j.this.LIZIZ.LIZIZ(c0001a, c81798W8k);
            }
        }

        public final synchronized List<InterfaceC81847WAh> LJIIIZ() {
            C81798W8k c81798W8k = this.LJFF;
            if (c81798W8k == null) {
                return null;
            }
            return c81798W8k.LJIIJJI(LIZJ());
        }

        public final synchronized List<InterfaceC81847WAh> LJIIJ() {
            C81798W8k c81798W8k = this.LJFF;
            if (c81798W8k == null) {
                return null;
            }
            return c81798W8k.LJIIL(LIZLLL());
        }

        public final synchronized List<InterfaceC81847WAh> LJIIJJI() {
            C81798W8k c81798W8k = this.LJFF;
            if (c81798W8k == null) {
                return null;
            }
            return c81798W8k.LJIILIIL(LJ());
        }

        /* renamed from: X.W8j$a$a, reason: collision with other inner class name */
        /* loaded from: classes15.dex */
        public class C0001a extends AbstractC81756W6u<T> {
            @Override // X.AbstractC81756W6u
            public final void LJFF() {
                try {
                    C81939WDv.LIZIZ();
                    a aVar = a.this;
                    synchronized (aVar) {
                        if (aVar.LJI == this) {
                            aVar.LJI = null;
                            aVar.LJFF = null;
                            a.LIZIZ(aVar.LIZJ);
                            aVar.LIZJ = null;
                            aVar.LJIIIIZZ();
                        }
                    }
                } finally {
                    C81939WDv.LIZIZ();
                }
            }

            public C0001a() {
            }

            @Override // X.AbstractC81756W6u
            public final void LJI(Throwable th) {
                try {
                    C81939WDv.LIZIZ();
                    a.this.LJFF(this, th);
                } finally {
                    C81939WDv.LIZIZ();
                }
            }

            @Override // X.AbstractC81756W6u
            public final void LJIIIIZZ(float f) {
                try {
                    C81939WDv.LIZIZ();
                    a.this.LJII(this, f);
                } finally {
                    C81939WDv.LIZIZ();
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // X.AbstractC81756W6u
            public final void LJII(int i, Object obj) {
                Closeable closeable = (Closeable) obj;
                try {
                    C81939WDv.LIZIZ();
                    a.this.LJI(this, closeable, i);
                } finally {
                    C81939WDv.LIZIZ();
                }
            }
        }

        public static void LIZIZ(Closeable closeable) {
            if (closeable != null) {
                try {
                    closeable.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }

        public a(K k) {
            this.LIZ = k;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final boolean LIZ(W7F<T> w7f, InterfaceC81770W7i interfaceC81770W7i) {
            Pair<W7F<T>, InterfaceC81770W7i> create = Pair.create(w7f, interfaceC81770W7i);
            synchronized (this) {
                if (AbstractC81797W8j.this.LJFF(this.LIZ) != this) {
                    return false;
                }
                this.LIZIZ.add(create);
                List<InterfaceC81847WAh> LJIIJ = LJIIJ();
                List<InterfaceC81847WAh> LJIIJJI = LJIIJJI();
                List<InterfaceC81847WAh> LJIIIZ = LJIIIZ();
                Closeable closeable = this.LIZJ;
                float f = this.LIZLLL;
                int i = this.LJ;
                C81798W8k.LJIIIIZZ(LJIIJ);
                C81798W8k.LJIIIZ(LJIIJJI);
                C81798W8k.LJII(LJIIIZ);
                synchronized (create) {
                    synchronized (this) {
                        if (closeable != this.LIZJ) {
                            closeable = null;
                        } else if (closeable != null) {
                            closeable = AbstractC81797W8j.this.LIZJ(closeable);
                        }
                    }
                    if (closeable != null) {
                        if (f > 0.0f) {
                            w7f.LIZ(f);
                        }
                        w7f.LIZIZ(i, closeable);
                        LIZIZ(closeable);
                    }
                }
                interfaceC81770W7i.LIZLLL(new C81812W8y(this, create));
                return true;
            }
        }

        public final void LJFF(AbstractC81797W8j<K, T>.a.C0001a c0001a, Throwable th) {
            synchronized (this) {
                if (this.LJI != c0001a) {
                    return;
                }
                Iterator<Pair<W7F<T>, InterfaceC81770W7i>> it = this.LIZIZ.iterator();
                this.LIZIZ.clear();
                AbstractC81797W8j.this.LJIIIIZZ(this.LIZ, this);
                LIZIZ(this.LIZJ);
                this.LIZJ = null;
                while (it.hasNext()) {
                    Pair<W7F<T>, InterfaceC81770W7i> next = it.next();
                    synchronized (next) {
                        ((W7F) next.first).onFailure(th);
                    }
                }
            }
        }

        public final void LJII(AbstractC81797W8j<K, T>.a.C0001a c0001a, float f) {
            synchronized (this) {
                if (this.LJI != c0001a) {
                    return;
                }
                this.LIZLLL = f;
                Iterator<Pair<W7F<T>, InterfaceC81770W7i>> it = this.LIZIZ.iterator();
                while (it.hasNext()) {
                    Pair<W7F<T>, InterfaceC81770W7i> next = it.next();
                    synchronized (next) {
                        ((W7F) next.first).LIZ(f);
                    }
                }
            }
        }

        public final void LJI(AbstractC81797W8j<K, T>.a.C0001a c0001a, T t, int i) {
            int i2;
            Closeable LIZLLL;
            synchronized (this) {
                if (this.LJI != c0001a) {
                    return;
                }
                LIZIZ(this.LIZJ);
                this.LIZJ = null;
                Iterator<Pair<W7F<T>, InterfaceC81770W7i>> it = this.LIZIZ.iterator();
                if (AbstractC81756W6u.LJ(i)) {
                    this.LIZJ = (T) AbstractC81797W8j.this.LIZJ(t);
                    this.LJ = i;
                } else {
                    this.LIZIZ.clear();
                    AbstractC81797W8j.this.LJIIIIZZ(this.LIZ, this);
                }
                int i3 = 0;
                while (it.hasNext()) {
                    Pair<W7F<T>, InterfaceC81770W7i> next = it.next();
                    synchronized (next) {
                        i2 = i3 + 1;
                        if (i3 != 0) {
                            if (AbstractC81797W8j.this.LJI(t) == C81794W8g.LIZIZ() && (LIZLLL = AbstractC81797W8j.this.LIZLLL(t)) != null) {
                                try {
                                    ((W7F) next.first).LIZIZ(i, LIZLLL);
                                } finally {
                                }
                            }
                        }
                        ((W7F) next.first).LIZIZ(i, t);
                    }
                    i3 = i2;
                }
            }
        }
    }

    public abstract T LIZJ(T t);

    public T LIZLLL(T t) {
        return null;
    }

    public abstract C81828W9o LJI(T t);

    public abstract K LJII(InterfaceC81770W7i interfaceC81770W7i);

    public AbstractC81797W8j(InterfaceC81759W6x<T> interfaceC81759W6x) {
        this.LIZIZ = interfaceC81759W6x;
    }

    public final synchronized AbstractC81797W8j<K, T>.a LJ(K k) {
        AbstractC81797W8j<K, T>.a aVar;
        aVar = new a(k);
        ((HashMap) this.LIZ).put(k, aVar);
        return aVar;
    }

    public final synchronized AbstractC81797W8j<K, T>.a LJFF(K k) {
        return (a) ((HashMap) this.LIZ).get(k);
    }

    @Override // X.InterfaceC81759W6x
    public final void LIZIZ(W7F<T> w7f, InterfaceC81770W7i interfaceC81770W7i) {
        AbstractC81797W8j<K, T>.a LJFF;
        boolean z;
        try {
            C81939WDv.LIZIZ();
            K LJII = LJII(interfaceC81770W7i);
            do {
                synchronized (this) {
                    LJFF = LJFF(LJII);
                    if (LJFF == null) {
                        LJFF = LJ(LJII);
                        z = true;
                    } else {
                        z = false;
                    }
                }
            } while (!LJFF.LIZ(w7f, interfaceC81770W7i));
            if (z) {
                LJFF.LJIIIIZZ();
            }
        } finally {
            C81939WDv.LIZIZ();
        }
    }

    public final synchronized void LJIIIIZZ(K k, AbstractC81797W8j<K, T>.a aVar) {
        if (((HashMap) this.LIZ).get(k) == aVar) {
            ((HashMap) this.LIZ).remove(k);
        }
    }
}
