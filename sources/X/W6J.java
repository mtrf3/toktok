package X;

import Y.AgS130S0100000_14;
import Y.AgS77S0300000_14;
import java.util.HashMap;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes15.dex */
public final class W6J {
    public static final CancellationException LJIILJJIL = new CancellationException("Prefetching is not enabled");
    public final W7K LIZ;
    public final C81753W6r LIZIZ;
    public final W4P<Boolean> LIZJ;
    public final W6M<W6U, W5A> LIZLLL;
    public final W6M<W6U, InterfaceC81378Vwk> LJ;
    public final C81808W8u LJFF;
    public final C81808W8u LJI;
    public final HashMap<String, C81808W8u> LJII;
    public final W6O LJIIIIZZ;
    public final W6T LJIIIZ;
    public final W4P<Boolean> LJIIJ;
    public final AtomicLong LJIIJJI = new AtomicLong();
    public final W4P<Boolean> LJIIL = null;
    public final CU2 LJIILIIL = new CU2();

    public final void LIZ() {
        W6S w6s = new W6S();
        this.LIZLLL.LIZIZ(w6s);
        this.LJ.LIZIZ(w6s);
    }

    public final boolean LJIIJ() {
        boolean z;
        W6T w6t = this.LJIIIZ;
        synchronized (w6t) {
            z = w6t.LIZ;
        }
        return z;
    }

    public final void LJIIJJI() {
        W6T w6t = this.LJIIIZ;
        synchronized (w6t) {
            w6t.LIZ = true;
        }
    }

    public final void LJIILL() {
        W6T w6t = this.LJIIIZ;
        synchronized (w6t) {
            w6t.LIZ = false;
            while (!w6t.LIZIZ.isEmpty()) {
                w6t.LIZJ.execute((Runnable) w6t.LIZIZ.pop());
            }
            w6t.LIZIZ.clear();
        }
    }

    public final void LIZIZ(android.net.Uri uri) {
        C81808W8u c81808W8u;
        LIZJ(uri);
        W5O LIZ = W5O.LIZ(uri);
        C245519kJ LIZ2 = this.LJIIIIZZ.LIZ(LIZ, null);
        this.LJFF.LJ(LIZ2);
        this.LJI.LJ(LIZ2);
        HashMap<String, C81808W8u> hashMap = this.LJII;
        if (hashMap == null || hashMap.isEmpty() || LIZ == null || (c81808W8u = this.LJII.get(LIZ.LJIJ)) == null) {
            return;
        }
        c81808W8u.LJ(LIZ2);
    }

    public final void LIZJ(android.net.Uri uri) {
        W5O LIZ = W5O.LIZ(uri);
        if (LIZ == null) {
            return;
        }
        W6N w6n = new W6N(android.net.Uri.parse(W5N.LJI().LIZIZ(LIZ, null).LIZ));
        this.LIZLLL.LIZIZ(w6n);
        this.LJ.LIZIZ(w6n);
    }

    public final boolean LJII(android.net.Uri uri) {
        if (uri == null) {
            return false;
        }
        return LJIIIIZZ(W5O.LIZ(uri));
    }

    public final boolean LJIIIIZZ(W5O w5o) {
        if (w5o == null) {
            return false;
        }
        C81392Vwy LJFF = this.LIZLLL.LJFF(this.LJIIIIZZ.LIZIZ(w5o, null));
        try {
            return C81392Vwy.LJIIJJI(LJFF);
        } finally {
            C81392Vwy.LJ(LJFF);
        }
    }

    public final C81700W4q LJIIIZ(android.net.Uri uri) {
        W5O LIZ = W5O.LIZ(uri);
        C245519kJ LIZ2 = this.LJIIIIZZ.LIZ(LIZ, null);
        C81700W4q c81700W4q = new C81700W4q();
        this.LJFF.LIZIZ(LIZ2).LJFF(new W6L(this, LIZ2)).LJFF(new AgS77S0300000_14(LIZ, LIZ2, this, 2)).LIZLLL(new AgS130S0100000_14(c81700W4q, 4));
        return c81700W4q;
    }

    public final AbstractC48384Iyq LJIILIIL(W5O w5o) {
        W92 w92;
        if (w5o != null) {
            w92 = w5o.LJIIJJI;
        } else {
            w92 = W92.HIGH;
        }
        return LJIILJJIL(w5o, null, w92);
    }

    public final W4W<C81392Vwy<W5A>> LJ(W5O w5o, Object obj) {
        W92 w92;
        W50 w50 = W50.FULL_FETCH;
        if (w5o != null) {
            w92 = w5o.LJIIJJI;
        } else {
            w92 = W92.HIGH;
        }
        return LIZLLL(w5o, obj, w50, null, w92);
    }

    public final AbstractC48384Iyq LJFF(W5O w5o, Object obj) {
        W92 w92;
        W5O w5o2 = w5o;
        w5o2.LIZIZ.getClass();
        try {
            InterfaceC81759W6x<C81392Vwy<InterfaceC81378Vwk>> LJIIJJI = this.LIZ.LJIIJJI(w5o2);
            if (w5o2.LJIIIIZZ != null) {
                W5P LIZIZ = W5P.LIZIZ(w5o2);
                LIZIZ.LIZJ = null;
                w5o2 = LIZIZ.LIZ();
            }
            W50 w50 = W50.FULL_FETCH;
            if (w5o2 != null) {
                w92 = w5o2.LJIIJJI;
            } else {
                w92 = W92.HIGH;
            }
            return LJIILLIIL(LJIIJJI, w5o2, w50, obj, null, w92);
        } catch (Exception e) {
            return C81702W4s.LIZ(e);
        }
    }

