package X;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import java.util.concurrent.TimeUnit;

/* loaded from: classes15.dex */
public final class W6X<K, V> implements W6M<K, V>, PML {
    public static boolean LJLJLJ;
    public static final long LJLJLLL = TimeUnit.MINUTES.toMillis(5);
    public final W6Y<K, C81736W6a<K, V>> LJLIL;
    public final W6Y<K, C81736W6a<K, V>> LJLILLLLZI;
    public final W6H<V> LJLJI;
    public final InterfaceC81739W6d LJLJJI;
    public final W4P<C81738W6c> LJLJJL;
    public C81738W6c LJLJJLL;
    public long LJLJL;

    public final synchronized int LJIIIZ() {
        return this.LJLILLLLZI.LIZLLL() - this.LJLIL.LIZLLL();
    }

    public final synchronized int LJIIJ() {
        return this.LJLILLLLZI.LJI() - this.LJLIL.LJI();
    }

    public final void LJIILLIIL() {
        synchronized (this) {
            C81738W6c c81738W6c = this.LJLJJLL;
            int min = Math.min(c81738W6c.LIZLLL, c81738W6c.LIZIZ - LJIIIZ());
            C81738W6c c81738W6c2 = this.LJLJJLL;
            LJJI(min, Math.min(c81738W6c2.LIZJ, c81738W6c2.LIZ - LJIIJ()));
        }
    }

    public final synchronized void LJIJJ() {
        if (this.LJLJL + LJLJLLL > SystemClock.uptimeMillis()) {
            return;
        }
        this.LJLJL = SystemClock.uptimeMillis();
        this.LJLJJLL = this.LJLJJL.get();
    }

    public static <K, V> void LJIIZILJ(C81736W6a<K, V> c81736W6a) {
        W6G<K> w6g;
        if (c81736W6a != null && (w6g = c81736W6a.LJ) != null) {
            K k = c81736W6a.LIZ;
            W6D w6d = ((W6F) w6g).LIZ;
            synchronized (w6d) {
                w6d.LIZLLL.add(k);
            }
        }
    }

