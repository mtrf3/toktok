package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class D57 extends AbstractC39455Fe7 {
    public D57() {
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIIIZZ(14.0f, 4.0f);
        p.LJIIIZ(7.0f, 7.0f, false, false, -7.0f, 7.0f);
        this.LIZJ.LJIILL(26.5f);
        C32856Cuy.Cc(this.LIZJ);
        C32856Cuy.Q6(this.LIZJ);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIIIZ(2.0f, 2.0f, false, false, 2.0f, -2.0f);
        p2.LJIJ(6.0f);
        p2.LJIIIZ(2.0f, 2.0f, false, false, -2.0f, -2.0f);
        p2.LJI(14.0f);
        p2.LIZLLL();
        this.LIZJ.LJIILIIL(-0.5f, 27.0f);
        C32856Cuy.da(this.LIZJ);
        C32856Cuy.LJIJJLI(this.LIZJ);
        C32856Cuy.LJLL(this.LIZJ);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJI(13.5f);
        p3.LIZLLL();
        p3.LJIILIIL(0.0f, 4.0f);
        C32856Cuy.O6(this.LIZJ);
        C32856Cuy.Ni(this.LIZJ);
        this.LIZJ.LJIILIIL(12.23f, -22.01f);
        this.LIZJ.LJIIIZ(2.0f, 2.0f, false, false, -3.46f, 0.0f);
        this.LIZJ.LJIIL(-1.5f, 2.57f);
        this.LIZJ.LJIIL(-2.9f, 0.63f);
        this.LIZJ.LJIIIZ(2.0f, 2.0f, false, false, -1.07f, 3.29f);
        this.LIZJ.LJIIL(1.98f, 2.22f);
        this.LIZJ.LJIIL(-0.3f, 2.96f);
        this.LIZJ.LJIIIZ(2.0f, 2.0f, false, false, 2.8f, 2.03f);
        this.LIZJ.LJIIL(2.72f, -1.2f);
        this.LIZJ.LJIIL(2.72f, 1.2f);
        this.LIZJ.LJIIIZ(2.0f, 2.0f, false, false, 2.8f, -2.03f);
        this.LIZJ.LJIIL(-0.3f, -2.96f);
        this.LIZJ.LJIIL(1.98f, -2.22f);
        this.LIZJ.LJIIIZ(2.0f, 2.0f, false, false, -1.06f, -3.3f);
        this.LIZJ.LJIIL(-2.91f, -0.62f);
        this.LIZJ.LJIIL(-1.5f, -2.57f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIILIIL(-2.59f, 4.46f);
        this.LIZJ.LJIIL(0.86f, -1.47f);
        this.LIZJ.LJIIL(0.86f, 1.47f);
        this.LIZJ.LJIIIZ(2.0f, 2.0f, false, false, 1.3f, 0.95f);
        this.LIZJ.LJIIL(1.66f, 0.36f);
        this.LIZJ.LJIIL(-1.13f, 1.27f);
        this.LIZJ.LJIIIZ(2.0f, 2.0f, false, false, -0.5f, 1.53f);
        this.LIZJ.LJIIL(0.17f, 1.7f);
        this.LIZJ.LJIIL(-1.55f, -0.7f);
        this.LIZJ.LJIIIZ(2.0f, 2.0f, false, false, -1.62f, 0.0f);
        this.LIZJ.LJIIL(-1.55f, 0.7f);
        this.LIZJ.LJIIL(0.17f, -1.7f);
        this.LIZJ.LJIIIZ(2.0f, 2.0f, false, false, -0.5f, -1.53f);
        this.LIZJ.LJIIL(-1.13f, -1.27f);
        this.LIZJ.LJIIL(1.66f, -0.36f);
        this.LIZJ.LJIIIZ(2.0f, 2.0f, false, false, 1.3f, -0.95f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIZILJ(Path.FillType.WINDING);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(48.0f, 48.0f, canvas);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
    }
}
