package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.Cwo, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C32970Cwo extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;

    public C32970Cwo() {
        this.LIZJ.LJIIIIZZ(9.0f, 4.1f);
        C32856Cuy.bh(this.LIZJ);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIJ(38.0f);
        p.LJIIIZ(6.0f, 6.0f, false, false, 6.0f, 6.0f);
        this.LIZJ.LJIIJJI(11.2f);
        this.LIZJ.LJIIJ(0.02f, -1.52f, 0.63f, -3.0f, 1.75f, -4.13f);
        this.LIZJ.LJIIIZ(2.7f, 2.7f, false, false, 0.26f, -0.89f);
        this.LIZJ.LJIIIZ(11.0f, 11.0f, false, true, 4.3f, -8.6f);
        this.LIZJ.LJIIL(-9.74f, -9.72f);
        C32856Cuy.zk(this.LIZJ);
        this.LIZJ.LJIIL(-7.54f, 7.5f);
        this.LIZJ.LJIIIZ(0.6f, 0.6f, false, true, -1.02f, -0.42f);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIILL(-3.77f);
        this.LIZJ.LJIIIZ(1.0f, 1.0f, false, true, 0.3f, -0.71f);
        this.LIZJ.LJIIL(7.56f, -7.5f);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIIIZ(2.0f, 2.0f, false, true, 2.81f, 0.0f);
        this.LIZJ.LJIIL(12.8f, 12.73f);
        this.LIZJ.LJIIIZ(10.96f, 10.96f, false, true, 3.65f, -0.37f);
        this.LIZJ.LJII(41.0f, 22.27f);
        DIJ p4 = this.LIZJ;
        o.LJIIIZ(p4, "p");
        p4.LJIJ(10.1f);
        DIJ p5 = this.LIZJ;
        o.LJIIIZ(p5, "p");
        p5.LJIIIZ(6.0f, 6.0f, false, false, -6.0f, -6.0f);
        p5.LJI(9.0f);
        p5.LIZLLL();
        this.LIZJ.LJIILIIL(22.9f, 13.21f);
        this.LIZJ.LJIIIZ(3.9f, 3.9f, true, false, 0.0f, -7.8f);
        this.LIZJ.LJIIIZ(3.9f, 3.9f, false, false, 0.0f, 7.8f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIZILJ(Path.FillType.EVEN_ODD);
        this.LIZIZ.setStyle(Paint.Style.FILL);
        Paint LIZIZ = KMP.LIZIZ(this.LIZIZ, -49299);
        this.LJ = LIZIZ;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        dij.LJIIIIZZ(47.3f, 25.76f);
        dij.LJIIIZ(1.5f, 1.5f, false, false, -2.26f, -1.92f);
        dij.LJIIL(-6.7f, 5.55f);
        dij.LJIIJ(1.8f, 1.0f, 3.3f, 2.49f, 4.3f, 4.3f);
        C279417u.LIZIZ(dij, 4.65f, -7.93f, 39.96f, 38.22f);
        dij.LIZJ(7.0f, 7.0f, false, false, 33.0f, 32.0f);
        C32856Cuy.F9(dij);
        C32856Cuy.K6(dij);
        C32856Cuy.Kf(dij);
        dij.LJIIJ(0.0f, 0.02f, -0.01f, 0.56f, -0.2f, 1.27f);
        dij.LJIIJ(-0.2f, 0.8f, -0.56f, 1.67f, -1.21f, 2.32f);
        dij.LIZJ(2.0f, 2.0f, false, false, 26.0f, 46.0f);
        dij.LJIIJJI(7.0f);
        dij.LJIIIZ(7.0f, 7.0f, false, false, 6.96f, -7.78f);
        dij.LIZLLL();
        dij.LJIIZILJ(Path.FillType.WINDING);
        LIZIZ.setStyle(Paint.Style.FILL);
        LIZIZ.setColor(-16595489);
        this.LIZ.add(LIZIZ);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(48.0f, 48.0f, canvas);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
        canvas.drawPath(this.LJFF.LIZ, this.LJ);
    }
}
