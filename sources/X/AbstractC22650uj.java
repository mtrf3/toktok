package X;

import android.view.animation.Interpolator;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.0uj, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC22650uj<K, A> {
    public final InterfaceC22640ui<K> LIZJ;
    public final List<? extends C06780Ok<K>> LIZLLL;
    public C06800Om<A> LJFF;
    public C06780Ok<K> LJI;
    public final List<InterfaceC22630uh> LIZ = new ArrayList();
    public boolean LIZIZ = false;
    public float LJ = 0.0f;
    public A LJII = null;
    public float LJIIIIZZ = -1.0f;
    public float LJIIIZ = -1.0f;

    public abstract A LJII(C06780Ok<K> c06780Ok, float f);

    public void LJIIIIZZ() {
        for (int i = 0; i < ((ArrayList) this.LIZ).size(); i++) {
            ((InterfaceC22630uh) ListProtector.get(this.LIZ, i)).LJI();
        }
    }

    public final C06780Ok<K> LIZIZ() {
        InterfaceC22640ui<K> interfaceC22640ui;
        if (C03970Dp.LIZ && (interfaceC22640ui = this.LIZJ) != null) {
            return interfaceC22640ui.LJIIIIZZ();
        }
        C06780Ok<K> c06780Ok = this.LJI;
        if (c06780Ok != null && c06780Ok.LIZ(this.LJ)) {
            return this.LJI;
        }
        List<? extends C06780Ok<K>> list = this.LIZLLL;
        C06780Ok<K> c06780Ok2 = (C06780Ok) C64504PTg.LIZIZ(list, -1, list);
        if (this.LJ < c06780Ok2.LIZJ()) {
            int size = this.LIZLLL.size();
            do {
                size--;
                if (size < 0) {
                    break;
                }
                c06780Ok2 = (C06780Ok) ListProtector.get(this.LIZLLL, size);
            } while (!c06780Ok2.LIZ(this.LJ));
        }
        this.LJI = c06780Ok2;
        return c06780Ok2;
    }

    public float LIZJ() {
        InterfaceC22640ui<K> interfaceC22640ui;
        if (C03970Dp.LIZ && (interfaceC22640ui = this.LIZJ) != null) {
            if (this.LJIIIZ == -1.0f) {
                this.LJIIIZ = interfaceC22640ui.LIZLLL();
            }
            return this.LJIIIZ;
        }
        if (this.LIZLLL.isEmpty()) {
            return 1.0f;
        }
        List<? extends C06780Ok<K>> list = this.LIZLLL;
        return ((C06780Ok) C64504PTg.LIZIZ(list, -1, list)).LIZIZ();
    }

    public final float LJ() {
        if (this.LIZIZ) {
            return 0.0f;
        }
        C06780Ok<K> LIZIZ = LIZIZ();
        if (LIZIZ.LIZLLL == null) {
            return 0.0f;
        }
        return (this.LJ - LIZIZ.LIZJ()) / (LIZIZ.LIZIZ() - LIZIZ.LIZJ());
    }

    public final float LJFF() {
        InterfaceC22640ui<K> interfaceC22640ui;
        if (C03970Dp.LIZ && (interfaceC22640ui = this.LIZJ) != null) {
            if (this.LJIIIIZZ == -1.0f) {
                this.LJIIIIZZ = interfaceC22640ui.LIZJ();
            }
            return this.LJIIIIZZ;
        }
        if (this.LIZLLL.isEmpty()) {
            return 0.0f;
        }
        return ((C06780Ok) ListProtector.get(this.LIZLLL, 0)).LIZJ();
    }

    public A LJI() {
        if (C03970Dp.LIZ && this.LIZJ != null) {
            float LIZLLL = LIZLLL();
            if (this.LJFF == null && this.LIZJ.LIZ(LIZLLL)) {
                return this.LJII;
            }
            A LJII = LJII(LIZIZ(), LIZLLL);
            this.LJII = LJII;
            return LJII;
        }
        return LJII(LIZIZ(), LIZLLL());
    }

    public final float LIZLLL() {
        Interpolator interpolator = LIZIZ().LIZLLL;
        if (interpolator == null) {
            return 0.0f;
        }
        return interpolator.getInterpolation(LJ());
    }

    public AbstractC22650uj(final List<? extends C06780Ok<K>> list) {
        InterfaceC22640ui<K> interfaceC22640ui;
        this.LIZLLL = list;
        if (C03970Dp.LIZ) {
            if (list.isEmpty()) {
                interfaceC22640ui = (InterfaceC22640ui<K>) new InterfaceC22640ui<T>() { // from class: X.1Zi
                    @Override // X.InterfaceC22640ui
                    public final boolean LIZIZ(float f) {
                        return false;
                    }

                    @Override // X.InterfaceC22640ui
                    public final float LIZJ() {
                        return 0.0f;
                    }

                    @Override // X.InterfaceC22640ui
                    public final float LIZLLL() {
                        return 1.0f;
                    }

                    @Override // X.InterfaceC22640ui
                    public final boolean isEmpty() {
                        return true;
                    }

                    @Override // X.InterfaceC22640ui
                    public final C06780Ok<T> LJIIIIZZ() {
                        throw new IllegalStateException("not implemented");
                    }

                    @Override // X.InterfaceC22640ui
                    public final boolean LIZ(float f) {
                        throw new IllegalStateException("not implemented");
                    }
                };
            } else if (list.size() == 1) {
                interfaceC22640ui = (InterfaceC22640ui<K>) new InterfaceC22640ui<T>(list) { // from class: X.1Zk
                    public final C06780Ok<T> LIZ;
                    public float LIZIZ = -1.0f;

                    @Override // X.InterfaceC22640ui
                    public final boolean isEmpty() {
                        return false;
                    }

                    @Override // X.InterfaceC22640ui
                    public final float LIZJ() {
                        return this.LIZ.LIZJ();
                    }

                    @Override // X.InterfaceC22640ui
                    public final float LIZLLL() {
                        return this.LIZ.LIZIZ();
                    }

                    @Override // X.InterfaceC22640ui
                    public final C06780Ok<T> LJIIIIZZ() {
                        return this.LIZ;
                    }

                    {
                        this.LIZ = (C06780Ok) ListProtector.get(list, 0);
                    }

                    @Override // X.InterfaceC22640ui
                    public final boolean LIZ(float f) {
                        if (this.LIZIZ == f) {
                            return true;
                        }
                        this.LIZIZ = f;
                        return false;
                    }

                    @Override // X.InterfaceC22640ui
                    public final boolean LIZIZ(float f) {
                        boolean z;
                        if (this.LIZ.LIZLLL == null) {
                            z = true;
                        } else {
                            z = false;
                        }
                        return !z;
                    }
                };
            } else {
                interfaceC22640ui = (InterfaceC22640ui<K>) new InterfaceC22640ui<T>(list) { // from class: X.1Zj
                    public final List<? extends C06780Ok<T>> LIZ;
                    public C06780Ok<T> LIZJ;
                    public float LIZLLL = -1.0f;
                    public C06780Ok<T> LIZIZ = LJ(0.0f);

                    @Override // X.InterfaceC22640ui
                    public final boolean isEmpty() {
                        return false;
                    }

                    @Override // X.InterfaceC22640ui
                    public final float LIZJ() {
                        return ((C06780Ok) ListProtector.get(this.LIZ, 0)).LIZJ();
                    }

                    @Override // X.InterfaceC22640ui
                    public final float LIZLLL() {
                        List<? extends C06780Ok<T>> list2 = this.LIZ;
                        return ((C06780Ok) C64504PTg.LIZIZ(list2, -1, list2)).LIZIZ();
                    }

                    @Override // X.InterfaceC22640ui
                    public final C06780Ok<T> LJIIIIZZ() {
                        return this.LIZIZ;
                    }

                    {
                        this.LIZ = list;
                    }

                    @Override // X.InterfaceC22640ui
                    public final boolean LIZ(float f) {
                        C06780Ok<T> c06780Ok = this.LIZJ;
                        C06780Ok<T> c06780Ok2 = this.LIZIZ;
                        if (c06780Ok == c06780Ok2 && this.LIZLLL == f) {
                            return true;
                        }
                        this.LIZJ = c06780Ok2;
                        this.LIZLLL = f;
                        return false;
                    }

                    @Override // X.InterfaceC22640ui
                    public final boolean LIZIZ(float f) {
                        boolean z;
                        if (this.LIZIZ.LIZ(f)) {
                            if (this.LIZIZ.LIZLLL == null) {
                                z = true;
                            } else {
                                z = false;
                            }
                            return !z;
                        }
                        this.LIZIZ = LJ(f);
                        return true;
                    }

                    public final C06780Ok<T> LJ(float f) {
                        List<? extends C06780Ok<T>> list2 = this.LIZ;
                        C06780Ok<T> c06780Ok = (C06780Ok) DIX.LIZJ(list2, 1, list2);
                        if (f >= c06780Ok.LIZJ()) {
                            return c06780Ok;
                        }
                        for (int size = this.LIZ.size() - 2; size >= 1; size--) {
                            C06780Ok<T> c06780Ok2 = (C06780Ok) ListProtector.get(this.LIZ, size);
                            if (this.LIZIZ != c06780Ok2 && c06780Ok2.LIZ(f)) {
                                return c06780Ok2;
                            }
                        }
                        return (C06780Ok) ListProtector.get(this.LIZ, 0);
                    }
                };
            }
            this.LIZJ = interfaceC22640ui;
        }
    }

    public final void LIZ(InterfaceC22630uh interfaceC22630uh) {
        ((ArrayList) this.LIZ).add(interfaceC22630uh);
    }

    public void LJIIIZ(float f) {
        InterfaceC22640ui<K> interfaceC22640ui;
        InterfaceC22640ui<K> interfaceC22640ui2;
        if (C03970Dp.LIZ && (interfaceC22640ui2 = this.LIZJ) != null && interfaceC22640ui2.isEmpty()) {
            return;
        }
        if (f < LJFF()) {
            f = LJFF();
        } else if (f > LIZJ()) {
            f = LIZJ();
        }
        if (f == this.LJ) {
            return;
        }
        this.LJ = f;
        if (C03970Dp.LIZ && (interfaceC22640ui = this.LIZJ) != null && !interfaceC22640ui.LIZIZ(f)) {
            return;
        }
        LJIIIIZZ();
    }

    public final void LJIIJ(C06800Om<A> c06800Om) {
        C06800Om<A> c06800Om2 = this.LJFF;
        if (c06800Om2 != null) {
            c06800Om2.getClass();
        }
        this.LJFF = c06800Om;
    }
}
