package X;

import android.content.res.Resources;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes14.dex */
public final class V92 implements InterfaceC81691W4h {
    public final Drawable LIZ;
    public final Resources LIZIZ;
    public V8L LIZJ;
    public final C81033VrB LIZLLL;
    public final V94 LJ;
    public final C80627Vkd LJFF;

    public final void LJIIIIZZ() {
        LJIIIZ(1);
        LJIIIZ(2);
        LJIIIZ(3);
        LJIIIZ(4);
        LJIIIZ(5);
    }

    @Override // X.InterfaceC81691W4h
    public final void LIZIZ() {
        this.LJ.LJLZ++;
        LJIIIIZZ();
        if (this.LJ.LIZ(5) != null) {
            LJII(5);
        } else {
            LJII(1);
        }
        r1.LJLZ--;
        this.LJ.invalidateSelf();
    }

    @Override // X.InterfaceC81691W4h
    public final void LJFF() {
        this.LJ.LJLZ++;
        LJIIIIZZ();
        if (this.LJ.LIZ(4) != null) {
            LJII(4);
        } else {
            LJII(1);
        }
        r1.LJLZ--;
        this.LJ.invalidateSelf();
    }

    public final void LJIILIIL() {
        V94 v94 = this.LJ;
        if (v94 != null) {
            v94.LJLZ++;
            v94.LJLL = 0;
            Arrays.fill(v94.LJLLLLLL, true);
            v94.invalidateSelf();
            LJIIIIZZ();
            LJII(1);
            this.LJ.LIZJ();
            r1.LJLZ--;
            this.LJ.invalidateSelf();
        }
    }

    @Override // X.InterfaceC81691W4h
    public final void reset() {
        this.LJFF.LJIILIIL(this.LIZ);
        LJIILIIL();
    }

    @Override // X.InterfaceC81253Vuj
    public final C81033VrB LIZ() {
        return this.LIZLLL;
    }

    public V92(C79077V1t c79077V1t) {
        int i;
        int i2;
        int i3 = 0;
        ColorDrawable colorDrawable = new ColorDrawable(0);
        this.LIZ = colorDrawable;
        C81939WDv.LIZIZ();
        this.LIZIZ = c79077V1t.LIZ;
        this.LIZJ = c79077V1t.LJIILL;
        C80627Vkd c80627Vkd = new C80627Vkd(colorDrawable);
        this.LJFF = c80627Vkd;
        List<Drawable> list = c79077V1t.LJIILIIL;
        int i4 = 1;
        if (list != null) {
            i = list.size();
        } else {
            i = 1;
        }
        if (c79077V1t.LJIILJJIL != null) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        int i5 = i + i2;
        Drawable[] drawableArr = new Drawable[i5 + 6];
        drawableArr[0] = LJI(c79077V1t.LJIIL, null);
        drawableArr[1] = LJI(c79077V1t.LIZJ, c79077V1t.LIZLLL);
        InterfaceC78716Uuu interfaceC78716Uuu = c79077V1t.LJIIJ;
        PointF pointF = c79077V1t.LJIIJJI;
        c80627Vkd.setColorFilter(null);
        drawableArr[2] = V93.LJ(c80627Vkd, interfaceC78716Uuu, pointF);
        drawableArr[3] = LJI(c79077V1t.LJIIIIZZ, c79077V1t.LJIIIZ);
        drawableArr[4] = LJI(c79077V1t.LJ, c79077V1t.LJFF);
        drawableArr[5] = LJI(c79077V1t.LJI, c79077V1t.LJII);
        if (i5 > 0) {
            List<Drawable> list2 = c79077V1t.LJIILIIL;
            if (list2 != null) {
                Iterator<Drawable> it = list2.iterator();
                while (it.hasNext()) {
                    drawableArr[i3 + 6] = LJI(it.next(), null);
                    i3++;
                }
                i4 = i3;
            }
            Drawable drawable = c79077V1t.LJIILJJIL;
            if (drawable != null) {
                drawableArr[i4 + 6] = LJI(drawable, null);
            }
        }
        V94 v94 = new V94(drawableArr);
        this.LJ = v94;
        v94.LJ(C79077V1t.LJIJ);
        C81033VrB c81033VrB = new C81033VrB(V93.LIZLLL(v94, this.LIZJ));
        this.LIZLLL = c81033VrB;
        c81033VrB.mutate();
        LJIILIIL();
        C81939WDv.LIZIZ();
    }

