package X;

import X.AbstractC81686W4c;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.concurrent.Executor;

/* loaded from: classes15.dex */
public abstract class W4R<T, INFO> implements InterfaceC81252Vui, InterfaceC81694W4k {
    public static final Class<?> LJIJJLI = W4R.class;
    public final C81249Vuf LIZ;
    public final W4T LIZIZ;
    public final Executor LIZJ;
    public C81693W4j LIZLLL;
    public C81685W4b LJ;
    public W4Z<INFO> LJFF;
    public InterfaceC81691W4h LJI;
    public Drawable LJII;
    public String LJIIIIZZ;
    public Object LJIIIZ;
    public boolean LJIIJ;
    public boolean LJIIJJI;
    public boolean LJIIL;
    public boolean LJIILIIL;
    public String LJIILJJIL;
    public W4W<T> LJIILL;
    public T LJIILLIIL;
    public Drawable LJIIZILJ;
    public boolean LJIJ;
    public W5O LJIJI;
    public VAA LJIJJ;

    public abstract Drawable LJ(T t);

    public T LJFF() {
        return null;
    }

    public abstract W4W<T> LJII();

    public abstract InterfaceC81599W0t LJIIJ(Object obj);

    public void LJIILLIIL(Object obj, String str) {
    }

    public abstract void LJIJ(Drawable drawable);

    public abstract void LJIJJ(T t);

    @Override // X.InterfaceC81252Vui
    public final Animatable LIZ() {
        Object obj = this.LJIIZILJ;
        if (obj instanceof Animatable) {
            return (Animatable) obj;
        }
        return null;
    }

    public final W4Z<INFO> LJI() {
        W4Z<INFO> w4z = this.LJFF;
        if (w4z == null) {
            return W4V.LIZ;
        }
        return w4z;
    }

    public final void LJIJI() {
        boolean z = this.LJIIJJI;
        this.LJIIJJI = false;
        this.LJIIL = false;
        W4W<T> w4w = this.LJIILL;
        if (w4w != null) {
            w4w.close();
            this.LJIILL = null;
        }
        Drawable drawable = this.LJIIZILJ;
        if (drawable != null) {
            LJIJ(drawable);
        }
        if (this.LJIILJJIL != null) {
            this.LJIILJJIL = null;
        }
        this.LJIIZILJ = null;
        T t = this.LJIILLIIL;
        if (t != null) {
            LJIILJJIL(t, "release");
            LJIJJ(this.LJIILLIIL);
            this.LJIILLIIL = null;
        }
        if (z) {
            W4Z<INFO> LJI = LJI();
            if (LJI instanceof W4V) {
                ((W4V) LJI).LJIIJJI(this.LJIIIIZZ, this.LJIJI);
            }
            LJI.LIZJ(this.LJIIIIZZ);
        }
    }

