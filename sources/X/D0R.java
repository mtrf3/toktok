package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class D0R extends AbstractC39455Fe7 {
    public D0R() {
        C32856Cuy.Il(this.LIZJ);
        this.LIZJ.LJIILIIL(-16.01f, 0.0f);
        this.LIZJ.LJIIIZ(6.0f, 6.0f, true, true, 12.0f, 0.01f);
        this.LIZJ.LIZJ(6.0f, 6.0f, false, true, 13.0f, 14.0f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIIIZZ(23.38f, 27.46f);
        this.LIZJ.LJIIJ(-1.37f, -0.3f, -2.84f, -0.46f, -4.4f, -0.46f);
        this.LIZJ.LJ(8.7f, 27.0f, 2.34f, 33.99f, 2.0f, 44.0f);
        C32856Cuy.LLLIIII(this.LIZJ);
        this.LIZJ.LJIIJ(0.56f, 0.0f, 1.0f, -0.45f, 1.02f, -1.0f);
        this.LIZJ.LJIIJ(0.3f, -7.84f, 4.9f, -13.0f, 12.99f, -13.0f);
        this.LIZJ.LJIIJ(0.53f, 0.0f, 1.05f, 0.02f, 1.55f, 0.07f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIIZ(8.03f, 8.03f, false, true, 2.84f, -3.6f);
        p.LIZLLL();
        this.LIZJ.LJIIIIZZ(28.0f, 31.0f);
        this.LIZJ.LJIIIZ(4.0f, 4.0f, false, false, -4.01f, 4.0f);
        C32856Cuy.Ch(this.LIZJ);
        this.LIZJ.LIZJ(4.0f, 4.0f, false, false, 46.0f, 42.0f);
        C32856Cuy.Ie(this.LIZJ);
        C32856Cuy.LJJLJ(this.LIZJ);
        this.LIZJ.LJIIIZ(7.0f, 7.0f, false, false, -14.0f, 0.0f);
        C32856Cuy.LJZ(this.LIZJ);
        this.LIZJ.LJIILIIL(14.0f, 4.0f);
        C32856Cuy.F1(this.LIZJ);
        C32856Cuy.E6(this.LIZJ);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIILL(-7.0f);
        p2.LJIIJJI(14.0f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIILIIL(-10.0f, -4.0f);
        C32856Cuy.LJJLJ(this.LIZJ);
        this.LIZJ.LJIIIZ(3.0f, 3.0f, false, true, 6.0f, 0.0f);
        C32856Cuy.B1(this.LIZJ);
        C32856Cuy.W(this.LIZJ);
        this.LIZJ.LJIIZILJ(Path.FillType.WINDING);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(48.0f, 48.0f, canvas);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
    }
}