    public final C81753W6r LJI(W5O w5o, UF5 uf5) {
        if (uf5 == null) {
            InterfaceC81754W6s interfaceC81754W6s = w5o.LJIIZILJ;
            if (interfaceC81754W6s == null) {
                return this.LIZIZ;
            }
            return new C81753W6r(this.LIZIZ, interfaceC81754W6s);
        }
        InterfaceC81754W6s interfaceC81754W6s2 = w5o.LJIIZILJ;
        if (interfaceC81754W6s2 == null) {
            return new C81753W6r(this.LIZIZ, uf5);
        }
        return new C81753W6r(this.LIZIZ, uf5, interfaceC81754W6s2);
    }

    public final AbstractC48384Iyq LJIIL(W5O w5o, Object obj) {
        InterfaceC81759W6x<Void> LJII;
        W92 w92;
        if (!this.LIZJ.get().booleanValue()) {
            return C81702W4s.LIZ(LJIILJJIL);
        }
        try {
            if (this.LJIIJ.get().booleanValue()) {
                LJII = this.LIZ.LJIIJ(w5o);
            } else {
                LJII = this.LIZ.LJII(w5o);
            }
            W50 w50 = W50.FULL_FETCH;
            if (w5o != null) {
                w92 = w5o.LJIIJJI;
            } else {
                w92 = W92.HIGH;
            }
            return LJIIZILJ(LJII, w5o, w50, obj, w92);
        } catch (Exception e) {
            return C81702W4s.LIZ(e);
        }
    }

    public final AbstractC48384Iyq LJIILJJIL(W5O w5o, Object obj, W92 w92) {
        if (!this.LIZJ.get().booleanValue()) {
            return C81702W4s.LIZ(LJIILJJIL);
        }
        try {
            return LJIIZILJ(this.LIZ.LJIIJ(w5o), w5o, W50.FULL_FETCH, obj, w92);
        } catch (Exception e) {
            return C81702W4s.LIZ(e);
        }
    }

    public final AbstractC48384Iyq LIZLLL(W5O w5o, Object obj, W50 w50, UF5 uf5, W92 w92) {
        try {
            return LJIILLIIL(this.LIZ.LJIIIIZZ(w5o), w5o, w50, obj, uf5, w92);
        } catch (Exception e) {
            return C81702W4s.LIZ(e);
        }
    }

    public final AbstractC48384Iyq LJIIZILJ(InterfaceC81759W6x interfaceC81759W6x, W5O w5o, W50 w50, Object obj, W92 w92) {
        C81753W6r LJI = LJI(w5o, null);
        try {
            return new W6P(interfaceC81759W6x, new C81767W7f(w5o, String.valueOf(this.LJIIJJI.getAndIncrement()), LJI, obj, W50.getMax(w5o.LJIIL, w50), true, false, W92.getLowerPriority(w92, W92.MEDIUM)), LJI);
        } catch (Exception e) {
            return C81702W4s.LIZ(e);
        }
    }

    public final AbstractC48384Iyq LJIILLIIL(InterfaceC81759W6x interfaceC81759W6x, W5O w5o, W50 w50, Object obj, UF5 uf5, W92 w92) {
        boolean z;
        C81939WDv.LIZIZ();
        C81753W6r LJI = LJI(w5o, uf5);
        try {
            W50 max = W50.getMax(w5o.LJIIL, w50);
            String valueOf = String.valueOf(this.LJIIJJI.getAndIncrement());
            if (!w5o.LJ && !w5o.LJFF && C78964Uyu.LJFF(w5o.LIZIZ)) {
                z = false;
                C81767W7f c81767W7f = new C81767W7f(w5o, valueOf, LJI, obj, max, false, z, w92);
                C81939WDv.LIZIZ();
                W6Q w6q = new W6Q(interfaceC81759W6x, c81767W7f, LJI);
                C81939WDv.LIZIZ();
                return w6q;
            }
            z = true;
            C81767W7f c81767W7f2 = new C81767W7f(w5o, valueOf, LJI, obj, max, false, z, w92);
            C81939WDv.LIZIZ();
            W6Q w6q2 = new W6Q(interfaceC81759W6x, c81767W7f2, LJI);
            C81939WDv.LIZIZ();
            return w6q2;
        } catch (Exception e) {
            return C81702W4s.LIZ(e);
        } finally {
            C81939WDv.LIZIZ();
        }
    }

    public W6J(W7K w7k, java.util.Set set, W4P w4p, W6K w6k, W6K w6k2, C81808W8u c81808W8u, C81808W8u c81808W8u2, HashMap hashMap, W6O w6o, W6T w6t, C61094NyM c61094NyM) {
        this.LIZ = w7k;
        this.LIZIZ = new C81753W6r((java.util.Set<InterfaceC81754W6s>) set);
        this.LIZJ = w4p;
        this.LIZLLL = w6k;
        this.LJ = w6k2;
        this.LJFF = c81808W8u;
        this.LJI = c81808W8u2;
        this.LJII = hashMap;
        this.LJIIIIZZ = w6o;
        this.LJIIIZ = w6t;
        this.LJIIJ = c61094NyM;
    }
}