    public final boolean LJIL() {
        C81693W4j c81693W4j;
        if (!this.LJIIL || (c81693W4j = this.LIZLLL) == null || !c81693W4j.LIZ || c81693W4j.LIZJ >= c81693W4j.LIZIZ) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC81694W4k
    public final void release() {
        this.LIZ.LIZ(EnumC81251Vuh.ON_RELEASE_CONTROLLER);
        C81693W4j c81693W4j = this.LIZLLL;
        if (c81693W4j != null) {
            c81693W4j.LIZJ = 0;
        }
        C81685W4b c81685W4b = this.LJ;
        if (c81685W4b != null) {
            c81685W4b.LIZJ = false;
            c81685W4b.LIZLLL = false;
        }
        InterfaceC81691W4h interfaceC81691W4h = this.LJI;
        if (interfaceC81691W4h != null) {
            interfaceC81691W4h.reset();
        }
        LJIJI();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LJJ() {
        W5A w5a;
        boolean z;
        C81392Vwy c81392Vwy;
        C81939WDv.LIZIZ();
        Object LJFF = LJFF();
        if ((LJFF instanceof C81392Vwy) && (c81392Vwy = (C81392Vwy) LJFF) != null && (c81392Vwy.LJI() instanceof W5A)) {
            w5a = (W5A) c81392Vwy.LJI();
        } else {
            w5a = null;
        }
        if (w5a != null) {
            z = w5a.isThumbCache;
        } else {
            z = false;
        }
        if (LJFF != null && !z) {
            C81939WDv.LIZIZ();
            this.LJIILL = null;
            this.LJIIJJI = true;
            this.LJIIL = false;
            this.LIZ.LIZ(EnumC81251Vuh.ON_SUBMIT_CACHE_HIT);
            LJI().LJI(this.LJIIIZ, this.LJIIIIZZ);
            LJIILLIIL(LJFF, this.LJIIIIZZ);
            LJIIZILJ(this.LJIIIIZZ, this.LJIILL, LJFF, 1.0f, true, true, true);
            C81939WDv.LIZIZ();
            C81939WDv.LIZIZ();
            return;
        }
        this.LIZ.LIZ(EnumC81251Vuh.ON_DATASOURCE_SUBMIT);
        LJI().LJI(this.LJIIIZ, this.LJIIIIZZ);
        this.LJI.LIZLLL(0.0f, true);
        this.LJIIJJI = true;
        this.LJIIL = false;
        this.LJIILL = LJII();
        if (W58.LJIIJ(2)) {
            W58.LJIILIIL(LJIJJLI, "controller %x %s: submitRequest: dataSource: %x", Integer.valueOf(System.identityHashCode(this)), this.LJIIIIZZ, Integer.valueOf(System.identityHashCode(this.LJIILL)));
        }
        this.LJIILL.LJ(new W4U(this, this.LJIIIIZZ, this.LJIILL.LIZJ()), this.LIZJ);
        C81939WDv.LIZIZ();
    }

    @Override // X.InterfaceC81252Vui
    public final void onAttach() {
        String str;
        C81939WDv.LIZIZ();
        if (W58.LJIIJ(2)) {
            Class<?> cls = LJIJJLI;
            Integer valueOf = Integer.valueOf(System.identityHashCode(this));
            String str2 = this.LJIIIIZZ;
            if (this.LJIIJJI) {
                str = "request already submitted";
            } else {
                str = "request needs submit";
            }
            W58.LJIILIIL(cls, "controller %x %s: onAttach: %s", valueOf, str2, str);
        }
        this.LIZ.LIZ(EnumC81251Vuh.ON_ATTACH_CONTROLLER);
        this.LJI.getClass();
        this.LIZIZ.LIZ(this);
        this.LJIIJ = true;
        if (!this.LJIIJJI) {
            LJJ();
        }
        C81939WDv.LIZIZ();
    }

    @Override // X.InterfaceC81252Vui
    public final void onDetach() {
        C81939WDv.LIZIZ();
        if (W58.LJIIJ(2)) {
            W58.LJIIL(LJIJJLI, "controller %x %s: onDetach", Integer.valueOf(System.identityHashCode(this)), this.LJIIIIZZ);
        }
        this.LIZ.LIZ(EnumC81251Vuh.ON_DETACH_CONTROLLER);
        this.LJIIJ = false;
        W4T w4t = this.LIZIZ;
        w4t.getClass();
        if (!W4T.LJ || W4T.LJI) {
            W4T.LIZIZ();
        }
        if (((HashSet) w4t.LIZ).add(this) && ((HashSet) w4t.LIZ).size() == 1) {
            if (W4T.LJ) {
                int i = W4T.LJFF;
                if (i <= 0) {
                    W4T.LJFF = i + 1;
                }
            }
            w4t.LIZIZ.post(w4t.LIZJ);
        }
        C81939WDv.LIZIZ();
    }

    public String toString() {
        C81254Vuk LIZIZ = C81256Vum.LIZIZ(this);
        LIZIZ.LIZ("isAttached", this.LJIIJ);
        LIZIZ.LIZ("isRequestSubmitted", this.LJIIJJI);
        LIZIZ.LIZ("hasFetchFailed", this.LJIIL);
        LIZIZ.LIZIZ(String.valueOf(LJIIIZ(this.LJIILLIIL)), "fetchedImage");
        LIZIZ.LIZIZ(this.LIZ.toString(), "events");
        return LIZIZ.toString();
    }

    @Override // X.InterfaceC81252Vui
    public final InterfaceC81691W4h LIZJ() {
        return this.LJI;
    }

    @Override // X.InterfaceC81252Vui
    public void LIZIZ(InterfaceC81253Vuj interfaceC81253Vuj) {
        EnumC81251Vuh enumC81251Vuh;
        if (W58.LJIIJ(2)) {
            W58.LJIILIIL(LJIJJLI, "controller %x %s: setHierarchy: %s", Integer.valueOf(System.identityHashCode(this)), this.LJIIIIZZ, interfaceC81253Vuj);
        }
        C81249Vuf c81249Vuf = this.LIZ;
        if (interfaceC81253Vuj != null) {
            enumC81251Vuh = EnumC81251Vuh.ON_SET_HIERARCHY;
        } else {
            enumC81251Vuh = EnumC81251Vuh.ON_CLEAR_HIERARCHY;
        }
        c81249Vuf.LIZ(enumC81251Vuh);
        if (this.LJIIJJI) {
            this.LIZIZ.LIZ(this);
            release();
        }
        InterfaceC81691W4h interfaceC81691W4h = this.LJI;
        if (interfaceC81691W4h != null) {
            interfaceC81691W4h.LIZJ(null);
            this.LJI = null;
        }
        if (interfaceC81253Vuj != null) {
            C32151Nz.LJI(interfaceC81253Vuj instanceof InterfaceC81691W4h);
            InterfaceC81691W4h interfaceC81691W4h2 = (InterfaceC81691W4h) interfaceC81253Vuj;
            this.LJI = interfaceC81691W4h2;
            interfaceC81691W4h2.LIZJ(this.LJII);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LIZLLL(W4Z<? super INFO> w4z) {
        w4z.getClass();
        W4Z<INFO> w4z2 = this.LJFF;
        if (w4z2 instanceof C81692W4i) {
            ((W4S) w4z2).LJIIL(w4z);
            return;
        }
        if (w4z2 != null) {
            C81939WDv.LIZIZ();
            C81692W4i c81692W4i = new C81692W4i();
            c81692W4i.LJIIL(w4z2);
            c81692W4i.LJIIL(w4z);
            C81939WDv.LIZIZ();
            this.LJFF = c81692W4i;
            return;
        }
        this.LJFF = w4z;
    }

    @Override // X.InterfaceC81252Vui
    public final boolean LJIIIIZZ(MotionEvent motionEvent) {
        W4R w4r;
        boolean LJIIJ = W58.LJIIJ(2);
        Class<?> cls = LJIJJLI;
        if (LJIIJ) {
            W58.LJIILIIL(cls, "controller %x %s: onTouchEvent %s", Integer.valueOf(System.identityHashCode(this)), this.LJIIIIZZ, motionEvent);
        }
        C81685W4b c81685W4b = this.LJ;
        if (c81685W4b == null) {
            return false;
        }
        if (!c81685W4b.LIZJ && !LJIL()) {
            return false;
        }
        C81685W4b c81685W4b2 = this.LJ;
        c81685W4b2.getClass();
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action != 2) {
                    if (action == 3) {
                        c81685W4b2.LIZJ = false;
                        c81685W4b2.LIZLLL = false;
                    }
                } else if (Math.abs(motionEvent.getX() - c81685W4b2.LJFF) > c81685W4b2.LIZIZ || Math.abs(motionEvent.getY() - c81685W4b2.LJI) > c81685W4b2.LIZIZ) {
                    c81685W4b2.LIZLLL = false;
                }
            } else {
                c81685W4b2.LIZJ = false;
                if (Math.abs(motionEvent.getX() - c81685W4b2.LJFF) > c81685W4b2.LIZIZ || Math.abs(motionEvent.getY() - c81685W4b2.LJI) > c81685W4b2.LIZIZ) {
                    c81685W4b2.LIZLLL = false;
                }
                if (c81685W4b2.LIZLLL && motionEvent.getEventTime() - c81685W4b2.LJ <= ViewConfiguration.getLongPressTimeout() && (w4r = c81685W4b2.LIZ) != null) {
                    if (W58.LJIIJ(2)) {
                        W58.LJIIL(cls, "controller %x %s: onClick", Integer.valueOf(System.identityHashCode(w4r)), w4r.LJIIIIZZ);
                    }
                    if (w4r.LJIL()) {
                        w4r.LIZLLL.LIZJ++;
                        w4r.LJI.reset();
                        w4r.LJJ();
                    }
                }
                c81685W4b2.LIZLLL = false;
            }
        } else {
            c81685W4b2.LIZJ = true;
            c81685W4b2.LIZLLL = true;
            c81685W4b2.LJ = motionEvent.getEventTime();
            c81685W4b2.LJFF = motionEvent.getX();
            c81685W4b2.LJI = motionEvent.getY();
        }
        return true;
    }

    public int LJIIIZ(T t) {
        return System.identityHashCode(t);
    }

    public final void LJIJJLI(W4V w4v) {
        w4v.getClass();
        W4Z<INFO> w4z = this.LJFF;
        if (w4z instanceof C81692W4i) {
            W4S w4s = (W4S) w4z;
            synchronized (w4s) {
                int indexOf = ((ArrayList) w4s.LIZIZ).indexOf(w4v);
                if (indexOf != -1) {
                    ((ArrayList) w4s.LIZIZ).set(indexOf, null);
                }
            }
            return;
        }
        if (w4z == w4v) {
            this.LJFF = null;
        }
    }

    public W4R(W4T w4t, Executor executor) {
        C81249Vuf c81249Vuf;
        if (C81249Vuf.LIZJ) {
            c81249Vuf = new C81249Vuf();
        } else {
            c81249Vuf = C81249Vuf.LIZIZ;
        }
        this.LIZ = c81249Vuf;
        this.LJIJ = true;
        this.LIZIZ = w4t;
        this.LIZJ = executor;
        LJIIJJI(null, null);
    }

    public final synchronized void LJIIJJI(Object obj, String str) {
        W4T w4t;
        C81939WDv.LIZIZ();
        this.LIZ.LIZ(EnumC81251Vuh.ON_INIT_CONTROLLER);
        if (!this.LJIJ && (w4t = this.LIZIZ) != null) {
            w4t.LIZ(this);
        }
        this.LJIIJ = false;
        LJIJI();
        this.LJIILIIL = false;
        C81693W4j c81693W4j = this.LIZLLL;
        if (c81693W4j != null) {
            c81693W4j.LIZ = false;
            c81693W4j.LIZIZ = 4;
            c81693W4j.LIZJ = 0;
        }
        C81685W4b c81685W4b = this.LJ;
        if (c81685W4b != null) {
            c81685W4b.LIZ = null;
            c81685W4b.LIZJ = false;
            c81685W4b.LIZLLL = false;
            c81685W4b.LIZ = this;
        }
        W4Z<INFO> w4z = this.LJFF;
        if (w4z instanceof C81692W4i) {
            ((C81692W4i) w4z).LJIILIIL();
        } else {
            this.LJFF = null;
        }
        InterfaceC81691W4h interfaceC81691W4h = this.LJI;
        if (interfaceC81691W4h != null) {
            interfaceC81691W4h.reset();
            this.LJI.LIZJ(null);
            this.LJI = null;
        }
        this.LJII = null;
        if (W58.LJIIJ(2)) {
            W58.LJIILIIL(LJIJJLI, "controller %x %s -> %s: initialize", Integer.valueOf(System.identityHashCode(this)), this.LJIIIIZZ, str);
        }
        this.LJIIIIZZ = str;
        this.LJIIIZ = obj;
        C81939WDv.LIZIZ();
    }

    public final boolean LJIIL(String str, W4W<T> w4w) {
        if (w4w == null && this.LJIILL == null) {
            return true;
        }
        if (str.equals(this.LJIIIIZZ) && w4w == this.LJIILL && this.LJIIJJI) {
            return true;
        }
        return false;
    }

    public final void LJIILIIL(String str, Throwable th) {
        if (W58.LJIIJ(2)) {
            W58.LJIILJJIL(LJIJJLI, "controller %x %s: %s: failure: %s", Integer.valueOf(System.identityHashCode(this)), this.LJIIIIZZ, str, th);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LJIILJJIL(Object obj, String str) {
        String str2;
        if (W58.LJIIJ(2)) {
            Class<?> cls = LJIJJLI;
            Object[] objArr = new Object[5];
            objArr[0] = Integer.valueOf(System.identityHashCode(this));
            objArr[1] = this.LJIIIIZZ;
            objArr[2] = str;
            if (obj != 0) {
                str2 = C16880lQ.LJLLJ(obj.getClass());
            } else {
                str2 = "<null>";
            }
            objArr[3] = str2;
            objArr[4] = Integer.valueOf(LJIIIZ(obj));
            if (W58.LIZ.LJIIIIZZ(2)) {
                W58.LIZ.v(C16880lQ.LJLLJ(cls), C16880lQ.LLLZI(null, "controller %x %s: %s: image: %s %x", objArr));
            }
        }
    }

    public final void LJIILL(String str, W4W<T> w4w, Throwable th, boolean z) {
        EnumC81251Vuh enumC81251Vuh;
        Drawable drawable;
        C81939WDv.LIZIZ();
        if (!LJIIL(str, w4w)) {
            LJIILIIL("ignore_old_datasource @ onFailure", th);
            w4w.close();
            C81939WDv.LIZIZ();
            return;
        }
        C81249Vuf c81249Vuf = this.LIZ;
        if (z) {
            enumC81251Vuh = EnumC81251Vuh.ON_DATASOURCE_FAILURE;
        } else {
            enumC81251Vuh = EnumC81251Vuh.ON_DATASOURCE_FAILURE_INT;
        }
        c81249Vuf.LIZ(enumC81251Vuh);
        if (z) {
            LJIILIIL("final_failed @ onFailure", th);
            this.LJIILL = null;
            this.LJIIL = true;
            if (this.LJIILIIL && (drawable = this.LJIIZILJ) != null) {
                this.LJI.LJ(drawable, 1.0f, true);
            } else if (LJIL()) {
                this.LJI.LJFF();
            } else {
                this.LJI.LIZIZ();
            }
            W4Z<INFO> LJI = LJI();
            if (LJI instanceof W4V) {
                ((W4V) LJI).LJIIIIZZ(this.LJIIIIZZ, this.LJIJI, th);
            }
            LJI.LJ(this.LJIIIIZZ, th);
        } else {
            LJIILIIL("intermediate_failed @ onFailure", th);
            LJI().LIZIZ(this.LJIIIIZZ, th);
        }
        C81939WDv.LIZIZ();
    }

    public final void LJIIZILJ(String str, W4W<T> w4w, T t, float f, boolean z, boolean z2, boolean z3) {
        EnumC81251Vuh enumC81251Vuh;
        try {
            C81939WDv.LIZIZ();
            if (!LJIIL(str, w4w)) {
                LJIILJJIL(t, "ignore_old_datasource @ onNewResult");
                LJIJJ(t);
                w4w.close();
                C81939WDv.LIZIZ();
                return;
            }
            C81249Vuf c81249Vuf = this.LIZ;
            if (z) {
                enumC81251Vuh = EnumC81251Vuh.ON_DATASOURCE_RESULT;
            } else {
                enumC81251Vuh = EnumC81251Vuh.ON_DATASOURCE_RESULT_INT;
            }
            c81249Vuf.LIZ(enumC81251Vuh);
            try {
                Drawable LJ = LJ(t);
                T t2 = this.LJIILLIIL;
                Drawable drawable = this.LJIIZILJ;
                this.LJIILLIIL = t;
                this.LJIIZILJ = LJ;
                if (w4w instanceof C81697W4n) {
                    W4P<W4W<T>> LJIILJJIL = ((C81697W4n) w4w).LJIILJJIL();
                    if (LJIILJJIL instanceof AbstractC81686W4c.c) {
                        Object LIZ = ((AbstractC81686W4c.c) LJIILJJIL).LIZ();
                        if (this.LJIJI == null && LIZ != null) {
                            W5O w5o = (W5O) LIZ;
                            this.LJIJI = w5o;
                            w5o.LJIJI = this.LJIJJ;
                        }
                    }
                }
                HashMap hashMap = new HashMap();
                hashMap.put("drawableWidth", Integer.valueOf(LJ.getIntrinsicWidth()));
                hashMap.put("drawableHeight", Integer.valueOf(LJ.getIntrinsicHeight()));
                hashMap.put("scene_tag", this.LJIIIZ);
                try {
                    if (z) {
                        LJIILJJIL(t, "set_final_result @ onNewResult");
                        this.LJIILL = null;
                        this.LJI.LJ(LJ, 1.0f, z2);
                        W4Z<INFO> LJI = LJI();
                        if (LJI instanceof W4V) {
                            ((W4V) LJI).LJIIIZ(str, LJIIJ(t), LIZ(), this.LJIJI, hashMap);
                        }
                        LJI.LJFF(str, LJIIJ(t), LIZ());
                    } else if (z3) {
                        LJIILJJIL(t, "set_temporary_result @ onNewResult");
                        this.LJI.LJ(LJ, 1.0f, z2);
                        LJI().LJFF(str, LJIIJ(t), LIZ());
                    } else {
                        LJIILJJIL(t, "set_intermediate_result @ onNewResult");
                        this.LJI.LJ(LJ, f, z2);
                        LJI().LIZLLL(LJIIJ(t), str);
                        if (LJI() instanceof W4V) {
                            ((W4V) LJI()).LJIIJ(str, LJIIJ(t), LIZ());
                        }
                    }
                    C81939WDv.LIZIZ();
                } finally {
                    if (drawable != null && drawable != LJ) {
                        LJIJ(drawable);
                    }
                    if (t2 != null && t2 != t) {
                        LJIILJJIL(t2, "release_previous_result @ onNewResult");
                        LJIJJ(t2);
                    }
                }
            } catch (Exception e) {
                LJIILJJIL(t, "drawable_failed @ onNewResult");
                LJIJJ(t);
                LJIILL(str, w4w, e, z);
                C81939WDv.LIZIZ();
            }
        } catch (Throwable th) {
            C81939WDv.LIZIZ();
            throw th;
        }
    }
}
