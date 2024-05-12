package X;

import Y.ARunnableS48S0100000_12;
import Y.AUListenerS99S0100000_12;
import android.content.Context;
import android.graphics.Matrix;
import android.graphics.RectF;
import java.util.Iterator;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.o;

/* renamed from: X.SIh, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71863SIh extends SJ3 implements InterfaceC71511S4t {
    public final LinkedHashSet<InterfaceC71509S4r> LLI;
    public boolean LLIFFJFJJ;
    public int LLII;
    public final Matrix LLIIII;
    public boolean LLIIIILZ;
    public final Matrix LLIIIJ;
    public float LLIIIL;
    public final AUListenerS99S0100000_12 LLIIIZ;
    public SH9 LLIIJI;

    public final float LJIJJ() {
        if (this.LLIFFJFJJ) {
            float f = this.LJLIL.LJLJJLL;
            if (f > 0.0f) {
                float f2 = 1;
                float height = f / this.LJLJLJ.height();
                if (height > 0.95f) {
                    height = 0.95f;
                }
                return f2 - height;
            }
            return 1.0f;
        }
        return 1.0f;
    }

    @Override // X.SJ3, X.SJ8
    public final /* bridge */ /* synthetic */ void LIZ(SJ5 sj5) {
        LIZ(sj5);
    }

    @Override // X.SJ3, X.SJ8
    public final /* bridge */ /* synthetic */ void LIZIZ(SJ5 sj5) {
        LIZIZ(sj5);
    }

    @Override // X.InterfaceC71511S4t
    public final void LIZJ(InterfaceC71509S4r listener) {
        o.LJIIIZ(listener, "listener");
        this.LLI.add(listener);
    }

    @Override // X.InterfaceC71511S4t
    public final void LIZLLL(C70777Rq9 c70777Rq9) {
        this.LLI.remove(c70777Rq9);
    }

    @Override // X.SJ3, X.SJ8
    public final /* bridge */ /* synthetic */ void LJ(SJ5 sj5) {
        LJ(sj5);
    }

    @Override // X.SJ3
    /* renamed from: LJIILIIL */
    public final void LJ(SJ5 detector) {
        boolean z;
        o.LJIIIZ(detector, "detector");
        super.LJ(detector);
        if (this.LLFZ) {
            return;
        }
        this.LLII = -1;
        if (this.LJLJLJ.top - this.LJLL.top > 0.001f) {
            z = true;
        } else {
            z = false;
        }
        this.LLIIIILZ = !z;
    }

    @Override // X.SJ3
    /* renamed from: LJIILJJIL */
    public final void LIZ(SJ5 detector) {
        o.LJIIIZ(detector, "detector");
        if (!this.LLFZ && this.LLII == 3) {
            float LJIJJ = LJIJJ();
            Iterator<InterfaceC71509S4r> it = this.LLI.iterator();
            while (it.hasNext()) {
                it.next().LIZ(this.LLII);
            }
            if (LJIJJ < this.LLIIIL) {
                LJIJI(false);
                return;
            }
            this.LLII = 1;
            this.LLFZ = true;
            this.LLIIII.set(this.LLIIIJ);
            Iterator<InterfaceC71509S4r> it2 = this.LLI.iterator();
            while (it2.hasNext()) {
                it2.next().LIZJ(this.LLII);
            }
            LJIIZILJ(this.LLIIII, this.LLF, new ARunnableS48S0100000_12(this, 2), this.LLIIIZ);
        }
    }

    @Override // X.SJ3
    /* renamed from: LJIILL */
    public final void LIZIZ(SJ5 detector) {
        o.LJIIIZ(detector, "detector");
        SH9 sh9 = this.LLIIJI;
        if (sh9 != null) {
            this.LJLLI.getValues(this.LJLLJ);
            sh9.LJIIIIZZ(this.LJLLJ[0]);
        }
        if (this.LLFZ || LJIIIZ()) {
            return;
        }
        if (this.LLIFFJFJJ && detector.LJLLILLLL == 4 && this.LLIIIILZ && this.LLII == -1) {
            this.LLII = 3;
            this.LLIIIJ.set(this.LJLLI);
            Iterator<InterfaceC71509S4r> it = this.LLI.iterator();
            while (it.hasNext()) {
                it.next().LIZJ(this.LLII);
            }
        }
        if (this.LLII == 3) {
            Matrix activeTransform = this.LJLLI;
            o.LJIIIIZZ(activeTransform, "activeTransform");
            SJ5 sj5 = this.LJLIL;
            RectF rectF = this.LJLJLLL;
            activeTransform.set(this.LLIIIJ);
            float f = sj5.LJLJJLL;
            float LJIJJ = LJIJJ();
            activeTransform.postScale(LJIJJ, LJIJJ, rectF.centerX(), rectF.centerY());
            Iterator<InterfaceC71509S4r> it2 = this.LLI.iterator();
            while (it2.hasNext()) {
                it2.next().LIZIZ(LJIJJ, this.LLII);
            }
            if (this.LJLJJL) {
                activeTransform.postTranslate(sj5.LJLJJL, f);
            }
            LJFF();
            return;
        }
        super.LIZIZ(detector);
    }

    public final void LJIJI(boolean z) {
        this.LLII = 2;
        this.LLFZ = true;
        this.LLIIII.set(this.LJLLI);
        if (z) {
            this.LLIIII.postTranslate(this.LJLJLLL.centerX() - this.LJLL.centerX(), this.LJLJLLL.centerY() - this.LJLL.centerY());
            this.LLIIII.postScale(0.1f, 0.1f, this.LJLJLLL.centerX(), this.LJLJLLL.centerY());
        } else {
            this.LLIIII.postScale(0.1f, 0.1f, this.LJLL.centerX(), this.LJLL.centerY());
        }
        Iterator<InterfaceC71509S4r> it = this.LLI.iterator();
        while (it.hasNext()) {
            it.next().LIZJ(this.LLII);
        }
        LJIIZILJ(this.LLIIII, this.LLF, new ARunnableS48S0100000_12(this, 1), this.LLIIIZ);
    }

    @Override // X.InterfaceC71511S4t
    public final void setDragTransitionEnabled(boolean z) {
        this.LLIFFJFJJ = z;
    }

    @Override // X.InterfaceC71511S4t
    public final void setMaxDragTransitionFactor(float f) {
        this.LLIIIL = f;
    }

    public C71863SIh(SJ5 sj5, Context context) {
        super(sj5, context);
        this.LLI = new LinkedHashSet<>();
        this.LLIFFJFJJ = true;
        this.LLII = -1;
        this.LLIIII = new Matrix();
        this.LLIIIILZ = true;
        this.LLIIIJ = new Matrix();
        this.LLIIIL = 0.7f;
        this.LLIIIZ = new AUListenerS99S0100000_12(this, 3);
    }
}