    public static void LJIJ(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            LJIJI((C81736W6a) it.next());
        }
    }

    public static <K, V> void LJIJI(C81736W6a<K, V> c81736W6a) {
        W6G<K> w6g;
        if (c81736W6a != null && (w6g = c81736W6a.LJ) != null) {
            K k = c81736W6a.LIZ;
            W6D w6d = ((W6F) w6g).LIZ;
            synchronized (w6d) {
                w6d.LIZLLL.remove(k);
            }
        }
    }

    @Override // X.W6M
    public final int LIZIZ(InterfaceC78852Ux6<K> interfaceC78852Ux6) {
        ArrayList<C81736W6a<K, V>> LJIIIZ;
        ArrayList<C81736W6a<K, V>> LJIIIZ2;
        synchronized (this) {
            LJIIIZ = this.LJLIL.LJIIIZ(interfaceC78852Ux6);
            LJIIIZ2 = this.LJLILLLLZI.LJIIIZ(interfaceC78852Ux6);
            LJIILIIL(LJIIIZ2);
        }
        LJIILL(LJIIIZ2);
        LJIJ(LJIIIZ);
        LJIJJ();
        LJIILLIIL();
        return LJIIIZ2.size();
    }

    @Override // X.PML
    public final void LIZLLL(EnumC81745W6j enumC81745W6j) {
        double LIZ = this.LJLJJI.LIZ(enumC81745W6j);
        synchronized (this) {
            LJJI(Integer.MAX_VALUE, Math.max(0, ((int) ((1.0d - LIZ) * this.LJLILLLLZI.LJI())) - LJIIJ()));
        }
        LJIJJ();
        LJIILLIIL();
    }

    @Override // X.W6M
    public final synchronized boolean LJ(InterfaceC78852Ux6<K> interfaceC78852Ux6) {
        return !this.LJLILLLLZI.LJFF(interfaceC78852Ux6).isEmpty();
    }

    @Override // X.W6M
    public final C81392Vwy LJFF(W6U w6u) {
        C81736W6a<K, V> LJIIIIZZ;
        C81392Vwy<V> c81392Vwy;
        w6u.getClass();
        synchronized (this) {
            LJIIIIZZ = this.LJLIL.LJIIIIZZ(w6u);
            C81736W6a<K, V> c81736W6a = (C81736W6a) this.LJLILLLLZI.LIZJ(w6u);
            if (c81736W6a != null) {
                c81392Vwy = LJIJJLI(c81736W6a);
            } else {
                c81392Vwy = null;
            }
        }
        LJIJI(LJIIIIZZ);
        LJIJJ();
        LJIILLIIL();
        return c81392Vwy;
    }

    public final synchronized boolean LJII(V v) {
        boolean z;
        int LIZIZ = this.LJLJI.LIZIZ(v);
        if (LIZIZ <= this.LJLJJLL.LJ) {
            z = true;
            if (LJIIIZ() <= this.LJLJJLL.LIZIZ - 1) {
                if (LJIIJ() <= this.LJLJJLL.LIZ - LIZIZ) {
                }
            }
        }
        z = false;
        return z;
    }

    public final synchronized void LJIIIIZZ(C81736W6a<K, V> c81736W6a) {
        boolean z;
        c81736W6a.getClass();
        if (c81736W6a.LIZJ > 0) {
            z = true;
        } else {
            z = false;
        }
        C32151Nz.LJIIIZ(z);
        c81736W6a.LIZJ--;
    }

    public final synchronized void LJIIJJI(C81736W6a<K, V> c81736W6a) {
        boolean z;
        if (!c81736W6a.LIZLLL) {
            z = true;
        } else {
            z = false;
        }
        C32151Nz.LJIIIZ(z);
        c81736W6a.LIZJ++;
    }

    public final synchronized void LJIIL(C81736W6a<K, V> c81736W6a) {
        boolean z;
        c81736W6a.getClass();
        if (!c81736W6a.LIZLLL) {
            z = true;
        } else {
            z = false;
        }
        C32151Nz.LJIIIZ(z);
        c81736W6a.LIZLLL = true;
    }

    public final synchronized void LJIILIIL(ArrayList<C81736W6a<K, V>> arrayList) {
        Iterator<C81736W6a<K, V>> it = arrayList.iterator();
        while (it.hasNext()) {
            LJIIL(it.next());
        }
    }

    public final synchronized boolean LJIILJJIL(C81736W6a<K, V> c81736W6a) {
        if (!c81736W6a.LIZLLL && c81736W6a.LIZJ == 0) {
            this.LJLIL.LJII(c81736W6a.LIZ, c81736W6a);
            return true;
        }
        return false;
    }

    public final void LJIILL(ArrayList<C81736W6a<K, V>> arrayList) {
        Iterator<C81736W6a<K, V>> it = arrayList.iterator();
        while (it.hasNext()) {
            C81392Vwy.LJ(LJIL(it.next()));
        }
    }

    public final synchronized C81392Vwy<V> LJIJJLI(C81736W6a<K, V> c81736W6a) {
        LJIIJJI(c81736W6a);
        return C81392Vwy.LJIILIIL(c81736W6a.LIZIZ.LJI(), new W6Z(this, c81736W6a));
    }

    public final synchronized C81392Vwy<V> LJIL(C81736W6a<K, V> c81736W6a) {
        C81392Vwy<V> c81392Vwy;
        c81736W6a.getClass();
        if (c81736W6a.LIZLLL && c81736W6a.LIZJ == 0) {
            c81392Vwy = c81736W6a.LIZIZ;
        } else {
            c81392Vwy = null;
        }
        return c81392Vwy;
    }

    public final C81392Vwy LJJ(W6U w6u) {
        C81736W6a<K, V> LJIIIIZZ;
        boolean z;
        C81392Vwy<V> c81392Vwy;
        synchronized (this) {
            LJIIIIZZ = this.LJLIL.LJIIIIZZ(w6u);
            z = false;
            if (LJIIIIZZ != null) {
                C81736W6a<K, V> LJIIIIZZ2 = this.LJLILLLLZI.LJIIIIZZ(w6u);
                LJIIIIZZ2.getClass();
                if (LJIIIIZZ2.LIZJ == 0) {
                    z = true;
                }
                C32151Nz.LJIIIZ(z);
                c81392Vwy = LJIIIIZZ2.LIZIZ;
                z = true;
            } else {
                c81392Vwy = null;
            }
        }
        if (z) {
            LJIJI(LJIIIIZZ);
        }
        return c81392Vwy;
    }

    @Override // X.W6M
    public final C81392Vwy LIZJ(W6U w6u, C81392Vwy c81392Vwy) {
        return LJI(w6u, c81392Vwy, null);
    }

    public final synchronized void LJJI(int i, int i2) {
        int max = Math.max(i, 0);
        int max2 = Math.max(i2, 0);
        if (this.LJLIL.LIZLLL() <= max && this.LJLIL.LJI() <= max2) {
            return;
        }
        while (true) {
            if (this.LJLIL.LIZLLL() > max || this.LJLIL.LJI() > max2) {
                K LJ = this.LJLIL.LJ();
                if (LJ != null) {
                    this.LJLIL.LJIIIIZZ(LJ);
                    C81736W6a<K, V> LJIIIIZZ = this.LJLILLLLZI.LJIIIIZZ(LJ);
                    if (LJIIIIZZ != null) {
                        LJIIL(LJIIIIZZ);
                        C81392Vwy.LJ(LJIL(LJIIIIZZ));
                        LJIJI(LJIIIIZZ);
                    }
                } else {
                    return;
                }
            } else {
                return;
            }
        }
    }

    public W6X(W6H<V> w6h, InterfaceC81739W6d interfaceC81739W6d, W4P<C81738W6c> w4p) {
        new WeakHashMap();
        this.LJLJI = w6h;
        this.LJLIL = new W6Y<>(new C81737W6b(w6h));
        this.LJLILLLLZI = new W6Y<>(new C81737W6b(w6h));
        this.LJLJJI = interfaceC81739W6d;
        this.LJLJJL = w4p;
        this.LJLJJLL = w4p.get();
        this.LJLJL = SystemClock.uptimeMillis();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final C81392Vwy LJI(W6U w6u, C81392Vwy c81392Vwy, W6F w6f) {
        C81736W6a<K, V> LJIIIIZZ;
        C81392Vwy c81392Vwy2;
        C81392Vwy c81392Vwy3;
        w6u.getClass();
        c81392Vwy.getClass();
        LJIJJ();
        synchronized (this) {
            LJIIIIZZ = this.LJLIL.LJIIIIZZ(w6u);
            C81736W6a<K, V> LJIIIIZZ2 = this.LJLILLLLZI.LJIIIIZZ(w6u);
            c81392Vwy2 = null;
            if (LJIIIIZZ2 != null) {
                LJIIL(LJIIIIZZ2);
                c81392Vwy3 = LJIL(LJIIIIZZ2);
            } else {
                c81392Vwy3 = null;
            }
            if (LJII(c81392Vwy.LJI())) {
                C81736W6a c81736W6a = new C81736W6a(w6u, c81392Vwy, w6f);
                this.LJLILLLLZI.LJII(w6u, c81736W6a);
                c81392Vwy2 = LJIJJLI(c81736W6a);
            }
        }
        C81392Vwy.LJ(c81392Vwy3);
        LJIJI(LJIIIIZZ);
        LJIILLIIL();
        return c81392Vwy2;
    }
}