    @Override // X.InterfaceC81691W4h
    public final void LIZJ(Drawable drawable) {
        C81033VrB c81033VrB = this.LIZLLL;
        c81033VrB.LJLJJL = drawable;
        c81033VrB.invalidateSelf();
    }

    public final void LJII(int i) {
        if (i >= 0) {
            V94 v94 = this.LJ;
            v94.LJLL = 0;
            v94.LJLLLLLL[i] = true;
            v94.invalidateSelf();
        }
    }

    public final void LJIIIZ(int i) {
        if (i >= 0) {
            V94 v94 = this.LJ;
            v94.LJLL = 0;
            v94.LJLLLLLL[i] = false;
            v94.invalidateSelf();
        }
    }

    public final void LJIIJ(RectF rectF) {
        C80627Vkd c80627Vkd = this.LJFF;
        Matrix matrix = C80627Vkd.LJLJJI;
        c80627Vkd.LJIIL(matrix);
        rectF.set(c80627Vkd.getBounds());
        matrix.mapRect(rectF);
    }

    public final InterfaceC79080V1w LJIIJJI(int i) {
        boolean z;
        V94 v94 = this.LJ;
        v94.getClass();
        boolean z2 = true;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        C32151Nz.LJI(z);
        if (i >= v94.LJLJJI.length) {
            z2 = false;
        }
        C32151Nz.LJI(z2);
        InterfaceC79080V1w[] interfaceC79080V1wArr = v94.LJLJJI;
        if (interfaceC79080V1wArr[i] == null) {
            interfaceC79080V1wArr[i] = new V96(v94, i);
        }
        InterfaceC79080V1w interfaceC79080V1w = interfaceC79080V1wArr[i];
        if (interfaceC79080V1w.LJIIIIZZ() instanceof V90) {
            interfaceC79080V1w = (C80627Vkd) interfaceC79080V1w.LJIIIIZZ();
        }
        if (interfaceC79080V1w.LJIIIIZZ() instanceof C79265V8z) {
            return (C80627Vkd) interfaceC79080V1w.LJIIIIZZ();
        }
        return interfaceC79080V1w;
    }

    public final C79265V8z LJIIL(int i) {
        InterfaceC79080V1w LJIIJJI = LJIIJJI(i);
        if (LJIIJJI instanceof C79265V8z) {
            return (C79265V8z) LJIIJJI;
        }
        Drawable LJ = V93.LJ(LJIIJJI.LJ(V93.LIZ), InterfaceC78716Uuu.LJJJLZIJ, null);
        LJIIJJI.LJ(LJ);
        C32151Nz.LJIIIIZZ(LJ, "Parent has no child drawable!");
        return (C79265V8z) LJ;
    }

    public final void LJIILJJIL(InterfaceC78716Uuu interfaceC78716Uuu) {
        interfaceC78716Uuu.getClass();
        LJIIL(2).LJIIZILJ(interfaceC78716Uuu);
    }

    public final void LJIILLIIL(int i) {
        this.LJ.LJ(i);
    }

    public final void LJIIZILJ(int i) {
        LJIILL(this.LIZIZ.getDrawable(i), 5);
    }

