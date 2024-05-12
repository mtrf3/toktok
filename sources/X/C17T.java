package X;

import X.C17T;
import android.os.Looper;
import android.util.AndroidRuntimeException;
import android.view.View;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;

/* renamed from: X.17T, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C17T<T extends C17T<T>> implements C00J {
    public static final C29E LJIIL = new AbstractC45091pp() { // from class: X.29E
        @Override // X.QXX
        public final float LLJJIJI(Object obj) {
            return ((View) obj).getTranslationX();
        }

        @Override // X.QXX
        public final void LLLLL(float f, Object obj) {
            ((View) obj).setTranslationX(f);
        }
    };
    public static final C29F LJIILIIL = new AbstractC45091pp() { // from class: X.29F
        @Override // X.QXX
        public final float LLJJIJI(Object obj) {
            return ((View) obj).getTranslationY();
        }

        @Override // X.QXX
        public final void LLLLL(float f, Object obj) {
            ((View) obj).setTranslationY(f);
        }
    };
    public static final C29H LJIILJJIL = new AbstractC45091pp() { // from class: X.29H
        @Override // X.QXX
        public final float LLJJIJI(Object obj) {
            return ((View) obj).getScaleX();
        }

        @Override // X.QXX
        public final void LLLLL(float f, Object obj) {
            ((View) obj).setScaleX(f);
        }
    };
    public static final C29I LJIILL = new AbstractC45091pp() { // from class: X.29I
        @Override // X.QXX
        public final float LLJJIJI(Object obj) {
            return ((View) obj).getScaleY();
        }

        @Override // X.QXX
        public final void LLLLL(float f, Object obj) {
            ((View) obj).setScaleY(f);
        }
    };
    public static final C29J LJIILLIIL = new AbstractC45091pp() { // from class: X.29J
        @Override // X.QXX
        public final float LLJJIJI(Object obj) {
            return ((View) obj).getRotation();
        }

        @Override // X.QXX
        public final void LLLLL(float f, Object obj) {
            ((View) obj).setRotation(f);
        }
    };
    public static final C29K LJIIZILJ = new AbstractC45091pp() { // from class: X.29K
        @Override // X.QXX
        public final float LLJJIJI(Object obj) {
            return ((View) obj).getRotationX();
        }

        @Override // X.QXX
        public final void LLLLL(float f, Object obj) {
            ((View) obj).setRotationX(f);
        }
    };
    public static final C29L LJIJ = new AbstractC45091pp() { // from class: X.29L
        @Override // X.QXX
        public final float LLJJIJI(Object obj) {
            return ((View) obj).getRotationY();
        }

        @Override // X.QXX
        public final void LLLLL(float f, Object obj) {
            ((View) obj).setRotationY(f);
        }
    };
    public static final C29B LJIJI = new AbstractC45091pp() { // from class: X.29B
        @Override // X.QXX
        public final float LLJJIJI(Object obj) {
            return ((View) obj).getAlpha();
        }

        @Override // X.QXX
        public final void LLLLL(float f, Object obj) {
            ((View) obj).setAlpha(f);
        }
    };
    public static final C29C LJIJJ = new AbstractC45091pp() { // from class: X.29C
        @Override // X.QXX
        public final float LLJJIJI(Object obj) {
            return ((View) obj).getScrollX();
        }

        @Override // X.QXX
        public final void LLLLL(float f, Object obj) {
            ((View) obj).setScrollX((int) f);
        }
    };
    public static final C29D LJIJJLI = new AbstractC45091pp() { // from class: X.29D
        @Override // X.QXX
        public final float LLJJIJI(Object obj) {
            return ((View) obj).getScrollY();
        }

        @Override // X.QXX
        public final void LLLLL(float f, Object obj) {
            ((View) obj).setScrollY((int) f);
        }
    };
    public float LIZ;
    public boolean LIZJ;
    public final Object LIZLLL;
    public final QXX LJ;
    public boolean LJFF;
    public long LJIIIIZZ;
    public final float LJIIIZ;
    public float LIZIZ = Float.MAX_VALUE;
    public float LJI = Float.MAX_VALUE;
    public float LJII = -3.4028235E38f;
    public final ArrayList<C00O> LJIIJ = new ArrayList<>();
    public final ArrayList<C00P> LJIIJJI = new ArrayList<>();

    public final void LIZLLL() {
        if (Looper.myLooper() == C16880lQ.LLJJJJ()) {
            if (this.LJFF) {
                LJ(true);
                return;
            }
            return;
        }
        throw new AndroidRuntimeException("Animations may only be canceled on the main thread");
    }

    @Override // X.C00J
    public final boolean LIZ(long j) {
        long j2 = this.LJIIIIZZ;
        if (j2 == 0) {
            this.LJIIIIZZ = j;
            LJFF(this.LIZIZ);
            return false;
        }
        long j3 = j - j2;
        this.LJIIIIZZ = j;
        C39661h4 c39661h4 = (C39661h4) this;
        boolean z = true;
        if (c39661h4.LJJI) {
            float f = c39661h4.LJJ;
            if (f != Float.MAX_VALUE) {
                c39661h4.LJIL.LJIIIIZZ = f;
                c39661h4.LJJ = Float.MAX_VALUE;
            }
            c39661h4.LIZIZ = (float) c39661h4.LJIL.LJIIIIZZ;
            c39661h4.LIZ = 0.0f;
            c39661h4.LJJI = false;
        } else {
            if (c39661h4.LJJ != Float.MAX_VALUE) {
                long j4 = j3 / 2;
                C00N LIZJ = c39661h4.LJIL.LIZJ(c39661h4.LIZIZ, c39661h4.LIZ, j4);
                C00Q c00q = c39661h4.LJIL;
                c00q.LJIIIIZZ = c39661h4.LJJ;
                c39661h4.LJJ = Float.MAX_VALUE;
                C00N LIZJ2 = c00q.LIZJ(LIZJ.LIZ, LIZJ.LIZIZ, j4);
                c39661h4.LIZIZ = LIZJ2.LIZ;
                c39661h4.LIZ = LIZJ2.LIZIZ;
            } else {
                C00N LIZJ3 = c39661h4.LJIL.LIZJ(c39661h4.LIZIZ, c39661h4.LIZ, j3);
                c39661h4.LIZIZ = LIZJ3.LIZ;
                c39661h4.LIZ = LIZJ3.LIZIZ;
            }
            float max = Math.max(c39661h4.LIZIZ, c39661h4.LJII);
            c39661h4.LIZIZ = max;
            c39661h4.LIZIZ = Math.min(max, c39661h4.LJI);
            float f2 = c39661h4.LIZ;
            C00Q c00q2 = c39661h4.LJIL;
            c00q2.getClass();
            if (Math.abs(f2) < c00q2.LJ && Math.abs(r10 - ((float) c00q2.LJIIIIZZ)) < c00q2.LIZLLL) {
                c39661h4.LIZIZ = (float) c39661h4.LJIL.LJIIIIZZ;
                c39661h4.LIZ = 0.0f;
            } else {
                z = false;
            }
        }
        float min = Math.min(this.LIZIZ, this.LJI);
        this.LIZIZ = min;
        float max2 = Math.max(min, this.LJII);
        this.LIZIZ = max2;
        LJFF(max2);
        if (z) {
            LJ(false);
        }
        return z;
    }

    public final void LIZIZ(C00O c00o) {
        if (!this.LJIIJ.contains(c00o)) {
            this.LJIIJ.add(c00o);
        }
    }

    public final void LIZJ(C00P c00p) {
        if (!this.LJFF) {
            if (!this.LJIIJJI.contains(c00p)) {
                this.LJIIJJI.add(c00p);
                return;
            }
            return;
        }
        throw new UnsupportedOperationException("Error: Update listeners must be added beforethe animation.");
    }

    public final void LJ(boolean z) {
        this.LJFF = false;
        ThreadLocal<C00M> threadLocal = C00M.LJI;
        if (threadLocal.get() == null) {
            threadLocal.set(new C00M());
        }
        C00M c00m = threadLocal.get();
        c00m.LIZ.remove(this);
        int indexOf = c00m.LIZIZ.indexOf(this);
        if (indexOf >= 0) {
            ListProtector.set(c00m.LIZIZ, indexOf, null);
            c00m.LJFF = true;
        }
        this.LJIIIIZZ = 0L;
        this.LIZJ = false;
        for (int i = 0; i < this.LJIIJ.size(); i++) {
            if (ListProtector.get(this.LJIIJ, i) != null) {
                ((C00O) ListProtector.get(this.LJIIJ, i)).LIZ();
            }
        }
        ArrayList<C00O> arrayList = this.LJIIJ;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size >= 0) {
                if (ListProtector.get(arrayList, size) == null) {
                    ListProtector.remove(arrayList, size);
                }
            } else {
                return;
            }
        }
    }

    public final void LJFF(float f) {
        this.LJ.LLLLL(f, this.LIZLLL);
        for (int i = 0; i < this.LJIIJJI.size(); i++) {
            if (ListProtector.get(this.LJIIJJI, i) != null) {
                ((C00P) ListProtector.get(this.LJIIJJI, i)).LIZ();
            }
        }
        ArrayList<C00P> arrayList = this.LJIIJJI;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size >= 0) {
                if (ListProtector.get(arrayList, size) == null) {
                    ListProtector.remove(arrayList, size);
                }
            } else {
                return;
            }
        }
    }

    public final void LJI(float f) {
        this.LIZIZ = f;
        this.LIZJ = true;
    }

    public <K> C17T(K k, QXX qxx) {
        this.LIZLLL = k;
        this.LJ = qxx;
        if (qxx == LJIILLIIL || qxx == LJIIZILJ || qxx == LJIJ) {
            this.LJIIIZ = 0.1f;
            return;
        }
        if (qxx == LJIJI) {
            this.LJIIIZ = 0.00390625f;
        } else if (qxx == LJIILJJIL || qxx == LJIILL) {
            this.LJIIIZ = 0.00390625f;
        } else {
            this.LJIIIZ = 1.0f;
        }
    }
}
