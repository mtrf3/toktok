package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.Cya, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33080Cya extends AbstractC39455Fe7 {
    public final DIJ LJ;
    public final Paint LJFF;
    public final DIJ LJI;

    public C33080Cya() {
        DIJ LIZIZ = C0H1.LIZIZ();
        this.LJ = LIZIZ;
        C32856Cuy.M5(LIZIZ);
        LIZIZ.LJIIZILJ(Path.FillType.WINDING);
        this.LIZJ.LJIIIIZZ(16.63f, 20.28f);
        C32856Cuy.Fc(this.LIZJ);
        this.LIZJ.LIZJ(16.1f, 16.1f, false, true, 35.82f, 4.2f);
        this.LIZJ.LJIIIZ(16.1f, 16.1f, false, true, 16.09f, 16.08f);
        this.LIZJ.LJIIIZ(16.1f, 16.1f, false, true, -16.09f, 16.08f);
        this.LIZJ.LJIIIZ(16.1f, 16.1f, false, true, -16.08f, -16.08f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIIIZZ(45.62f, 46.89f);
        this.LIZJ.LIZJ(31.64f, 31.64f, false, false, 5.2f, 69.09f);
        this.LIZJ.LJIIIZ(1.55f, 1.55f, true, false, 3.0f, 0.76f);
        this.LIZJ.LJIIIZ(28.53f, 28.53f, false, true, 35.03f, -20.43f);
        this.LIZJ.LJIIJ(0.7f, -0.93f, 1.5f, -1.78f, 2.39f, -2.53f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIIIZZ(48.58f, 59.57f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIL(4.95f, 4.95f);
        C32856Cuy.P9(this.LIZJ);
        this.LIZJ.LJII(63.0f, 55.76f);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIIIZ(0.5f, 0.5f, false, false, 0.0f, -0.71f);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIIL(-1.41f, -1.42f);
        C32856Cuy.A5(this.LIZJ);
        this.LIZJ.LJIIL(-7.0f, 7.0f);
        this.LIZJ.LJIIL(-3.19f, -3.18f);
        C32856Cuy.A5(this.LIZJ);
        DIJ p4 = this.LIZJ;
        o.LJIIIZ(p4, "p");
        p4.LJIIL(-1.42f, 1.41f);
        DIJ p5 = this.LIZJ;
        o.LJIIIZ(p5, "p");
        p5.LJIIIZ(0.5f, 0.5f, false, false, 0.0f, 0.71f);
        p5.LIZLLL();
        Paint LIZ = DIX.LIZ(this.LIZJ, Path.FillType.WINDING);
        this.LJFF = LIZ;
        DIJ dij = new DIJ();
        this.LJI = dij;
        dij.LJIIIIZZ(69.0f, 59.06f);
        C32856Cuy.LLIL(dij);
        dij.LJIILIIL(-3.0f, 0.0f);
        dij.LJIIIZ(10.0f, 10.0f, true, false, -20.0f, 0.0f);
        dij.LJIIIZ(10.0f, 10.0f, false, false, 20.0f, 0.0f);
        dij.LIZLLL();
        dij.LJIIZILJ(Path.FillType.WINDING);
        this.LIZ.add(LIZ);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(72.0f, 72.0f, canvas);
        canvas.clipPath(this.LJ.LIZ);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
        canvas.drawPath(this.LJI.LIZ, this.LJFF);
    }
}