    public final void LJIJ(int i) {
        LJIILL(this.LIZIZ.getDrawable(i), 1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LJIJJLI(float f) {
        Drawable LIZ = this.LJ.LIZ(3);
        if (LIZ == 0) {
            return;
        }
        if (f >= 0.999f) {
            if (LIZ instanceof Animatable) {
                ((Animatable) LIZ).stop();
            }
            LJIIIZ(3);
        } else {
            if (LIZ instanceof Animatable) {
                ((Animatable) LIZ).start();
            }
            LJII(3);
        }
        LIZ.setLevel(Math.round(f * 10000.0f));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LJIL(V8L v8l) {
        this.LIZJ = v8l;
        C81033VrB c81033VrB = this.LIZLLL;
        Drawable drawable = c81033VrB.LJLIL;
        if (v8l != null && v8l.LIZ == V8K.OVERLAY_COLOR) {
            if (drawable instanceof V98) {
                V98 v98 = (V98) drawable;
                V93.LIZIZ(v98, v8l);
                v98.LJLLLL = v8l.LIZLLL;
                v98.invalidateSelf();
            } else {
                c81033VrB.LJIILIIL(V93.LIZLLL(c81033VrB.LJIILIIL(V93.LIZ), v8l));
            }
        } else if (drawable instanceof V98) {
            Drawable drawable2 = V93.LIZ;
            c81033VrB.LJIILIIL(((C80627Vkd) drawable).LJIILIIL(drawable2));
            drawable2.setCallback(null);
        }
        for (int i = 0; i < this.LJ.LJLJI.length; i++) {
            InterfaceC79080V1w LJIIJJI = LJIIJJI(i);
            V8L v8l2 = this.LIZJ;
            Resources resources = this.LIZIZ;
            while (true) {
                Object LJIIIIZZ = LJIIJJI.LJIIIIZZ();
                if (LJIIIIZZ == LJIIJJI || !(LJIIIIZZ instanceof InterfaceC79080V1w)) {
                    break;
                } else {
                    LJIIJJI = (InterfaceC79080V1w) LJIIIIZZ;
                }
            }
            Drawable LJIIIIZZ2 = LJIIJJI.LJIIIIZZ();
            if (v8l2 != null && v8l2.LIZ == V8K.BITMAP_ONLY) {
                if (LJIIIIZZ2 instanceof V95) {
                    V93.LIZIZ((V95) LJIIIIZZ2, v8l2);
                } else if (LJIIIIZZ2 != 0) {
                    LJIIJJI.LJ(V93.LIZ);
                    LJIIJJI.LJ(V93.LIZ(LJIIIIZZ2, v8l2, resources));
                }
            } else if (LJIIIIZZ2 instanceof V95) {
                V95 v95 = (V95) LJIIIIZZ2;
                v95.LIZ(false);
                v95.LJII(0.0f);
                v95.LIZIZ(0.0f, 0);
                v95.LIZJ(0.0f);
                v95.LJIIJJI(false);
            }
        }
    }

    @Override // X.InterfaceC81691W4h
    public final void LIZLLL(float f, boolean z) {
        if (this.LJ.LIZ(3) == null) {
            return;
        }
        this.LJ.LJLZ++;
        LJIJJLI(f);
        if (z) {
            this.LJ.LIZJ();
        }
        r1.LJLZ--;
        this.LJ.invalidateSelf();
    }

    public final Drawable LJI(Drawable drawable, InterfaceC78716Uuu interfaceC78716Uuu) {
        return V93.LJ(V93.LIZJ(drawable, this.LIZJ, this.LIZIZ), interfaceC78716Uuu, null);
    }

    public final void LJIILL(Drawable drawable, int i) {
        if (drawable == null) {
            this.LJ.LIZIZ(null, i);
        } else {
            LJIIJJI(i).LJ(V93.LIZJ(drawable, this.LIZJ, this.LIZIZ));
        }
    }

    public final void LJIJI(int i, InterfaceC78716Uuu interfaceC78716Uuu) {
        LJIJJ(this.LIZIZ.getDrawable(i), interfaceC78716Uuu);
    }

    public final void LJIJJ(Drawable drawable, InterfaceC78716Uuu interfaceC78716Uuu) {
        LJIILL(drawable, 1);
        LJIIL(1).LJIIZILJ(interfaceC78716Uuu);
    }

    @Override // X.InterfaceC81691W4h
    public final void LJ(Drawable drawable, float f, boolean z) {
        Drawable LIZJ = V93.LIZJ(drawable, this.LIZJ, this.LIZIZ);
        LIZJ.mutate();
        this.LJFF.LJIILIIL(LIZJ);
        this.LJ.LJLZ++;
        LJIIIIZZ();
        LJII(2);
        LJIJJLI(f);
        if (z) {
            this.LJ.LIZJ();
        }
        r1.LJLZ--;
        this.LJ.invalidateSelf();
    }
}
