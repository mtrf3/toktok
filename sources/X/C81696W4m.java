package X;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: Add missing generic type declarations: [T] */
/* renamed from: X.W4m, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C81696W4m<T> extends AbstractC48384Iyq<T> {
    public ArrayList<W4W<T>> LJI;
    public int LJII;
    public int LJIIIIZZ;
    public AtomicInteger LJIIIZ;
    public Throwable LJIIJ;
    public final /* synthetic */ C81688W4e LJIIJJI;

    @Override // X.AbstractC48384Iyq, X.W4W
    public final synchronized boolean LIZJ() {
        boolean z;
        if (this.LJIIJJI.LIZIZ) {
            LJIILJJIL();
        }
        W4W<T> LJIIZILJ = LJIIZILJ();
        if (LJIIZILJ != null) {
            if (LJIIZILJ.LIZJ()) {
                z = true;
            }
        }
        z = false;
        return z;
    }

    public final synchronized W4W<T> LJIIZILJ() {
        return LJIILLIIL(this.LJII);
    }

    @Override // X.AbstractC48384Iyq, X.W4W
    public final synchronized T getResult() {
        T t;
        if (this.LJIIJJI.LIZIZ) {
            LJIILJJIL();
        }
        W4W<T> LJIIZILJ = LJIIZILJ();
        if (LJIIZILJ != null) {
            t = LJIIZILJ.getResult();
        } else {
            t = null;
        }
        return t;
    }

    public final void LJIILJJIL() {
        if (this.LJIIIZ != null) {
            return;
        }
        synchronized (this) {
            if (this.LJIIIZ == null) {
                this.LJIIIZ = new AtomicInteger(0);
                int size = this.LJIIJJI.LIZ.size();
                this.LJIIIIZZ = size;
                this.LJII = size;
                this.LJI = new ArrayList<>(size);
                for (int i = 0; i < size; i++) {
                    W4W<T> w4w = this.LJIIJJI.LIZ.get(i).get();
                    this.LJI.add(w4w);
                    w4w.LJ(new C81698W4o(this, i), C79561VKj.LJLIL);
                    if (w4w.LIZJ()) {
                        break;
                    }
                }
            }
        }
    }

    @Override // X.AbstractC48384Iyq, X.W4W
    public final boolean close() {
        if (this.LJIIJJI.LIZIZ) {
            LJIILJJIL();
        }
        synchronized (this) {
            if (!super.close()) {
                return false;
            }
            ArrayList<W4W<T>> arrayList = this.LJI;
            this.LJI = null;
            if (arrayList != null) {
                for (int i = 0; i < arrayList.size(); i++) {
                    W4W<T> w4w = arrayList.get(i);
                    if (w4w != null) {
                        w4w.close();
                    }
                }
                return true;
            }
            return true;
        }
    }

    public C81696W4m(C81688W4e c81688W4e) {
        this.LJIIJJI = c81688W4e;
        if (!c81688W4e.LIZIZ) {
            LJIILJJIL();
        }
    }

    public final synchronized W4W<T> LJIILL(int i) {
        W4W<T> w4w;
        ArrayList<W4W<T>> arrayList = this.LJI;
        w4w = null;
        if (arrayList != null && i < arrayList.size()) {
            w4w = this.LJI.set(i, null);
        }
        return w4w;
    }

    public final synchronized W4W<T> LJIILLIIL(int i) {
        W4W<T> w4w;
        ArrayList<W4W<T>> arrayList = this.LJI;
        if (arrayList != null && i < arrayList.size()) {
            w4w = this.LJI.get(i);
        } else {
            w4w = null;
        }
        return w4w;
    }

    public final void LJIJ(int i, W4W<T> w4w) {
        W4W<T> w4w2;
        Throwable th;
        synchronized (this) {
            if (w4w != LJIIZILJ()) {
                if (w4w == LJIILLIIL(i)) {
                    w4w2 = LJIILL(i);
                } else {
                    w4w2 = w4w;
                }
                if (w4w2 != null) {
                    w4w2.close();
                }
            }
        }
        if (i == 0) {
            this.LJIIJ = w4w.LJFF();
        }
        if (this.LJIIIZ.incrementAndGet() == this.LJIIIIZZ && (th = this.LJIIJ) != null) {
            LJIIJ(th);
        }
    }
}
